package com.fourthline.vision.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class h8 {
    @NotNull
    public static final Rect centerCrop(@NotNull Rect rect, @NotNull Rect dstRect, @NotNull Matrix transformMatrix) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Intrinsics.checkNotNullParameter(dstRect, "dstRect");
        Intrinsics.checkNotNullParameter(transformMatrix, "transformMatrix");
        RectF rectF = new RectF();
        transformMatrix.mapRect(rectF, new RectF(rect));
        return ga.toIntRect(rectF);
    }

    public static /* synthetic */ Rect centerCrop$default(Rect rect, Rect rect2, Matrix matrix, int i, Object obj2) {
        if ((i & 2) != 0) {
            matrix = centerCropMatrix(rect, rect2);
        }
        return centerCrop(rect, rect2, matrix);
    }

    @NotNull
    public static final Matrix centerCropMatrix(@NotNull Rect rect, @NotNull Rect dstRect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Intrinsics.checkNotNullParameter(dstRect, "dstRect");
        Matrix matrix = new Matrix();
        float fHeight = dstRect.height() / rect.height();
        float fWidth = dstRect.width() / rect.width();
        if (fHeight < fWidth) {
            fHeight = fWidth;
        }
        matrix.setScale(fHeight, fHeight);
        return matrix;
    }

    @NotNull
    public static final Rect copyAndMapRect(@NotNull Matrix matrix, @NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(matrix, "<this>");
        Intrinsics.checkNotNullParameter(rect, "rect");
        RectF rectF = ga.toRectF(rect);
        matrix.mapRect(rectF);
        return ga.toIntRect(rectF);
    }

    @NotNull
    public static final Rect restore(@NotNull Matrix matrix, @NotNull Rect rectToInvert) {
        Intrinsics.checkNotNullParameter(matrix, "<this>");
        Intrinsics.checkNotNullParameter(rectToInvert, "rectToInvert");
        Matrix matrix2 = new Matrix();
        matrix.invert(matrix2);
        RectF rectF = new RectF(rectToInvert);
        matrix2.mapRect(rectF);
        return ga.toIntRect(rectF);
    }
}
