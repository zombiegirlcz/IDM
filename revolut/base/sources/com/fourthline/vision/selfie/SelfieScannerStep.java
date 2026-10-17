package com.fourthline.vision.selfie;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/fourthline/vision/selfie/SelfieScannerStep;", "", "<init>", "(Ljava/lang/String;I)V", "SELFIE", "TURN_HEAD_LEFT", "TURN_HEAD_RIGHT", "ORCHESTRATED_LIVENESS", "HAND_MOVEMENT", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelfieScannerStep {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ SelfieScannerStep[] f37220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f37221b;
    public static final SelfieScannerStep SELFIE = new SelfieScannerStep("SELFIE", 0);
    public static final SelfieScannerStep TURN_HEAD_LEFT = new SelfieScannerStep("TURN_HEAD_LEFT", 1);
    public static final SelfieScannerStep TURN_HEAD_RIGHT = new SelfieScannerStep("TURN_HEAD_RIGHT", 2);
    public static final SelfieScannerStep ORCHESTRATED_LIVENESS = new SelfieScannerStep("ORCHESTRATED_LIVENESS", 3);
    public static final SelfieScannerStep HAND_MOVEMENT = new SelfieScannerStep("HAND_MOVEMENT", 4);

    private static final /* synthetic */ SelfieScannerStep[] $values() {
        return new SelfieScannerStep[]{SELFIE, TURN_HEAD_LEFT, TURN_HEAD_RIGHT, ORCHESTRATED_LIVENESS, HAND_MOVEMENT};
    }

    static {
        SelfieScannerStep[] selfieScannerStepArr$values = $values();
        f37220a = selfieScannerStepArr$values;
        f37221b = s.n(selfieScannerStepArr$values);
    }

    private SelfieScannerStep(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return f37221b;
    }

    public static SelfieScannerStep valueOf(String str) {
        return (SelfieScannerStep) Enum.valueOf(SelfieScannerStep.class, str);
    }

    public static SelfieScannerStep[] values() {
        return (SelfieScannerStep[]) f37220a.clone();
    }
}
