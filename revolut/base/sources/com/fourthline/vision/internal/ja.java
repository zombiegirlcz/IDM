package com.fourthline.vision.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface ja extends pd {
    o8 getMediaRecorderManager();

    @NotNull
    ka getScannerCallback();

    sd getStepConfig();

    int getStepsCount();

    boolean isRunning();

    void moveToNextStep();

    void resetCurrentStep();

    void resetScanner();

    @Override // com.fourthline.vision.internal.pd
    /* synthetic */ void start();

    @Override // com.fourthline.vision.internal.pd
    /* synthetic */ void stop();

    void takeSnapshot();
}
