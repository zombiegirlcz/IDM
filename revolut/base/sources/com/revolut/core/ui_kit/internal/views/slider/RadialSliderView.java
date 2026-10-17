package com.revolut.core.ui_kit.internal.views.slider;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextPresentation;
import com.revolut.core.ui_kit_resources.R$attr;
import io3.h;
import java.util.List;
import jb3.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ms0.c;
import org.jetbrains.annotations.NotNull;
import os9.f;
import rim.d;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0001\u0018\u0000 %2\u00020\u0001:\u0003\u0017&\u0010B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR.\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001c\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u000eR*\u0010$\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/slider/RadialSliderView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enabled", "", "setEnabled", "(Z)V", "Lkotlin/Function1;", "a", "Lkotlin/jvm/functions/Function1;", "getMultiplierChangeListener", "()Lkotlin/jvm/functions/Function1;", "setMultiplierChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "multiplierChangeListener", "b", "Z", "getZeroSelectable", "()Z", "setZeroSelectable", "zeroSelectable", "value", "c", "I", "getMultiplier", "()I", "setMultiplier", "(I)V", "multiplier", "Companion", "ou0/b", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RadialSliderView extends FrameLayout {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f57534q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public Function1 multiplierChangeListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean zeroSelectable;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int multiplier;
    public boolean d;
    public final b e;
    public final Rect f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f57538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f57539h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f57540j;
    public final ou0.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Paint f57541l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Paint f57542m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Paint f57543n;
    public final Paint o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f57544p;

    public static final class a {
        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RectF f57545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f57546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f57547c;
        public float d;
        public float e;
        public float f;

        public b() {
            this(0);
        }

        public b(int i) {
            RectF drawRect = new RectF();
            Intrinsics.checkNotNullParameter(drawRect, "drawRect");
            this.f57545a = drawRect;
            this.f57546b = BitmapDescriptorFactory.HUE_RED;
            this.f57547c = BitmapDescriptorFactory.HUE_RED;
            this.d = BitmapDescriptorFactory.HUE_RED;
            this.e = BitmapDescriptorFactory.HUE_RED;
            this.f = BitmapDescriptorFactory.HUE_RED;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadialSliderView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        float width = getWidth();
        float f = 2;
        float f4 = (width - (width / 1.03f)) / f;
        float height = getHeight();
        float f5 = (height - (height / 1.03f)) / f;
        b bVar = this.e;
        RectF rectF = bVar.f57545a;
        rectF.left = f4;
        rectF.top = f5;
        rectF.right = width - f4;
        rectF.bottom = height - f5;
        float f6 = this.f57539h;
        rectF.inset(f6, f6);
        RectF rectF2 = bVar.f57545a;
        bVar.f57546b = (rectF2.width() / f) + rectF2.left;
        bVar.f57547c = (rectF2.height() / f) + rectF2.top;
        float fWidth = rectF2.width() / f;
        bVar.f = fWidth;
        bVar.e = fWidth + f6;
        bVar.d = fWidth - f6;
        this.d = false;
    }

    public final void b(Canvas canvas, float f, float f4) {
        double radians = (float) Math.toRadians(f);
        float fCos = (float) Math.cos(radians);
        b bVar = this.e;
        canvas.drawCircle((fCos * bVar.f) + bVar.f57546b, (((float) Math.sin(radians)) * bVar.f) + bVar.f57547c, f4 / 2.0f, this.f57543n);
    }

    public final void c(float f, Canvas canvas) {
        String strValueOf = String.valueOf((int) ((90 + f) / this.f57538g));
        float radians = (float) Math.toRadians(f);
        b bVar = this.e;
        float f4 = bVar.f;
        double d = radians;
        float fCos = (((float) Math.cos(d)) * f4) + bVar.f57546b;
        float fSin = (((float) Math.sin(d)) * f4) + bVar.f57547c;
        int length = strValueOf.length();
        Paint paint = this.o;
        Rect rect = this.f;
        paint.getTextBounds(strValueOf, 0, length, rect);
        float fWidth = rect.width();
        float fHeight = rect.height();
        canvas.save();
        float f5 = 2;
        canvas.translate((-fWidth) / f5, fHeight / f5);
        canvas.drawText(strValueOf, fCos, fSin, paint);
        canvas.restore();
    }

    public final void d(float f, float f4) {
        b bVar = this.e;
        double degrees = Math.toDegrees((float) Math.atan2(f4 - bVar.f57547c, f - bVar.f57546b)) + ((double) 90);
        if (degrees < 0.0d) {
            degrees += (double) 360;
        }
        int iB = d.b(degrees / ((double) this.f57538g));
        boolean z = this.multiplier != iB;
        setMultiplier(iB);
        if (z) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (h.m(context)) {
                performHapticFeedback(4);
            }
        }
    }

    public final void e() {
        this.f57544p.setTextPresentation(new TextPresentation.Animated(new TextClause(a0.d.n("x", this.multiplier), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)));
    }

    public final int getMultiplier() {
        return this.multiplier;
    }

    @NotNull
    public final Function1<Integer, Unit> getMultiplierChangeListener() {
        return this.multiplierChangeListener;
    }

    public final boolean getZeroSelectable() {
        return this.zeroSelectable;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.d) {
            a();
        }
        float f = this.multiplier;
        float f4 = this.f57538g;
        float f5 = f4 * f;
        b bVar = this.e;
        RectF rectF = bVar.f57545a;
        RectF rectF2 = bVar.f57545a;
        canvas.drawArc(rectF, 270.0f, 360.0f, false, this.f57542m);
        Paint paint = this.f57541l;
        canvas.drawArc(rectF2, -90.0f, f5, false, paint);
        if (this.multiplier == 0) {
            canvas.drawArc(rectF2, -90.0f, 0.1f, false, paint);
        }
        float f6 = f5 - 90.0f;
        Paint paint2 = this.k.f229752c;
        float f32 = this.f57540j;
        if (paint2 != null) {
            if (paint2.getAlpha() == 0) {
                paint2 = null;
            }
            if (paint2 != null) {
                double radians = (float) Math.toRadians(f6);
                canvas.drawCircle((((float) Math.cos(radians)) * bVar.f) + bVar.f57546b, (((float) Math.sin(radians)) * bVar.f) + bVar.f57547c, f32 / 2.0f, paint2);
            }
        }
        b(canvas, f6, f32);
        float f35 = f6;
        while (f35 > -90.0f) {
            f35 -= f4;
            b(canvas, f35, this.i);
        }
        if (this.multiplier == 10) {
            c(270.0f, canvas);
            return;
        }
        while (f6 < 270.0f - f4) {
            f6 += f4;
            c(f6, canvas);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r0 = r10.getAction()
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L2e
            if (r0 == r3) goto L24
            if (r0 == r1) goto L17
            r1 = 3
            if (r0 == r1) goto L24
            goto L83
        L17:
            float r0 = r10.getX()
            float r1 = r10.getY()
            r9.d(r0, r1)
        L22:
            r2 = r3
            goto L83
        L24:
            android.view.ViewParent r0 = r9.getParent()
            if (r0 == 0) goto L22
            r0.requestDisallowInterceptTouchEvent(r2)
            goto L22
        L2e:
            float r0 = r10.getX()
            float r4 = r10.getY()
            com.revolut.core.ui_kit.internal.views.slider.RadialSliderView$b r5 = r9.e
            float r6 = r5.f57546b
            float r0 = r0 - r6
            double r6 = (double) r0
            double r0 = (double) r1
            double r6 = java.lang.Math.pow(r6, r0)
            float r6 = (float) r6
            float r7 = r5.f57547c
            float r4 = r4 - r7
            double r7 = (double) r4
            double r7 = java.lang.Math.pow(r7, r0)
            float r4 = (float) r7
            float r6 = r6 + r4
            float r4 = r5.d
            double r7 = (double) r4
            double r7 = java.lang.Math.pow(r7, r0)
            float r4 = (float) r7
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 < 0) goto L5a
            r4 = r3
            goto L5b
        L5a:
            r4 = r2
        L5b:
            float r5 = r5.e
            double r7 = (double) r5
            double r0 = java.lang.Math.pow(r7, r0)
            float r0 = (float) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L69
            r0 = r3
            goto L6a
        L69:
            r0 = r2
        L6a:
            if (r4 == 0) goto L83
            if (r0 == 0) goto L83
            android.view.ViewParent r0 = r9.getParent()
            if (r0 == 0) goto L77
            r0.requestDisallowInterceptTouchEvent(r3)
        L77:
            float r0 = r10.getX()
            float r1 = r10.getY()
            r9.d(r0, r1)
            goto L22
        L83:
            ou0.b r0 = r9.k
            r0.d(r10, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.slider.RadialSliderView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        ou0.b bVar = this.k;
        if (enabled) {
            bVar.getClass();
        } else {
            bVar.a(false);
        }
    }

    public final void setMultiplier(int i) {
        if (i == 0 && !this.zeroSelectable) {
            i = 1;
        }
        if (this.multiplier != i) {
            this.multiplier = (i != 0 || this.zeroSelectable) ? i : 1;
            e();
            this.multiplierChangeListener.invoke(Integer.valueOf(i));
            invalidate();
        }
    }

    public final void setMultiplierChangeListener(@NotNull Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.multiplierChangeListener = function1;
    }

    public final void setZeroSelectable(boolean z) {
        this.zeroSelectable = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadialSliderView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadialSliderView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.multiplierChangeListener = new f(23);
        this.d = true;
        this.e = new b(0);
        this.f = new Rect();
        this.f57538g = 36.0f;
        float fK = kli.a.k(context, 40.0f);
        this.f57539h = kli.a.k(context, 20.0f);
        this.i = kli.a.k(context, 4.0f);
        this.f57540j = kli.a.k(context, 33.0f);
        ou0.b bVar = new ou0.b(this, 1);
        this.k = bVar;
        Paint paintC = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        Paint.Style style = Paint.Style.STROKE;
        paintC.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paintC.setStrokeCap(cap);
        paintC.setStrokeWidth(fK);
        this.f57541l = paintC;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(style);
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(fK);
        this.f57542m = paint;
        Paint paintC2 = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        paintC2.setColor(io0.a.c(context, new Color.Solid(R$attr.uikit_colorOnAccent)));
        this.f57543n = paintC2;
        Paint paintC3 = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        paintC3.setColor(io0.a.c(context, new Color.Solid(R$attr.uikit_colorGrey50)));
        l.d(paintC3, context, R$attr.internal_textAppearanceEmphasis3);
        this.o = paintC3;
        c cVar = new c(context, null, 6, 0);
        this.f57544p = cVar;
        setWillNotDraw(false);
        bVar.b();
        setClipChildren(false);
        paintC.setColor(bVar.e);
        paint.setColor(bVar.f);
        cVar.setTextAppearance(R$attr.internal_textAppearanceDisplay1);
        cVar.setGravity(17);
        addView(cVar, new FrameLayout.LayoutParams(-2, -2, 17));
        e();
    }

    public /* synthetic */ RadialSliderView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
