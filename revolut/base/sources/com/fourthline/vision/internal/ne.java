package com.fourthline.vision.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface ne {
    void onFail(Object obj2, @NotNull pa paVar, Throwable th10);

    void onMoveToNextStep();

    void onPermissionNotGranted(@NotNull ff ffVar);

    void onReset();

    void onResetCurrentStep(Object obj2);

    void onStart();

    void onStepSuccess(Object obj2, @NotNull ud udVar);

    void onStepUpdate(Object obj2);

    void onSuccess(@NotNull ua uaVar);

    void onTakeSnapshot(Object obj2);
}
