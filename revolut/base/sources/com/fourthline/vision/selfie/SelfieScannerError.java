package com.fourthline.vision.selfie;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/fourthline/vision/selfie/SelfieScannerError;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "TIMEOUT", "FACE_DISAPPEARED", "CAMERA_PERMISSION_NOT_GRANTED", "RECORD_AUDIO_PERMISSION_NOT_GRANTED", "CAMERA_NOT_AVAILABLE", "MULTIPLE_FACES_DETECTED", "RECORDING_FAILED", "SCANNER_INTERRUPTED", "RECOGNITION_MODELS_NOT_DOWNLOADED", "GOOGLE_PLAY_SERVICES_NOT_AVAILABLE", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelfieScannerError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ SelfieScannerError[] f37214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f37215b;
    public static final SelfieScannerError UNKNOWN = new SelfieScannerError("UNKNOWN", 0);
    public static final SelfieScannerError TIMEOUT = new SelfieScannerError("TIMEOUT", 1);
    public static final SelfieScannerError FACE_DISAPPEARED = new SelfieScannerError("FACE_DISAPPEARED", 2);
    public static final SelfieScannerError CAMERA_PERMISSION_NOT_GRANTED = new SelfieScannerError("CAMERA_PERMISSION_NOT_GRANTED", 3);
    public static final SelfieScannerError RECORD_AUDIO_PERMISSION_NOT_GRANTED = new SelfieScannerError("RECORD_AUDIO_PERMISSION_NOT_GRANTED", 4);
    public static final SelfieScannerError CAMERA_NOT_AVAILABLE = new SelfieScannerError("CAMERA_NOT_AVAILABLE", 5);
    public static final SelfieScannerError MULTIPLE_FACES_DETECTED = new SelfieScannerError("MULTIPLE_FACES_DETECTED", 6);
    public static final SelfieScannerError RECORDING_FAILED = new SelfieScannerError("RECORDING_FAILED", 7);
    public static final SelfieScannerError SCANNER_INTERRUPTED = new SelfieScannerError("SCANNER_INTERRUPTED", 8);
    public static final SelfieScannerError RECOGNITION_MODELS_NOT_DOWNLOADED = new SelfieScannerError("RECOGNITION_MODELS_NOT_DOWNLOADED", 9);
    public static final SelfieScannerError GOOGLE_PLAY_SERVICES_NOT_AVAILABLE = new SelfieScannerError("GOOGLE_PLAY_SERVICES_NOT_AVAILABLE", 10);

    private static final /* synthetic */ SelfieScannerError[] $values() {
        return new SelfieScannerError[]{UNKNOWN, TIMEOUT, FACE_DISAPPEARED, CAMERA_PERMISSION_NOT_GRANTED, RECORD_AUDIO_PERMISSION_NOT_GRANTED, CAMERA_NOT_AVAILABLE, MULTIPLE_FACES_DETECTED, RECORDING_FAILED, SCANNER_INTERRUPTED, RECOGNITION_MODELS_NOT_DOWNLOADED, GOOGLE_PLAY_SERVICES_NOT_AVAILABLE};
    }

    static {
        SelfieScannerError[] selfieScannerErrorArr$values = $values();
        f37214a = selfieScannerErrorArr$values;
        f37215b = s.n(selfieScannerErrorArr$values);
    }

    private SelfieScannerError(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f37215b;
    }

    public static SelfieScannerError valueOf(String str) {
        return (SelfieScannerError) Enum.valueOf(SelfieScannerError.class, str);
    }

    public static SelfieScannerError[] values() {
        return (SelfieScannerError[]) f37214a.clone();
    }
}
