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
import grl.ie;
import grl.ke;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class WebDevice extends w0 implements e2 {
    public static final int BROWSER_NAME_FIELD_NUMBER = 4;
    public static final int BROWSER_VERSION_FIELD_NUMBER = 5;
    public static final int CATEGORY_FIELD_NUMBER = 7;
    private static final WebDevice DEFAULT_INSTANCE;
    public static final int HARDWARE_ID_FIELD_NUMBER = 12;
    public static final int INSTALLATION_ID_FIELD_NUMBER = 6;
    public static final int OS_NAME_FIELD_NUMBER = 2;
    public static final int OS_VERSION_FIELD_NUMBER = 3;
    private static volatile m2 PARSER = null;
    public static final int SCREEN_HEIGHT_FIELD_NUMBER = 9;
    public static final int SCREEN_WIDTH_FIELD_NUMBER = 8;
    public static final int USER_AGENT_FIELD_NUMBER = 1;
    public static final int WINDOW_HEIGHT_FIELD_NUMBER = 11;
    public static final int WINDOW_WIDTH_FIELD_NUMBER = 10;
    private int bitField0_;
    private int category_;
    private int screenHeight_;
    private int screenWidth_;
    private int windowHeight_;
    private int windowWidth_;
    private String userAgent_ = "";
    private String osName_ = "";
    private String osVersion_ = "";
    private String browserName_ = "";
    private String browserVersion_ = "";
    private String installationId_ = "";
    private String hardwareId_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(WebDevice.DEFAULT_INSTANCE);
        }
    }

    static {
        WebDevice webDevice = new WebDevice();
        DEFAULT_INSTANCE = webDevice;
        w0.registerDefaultInstance(WebDevice.class, webDevice);
    }

    private WebDevice() {
    }

    private void clearBrowserName() {
        this.bitField0_ &= -9;
        this.browserName_ = getDefaultInstance().getBrowserName();
    }

    private void clearBrowserVersion() {
        this.bitField0_ &= -17;
        this.browserVersion_ = getDefaultInstance().getBrowserVersion();
    }

    private void clearCategory() {
        this.bitField0_ &= -65;
        this.category_ = 0;
    }

    private void clearHardwareId() {
        this.bitField0_ &= -2049;
        this.hardwareId_ = getDefaultInstance().getHardwareId();
    }

    private void clearInstallationId() {
        this.bitField0_ &= -33;
        this.installationId_ = getDefaultInstance().getInstallationId();
    }

    private void clearOsName() {
        this.bitField0_ &= -3;
        this.osName_ = getDefaultInstance().getOsName();
    }

    private void clearOsVersion() {
        this.bitField0_ &= -5;
        this.osVersion_ = getDefaultInstance().getOsVersion();
    }

    private void clearScreenHeight() {
        this.bitField0_ &= -257;
        this.screenHeight_ = 0;
    }

    private void clearScreenWidth() {
        this.bitField0_ &= -129;
        this.screenWidth_ = 0;
    }

    private void clearUserAgent() {
        this.bitField0_ &= -2;
        this.userAgent_ = getDefaultInstance().getUserAgent();
    }

    private void clearWindowHeight() {
        this.bitField0_ &= -1025;
        this.windowHeight_ = 0;
    }

    private void clearWindowWidth() {
        this.bitField0_ &= -513;
        this.windowWidth_ = 0;
    }

    public static WebDevice getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static WebDevice parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WebDevice) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WebDevice parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WebDevice) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setBrowserName(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.browserName_ = str;
    }

    private void setBrowserNameBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.browserName_ = pVar.m();
        this.bitField0_ |= 8;
    }

    private void setBrowserVersion(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.browserVersion_ = str;
    }

    private void setBrowserVersionBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.browserVersion_ = pVar.m();
        this.bitField0_ |= 16;
    }

    private void setCategory(ke keVar) {
        this.category_ = keVar.getNumber();
        this.bitField0_ |= 64;
    }

    private void setCategoryValue(int i) {
        this.bitField0_ |= 64;
        this.category_ = i;
    }

    private void setHardwareId(String str) {
        str.getClass();
        this.bitField0_ |= 2048;
        this.hardwareId_ = str;
    }

    private void setHardwareIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.hardwareId_ = pVar.m();
        this.bitField0_ |= 2048;
    }

    private void setInstallationId(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.installationId_ = str;
    }

    private void setInstallationIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.installationId_ = pVar.m();
        this.bitField0_ |= 32;
    }

    private void setOsName(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.osName_ = str;
    }

    private void setOsNameBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.osName_ = pVar.m();
        this.bitField0_ |= 2;
    }

    private void setOsVersion(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.osVersion_ = str;
    }

    private void setOsVersionBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.osVersion_ = pVar.m();
        this.bitField0_ |= 4;
    }

    private void setScreenHeight(int i) {
        this.bitField0_ |= 256;
        this.screenHeight_ = i;
    }

    private void setScreenWidth(int i) {
        this.bitField0_ |= 128;
        this.screenWidth_ = i;
    }

    private void setUserAgent(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.userAgent_ = str;
    }

    private void setUserAgentBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.userAgent_ = pVar.m();
        this.bitField0_ |= 1;
    }

    private void setWindowHeight(int i) {
        this.bitField0_ |= 1024;
        this.windowHeight_ = i;
    }

    private void setWindowWidth(int i) {
        this.bitField0_ |= 512;
        this.windowWidth_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (ie.f146115a[v0Var.ordinal()]) {
            case 1:
                return new WebDevice();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ဌ\u0006\bင\u0007\tင\b\nင\t\u000bင\n\fለ\u000b", new Object[]{"bitField0_", "userAgent_", "osName_", "osVersion_", "browserName_", "browserVersion_", "installationId_", "category_", "screenWidth_", "screenHeight_", "windowWidth_", "windowHeight_", "hardwareId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (WebDevice.class) {
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

    public String getBrowserName() {
        return this.browserName_;
    }

    public p getBrowserNameBytes() {
        return p.d(this.browserName_);
    }

    public String getBrowserVersion() {
        return this.browserVersion_;
    }

    public p getBrowserVersionBytes() {
        return p.d(this.browserVersion_);
    }

    public ke getCategory() {
        ke keVarA = ke.a(this.category_);
        return keVarA == null ? ke.UNRECOGNIZED : keVarA;
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

    public String getOsName() {
        return this.osName_;
    }

    public p getOsNameBytes() {
        return p.d(this.osName_);
    }

    public String getOsVersion() {
        return this.osVersion_;
    }

    public p getOsVersionBytes() {
        return p.d(this.osVersion_);
    }

    public int getScreenHeight() {
        return this.screenHeight_;
    }

    public int getScreenWidth() {
        return this.screenWidth_;
    }

    public String getUserAgent() {
        return this.userAgent_;
    }

    public p getUserAgentBytes() {
        return p.d(this.userAgent_);
    }

    public int getWindowHeight() {
        return this.windowHeight_;
    }

    public int getWindowWidth() {
        return this.windowWidth_;
    }

    public boolean hasBrowserName() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasBrowserVersion() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasCategory() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasHardwareId() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasInstallationId() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasOsName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasOsVersion() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasScreenHeight() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasScreenWidth() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasUserAgent() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasWindowHeight() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasWindowWidth() {
        return (this.bitField0_ & 512) != 0;
    }

    public static a newBuilder(WebDevice webDevice) {
        return (a) DEFAULT_INSTANCE.createBuilder(webDevice);
    }

    public static WebDevice parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (WebDevice) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static WebDevice parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (WebDevice) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static WebDevice parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (WebDevice) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static WebDevice parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (WebDevice) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static WebDevice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WebDevice) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WebDevice parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (WebDevice) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static WebDevice parseFrom(InputStream inputStream) throws IOException {
        return (WebDevice) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WebDevice parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (WebDevice) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static WebDevice parseFrom(t tVar) throws IOException {
        return (WebDevice) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static WebDevice parseFrom(t tVar, d0 d0Var) throws IOException {
        return (WebDevice) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
