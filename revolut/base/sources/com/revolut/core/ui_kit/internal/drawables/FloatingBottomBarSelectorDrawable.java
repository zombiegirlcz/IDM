package com.revolut.core.ui_kit.internal.drawables;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import au0.b5;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import dr0.p;
import ix0.i1;
import jo0.g;
import jq0.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/internal/drawables/FloatingBottomBarSelectorDrawable;", "Landroid/graphics/drawable/Drawable;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FloatingBottomBarSelectorDrawable extends Drawable {
    public static final /* synthetic */ int A = 0;

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f55975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f55976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f55977c;
    public final Matrix d;
    public final RectF e;
    public final RectF f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RectF f55978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RectF f55979h;
    public final RectF i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f55980j;
    public final float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f55981l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f55982m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RadialGradient f55983n;
    public ValueAnimator o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f55984p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f55985q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f55986r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f55987s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f55988t;
    public ValueAnimator u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f55989w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f55990x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public View f55991y;
    public final androidx.camera.viewfinder.a z;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
    public FloatingBottomBarSelectorDrawable(ViewGroup contentView) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.f55975a = contentView;
        Paint paintC = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        Paint.Style style = Paint.Style.FILL;
        paintC.setStyle(style);
        Context context = contentView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        paintC.setColor(kli.a.s(R$attr.uikit_colorGreyTone8, context));
        this.f55976b = paintC;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(style);
        if (Build.VERSION.SDK_INT >= 29) {
            BlendMode unused = BlendMode.PLUS;
            paint.setBlendMode(BlendMode.PLUS);
        } else {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.ADD));
        }
        this.f55977c = paint;
        this.d = new Matrix();
        this.e = new RectF();
        this.f = new RectF();
        this.f55978g = new RectF();
        this.f55979h = new RectF();
        this.i = new RectF();
        Context context2 = contentView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f55980j = kli.a.l(context2, 4.0f);
        Context context3 = contentView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.k = kli.a.l(context3, 2.0f);
        Context context4 = contentView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        this.f55981l = kli.a.l(context4, 4.0f);
        this.f55982m = ((Boolean) g.u.getValue()).booleanValue();
        this.f55985q = 1.0f;
        this.f55986r = 1.0f;
        this.f55987s = 255;
        this.f55988t = -1;
        this.f55989w = -1;
        this.z = new androidx.camera.viewfinder.a(this, 5);
    }

    public static final float a(FloatingBottomBarSelectorDrawable floatingBottomBarSelectorDrawable, float f, float f4) {
        return f <= 0.3f ? i1.b(1.0f, f4, r.d.getInterpolation(jq0.a.d(f, 0.3f))) : i1.b(f4, 1.0f, r.d.getInterpolation(jq0.a.c(f, 0.3f)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void b(float f, long j2) {
        if (!((Boolean) g.J.getValue()).booleanValue()) {
            ValueAnimator valueAnimator = this.o;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f55984p = f;
            invalidateSelf();
            return;
        }
        ValueAnimator valueAnimator2 = this.o;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        float f4 = this.f55984p;
        if (f4 == f) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f4, f);
        valueAnimatorOfFloat.setDuration(j2);
        valueAnimatorOfFloat.setInterpolator(r.f177393b);
        valueAnimatorOfFloat.addUpdateListener(new b5(this, 9));
        valueAnimatorOfFloat.start();
        this.o = valueAnimatorOfFloat;
    }

    public final void c() {
        View view = this.f55991y;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.z);
        }
        this.f55991y = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void d() {
        if (((Boolean) g.J.getValue()).booleanValue()) {
            b(1.0f, 200L);
        }
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        View childAt;
        RectF rectF;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        boolean z = this.f55990x;
        ViewGroup viewGroup = this.f55975a;
        if (z) {
            rectF = this.i;
        } else {
            ValueAnimator valueAnimator = this.u;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        childAt = null;
                        break;
                    }
                    childAt = viewGroup.getChildAt(i);
                    Intrinsics.h(childAt);
                    if (childAt.isSelected()) {
                        break;
                    } else {
                        i++;
                    }
                }
                int iIndexOfChild = childAt != null ? viewGroup.indexOfChild(childAt) : -1;
                if (childAt == null) {
                    rectF = null;
                } else {
                    RectF rectF2 = this.e;
                    if (rectF2.isEmpty()) {
                        if (f(childAt)) {
                            this.f55988t = iIndexOfChild;
                        }
                        rectF = null;
                    } else if (iIndexOfChild == this.f55988t) {
                        f(childAt);
                    }
                    rectF = rectF2;
                }
            } else {
                rectF = this.f55979h;
            }
        }
        if (rectF == null || rectF.isEmpty()) {
            return;
        }
        if (((Boolean) g.J.getValue()).booleanValue() && this.f55984p > BitmapDescriptorFactory.HUE_RED) {
            RadialGradient radialGradient = this.f55983n;
            Paint paint = this.f55977c;
            if (radialGradient == null) {
                Context context = viewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                RadialGradient radialGradient2 = new RadialGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, new int[]{io0.a.b(kli.a.q(context) ? 0.15f : 0.45f, -1), io0.a.b(0.0075f, -1)}, (float[]) null, Shader.TileMode.CLAMP);
                this.f55983n = radialGradient2;
                paint.setShader(radialGradient2);
            }
            RadialGradient radialGradient3 = this.f55983n;
            if (radialGradient3 != null) {
                float fWidth = getBounds().width();
                Matrix matrix = this.d;
                matrix.setScale(fWidth, fWidth);
                matrix.postTranslate(rectF.centerX(), getBounds().exactCenterY());
                radialGradient3.setLocalMatrix(matrix);
            }
            paint.setAlpha((int) (this.f55984p * this.f55987s));
            canvas.drawRect(getBounds(), paint);
        }
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, this.f55976b);
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, kotlin.Lazy] */
    public final void e(int i, int i2, boolean z) {
        ValueAnimator valueAnimator = this.u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z3 = false;
        this.v = false;
        if (z && ((Boolean) g.J.getValue()).booleanValue()) {
            z3 = true;
        }
        int childCount = this.f55975a.getChildCount() - 1;
        float f = BitmapDescriptorFactory.HUE_RED;
        if (z3 && i >= 0 && i2 >= 0 && childCount > 0) {
            f = f.f(Math.abs(i2 - i) / childCount, BitmapDescriptorFactory.HUE_RED, 1.0f);
        }
        float f4 = f * f * f;
        this.f55985q = i1.b(1.0f, 1.6f, f4);
        this.f55986r = i1.b(1.0f, 0.96f, f4);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        p pVar = new p(valueAnimatorOfFloat, this, i2);
        valueAnimatorOfFloat.addListener(pVar);
        valueAnimatorOfFloat.addUpdateListener(pVar);
        valueAnimatorOfFloat.start();
        this.u = valueAnimatorOfFloat;
    }

    public final boolean f(View view) {
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return false;
        }
        float left = view.getLeft();
        float top = view.getTop();
        float right = view.getRight();
        float bottom = view.getBottom();
        RectF rectF = this.e;
        rectF.set(left, top, right, bottom);
        rectF.inset(BitmapDescriptorFactory.HUE_RED, this.f55980j);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f55987s;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f55987s = i;
        this.f55976b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f55976b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
