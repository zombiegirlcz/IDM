package com.fourthline.vision.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class m3 implements p7 {
    @Override // com.fourthline.vision.internal.p7
    @NotNull
    public fa performCorrection(@NotNull fa maskDetectionArea, @NotNull fa contentDetectionArea, @NotNull fa matchArea) {
        Intrinsics.checkNotNullParameter(maskDetectionArea, "maskDetectionArea");
        Intrinsics.checkNotNullParameter(contentDetectionArea, "contentDetectionArea");
        Intrinsics.checkNotNullParameter(matchArea, "matchArea");
        return maskDetectionArea.translate(matchArea.centerX() - contentDetectionArea.centerX(), matchArea.centerY() - contentDetectionArea.centerY());
    }
}
