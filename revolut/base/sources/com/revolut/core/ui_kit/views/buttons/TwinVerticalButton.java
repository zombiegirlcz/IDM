package com.revolut.core.ui_kit.views.buttons;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.j;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import aw0.k3;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.internal.drawables.BottomGradientDrawable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import dr0.g;
import e8.q;
import ihm.b;
import ihm.f;
import ix0.c2;
import ix0.w0;
import jb3.l;
import jq0.a;
import jq0.r;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ny0.h;
import ny0.k;
import oqk.c;
import or0.u;
import org.jetbrains.annotations.NotNull;
import ox0.b0;
import ox0.c0;
import ox0.d0;
import ox0.e0;
import ox0.f0;
import yhm.d;
import z9h.n;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 t2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004\u0010\u0012\u001fuJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0014\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\b2\b\b\u0001\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\b\b\u0001\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u0019J\u0015\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\rJ\u0017\u0010#\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"J\u0019\u0010&\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0004\b&\u0010'J\u0017\u0010&\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b&\u0010)J\u0015\u0010+\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020*¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\b2\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104J\u0015\u00106\u001a\u00020\b2\u0006\u00105\u001a\u00020\u0005¢\u0006\u0004\b6\u0010\rJ\u0015\u00109\u001a\u00020\b2\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\b2\b\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\b2\b\u0010@\u001a\u0004\u0018\u00010?¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\b2\b\u0010C\u001a\u0004\u0018\u000107¢\u0006\u0004\bD\u0010:J\u0017\u0010F\u001a\u00020\b2\b\u0010E\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bF\u0010)J\u0019\u0010G\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0004\bG\u0010'J\u0017\u0010G\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bG\u0010)J\u0017\u0010H\u001a\u00020\b2\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\bH\u00100J\u0017\u0010I\u001a\u00020\b2\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\bI\u00104J\u0015\u0010J\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020*¢\u0006\u0004\bJ\u0010,J\u0017\u0010L\u001a\u00020\b2\b\u0010K\u001a\u0004\u0018\u00010-¢\u0006\u0004\bL\u00100J\u0015\u0010M\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\bM\u0010\rJ\u0015\u0010N\u001a\u00020\b2\u0006\u00105\u001a\u00020\u0005¢\u0006\u0004\bN\u0010\rJ\u0015\u0010O\u001a\u00020\b2\u0006\u00108\u001a\u000207¢\u0006\u0004\bO\u0010:J\u0017\u0010P\u001a\u00020\b2\b\u0010<\u001a\u0004\u0018\u00010;¢\u0006\u0004\bP\u0010>J\u0017\u0010Q\u001a\u00020\b2\b\u0010@\u001a\u0004\u0018\u00010?¢\u0006\u0004\bQ\u0010BJ\u0017\u0010R\u001a\u00020\b2\b\u0010C\u001a\u0004\u0018\u000107¢\u0006\u0004\bR\u0010:J\u0017\u0010S\u001a\u00020\b2\b\u0010E\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bS\u0010)J\u0015\u0010T\u001a\u00020\b2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\bT\u00100J\u0017\u0010U\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bU\u0010)J\u001d\u0010Y\u001a\u00020\b2\u0006\u0010W\u001a\u00020V2\u0006\u0010X\u001a\u00020\u0005¢\u0006\u0004\bY\u0010ZJ\u0015\u0010[\u001a\u00020\b2\u0006\u00105\u001a\u00020\u0005¢\u0006\u0004\b[\u0010\rJ\u0015\u0010\\\u001a\u00020\b2\u0006\u00105\u001a\u00020\u0005¢\u0006\u0004\b\\\u0010\rR\u001b\u0010b\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u001b\u0010g\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010_\u001a\u0004\be\u0010fR\u001b\u0010l\u001a\u00020h8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u0010_\u001a\u0004\bj\u0010kR\u001b\u0010o\u001a\u00020h8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u0010_\u001a\u0004\bn\u0010kR\u001a\u0010p\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010s¨\u0006v"}, d2 = {"Lcom/revolut/core/ui_kit/views/buttons/TwinVerticalButton;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lvy0/a;", "Lix0/w0;", "Lny0/h;", "", "collapsed", "animate", "", "setCollapsed", "(ZZ)V", "collapsible", "setCollapsible", "(Z)V", "Lcom/revolut/core/ui_kit/models/Clause;", "description", "Lox0/b0;", "placement", "Lox0/d0;", "style", "setDescription", "(Lcom/revolut/core/ui_kit/models/Clause;Lox0/b0;Lox0/d0;)V", "", "color", "setDescriptionColor", "(I)V", "setGradientTint", "visibilityFlag", "setDescriptionVisibility", "visible", "setMainButtonVisible", "Lox0/e0;", "mode", "setMainButtonWidthMode$ui_kit_components_release", "(Lox0/e0;)V", "setMainButtonWidthMode", "", "text", "setMainButtonText", "(Ljava/lang/CharSequence;)V", "clause", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle;", "setMainButtonStyle", "(Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "setMainButtonIcon", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "Lcom/revolut/core/ui_kit/models/NewBadgeContent;", "badgeContent", "setMainButtonBadge", "(Lcom/revolut/core/ui_kit/models/NewBadgeContent;)V", "enabled", "setMainButtonEnabled", "", "tag", "setMainButtonLoadingTag", "(Ljava/lang/String;)V", "Law0/k3;", "strategy", "setMainButtonLoadingStrategy", "(Law0/k3;)V", "Landroid/os/Parcelable;", "context", "setMainButtonAnalyticsContext", "(Landroid/os/Parcelable;)V", "id", "setMainButtonCustomE2ETestId", "contentDescription", "setMainButtonContentDescription", "setSecondaryButtonText", "setSecondaryButtonImage", "setSecondaryButtonBadge", "setSecondaryButtonStyle", "icon", "setSecondaryButtonIcon", "setSecondaryButtonVisible", "setSecondaryButtonEnabled", "setSecondaryButtonLoadingTag", "setSecondaryButtonLoadingStrategy", "setSecondaryButtonAnalyticsContext", "setSecondaryButtonCustomE2ETestId", "setSecondaryButtonContentDescription", "setFabImage", "setFabLabel", "", "value", "animated", "setFabAbsoluteRotation", "(FZ)V", "setFabEnabled", "setGradientBackgroundEnabled", "Lcom/revolut/core/ui_kit/views/buttons/CollapsingActionButton;", "f", "Le8/q;", "getCollapsingActionButton", "()Lcom/revolut/core/ui_kit/views/buttons/CollapsingActionButton;", "collapsingActionButton", "Lcom/revolut/core/ui_kit/views/LargeActionButton;", "g", "getSecondaryActionButton", "()Lcom/revolut/core/ui_kit/views/LargeActionButton;", "secondaryActionButton", "Landroidx/appcompat/widget/AppCompatTextView;", "h", "getDescriptionTextView", "()Landroidx/appcompat/widget/AppCompatTextView;", "descriptionTextView", "i", "getFooterTextView", "footerTextView", "fitsReadableArea", "Z", "getFitsReadableArea", "()Z", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TwinVerticalButton extends ConstraintLayout implements vy0.a, w0, h {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f59013w = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2 f59014b;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final q collapsingActionButton;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final q secondaryActionButton;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final q descriptionTextView;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final q footerTextView;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f59017j;
    public final c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f59018l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final BottomGradientDrawable f59019m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b0 f59020n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f59021p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f59022q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f59023r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public gu0.a f59024s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SpringAnimation f59025t;
    public ValueAnimator u;
    public final k v;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TwinVerticalButton(@NotNull Context context) {
        this(context, null, 0, 14, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void f0(TwinVerticalButton twinVerticalButton, AppCompatTextView appCompatTextView, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) n.g(valueAnimator, "animator", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        twinVerticalButton.getSecondaryActionButton().setAlpha(fFloatValue);
        if (appCompatTextView != null) {
            appCompatTextView.setAlpha(fFloatValue);
        }
    }

    public static final void g0(TwinVerticalButton twinVerticalButton) {
        gu0.a aVar = twinVerticalButton.f59024s;
        if (aVar != null) {
            aVar.cancel();
        }
        twinVerticalButton.f59024s = null;
        SpringAnimation springAnimation = twinVerticalButton.f59025t;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        twinVerticalButton.f59025t = null;
        ValueAnimator valueAnimator = twinVerticalButton.u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        twinVerticalButton.u = null;
        twinVerticalButton.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        twinVerticalButton.getSecondaryActionButton().setAlpha(1.0f);
        twinVerticalButton.getDescriptionTextView().setAlpha(1.0f);
        twinVerticalButton.getFooterTextView().setAlpha(1.0f);
    }

    private final CollapsingActionButton getCollapsingActionButton() {
        return (CollapsingActionButton) this.collapsingActionButton.f();
    }

    private final AppCompatTextView getDescriptionTextView() {
        return (AppCompatTextView) this.descriptionTextView.f();
    }

    private final AppCompatTextView getFooterTextView() {
        return (AppCompatTextView) this.footerTextView.f();
    }

    private final LargeActionButton getSecondaryActionButton() {
        return (LargeActionButton) this.secondaryActionButton.f();
    }

    public static final void h0(TwinVerticalButton twinVerticalButton) {
        int height = (twinVerticalButton.getHeight() - twinVerticalButton.getPaddingBottom()) - twinVerticalButton.getCollapsingActionButton().getBottom();
        if (height < 0) {
            height = 0;
        }
        float f = height;
        AppCompatTextView appCompatTextViewJ0 = twinVerticalButton.j0();
        if (!twinVerticalButton.f59022q) {
            appCompatTextViewJ0 = null;
        }
        twinVerticalButton.getSecondaryActionButton().setAlpha(BitmapDescriptorFactory.HUE_RED);
        if (appCompatTextViewJ0 != null) {
            appCompatTextViewJ0.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
        if (f > BitmapDescriptorFactory.HUE_RED) {
            twinVerticalButton.setTranslationY(f);
            SpringAnimation springAnimation = new SpringAnimation(twinVerticalButton, DynamicAnimation.TRANSLATION_Y);
            SpringForce springForce = new SpringForce(BitmapDescriptorFactory.HUE_RED);
            springForce.setStiffness(150.0f);
            springForce.setDampingRatio(a.b.a(26.0f, 150.0f));
            springAnimation.setSpring(springForce);
            twinVerticalButton.f59025t = springAnimation;
            springAnimation.start();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(r.f177393b);
        valueAnimatorOfFloat.addUpdateListener(new j(twinVerticalButton, appCompatTextViewJ0, 23));
        twinVerticalButton.u = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    public static final void i0(TwinVerticalButton twinVerticalButton) {
        twinVerticalButton.getSecondaryActionButton().setVisibility(8);
        if (twinVerticalButton.f59022q) {
            twinVerticalButton.j0().setVisibility(8);
        }
    }

    public static /* synthetic */ void setDescription$default(TwinVerticalButton twinVerticalButton, Clause clause, b0 b0Var, d0 d0Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            b0Var = b0.ABOVE_BUTTONS;
        }
        if ((i & 4) != 0) {
            d0Var = d0.DEFAULT;
        }
        twinVerticalButton.setDescription(clause, b0Var, d0Var);
    }

    @Override // vy0.a
    public final boolean A() {
        return getCollapsingActionButton().A();
    }

    @Override // ny0.h
    public boolean getFitsReadableArea() {
        return false;
    }

    @Override // ix0.w0, ix0.v0
    public /* bridge */ boolean getInsetsAdjustable() {
        return super.getInsetsAdjustable();
    }

    @Override // vy0.a
    public final boolean i() {
        return getCollapsingActionButton().i();
    }

    public final AppCompatTextView j0() {
        int i = f0.f230480a[this.f59020n.ordinal()];
        if (i == 1) {
            return getDescriptionTextView();
        }
        if (i == 2) {
            return getFooterTextView();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final rr0.f l0() {
        return getCollapsingActionButton().V();
    }

    public final f m0() {
        return getCollapsingActionButton().d();
    }

    public final b n0() {
        return getCollapsingActionButton().e();
    }

    public final f o0() {
        return (f) getCollapsingActionButton().c();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(this.f59014b.c(insets));
        Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.v.b(i);
        if (this.f59018l == -1) {
            r0();
        }
        super.onMeasure(i, i2);
    }

    public final efm.r p0() {
        return getSecondaryActionButton().o;
    }

    public final void q0() {
        getCollapsingActionButton().X();
    }

    public final void r0() {
        int i = this.f59018l;
        boolean z = true;
        if (i != 1 && (i == 2 || getSecondaryActionButton().getVisibility() != 0)) {
            z = false;
        }
        g gVar = (z && getDescriptionTextView().getVisibility() == 0) ? g.LARGE : z ? g.DEFAULT : null;
        BottomGradientDrawable bottomGradientDrawable = this.f59019m;
        bottomGradientDrawable.c(gVar);
        setBackground(bottomGradientDrawable);
    }

    public final void s0() {
        boolean z = getCollapsingActionButton().b() && A();
        if (this.f59022q) {
            j0().setVisibility(z ? 8 : this.f59023r);
        }
    }

    @Override // vy0.a
    public void setCollapsed(boolean collapsed, boolean animate) {
        getCollapsingActionButton().setCollapsed(collapsed, animate);
        if (animate && getCollapsingActionButton().b()) {
            return;
        }
        t0();
    }

    @Override // vy0.a
    public void setCollapsible(boolean collapsible) {
        getCollapsingActionButton().setCollapsible(collapsible);
        if (this.o) {
            t0();
        }
    }

    public final void setDescription(Clause description, @NotNull b0 placement, @NotNull d0 style) {
        AppCompatTextView descriptionTextView;
        AppCompatTextView footerTextView;
        int i;
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f59020n = placement;
        int i2 = f0.f230480a[placement.ordinal()];
        if (i2 == 1) {
            descriptionTextView = getDescriptionTextView();
            footerTextView = getFooterTextView();
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            descriptionTextView = getFooterTextView();
            footerTextView = getDescriptionTextView();
        }
        AppCompatTextView appCompatTextView = descriptionTextView;
        style.getClass();
        Intrinsics.checkNotNullParameter(placement, "placement");
        int i3 = c0.f230475b[style.ordinal()];
        if (i3 == 1) {
            int i5 = c0.f230474a[placement.ordinal()];
            if (i5 == 1) {
                i = R$attr.internal_textAppearanceBody3;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$attr.internal_textAppearanceBody2;
            }
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.internal_textAppearanceBody3;
        }
        l.e(appCompatTextView, i);
        ty0.c.b(u.k(this).b0(), description, appCompatTextView, this.k, null, 8);
        u.c(appCompatTextView, description);
        u.c(footerTextView, null);
        this.f59022q = description != null;
        this.f59023r = appCompatTextView.getVisibility();
        t0();
        r0();
    }

    public final void setDescriptionColor(int color) {
        int i = f0.f230480a[this.f59020n.ordinal()];
        if (i == 1) {
            getDescriptionTextView().setTextColor(color);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            getFooterTextView().setTextColor(color);
        }
    }

    public final void setDescriptionVisibility(int visibilityFlag) {
        this.f59023r = visibilityFlag;
        s0();
    }

    public final void setFabAbsoluteRotation(float value, boolean animated) {
        getCollapsingActionButton().setFabAbsoluteRotation(value, animated);
    }

    public final void setFabEnabled(boolean enabled) {
        getCollapsingActionButton().setFabEnabled(enabled);
    }

    public final void setFabImage(@NotNull Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        getCollapsingActionButton().setFabImage(image);
        if (this.o) {
            t0();
        }
    }

    public final void setFabLabel(Clause clause) {
        getCollapsingActionButton().setFabLabel(clause);
    }

    public final void setGradientBackgroundEnabled(boolean enabled) {
        int i = enabled ? 1 : 2;
        if (i != this.f59018l) {
            this.f59018l = i;
            r0();
        }
    }

    public final void setGradientTint(int color) {
        this.f59019m.setTint(color);
    }

    public final void setMainButtonAnalyticsContext(Parcelable context) {
        getCollapsingActionButton().setLargeButtonAnalyticsContext(context);
    }

    public final void setMainButtonBadge(NewBadgeContent badgeContent) {
        getCollapsingActionButton().setLargeButtonBadge(badgeContent);
    }

    public final void setMainButtonContentDescription(Clause contentDescription) {
        pd.b.p(getCollapsingActionButton(), contentDescription);
    }

    public final void setMainButtonCustomE2ETestId(String id10) {
        getCollapsingActionButton().setLargeButtonCustomE2ETestId(id10);
    }

    public final void setMainButtonEnabled(boolean enabled) {
        getCollapsingActionButton().setLargeButtonEnabled(enabled);
    }

    public final void setMainButtonIcon(Image image) {
        getCollapsingActionButton().setLargeButtonIcon(image);
    }

    public final void setMainButtonLoadingStrategy(k3 strategy) {
        getCollapsingActionButton().setLargeButtonLoadingStrategy(strategy);
    }

    public final void setMainButtonLoadingTag(@NotNull String tag2) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        getCollapsingActionButton().setLoadingButtonTag(tag2);
    }

    public final void setMainButtonStyle(@NotNull LargeActionButton.ButtonStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        getCollapsingActionButton().setLargeButtonStyle(style);
    }

    @d
    public final void setMainButtonText(CharSequence text) {
        getCollapsingActionButton().setLargeButtonText(text);
    }

    public final void setMainButtonVisible(boolean visible) {
        getCollapsingActionButton().setVisibility(visible ? 0 : 8);
    }

    public final void setMainButtonWidthMode$ui_kit_components_release(@NotNull e0 mode) {
        int i;
        Intrinsics.checkNotNullParameter(mode, "mode");
        int i2 = f0.f230481b[mode.ordinal()];
        if (i2 == 1) {
            i = -1;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = -2;
        }
        if (getCollapsingActionButton().getWidth() != i) {
            CollapsingActionButton collapsingActionButton = getCollapsingActionButton();
            ViewGroup.LayoutParams layoutParams = collapsingActionButton.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = i;
            collapsingActionButton.setLayoutParams(layoutParams);
        }
    }

    public final void setSecondaryButtonAnalyticsContext(Parcelable context) {
        getSecondaryActionButton().setAnalyticsContext(context);
    }

    public final void setSecondaryButtonBadge(NewBadgeContent badgeContent) {
        getSecondaryActionButton().setBadge(badgeContent);
    }

    public final void setSecondaryButtonContentDescription(Clause contentDescription) {
        pd.b.p(getSecondaryActionButton(), contentDescription);
    }

    public final void setSecondaryButtonCustomE2ETestId(String id10) {
        getSecondaryActionButton().setCustomE2ETestId(id10);
    }

    public final void setSecondaryButtonEnabled(boolean enabled) {
        getSecondaryActionButton().setEnabled(enabled);
    }

    public final void setSecondaryButtonIcon(Image icon) {
        getSecondaryActionButton().setIcon(icon);
    }

    public final void setSecondaryButtonImage(Image image) {
        getSecondaryActionButton().setIcon(image);
    }

    public final void setSecondaryButtonLoadingStrategy(k3 strategy) {
        getSecondaryActionButton().setLoadingStrategy(strategy);
    }

    public final void setSecondaryButtonLoadingTag(@NotNull String tag2) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        getSecondaryActionButton().setLoadingButtonTag(tag2);
    }

    public final void setSecondaryButtonStyle(@NotNull LargeActionButton.ButtonStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        getSecondaryActionButton().o(style);
    }

    @d
    public final void setSecondaryButtonText(CharSequence text) {
        getSecondaryActionButton().setText(text);
    }

    public final void setSecondaryButtonVisible(boolean visible) {
        this.f59021p = visible;
        t0();
        r0();
    }

    public final void t0() {
        getSecondaryActionButton().setVisibility(this.f59021p && !(getCollapsingActionButton().b() && A()) ? 0 : 8);
        s0();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TwinVerticalButton(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setMainButtonText(Clause clause) {
        getCollapsingActionButton().setLargeButtonText(clause);
    }

    public final void setSecondaryButtonText(Clause clause) {
        getSecondaryActionButton().setText(clause);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TwinVerticalButton(@NotNull Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, kotlin.Lazy] */
    public TwinVerticalButton(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        int i5 = R$style.InternalActionFooterView;
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, i, i5);
        this.f59014b = new c2(this);
        this.collapsingActionButton = kli.a.J(R$id.collapsingActionButton, this);
        this.secondaryActionButton = kli.a.J(R$id.secondaryActionButton, this);
        this.descriptionTextView = kli.a.J(R$id.twinVertical_description, this);
        this.footerTextView = kli.a.J(R$id.twinVertical_footer, this);
        this.f59017j = v0.a.d("create(...)");
        this.k = new c(this, 27);
        this.f59018l = -1;
        this.f59019m = new BottomGradientDrawable(context);
        this.f59020n = b0.ABOVE_BUTTONS;
        boolean zBooleanValue = ((Boolean) jo0.g.Q.getValue()).booleanValue();
        this.o = zBooleanValue;
        om4.d0 d0Var = new om4.d0(this, 1);
        k kVar = new k(this);
        this.v = kVar;
        View.inflate(context, R$layout.internal_view_twin_vertical_button, this);
        setWillNotDraw(false);
        setClipToPadding(false);
        setClipChildren(false);
        AppCompatTextView descriptionTextView = getDescriptionTextView();
        ix0.c0 c0Var = ix0.c0.f169220a;
        descriptionTextView.setMovementMethod(c0Var);
        getFooterTextView().setMovementMethod(c0Var);
        this.f59021p = getSecondaryActionButton().getVisibility() == 0;
        kVar.d(true);
        if (zBooleanValue) {
            getCollapsingActionButton().setFormButtonRevealCallback$ui_kit_components_release(d0Var);
        }
    }
}
