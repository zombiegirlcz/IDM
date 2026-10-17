package com.onfido.android.sdk.capture.ui.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.ImageViewCompat;
import au0.p3;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.databinding.OnfidoLoadingViewBinding;
import com.onfido.android.sdk.capture.utils.ViewExtensionsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\u0018\u001a\n \u0019*\u0004\u0018\u00010\u00110\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001dH\u0014R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/onfido/android/sdk/capture/ui/widget/LoadingView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animationInterpolator", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "getAnimationInterpolator", "()Landroid/view/animation/AccelerateDecelerateInterpolator;", "animationInterpolator$delegate", "Lkotlin/Lazy;", "animatorsList", "", "Landroid/animation/ValueAnimator;", "binding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoLoadingViewBinding;", "maxCircleWidth", "getMaxCircleWidth", "()I", "maxCircleWidth$delegate", "createCircleAnimator", "kotlin.jvm.PlatformType", "delayMillis", "", "onAttachedToWindow", "", "onDetachedFromWindow", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LoadingView extends LinearLayout {
    private static final long DELAY_BETWEEN_ANIMATIONS_MS = 160;
    private static final long INFLATE_DEFLATE_ANIMATION_DURATION_MS = 600;

    /* JADX INFO: renamed from: animationInterpolator$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy animationInterpolator;

    @NotNull
    private final List<ValueAnimator> animatorsList;

    @NotNull
    private final OnfidoLoadingViewBinding binding;

    /* JADX INFO: renamed from: maxCircleWidth$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy maxCircleWidth;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoadingView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ValueAnimator createCircleAnimator(long delayMillis) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, getMaxCircleWidth());
        valueAnimatorOfInt.setDuration(INFLATE_DEFLATE_ANIMATION_DURATION_MS);
        valueAnimatorOfInt.setStartDelay(delayMillis);
        valueAnimatorOfInt.setInterpolator(getAnimationInterpolator());
        valueAnimatorOfInt.setRepeatCount(-1);
        valueAnimatorOfInt.setRepeatMode(2);
        return valueAnimatorOfInt;
    }

    public static /* synthetic */ ValueAnimator createCircleAnimator$default(LoadingView loadingView, long j2, int i, Object obj2) {
        if ((i & 1) != 0) {
            j2 = 0;
        }
        return loadingView.createCircleAnimator(j2);
    }

    private final AccelerateDecelerateInterpolator getAnimationInterpolator() {
        return (AccelerateDecelerateInterpolator) this.animationInterpolator.getValue();
    }

    private final int getMaxCircleWidth() {
        return ((Number) this.maxCircleWidth.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAttachedToWindow$lambda$5$lambda$4(LoadingView this$0, int i, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
        View childAt = this$0.binding.circlesContainer.getChildAt(i);
        Intrinsics.i(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
        View childAt2 = ((ViewGroup) childAt).getChildAt(0);
        Intrinsics.checkNotNullExpressionValue(childAt2, "getChildAt(...)");
        ViewExtensionsKt.changeLayoutParams(childAt2, new LoadingView$onAttachedToWindow$1$1$1(valueAnimator));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = 0;
        for (Object obj2 : this.animatorsList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            ValueAnimator valueAnimator = (ValueAnimator) obj2;
            valueAnimator.addUpdateListener(new p3(this, i, 2));
            valueAnimator.start();
            i = i2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (ValueAnimator valueAnimator : this.animatorsList) {
            valueAnimator.cancel();
            valueAnimator.removeAllListeners();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoadingView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingView(@NotNull Context context, AttributeSet attributeSet, int i) {
        Unit unit;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.maxCircleWidth = j.b(new LoadingView$maxCircleWidth$2(context));
        this.animationInterpolator = j.b(LoadingView$animationInterpolator$2.INSTANCE);
        this.animatorsList = new ArrayList();
        OnfidoLoadingViewBinding onfidoLoadingViewBindingInflate = OnfidoLoadingViewBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(onfidoLoadingViewBindingInflate, "inflate(...)");
        this.binding = onfidoLoadingViewBindingInflate;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.OnfidoLoadingView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.OnfidoLoadingView_onfidoText);
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.OnfidoLoadingView_onfidoColor, ContextCompat.getColor(context, R.color.onfidoPrimaryButtonColor));
        typedArrayObtainStyledAttributes.recycle();
        IntRange intRangeO = f.o(0, onfidoLoadingViewBindingInflate.circlesContainer.getChildCount());
        ArrayList arrayList = new ArrayList(w.t(intRangeO, 10));
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            int iNextInt = it8.nextInt();
            this.animatorsList.add(createCircleAnimator(((long) iNextInt) * DELAY_BETWEEN_ANIMATIONS_MS));
            View childAt = onfidoLoadingViewBindingInflate.circlesContainer.getChildAt(iNextInt);
            Intrinsics.i(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
            View childAt2 = ((ViewGroup) childAt).getChildAt(0);
            Intrinsics.i(childAt2, "null cannot be cast to non-null type android.widget.ImageView");
            ImageViewCompat.setImageTintList((ImageView) childAt2, ColorStateList.valueOf(color));
            arrayList.add(Unit.f186387a);
        }
        if (string != null) {
            onfidoLoadingViewBindingInflate.content.setText(string);
            unit = Unit.f186387a;
        } else {
            unit = null;
        }
        if (unit == null) {
            TextView content = onfidoLoadingViewBindingInflate.content;
            Intrinsics.checkNotNullExpressionValue(content, "content");
            ViewExtensionsKt.toGone$default(content, false, 1, null);
        }
    }

    public /* synthetic */ LoadingView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
