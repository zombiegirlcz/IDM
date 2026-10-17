package com.fourthline.vision.internal;

import com.fourthline.core.internal.Try;
import com.fourthline.core.internal.TryKt;
import com.fourthline.vision.internal.ra;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class o5 extends va {
    private final w1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(@NotNull k7 imageSource, @NotNull t7 isSteadyDataSource, @NotNull w1 compositeStep, @NotNull List<? extends qd> preconditions) {
        super(imageSource, isSteadyDataSource, compositeStep, preconditions);
        Intrinsics.checkNotNullParameter(imageSource, "imageSource");
        Intrinsics.checkNotNullParameter(isSteadyDataSource, "isSteadyDataSource");
        Intrinsics.checkNotNullParameter(compositeStep, "compositeStep");
        Intrinsics.checkNotNullParameter(preconditions, "preconditions");
        this.i = compositeStep;
    }

    private final void tryNotifyError(ra.a aVar) {
        Function1<Try<? extends ud>, Unit> stepResultListener = getStepResultListener();
        if (stepResultListener != null) {
            stepResultListener.invoke(TryKt.failure(aVar));
        }
    }

    private final void tryNotifyStepUpdate() {
        Function1<sd, Unit> stepListener = getStepListener();
        if (stepListener != null) {
            stepListener.invoke(getStepConfig());
        }
    }

    @Override // com.fourthline.vision.internal.va, com.fourthline.vision.internal.wd
    public void moveToNext() {
        try {
            if (o5.class.isAnonymousClass()) {
                String name = o5.class.getName();
                if (name.length() > 23) {
                    Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
                }
            }
            this.i.moveToNext();
            if (this.i.isCompleted()) {
                setCompleted(true);
            } else {
                tryNotifyStepUpdate();
            }
        } catch (ra.a e) {
            tryNotifyError(e);
        }
    }

    @Override // com.fourthline.vision.internal.va
    public void onStepSuccess(@NotNull ud stepResult) {
        Function1<Try<? extends ud>, Unit> stepResultListener;
        Intrinsics.checkNotNullParameter(stepResult, "stepResult");
        if (o5.class.isAnonymousClass()) {
            String name = o5.class.getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        }
        Objects.toString(stepResult);
        if (isCompleted() || (stepResultListener = getStepResultListener()) == null) {
            return;
        }
        stepResultListener.invoke(TryKt.success(stepResult));
    }

    @Override // com.fourthline.vision.internal.va, com.fourthline.vision.internal.wd
    public void resetCurrentStep() {
        try {
            if (o5.class.isAnonymousClass()) {
                String name = o5.class.getName();
                if (name.length() > 23) {
                    Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
                }
            }
            this.i.resetStep();
            tryNotifyStepUpdate();
        } catch (ra.a e) {
            tryNotifyError(e);
        }
    }
}
