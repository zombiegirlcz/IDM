package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.revolut.core.ui_kit.R$styleable;
import com.revolut.core.ui_kit.drawables.TiltReflectionDrawable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mx0.vc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\n\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0002 \u0011B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eR*\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00178\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/revolut/core/ui_kit/views/TiltGlowCardContainerView;", "Landroid/widget/FrameLayout;", "Landroid/hardware/SensorEventListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dominantColor", "", "setChildDominantColor", "(I)V", "", "value", "a", "Z", "isTiltEffectEnabled", "()Z", "setTiltEffectEnabled", "(Z)V", "", "d", "F", "getCornerRadius", "()F", "setCornerRadius", "(F)V", "cornerRadius", "Companion", "mx0/vc", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TiltGlowCardContainerView extends FrameLayout implements SensorEventListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean isTiltEffectEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vc f58907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public kt0.d f58908c;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public float cornerRadius;
    public final TiltReflectionDrawable e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SensorManager f58909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Sensor f58910h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f58911j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float[] f58912l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float[] f58913m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int[] f58914n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float[] f58915p;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.TiltGlowCardContainerView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TiltGlowCardContainerView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Float a(View view) {
        if (view instanceof CardView) {
            return Float.valueOf(((CardView) view).getRadius());
        }
        if (view instanceof Shapeable) {
            ShapeAppearanceModel shapeAppearanceModel = ((Shapeable) view).getShapeAppearanceModel();
            Intrinsics.checkNotNullExpressionValue(shapeAppearanceModel, "getShapeAppearanceModel(...)");
            return Float.valueOf(shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, view.getWidth(), view.getHeight())));
        }
        Drawable background = view.getBackground();
        if (background != null) {
            Outline outline = new Outline();
            background.getOutline(outline);
            float radius = outline.getRadius();
            if (radius > BitmapDescriptorFactory.HUE_RED) {
                return Float.valueOf(radius);
            }
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            Float fA = a(childAt);
            if (fA != null) {
                return fA;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("TiltGlowCardContainerView must host one direct child.");
        }
        super.addView(view, i, layoutParams);
        if (this.isTiltEffectEnabled) {
            f();
        }
    }

    public final void b() {
        if (!isInEditMode() && this.i && !this.f58911j && this.isTiltEffectEnabled && this.f58907b == vc.IDLE && isAttachedToWindow() && getWindowVisibility() == 0) {
            Runnable runnable = this.f58908c;
            if (runnable != null) {
                removeCallbacks(runnable);
            }
            kt0.d dVar = new kt0.d(this, 22);
            this.f58908c = dVar;
            postDelayed(dVar, 500L);
            this.k = false;
            SensorManager sensorManager = this.f58909g;
            if (sensorManager != null) {
                sensorManager.registerListener(this, this.f58910h, 1);
            }
            this.f58911j = true;
        }
    }

    public final void c() {
        View childAt;
        ViewOverlay overlay;
        if (this.f) {
            TiltReflectionDrawable tiltReflectionDrawable = this.e;
            if (tiltReflectionDrawable != null && (childAt = getChildAt(0)) != null && (overlay = childAt.getOverlay()) != null) {
                overlay.remove(tiltReflectionDrawable);
            }
            this.f = false;
        }
    }

    public final void d() {
        kt0.d dVar = this.f58908c;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
        this.f58907b = vc.IDLE;
        if (this.f58911j) {
            SensorManager sensorManager = this.f58909g;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this);
            }
            this.f58911j = false;
            this.k = false;
            View childAt = getChildAt(0);
            if (childAt != null) {
                childAt.setRotationX(BitmapDescriptorFactory.HUE_RED);
                childAt.setRotationY(BitmapDescriptorFactory.HUE_RED);
            }
            TiltReflectionDrawable tiltReflectionDrawable = this.e;
            if (tiltReflectionDrawable != null) {
                tiltReflectionDrawable.a(BitmapDescriptorFactory.HUE_RED);
            }
        }
    }

    public final void e() {
        if (this.isTiltEffectEnabled && this.i) {
            if (getLayerType() != 2) {
                setLayerType(2, null);
            }
        } else if (getLayerType() == 2) {
            setLayerType(0, null);
        }
    }

    public final void f() {
        if (getChildCount() != 1 || !this.isTiltEffectEnabled) {
            c();
            return;
        }
        View childAt = getChildAt(0);
        if (this.cornerRadius == BitmapDescriptorFactory.HUE_RED) {
            Intrinsics.h(childAt);
            Float fA = a(childAt);
            if (fA != null) {
                setCornerRadius(fA.floatValue());
            }
        }
        TiltReflectionDrawable tiltReflectionDrawable = this.e;
        if (tiltReflectionDrawable == null) {
            c();
            return;
        }
        if (childAt.getWidth() <= 0 || childAt.getHeight() <= 0) {
            c();
            return;
        }
        tiltReflectionDrawable.setBounds(0, 0, childAt.getWidth(), childAt.getHeight());
        if (this.f) {
            return;
        }
        childAt.getOverlay().add(tiltReflectionDrawable);
        this.f = true;
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.isTiltEffectEnabled) {
            b();
            f();
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        c();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        if (getChildCount() != 1 || !this.isTiltEffectEnabled) {
            c();
            return;
        }
        View childAt = getChildAt(0);
        f();
        if (z) {
            childAt.setCameraDistance(getResources().getDisplayMetrics().density * 10000.0f);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        Sensor sensor;
        View childAt;
        if (!this.isTiltEffectEnabled || sensorEvent == null || (sensor = sensorEvent.sensor) == null || sensor.getType() != 15 || this.f58907b != vc.PROCESSING || (childAt = getChildAt(0)) == null) {
            return;
        }
        boolean z = this.k;
        float[] fArr = this.f58912l;
        TiltReflectionDrawable tiltReflectionDrawable = this.e;
        if (!z) {
            SensorManager.getRotationMatrixFromVector(fArr, sensorEvent.values);
            this.k = true;
            if (tiltReflectionDrawable != null) {
                tiltReflectionDrawable.a(BitmapDescriptorFactory.HUE_RED);
            }
            childAt.setRotationX(BitmapDescriptorFactory.HUE_RED);
            childAt.setRotationY(BitmapDescriptorFactory.HUE_RED);
            invalidate();
            return;
        }
        float[] fArr2 = sensorEvent.values;
        float[] fArr3 = this.f58913m;
        SensorManager.getRotationMatrixFromVector(fArr3, fArr2);
        float f = fArr[2];
        float f4 = fArr3[1] * f;
        float f5 = fArr[5];
        float f6 = (fArr3[4] * f5) + f4;
        float f32 = fArr[8];
        float f35 = -((fArr3[7] * f32) + f6);
        float f36 = -((f32 * fArr3[6]) + (f5 * fArr3[3]) + (f * fArr3[0]));
        double degrees = Math.toDegrees((float) Math.asin(f35));
        double degrees2 = Math.toDegrees((float) Math.asin(f36));
        float f37 = getResources().getDisplayMetrics().heightPixels / 2.0f;
        childAt.getLocationOnScreen(this.f58914n);
        double dAbs = ((double) ((Math.abs(f37 - r9[1]) / f37) * 1.5f)) + 1.0d;
        double d = -1;
        double d5 = 0.3f;
        double d6 = degrees * dAbs * d5;
        double dE = kotlin.ranges.f.e(Math.abs(d6) < 2.0d ? 0.0d : d6 - (Math.signum(d6) * 2.0d), dAbs * (-12.0d), dAbs * 12.0d) * d;
        double d10 = degrees2 * d5;
        double dE2 = d * kotlin.ranges.f.e(Math.abs(d10) >= 2.0d ? d10 - (Math.signum(d10) * 2.0d) : 0.0d, -12.0d, 12.0d);
        float degrees3 = (float) ((Math.toDegrees(Math.atan2(-dE, dE2)) + ((double) 180)) % ((double) 360));
        if (tiltReflectionDrawable != null) {
            double dMax = Math.max(Math.abs(dE), Math.abs(dE2)) / ((double) 4.0f);
            tiltReflectionDrawable.setAlpha((int) ((dMax <= 1.0d ? dMax : 1.0d) * ((double) this.o)));
        }
        if (tiltReflectionDrawable != null) {
            tiltReflectionDrawable.a(degrees3);
        }
        childAt.setRotationX((float) dE);
        childAt.setRotationY((float) dE2);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.isTiltEffectEnabled) {
            e();
            f();
            b();
        } else {
            d();
            c();
            e();
        }
    }

    public final void setChildDominantColor(int dominantColor) {
        float[] fArr = this.f58915p;
        Color.colorToHSV(dominantColor, fArr);
        this.o = (int) (((fArr[2] * 0.6f) + 0.2f) * 255);
        invalidate();
    }

    public final void setCornerRadius(float f) {
        if (this.cornerRadius == f) {
            return;
        }
        this.cornerRadius = f;
        TiltReflectionDrawable tiltReflectionDrawable = this.e;
        if (tiltReflectionDrawable == null || f == tiltReflectionDrawable.d || f < BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        tiltReflectionDrawable.d = f;
        tiltReflectionDrawable.k = true;
        tiltReflectionDrawable.invalidateSelf();
    }

    public final void setTiltEffectEnabled(boolean z) {
        if (this.isTiltEffectEnabled != z) {
            this.isTiltEffectEnabled = z;
            if (z) {
                e();
                f();
                b();
            } else {
                d();
                c();
                e();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TiltGlowCardContainerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TiltGlowCardContainerView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isTiltEffectEnabled = true;
        this.f58907b = vc.IDLE;
        this.f58912l = new float[9];
        this.f58913m = new float[9];
        this.f58914n = new int[2];
        this.o = (int) (0.5f * 255);
        this.f58915p = new float[3];
        boolean z = false;
        setClipChildren(false);
        setClipToPadding(false);
        float fApplyDimension = TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.TiltGlowCardView, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        setCornerRadius(typedArrayObtainStyledAttributes.getDimension(R$styleable.TiltGlowCardView_glowCornerRadius, BitmapDescriptorFactory.HUE_RED));
        float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.TiltGlowCardView_glowBorderWidth, fApplyDimension);
        float f = kotlin.ranges.f.f(typedArrayObtainStyledAttributes.getFloat(R$styleable.TiltGlowCardView_glowIntensity, 0.7f), 0.01f, 1.0f);
        Unit unit = Unit.f186387a;
        typedArrayObtainStyledAttributes.recycle();
        TiltReflectionDrawable tiltReflectionDrawable = new TiltReflectionDrawable(dimension, f, this.cornerRadius);
        this.e = tiltReflectionDrawable;
        tiltReflectionDrawable.setAlpha(0);
        if (!isInEditMode()) {
            Object systemService = context.getSystemService("sensor");
            SensorManager sensorManager = systemService instanceof SensorManager ? (SensorManager) systemService : null;
            this.f58909g = sensorManager;
            if (sensorManager != null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(15);
                this.f58910h = defaultSensor;
                z = defaultSensor != null;
            }
        }
        this.i = z;
        e();
        if (!this.isTiltEffectEnabled) {
            c();
        } else {
            f();
        }
    }

    public /* synthetic */ TiltGlowCardContainerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
