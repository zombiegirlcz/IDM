package com.fourthline.vision.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public class af {
    @NotNull
    public final zf provideImageProducer(@NotNull s camera2) {
        Intrinsics.checkNotNullParameter(camera2, "camera2");
        return new y(camera2);
    }

    @NotNull
    public final df provideVisionInfo(@NotNull b0 cameraInfoProvider) {
        Intrinsics.checkNotNullParameter(cameraInfoProvider, "cameraInfoProvider");
        return new o0(cameraInfoProvider);
    }
}
