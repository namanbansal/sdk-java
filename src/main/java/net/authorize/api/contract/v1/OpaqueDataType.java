//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.26 at 11:27:57 AM PDT 
//


package net.authorize.api.contract.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for opaqueDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="opaqueDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataDescriptor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "opaqueDataType", propOrder = {
    "dataDescriptor",
    "dataValue",
    "dataKey"
})
public class OpaqueDataType {

    @XmlElement(required = true)
    protected String dataDescriptor;
    @XmlElement(required = true)
    protected String dataValue;
    protected String dataKey;

    /**
     * Gets the value of the dataDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDescriptor() {
        return dataDescriptor;
    }

    /**
     * Sets the value of the dataDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDescriptor(String value) {
        this.dataDescriptor = value;
    }

    /**
     * Gets the value of the dataValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataValue() {
        return dataValue;
    }

    /**
     * Sets the value of the dataValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataValue(String value) {
        this.dataValue = value;
    }

    /**
     * Gets the value of the dataKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataKey() {
        return dataKey;
    }

    /**
     * Sets the value of the dataKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataKey(String value) {
        this.dataKey = value;
    }

}
