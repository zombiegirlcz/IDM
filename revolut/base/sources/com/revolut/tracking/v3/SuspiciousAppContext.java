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
import com.revolut.tracking.v3.AccessibilityServiceCapabilities;
import com.revolut.tracking.v3.RequestedPermissions;
import grl.ed;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class SuspiciousAppContext extends w0 implements e2 {
    public static final int CAPABILITIES_FIELD_NUMBER = 4;
    private static final SuspiciousAppContext DEFAULT_INSTANCE;
    public static final int FINGERPRINT_FIELD_NUMBER = 2;
    public static final int FINGERPRINT_SHA_256_FIELD_NUMBER = 5;
    public static final int INSTALLATION_SOURCE_FIELD_NUMBER = 6;
    public static final int INSTALLATION_TIME_FIELD_NUMBER = 3;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile m2 PARSER = null;
    public static final int REQUESTED_PERMISSIONS_FIELD_NUMBER = 7;
    private int bitField0_;
    private AccessibilityServiceCapabilities capabilities_;
    private long installationTime_;
    private RequestedPermissions requestedPermissions_;
    private String packageName_ = "";
    private String fingerprint_ = "";
    private String fingerprintSha256_ = "";
    private String installationSource_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(SuspiciousAppContext.DEFAULT_INSTANCE);
        }
    }

    static {
        SuspiciousAppContext suspiciousAppContext = new SuspiciousAppContext();
        DEFAULT_INSTANCE = suspiciousAppContext;
        w0.registerDefaultInstance(SuspiciousAppContext.class, suspiciousAppContext);
    }

    private SuspiciousAppContext() {
    }

    private void clearCapabilities() {
        this.capabilities_ = null;
        this.bitField0_ &= -9;
    }

    private void clearFingerprint() {
        this.bitField0_ &= -3;
        this.fingerprint_ = getDefaultInstance().getFingerprint();
    }

    private void clearFingerprintSha256() {
        this.bitField0_ &= -17;
        this.fingerprintSha256_ = getDefaultInstance().getFingerprintSha256();
    }

    private void clearInstallationSource() {
        this.bitField0_ &= -33;
        this.installationSource_ = getDefaultInstance().getInstallationSource();
    }

    private void clearInstallationTime() {
        this.bitField0_ &= -5;
        this.installationTime_ = 0L;
    }

    private void clearPackageName() {
        this.bitField0_ &= -2;
        this.packageName_ = getDefaultInstance().getPackageName();
    }

    private void clearRequestedPermissions() {
        this.requestedPermissions_ = null;
        this.bitField0_ &= -65;
    }

    public static SuspiciousAppContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeCapabilities(AccessibilityServiceCapabilities accessibilityServiceCapabilities) {
        accessibilityServiceCapabilities.getClass();
        AccessibilityServiceCapabilities accessibilityServiceCapabilities2 = this.capabilities_;
        if (accessibilityServiceCapabilities2 == null || accessibilityServiceCapabilities2 == AccessibilityServiceCapabilities.getDefaultInstance()) {
            this.capabilities_ = accessibilityServiceCapabilities;
        } else {
            AccessibilityServiceCapabilities.a aVarNewBuilder = AccessibilityServiceCapabilities.newBuilder(this.capabilities_);
            aVarNewBuilder.f(accessibilityServiceCapabilities);
            this.capabilities_ = (AccessibilityServiceCapabilities) aVarNewBuilder.b();
        }
        this.bitField0_ |= 8;
    }

    private void mergeRequestedPermissions(RequestedPermissions requestedPermissions) {
        requestedPermissions.getClass();
        RequestedPermissions requestedPermissions2 = this.requestedPermissions_;
        if (requestedPermissions2 == null || requestedPermissions2 == RequestedPermissions.getDefaultInstance()) {
            this.requestedPermissions_ = requestedPermissions;
        } else {
            RequestedPermissions.a aVarNewBuilder = RequestedPermissions.newBuilder(this.requestedPermissions_);
            aVarNewBuilder.f(requestedPermissions);
            this.requestedPermissions_ = (RequestedPermissions) aVarNewBuilder.b();
        }
        this.bitField0_ |= 64;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static SuspiciousAppContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SuspiciousAppContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SuspiciousAppContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SuspiciousAppContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCapabilities(AccessibilityServiceCapabilities accessibilityServiceCapabilities) {
        accessibilityServiceCapabilities.getClass();
        this.capabilities_ = accessibilityServiceCapabilities;
        this.bitField0_ |= 8;
    }

    private void setFingerprint(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.fingerprint_ = str;
    }

    private void setFingerprintBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.fingerprint_ = pVar.m();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFingerprintSha256(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.fingerprintSha256_ = str;
    }

    private void setFingerprintSha256Bytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.fingerprintSha256_ = pVar.m();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstallationSource(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.installationSource_ = str;
    }

    private void setInstallationSourceBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.installationSource_ = pVar.m();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstallationTime(long j2) {
        this.bitField0_ |= 4;
        this.installationTime_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPackageName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.packageName_ = str;
    }

    private void setPackageNameBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.packageName_ = pVar.m();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestedPermissions(RequestedPermissions requestedPermissions) {
        requestedPermissions.getClass();
        this.requestedPermissions_ = requestedPermissions;
        this.bitField0_ |= 64;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (ed.f146088a[v0Var.ordinal()]) {
            case 1:
                return new SuspiciousAppContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဂ\u0002\u0004ဉ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ဉ\u0006", new Object[]{"bitField0_", "packageName_", "fingerprint_", "installationTime_", "capabilities_", "fingerprintSha256_", "installationSource_", "requestedPermissions_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (SuspiciousAppContext.class) {
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

    public AccessibilityServiceCapabilities getCapabilities() {
        AccessibilityServiceCapabilities accessibilityServiceCapabilities = this.capabilities_;
        return accessibilityServiceCapabilities == null ? AccessibilityServiceCapabilities.getDefaultInstance() : accessibilityServiceCapabilities;
    }

    public String getFingerprint() {
        return this.fingerprint_;
    }

    public p getFingerprintBytes() {
        return p.d(this.fingerprint_);
    }

    public String getFingerprintSha256() {
        return this.fingerprintSha256_;
    }

    public p getFingerprintSha256Bytes() {
        return p.d(this.fingerprintSha256_);
    }

    public String getInstallationSource() {
        return this.installationSource_;
    }

    public p getInstallationSourceBytes() {
        return p.d(this.installationSource_);
    }

    public long getInstallationTime() {
        return this.installationTime_;
    }

    public String getPackageName() {
        return this.packageName_;
    }

    public p getPackageNameBytes() {
        return p.d(this.packageName_);
    }

    public RequestedPermissions getRequestedPermissions() {
        RequestedPermissions requestedPermissions = this.requestedPermissions_;
        return requestedPermissions == null ? RequestedPermissions.getDefaultInstance() : requestedPermissions;
    }

    public boolean hasCapabilities() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasFingerprint() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasFingerprintSha256() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasInstallationSource() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasInstallationTime() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPackageName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRequestedPermissions() {
        return (this.bitField0_ & 64) != 0;
    }

    public static a newBuilder(SuspiciousAppContext suspiciousAppContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(suspiciousAppContext);
    }

    public static SuspiciousAppContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SuspiciousAppContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SuspiciousAppContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (SuspiciousAppContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static SuspiciousAppContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (SuspiciousAppContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static SuspiciousAppContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (SuspiciousAppContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static SuspiciousAppContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SuspiciousAppContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SuspiciousAppContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (SuspiciousAppContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static SuspiciousAppContext parseFrom(InputStream inputStream) throws IOException {
        return (SuspiciousAppContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SuspiciousAppContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SuspiciousAppContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SuspiciousAppContext parseFrom(t tVar) throws IOException {
        return (SuspiciousAppContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static SuspiciousAppContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (SuspiciousAppContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
