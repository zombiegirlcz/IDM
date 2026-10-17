package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$styleable;
import com.revolut.core.ui_kit.internal.views.gaugechart.a;
import com.revolut.core.ui_kit_resources.R$attr;
import hx7.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ms0.o1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010$\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\u001eR*\u0010(\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010\u001eR*\u0010,\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010\"\"\u0004\b+\u0010\u001eR*\u00103\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R*\u00107\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\b5\u00100\"\u0004\b6\u00102R*\u0010;\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b8\u0010.\u001a\u0004\b9\u00100\"\u0004\b:\u00102R*\u0010?\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b<\u0010.\u001a\u0004\b=\u00100\"\u0004\b>\u00102R*\u0010C\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010\u001c\u001a\u0004\bA\u0010\"\"\u0004\bB\u0010\u001eR*\u0010G\u001a\u00020D2\u0006\u0010\u001a\u001a\u00020D8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR*\u0010L\u001a\u00020D2\u0006\u0010\u001a\u001a\u00020D8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010F\u001a\u0004\bL\u0010H\"\u0004\bM\u0010JR$\u0010P\u001a\u00020D2\u0006\u0010\u001a\u001a\u00020D8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bN\u0010F\"\u0004\bO\u0010JR$\u0010S\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bQ\u0010\u001c\"\u0004\bR\u0010\u001eR$\u0010U\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001c\"\u0004\bT\u0010\u001eR(\u0010[\u001a\u0004\u0018\u00010V2\b\u0010\u001a\u001a\u0004\u0018\u00010V8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001a\u0010_\u001a\u00020\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b]\u0010^\u001a\u0004\b\\\u0010\"¨\u0006`"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/LimitProgressBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "previousVisualProgress", "previousLimit", "Lms0/o1;", "style", "", "setupAnimationStartProgress$ui_kit_components_release", "(FFLms0/o1;)V", "setupAnimationStartProgress", "setupAnimation$ui_kit_components_release", "(Lms0/o1;)V", "setupAnimation", "Landroid/content/res/TypedArray;", "attributes", "setupAttributes", "(Landroid/content/res/TypedArray;)V", "value", "q", "F", "setAppearingAnimatedValue", "(F)V", "appearingAnimatedValue", "t", "getProgress", "()F", "setProgress", "progress", "u", "getSecondaryProgress", "setSecondaryProgress", "secondaryProgress", "v", "getLimit", "setLimit", "limit", "w", "I", "getProgressColor", "()I", "setProgressColor", "(I)V", "progressColor", "x", "getSecondaryProgressColor", "setSecondaryProgressColor", "secondaryProgressColor", "y", "getExceededColor", "setExceededColor", "exceededColor", "z", "getBgColor", "setBgColor", "bgColor", "A", "getBarThickness", "setBarThickness", "barThickness", "", "B", "Z", "isLimitEnabled", "()Z", "setLimitEnabled", "(Z)V", "C", "isArrowVisible", "setArrowVisible", "D", "setShowGradient", "showGradient", "E", "setArcAngle", "arcAngle", "setStartAngle", "startAngle", "Landroid/graphics/Shader;", "G", "Landroid/graphics/Shader;", "setGradientShader", "(Landroid/graphics/Shader;)V", "gradientShader", "getVisualProgress", "getVisualProgress$annotations", "()V", "visualProgress", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LimitProgressBar extends View {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public float barThickness;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public boolean isLimitEnabled;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public boolean isArrowVisible;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public boolean showGradient;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public float arcAngle;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public float startAngle;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public Shader gradientShader;
    public final float H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f56209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f56210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f56211c;
    public final RectF d;
    public final Path e;
    public final Path f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f56212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Path f56213h;
    public final a.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f56214j;
    public final float[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ComposeShader f56215l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ComposeShader f56216m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ComposeShader f56217n;
    public ComposeShader o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f56218p;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public float appearingAnimatedValue;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ir0.g f56220r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final iv0.j f56221s;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public float progress;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public float secondaryProgress;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public float limit;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public int progressColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public int secondaryProgressColor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public int exceededColor;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public int bgColor;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LimitProgressBar(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static Unit a(LimitProgressBar limitProgressBar, float f) {
        limitProgressBar.setAppearingAnimatedValue(f);
        return Unit.f186387a;
    }

    public static /* synthetic */ void getVisualProgress$annotations() {
    }

    private final void setAppearingAnimatedValue(float f) {
        this.appearingAnimatedValue = f;
        invalidate();
    }

    private final void setArcAngle(float f) {
        this.arcAngle = f;
        invalidate();
    }

    private final void setGradientShader(Shader shader) {
        this.gradientShader = shader;
        this.f56215l = c(this.bgColor);
        this.f56216m = c(this.progressColor);
        this.f56217n = c(this.exceededColor);
        this.o = c(this.secondaryProgressColor);
    }

    private final void setShowGradient(boolean z) {
        this.showGradient = z;
        f();
        invalidate();
    }

    private final void setStartAngle(float f) {
        this.startAngle = f;
        invalidate();
    }

    private final void setupAttributes(TypedArray attributes) {
        setProgressColor(d(attributes, R$styleable.LimitProgressBar_internal_progressColor));
        setSecondaryProgressColor(d(attributes, R$styleable.LimitProgressBar_internal_secondaryProgressColor));
        setExceededColor(d(attributes, R$styleable.LimitProgressBar_internal_exceededColor));
        setBgColor(d(attributes, R$styleable.LimitProgressBar_internal_limitBackgroundColor));
        setBarThickness(attributes.getDimension(R$styleable.LimitProgressBar_internal_limitProgressBarThickness, 5.0f));
        setLimit(attributes.getFloat(R$styleable.LimitProgressBar_internal_limitMax, 100.0f));
        setProgress(attributes.getFloat(R$styleable.LimitProgressBar_internal_limitProgress, BitmapDescriptorFactory.HUE_RED));
        setArrowVisible(attributes.getBoolean(R$styleable.LimitProgressBar_internal_limitArrowVisible, true));
        Unit unit = Unit.f186387a;
        attributes.recycle();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
            ViewCompat.setScreenReaderFocusable(this, true);
        }
    }

    public final void b(o1 style) {
        Intrinsics.checkNotNullParameter(style, "style");
        float visualProgress = getVisualProgress();
        float f = this.limit;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setProgressColor(kli.a.s(style.d, context));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        setSecondaryProgressColor(kli.a.s(style.e, context2));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        setExceededColor(kli.a.s(style.f, context3));
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        setBgColor(kli.a.s(style.f208345g, context4));
        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
        setBarThickness(kli.a.k(r2, style.f208346h));
        setShowGradient(style.f208350n);
        setLimit(style.f208344c);
        setProgress(style.f208342a);
        setSecondaryProgress(style.f208343b);
        setArrowVisible(style.k);
        setArcAngle(style.f208348l);
        setStartAngle(style.f208349m);
        g();
        setupAnimationStartProgress$ui_kit_components_release(visualProgress, f, style);
        setupAnimation$ui_kit_components_release(style);
    }

    public final ComposeShader c(int i) {
        Shader shader;
        if (i == 0 || (shader = this.gradientShader) == null) {
            return null;
        }
        return new ComposeShader(new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getWidth(), getHeight(), i, i, Shader.TileMode.CLAMP), shader, PorterDuff.Mode.DST_IN);
    }

    public final int d(TypedArray typedArray, int i) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return typedArray.getColor(i, kli.a.s(R$attr.uikit_colorAccent, context));
    }

    public final void e(int i, int i2, int i3, int i5) {
        RectF rectF = this.f56211c;
        rectF.left = BitmapDescriptorFactory.HUE_RED;
        rectF.top = BitmapDescriptorFactory.HUE_RED;
        rectF.right = i - i2;
        rectF.bottom = i3 - i5;
        RectF rectF2 = this.d;
        rectF2.left = BitmapDescriptorFactory.HUE_RED;
        rectF2.top = BitmapDescriptorFactory.HUE_RED;
        float f = this.barThickness;
        rectF2.right = f;
        rectF2.bottom = f;
        float f4 = 2;
        float fSqrt = (((float) Math.sqrt(3.0f)) * f) / f4;
        Path.FillType fillType = Path.FillType.EVEN_ODD;
        Path path = this.e;
        path.setFillType(fillType);
        float f5 = 0.66f * fSqrt;
        path.moveTo(f5, BitmapDescriptorFactory.HUE_RED);
        float f6 = BitmapDescriptorFactory.HUE_RED - (fSqrt * 0.33f);
        float f32 = f / f4;
        path.lineTo(f6, BitmapDescriptorFactory.HUE_RED - f32);
        path.lineTo(f6, f32 + BitmapDescriptorFactory.HUE_RED);
        path.lineTo(f5, BitmapDescriptorFactory.HUE_RED);
        path.close();
    }

    public final void f() {
        if (!this.showGradient || getWidth() <= 0 || getHeight() <= 0) {
            setGradientShader(null);
            return;
        }
        float height = getHeight() * 2.2f;
        setGradientShader(new RadialGradient(getWidth() / 2.0f, height, getHeight() * 2.2f, this.f56214j, this.k, Shader.TileMode.CLAMP));
    }

    public final void g() {
        Paint paint = this.f56209a;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        Paint paint2 = this.f56210b;
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
        paint2.setStrokeWidth(kli.a.k(r1, 1.0f));
        if (isLaidOut()) {
            e(getRight(), getLeft(), getBottom(), getTop());
        }
    }

    public final float getBarThickness() {
        return this.barThickness;
    }

    public final int getBgColor() {
        return this.bgColor;
    }

    public final int getExceededColor() {
        return this.exceededColor;
    }

    public final float getLimit() {
        return this.limit;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final int getProgressColor() {
        return this.progressColor;
    }

    public final float getSecondaryProgress() {
        return this.secondaryProgress;
    }

    public final int getSecondaryProgressColor() {
        return this.secondaryProgressColor;
    }

    public final float getVisualProgress() {
        float f = this.progress;
        if (!this.showGradient || f <= BitmapDescriptorFactory.HUE_RED) {
            return f;
        }
        float f4 = this.limit;
        if (f >= f4) {
            return f;
        }
        return (f * 0.6f) + (f4 * 0.2f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Path path;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.limit == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        float visualProgress = getVisualProgress();
        float f = this.limit;
        float f4 = visualProgress > f ? f : visualProgress;
        float f5 = this.f56218p;
        float f6 = ((f4 - f5) * this.appearingAnimatedValue) + f5;
        float f32 = this.arcAngle;
        float f35 = 2;
        float f36 = ((360 - f32) / f35) + this.startAngle;
        float f37 = (f6 * f32) / f;
        float f41 = this.secondaryProgress;
        float f42 = (f32 * f41) / f;
        float f57 = f36 + f37;
        boolean z = this.isLimitEnabled && visualProgress > BitmapDescriptorFactory.HUE_RED;
        boolean z3 = f41 > BitmapDescriptorFactory.HUE_RED && f41 > visualProgress;
        Path path2 = this.f56212g;
        path2.rewind();
        Path path3 = this.f56213h;
        path3.rewind();
        Path path4 = this.f;
        path4.rewind();
        RectF rectF = this.f56211c;
        if (z) {
            path = path4;
            com.revolut.core.ui_kit.internal.views.gaugechart.a.a(path2, rectF, f36, f37, this.barThickness, this.H, this.i, false);
        } else {
            path = path4;
        }
        if (z3) {
            com.revolut.core.ui_kit.internal.views.gaugechart.a.a(path3, rectF, f36, f42, this.barThickness, this.H, this.i, false);
        }
        Path path5 = path;
        com.revolut.core.ui_kit.internal.views.gaugechart.a.a(path5, rectF, f36, this.arcAngle, this.barThickness, this.H, this.i, false);
        if (z3) {
            Path.Op op2 = Path.Op.DIFFERENCE;
            path5.op(path3, op2);
            if (z) {
                path3.op(path2, op2);
            }
        } else if (z) {
            path5.op(path2, Path.Op.DIFFERENCE);
        }
        int i = this.bgColor;
        Paint paint = this.f56209a;
        paint.setColor(i);
        paint.setShader(this.f56215l);
        canvas.drawPath(path5, paint);
        if (z3) {
            paint.setColor(this.secondaryProgressColor);
            paint.setShader(this.o);
            canvas.drawPath(path3, paint);
        }
        if (this.isLimitEnabled) {
            boolean z4 = visualProgress > this.limit;
            int i2 = z4 ? this.exceededColor : this.progressColor;
            if (z) {
                ir0.g gVar = this.f56220r;
                gVar.d(i2);
                gVar.setShader(z4 ? this.f56217n : this.f56216m);
                gVar.e(canvas, path2, (12 & 4) != 0, true);
            }
            if (this.isArrowVisible) {
                Paint paint2 = this.f56210b;
                paint2.setColor(i2);
                float width = (getWidth() / 2) - (f35 * this.barThickness);
                double d = ((double) (f57 / 180)) * 3.141592653589793d;
                float fCos = (((float) Math.cos(d)) * width) + (getWidth() / 2);
                float fSin = (width * ((float) Math.sin(d))) + (getHeight() / 2);
                canvas.save();
                canvas.translate(fCos, fSin);
                canvas.rotate(f57);
                canvas.drawPath(this.e, paint2);
                canvas.restore();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        float f = this.limit;
        float f4 = this.progress;
        Intrinsics.checkNotNullParameter(this, "host");
        Intrinsics.checkNotNullParameter(info, "info");
        gq0.g.a(this, info, BitmapDescriptorFactory.HUE_RED, f, f4, 1, true);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        e(i3, i, i5, i2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        f();
    }

    public final void setArrowVisible(boolean z) {
        this.isArrowVisible = z;
        invalidate();
    }

    public final void setBarThickness(float f) {
        this.barThickness = f;
        invalidate();
    }

    public final void setBgColor(int i) {
        this.bgColor = i;
        this.f56215l = c(i);
        invalidate();
    }

    public final void setExceededColor(int i) {
        this.exceededColor = i;
        this.f56217n = c(i);
        invalidate();
    }

    public final void setLimit(float f) {
        if (f > BitmapDescriptorFactory.HUE_RED) {
            this.limit = f;
            invalidate();
        }
    }

    public final void setLimitEnabled(boolean z) {
        this.isLimitEnabled = z;
        invalidate();
    }

    public final void setProgress(float f) {
        this.progress = f;
        invalidate();
    }

    public final void setProgressColor(int i) {
        this.progressColor = i;
        this.f56216m = c(i);
        invalidate();
    }

    public final void setSecondaryProgress(float f) {
        this.secondaryProgress = f;
        invalidate();
    }

    public final void setSecondaryProgressColor(int i) {
        this.secondaryProgressColor = i;
        this.o = c(i);
        invalidate();
    }

    public final void setupAnimation$ui_kit_components_release(@NotNull o1 style) {
        Intrinsics.checkNotNullParameter(style, "style");
        long j2 = style.i;
        iv0.j jVar = this.f56221s;
        jVar.i.setDuration(j2);
        uw0.i iVar = style.f208347j;
        if (iVar == null || style.i == 0) {
            iVar = null;
        }
        jVar.a(iVar);
    }

    public final void setupAnimationStartProgress$ui_kit_components_release(float previousVisualProgress, float previousLimit, @NotNull o1 style) {
        Intrinsics.checkNotNullParameter(style, "style");
        if (previousLimit != style.f208344c || style.i <= 0) {
            previousVisualProgress = BitmapDescriptorFactory.HUE_RED;
        }
        this.f56218p = previousVisualProgress;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LimitProgressBar(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LimitProgressBar(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        this.f56209a = paint;
        this.f56210b = new Paint();
        this.f56211c = new RectF();
        this.d = new RectF();
        this.e = new Path();
        this.f = new Path();
        this.f56212g = new Path();
        this.f56213h = new Path();
        this.i = new a.b();
        this.f56214j = new int[]{0, -16777216};
        this.k = new float[]{0.7f, 1.0f};
        this.appearingAnimatedValue = 1.0f;
        ir0.g gVarA = ebm.a.a(this, new Paint(paint));
        this.f56220r = gVarA;
        this.f56221s = new iv0.j(this, gVarA, q.b(new mqi.a(this, 2)), new lm.d(13));
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.LimitProgressBar, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        setupAttributes(typedArrayObtainStyledAttributes);
        g();
        this.limit = 100.0f;
        this.isLimitEnabled = true;
        this.isArrowVisible = true;
        this.arcAngle = 288.0f;
        this.startAngle = 90.0f;
        this.H = kli.a.k(context, 2.0f);
    }

    public /* synthetic */ LimitProgressBar(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
