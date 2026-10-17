package ms0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.internal.views.animated_numbers.AnimatedNumbersView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextPresentation;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends FrameLayout {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UIKitTextView f208194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AnimatedNumbersView f208195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextPresentation f208196c;
    public boolean d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f208197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f208198h;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final AnimatedNumbersView getOrCreateAnimatedTextView() {
        AnimatedNumbersView animatedNumbersView = this.f208195b;
        if (animatedNumbersView == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            animatedNumbersView = new AnimatedNumbersView(context, null, 6, 0);
            this.f208195b = animatedNumbersView;
            int i = this.e;
            if (i != -1) {
                animatedNumbersView.setTextAppearance(i);
            }
            UIKitTextView uIKitTextView = this.f208194a;
            animatedNumbersView.setIncludeFontPadding$ui_kit_components_release(uIKitTextView.getIncludeFontPadding());
            animatedNumbersView.setTextSizePx(uIKitTextView.getTextSize());
            animatedNumbersView.setGravity(this.f208197g);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            animatedNumbersView.setTextColor(kli.a.s(this.f, context2));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = this.f208197g;
            addView(animatedNumbersView, layoutParams);
        }
        return animatedNumbersView;
    }

    public static /* synthetic */ void setTextColorAttr$default(c cVar, int i, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = R$attr.uikit_colorForeground;
        }
        cVar.setTextColorAttr(i);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, ns0.b] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, ns0.b] */
    public final void a(TextPresentation textPresentation, TextPresentation textPresentation2, boolean z) {
        TextPresentation.Animated animated = (TextPresentation.Animated) textPresentation;
        ty0.c.b(or0.u.k(this).b0(), animated.f57952a, this.f208194a, null, null, 12);
        boolean z3 = this.d;
        this.d = z;
        UIKitTextView uIKitTextView = this.f208194a;
        if (!z) {
            AnimatedNumbersView animatedNumbersView = this.f208195b;
            if (animatedNumbersView != null) {
                animatedNumbersView.f56507s = false;
                animatedNumbersView.f56501l.cancel();
                animatedNumbersView.setClauseImmediately$ui_kit_components_release(animated.f57952a);
                animatedNumbersView.setVisibility(8);
            }
            uIKitTextView.setVisibility(0);
            return;
        }
        uIKitTextView.setVisibility(8);
        AnimatedNumbersView orCreateAnimatedTextView = getOrCreateAnimatedTextView();
        if (z3) {
            Clause clause = textPresentation2 != null ? ((TextPresentation.Animated) textPresentation2).f57952a : null;
            Clause clause2 = animated.f57952a;
            if (!Intrinsics.f(clause, clause2)) {
                orCreateAnimatedTextView.setCurrentClause(clause2);
            }
        } else {
            orCreateAnimatedTextView.f56507s = false;
            orCreateAnimatedTextView.f56501l.cancel();
            orCreateAnimatedTextView.setClauseImmediately$ui_kit_components_release(animated.f57952a);
            orCreateAnimatedTextView.setAnimateSpin(true);
        }
        orCreateAnimatedTextView.setVisibility(0);
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View child, int i, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(child, "child");
        if (child != this.f208195b || !this.d || (this.f208197g & 7) != 1 || View.MeasureSpec.getMode(i) != 1073741824) {
            super.measureChildWithMargins(child, i, i2, i3, i5);
            return;
        }
        ViewGroup.LayoutParams layoutParams = ((AnimatedNumbersView) child).getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        child.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, -1), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    public final void setAnimationAvailability(@NotNull b availability) {
        Intrinsics.checkNotNullParameter(availability, "availability");
        if (this.f208198h == availability) {
            return;
        }
        this.f208198h = availability;
        TextPresentation textPresentation = this.f208196c;
        if (textPresentation != null) {
            a(textPresentation, textPresentation, (textPresentation instanceof TextPresentation.Animated) && (availability == b.Always || ((Boolean) jo0.g.R.getValue()).booleanValue()));
        }
    }

    public final void setGravity(int i) {
        if (this.f208197g == i) {
            return;
        }
        this.f208197g = i;
        UIKitTextView uIKitTextView = this.f208194a;
        ViewGroup.LayoutParams layoutParams = uIKitTextView.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.gravity = i;
            uIKitTextView.setLayoutParams(layoutParams2);
        }
        AnimatedNumbersView animatedNumbersView = this.f208195b;
        if (animatedNumbersView != null) {
            animatedNumbersView.setGravity(i);
            ViewGroup.LayoutParams layoutParams3 = animatedNumbersView.getLayoutParams();
            FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                layoutParams4.gravity = i;
                animatedNumbersView.setLayoutParams(layoutParams4);
            }
        }
        requestLayout();
    }

    public final void setTextAppearance(int i) {
        this.e = i;
        jb3.l.e(this.f208194a, i);
        AnimatedNumbersView animatedNumbersView = this.f208195b;
        if (animatedNumbersView != null) {
            animatedNumbersView.setTextAppearance(i);
        }
    }

    public final void setTextColorAttr(int i) {
        this.f = i;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(i, context);
        this.f208194a.setTextColor(iS);
        AnimatedNumbersView animatedNumbersView = this.f208195b;
        if (animatedNumbersView != null) {
            animatedNumbersView.setTextColor(iS);
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void setTextPresentation(@NotNull TextPresentation presentation) {
        Intrinsics.checkNotNullParameter(presentation, "presentation");
        TextPresentation textPresentation = this.f208196c;
        boolean z = (presentation instanceof TextPresentation.Animated) && (this.f208198h == b.Always || ((Boolean) jo0.g.R.getValue()).booleanValue());
        if (Intrinsics.f(textPresentation, presentation) && this.d == z) {
            return;
        }
        this.f208196c = presentation;
        a(presentation, textPresentation, z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        UIKitTextView uIKitTextView = new UIKitTextView(context, null, 6, 0);
        addView(uIKitTextView, new FrameLayout.LayoutParams(-2, -2));
        this.f208194a = uIKitTextView;
        this.e = -1;
        this.f = R$attr.uikit_colorForeground;
        this.f208197g = 8388611;
        this.f208198h = b.FeatureGated;
        setClipChildren(false);
        setClipToPadding(false);
        uIKitTextView.setTextAlignment(5);
        int i2 = this.f208197g;
        ViewGroup.LayoutParams layoutParams = uIKitTextView.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.gravity = i2;
            uIKitTextView.setLayoutParams(layoutParams2);
        }
        setTextColorAttr(this.f);
    }

    public /* synthetic */ c(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
