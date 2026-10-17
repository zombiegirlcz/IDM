package com.fourthline.vision.internal;

import com.fourthline.core.internal.Try;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface wd extends pd {
    Function0<Unit> getOnCompletedListener();

    @NotNull
    sd getStepConfig();

    Function1<sd, Unit> getStepListener();

    Function1<Try<? extends ud>, Unit> getStepResultListener();

    int getStepsCount();

    void moveToNext();

    void resetAll();

    void resetCurrentStep();

    void setOnCompletedListener(Function0<Unit> function0);

    void setStepListener(Function1<? super sd, Unit> function1);

    void setStepResultListener(Function1<? super Try<? extends ud>, Unit> function1);

    @Override // com.fourthline.vision.internal.pd
    /* synthetic */ void start();

    @Override // com.fourthline.vision.internal.pd
    /* synthetic */ void stop();
}
