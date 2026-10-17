package com.fourthline.vision.internal;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class b2 {
    private static final void applyMatrixRotation(Matrix matrix, od odVar, int i) {
        if (i == 90) {
            matrix.postRotate(270.0f);
            matrix.postTranslate(BitmapDescriptorFactory.HUE_RED, odVar.getWidth());
        } else if (i == 180) {
            matrix.postRotate(180.0f, odVar.getWidth() / 2.0f, odVar.getHeight() / 2.0f);
        } else {
            if (i != 270) {
                return;
            }
            matrix.postRotate(90.0f);
            matrix.postTranslate(odVar.getHeight(), BitmapDescriptorFactory.HUE_RED);
        }
    }

    private static final void configureTransformationMatrix(Matrix matrix, od odVar, od odVar2, int i) {
        float height;
        float height2;
        if (i != 0 && i != 180) {
            odVar2 = new od(odVar2.getHeight(), odVar2.getWidth());
        }
        float width = odVar.getWidth() / odVar.getHeight();
        float width2 = odVar2.getWidth() / odVar2.getHeight();
        float width3 = BitmapDescriptorFactory.HUE_RED;
        if (width2 < width) {
            height = odVar.getWidth() / odVar2.getWidth();
            height2 = (odVar.getHeight() - (odVar2.getHeight() * height)) / 2;
        } else {
            height = odVar.getHeight() / odVar2.getHeight();
            width3 = (odVar.getWidth() - (odVar2.getWidth() * height)) / 2;
            height2 = 0.0f;
        }
        float f = 1 / height;
        matrix.setScale(f, f);
        matrix.postTranslate((-width3) / height, (-height2) / height);
        applyMatrixRotation(matrix, odVar2, i);
    }

    @NotNull
    public static final Matrix createTargetToScreenMatrix(@NotNull od screenSize, @NotNull od cameraResolution, int i, boolean z) {
        Intrinsics.checkNotNullParameter(screenSize, "screenSize");
        Intrinsics.checkNotNullParameter(cameraResolution, "cameraResolution");
        Matrix matrix = new Matrix();
        configureTransformationMatrix(matrix, screenSize, cameraResolution, i);
        matrix.invert(matrix);
        if (z) {
            matrix.postScale(-1.0f, 1.0f, screenSize.getWidth() / 2.0f, screenSize.getHeight() / 2.0f);
        }
        return matrix;
    }

    private static final od rotateAroundCamera(od odVar, int i) {
        return new od((i == 0 || i == 180) ? odVar.getWidth() : odVar.getHeight(), (i == 0 || i == 180) ? odVar.getHeight() : odVar.getWidth());
    }

    @NotNull
    public static final fa translateScreenToTarget(@NotNull fa rect, @NotNull od screenSize, @NotNull od cameraResolution, int i, boolean z) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(screenSize, "screenSize");
        Intrinsics.checkNotNullParameter(cameraResolution, "cameraResolution");
        if (z) {
            return translateScreenToTargetWithMatrix(rect, screenSize, cameraResolution, i);
        }
        a2 a2VarTranslateScreenToTarget = translateScreenToTarget(new a2(rect.getLeft(), rect.getTop()), screenSize, cameraResolution, i, false);
        a2 a2VarTranslateScreenToTarget2 = translateScreenToTarget(new a2(rect.getRight(), rect.getBottom()), screenSize, cameraResolution, i, false);
        return new fa(Math.min(a2VarTranslateScreenToTarget.getX(), a2VarTranslateScreenToTarget2.getX()), Math.min(a2VarTranslateScreenToTarget.getY(), a2VarTranslateScreenToTarget2.getY()), Math.max(a2VarTranslateScreenToTarget.getX(), a2VarTranslateScreenToTarget2.getX()), Math.max(a2VarTranslateScreenToTarget.getY(), a2VarTranslateScreenToTarget2.getY()));
    }

    public static /* synthetic */ fa translateScreenToTarget$default(fa faVar, od odVar, od odVar2, int i, boolean z, int i2, Object obj2) {
        if ((i2 & 16) != 0) {
            z = false;
        }
        return translateScreenToTarget(faVar, odVar, odVar2, i, z);
    }

    private static final a2 translateScreenToTargetManually(a2 a2Var, od odVar, od odVar2) {
        yhm.r rVar;
        Float fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        if (odVar2.getWidth() / odVar2.getHeight() < odVar.getWidth() / odVar.getHeight()) {
            float width = odVar.getWidth() / odVar2.getWidth();
            rVar = new yhm.r(fValueOf, Float.valueOf((odVar.getHeight() - (odVar2.getHeight() * width)) / 2), Float.valueOf(width));
        } else {
            float height = odVar.getHeight() / odVar2.getHeight();
            rVar = new yhm.r(Float.valueOf((odVar.getWidth() - (odVar2.getWidth() * height)) / 2), fValueOf, Float.valueOf(height));
        }
        float fFloatValue = ((Number) rVar.f314201a).floatValue();
        float fFloatValue2 = ((Number) rVar.f314202b).floatValue();
        float fFloatValue3 = ((Number) rVar.f314203c).floatValue();
        return new a2((int) ((a2Var.getX() - fFloatValue) / fFloatValue3), (int) ((a2Var.getY() - fFloatValue2) / fFloatValue3));
    }

    @NotNull
    public static final fa translateScreenToTargetWithMatrix(@NotNull fa rect, @NotNull od screenSize, @NotNull od cameraResolution, int i) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(screenSize, "screenSize");
        Intrinsics.checkNotNullParameter(cameraResolution, "cameraResolution");
        Matrix matrix = new Matrix();
        configureTransformationMatrix(matrix, screenSize, cameraResolution, i);
        RectF rectF = new RectF(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        matrix.mapRect(rectF);
        return ga.toRectangle(rectF);
    }

    public static /* synthetic */ a2 translateScreenToTargetWithMatrix$default(a2 a2Var, od odVar, od odVar2, int i, int i2, Object obj2) {
        if ((i2 & 8) != 0) {
            i = 0;
        }
        return translateScreenToTargetWithMatrix(a2Var, odVar, odVar2, i);
    }

    @NotNull
    public static final fa translateTargetToScreen(@NotNull fa rect, @NotNull od screenSize, @NotNull od cameraResolution, int i, boolean z) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        Intrinsics.checkNotNullParameter(screenSize, "screenSize");
        Intrinsics.checkNotNullParameter(cameraResolution, "cameraResolution");
        Matrix matrixCreateTargetToScreenMatrix = createTargetToScreenMatrix(screenSize, cameraResolution, i, z);
        RectF rectF = new RectF(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
        matrixCreateTargetToScreenMatrix.mapRect(rectF);
        return ga.toRectangle(rectF);
    }

    public static /* synthetic */ a2 translateScreenToTarget$default(a2 a2Var, od odVar, od odVar2, int i, boolean z, int i2, Object obj2) {
        if ((i2 & 8) != 0) {
            i = 0;
        }
        if ((i2 & 16) != 0) {
            z = false;
        }
        return translateScreenToTarget(a2Var, odVar, odVar2, i, z);
    }

    private static final a2 rotateAroundCamera(a2 a2Var, od odVar, int i) {
        if (i == 90) {
            return new a2(a2Var.getY(), odVar.getWidth() - a2Var.getX());
        }
        if (i != 180) {
            return i != 270 ? a2Var : new a2(odVar.getHeight() - a2Var.getY(), a2Var.getX());
        }
        return new a2(odVar.getWidth() - a2Var.getX(), odVar.getHeight() - a2Var.getY());
    }

    @NotNull
    public static final a2 translateScreenToTargetWithMatrix(@NotNull a2 coordinate, @NotNull od screenSize, @NotNull od cameraResolution, int i) {
        Intrinsics.checkNotNullParameter(coordinate, "coordinate");
        Intrinsics.checkNotNullParameter(screenSize, "screenSize");
        Intrinsics.checkNotNullParameter(cameraResolution, "cameraResolution");
        Matrix matrix = new Matrix();
        configureTransformationMatrix(matrix, screenSize, cameraResolution, i);
        float[] fArr = {coordinate.getX(), coordinate.getY()};
        matrix.mapPoints(fArr);
        return new a2((int) fArr[0], (int) fArr[1]);
    }

    @NotNull
    public static final a2 translateScreenToTarget(@NotNull a2 coordinate, @NotNull od screenSize, @NotNull od cameraResolution, int i, boolean z) {
        Intrinsics.checkNotNullParameter(coordinate, "coordinate");
        Intrinsics.checkNotNullParameter(screenSize, "screenSize");
        Intrinsics.checkNotNullParameter(cameraResolution, "cameraResolution");
        if (z) {
            return translateScreenToTargetWithMatrix(coordinate, screenSize, cameraResolution, i);
        }
        return translateScreenToTargetManually(rotateAroundCamera(coordinate, screenSize, i), rotateAroundCamera(screenSize, i), cameraResolution);
    }
}
