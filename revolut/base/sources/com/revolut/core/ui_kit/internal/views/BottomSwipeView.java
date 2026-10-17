package com.revolut.core.ui_kit.internal.views;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import au0.b5;
import au0.l5;
import aw0.v1;
import az0.o0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import e8.q;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import ms0.r;
import or0.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001/B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u001b\u0010\u0010\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010%R\u001b\u0010(\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0019\u001a\u0004\b'\u0010\u001bR\u0017\u0010-\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/BottomSwipeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "", "setText", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "icon", "setIcon", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "Law0/v1;", "colorScheme", "setColorScheme", "(Law0/v1;)V", "Landroidx/constraintlayout/widget/Guideline;", "b", "Le8/q;", "getGuidelineTop", "()Landroidx/constraintlayout/widget/Guideline;", "guidelineTop", "Landroid/widget/TextView;", "f", "getText", "()Landroid/widget/TextView;", "text", "Landroid/widget/ImageView;", "g", "getIcon", "()Landroid/widget/ImageView;", "h", "getGuidelineBottom", "guidelineBottom", "j", "I", "getCornerRadius", "()I", "cornerRadius", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BottomSwipeView extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final q guidelineTop;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final q text;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final q icon;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final q guidelineBottom;
    public AnimatorSet i;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final int cornerRadius;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomSwipeView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void f0(BottomSwipeView bottomSwipeView, float f, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) z9h.n.g(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        bottomSwipeView.getIcon().setAlpha(fFloatValue);
        bottomSwipeView.getIcon().setTranslationY(fFloatValue * f);
    }

    public static void g0(BottomSwipeView bottomSwipeView, ValueAnimator it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        ImageView icon = bottomSwipeView.getIcon();
        Object animatedValue = it8.getAnimatedValue();
        Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        icon.setAlpha(((Float) animatedValue).floatValue());
    }

    private final Guideline getGuidelineBottom() {
        return (Guideline) this.guidelineBottom.f();
    }

    private final Guideline getGuidelineTop() {
        return (Guideline) this.guidelineTop.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageView getIcon() {
        return (ImageView) this.icon.f();
    }

    private final TextView getText() {
        return (TextView) this.text.f();
    }

    public final int getCornerRadius() {
        return this.cornerRadius;
    }

    public final void i0() {
        AnimatorSet animatorSet = this.i;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.i = null;
    }

    public final void j0() {
        ShapeAppearanceModel.Builder builder = new ShapeAppearanceModel.Builder();
        int i = this.cornerRadius;
        ShapeAppearanceModel shapeAppearanceModelBuild = builder.setTopEdge(new er0.a(i)).build();
        Intrinsics.checkNotNullExpressionValue(shapeAppearanceModelBuild, "build(...)");
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModelBuild);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        materialShapeDrawable.setTint(kli.a.s(R$attr.uikit_colorBlack, context));
        materialShapeDrawable.setPaintStyle(Paint.Style.FILL);
        setBackground(materialShapeDrawable);
        Guideline guidelineTop = getGuidelineTop();
        ViewGroup.LayoutParams layoutParams = guidelineTop.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.guideBegin = i;
        guidelineTop.setLayoutParams(layoutParams2);
    }

    public final void l0(int i) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 120.0f);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iK2 = kli.a.k(context2, 88.0f);
        if (iK - i < iK2) {
            iK = iK2 + i;
        }
        u.w(iK, this);
        ViewGroup.LayoutParams layoutParams = getGuidelineBottom().getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        if (((ConstraintLayout.LayoutParams) layoutParams).guideEnd != i) {
            Guideline guidelineBottom = getGuidelineBottom();
            ViewGroup.LayoutParams layoutParams2 = guidelineBottom.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
            layoutParams3.guideEnd = i;
            guidelineBottom.setLayoutParams(layoutParams3);
        }
    }

    public final void m0() {
        i0();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float fK = kli.a.k(context, 8.0f);
        getIcon().setTranslationY(fK);
        getIcon().setAlpha(BitmapDescriptorFactory.HUE_RED);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setStartDelay(500L);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addListener(new hx0.k(this, fK, 1));
        valueAnimatorOfFloat.addUpdateListener(new b5(this, 22));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat2.setDuration(500L);
        valueAnimatorOfFloat2.setStartDelay(500L);
        valueAnimatorOfFloat2.addUpdateListener(new ms0.q(this, fK));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        animatorSet.addListener(new l5(ref$BooleanRef, 14));
        animatorSet.addListener(new o0(ref$BooleanRef, animatorSet, 6));
        animatorSet.start();
        this.i = animatorSet;
    }

    public final void setColorScheme(@NotNull v1 colorScheme) {
        int i;
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i2 = r.f208390a[colorScheme.ordinal()];
        if (i2 == 1) {
            i = R$attr.uikit_colorWhite;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.uikit_colorBlack;
        }
        int iS = kli.a.s(i, context);
        rd0.e.q(getIcon(), Integer.valueOf(iS));
        getText().setTextColor(iS);
    }

    public final void setIcon(@NotNull Image icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        zi0.c.g(getIcon(), icon);
    }

    public final void setText(Clause clause) {
        kli.a.b(getText(), clause, ty0.f.f275450a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BottomSwipeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSwipeView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.guidelineTop = kli.a.J(R$id.bottomSwipeView_guidelineTop, this);
        this.text = kli.a.J(R$id.bottomSwipeView_text, this);
        this.icon = kli.a.J(R$id.bottomSwipeView_icon, this);
        this.guidelineBottom = kli.a.J(R$id.bottomSwipeView_guidelineBottom, this);
        this.cornerRadius = kli.a.k(context, 16.0f);
        View.inflate(context, R$layout.internal_view_bottom_swipe, this);
    }

    public /* synthetic */ BottomSwipeView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
