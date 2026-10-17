package com.fourthline.vision.internal;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface v {
    int getAnalyzerTargetCoordinateSystem();

    @NotNull
    Function1<fa, fa> getBoundingBoxToScreen();

    @NotNull
    od getCameraResolution();

    @NotNull
    Function1<fa, fa> getScreenToBoundingBox();
}
