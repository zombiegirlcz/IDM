package com.fourthline.vision.internal;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.tensorflow.lite.InterpreterApi;

/* JADX INFO: loaded from: classes23.dex */
public interface c7 {
    @NotNull
    d7 processHandAnalyzerOutput(@NotNull InterpreterApi interpreterApi, int i, int i2, @NotNull Map<Integer, ? extends Object> map, float f);
}
