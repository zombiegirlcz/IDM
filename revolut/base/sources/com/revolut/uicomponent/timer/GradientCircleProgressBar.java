package com.revolut.uicomponent.timer;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.uicomponent.R$styleable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\"\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001<B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eR*\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R*\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R*\u0010\"\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R*\u0010&\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0011\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u0015R*\u0010*\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0011\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015R*\u0010.\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0011\u001a\u0004\b,\u0010\u0013\"\u0004\b-\u0010\u0015R*\u00106\u001a\u00020/2\u0006\u0010\u000f\u001a\u00020/8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u0010:\u001a\u00020/2\u0006\u0010\u000f\u001a\u00020/8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00101\u001a\u0004\b8\u00103\"\u0004\b9\u00105¨\u0006="}, d2 = {"Lcom/revolut/uicomponent/timer/GradientCircleProgressBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/content/res/TypedArray;", "attributes", "", "setupAttributes", "(Landroid/content/res/TypedArray;)V", "value", "d", "I", "getGradientWidth", "()I", "setGradientWidth", "(I)V", "gradientWidth", "e", "getThreshold", "setThreshold", "threshold", "f", "getProgress", "setProgress", "progress", "g", "getMax", "setMax", "max", "h", "getStartColor", "setStartColor", "startColor", "i", "getEndColor", "setEndColor", "endColor", "j", "getBgColor", "setBgColor", "bgColor", "", "k", "F", "getBarThickness", "()F", "setBarThickness", "(F)V", "barThickness", "l", "getBgThickness", "setBgThickness", "bgThickness", "Companion", "a", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final class GradientCircleProgressBar extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f107279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f107280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArgbEvaluator f107281c;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int gradientWidth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int threshold;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int progress;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int max;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int startColor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int endColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int bgColor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public float barThickness;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public float bgThickness;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GradientCircleProgressBar(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setupAttributes(TypedArray attributes) {
        setStartColor(attributes.getColor(R$styleable.GradientCircleProgressBar_startColor, -16777216));
        setEndColor(attributes.getColor(R$styleable.GradientCircleProgressBar_endColor, -65536));
        setBgColor(attributes.getColor(R$styleable.GradientCircleProgressBar_backgroundColor, -7829368));
        setBarThickness(attributes.getDimension(R$styleable.GradientCircleProgressBar_progressBarThickness, 5.0f));
        setBgThickness(attributes.getDimension(R$styleable.GradientCircleProgressBar_backgroundThickness, this.barThickness));
        setMax(attributes.getInt(R$styleable.GradientCircleProgressBar_max, 100));
        setProgress(attributes.getInt(R$styleable.GradientCircleProgressBar_progress, 0));
        setGradientWidth(attributes.getInt(R$styleable.GradientCircleProgressBar_gradientWidth, 0));
    }

    public final float getBarThickness() {
        return this.barThickness;
    }

    public final int getBgColor() {
        return this.bgColor;
    }

    public final float getBgThickness() {
        return this.bgThickness;
    }

    public final int getEndColor() {
        return this.endColor;
    }

    public final int getGradientWidth() {
        return this.gradientWidth;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final int getStartColor() {
        return this.startColor;
    }

    public final int getThreshold() {
        return this.threshold;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i = this.max;
        if (i == 0) {
            return;
        }
        float f = this.progress / i;
        float f4 = this.threshold / i;
        float f5 = this.gradientWidth / i;
        int i2 = this.bgColor;
        Paint paint = this.f107279a;
        paint.setColor(i2);
        paint.setStrokeWidth(this.bgThickness);
        RectF rectF = this.f107280b;
        float f6 = 2;
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / f6, paint);
        int iIntValue = this.startColor;
        int i3 = this.endColor;
        float f32 = f5 / f6;
        float f35 = f4 - f32;
        float f36 = f4 + f32;
        if (f > f35) {
            if (f < f36 && f5 != BitmapDescriptorFactory.HUE_RED) {
                Object objEvaluate = this.f107281c.evaluate((f - f35) / (f36 - f35), Integer.valueOf(iIntValue), Integer.valueOf(i3));
                Intrinsics.i(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
                iIntValue = ((Integer) objEvaluate).intValue();
            } else {
                iIntValue = i3;
            }
        }
        paint.setColor(iIntValue);
        paint.setStrokeWidth(this.barThickness);
        canvas.drawArc(rectF, -90.0f, (this.progress * 360) / this.max, false, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        float strokeWidth = this.f107279a.getStrokeWidth() / 2;
        RectF rectF = this.f107280b;
        rectF.left = BitmapDescriptorFactory.HUE_RED;
        rectF.top = BitmapDescriptorFactory.HUE_RED;
        rectF.right = i3 - i;
        rectF.bottom = i5 - i2;
        rectF.inset(strokeWidth, strokeWidth);
    }

    public final void setBarThickness(float f) {
        this.barThickness = f;
        invalidate();
    }

    public final void setBgColor(int i) {
        this.bgColor = i;
        invalidate();
    }

    public final void setBgThickness(float f) {
        this.bgThickness = f;
        invalidate();
    }

    public final void setEndColor(int i) {
        this.endColor = i;
        invalidate();
    }

    public final void setGradientWidth(int i) {
        this.gradientWidth = i;
        invalidate();
    }

    public final void setMax(int i) {
        if (this.max > 0) {
            this.max = i;
            invalidate();
        }
    }

    public final void setProgress(int i) {
        int i2 = this.max;
        if (i > i2) {
            i %= i2;
        }
        this.progress = i;
        invalidate();
    }

    public final void setStartColor(int i) {
        this.startColor = i;
        invalidate();
    }

    public final void setThreshold(int i) {
        int i2 = this.max;
        if (i > i2) {
            i %= i2;
        }
        this.threshold = i;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GradientCircleProgressBar(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ GradientCircleProgressBar(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GradientCircleProgressBar(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        this.f107279a = paint;
        this.f107280b = new RectF();
        this.f107281c = new ArgbEvaluator();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.GradientCircleProgressBar, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        setupAttributes(typedArrayObtainStyledAttributes);
        Unit unit = Unit.f186387a;
        typedArrayObtainStyledAttributes.recycle();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.barThickness);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.max = 100;
    }
}
