package com.revolut.tracking.v3;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d0;
import com.google.protobuf.e2;
import com.google.protobuf.m2;
import com.google.protobuf.p;
import com.google.protobuf.p0;
import com.google.protobuf.q0;
import com.google.protobuf.t;
import com.google.protobuf.v0;
import com.google.protobuf.w0;
import grl.oe;
import grl.qe;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class WidgetDescription extends w0 implements e2 {
    private static final WidgetDescription DEFAULT_INSTANCE;
    public static final int ITEM_POSITION_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile m2 PARSER = null;
    public static final int SECTION_POSITION_FIELD_NUMBER = 4;
    public static final int SIZE_FIELD_NUMBER = 2;
    private int bitField0_;
    private int itemPosition_;
    private String name_ = "";
    private int sectionPosition_;
    private int size_;

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(WidgetDescription.DEFAULT_INSTANCE);
        }
    }

    static {
        WidgetDescription widgetDescription = new WidgetDescription();
        DEFAULT_INSTANCE = widgetDescription;
        w0.registerDefaultInstance(WidgetDescription.class, widgetDescription);
    }

    private WidgetDescription() {
    }

    private void clearItemPosition() {
        this.bitField0_ &= -5;
        this.itemPosition_ = 0;
    }

    private void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    private void clearSectionPosition() {
        this.bitField0_ &= -9;
        this.sectionPosition_ = 0;
    }

    private void clearSize() {
        this.bitField0_ &= -3;
        this.size_ = 0;
    }

    public static WidgetDescription getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static WidgetDescription parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WidgetDescription) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WidgetDescription parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WidgetDescription) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setItemPosition(int i) {
        this.bitField0_ |= 4;
        this.itemPosition_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    private void setNameBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.name_ = pVar.m();
        this.bitField0_ |= 1;
    }

    private void setSectionPosition(int i) {
        this.bitField0_ |= 8;
        this.sectionPosition_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSize(qe qeVar) {
        this.size_ = qeVar.getNumber();
        this.bitField0_ |= 2;
    }

    private void setSizeValue(int i) {
        this.bitField0_ |= 2;
        this.size_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (oe.f146165a[v0Var.ordinal()]) {
            case 1:
                return new WidgetDescription();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"bitField0_", "name_", "size_", "itemPosition_", "sectionPosition_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (WidgetDescription.class) {
                    try {
                        q0Var = PARSER;
                        if (q0Var == null) {
                            q0Var = new q0(DEFAULT_INSTANCE);
                            PARSER = q0Var;
                        }
                    } catch (Throwable th10) {
                        throw th10;
                    }
                    break;
                }
                return q0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public int getItemPosition() {
        return this.itemPosition_;
    }

    public String getName() {
        return this.name_;
    }

    public p getNameBytes() {
        return p.d(this.name_);
    }

    public int getSectionPosition() {
        return this.sectionPosition_;
    }

    public qe getSize() {
        qe qeVarA = qe.a(this.size_);
        return qeVarA == null ? qe.UNRECOGNIZED : qeVarA;
    }

    public int getSizeValue() {
        return this.size_;
    }

    public boolean hasItemPosition() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSectionPosition() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSize() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(WidgetDescription widgetDescription) {
        return (a) DEFAULT_INSTANCE.createBuilder(widgetDescription);
    }

    public static WidgetDescription parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (WidgetDescription) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static WidgetDescription parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (WidgetDescription) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static WidgetDescription parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (WidgetDescription) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static WidgetDescription parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (WidgetDescription) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static WidgetDescription parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WidgetDescription) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WidgetDescription parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (WidgetDescription) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static WidgetDescription parseFrom(InputStream inputStream) throws IOException {
        return (WidgetDescription) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WidgetDescription parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (WidgetDescription) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static WidgetDescription parseFrom(t tVar) throws IOException {
        return (WidgetDescription) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static WidgetDescription parseFrom(t tVar, d0 d0Var) throws IOException {
        return (WidgetDescription) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
