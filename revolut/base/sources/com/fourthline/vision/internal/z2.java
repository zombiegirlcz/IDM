package com.fourthline.vision.internal;

import android.hardware.camera2.CameraManager;
import android.view.Display;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class z2 implements a0 {
    @Override // com.fourthline.vision.internal.a0
    @NotNull
    public a3 provideCameraInfoProvider(@NotNull CameraManager cameraManager, @NotNull Display display, @NotNull la scannerConfig) {
        Intrinsics.checkNotNullParameter(cameraManager, "cameraManager");
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(scannerConfig, "scannerConfig");
        return new a3(cameraManager, scannerConfig.getCameraDirection(), display);
    }
}
