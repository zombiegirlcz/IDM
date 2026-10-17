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
import grl.xb;
import grl.zb;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class SettingsThemingContext extends w0 implements e2 {
    public static final int ACCENT_COLOR_FIELD_NUMBER = 2;
    public static final int APP_THEME_FIELD_NUMBER = 3;
    public static final int APP_THEME_MODE_FIELD_NUMBER = 4;
    public static final int DARK_MODE_FIELD_NUMBER = 1;
    private static final SettingsThemingContext DEFAULT_INSTANCE;
    private static volatile m2 PARSER;
    private int appThemeMode_;
    private int bitField0_;
    private boolean darkMode_;
    private String accentColor_ = "";
    private String appTheme_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        public final void h(boolean z) {
            c();
            ((SettingsThemingContext) this.f49761b).setDarkMode(z);
        }

        private a() {
            super(SettingsThemingContext.DEFAULT_INSTANCE);
        }
    }

    static {
        SettingsThemingContext settingsThemingContext = new SettingsThemingContext();
        DEFAULT_INSTANCE = settingsThemingContext;
        w0.registerDefaultInstance(SettingsThemingContext.class, settingsThemingContext);
    }

    private SettingsThemingContext() {
    }

    private void clearAccentColor() {
        this.bitField0_ &= -3;
        this.accentColor_ = getDefaultInstance().getAccentColor();
    }

    private void clearAppTheme() {
        this.bitField0_ &= -5;
        this.appTheme_ = getDefaultInstance().getAppTheme();
    }

    private void clearAppThemeMode() {
        this.bitField0_ &= -9;
        this.appThemeMode_ = 0;
    }

    private void clearDarkMode() {
        this.bitField0_ &= -2;
        this.darkMode_ = false;
    }

    public static SettingsThemingContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static SettingsThemingContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SettingsThemingContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SettingsThemingContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SettingsThemingContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccentColor(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.accentColor_ = str;
    }

    private void setAccentColorBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.accentColor_ = pVar.m();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppTheme(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.appTheme_ = str;
    }

    private void setAppThemeBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.appTheme_ = pVar.m();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppThemeMode(zb zbVar) {
        this.appThemeMode_ = zbVar.getNumber();
        this.bitField0_ |= 8;
    }

    private void setAppThemeModeValue(int i) {
        this.bitField0_ |= 8;
        this.appThemeMode_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDarkMode(boolean z) {
        this.bitField0_ |= 1;
        this.darkMode_ = z;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (xb.f146234a[v0Var.ordinal()]) {
            case 1:
                return new SettingsThemingContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ဌ\u0003", new Object[]{"bitField0_", "darkMode_", "accentColor_", "appTheme_", "appThemeMode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (SettingsThemingContext.class) {
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

    public String getAccentColor() {
        return this.accentColor_;
    }

    public p getAccentColorBytes() {
        return p.d(this.accentColor_);
    }

    public String getAppTheme() {
        return this.appTheme_;
    }

    public p getAppThemeBytes() {
        return p.d(this.appTheme_);
    }

    public zb getAppThemeMode() {
        int i = this.appThemeMode_;
        zb zbVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : zb.Transparent : zb.System : zb.Dark : zb.Light;
        return zbVar == null ? zb.UNRECOGNIZED : zbVar;
    }

    public int getAppThemeModeValue() {
        return this.appThemeMode_;
    }

    public boolean getDarkMode() {
        return this.darkMode_;
    }

    public boolean hasAccentColor() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasAppTheme() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasAppThemeMode() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasDarkMode() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(SettingsThemingContext settingsThemingContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(settingsThemingContext);
    }

    public static SettingsThemingContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SettingsThemingContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SettingsThemingContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsThemingContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static SettingsThemingContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (SettingsThemingContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static SettingsThemingContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsThemingContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static SettingsThemingContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SettingsThemingContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SettingsThemingContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsThemingContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static SettingsThemingContext parseFrom(InputStream inputStream) throws IOException {
        return (SettingsThemingContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SettingsThemingContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SettingsThemingContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SettingsThemingContext parseFrom(t tVar) throws IOException {
        return (SettingsThemingContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static SettingsThemingContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (SettingsThemingContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
