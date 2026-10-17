package com.fourthline.vision.internal;

import com.fourthline.core.internal.Try;
import com.fourthline.vision.MotionData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface g9 {
    Object cancel(@NotNull Continuation<? super Unit> continuation);

    void start();

    Object stop(@NotNull Continuation<? super Try<MotionData>> continuation);
}
