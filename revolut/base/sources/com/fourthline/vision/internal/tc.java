package com.fourthline.vision.internal;

import com.fourthline.core.internal.Try;
import com.fourthline.core.internal.TryKt;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class tc extends va {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc(@NotNull k7 imageSource, @NotNull t7 isSteadyDataSource, @NotNull w1 compositeStep, @NotNull List<? extends qd> preconditions) {
        super(imageSource, isSteadyDataSource, compositeStep, preconditions);
        Intrinsics.checkNotNullParameter(imageSource, "imageSource");
        Intrinsics.checkNotNullParameter(isSteadyDataSource, "isSteadyDataSource");
        Intrinsics.checkNotNullParameter(compositeStep, "compositeStep");
        Intrinsics.checkNotNullParameter(preconditions, "preconditions");
    }

    @Override // com.fourthline.vision.internal.va, com.fourthline.vision.internal.wd
    public void moveToNext() {
    }

    @Override // com.fourthline.vision.internal.va
    public void onStepSuccess(@NotNull ud stepResult) {
        Intrinsics.checkNotNullParameter(stepResult, "stepResult");
        if (tc.class.isAnonymousClass()) {
            String name = tc.class.getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        }
        Objects.toString(stepResult);
        if (isCompleted()) {
            return;
        }
        Function1<Try<? extends ud>, Unit> stepResultListener = getStepResultListener();
        if (stepResultListener != null) {
            stepResultListener.invoke(TryKt.success(stepResult));
        }
        invokeStepUpdateOrComplete();
    }

    @Override // com.fourthline.vision.internal.va, com.fourthline.vision.internal.wd
    public void resetCurrentStep() {
    }
}
