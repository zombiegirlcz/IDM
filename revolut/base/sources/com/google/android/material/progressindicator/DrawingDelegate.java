package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* JADX INFO: loaded from: classes16.dex */
abstract class DrawingDelegate<S extends BaseProgressIndicatorSpec> {
    S spec;

    public static class ActiveIndicator {
        int color;
        float endFraction;
        int gapSize;
        float startFraction;
    }

    public DrawingDelegate(S s2) {
        this.spec = s2;
    }

    public abstract void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, float f, boolean z, boolean z3);

    public abstract void drawStopIndicator(@NonNull Canvas canvas, @NonNull Paint paint, int i, int i2);

    public abstract void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull ActiveIndicator activeIndicator, int i);

    public abstract void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint, float f, float f4, int i, int i2, int i3);

    public abstract int getPreferredHeight();

    public abstract int getPreferredWidth();

    public void validateSpecAndAdjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, float f, boolean z, boolean z3) {
        this.spec.validateSpec();
        adjustCanvas(canvas, rect, f, z, z3);
    }
}
