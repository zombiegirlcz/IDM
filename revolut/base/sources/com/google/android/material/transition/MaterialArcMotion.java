package com.google.android.material.transition;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.transition.PathMotion;

/* JADX INFO: loaded from: classes16.dex */
public final class MaterialArcMotion extends PathMotion {
    private static PointF getControlPoint(float f, float f4, float f5, float f6) {
        return f4 > f6 ? new PointF(f5, f4) : new PointF(f, f6);
    }

    @Override // androidx.transition.PathMotion
    @NonNull
    public Path getPath(float f, float f4, float f5, float f6) {
        Path path = new Path();
        path.moveTo(f, f4);
        PointF controlPoint = getControlPoint(f, f4, f5, f6);
        path.quadTo(controlPoint.x, controlPoint.y, f5, f6);
        return path;
    }
}
