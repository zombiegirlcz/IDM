package com.revolut.core.ui_kit.drawables;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.animation.PathInterpolator;
import aq0.k;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.Iterator;
import java.util.List;
import kli.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import mx0.w5;
import org.jetbrains.annotations.NotNull;
import sp0.c;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/drawables/AirTipHintAnimationDrawable;", "Lcom/revolut/core/ui_kit/drawables/RevolutDrawableWrapper;", "Companion", "sp0/c", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AirTipHintAnimationDrawable extends RevolutDrawableWrapper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final float[] f55731t = {1.0f, 0.8f, 0.4f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f55733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f55734c;
    public final float d;
    public final float e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PathInterpolator f55735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PathInterpolator f55736h;
    public List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rect f55737j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Bitmap f55738l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Bitmap f55739m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Bitmap f55740n;
    public Canvas o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Paint f55741p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Paint f55742q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ValueAnimator f55743r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f55744s;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.drawables.AirTipHintAnimationDrawable$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AirTipHintAnimationDrawable(Context context, AirTipBackgroundDrawable drawable) {
        super(drawable);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f55732a = context;
        this.f55733b = a.l(context, 2.5f);
        this.f55734c = a.l(context, 1.5f);
        this.d = a.l(context, 24.0f);
        this.e = a.l(context, 30.0f);
        this.f = a.l(context, 56.0f);
        this.f55735g = new PathInterpolator(1.0f, 0.01f, 0.96f, 0.98f);
        this.f55736h = new PathInterpolator(BitmapDescriptorFactory.HUE_RED, 0.03f, 0.39f, 1.0f);
        this.i = f0.f322471a;
        this.f55737j = new Rect();
        this.f55741p = new Paint(3);
        Paint paint = new Paint(3);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.f55742q = paint;
        this.f55744s = -1.0f;
    }

    public static float c(float f, float f4, float f5) {
        return j6.a.a(f4, f, f5, f);
    }

    public final void d() {
        ValueAnimator valueAnimator = this.f55743r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f55744s = BitmapDescriptorFactory.HUE_RED;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(3400L);
        valueAnimatorOfFloat.addUpdateListener(new w5(this, 5));
        valueAnimatorOfFloat.addListener(new k(this, 13));
        valueAnimatorOfFloat.start();
        this.f55743r = valueAnimatorOfFloat;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        Canvas canvas2;
        c cVar;
        float fC;
        float interpolation;
        c cVar2;
        Paint paint = this.f55741p;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.draw(canvas);
        float f = this.f55744s;
        if (f < BitmapDescriptorFactory.HUE_RED || (bitmap = this.f55738l) == null || (bitmap2 = this.f55739m) == null || (bitmap3 = this.f55740n) == null || (canvas2 = this.o) == null) {
            return;
        }
        List list = this.i;
        if (list.size() != 3) {
            return;
        }
        float f4 = f * 3400.0f;
        float[] fArr = f55731t;
        if (f4 <= 1500.0f) {
            interpolation = this.f55735g.getInterpolation(f4 / 1500.0f);
            cVar2 = (c) list.get(0);
            cVar = (c) list.get(1);
            fC = c(fArr[0], fArr[1], interpolation);
        } else if (f4 <= 3000.0f) {
            interpolation = this.f55736h.getInterpolation((f4 - 1500.0f) / 1500.0f);
            cVar2 = (c) list.get(1);
            cVar = (c) list.get(2);
            fC = c(fArr[1], fArr[2], interpolation);
        } else {
            float f5 = f.f(((f4 - 1500.0f) - 1500.0f) / 400.0f, BitmapDescriptorFactory.HUE_RED, 1.0f);
            c cVar3 = (c) list.get(1);
            cVar = (c) list.get(2);
            fC = (1.0f - f5) * fArr[2];
            interpolation = 1.0f;
            cVar2 = cVar3;
        }
        float fC2 = c(cVar2.f264856a, cVar.f264856a, interpolation);
        float fC3 = c(cVar2.f264857b, cVar.f264857b, interpolation);
        float fC4 = c(cVar2.f264858c, cVar.f264858c, interpolation);
        float fC5 = c(cVar2.d, cVar.d, interpolation);
        float fC6 = c(cVar2.e, cVar.e, interpolation);
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        bitmap3.eraseColor(0);
        int iSave = canvas2.save();
        canvas2.translate(fC2 - getBounds().left, fC3 - getBounds().top);
        try {
            canvas2.rotate(fC6);
            canvas2.scale(fC4 / width, fC5 / height);
            paint.setAlpha((int) (fC * 255.0f));
            canvas2.drawBitmap(bitmap, (-width) / 2.0f, (-height) / 2.0f, paint);
            canvas2.restoreToCount(iSave);
            canvas2.drawBitmap(bitmap2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f55742q);
            canvas.drawBitmap(bitmap3, getBounds().left, getBounds().top, (Paint) null);
        } catch (Throwable th10) {
            canvas2.restoreToCount(iSave);
            throw th10;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        List listK;
        Object obj2;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        if (bounds.isEmpty()) {
            return;
        }
        Rect rect = this.f55737j;
        if (!bounds.equals(rect)) {
            rect.set(bounds);
            Rect bounds2 = getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds2, "getBounds(...)");
            boolean zIsEmpty = bounds2.isEmpty();
            Context context = this.f55732a;
            if (zIsEmpty) {
                listK = f0.f322471a;
            } else {
                float fL = a.l(context, 108.0f);
                float fL2 = a.l(context, 111.0f);
                float fL3 = a.l(context, 182.0f);
                float fL4 = a.l(context, 266.0f);
                float fL5 = a.l(context, 147.0f);
                float fHeight = (bounds2.height() * 0.35f) + bounds2.top;
                listK = v.k(new c(bounds2.left - (fL / 2.0f), fHeight, fL, fL2, 30.0f), new c(bounds2.exactCenterX(), a.l(context, -42.0f) + bounds2.top, fL3, fL4, 151.0f), new c((fL5 / 2.0f) + bounds2.right, fHeight, fL5, a.l(context, 156.0f), 60.0f));
            }
            this.i = listK;
            Iterator it8 = listK.iterator();
            if (it8.hasNext()) {
                Object next = it8.next();
                if (it8.hasNext()) {
                    c cVar = (c) next;
                    float fMax = Math.max(cVar.f264858c, cVar.d);
                    do {
                        Object next2 = it8.next();
                        c cVar2 = (c) next2;
                        float fMax2 = Math.max(cVar2.f264858c, cVar2.d);
                        if (Float.compare(fMax, fMax2) < 0) {
                            next = next2;
                            fMax = fMax2;
                        }
                    } while (it8.hasNext());
                }
                obj2 = next;
            } else {
                obj2 = null;
            }
            c cVar3 = (c) obj2;
            if (cVar3 != null) {
                float f = cVar3.d;
                float f4 = cVar3.f264858c;
                float f5 = 2 * this.f;
                int i = (int) (f5 + f4);
                int i2 = (int) (f5 + f);
                if (i > 0 && i2 > 0) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                    Canvas canvasE = ch.qos.logback.core.util.a.e(bitmapCreateBitmap, "createBitmap(...)", bitmapCreateBitmap);
                    Paint paint = new Paint(1);
                    paint.setColor(a.q(context) ? -1 : io0.a.d(0.5f, a.s(R$attr.uikit_colorAirSecondary, context)));
                    paint.setMaskFilter(new BlurMaskFilter(this.e, BlurMaskFilter.Blur.NORMAL));
                    float f6 = i;
                    float f32 = i2;
                    canvasE.drawOval(new RectF((f6 - f4) / 2.0f, (f32 - f) / 2.0f, (f6 + f4) / 2.0f, (f32 + f) / 2.0f), paint);
                    Bitmap bitmap = this.f55738l;
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    this.f55738l = bitmapCreateBitmap;
                }
            }
            int iWidth = bounds.width();
            int iHeight = bounds.height();
            if (iWidth > 0 && iHeight > 0) {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iWidth, iHeight, Bitmap.Config.ARGB_8888);
                Canvas canvasE2 = ch.qos.logback.core.util.a.e(bitmapCreateBitmap2, "createBitmap(...)", bitmapCreateBitmap2);
                Paint paint2 = new Paint(1);
                paint2.setStyle(Paint.Style.STROKE);
                float f35 = this.f55733b;
                paint2.setStrokeWidth(f35);
                paint2.setColor(-1);
                paint2.setMaskFilter(new BlurMaskFilter(this.f55734c, BlurMaskFilter.Blur.NORMAL));
                float f36 = f35 / 2.0f;
                RectF rectF = new RectF(f36, f36, iWidth - f36, iHeight - f36);
                float fMax3 = Math.max(this.d - f36, BitmapDescriptorFactory.HUE_RED);
                canvasE2.drawRoundRect(rectF, fMax3, fMax3, paint2);
                Bitmap bitmap2 = this.f55739m;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                this.f55739m = bitmapCreateBitmap2;
            }
            int iWidth2 = bounds.width();
            int iHeight2 = bounds.height();
            if (iWidth2 > 0 && iHeight2 > 0) {
                Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(iWidth2, iHeight2, Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap3, "createBitmap(...)");
                Bitmap bitmap3 = this.f55740n;
                if (bitmap3 != null) {
                    bitmap3.recycle();
                }
                this.f55740n = bitmapCreateBitmap3;
                this.o = new Canvas(bitmapCreateBitmap3);
            }
        }
        if (!this.k || this.i.isEmpty()) {
            return;
        }
        this.k = false;
        d();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z3) {
        if (!z) {
            this.k = false;
            ValueAnimator valueAnimator = this.f55743r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.f55743r = null;
            this.f55744s = -1.0f;
        }
        return super.setVisible(z, z3);
    }
}
