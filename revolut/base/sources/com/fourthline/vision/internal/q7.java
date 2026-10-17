package com.fourthline.vision.internal;

import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface q7 extends pd {
    Object process(Object obj2, @NotNull Continuation<Object> continuation);

    @Override // com.fourthline.vision.internal.pd
    default void start() {
    }

    @Override // com.fourthline.vision.internal.pd
    default void stop() {
    }
}
