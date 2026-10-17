package com.revolut.core.ui_kit.internal.shimmer;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import au0.b5;
import au0.l5;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import cs0.a;
import cs0.d;
import cs0.g;
import cs0.h;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/internal/shimmer/RevolutShimmerDrawable;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "cs0/g", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevolutShimmerDrawable extends Drawable {
    public static final /* synthetic */ int k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b5 f56061a = new b5(this, 5);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f56062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f56063c;
    public final Matrix d;
    public boolean e;
    public ValueAnimator f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f56064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Paint f56065h;
    public Paint i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f56066j;

    public RevolutShimmerDrawable() {
        Paint paint = new Paint();
        this.f56062b = paint;
        this.f56063c = new RectF();
        this.d = new Matrix();
        paint.setAntiAlias(true);
    }

    public final void a(a aVar) {
        this.f56064g = aVar;
        if (aVar != null) {
            PorterDuff.Mode mode = aVar.f108419q;
            this.f56062b.setXfermode(mode != null ? new PorterDuffXfermode(mode) : null);
            if (aVar.f108420r) {
                if (this.f56065h == null) {
                    Paint paint = new Paint();
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                    this.f56065h = paint;
                }
                if (this.i == null) {
                    Paint paint2 = new Paint();
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
                    this.i = paint2;
                }
            }
        }
        e(aVar);
        boolean z = this.e;
        c();
        this.f = null;
        if (aVar != null) {
            int i = 2;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, (0 / aVar.f108418p) + 1.0f);
            this.f = valueAnimatorOfFloat;
            LinearInterpolator linearInterpolator = aVar.f108422t;
            if (linearInterpolator != null) {
                valueAnimatorOfFloat.setInterpolator(new g(linearInterpolator, aVar.f108418p));
            }
            valueAnimatorOfFloat.setRepeatMode(aVar.o);
            valueAnimatorOfFloat.setRepeatCount(aVar.f108417n);
            valueAnimatorOfFloat.setDuration(aVar.f108418p);
            valueAnimatorOfFloat.addUpdateListener(this.f56061a);
            valueAnimatorOfFloat.addListener(new l5(this, i));
            if (z || aVar.f108416m) {
                b();
            }
        }
        invalidateSelf();
    }

    public final void b() {
        this.e = true;
        this.f56066j = true;
        d();
    }

    public final void c() {
        this.e = false;
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        valueAnimator.cancel();
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f;
        if (!isVisible() || this.f56062b.getAlpha() == 0) {
            if (valueAnimator != null) {
                valueAnimator.pause();
            }
        } else {
            if (valueAnimator == null || !this.e) {
                return;
            }
            if (!valueAnimator.isStarted()) {
                valueAnimator.start();
            } else if (valueAnimator.isPaused()) {
                valueAnimator.resume();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fA;
        float fA2;
        Matrix matrix;
        Paint paint;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        a aVar = this.f56064g;
        if (aVar != null) {
            Paint paint2 = this.f56062b;
            if (paint2.getShader() != null) {
                RectF rectF = this.f56063c;
                if (rectF.isEmpty()) {
                    return;
                }
                float f = aVar.f108415l;
                float fWidth = (rectF.width() * f) + rectF.height();
                float fHeight = (rectF.height() * f) + rectF.width();
                ValueAnimator valueAnimator = this.f;
                Object animatedValue = valueAnimator != null ? valueAnimator.getAnimatedValue() : null;
                Float f4 = animatedValue instanceof Float ? (Float) animatedValue : null;
                float f5 = BitmapDescriptorFactory.HUE_RED;
                float fFloatValue = f4 != null ? f4.floatValue() : 0.0f;
                int i = h.f108427a[aVar.f108411c.ordinal()];
                if (i == 1) {
                    float f6 = -fHeight;
                    fA = j6.a.a(fHeight, f6, fFloatValue, f6);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            float f32 = -fWidth;
                            fA2 = j6.a.a(fWidth, f32, fFloatValue, f32);
                        } else {
                            if (i != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            fA2 = j6.a.a(-fWidth, fWidth, fFloatValue, fWidth);
                        }
                        matrix = this.d;
                        matrix.reset();
                        matrix.setRotate(aVar.k, rectF.width() / 2.0f, rectF.height() / 2.0f);
                        matrix.postTranslate(f5, fA2);
                        paint2.getShader().setLocalMatrix(matrix);
                        if (this.f56066j && (paint = this.f56065h) != null) {
                            paint.getShader().setLocalMatrix(matrix);
                            float f35 = aVar.f108421s;
                            canvas.drawRoundRect(rectF, f35, f35, paint);
                        }
                        float f36 = aVar.f108421s;
                        canvas.drawRoundRect(rectF, f36, f36, paint2);
                    }
                    fA = j6.a.a(-fHeight, fHeight, fFloatValue, fHeight);
                }
                float f37 = fA;
                fA2 = 0.0f;
                f5 = f37;
                matrix = this.d;
                matrix.reset();
                matrix.setRotate(aVar.k, rectF.width() / 2.0f, rectF.height() / 2.0f);
                matrix.postTranslate(f5, fA2);
                paint2.getShader().setLocalMatrix(matrix);
                if (this.f56066j) {
                    paint.getShader().setLocalMatrix(matrix);
                    float f352 = aVar.f108421s;
                    canvas.drawRoundRect(rectF, f352, f352, paint);
                }
                float f362 = aVar.f108421s;
                canvas.drawRoundRect(rectF, f362, f362, paint2);
            }
        }
    }

    public final void e(a aVar) {
        Shader linearGradient;
        Shader radialGradient;
        Rect bounds = getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (iWidth == 0 || iHeight == 0 || aVar == null) {
            return;
        }
        int iRound = Math.round(aVar.f108412g * iWidth);
        int iRound2 = Math.round(aVar.f108413h * iHeight);
        Paint paint = this.f56065h;
        int i = h.f108428b[aVar.f.ordinal()];
        boolean z = true;
        if (i == 1) {
            float f = iRound / 2.0f;
            float f4 = iRound2 / 2.0f;
            double d = 2.0f;
            float fMax = Math.max(iRound, iRound2) / ((float) Math.sqrt(d));
            int[] iArr = aVar.f108410b;
            float[] fArr = aVar.f108409a;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            RadialGradient radialGradient2 = new RadialGradient(f, f4, fMax, iArr, fArr, tileMode);
            if (paint != null) {
                radialGradient = new RadialGradient(f, f4, Math.max(iRound, iRound2) / ((float) Math.sqrt(d)), new int[]{-1, -1, -1, 0}, aVar.f108409a, tileMode);
                linearGradient = radialGradient2;
            } else {
                linearGradient = radialGradient2;
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            d dVar = aVar.f108411c;
            if (dVar != d.TOP_TO_BOTTOM && dVar != d.BOTTOM_TO_TOP) {
                z = false;
            }
            if (z) {
                iRound = 0;
            }
            if (!z) {
                iRound2 = 0;
            }
            float f5 = iRound;
            float f6 = iRound2;
            int[] iArr2 = aVar.f108410b;
            float[] fArr2 = aVar.f108409a;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            linearGradient = new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f5, f6, iArr2, fArr2, tileMode2);
            radialGradient = paint != null ? new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f5, f6, new int[]{-1, 0}, new float[]{0.5f, 1.0f}, tileMode2) : null;
        }
        this.f56062b.setShader(linearGradient);
        if (paint != null) {
            paint.setShader(radialGradient);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f56062b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.f56063c.set(bounds);
        e(this.f56064g);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.f56062b;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            d();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z3) {
        boolean visible = super.setVisible(z, z3);
        d();
        return visible;
    }
}
