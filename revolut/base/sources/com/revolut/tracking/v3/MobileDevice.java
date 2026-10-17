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
import grl.a7;
import grl.w6;
import grl.y6;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class MobileDevice extends w0 implements e2 {
    public static final int ADVERTISING_ID_FIELD_NUMBER = 8;
    public static final int CATEGORY_FIELD_NUMBER = 1;
    private static final MobileDevice DEFAULT_INSTANCE;
    public static final int HARDWARE_ID_FIELD_NUMBER = 13;
    public static final int INSTALLATION_ID_FIELD_NUMBER = 12;
    public static final int IS_LIMITED_AD_TRACKING_FIELD_NUMBER = 10;
    public static final int LOCALE_FIELD_NUMBER = 9;
    public static final int MOBILE_BRAND_NAME_FIELD_NUMBER = 2;
    public static final int MOBILE_MODEL_NAME_FIELD_NUMBER = 3;
    public static final int MOBILE_OS_HARDWARE_MODEL_FIELD_NUMBER = 4;
    public static final int OPERATING_SYSTEM_FIELD_NUMBER = 5;
    public static final int OPERATING_SYSTEM_VERSION_FIELD_NUMBER = 6;
    private static volatile m2 PARSER = null;
    public static final int TIME_ZONE_OFFSET_SECONDS_FIELD_NUMBER = 11;
    public static final int VENDOR_ID_FIELD_NUMBER = 7;
    private int bitField0_;
    private int category_;
    private boolean isLimitedAdTracking_;
    private int operatingSystem_;
    private int timeZoneOffsetSeconds_;
    private String mobileBrandName_ = "";
    private String mobileModelName_ = "";
    private String mobileOsHardwareModel_ = "";
    private String operatingSystemVersion_ = "";
    private String vendorId_ = "";
    private String advertisingId_ = "";
    private String locale_ = "";
    private String installationId_ = "";
    private String hardwareId_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(MobileDevice.DEFAULT_INSTANCE);
        }
    }

    static {
        MobileDevice mobileDevice = new MobileDevice();
        DEFAULT_INSTANCE = mobileDevice;
        w0.registerDefaultInstance(MobileDevice.class, mobileDevice);
    }

    private MobileDevice() {
    }

    private void clearAdvertisingId() {
        this.bitField0_ &= -129;
        this.advertisingId_ = getDefaultInstance().getAdvertisingId();
    }

    private void clearCategory() {
        this.bitField0_ &= -2;
        this.category_ = 0;
    }

    private void clearHardwareId() {
        this.bitField0_ &= -4097;
        this.hardwareId_ = getDefaultInstance().getHardwareId();
    }

    private void clearInstallationId() {
        this.bitField0_ &= -2049;
        this.installationId_ = getDefaultInstance().getInstallationId();
    }

    private void clearIsLimitedAdTracking() {
        this.bitField0_ &= -513;
        this.isLimitedAdTracking_ = false;
    }

    private void clearLocale() {
        this.bitField0_ &= -257;
        this.locale_ = getDefaultInstance().getLocale();
    }

    private void clearMobileBrandName() {
        this.bitField0_ &= -3;
        this.mobileBrandName_ = getDefaultInstance().getMobileBrandName();
    }

    private void clearMobileModelName() {
        this.bitField0_ &= -5;
        this.mobileModelName_ = getDefaultInstance().getMobileModelName();
    }

    private void clearMobileOsHardwareModel() {
        this.bitField0_ &= -9;
        this.mobileOsHardwareModel_ = getDefaultInstance().getMobileOsHardwareModel();
    }

    private void clearOperatingSystem() {
        this.bitField0_ &= -17;
        this.operatingSystem_ = 0;
    }

    private void clearOperatingSystemVersion() {
        this.bitField0_ &= -33;
        this.operatingSystemVersion_ = getDefaultInstance().getOperatingSystemVersion();
    }

    private void clearTimeZoneOffsetSeconds() {
        this.bitField0_ &= -1025;
        this.timeZoneOffsetSeconds_ = 0;
    }

    private void clearVendorId() {
        this.bitField0_ &= -65;
        this.vendorId_ = getDefaultInstance().getVendorId();
    }

    public static MobileDevice getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static MobileDevice parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MobileDevice) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MobileDevice parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MobileDevice) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdvertisingId(String str) {
        str.getClass();
        this.bitField0_ |= 128;
        this.advertisingId_ = str;
    }

    private void setAdvertisingIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.advertisingId_ = pVar.m();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategory(y6 y6Var) {
        this.category_ = y6Var.getNumber();
        this.bitField0_ |= 1;
    }

    private void setCategoryValue(int i) {
        this.bitField0_ |= 1;
        this.category_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHardwareId(String str) {
        str.getClass();
        this.bitField0_ |= 4096;
        this.hardwareId_ = str;
    }

    private void setHardwareIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.hardwareId_ = pVar.m();
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstallationId(String str) {
        str.getClass();
        this.bitField0_ |= 2048;
        this.installationId_ = str;
    }

    private void setInstallationIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.installationId_ = pVar.m();
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsLimitedAdTracking(boolean z) {
        this.bitField0_ |= 512;
        this.isLimitedAdTracking_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocale(String str) {
        str.getClass();
        this.bitField0_ |= 256;
        this.locale_ = str;
    }

    private void setLocaleBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.locale_ = pVar.m();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMobileBrandName(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.mobileBrandName_ = str;
    }

    private void setMobileBrandNameBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.mobileBrandName_ = pVar.m();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMobileModelName(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.mobileModelName_ = str;
    }

    private void setMobileModelNameBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.mobileModelName_ = pVar.m();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMobileOsHardwareModel(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.mobileOsHardwareModel_ = str;
    }

    private void setMobileOsHardwareModelBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.mobileOsHardwareModel_ = pVar.m();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOperatingSystem(a7 a7Var) {
        this.operatingSystem_ = a7Var.getNumber();
        this.bitField0_ |= 16;
    }

    private void setOperatingSystemValue(int i) {
        this.bitField0_ |= 16;
        this.operatingSystem_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOperatingSystemVersion(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.operatingSystemVersion_ = str;
    }

    private void setOperatingSystemVersionBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.operatingSystemVersion_ = pVar.m();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeZoneOffsetSeconds(int i) {
        this.bitField0_ |= 1024;
        this.timeZoneOffsetSeconds_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVendorId(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.vendorId_ = str;
    }

    private void setVendorIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.vendorId_ = pVar.m();
        this.bitField0_ |= 64;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (w6.f146226a[v0Var.ordinal()]) {
            case 1:
                return new MobileDevice();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ဌ\u0004\u0006ለ\u0005\u0007ለ\u0006\bለ\u0007\tለ\b\nဇ\t\u000bင\n\fለ\u000b\rለ\f", new Object[]{"bitField0_", "category_", "mobileBrandName_", "mobileModelName_", "mobileOsHardwareModel_", "operatingSystem_", "operatingSystemVersion_", "vendorId_", "advertisingId_", "locale_", "isLimitedAdTracking_", "timeZoneOffsetSeconds_", "installationId_", "hardwareId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (MobileDevice.class) {
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

    public String getAdvertisingId() {
        return this.advertisingId_;
    }

    public p getAdvertisingIdBytes() {
        return p.d(this.advertisingId_);
    }

    public y6 getCategory() {
        int i = this.category_;
        y6 y6Var = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : y6.Desktop : y6.Tablet : y6.Mobile : y6.UnspecifiedCategory;
        return y6Var == null ? y6.UNRECOGNIZED : y6Var;
    }

    public int getCategoryValue() {
        return this.category_;
    }

    public String getHardwareId() {
        return this.hardwareId_;
    }

    public p getHardwareIdBytes() {
        return p.d(this.hardwareId_);
    }

    public String getInstallationId() {
        return this.installationId_;
    }

    public p getInstallationIdBytes() {
        return p.d(this.installationId_);
    }

    public boolean getIsLimitedAdTracking() {
        return this.isLimitedAdTracking_;
    }

    public String getLocale() {
        return this.locale_;
    }

    public p getLocaleBytes() {
        return p.d(this.locale_);
    }

    public String getMobileBrandName() {
        return this.mobileBrandName_;
    }

    public p getMobileBrandNameBytes() {
        return p.d(this.mobileBrandName_);
    }

    public String getMobileModelName() {
        return this.mobileModelName_;
    }

    public p getMobileModelNameBytes() {
        return p.d(this.mobileModelName_);
    }

    public String getMobileOsHardwareModel() {
        return this.mobileOsHardwareModel_;
    }

    public p getMobileOsHardwareModelBytes() {
        return p.d(this.mobileOsHardwareModel_);
    }

    public a7 getOperatingSystem() {
        int i = this.operatingSystem_;
        a7 a7Var = i != 0 ? i != 1 ? i != 2 ? null : a7.Android : a7.iOS : a7.UnspecifiedOS;
        return a7Var == null ? a7.UNRECOGNIZED : a7Var;
    }

    public int getOperatingSystemValue() {
        return this.operatingSystem_;
    }

    public String getOperatingSystemVersion() {
        return this.operatingSystemVersion_;
    }

    public p getOperatingSystemVersionBytes() {
        return p.d(this.operatingSystemVersion_);
    }

    public int getTimeZoneOffsetSeconds() {
        return this.timeZoneOffsetSeconds_;
    }

    public String getVendorId() {
        return this.vendorId_;
    }

    public p getVendorIdBytes() {
        return p.d(this.vendorId_);
    }

    public boolean hasAdvertisingId() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasCategory() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasHardwareId() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasInstallationId() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasIsLimitedAdTracking() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasLocale() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasMobileBrandName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMobileModelName() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasMobileOsHardwareModel() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasOperatingSystem() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasOperatingSystemVersion() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasTimeZoneOffsetSeconds() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasVendorId() {
        return (this.bitField0_ & 64) != 0;
    }

    public static a newBuilder(MobileDevice mobileDevice) {
        return (a) DEFAULT_INSTANCE.createBuilder(mobileDevice);
    }

    public static MobileDevice parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (MobileDevice) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static MobileDevice parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (MobileDevice) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static MobileDevice parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (MobileDevice) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static MobileDevice parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (MobileDevice) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static MobileDevice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MobileDevice) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MobileDevice parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (MobileDevice) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static MobileDevice parseFrom(InputStream inputStream) throws IOException {
        return (MobileDevice) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MobileDevice parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (MobileDevice) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static MobileDevice parseFrom(t tVar) throws IOException {
        return (MobileDevice) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static MobileDevice parseFrom(t tVar, d0 d0Var) throws IOException {
        return (MobileDevice) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
