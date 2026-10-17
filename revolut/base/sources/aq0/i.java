package aq0;

import android.graphics.Matrix;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f8225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8226b;

    public i(float f, Matrix contentToViewportMatrix) {
        Intrinsics.checkNotNullParameter(contentToViewportMatrix, "contentToViewportMatrix");
        this.f8225a = contentToViewportMatrix;
        this.f8226b = f;
    }
}
