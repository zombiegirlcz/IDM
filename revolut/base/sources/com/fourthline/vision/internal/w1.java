package com.fourthline.vision.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface w1 extends td {
    @Override // com.fourthline.vision.internal.td
    @NotNull
    /* synthetic */ sd getStepConfig();

    int getStepsCount();

    void moveToNext();

    void reset();

    void resetStep();
}
