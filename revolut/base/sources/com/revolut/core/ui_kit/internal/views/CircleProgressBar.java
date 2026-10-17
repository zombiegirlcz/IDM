package com.revolut.core.ui_kit.internal.views;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import androidx.core.view.ViewCompat;
import au0.b5;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$styleable;
import com.revolut.core.ui_kit.internal.views.RingShape;
import com.revolut.core.ui_kit_resources.R$attr;
import ix0.e0;
import ix0.h0;
import ix0.j0;
import ix0.l0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ms0.c0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0007\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0001EB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010 \u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR*\u0010'\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R*\u0010+\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R*\u0010/\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010$\"\u0004\b.\u0010&R*\u00103\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\"\u001a\u0004\b1\u0010$\"\u0004\b2\u0010&R*\u00107\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\"\u001a\u0004\b5\u0010$\"\u0004\b6\u0010&R*\u0010?\u001a\u0002082\u0006\u0010\u0015\u001a\u0002088\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R*\u0010C\u001a\u0002082\u0006\u0010\u0015\u001a\u0002088\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010:\u001a\u0004\bA\u0010<\"\u0004\bB\u0010>¨\u0006F"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/CircleProgressBar;", "Landroid/view/View;", "Lix0/h0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/internal/views/ProgressStyle;", "style", "", "setupAnimation", "(Lcom/revolut/core/ui_kit/internal/views/ProgressStyle;)V", "Landroid/content/res/TypedArray;", "attributes", "setupAttributes", "(Landroid/content/res/TypedArray;)V", "Lcom/revolut/core/ui_kit/internal/views/RingShape;", "value", "g", "Lcom/revolut/core/ui_kit/internal/views/RingShape;", "setRingShape", "(Lcom/revolut/core/ui_kit/internal/views/RingShape;)V", "ringShape", "Lix0/j0;", "k", "Lix0/j0;", "getCutoutReceiverController", "()Lix0/j0;", "cutoutReceiverController", "l", "I", "getProgress", "()I", "setProgress", "(I)V", "progress", "m", "getMax", "setMax", "max", "n", "getStartColor", "setStartColor", "startColor", "o", "getEndColor", "setEndColor", "endColor", "p", "getBgColor", "setBgColor", "bgColor", "", "q", "F", "getBarThickness", "()F", "setBarThickness", "(F)V", "barThickness", "r", "getBgThickness", "setBgThickness", "bgThickness", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CircleProgressBar extends View implements h0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final c0 f56130s = new c0("progress", 0, Integer.TYPE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f56131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f56132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SweepGradient f56133c;
    public LinearGradient d;
    public LinearGradient e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public RingShape ringShape;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObjectAnimator f56135h;
    public as0.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f56136j;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final j0 cutoutReceiverController;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int progress;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public int max;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public int startColor;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int endColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public int bgColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public float barThickness;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public float bgThickness;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.CircleProgressBar$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleProgressBar(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setRingShape(RingShape ringShape) {
        if (Intrinsics.f(this.ringShape, ringShape)) {
            return;
        }
        this.ringShape = ringShape;
        this.f = true;
        invalidate();
    }

    private final void setupAnimation(ProgressStyle style) {
        if (style.i == null) {
            b();
            return;
        }
        if (this.i == null) {
            as0.d dVar = new as0.d(this, style, 6);
            this.i = dVar;
            addOnAttachStateChangeListener(dVar);
        }
        if (isAttachedToWindow()) {
            g(style.i, style.f56332a);
        }
    }

    private final void setupAttributes(TypedArray attributes) {
        setStartColor(d(attributes, R$styleable.CircleProgressBar_internal_startColor));
        setEndColor(d(attributes, R$styleable.CircleProgressBar_internal_endColor));
        setBgColor(d(attributes, R$styleable.CircleProgressBar_internal_backgroundColor));
        setBarThickness(attributes.getDimension(R$styleable.CircleProgressBar_internal_progressBarThickness, 5.0f));
        setBgThickness(attributes.getDimension(R$styleable.CircleProgressBar_internal_backgroundThickness, this.barThickness));
        setMax(attributes.getInt(R$styleable.CircleProgressBar_internal_max, 100));
        setProgress(attributes.getInt(R$styleable.CircleProgressBar_internal_progress, 0));
        Unit unit = Unit.f186387a;
        attributes.recycle();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
            ViewCompat.setScreenReaderFocusable(this, true);
        }
    }

    public final void a(ProgressStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setStartColor(kli.a.s(style.f56334c, context));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        setEndColor(kli.a.s(style.d, context2));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        setBgColor(kli.a.s(style.f, context3));
        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
        setBarThickness(kli.a.k(r0, style.f56335g));
        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
        setBgThickness(kli.a.k(r0, style.f56336h));
        setMax(style.f56333b);
        setProgress(style.f56332a);
        setRingShape(style.f56337j);
        f();
        setupAnimation(style);
    }

    public final void b() {
        as0.d dVar = this.i;
        if (dVar != null) {
            removeOnAttachStateChangeListener(dVar);
        }
        this.i = null;
        ObjectAnimator objectAnimator = this.f56135h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f56135h = null;
    }

    public final LinearGradient c(int i) {
        RectF rectF = this.f56132b;
        if (rectF.isEmpty()) {
            return null;
        }
        int iD = io0.a.d(BitmapDescriptorFactory.HUE_RED, i);
        return new LinearGradient(rectF.centerX(), rectF.top, rectF.centerX(), rectF.bottom, new int[]{i, i, iD, iD}, new float[]{BitmapDescriptorFactory.HUE_RED, 0.75f, 0.88f, 1.0f}, Shader.TileMode.CLAMP);
    }

    public final int d(TypedArray typedArray, int i) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return typedArray.getColor(i, kli.a.s(R$attr.uikit_colorAccent, context));
    }

    public final void e(int i, int i2, int i3, int i5) {
        SweepGradient sweepGradient;
        float f = 2;
        float strokeWidth = this.f56131a.getStrokeWidth() / f;
        RectF rectF = this.f56132b;
        float degrees = BitmapDescriptorFactory.HUE_RED;
        rectF.left = BitmapDescriptorFactory.HUE_RED;
        rectF.top = BitmapDescriptorFactory.HUE_RED;
        rectF.right = i - i2;
        rectF.bottom = i3 - i5;
        rectF.inset(strokeWidth, strokeWidth);
        this.f = true;
        if (this.startColor != this.endColor) {
            boolean z = getLayoutDirection() == 1;
            sweepGradient = new SweepGradient(rectF.centerX(), rectF.centerY(), z ? this.endColor : this.startColor, z ? this.startColor : this.endColor);
            Matrix matrix = new Matrix();
            float fWidth = rectF.width() / f;
            if (!rectF.isEmpty() && fWidth != BitmapDescriptorFactory.HUE_RED) {
                degrees = (float) Math.toDegrees((float) Math.asin(strokeWidth / fWidth));
            }
            float fJ3 = this.ringShape.j3(getLayoutDirection());
            matrix.preRotate(z ? fJ3 + degrees : fJ3 - degrees, rectF.centerX(), rectF.centerY());
            sweepGradient.setLocalMatrix(matrix);
        } else {
            sweepGradient = null;
        }
        this.f56133c = sweepGradient;
    }

    public final void f() {
        Paint paint = this.f56131a;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.barThickness);
        paint.setStrokeCap(Paint.Cap.ROUND);
        if (isLaidOut()) {
            e(getRight(), getLeft(), getBottom(), getTop());
        }
    }

    public final void g(ProgressAnimation progressAnimation, int i) {
        b();
        Pair pair = progressAnimation.f56315b ? new Pair(0, Integer.valueOf(i)) : new Pair(Integer.valueOf(i), 0);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, f56130s, ((Number) pair.f186385a).intValue(), ((Number) pair.f186386b).intValue());
        objectAnimatorOfInt.setDuration(progressAnimation.f56314a);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.addUpdateListener(new b5(this, 23));
        objectAnimatorOfInt.start();
        this.f56135h = objectAnimatorOfInt;
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

    public final int getMax() {
        return this.max;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final int getStartColor() {
        return this.startColor;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Shader shader;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        e0 e0Var = l0.Companion;
        j0 cutoutReceiverController = getCutoutReceiverController();
        List list = cutoutReceiverController.f169246c;
        e0Var.getClass();
        e0.b(canvas, list);
        if (this.f) {
            this.f = false;
            if (this.ringShape.x6()) {
                this.d = c(this.bgColor);
                this.e = c(this.endColor);
            } else {
                this.d = null;
                this.e = null;
            }
        }
        boolean z = getLayoutDirection() == 1;
        float fA8 = this.ringShape.a8();
        float fJ3 = this.ringShape.j3(getLayoutDirection());
        int i = this.bgColor;
        Paint paint = this.f56131a;
        paint.setColor(i);
        paint.setStrokeWidth(this.bgThickness);
        paint.setShader(this.ringShape.x6() ? this.d : null);
        float f = z ? -fA8 : fA8;
        RectF rectF = this.f56132b;
        canvas.drawArc(rectF, fJ3, f, false, paint);
        paint.setShader(null);
        if (this.max != 0) {
            paint.setColor(this.endColor);
            paint.setStrokeWidth(this.barThickness);
            float f4 = (this.progress * fA8) / this.max;
            if (z) {
                f4 = -f4;
            }
            float f5 = f4;
            if (this.ringShape.x6()) {
                shader = this.e;
            } else {
                shader = this.f56133c;
                if (shader == null || this.progress == this.max) {
                    shader = null;
                }
            }
            paint.setShader(shader);
            canvas.drawArc(rectF, fJ3, f5, false, paint);
            paint.setShader(null);
        }
        e0.a(cutoutReceiverController, canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        int i = this.max;
        int i2 = this.progress;
        Intrinsics.checkNotNullParameter(this, "host");
        Intrinsics.checkNotNullParameter(info, "info");
        gq0.g.a(this, info, 0, i, i2, 0, false);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        e(i3, i, i5, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        invalidate();
    }

    public final void setBarThickness(float f) {
        this.barThickness = f;
        invalidate();
    }

    public final void setBgColor(int i) {
        this.bgColor = i;
        this.f = true;
        invalidate();
    }

    public final void setBgThickness(float f) {
        this.bgThickness = f;
        invalidate();
    }

    public final void setEndColor(int i) {
        this.endColor = i;
        this.f = true;
        invalidate();
    }

    public final void setMax(int i) {
        if (this.max != i) {
            this.max = i;
            invalidate();
        }
    }

    public final void setProgress(int i) {
        int iA8;
        int i2 = this.max;
        if (i2 > 0 && i > i2) {
            i %= i2;
        }
        int i3 = this.progress;
        if (i3 == i) {
            return;
        }
        int iA82 = 0;
        if (i2 == 0) {
            iA8 = 0;
        } else {
            iA8 = (int) ((this.ringShape.a8() * i3) / this.max);
        }
        this.progress = i;
        if (this.max != 0) {
            iA82 = (int) ((this.ringShape.a8() * i) / this.max);
        }
        if (iA8 != iA82) {
            invalidate();
        }
    }

    public final void setStartColor(int i) {
        this.startColor = i;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleProgressBar(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ix0.h0
    @NotNull
    public j0 getCutoutReceiverController() {
        return this.cutoutReceiverController;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleProgressBar(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56131a = new Paint();
        this.f56132b = new RectF();
        this.f = true;
        this.ringShape = RingShape.Full.f56369a;
        this.f56136j = new ArrayList();
        this.cutoutReceiverController = new j0(this);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.CircleProgressBar, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        setupAttributes(typedArrayObtainStyledAttributes);
        f();
        this.max = 100;
    }

    public /* synthetic */ CircleProgressBar(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
