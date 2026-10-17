package com.onfido.android.sdk.capture.ui.camera;

import android.animation.IntEvaluator;
import android.animation.TypeEvaluator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J \u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/DoubleIntArrayEvaluator;", "Landroid/animation/TypeEvaluator;", "", "()V", "evaluator", "Landroid/animation/IntEvaluator;", "getEvaluator$onfido_capture_sdk_core_release", "()Landroid/animation/IntEvaluator;", "setEvaluator$onfido_capture_sdk_core_release", "(Landroid/animation/IntEvaluator;)V", "evaluate", "fraction", "", "startValues", "endValues", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DoubleIntArrayEvaluator implements TypeEvaluator<int[]> {

    @NotNull
    private IntEvaluator evaluator = new IntEvaluator();

    @NotNull
    /* JADX INFO: renamed from: getEvaluator$onfido_capture_sdk_core_release, reason: from getter */
    public final IntEvaluator getEvaluator() {
        return this.evaluator;
    }

    public final void setEvaluator$onfido_capture_sdk_core_release(@NotNull IntEvaluator intEvaluator) {
        Intrinsics.checkNotNullParameter(intEvaluator, "<set-?>");
        this.evaluator = intEvaluator;
    }

    @Override // android.animation.TypeEvaluator
    @NotNull
    public int[] evaluate(float fraction, @NotNull int[] startValues, @NotNull int[] endValues) {
        Intrinsics.checkNotNullParameter(startValues, "startValues");
        Intrinsics.checkNotNullParameter(endValues, "endValues");
        if (startValues.length != endValues.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int[] iArr = new int[startValues.length];
        int length = startValues.length;
        for (int i = 0; i < length; i++) {
            Integer numEvaluate = this.evaluator.evaluate(fraction, Integer.valueOf(startValues[i]), Integer.valueOf(endValues[i]));
            Intrinsics.checkNotNullExpressionValue(numEvaluate, "evaluate(...)");
            iArr[i] = numEvaluate.intValue();
        }
        return iArr;
    }
}
