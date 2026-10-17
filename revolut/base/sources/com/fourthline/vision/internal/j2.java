package com.fourthline.vision.internal;

import java.util.List;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface j2 extends AutoCloseable {
    Object detect(@NotNull u6 u6Var, @NotNull Continuation<? super List<Object>> continuation);
}
