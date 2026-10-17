package com.fourthline.vision.selfie;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/fourthline/vision/selfie/SelfieScannerWarning;", "", "<init>", "(Ljava/lang/String;I)V", "FACE_NOT_DETECTED", "FACE_NOT_IN_FRAME", "FACE_TOO_CLOSE", "FACE_TOO_FAR", "FACE_YAW_TOO_BIG", "DEVICE_NOT_STEADY", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelfieScannerWarning {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ SelfieScannerWarning[] f37222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f37223b;
    public static final SelfieScannerWarning FACE_NOT_DETECTED = new SelfieScannerWarning("FACE_NOT_DETECTED", 0);
    public static final SelfieScannerWarning FACE_NOT_IN_FRAME = new SelfieScannerWarning("FACE_NOT_IN_FRAME", 1);
    public static final SelfieScannerWarning FACE_TOO_CLOSE = new SelfieScannerWarning("FACE_TOO_CLOSE", 2);
    public static final SelfieScannerWarning FACE_TOO_FAR = new SelfieScannerWarning("FACE_TOO_FAR", 3);
    public static final SelfieScannerWarning FACE_YAW_TOO_BIG = new SelfieScannerWarning("FACE_YAW_TOO_BIG", 4);
    public static final SelfieScannerWarning DEVICE_NOT_STEADY = new SelfieScannerWarning("DEVICE_NOT_STEADY", 5);

    private static final /* synthetic */ SelfieScannerWarning[] $values() {
        return new SelfieScannerWarning[]{FACE_NOT_DETECTED, FACE_NOT_IN_FRAME, FACE_TOO_CLOSE, FACE_TOO_FAR, FACE_YAW_TOO_BIG, DEVICE_NOT_STEADY};
    }

    static {
        SelfieScannerWarning[] selfieScannerWarningArr$values = $values();
        f37222a = selfieScannerWarningArr$values;
        f37223b = s.n(selfieScannerWarningArr$values);
    }

    private SelfieScannerWarning(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f37223b;
    }

    public static SelfieScannerWarning valueOf(String str) {
        return (SelfieScannerWarning) Enum.valueOf(SelfieScannerWarning.class, str);
    }

    public static SelfieScannerWarning[] values() {
        return (SelfieScannerWarning[]) f37222a.clone();
    }
}
