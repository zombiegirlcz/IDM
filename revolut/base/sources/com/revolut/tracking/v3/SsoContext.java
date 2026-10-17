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
import grl.ad;
import grl.sc;
import grl.uc;
import grl.wc;
import grl.yc;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class SsoContext extends w0 implements e2 {
    public static final int ACR_VALUES_FIELD_NUMBER = 3;
    public static final int CLIENTID_FIELD_NUMBER = 1;
    public static final int CODE_CHALLENGE_FIELD_NUMBER = 2;
    public static final int COUNTRY_CODES_FIELD_NUMBER = 9;
    private static final SsoContext DEFAULT_INSTANCE;
    public static final int DISPLAY_FIELD_NUMBER = 6;
    public static final int FLOW_FIELD_NUMBER = 5;
    private static volatile m2 PARSER = null;
    public static final int PROMPT_FIELD_NUMBER = 4;
    public static final int UI_COLOR_SCHEME_FIELD_NUMBER = 7;
    public static final int UI_LOCALES_FIELD_NUMBER = 8;
    private int bitField0_;
    private int display_;
    private int flow_;
    private int prompt_;
    private int uiColorScheme_;
    private String clientId_ = "";
    private String codeChallenge_ = "";
    private String acrValues_ = "";
    private String uiLocales_ = "";
    private String countryCodes_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(SsoContext.DEFAULT_INSTANCE);
        }
    }

    static {
        SsoContext ssoContext = new SsoContext();
        DEFAULT_INSTANCE = ssoContext;
        w0.registerDefaultInstance(SsoContext.class, ssoContext);
    }

    private SsoContext() {
    }

    private void clearAcrValues() {
        this.bitField0_ &= -5;
        this.acrValues_ = getDefaultInstance().getAcrValues();
    }

    private void clearClientId() {
        this.bitField0_ &= -2;
        this.clientId_ = getDefaultInstance().getClientId();
    }

    private void clearCodeChallenge() {
        this.bitField0_ &= -3;
        this.codeChallenge_ = getDefaultInstance().getCodeChallenge();
    }

    private void clearCountryCodes() {
        this.bitField0_ &= -257;
        this.countryCodes_ = getDefaultInstance().getCountryCodes();
    }

    private void clearDisplay() {
        this.bitField0_ &= -33;
        this.display_ = 0;
    }

    private void clearFlow() {
        this.bitField0_ &= -17;
        this.flow_ = 0;
    }

    private void clearPrompt() {
        this.bitField0_ &= -9;
        this.prompt_ = 0;
    }

    private void clearUiColorScheme() {
        this.bitField0_ &= -65;
        this.uiColorScheme_ = 0;
    }

    private void clearUiLocales() {
        this.bitField0_ &= -129;
        this.uiLocales_ = getDefaultInstance().getUiLocales();
    }

    public static SsoContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static SsoContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SsoContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SsoContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SsoContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAcrValues(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.acrValues_ = str;
    }

    private void setAcrValuesBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.acrValues_ = pVar.m();
        this.bitField0_ |= 4;
    }

    private void setClientId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.clientId_ = str;
    }

    private void setClientIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.clientId_ = pVar.m();
        this.bitField0_ |= 1;
    }

    private void setCodeChallenge(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.codeChallenge_ = str;
    }

    private void setCodeChallengeBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.codeChallenge_ = pVar.m();
        this.bitField0_ |= 2;
    }

    private void setCountryCodes(String str) {
        str.getClass();
        this.bitField0_ |= 256;
        this.countryCodes_ = str;
    }

    private void setCountryCodesBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.countryCodes_ = pVar.m();
        this.bitField0_ |= 256;
    }

    private void setDisplay(wc wcVar) {
        this.display_ = wcVar.getNumber();
        this.bitField0_ |= 32;
    }

    private void setDisplayValue(int i) {
        this.bitField0_ |= 32;
        this.display_ = i;
    }

    private void setFlow(yc ycVar) {
        this.flow_ = ycVar.getNumber();
        this.bitField0_ |= 16;
    }

    private void setFlowValue(int i) {
        this.bitField0_ |= 16;
        this.flow_ = i;
    }

    private void setPrompt(ad adVar) {
        this.prompt_ = adVar.getNumber();
        this.bitField0_ |= 8;
    }

    private void setPromptValue(int i) {
        this.bitField0_ |= 8;
        this.prompt_ = i;
    }

    private void setUiColorScheme(uc ucVar) {
        this.uiColorScheme_ = ucVar.getNumber();
        this.bitField0_ |= 64;
    }

    private void setUiColorSchemeValue(int i) {
        this.bitField0_ |= 64;
        this.uiColorScheme_ = i;
    }

    private void setUiLocales(String str) {
        str.getClass();
        this.bitField0_ |= 128;
        this.uiLocales_ = str;
    }

    private void setUiLocalesBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.uiLocales_ = pVar.m();
        this.bitField0_ |= 128;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (sc.f146201a[v0Var.ordinal()]) {
            case 1:
                return new SsoContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bለ\u0007\tለ\b", new Object[]{"bitField0_", "clientId_", "codeChallenge_", "acrValues_", "prompt_", "flow_", "display_", "uiColorScheme_", "uiLocales_", "countryCodes_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (SsoContext.class) {
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

    public String getAcrValues() {
        return this.acrValues_;
    }

    public p getAcrValuesBytes() {
        return p.d(this.acrValues_);
    }

    public String getClientId() {
        return this.clientId_;
    }

    public p getClientIdBytes() {
        return p.d(this.clientId_);
    }

    public String getCodeChallenge() {
        return this.codeChallenge_;
    }

    public p getCodeChallengeBytes() {
        return p.d(this.codeChallenge_);
    }

    public String getCountryCodes() {
        return this.countryCodes_;
    }

    public p getCountryCodesBytes() {
        return p.d(this.countryCodes_);
    }

    public wc getDisplay() {
        wc wcVarA = wc.a(this.display_);
        return wcVarA == null ? wc.UNRECOGNIZED : wcVarA;
    }

    public int getDisplayValue() {
        return this.display_;
    }

    public yc getFlow() {
        yc ycVarA = yc.a(this.flow_);
        return ycVarA == null ? yc.UNRECOGNIZED : ycVarA;
    }

    public int getFlowValue() {
        return this.flow_;
    }

    public ad getPrompt() {
        ad adVarA = ad.a(this.prompt_);
        return adVarA == null ? ad.UNRECOGNIZED : adVarA;
    }

    public int getPromptValue() {
        return this.prompt_;
    }

    public uc getUiColorScheme() {
        uc ucVarA = uc.a(this.uiColorScheme_);
        return ucVarA == null ? uc.UNRECOGNIZED : ucVarA;
    }

    public int getUiColorSchemeValue() {
        return this.uiColorScheme_;
    }

    public String getUiLocales() {
        return this.uiLocales_;
    }

    public p getUiLocalesBytes() {
        return p.d(this.uiLocales_);
    }

    public boolean hasAcrValues() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasClientId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasCodeChallenge() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasCountryCodes() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasDisplay() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasFlow() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasPrompt() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasUiColorScheme() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasUiLocales() {
        return (this.bitField0_ & 128) != 0;
    }

    public static a newBuilder(SsoContext ssoContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(ssoContext);
    }

    public static SsoContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SsoContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SsoContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (SsoContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static SsoContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (SsoContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static SsoContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (SsoContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static SsoContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SsoContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SsoContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (SsoContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static SsoContext parseFrom(InputStream inputStream) throws IOException {
        return (SsoContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SsoContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SsoContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SsoContext parseFrom(t tVar) throws IOException {
        return (SsoContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static SsoContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (SsoContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
