/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.navercorp.pinpoint.thrift.dto;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-05-14")
public class TTotalThreadCount implements org.apache.thrift.TBase<TTotalThreadCount, TTotalThreadCount._Fields>, java.io.Serializable, Cloneable, Comparable<TTotalThreadCount> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTotalThreadCount");

  private static final org.apache.thrift.protocol.TField TOTAL_THREAD_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("totalThreadCount", org.apache.thrift.protocol.TType.I64, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TTotalThreadCountStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TTotalThreadCountTupleSchemeFactory();

  private long totalThreadCount; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TOTAL_THREAD_COUNT((short)1, "totalThreadCount");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TOTAL_THREAD_COUNT
          return TOTAL_THREAD_COUNT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TOTALTHREADCOUNT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOTAL_THREAD_COUNT, new org.apache.thrift.meta_data.FieldMetaData("totalThreadCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTotalThreadCount.class, metaDataMap);
  }

  public TTotalThreadCount() {
  }

  public TTotalThreadCount(
    long totalThreadCount)
  {
    this();
    this.totalThreadCount = totalThreadCount;
    setTotalThreadCountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTotalThreadCount(TTotalThreadCount other) {
    __isset_bitfield = other.__isset_bitfield;
    this.totalThreadCount = other.totalThreadCount;
  }

  public TTotalThreadCount deepCopy() {
    return new TTotalThreadCount(this);
  }

  @Override
  public void clear() {
    setTotalThreadCountIsSet(false);
    this.totalThreadCount = 0;
  }

  public long getTotalThreadCount() {
    return this.totalThreadCount;
  }

  public void setTotalThreadCount(long totalThreadCount) {
    this.totalThreadCount = totalThreadCount;
    setTotalThreadCountIsSet(true);
  }

  public void unsetTotalThreadCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TOTALTHREADCOUNT_ISSET_ID);
  }

  /** Returns true if field totalThreadCount is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalThreadCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TOTALTHREADCOUNT_ISSET_ID);
  }

  public void setTotalThreadCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TOTALTHREADCOUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TOTAL_THREAD_COUNT:
      if (value == null) {
        unsetTotalThreadCount();
      } else {
        setTotalThreadCount((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TOTAL_THREAD_COUNT:
      return getTotalThreadCount();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TOTAL_THREAD_COUNT:
      return isSetTotalThreadCount();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TTotalThreadCount)
      return this.equals((TTotalThreadCount)that);
    return false;
  }

  public boolean equals(TTotalThreadCount that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_totalThreadCount = true;
    boolean that_present_totalThreadCount = true;
    if (this_present_totalThreadCount || that_present_totalThreadCount) {
      if (!(this_present_totalThreadCount && that_present_totalThreadCount))
        return false;
      if (this.totalThreadCount != that.totalThreadCount)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(totalThreadCount);

    return hashCode;
  }

  @Override
  public int compareTo(TTotalThreadCount other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetTotalThreadCount()).compareTo(other.isSetTotalThreadCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalThreadCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.totalThreadCount, other.totalThreadCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TTotalThreadCount(");
    boolean first = true;

    sb.append("totalThreadCount:");
    sb.append(this.totalThreadCount);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TTotalThreadCountStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TTotalThreadCountStandardScheme getScheme() {
      return new TTotalThreadCountStandardScheme();
    }
  }

  private static class TTotalThreadCountStandardScheme extends org.apache.thrift.scheme.StandardScheme<TTotalThreadCount> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TTotalThreadCount struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOTAL_THREAD_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.totalThreadCount = iprot.readI64();
              struct.setTotalThreadCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TTotalThreadCount struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TOTAL_THREAD_COUNT_FIELD_DESC);
      oprot.writeI64(struct.totalThreadCount);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TTotalThreadCountTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TTotalThreadCountTupleScheme getScheme() {
      return new TTotalThreadCountTupleScheme();
    }
  }

  private static class TTotalThreadCountTupleScheme extends org.apache.thrift.scheme.TupleScheme<TTotalThreadCount> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTotalThreadCount struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTotalThreadCount()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetTotalThreadCount()) {
        oprot.writeI64(struct.totalThreadCount);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTotalThreadCount struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.totalThreadCount = iprot.readI64();
        struct.setTotalThreadCountIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
