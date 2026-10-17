package com.fourthline.vision.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class l6 implements p7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f36470a;

    public l6() {
        this(false, 1, null);
    }

    @Override // com.fourthline.vision.internal.p7
    @NotNull
    public fa performCorrection(@NotNull fa maskDetectionArea, @NotNull fa contentDetectionArea, @NotNull fa matchArea) {
        Intrinsics.checkNotNullParameter(maskDetectionArea, "maskDetectionArea");
        Intrinsics.checkNotNullParameter(contentDetectionArea, "contentDetectionArea");
        Intrinsics.checkNotNullParameter(matchArea, "matchArea");
        return contentDetectionArea.translate((this.f36470a ? -1 : 1) * (matchArea.centerX() - contentDetectionArea.centerX()), matchArea.centerY() - contentDetectionArea.centerY());
    }

    public l6(boolean z) {
        this.f36470a = z;
    }

    public /* synthetic */ l6(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
