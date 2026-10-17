package com.revolut.core.ui_kit.internal.views.gaugechart;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.graphics.ColorUtils;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import gq0.g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;
import pkm.e;
import rim.d;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0002 !B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR(\u0010\u0013\u001a\u00020\n8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u001c\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000e¨\u0006\""}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/gaugechart/ArcGaugeView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "p", "F", "getCurrentSweepAngle$ui_kit_components_release", "()F", "setCurrentSweepAngle$ui_kit_components_release", "(F)V", "getCurrentSweepAngle$ui_kit_components_release$annotations", "()V", "currentSweepAngle", "Landroid/animation/ValueAnimator;", "q", "Landroid/animation/ValueAnimator;", "getSweepAngleAnimator$ui_kit_components_release", "()Landroid/animation/ValueAnimator;", "setSweepAngleAnimator$ui_kit_components_release", "(Landroid/animation/ValueAnimator;)V", "getSweepAngleAnimator$ui_kit_components_release$annotations", "sweepAngleAnimator", "getArcTopPadding", "arcTopPadding", "Companion", "State", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ArcGaugeView extends View {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final float f57104r = 0.5f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f57106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f57107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f57108c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RectF f57109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RectF f57110h;
    public final RectF i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Paint f57111j;
    public final Paint k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Paint f57112l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Paint f57113m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int[] f57114n;
    public State o;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public float currentSweepAngle;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public ValueAnimator sweepAngleAnimator;

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final float[] f57105s = {BitmapDescriptorFactory.HUE_RED, 0.4f, 0.75f, 1.0f};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/gaugechart/ArcGaugeView$State;", "Landroid/os/Parcelable;", "Active", "Loading", "Lcom/revolut/core/ui_kit/internal/views/gaugechart/ArcGaugeView$State$Active;", "Lcom/revolut/core/ui_kit/internal/views/gaugechart/ArcGaugeView$State$Loading;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface State extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/gaugechart/ArcGaugeView$State$Active;", "Lcom/revolut/core/ui_kit/internal/views/gaugechart/ArcGaugeView$State;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Active implements State {

            @NotNull
            public static final Parcelable.Creator<Active> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final float f57117a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final float f57118b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f57119c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Active(parcel.readFloat(), parcel.readFloat(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Active[i];
                }
            }

            public Active(float f, float f4, boolean z) {
                this.f57117a = f;
                this.f57118b = f4;
                this.f57119c = z;
                if (f4 <= BitmapDescriptorFactory.HUE_RED) {
                    throw new IllegalArgumentException("Max value must be positive.");
                }
                if (BitmapDescriptorFactory.HUE_RED > f || f > f4) {
                    throw new IllegalArgumentException("Current value must be between 0 and the max value.");
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Active)) {
                    return false;
                }
                Active active = (Active) obj2;
                return Float.compare(this.f57117a, active.f57117a) == 0 && Float.compare(this.f57118b, active.f57118b) == 0 && this.f57119c == active.f57119c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f57119c) + m72.b.b(this.f57118b, Float.hashCode(this.f57117a) * 31, 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeFloat(this.f57117a);
                dest.writeFloat(this.f57118b);
                dest.writeInt(this.f57119c ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/gaugechart/ArcGaugeView$State$Loading;", "Lcom/revolut/core/ui_kit/internal/views/gaugechart/ArcGaugeView$State;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Loading implements State {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Loading f57120a = new Loading();

            @NotNull
            public static final Parcelable.Creator<Loading> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Loading.f57120a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Loading[i];
                }
            }

            private Loading() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }
    }

    public static final class a {
        private a() {
        }
    }

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        c.g(800, e.MILLISECONDS);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ArcGaugeView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final float getArcTopPadding() {
        return this.f57106a + getPaddingTop();
    }

    public static /* synthetic */ void getCurrentSweepAngle$ui_kit_components_release$annotations() {
    }

    public static /* synthetic */ void getSweepAngleAnimator$ui_kit_components_release$annotations() {
    }

    /* JADX INFO: renamed from: getCurrentSweepAngle$ui_kit_components_release, reason: from getter */
    public final float getCurrentSweepAngle() {
        return this.currentSweepAngle;
    }

    /* JADX INFO: renamed from: getSweepAngleAnimator$ui_kit_components_release, reason: from getter */
    public final ValueAnimator getSweepAngleAnimator() {
        return this.sweepAngleAnimator;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        float f;
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.sweepAngleAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.sweepAngleAnimator = null;
        State state = this.o;
        if (state != null) {
            if (state instanceof State.Active) {
                State.Active active = (State.Active) state;
                f = active.f57117a / active.f57118b;
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            this.currentSweepAngle = f * 135.0f;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int iSaveLayer = canvas.saveLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getWidth(), getHeight(), null);
        if (this.o instanceof State.Active) {
            canvas.drawArc(this.f57110h, 180.0f, this.currentSweepAngle + 37.0f, false, this.f57112l);
        }
        Paint paint = this.k;
        RectF rectF = this.f57109g;
        canvas.drawArc(rectF, 202.0f, 135.0f, false, paint);
        canvas.drawArc(rectF, 202.0f, this.currentSweepAngle, false, this.f57111j);
        if (!(this.o instanceof State.Loading)) {
            canvas.drawRect(this.i, this.f57113m);
        }
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        State state = this.o;
        State.Active active = state instanceof State.Active ? (State.Active) state : null;
        if (active == null) {
            return;
        }
        float f = active.f57118b;
        float f4 = active.f57117a;
        Intrinsics.checkNotNullParameter(this, "host");
        Intrinsics.checkNotNullParameter(info, "info");
        g.a(this, info, BitmapDescriptorFactory.HUE_RED, f, f4, 1, false);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iResolveSize = View.resolveSize(this.f57108c, i);
        setMeasuredDimension(iResolveSize, View.resolveSize(d.b(((double) iResolveSize) / 2.34d), i2));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = parcelable instanceof Bundle ? (Bundle) parcelable : null;
        if (bundle == null) {
            return;
        }
        State state = (State) BundleCompat.getParcelable((Bundle) parcelable, "KEY_STATE", State.class);
        if (state != null) {
            this.o = state;
            boolean z = state instanceof State.Active;
            setImportantForAccessibility(z ? 1 : 2);
            ViewCompat.setScreenReaderFocusable(this, z);
        }
        this.currentSweepAngle = bundle.getFloat("KEY_CURRENT_SWEEP_ANGLE");
        super.onRestoreInstanceState(bundle.getParcelable("KEY_SUPER_STATE"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return BundleKt.bundleOf(new Pair("KEY_SUPER_STATE", super.onSaveInstanceState()), new Pair("KEY_STATE", this.o), new Pair("KEY_CURRENT_SWEEP_ANGLE", Float.valueOf(this.currentSweepAngle)));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        float f;
        char c2;
        Pair pair;
        float f4;
        super.onSizeChanged(i, i2, i3, i5);
        State state = this.o;
        if (state != null) {
            float width = getWidth();
            float f5 = this.f57107b;
            float f6 = width - (2 * f5);
            if (f6 < BitmapDescriptorFactory.HUE_RED) {
                f6 = 0.0f;
            }
            float f32 = f6 / 2.0f;
            float f35 = f5 + f32;
            float arcTopPadding = getArcTopPadding() + f32;
            boolean z = state instanceof State.Active;
            if (z) {
                State.Active active = (State.Active) state;
                f = active.f57117a / active.f57118b;
            } else {
                f = 0.0f;
            }
            int iBlendARGB = this.d;
            if (f <= 0.2f) {
                c2 = 2;
            } else {
                c2 = 2;
                int i6 = this.f;
                if (f <= 0.5f) {
                    iBlendARGB = ColorUtils.blendARGB(iBlendARGB, i6, (f - 0.2f) / 0.3f);
                } else {
                    iBlendARGB = this.e;
                    if (f <= 0.8f) {
                        iBlendARGB = ColorUtils.blendARGB(i6, iBlendARGB, (f - 0.5f) / 0.3f);
                    }
                }
            }
            this.f57109g.set(f35 - f32, arcTopPadding - f32, f35 + f32, arcTopPadding + f32);
            Paint paint = this.f57111j;
            paint.setColor(iBlendARGB);
            int[] iArr = this.f57114n;
            iArr[0] = iBlendARGB;
            iArr[1] = iBlendARGB;
            float arcTopPadding2 = getArcTopPadding() + f32;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, arcTopPadding2, this.f57114n, f57105s, tileMode));
            if (state instanceof State.Loading) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                pair = new Pair(Integer.valueOf(kli.a.s(R$attr.uikit_colorShimmer, context)), Paint.Cap.SQUARE);
            } else {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                pair = new Pair(Integer.valueOf(kli.a.s(R$attr.uikit_colorGreyTone8, context2)), Paint.Cap.ROUND);
            }
            int iIntValue = ((Number) pair.f186385a).intValue();
            Paint.Cap cap = (Paint.Cap) pair.f186386b;
            Paint paint2 = this.k;
            paint2.setColor(iIntValue);
            paint2.setStrokeCap(cap);
            float fHypot = (float) Math.hypot(f35, arcTopPadding);
            float f36 = (f32 + fHypot) / 2.0f;
            this.f57110h.set(f35 - f36, arcTopPadding - f36, f35 + f36, f36 + arcTopPadding);
            Paint paint3 = this.f57112l;
            paint3.setStrokeWidth(fHypot - f32);
            paint3.setColor(iBlendARGB);
            int iD = io0.a.d(0.3f, iBlendARGB);
            float[] fArr = new float[5];
            fArr[0] = 0.0f;
            fArr[1] = f32 / fHypot;
            fArr[c2] = 0.6f;
            fArr[3] = 0.8f;
            fArr[4] = 1.0f;
            RadialGradient radialGradient = new RadialGradient(f35, arcTopPadding, fHypot, new int[]{0, iD, iD, iD, 0}, fArr, tileMode);
            if (z) {
                State.Active active2 = (State.Active) state;
                f4 = active2.f57117a / active2.f57118b;
            } else {
                f4 = 0.0f;
            }
            float f37 = f4 * 135.0f;
            Companion.getClass();
            float f41 = f57104r;
            float[] fArr2 = new float[3];
            fArr2[0] = f41;
            fArr2[1] = (f37 / 360.0f) + f41;
            fArr2[c2] = ((f37 + 37.0f) / 360.0f) + f41;
            paint3.setShader(new ComposeShader(radialGradient, new SweepGradient(f35, arcTopPadding, new int[]{0, iBlendARGB, 0}, fArr2), PorterDuff.Mode.DST_IN));
            float height = getHeight() - getArcTopPadding();
            this.i.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getWidth(), getHeight());
            this.f57113m.setShader(new LinearGradient(BitmapDescriptorFactory.HUE_RED, getArcTopPadding(), BitmapDescriptorFactory.HUE_RED, getArcTopPadding() + height, new int[]{0, 0, -16777216}, new float[]{BitmapDescriptorFactory.HUE_RED, 0.6f, 1.0f}, tileMode));
        }
    }

    public final void setCurrentSweepAngle$ui_kit_components_release(float f) {
        this.currentSweepAngle = f;
    }

    public final void setSweepAngleAnimator$ui_kit_components_release(ValueAnimator valueAnimator) {
        this.sweepAngleAnimator = valueAnimator;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ArcGaugeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcGaugeView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f57106a = kli.a.l(context, 60.0f);
        float fL = kli.a.l(context, 38.0f);
        this.f57107b = fL;
        float fL2 = kli.a.l(context, 8.0f);
        this.f57108c = d.c((2 * fL) + kli.a.k(context, 192.0f));
        this.d = kli.a.s(R$attr.uikit_colorStatusWarning, context);
        this.e = kli.a.s(R$attr.uikit_colorStatusSuccess, context);
        this.f = kli.a.s(kli.a.q(context) ? R$attr.uikit_colorWhite : R$attr.uikit_colorAccent, context);
        this.f57109g = new RectF();
        this.f57110h = new RectF();
        this.i = new RectF();
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(fL2);
        this.f57111j = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        paint2.setStrokeWidth(fL2);
        this.k = paint2;
        Paint paint3 = new Paint();
        paint3.setStyle(style);
        paint3.setMaskFilter(new BlurMaskFilter(kli.a.l(context, 16.0f), BlurMaskFilter.Blur.NORMAL));
        this.f57112l = paint3;
        Paint paint4 = new Paint();
        paint4.setStyle(Paint.Style.FILL);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f57113m = paint4;
        this.f57114n = new int[]{0, 0, 0, 0};
    }

    public /* synthetic */ ArcGaugeView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
