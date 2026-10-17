package com.revolut.core.ui_kit.internal.animation;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import jq0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0013B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/revolut/core/ui_kit/internal/animation/BlinkingDotsAnimation;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "size", "", "setDotSize", "(F)V", "gap", "setDotGap", "Companion", "jq0/f", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BlinkingDotsAnimation extends View {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f55839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f55840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f55841c;
    public AnimatorSet d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f55842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f[] f55843h;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlinkingDotsAnimation(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        if (this.f55841c) {
            AnimatorSet animatorSet = this.d;
            if (animatorSet != null) {
                if (animatorSet.isStarted()) {
                    return;
                }
                animatorSet.setupStartValues();
                animatorSet.start();
                return;
            }
            f[] fVarArr = this.f55843h;
            int length = fVarArr.length;
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setDuration(1800L);
                valueAnimator.setRepeatCount(-1);
                valueAnimator.setRepeatMode(1);
                valueAnimator.setStartDelay(((long) i) * 200);
                f fVar = fVarArr[i];
                valueAnimator.setValues(new PropertyValuesHolder[0]);
                int i2 = this.f;
                int iB = io0.a.b(0.8f, i2);
                int i3 = this.e;
                PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt("color", i3, i2, i2, iB, i3);
                propertyValuesHolderOfInt.setEvaluator(new ArgbEvaluator());
                float f = this.f55840b;
                PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat("radius", f, 0.8f * f, f, 1.4f * f, f);
                float f4 = this.f55840b;
                valueAnimator.setValues(propertyValuesHolderOfInt, propertyValuesHolderOfFloat, PropertyValuesHolder.ofFloat("blur", BitmapDescriptorFactory.HUE_RED, 0.3f * f4, BitmapDescriptorFactory.HUE_RED, f4 * 0.5f, BitmapDescriptorFactory.HUE_RED));
                valueAnimator.addUpdateListener(fVar);
                arrayList.add(valueAnimator);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            animatorSet2.start();
            this.d = animatorSet2;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float f = this.f55840b * 2;
        f[] fVarArr = this.f55843h;
        int length = fVarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            f fVar = fVarArr[i];
            int i3 = i2 + 1;
            float f4 = (i2 * f) + (this.f55839a * i3) + this.f55840b;
            int i5 = fVar.f177356b;
            Paint paint = this.f55842g;
            paint.setColor(i5);
            paint.setMaskFilter(fVar.d == BitmapDescriptorFactory.HUE_RED ? null : new BlurMaskFilter(fVar.d, BlurMaskFilter.Blur.NORMAL));
            canvas.drawCircle(f4, getHeight() / 2.0f, fVar.f177357c, paint);
            i++;
            i2 = i3;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float f = 2;
        float f4 = this.f55840b * f;
        setMeasuredDimension(View.resolveSize((int) ((4 * this.f55839a) + (3 * f4)), i), View.resolveSize((int) (f4 * f), i2));
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        this.f55841c = z;
        if (!z) {
            AnimatorSet animatorSet = this.d;
            if (animatorSet != null) {
                animatorSet.cancel();
                return;
            }
            return;
        }
        for (f fVar : this.f55843h) {
            fVar.f177356b = this.e;
            fVar.f177357c = this.f55840b;
            fVar.d = BitmapDescriptorFactory.HUE_RED;
        }
        a();
    }

    public final void setDotGap(float gap) {
        if (this.f55839a == gap) {
            return;
        }
        this.f55839a = gap;
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d = null;
        a();
        requestLayout();
    }

    public final void setDotSize(float size) {
        float f = 2;
        if (size == this.f55840b / f) {
            return;
        }
        this.f55840b = size / f;
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.d = null;
        for (f fVar : this.f55843h) {
            fVar.f177356b = this.e;
            fVar.f177357c = this.f55840b;
            fVar.d = BitmapDescriptorFactory.HUE_RED;
        }
        a();
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlinkingDotsAnimation(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlinkingDotsAnimation(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f55839a = kli.a.l(context, 5.0f);
        this.f55840b = kli.a.l(context, 2.5f);
        this.e = kli.a.s(R$attr.uikit_colorGreyTone20, context);
        this.f = kli.a.s(R$attr.uikit_colorAccentNeutral, context);
        this.f55842g = new Paint(1);
        f[] fVarArr = new f[3];
        for (int i2 = 0; i2 < 3; i2++) {
            fVarArr[i2] = new f(this, this.e, this.f55840b);
        }
        this.f55843h = fVarArr;
        setLayerType(1, null);
    }

    public /* synthetic */ BlinkingDotsAnimation(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
