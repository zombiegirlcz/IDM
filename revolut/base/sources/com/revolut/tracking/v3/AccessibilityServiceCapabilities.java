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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class AccessibilityServiceCapabilities extends w0 implements e2 {
    public static final int CONTROL_MAGNIFICATION_FIELD_NUMBER = 1;
    private static final AccessibilityServiceCapabilities DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int PERFORM_GESTURES_FIELD_NUMBER = 2;
    public static final int REQUEST_ENHANCED_WEB_ACCESSIBILITY_FIELD_NUMBER = 3;
    public static final int REQUEST_FILTER_KEY_EVENTS_FIELD_NUMBER = 4;
    public static final int REQUEST_FINGERPRINT_GESTURES_FIELD_NUMBER = 5;
    public static final int REQUEST_TOUCH_EXPLORATION_FIELD_NUMBER = 6;
    public static final int RETRIEVE_WINDOW_CONTENT_FIELD_NUMBER = 7;
    public static final int TAKE_SCREENSHOT_FIELD_NUMBER = 8;
    private int bitField0_;
    private boolean controlMagnification_;
    private boolean performGestures_;
    private boolean requestEnhancedWebAccessibility_;
    private boolean requestFilterKeyEvents_;
    private boolean requestFingerprintGestures_;
    private boolean requestTouchExploration_;
    private boolean retrieveWindowContent_;
    private boolean takeScreenshot_;

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(AccessibilityServiceCapabilities.DEFAULT_INSTANCE);
        }
    }

    static {
        AccessibilityServiceCapabilities accessibilityServiceCapabilities = new AccessibilityServiceCapabilities();
        DEFAULT_INSTANCE = accessibilityServiceCapabilities;
        w0.registerDefaultInstance(AccessibilityServiceCapabilities.class, accessibilityServiceCapabilities);
    }

    private AccessibilityServiceCapabilities() {
    }

    private void clearControlMagnification() {
        this.bitField0_ &= -2;
        this.controlMagnification_ = false;
    }

    private void clearPerformGestures() {
        this.bitField0_ &= -3;
        this.performGestures_ = false;
    }

    private void clearRequestEnhancedWebAccessibility() {
        this.bitField0_ &= -5;
        this.requestEnhancedWebAccessibility_ = false;
    }

    private void clearRequestFilterKeyEvents() {
        this.bitField0_ &= -9;
        this.requestFilterKeyEvents_ = false;
    }

    private void clearRequestFingerprintGestures() {
        this.bitField0_ &= -17;
        this.requestFingerprintGestures_ = false;
    }

    private void clearRequestTouchExploration() {
        this.bitField0_ &= -33;
        this.requestTouchExploration_ = false;
    }

    private void clearRetrieveWindowContent() {
        this.bitField0_ &= -65;
        this.retrieveWindowContent_ = false;
    }

    private void clearTakeScreenshot() {
        this.bitField0_ &= -129;
        this.takeScreenshot_ = false;
    }

    public static AccessibilityServiceCapabilities getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static AccessibilityServiceCapabilities parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AccessibilityServiceCapabilities) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AccessibilityServiceCapabilities parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AccessibilityServiceCapabilities) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setControlMagnification(boolean z) {
        this.bitField0_ |= 1;
        this.controlMagnification_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPerformGestures(boolean z) {
        this.bitField0_ |= 2;
        this.performGestures_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestEnhancedWebAccessibility(boolean z) {
        this.bitField0_ |= 4;
        this.requestEnhancedWebAccessibility_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestFilterKeyEvents(boolean z) {
        this.bitField0_ |= 8;
        this.requestFilterKeyEvents_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestFingerprintGestures(boolean z) {
        this.bitField0_ |= 16;
        this.requestFingerprintGestures_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestTouchExploration(boolean z) {
        this.bitField0_ |= 32;
        this.requestTouchExploration_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRetrieveWindowContent(boolean z) {
        this.bitField0_ |= 64;
        this.retrieveWindowContent_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTakeScreenshot(boolean z) {
        this.bitField0_ |= 128;
        this.takeScreenshot_ = z;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (grl.d.f146076a[v0Var.ordinal()]) {
            case 1:
                return new AccessibilityServiceCapabilities();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"bitField0_", "controlMagnification_", "performGestures_", "requestEnhancedWebAccessibility_", "requestFilterKeyEvents_", "requestFingerprintGestures_", "requestTouchExploration_", "retrieveWindowContent_", "takeScreenshot_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (AccessibilityServiceCapabilities.class) {
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

    public boolean getControlMagnification() {
        return this.controlMagnification_;
    }

    public boolean getPerformGestures() {
        return this.performGestures_;
    }

    public boolean getRequestEnhancedWebAccessibility() {
        return this.requestEnhancedWebAccessibility_;
    }

    public boolean getRequestFilterKeyEvents() {
        return this.requestFilterKeyEvents_;
    }

    public boolean getRequestFingerprintGestures() {
        return this.requestFingerprintGestures_;
    }

    public boolean getRequestTouchExploration() {
        return this.requestTouchExploration_;
    }

    public boolean getRetrieveWindowContent() {
        return this.retrieveWindowContent_;
    }

    public boolean getTakeScreenshot() {
        return this.takeScreenshot_;
    }

    public boolean hasControlMagnification() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPerformGestures() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRequestEnhancedWebAccessibility() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasRequestFilterKeyEvents() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasRequestFingerprintGestures() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasRequestTouchExploration() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasRetrieveWindowContent() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasTakeScreenshot() {
        return (this.bitField0_ & 128) != 0;
    }

    public static a newBuilder(AccessibilityServiceCapabilities accessibilityServiceCapabilities) {
        return (a) DEFAULT_INSTANCE.createBuilder(accessibilityServiceCapabilities);
    }

    public static AccessibilityServiceCapabilities parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (AccessibilityServiceCapabilities) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static AccessibilityServiceCapabilities parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (AccessibilityServiceCapabilities) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static AccessibilityServiceCapabilities parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (AccessibilityServiceCapabilities) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static AccessibilityServiceCapabilities parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (AccessibilityServiceCapabilities) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static AccessibilityServiceCapabilities parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AccessibilityServiceCapabilities) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AccessibilityServiceCapabilities parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (AccessibilityServiceCapabilities) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static AccessibilityServiceCapabilities parseFrom(InputStream inputStream) throws IOException {
        return (AccessibilityServiceCapabilities) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AccessibilityServiceCapabilities parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (AccessibilityServiceCapabilities) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static AccessibilityServiceCapabilities parseFrom(t tVar) throws IOException {
        return (AccessibilityServiceCapabilities) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static AccessibilityServiceCapabilities parseFrom(t tVar, d0 d0Var) throws IOException {
        return (AccessibilityServiceCapabilities) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
