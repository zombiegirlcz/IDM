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
import grl.qa;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class SettingsAccessibilityContext extends w0 implements e2 {
    private static final SettingsAccessibilityContext DEFAULT_INSTANCE;
    public static final int INCREASED_FONT_SCALE_FIELD_NUMBER = 2;
    private static volatile m2 PARSER = null;
    public static final int VOICEOVER_ENABLED_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean increasedFontScale_;
    private boolean voiceoverEnabled_;

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(SettingsAccessibilityContext.DEFAULT_INSTANCE);
        }
    }

    static {
        SettingsAccessibilityContext settingsAccessibilityContext = new SettingsAccessibilityContext();
        DEFAULT_INSTANCE = settingsAccessibilityContext;
        w0.registerDefaultInstance(SettingsAccessibilityContext.class, settingsAccessibilityContext);
    }

    private SettingsAccessibilityContext() {
    }

    private void clearIncreasedFontScale() {
        this.bitField0_ &= -3;
        this.increasedFontScale_ = false;
    }

    private void clearVoiceoverEnabled() {
        this.bitField0_ &= -2;
        this.voiceoverEnabled_ = false;
    }

    public static SettingsAccessibilityContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static SettingsAccessibilityContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SettingsAccessibilityContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SettingsAccessibilityContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SettingsAccessibilityContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIncreasedFontScale(boolean z) {
        this.bitField0_ |= 2;
        this.increasedFontScale_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceoverEnabled(boolean z) {
        this.bitField0_ |= 1;
        this.voiceoverEnabled_ = z;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (qa.f146184a[v0Var.ordinal()]) {
            case 1:
                return new SettingsAccessibilityContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "voiceoverEnabled_", "increasedFontScale_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (SettingsAccessibilityContext.class) {
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

    public boolean getIncreasedFontScale() {
        return this.increasedFontScale_;
    }

    public boolean getVoiceoverEnabled() {
        return this.voiceoverEnabled_;
    }

    public boolean hasIncreasedFontScale() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasVoiceoverEnabled() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(SettingsAccessibilityContext settingsAccessibilityContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(settingsAccessibilityContext);
    }

    public static SettingsAccessibilityContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SettingsAccessibilityContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SettingsAccessibilityContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsAccessibilityContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static SettingsAccessibilityContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (SettingsAccessibilityContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static SettingsAccessibilityContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsAccessibilityContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static SettingsAccessibilityContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SettingsAccessibilityContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SettingsAccessibilityContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsAccessibilityContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static SettingsAccessibilityContext parseFrom(InputStream inputStream) throws IOException {
        return (SettingsAccessibilityContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SettingsAccessibilityContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SettingsAccessibilityContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SettingsAccessibilityContext parseFrom(t tVar) throws IOException {
        return (SettingsAccessibilityContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static SettingsAccessibilityContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (SettingsAccessibilityContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
