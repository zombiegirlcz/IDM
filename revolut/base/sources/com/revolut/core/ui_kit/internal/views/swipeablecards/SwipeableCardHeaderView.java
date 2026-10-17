package com.revolut.core.ui_kit.internal.views.swipeablecards;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.j;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.views.HorizontalStepsProgressView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$color;
import e8.q;
import ihm.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx0.c9;
import org.jetbrains.annotations.NotNull;
import v0.a;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/swipeablecards/SwipeableCardHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "percentage", "", "setProgress", "(F)V", "Landroid/view/View;", "f", "Le8/q;", "getCloseButton", "()Landroid/view/View;", "closeButton", "Lcom/revolut/core/ui_kit/views/HorizontalStepsProgressView;", "g", "getProgress", "()Lcom/revolut/core/ui_kit/views/HorizontalStepsProgressView;", "progress", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SwipeableCardHeaderView extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f57601b;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final q closeButton;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final q progress;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ValueAnimator f57603h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwipeableCardHeaderView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void f0(ValueAnimator valueAnimator, SwipeableCardHeaderView swipeableCardHeaderView, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        valueAnimator.setDuration(300L);
        HorizontalStepsProgressView progress = swipeableCardHeaderView.getProgress();
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.i(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        progress.setOverallProgress(((Float) animatedValue).floatValue());
    }

    private final View getCloseButton() {
        return this.closeButton.f();
    }

    private final HorizontalStepsProgressView getProgress() {
        return (HorizontalStepsProgressView) this.progress.f();
    }

    public final void setProgress(float percentage) {
        ValueAnimator valueAnimator = this.f57603h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f = percentage / 100.0f;
        if (Math.abs(percentage - (getProgress().getOverallProgress() * 100)) <= 2.0f) {
            getProgress().setOverallProgress(f);
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getProgress().getOverallProgress(), f);
        valueAnimatorOfFloat.addUpdateListener(new j(valueAnimatorOfFloat, this, 24));
        valueAnimatorOfFloat.start();
        this.f57603h = valueAnimatorOfFloat;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwipeableCardHeaderView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableCardHeaderView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f57601b = a.d("create(...)");
        this.closeButton = kli.a.J(R$id.swipeableCardsHeader_iconClose, this);
        this.progress = kli.a.J(R$id.swipeableCardsHeader_lineProgressIndicator, this);
        View.inflate(context, R$layout.internal_view_swipeable_cards_header, this);
        getProgress().setProgressBarRadiusDp(4.0f);
        getProgress().setBaseColor(context.getColor(R$color.internal_greyTone20_night));
        getProgress().setProgressColor(kli.a.s(R$attr.uikit_colorWhite, context));
        getCloseButton().setOnClickListener(new c9(this, 17));
    }

    public /* synthetic */ SwipeableCardHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
