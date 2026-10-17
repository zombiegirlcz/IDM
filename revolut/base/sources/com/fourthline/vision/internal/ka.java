package com.fourthline.vision.internal;

import com.fourthline.core.internal.Try;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface ka {
    boolean getScannerLevelCallbacksAllowed();

    void onMoveToNextStep();

    void onResetCurrentStep(Object obj2);

    void onScannerResult(@NotNull Try<ua> r110);

    void onStart();

    void onStepResult(@NotNull Try<? extends ud> r110);

    void onStepUpdate(Object obj2);

    void onStepsSizeUpdate(int i);

    void onTakeSnapshot();

    void reset();
}
