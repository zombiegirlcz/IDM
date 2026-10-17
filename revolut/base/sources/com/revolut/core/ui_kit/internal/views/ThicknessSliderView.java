package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0001\u0013B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/ThicknessSliderView;", "Landroid/view/View;", "Landroid/view/View$OnTouchListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "min", "max", "current", "", "setupRange", "(FFF)V", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ThicknessSliderView extends View implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f56431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f56432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f56433c;
    public final Paint d;
    public final Paint e;
    public final Paint f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f56434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f56435h;
    public final RectF i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RectF f56436j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f56437l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f56438m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f56439n;
    public float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ihm.f f56440p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ihm.f f56441q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThicknessSliderView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        float f = this.o - this.f56438m;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            f4 = f / this.f56439n;
        }
        RectF rectF = this.i;
        float f5 = rectF.bottom;
        float f6 = this.f56435h;
        float fHeight = (f5 + f6) - (rectF.height() * f4);
        RectF rectF2 = this.f56436j;
        rectF2.bottom = fHeight;
        rectF2.top = rectF2.bottom - (2 * f6);
        rectF2.left = rectF.left;
        rectF2.right = rectF.right;
    }

    public final void b(float f) {
        RectF rectF = this.i;
        if (f <= rectF.top) {
            this.o = this.f56437l;
        } else {
            float f4 = rectF.bottom;
            if (f >= f4) {
                this.o = this.f56438m;
            } else {
                this.o = (((f4 - f) * this.f56439n) / rectF.height()) + this.f56438m;
            }
        }
        this.k = f;
        this.f56440p.onNext(Float.valueOf(this.o));
        a();
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Paint paint = this.f56433c;
        Path path = this.f56431a;
        canvas.drawPath(path, paint);
        canvas.drawPath(path, this.d);
        canvas.drawPath(path, this.f56432b);
        Paint paint2 = this.f;
        RectF rectF = this.f56436j;
        canvas.drawOval(rectF, paint2);
        canvas.drawOval(rectF, this.e);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        float f = this.f56434g;
        float f4 = ((i3 - i) - f) / 2;
        RectF rectF = this.i;
        rectF.left = f4;
        float f5 = this.f56435h;
        rectF.top = f5;
        rectF.right = f4 + f;
        rectF.bottom = getMeasuredHeight() - f5;
        float f6 = rectF.left + f5;
        Path path = this.f56431a;
        path.reset();
        path.moveTo(rectF.left, rectF.top);
        path.lineTo(rectF.right, rectF.top);
        path.lineTo(f6, rectF.bottom);
        path.close();
        a();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v, MotionEvent event) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(event, "event");
        float y2 = event.getY();
        int action = event.getAction();
        ihm.f fVar = this.f56441q;
        if (action == 0) {
            fVar.onNext(Boolean.TRUE);
            b(y2);
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                if (Math.abs(y2 - this.k) >= 2.0f) {
                    b(y2);
                }
                return true;
            }
            if (action != 3) {
                return false;
            }
        }
        fVar.onNext(Boolean.FALSE);
        this.k = BitmapDescriptorFactory.HUE_RED;
        return true;
    }

    public final void setupRange(float min, float max, float current) {
        if (min >= max) {
            return;
        }
        this.f56438m = min;
        this.f56437l = max;
        this.f56439n = max - min;
        this.o = current;
        a();
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThicknessSliderView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThicknessSliderView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        int iS = kli.a.s(R$attr.uikit_colorForeground, context);
        float fK = kli.a.k(context, 3.0f);
        this.f56431a = new Path();
        Paint paint = new Paint();
        paint.setColor(kli.a.s(R$attr.uikit_colorWhite, context));
        paint.setAlpha(60);
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setPathEffect(new CornerPathEffect(kli.a.k(context, 2.0f)));
        this.f56432b = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setAlpha(60);
        paint2.setStyle(style);
        paint2.setShadowLayer(fK, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, iS);
        this.f56433c = paint2;
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setStyle(style);
        paint3.setColor(0);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.d = paint3;
        Paint paint4 = new Paint();
        paint4.setColor(kli.a.s(R$attr.uikit_colorWhite, context));
        paint4.setAntiAlias(true);
        paint4.setStyle(style);
        this.e = paint4;
        Paint paint5 = new Paint();
        paint5.setAntiAlias(true);
        paint5.setAlpha(60);
        paint5.setStyle(style);
        paint5.setShadowLayer(fK, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, iS);
        this.f = paint5;
        float fK2 = kli.a.k(context, 24.0f);
        this.f56434g = fK2;
        this.f56435h = fK2 / 2.0f;
        this.i = new RectF();
        this.f56436j = new RectF();
        this.f56437l = 6.0f;
        this.f56438m = 2.0f;
        this.f56439n = 4.0f;
        this.o = 6.0f;
        this.f56440p = v0.a.d("create(...)");
        this.f56441q = v0.a.d("create(...)");
        setLayerType(2, null);
        setClickable(true);
        setFocusable(true);
        setOnTouchListener(this);
    }

    public /* synthetic */ ThicknessSliderView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
