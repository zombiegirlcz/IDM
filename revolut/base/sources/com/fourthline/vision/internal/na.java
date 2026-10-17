package com.fourthline.vision.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface na extends oa {
    Object config();

    @Override // com.fourthline.vision.internal.oa
    @NotNull
    /* synthetic */ fa contentDetectionArea();

    default boolean getShouldStartAutomatically() {
        return true;
    }
}
