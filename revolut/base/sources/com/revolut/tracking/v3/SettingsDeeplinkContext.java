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
import grl.xa;
import grl.za;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class SettingsDeeplinkContext extends w0 implements e2 {
    public static final int ACTION_FIELD_NUMBER = 7;
    private static final SettingsDeeplinkContext DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    public static final int ISUNIFIED_FIELD_NUMBER = 9;
    private static volatile m2 PARSER = null;
    public static final int PATH_FIELD_NUMBER = 2;
    public static final int SCHEME_FIELD_NUMBER = 8;
    public static final int UTMCAMPAIGN_FIELD_NUMBER = 6;
    public static final int UTMCONTENT_FIELD_NUMBER = 5;
    public static final int UTMMEDIUM_FIELD_NUMBER = 4;
    public static final int UTMSOURCE_FIELD_NUMBER = 3;
    private int action_;
    private int bitField0_;
    private boolean isUnified_;
    private String identifier_ = "";
    private String path_ = "";
    private String utmSource_ = "";
    private String utmMedium_ = "";
    private String utmContent_ = "";
    private String utmCampaign_ = "";
    private String scheme_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        public final void h(String str) {
            c();
            ((SettingsDeeplinkContext) this.f49761b).setPath(str);
        }

        private a() {
            super(SettingsDeeplinkContext.DEFAULT_INSTANCE);
        }
    }

    static {
        SettingsDeeplinkContext settingsDeeplinkContext = new SettingsDeeplinkContext();
        DEFAULT_INSTANCE = settingsDeeplinkContext;
        w0.registerDefaultInstance(SettingsDeeplinkContext.class, settingsDeeplinkContext);
    }

    private SettingsDeeplinkContext() {
    }

    private void clearAction() {
        this.bitField0_ &= -65;
        this.action_ = 0;
    }

    private void clearIdentifier() {
        this.bitField0_ &= -2;
        this.identifier_ = getDefaultInstance().getIdentifier();
    }

    private void clearIsUnified() {
        this.bitField0_ &= -257;
        this.isUnified_ = false;
    }

    private void clearPath() {
        this.bitField0_ &= -3;
        this.path_ = getDefaultInstance().getPath();
    }

    private void clearScheme() {
        this.bitField0_ &= -129;
        this.scheme_ = getDefaultInstance().getScheme();
    }

    private void clearUtmCampaign() {
        this.bitField0_ &= -33;
        this.utmCampaign_ = getDefaultInstance().getUtmCampaign();
    }

    private void clearUtmContent() {
        this.bitField0_ &= -17;
        this.utmContent_ = getDefaultInstance().getUtmContent();
    }

    private void clearUtmMedium() {
        this.bitField0_ &= -9;
        this.utmMedium_ = getDefaultInstance().getUtmMedium();
    }

    private void clearUtmSource() {
        this.bitField0_ &= -5;
        this.utmSource_ = getDefaultInstance().getUtmSource();
    }

    public static SettingsDeeplinkContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static SettingsDeeplinkContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SettingsDeeplinkContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SettingsDeeplinkContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SettingsDeeplinkContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(za zaVar) {
        this.action_ = zaVar.getNumber();
        this.bitField0_ |= 64;
    }

    private void setActionValue(int i) {
        this.bitField0_ |= 64;
        this.action_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentifier(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.identifier_ = str;
    }

    private void setIdentifierBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.identifier_ = pVar.m();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsUnified(boolean z) {
        this.bitField0_ |= 256;
        this.isUnified_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPath(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.path_ = str;
    }

    private void setPathBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.path_ = pVar.m();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScheme(String str) {
        str.getClass();
        this.bitField0_ |= 128;
        this.scheme_ = str;
    }

    private void setSchemeBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.scheme_ = pVar.m();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUtmCampaign(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.utmCampaign_ = str;
    }

    private void setUtmCampaignBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.utmCampaign_ = pVar.m();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUtmContent(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.utmContent_ = str;
    }

    private void setUtmContentBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.utmContent_ = pVar.m();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUtmMedium(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.utmMedium_ = str;
    }

    private void setUtmMediumBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.utmMedium_ = pVar.m();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUtmSource(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.utmSource_ = str;
    }

    private void setUtmSourceBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.utmSource_ = pVar.m();
        this.bitField0_ |= 4;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (xa.f146233a[v0Var.ordinal()]) {
            case 1:
                return new SettingsDeeplinkContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ဌ\u0006\bለ\u0007\tဇ\b", new Object[]{"bitField0_", "identifier_", "path_", "utmSource_", "utmMedium_", "utmContent_", "utmCampaign_", "action_", "scheme_", "isUnified_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (SettingsDeeplinkContext.class) {
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

    public za getAction() {
        za zaVarA = za.a(this.action_);
        return zaVarA == null ? za.UNRECOGNIZED : zaVarA;
    }

    public int getActionValue() {
        return this.action_;
    }

    public String getIdentifier() {
        return this.identifier_;
    }

    public p getIdentifierBytes() {
        return p.d(this.identifier_);
    }

    public boolean getIsUnified() {
        return this.isUnified_;
    }

    public String getPath() {
        return this.path_;
    }

    public p getPathBytes() {
        return p.d(this.path_);
    }

    public String getScheme() {
        return this.scheme_;
    }

    public p getSchemeBytes() {
        return p.d(this.scheme_);
    }

    public String getUtmCampaign() {
        return this.utmCampaign_;
    }

    public p getUtmCampaignBytes() {
        return p.d(this.utmCampaign_);
    }

    public String getUtmContent() {
        return this.utmContent_;
    }

    public p getUtmContentBytes() {
        return p.d(this.utmContent_);
    }

    public String getUtmMedium() {
        return this.utmMedium_;
    }

    public p getUtmMediumBytes() {
        return p.d(this.utmMedium_);
    }

    public String getUtmSource() {
        return this.utmSource_;
    }

    public p getUtmSourceBytes() {
        return p.d(this.utmSource_);
    }

    public boolean hasAction() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasIdentifier() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIsUnified() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasPath() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasScheme() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasUtmCampaign() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasUtmContent() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasUtmMedium() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasUtmSource() {
        return (this.bitField0_ & 4) != 0;
    }

    public static a newBuilder(SettingsDeeplinkContext settingsDeeplinkContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(settingsDeeplinkContext);
    }

    public static SettingsDeeplinkContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SettingsDeeplinkContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SettingsDeeplinkContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsDeeplinkContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static SettingsDeeplinkContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (SettingsDeeplinkContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static SettingsDeeplinkContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsDeeplinkContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static SettingsDeeplinkContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SettingsDeeplinkContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SettingsDeeplinkContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsDeeplinkContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static SettingsDeeplinkContext parseFrom(InputStream inputStream) throws IOException {
        return (SettingsDeeplinkContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SettingsDeeplinkContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SettingsDeeplinkContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SettingsDeeplinkContext parseFrom(t tVar) throws IOException {
        return (SettingsDeeplinkContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static SettingsDeeplinkContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (SettingsDeeplinkContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
