package com.revolut.core.ui_kit.drawables;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.shimmer.RevolutShimmerDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.HexagonalTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.image.transformation.MaskTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.MirrorTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.RoundedRectTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ShapeTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.SquareTransformation;
import com.revolut.core.ui_kit_resources.R$attr;
import ix0.r0;
import kli.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yp0.a0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/ui_kit/drawables/ShimmerImageDrawable;", "Lcom/revolut/core/ui_kit/drawables/RevolutDrawableWrapper;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShimmerImageDrawable extends RevolutDrawableWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageTransformations f55783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f55784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f55785c;
    public final int[] d;
    public final RectF e;
    public final Path f;

    public ShimmerImageDrawable(Context context, ImageTransformations imageTransformations, int i) {
        RevolutShimmerDrawable shimmerDrawable = new RevolutShimmerDrawable();
        shimmerDrawable.a(a0.a(context));
        int[] bgGradientColors = {a.s(R$attr.uikit_colorGreyTone20, context), a.s(R$attr.uikit_colorGreyTone5, context)};
        imageTransformations = (i & 8) != 0 ? null : imageTransformations;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(shimmerDrawable, "shimmerDrawable");
        Intrinsics.checkNotNullParameter(bgGradientColors, "bgGradientColors");
        super(shimmerDrawable);
        this.f55783a = imageTransformations;
        this.f55784b = context.getResources().getDisplayMetrics().density;
        this.f55785c = new Paint(1);
        int length = bgGradientColors.length;
        if (length == 0) {
            bgGradientColors = new int[]{a.s(R$attr.uikit_colorTransparent, context), a.s(R$attr.uikit_colorTransparent, context)};
        } else if (length == 1) {
            bgGradientColors = new int[]{bgGradientColors[0], bgGradientColors[0]};
        }
        this.d = bgGradientColors;
        this.e = new RectF();
        this.f = new Path();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int iSave = canvas.save();
        ImageTransformations imageTransformations = this.f55783a;
        ShapeTransformation shapeTransformation = imageTransformations != null ? imageTransformations.f60064b : null;
        boolean z = shapeTransformation instanceof CircleTransformation;
        Path path = this.f;
        if (z || (shapeTransformation instanceof RoundedRectTransformation) || (shapeTransformation instanceof SquareTransformation) || (shapeTransformation instanceof HexagonalTransformation)) {
            canvas.clipPath(path);
        } else if (!(shapeTransformation instanceof MirrorTransformation) && !(shapeTransformation instanceof MaskTransformation) && shapeTransformation != null) {
            throw new NoWhenBranchMatchedException();
        }
        Paint paint = this.f55785c;
        if (paint.getShader() == null) {
            canvas2 = canvas;
        } else {
            float fWidth = getBounds().width();
            float fHeight = getBounds().height();
            canvas.save();
            canvas.translate(getBounds().left, getBounds().top);
            canvas2 = canvas;
            canvas2.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fWidth, fHeight, paint);
            canvas2.restore();
        }
        super.draw(canvas2);
        canvas2.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        float fWidth = getBounds().width();
        float fHeight = getBounds().height();
        Paint paint = this.f55785c;
        if (fWidth <= BitmapDescriptorFactory.HUE_RED || fHeight <= BitmapDescriptorFactory.HUE_RED || this.d.length == 0) {
            paint.setShader(null);
        } else {
            paint.setShader(new LinearGradient(BitmapDescriptorFactory.HUE_RED, fHeight, fWidth, BitmapDescriptorFactory.HUE_RED, this.d, (float[]) null, Shader.TileMode.CLAMP));
        }
        Rect bounds2 = getBounds();
        RectF bounds3 = this.e;
        bounds3.set(bounds2);
        Path path = this.f;
        path.reset();
        ImageTransformations imageTransformations = this.f55783a;
        ShapeTransformation shapeTransformation = imageTransformations != null ? imageTransformations.f60064b : null;
        if (shapeTransformation instanceof CircleTransformation) {
            path.addCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, Path.Direction.CW);
            return;
        }
        boolean z = shapeTransformation instanceof RoundedRectTransformation;
        float f = this.f55784b;
        if (z) {
            float f4 = ((RoundedRectTransformation) shapeTransformation).f60071a * f;
            path.addRoundRect(bounds3, f4, f4, Path.Direction.CW);
            return;
        }
        if (shapeTransformation instanceof SquareTransformation) {
            float fIntValue = (imageTransformations.e != null ? r0.intValue() : 0) * f;
            path.addRoundRect(bounds3, fIntValue, fIntValue, Path.Direction.CW);
        } else {
            if (shapeTransformation instanceof HexagonalTransformation) {
                Intrinsics.checkNotNullParameter(bounds3, "bounds");
                Path path2 = new Path();
                r0.a(bounds3, path2);
                path.addPath(path2);
                return;
            }
            if (!(shapeTransformation instanceof MaskTransformation) && !Intrinsics.f(shapeTransformation, MirrorTransformation.f60070a) && shapeTransformation != null) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        super.setAlpha(i);
        this.f55785c.setAlpha(i);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
