package com.facebook.shimmer;

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
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import c9.e;
import c9.h;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import j6.a;

/* JADX INFO: loaded from: classes.dex */
public final class ShimmerDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f26149a = new h(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f26150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f26151c;
    public final Matrix d;
    public ValueAnimator e;
    public e f;

    public ShimmerDrawable() {
        Paint paint = new Paint();
        this.f26150b = paint;
        this.f26151c = new Rect();
        this.d = new Matrix();
        paint.setAntiAlias(true);
    }

    public final void a() {
        e eVar;
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator == null || valueAnimator.isStarted() || (eVar = this.f) == null || !eVar.o || getCallback() == null) {
            return;
        }
        this.e.start();
    }

    public final void b(e eVar) {
        boolean zIsStarted;
        this.f = eVar;
        if (eVar != null) {
            this.f26150b.setXfermode(new PorterDuffXfermode(this.f.f22258p ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        d();
        if (this.f != null) {
            ValueAnimator valueAnimator = this.e;
            if (valueAnimator != null) {
                zIsStarted = valueAnimator.isStarted();
                this.e.cancel();
                this.e.removeAllUpdateListeners();
            } else {
                zIsStarted = false;
            }
            e eVar2 = this.f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, (eVar2.f22262t / eVar2.f22261s) + 1.0f);
            this.e = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setRepeatMode(this.f.f22260r);
            this.e.setRepeatCount(this.f.f22259q);
            ValueAnimator valueAnimator2 = this.e;
            e eVar3 = this.f;
            valueAnimator2.setDuration(eVar3.f22261s + eVar3.f22262t);
            this.e.addUpdateListener(this.f26149a);
            if (zIsStarted) {
                this.e.start();
            }
        }
        invalidateSelf();
    }

    public final void c() {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator == null || valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        this.e.cancel();
    }

    public final void d() {
        e eVar;
        Shader radialGradient;
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (iWidth == 0 || iHeight == 0 || (eVar = this.f) == null) {
            return;
        }
        int iRound = eVar.f22252g;
        if (iRound <= 0) {
            iRound = Math.round(eVar.i * iWidth);
        }
        e eVar2 = this.f;
        int iRound2 = eVar2.f22253h;
        if (iRound2 <= 0) {
            iRound2 = Math.round(eVar2.f22254j * iHeight);
        }
        e eVar3 = this.f;
        boolean z = true;
        if (eVar3.f != 1) {
            int i = eVar3.f22251c;
            if (i != 1 && i != 3) {
                z = false;
            }
            if (z) {
                iRound = 0;
            }
            if (!z) {
                iRound2 = 0;
            }
            e eVar4 = this.f;
            radialGradient = new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, iRound, iRound2, eVar4.f22250b, eVar4.f22249a, Shader.TileMode.CLAMP);
        } else {
            float fMax = (float) (((double) Math.max(iRound, iRound2)) / Math.sqrt(2.0d));
            e eVar5 = this.f;
            radialGradient = new RadialGradient(iRound / 2.0f, iRound2 / 2.0f, fMax, eVar5.f22250b, eVar5.f22249a, Shader.TileMode.CLAMP);
        }
        this.f26150b.setShader(radialGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fA;
        float fA2;
        if (this.f != null) {
            Paint paint = this.f26150b;
            if (paint.getShader() == null) {
                return;
            }
            float fTan = (float) Math.tan(Math.toRadians(this.f.f22256m));
            Rect rect = this.f26151c;
            float fWidth = (rect.width() * fTan) + rect.height();
            float fHeight = (fTan * rect.height()) + rect.width();
            ValueAnimator valueAnimator = this.e;
            float f = BitmapDescriptorFactory.HUE_RED;
            float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
            int i = this.f.f22251c;
            if (i != 1) {
                if (i == 2) {
                    fA2 = a.a(-fHeight, fHeight, animatedFraction, fHeight);
                } else if (i != 3) {
                    float f4 = -fHeight;
                    fA2 = a.a(fHeight, f4, animatedFraction, f4);
                } else {
                    fA = a.a(-fWidth, fWidth, animatedFraction, fWidth);
                }
                f = fA2;
                fA = 0.0f;
            } else {
                float f5 = -fWidth;
                fA = a.a(fWidth, f5, animatedFraction, f5);
            }
            Matrix matrix = this.d;
            matrix.reset();
            matrix.setRotate(this.f.f22256m, rect.width() / 2.0f, rect.height() / 2.0f);
            matrix.postTranslate(f, fA);
            paint.getShader().setLocalMatrix(matrix);
            canvas.drawRect(rect, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        e eVar = this.f;
        if (eVar != null) {
            return (eVar.f22257n || eVar.f22258p) ? -3 : -1;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f26151c.set(0, 0, rect.width(), rect.height());
        d();
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
