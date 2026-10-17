package com.fourthline.vision.internal;

import android.util.Size;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class o0 implements df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f36612a;

    public o0(@NotNull b0 cameraInfoProvider) {
        Intrinsics.checkNotNullParameter(cameraInfoProvider, "cameraInfoProvider");
        this.f36612a = cameraInfoProvider;
    }

    @Override // com.fourthline.vision.internal.df
    @NotNull
    public Size getImageReaderSize() {
        return this.f36612a.getImageReaderSize();
    }

    @Override // com.fourthline.vision.internal.df
    public int getOrientationHint() {
        return this.f36612a.getOrientationHint();
    }

    @Override // com.fourthline.vision.internal.df
    @NotNull
    public Size getPreviewSize() {
        return this.f36612a.getCameraPreviewSize();
    }
}
