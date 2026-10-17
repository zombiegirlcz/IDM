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
import grl.n2;
import grl.r2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class CreditApplicationCommonContext extends w0 implements e2 {
    public static final int APPLICATION_ID_FIELD_NUMBER = 1;
    public static final int CANCELLABLE_FIELD_NUMBER = 7;
    public static final int COUNTRY_FIELD_NUMBER = 4;
    private static final CreditApplicationCommonContext DEFAULT_INSTANCE;
    public static final int ENTRY_POINT_TYPE_FIELD_NUMBER = 3;
    public static final int FROM_FIELD_NUMBER = 8;
    private static volatile m2 PARSER = null;
    public static final int PLUGIN_NAME_FIELD_NUMBER = 5;
    public static final int PLUGIN_STATE_FIELD_NUMBER = 6;
    public static final int PRODUCT_TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean cancellable_;
    private int entryPointType_;
    private int productType_;
    private String applicationId_ = "";
    private String country_ = "";
    private String pluginName_ = "";
    private String pluginState_ = "";
    private String from_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(CreditApplicationCommonContext.DEFAULT_INSTANCE);
        }
    }

    static {
        CreditApplicationCommonContext creditApplicationCommonContext = new CreditApplicationCommonContext();
        DEFAULT_INSTANCE = creditApplicationCommonContext;
        w0.registerDefaultInstance(CreditApplicationCommonContext.class, creditApplicationCommonContext);
    }

    private CreditApplicationCommonContext() {
    }

    private void clearApplicationId() {
        this.bitField0_ &= -2;
        this.applicationId_ = getDefaultInstance().getApplicationId();
    }

    private void clearCancellable() {
        this.bitField0_ &= -65;
        this.cancellable_ = false;
    }

    private void clearCountry() {
        this.bitField0_ &= -9;
        this.country_ = getDefaultInstance().getCountry();
    }

    private void clearEntryPointType() {
        this.bitField0_ &= -5;
        this.entryPointType_ = 0;
    }

    private void clearFrom() {
        this.bitField0_ &= -129;
        this.from_ = getDefaultInstance().getFrom();
    }

    private void clearPluginName() {
        this.bitField0_ &= -17;
        this.pluginName_ = getDefaultInstance().getPluginName();
    }

    private void clearPluginState() {
        this.bitField0_ &= -33;
        this.pluginState_ = getDefaultInstance().getPluginState();
    }

    private void clearProductType() {
        this.bitField0_ &= -3;
        this.productType_ = 0;
    }

    public static CreditApplicationCommonContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static CreditApplicationCommonContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CreditApplicationCommonContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CreditApplicationCommonContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CreditApplicationCommonContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.applicationId_ = str;
    }

    private void setApplicationIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.applicationId_ = pVar.m();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCancellable(boolean z) {
        this.bitField0_ |= 64;
        this.cancellable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountry(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.country_ = str;
    }

    private void setCountryBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.country_ = pVar.m();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntryPointType(r2 r2Var) {
        this.entryPointType_ = r2Var.getNumber();
        this.bitField0_ |= 4;
    }

    private void setEntryPointTypeValue(int i) {
        this.bitField0_ |= 4;
        this.entryPointType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFrom(String str) {
        str.getClass();
        this.bitField0_ |= 128;
        this.from_ = str;
    }

    private void setFromBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.from_ = pVar.m();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPluginName(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.pluginName_ = str;
    }

    private void setPluginNameBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.pluginName_ = pVar.m();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPluginState(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.pluginState_ = str;
    }

    private void setPluginStateBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.pluginState_ = pVar.m();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductType(grl.m2 m2Var) {
        this.productType_ = m2Var.getNumber();
        this.bitField0_ |= 2;
    }

    private void setProductTypeValue(int i) {
        this.bitField0_ |= 2;
        this.productType_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (n2.f146148a[v0Var.ordinal()]) {
            case 1:
                return new CreditApplicationCommonContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ለ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ဇ\u0006\bለ\u0007", new Object[]{"bitField0_", "applicationId_", "productType_", "entryPointType_", "country_", "pluginName_", "pluginState_", "cancellable_", "from_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (CreditApplicationCommonContext.class) {
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

    public String getApplicationId() {
        return this.applicationId_;
    }

    public p getApplicationIdBytes() {
        return p.d(this.applicationId_);
    }

    public boolean getCancellable() {
        return this.cancellable_;
    }

    public String getCountry() {
        return this.country_;
    }

    public p getCountryBytes() {
        return p.d(this.country_);
    }

    public r2 getEntryPointType() {
        r2 r2VarA = r2.a(this.entryPointType_);
        return r2VarA == null ? r2.UNRECOGNIZED : r2VarA;
    }

    public int getEntryPointTypeValue() {
        return this.entryPointType_;
    }

    public String getFrom() {
        return this.from_;
    }

    public p getFromBytes() {
        return p.d(this.from_);
    }

    public String getPluginName() {
        return this.pluginName_;
    }

    public p getPluginNameBytes() {
        return p.d(this.pluginName_);
    }

    public String getPluginState() {
        return this.pluginState_;
    }

    public p getPluginStateBytes() {
        return p.d(this.pluginState_);
    }

    public grl.m2 getProductType() {
        grl.m2 m2VarA = grl.m2.a(this.productType_);
        return m2VarA == null ? grl.m2.UNRECOGNIZED : m2VarA;
    }

    public int getProductTypeValue() {
        return this.productType_;
    }

    public boolean hasApplicationId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasCancellable() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasCountry() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasEntryPointType() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasFrom() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasPluginName() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasPluginState() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasProductType() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(CreditApplicationCommonContext creditApplicationCommonContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(creditApplicationCommonContext);
    }

    public static CreditApplicationCommonContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (CreditApplicationCommonContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static CreditApplicationCommonContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (CreditApplicationCommonContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static CreditApplicationCommonContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (CreditApplicationCommonContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static CreditApplicationCommonContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (CreditApplicationCommonContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static CreditApplicationCommonContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CreditApplicationCommonContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CreditApplicationCommonContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (CreditApplicationCommonContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static CreditApplicationCommonContext parseFrom(InputStream inputStream) throws IOException {
        return (CreditApplicationCommonContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CreditApplicationCommonContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (CreditApplicationCommonContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static CreditApplicationCommonContext parseFrom(t tVar) throws IOException {
        return (CreditApplicationCommonContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static CreditApplicationCommonContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (CreditApplicationCommonContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
