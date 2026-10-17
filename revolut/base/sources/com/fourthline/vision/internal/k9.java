package com.fourthline.vision.internal;

import android.util.Size;
import com.fourthline.vision.internal.e3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class k9 implements h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h3[] f36452a;

    public k9(@NotNull h3... detectionCorrectors) {
        Intrinsics.checkNotNullParameter(detectionCorrectors, "detectionCorrectors");
        this.f36452a = detectionCorrectors;
    }

    @Override // com.fourthline.vision.internal.h3
    @NotNull
    public e3.c correct(@NotNull e3.c source, @NotNull Size detectionArea) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(detectionArea, "detectionArea");
        for (h3 h3Var : this.f36452a) {
            source = h3Var.correct(source, detectionArea);
        }
        return source;
    }
}
