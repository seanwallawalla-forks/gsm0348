//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.01 at 10:04:03 PM CEST 
//


package org.opentelecoms.gsm0348.api.model;

import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="KeysetID" type="{org.opentelecoms.gsm0348}KeysetID"/&gt;
 *         &lt;element name="CertificationAlgorithmMode" type="{org.opentelecoms.gsm0348}CertificationAlgorithmMode"/&gt;
 *         &lt;element name="AlgorithmImplementation" type="{org.opentelecoms.gsm0348}AlgorithmImplementation"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KID", propOrder = {

})
public class KID {

    @XmlElement(name = "KeysetID")
    protected byte keysetID;
    @XmlElement(name = "CertificationAlgorithmMode", required = true)
    @XmlSchemaType(name = "string")
    protected CertificationAlgorithmMode certificationAlgorithmMode;
    @XmlElement(name = "AlgorithmImplementation", required = true)
    @XmlSchemaType(name = "string")
    protected AlgorithmImplementation algorithmImplementation;

    /**
     * Gets the value of the keysetID property.
     * 
     */
    public byte getKeysetID() {
        return keysetID;
    }

    /**
     * Sets the value of the keysetID property.
     * 
     */
    public void setKeysetID(byte value) {
        this.keysetID = value;
    }

    /**
     * Gets the value of the certificationAlgorithmMode property.
     * 
     * @return
     *     possible object is
     *     {@link CertificationAlgorithmMode }
     *     
     */
    public CertificationAlgorithmMode getCertificationAlgorithmMode() {
        return certificationAlgorithmMode;
    }

    /**
     * Sets the value of the certificationAlgorithmMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificationAlgorithmMode }
     *     
     */
    public void setCertificationAlgorithmMode(CertificationAlgorithmMode value) {
        this.certificationAlgorithmMode = value;
    }

    /**
     * Gets the value of the algorithmImplementation property.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmImplementation }
     *     
     */
    public AlgorithmImplementation getAlgorithmImplementation() {
        return algorithmImplementation;
    }

    /**
     * Sets the value of the algorithmImplementation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmImplementation }
     *     
     */
    public void setAlgorithmImplementation(AlgorithmImplementation value) {
        this.algorithmImplementation = value;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KID)) {
            return false;
        }
        final KID kid = (KID) o;
        return keysetID == kid.keysetID &&
            certificationAlgorithmMode == kid.certificationAlgorithmMode &&
            algorithmImplementation == kid.algorithmImplementation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(keysetID, certificationAlgorithmMode, algorithmImplementation);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("KID [keysetID=");
        builder.append(keysetID);
        builder.append(", certificationAlgorithmMode=");
        builder.append(certificationAlgorithmMode);
        builder.append(", algorithmImplementation=");
        builder.append(algorithmImplementation);
        builder.append("]");
        return builder.toString();
    }
}
