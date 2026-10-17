package com.fourthline.vision.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface tf {
    @NotNull
    rf getCurrentStep();

    int getStepCount();

    boolean hasNext();

    @NotNull
    rf next();

    void resetAllSteps();

    void resetStep();
}
