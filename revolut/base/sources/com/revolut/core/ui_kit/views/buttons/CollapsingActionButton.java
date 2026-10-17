package com.revolut.core.ui_kit.views.buttons;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import aw0.k3;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.FormsActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import e8.q;
import efm.r;
import ie.b0;
import ihm.b;
import ix0.c2;
import ix0.w0;
import jr0.i;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import no.f2;
import org.jetbrains.annotations.NotNull;
import ox0.h;
import ox0.t;
import ox0.u;
import rr0.d;
import rr0.f;
import rr0.g;
import twg.c;
import vc.s;
import vy0.a;
import yhm.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B'\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0016\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0016\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u00112\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00112\b\u0010\b\u001a\u0004\u0018\u00010+¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00112\b\u0010.\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b/\u0010\u0013J\u0017\u00102\u001a\u00020\u00112\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b4\u0010\"J\u0017\u00105\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b5\u0010\u001aJ\u0015\u00107\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u000206¢\u0006\u0004\b7\u00108J\u001d\u0010<\u001a\u00020\u00112\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020'¢\u0006\u0004\b<\u0010=J\u0015\u0010>\u001a\u00020\u00112\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b>\u0010*J\u0019\u0010C\u001a\u00020\u00112\b\u0010@\u001a\u0004\u0018\u00010?H\u0000¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\u00112\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\bD\u0010*J\u001f\u0010G\u001a\u00020\u00112\u0006\u0010E\u001a\u00020'2\u0006\u0010F\u001a\u00020'H\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020\u00112\u0006\u0010I\u001a\u00020'H\u0016¢\u0006\u0004\bJ\u0010*R\u001b\u0010P\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u001b\u0010U\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010M\u001a\u0004\bS\u0010TR\u001b\u0010[\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^¨\u0006`"}, d2 = {"Lcom/revolut/core/ui_kit/views/buttons/CollapsingActionButton;", "Landroid/widget/FrameLayout;", "Lvy0/a;", "Lsy0/a;", "Lrr0/d;", "Lix0/w0;", "Ljr0/i;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "tag", "", "setLoadingButtonTag", "(Ljava/lang/String;)V", "", "text", "setLargeButtonText", "(Ljava/lang/CharSequence;)V", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle;", "style", "setLargeButtonStyle", "(Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "setLargeButtonIcon", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "Lcom/revolut/core/ui_kit/models/NewBadgeContent;", "badgeContent", "setLargeButtonBadge", "(Lcom/revolut/core/ui_kit/models/NewBadgeContent;)V", "", "enabled", "setLargeButtonEnabled", "(Z)V", "Landroid/os/Parcelable;", "setLargeButtonAnalyticsContext", "(Landroid/os/Parcelable;)V", "id", "setLargeButtonCustomE2ETestId", "Law0/k3;", "strategy", "setLargeButtonLoadingStrategy", "(Law0/k3;)V", "setFabImage", "setFabLabel", "Lcom/revolut/core/ui_kit/views/buttons/FormsActionButton$a;", "setFabStyle", "(Lcom/revolut/core/ui_kit/views/buttons/FormsActionButton$a;)V", "", "value", "animated", "setFabAbsoluteRotation", "(FZ)V", "setFabEnabled", "Lox0/u;", "callback", "setFormButtonRevealCallback$ui_kit_components_release", "(Lox0/u;)V", "setFormButtonRevealCallback", "setEnabled", "collapsed", "animate", "setCollapsed", "(ZZ)V", "collapsible", "setCollapsible", "Lcom/revolut/core/ui_kit/views/LargeActionButton;", "b", "Le8/q;", "getLargeActionButton", "()Lcom/revolut/core/ui_kit/views/LargeActionButton;", "largeActionButton", "Lcom/revolut/core/ui_kit/views/buttons/FormsActionButton;", "c", "getFormsActionButton", "()Lcom/revolut/core/ui_kit/views/buttons/FormsActionButton;", "formsActionButton", "Lox0/t;", "f", "Lkotlin/Lazy;", "getAnimationController", "()Lox0/t;", "animationController", "Ljr0/g;", "getGlowHighlightManager", "()Ljr0/g;", "glowHighlightManager", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CollapsingActionButton extends FrameLayout implements a, sy0.a, d, w0, i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f58976h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f58977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final q largeActionButton;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final q formsActionButton;
    public final g d;
    public final boolean e;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final Lazy animationController;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u f58980g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollapsingActionButton(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static t a(Context context, CollapsingActionButton collapsingActionButton) {
        t tVar = new t(context, collapsingActionButton, collapsingActionButton.getFormsActionButton(), collapsingActionButton.getLargeActionButton(), collapsingActionButton.e, new os2.a(collapsingActionButton, 8));
        tVar.s(collapsingActionButton.f58980g);
        return tVar;
    }

    private final t getAnimationController() {
        return (t) this.animationController.getValue();
    }

    private final FormsActionButton getFormsActionButton() {
        return (FormsActionButton) this.formsActionButton.f();
    }

    private final LargeActionButton getLargeActionButton() {
        return (LargeActionButton) this.largeActionButton.f();
    }

    @Override // vy0.a
    public final boolean A() {
        return getAnimationController().k();
    }

    @Override // rr0.d
    public final void L(boolean z) {
        getFormsActionButton().setProgressVisible(z);
        getLargeActionButton().L(z);
    }

    @Override // sy0.a
    public final f V() {
        f();
        return this.d.V();
    }

    public final boolean b() {
        return getAnimationController().m();
    }

    public final r c() {
        return getLargeActionButton().o;
    }

    public final ihm.f d() {
        return getFormsActionButton().f58987s;
    }

    public final b e() {
        return getAnimationController().n();
    }

    public final void f() {
        View view = getAnimationController().i() ? getFormsActionButton() : getLargeActionButton();
        g gVar = this.d;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(view, "view");
        gVar.f(new c(view));
    }

    @Override // jr0.i
    @NotNull
    public jr0.g getGlowHighlightManager() {
        return getLargeActionButton().getGlowHighlightManager();
    }

    @Override // ix0.w0, ix0.v0
    public /* bridge */ boolean getInsetsAdjustable() {
        return super.getInsetsAdjustable();
    }

    @Override // vy0.a
    public final boolean i() {
        return getAnimationController().l();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(this.f58977a.c(insets));
        Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        getAnimationController().f();
        super.onDetachedFromWindow();
    }

    @Override // vy0.a
    public void setCollapsed(boolean collapsed, boolean animate) {
        getAnimationController().p(collapsed, animate);
    }

    @Override // vy0.a
    public void setCollapsible(boolean collapsible) {
        getAnimationController().q(collapsible);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        getLargeActionButton().setEnabled(enabled);
        getFormsActionButton().setEnabled(enabled);
    }

    public final void setFabAbsoluteRotation(float value, boolean animated) {
        if (animated) {
            Intrinsics.h(getFormsActionButton().animate().rotation(value));
        } else {
            getFormsActionButton().setRotation(value);
        }
    }

    public final void setFabEnabled(boolean enabled) {
        getFormsActionButton().setEnabled(enabled);
    }

    public final void setFabImage(Image image) {
        ViewGroup.LayoutParams layoutParams = getFormsActionButton().getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        boolean z = this.e;
        if (layoutParams2 != null) {
            int i = (z && h.a(image)) ? 17 : 8388613;
            if (layoutParams2.gravity != i) {
                layoutParams2.gravity = i;
                getFormsActionButton().setLayoutParams(layoutParams2);
            }
        }
        if (z) {
            getAnimationController().r(image);
        } else {
            getFormsActionButton().setImage(image);
        }
    }

    public final void setFabLabel(Clause clause) {
        getFormsActionButton().setLabel(clause);
    }

    public final void setFabStyle(@NotNull FormsActionButton.a style) {
        Intrinsics.checkNotNullParameter(style, "style");
        getFormsActionButton().f(style);
    }

    public final void setFormButtonRevealCallback$ui_kit_components_release(u callback) {
        this.f58980g = callback;
        getAnimationController().s(callback);
    }

    public final void setLargeButtonAnalyticsContext(Parcelable context) {
        getLargeActionButton().setAnalyticsContext(context);
    }

    public final void setLargeButtonBadge(NewBadgeContent badgeContent) {
        getLargeActionButton().setBadge(badgeContent);
    }

    public final void setLargeButtonCustomE2ETestId(String id10) {
        getLargeActionButton().setCustomE2ETestId(id10);
    }

    public final void setLargeButtonEnabled(boolean enabled) {
        getLargeActionButton().setEnabled(enabled);
    }

    public final void setLargeButtonIcon(Image image) {
        getLargeActionButton().setIcon(image);
    }

    public final void setLargeButtonLoadingStrategy(k3 strategy) {
        getLargeActionButton().setLoadingStrategy(strategy);
    }

    public final void setLargeButtonStyle(@NotNull LargeActionButton.ButtonStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        getLargeActionButton().o(style);
    }

    public final void setLargeButtonText(CharSequence text) {
        getLargeActionButton().setText(text);
    }

    public final void setLoadingButtonTag(@NotNull String tag2) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        setTag(tag2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollapsingActionButton(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setLargeButtonText(Clause clause) {
        getLargeActionButton().setText(clause);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollapsingActionButton(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58977a = new c2(this);
        this.largeActionButton = kli.a.J(R$id.largeActionButton, this);
        this.formsActionButton = kli.a.J(R$id.formsActionButton, this);
        this.d = s.b(this, true);
        this.e = ((Boolean) jo0.g.k().getValue()).booleanValue();
        this.animationController = j.b(new bmm.t(context, this, 11));
        View.inflate(context, R$layout.internal_view_collapsing_button, this);
        setClipToPadding(false);
        setClipChildren(false);
        r.merge(getFormsActionButton().f58987s, getLargeActionButton().o).subscribe(new b0(new f2(this, 2), 29));
        getLargeActionButton().setLoadingButtonPriority$ui_kit_components_release(-1);
        getFormsActionButton().setLoadingButtonPriority$ui_kit_components_release(-1);
    }

    public /* synthetic */ CollapsingActionButton(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
