package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.SelfieScannerStep;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class bd {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SelfieScannerStep.values().length];
            try {
                iArr[SelfieScannerStep.SELFIE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelfieScannerStep.TURN_HEAD_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SelfieScannerStep.TURN_HEAD_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SelfieScannerStep.ORCHESTRATED_LIVENESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SelfieScannerStep.HAND_MOVEMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final String getStepType(@NotNull SelfieScannerStep selfieScannerStep) {
        Intrinsics.checkNotNullParameter(selfieScannerStep, "<this>");
        int i = a.$EnumSwitchMapping$0[selfieScannerStep.ordinal()];
        if (i == 1) {
            return "automatic_capture";
        }
        if (i == 2) {
            return "turn_head_left";
        }
        if (i == 3) {
            return "turn_head_right";
        }
        if (i == 4) {
            return "orchestrated_liveness";
        }
        if (i == 5) {
            return "hand_movement";
        }
        throw new NoWhenBranchMatchedException();
    }
}
