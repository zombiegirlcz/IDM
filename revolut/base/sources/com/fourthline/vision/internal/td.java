package com.fourthline.vision.internal;

import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface td extends q7, t1, pd {
    @NotNull
    sd getStepConfig();

    /* synthetic */ boolean isCompleted();

    @Override // com.fourthline.vision.internal.q7
    /* synthetic */ Object process(Object obj2, @NotNull Continuation continuation);

    @Override // com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    /* bridge */ /* synthetic */ default void start() {
        super.start();
    }

    @Override // com.fourthline.vision.internal.q7, com.fourthline.vision.internal.pd
    /* bridge */ /* synthetic */ default void stop() {
        super.stop();
    }
}
