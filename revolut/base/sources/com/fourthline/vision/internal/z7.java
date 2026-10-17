package com.fourthline.vision.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class z7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final df f37184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Matrix f37185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f37186c;
    private final Rect d;
    private Rect e;
    private final Rect f;

    public z7(@NotNull df visionInfoProvider) {
        Intrinsics.checkNotNullParameter(visionInfoProvider, "visionInfoProvider");
        this.f37184a = visionInfoProvider;
        this.f37185b = new Matrix();
        this.f37186c = new Rect();
        this.d = new Rect();
        this.e = new Rect();
        this.f = new Rect();
    }

    @NotNull
    public final Rect getCameraPreviewRect$fourthline_vision_release() {
        return this.d;
    }

    @NotNull
    public final Rect getPreviewHolderScreenRect$fourthline_vision_release() {
        return this.e;
    }

    @NotNull
    public final Matrix getRecognitionToScreenCoordsMatrixAndTranslation$fourthline_vision_release() {
        return this.f37185b;
    }

    @NotNull
    public final Rect getScreenRect$fourthline_vision_release() {
        return this.f37186c;
    }

    public final void setPreviewHolderScreenRect$fourthline_vision_release(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<set-?>");
        this.e = rect;
    }

    public final void setRecognitionToScreenCoordsMatrixAndTranslation$fourthline_vision_release(@NotNull Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "<set-?>");
        this.f37185b = matrix;
    }

    public final void setupTransformations(int i, int i2) {
        Size imageReaderSize = this.f37184a.getImageReaderSize();
        Size previewSize = this.f37184a.getPreviewSize();
        boolean zIsPortrait = ef.isPortrait(this.f37184a);
        this.f37186c.set(0, 0, i, i2);
        this.d.set(0, 0, zIsPortrait ? previewSize.getWidth() : previewSize.getHeight(), zIsPortrait ? previewSize.getHeight() : previewSize.getWidth());
        this.f.set(0, 0, zIsPortrait ? imageReaderSize.getWidth() : imageReaderSize.getHeight(), zIsPortrait ? imageReaderSize.getHeight() : imageReaderSize.getWidth());
        this.e = h8.centerCrop$default(this.f, this.f37186c, null, 2, null);
        this.f37185b = h8.centerCropMatrix(this.f, this.f37186c);
        if (z7.class.isAnonymousClass()) {
            String name = z7.class.getName();
            if (name.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        }
        Objects.toString(this.f37186c);
        if (z7.class.isAnonymousClass()) {
            String name2 = z7.class.getName();
            if (name2.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name2.substring(name2.length() - 23, name2.length()), "substring(...)");
            }
        }
        Objects.toString(this.e);
        if (z7.class.isAnonymousClass()) {
            String name3 = z7.class.getName();
            if (name3.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name3.substring(name3.length() - 23, name3.length()), "substring(...)");
            }
        }
        Objects.toString(this.d);
        if (z7.class.isAnonymousClass()) {
            String name4 = z7.class.getName();
            if (name4.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name4.substring(name4.length() - 23, name4.length()), "substring(...)");
            }
        }
        Objects.toString(this.f);
        if (z7.class.isAnonymousClass()) {
            String name5 = z7.class.getName();
            if (name5.length() > 23) {
                Intrinsics.checkNotNullExpressionValue(name5.substring(name5.length() - 23, name5.length()), "substring(...)");
            }
        }
        Objects.toString(this.f37185b);
    }
}
