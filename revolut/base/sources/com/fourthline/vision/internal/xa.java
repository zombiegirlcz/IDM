package com.fourthline.vision.internal;

import android.hardware.camera2.CameraManager;
import android.view.Display;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class xa implements a0 {
    @Override // com.fourthline.vision.internal.a0
    @NotNull
    public b0 provideCameraInfoProvider(@NotNull CameraManager cameraManager, @NotNull Display display, @NotNull la scannerConfig) {
        Intrinsics.checkNotNullParameter(cameraManager, "cameraManager");
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(scannerConfig, "scannerConfig");
        return new b0(cameraManager, scannerConfig.getCameraDirection(), display);
    }
}
