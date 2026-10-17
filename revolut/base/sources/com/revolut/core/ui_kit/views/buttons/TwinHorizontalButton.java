package com.revolut.core.ui_kit.views.buttons;

import android.animation.LayoutTransition;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
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
import dr0.g;
import e8.q;
import efm.r;
import ihm.f;
import ix0.c0;
import ix0.c2;
import ix0.w0;
import kli.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ny0.h;
import ny0.k;
import om4.m1;
import or0.u;
import org.jetbrains.annotations.NotNull;
import pd.b;
import ty0.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\bJ\u0015\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b \u0010\bJ\u0017\u0010#\u001a\u00020\u00062\b\b\u0001\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b*\u0010\fJ\u0017\u0010,\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b,\u0010\u0014J\u0017\u0010-\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b-\u0010\u0014J\u0017\u0010.\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b.\u0010\u0018J\u0017\u0010/\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b/\u0010\u001cJ\u0015\u00100\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b0\u0010\bJ\u0015\u00101\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b1\u0010\bJ\u0017\u00102\u001a\u00020\u00062\b\b\u0001\u0010\"\u001a\u00020!¢\u0006\u0004\b2\u0010$J\u0015\u00104\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u0004¢\u0006\u0004\b4\u0010\bJ\u0017\u00105\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b5\u0010(J\u0017\u00106\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b6\u0010\fJ\u0015\u00109\u001a\u00020\u00062\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:J\u0015\u0010;\u001a\u00020\u00062\u0006\u00108\u001a\u000207¢\u0006\u0004\b;\u0010:J\u0015\u0010<\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b<\u0010\fJ\u0017\u0010=\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b=\u0010\u0010J\u0017\u0010>\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b>\u0010\u0014J\u0017\u0010A\u001a\u00020\u00062\b\b\u0001\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u00062\b\b\u0001\u0010@\u001a\u00020?¢\u0006\u0004\bC\u0010BJ!\u0010F\u001a\u00020\u00062\b\u0010D\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010E\u001a\u00020\u0004¢\u0006\u0004\bF\u0010GJ\u0015\u0010H\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\bH\u0010\bR\u001b\u0010N\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001b\u0010Q\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010K\u001a\u0004\bP\u0010MR\u001b\u0010V\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010K\u001a\u0004\bT\u0010UR\u001b\u0010[\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010K\u001a\u0004\bY\u0010ZR\u001b\u0010_\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010K\u001a\u0004\b]\u0010^R\u001a\u0010`\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c¨\u0006d"}, d2 = {"Lcom/revolut/core/ui_kit/views/buttons/TwinHorizontalButton;", "Landroid/widget/LinearLayout;", "Lix0/w0;", "Lny0/h;", "", "animate", "", "setAnimateLayoutChanges", "(Z)V", "", "tag", "setPrimaryButtonLoadingTag", "(Ljava/lang/String;)V", "Law0/k3;", "strategy", "setPrimaryButtonLoadingStrategy", "(Law0/k3;)V", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "setPrimaryButtonText", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "setPrimaryButtonIcon", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "Lcom/revolut/core/ui_kit/models/NewBadgeContent;", "badgeContent", "setPrimaryButtonBadge", "(Lcom/revolut/core/ui_kit/models/NewBadgeContent;)V", "enabled", "setPrimaryButtonEnabled", "visible", "setPrimaryButtonVisible", "", "weight", "setPrimaryButtonWeight", "(F)V", "Landroid/os/Parcelable;", "analyticsContext", "setPrimaryButtonAnalyticsContext", "(Landroid/os/Parcelable;)V", "id", "setPrimaryButtonCustomE2ETestId", "contentDescription", "setPrimaryButtonContentDescription", "setSecondaryButtonText", "setSecondaryButtonIcon", "setSecondaryButtonBadge", "setSecondaryButtonEnabled", "setSecondaryButtonVisible", "setSecondaryButtonWeight", "reversed", "setButtonsReversed", "setSecondaryButtonAnalyticsContext", "setSecondaryButtonCustomE2ETestId", "Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle;", "style", "setPrimaryButtonStyle", "(Lcom/revolut/core/ui_kit/views/LargeActionButton$ButtonStyle;)V", "setSecondaryButtonStyle", "setSecondaryButtonLoadingTag", "setSecondaryButtonLoadingStrategy", "setSecondaryButtonContentDescription", "", "color", "setGradientTint", "(I)V", "setTextColor", "text", "belowButtons", "setText", "(Lcom/revolut/core/ui_kit/models/Clause;Z)V", "setGradientBackgroundEnabled", "Lcom/revolut/core/ui_kit/views/LargeActionButton;", "b", "Le8/q;", "getPrimaryActionButton", "()Lcom/revolut/core/ui_kit/views/LargeActionButton;", "primaryActionButton", "c", "getSecondaryActionButton", "secondaryActionButton", "Landroid/view/View;", "d", "getSpace", "()Landroid/view/View;", "space", "Landroidx/appcompat/widget/AppCompatTextView;", "e", "getTextView", "()Landroidx/appcompat/widget/AppCompatTextView;", "textView", "f", "getButtonsContainer", "()Landroid/widget/LinearLayout;", "buttonsContainer", "fitsReadableArea", "Z", "getFitsReadableArea", "()Z", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TwinHorizontalButton extends LinearLayout implements w0, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f59005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final q primaryActionButton;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final q secondaryActionButton;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final q space;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final q textView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final q buttonsContainer;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f59008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f59009h;
    public final BottomGradientDrawable i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k f59010j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TwinHorizontalButton(@NotNull Context context) {
        this(context, null, 0, 14);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final LinearLayout getButtonsContainer() {
        return (LinearLayout) this.buttonsContainer.f();
    }

    private final LargeActionButton getPrimaryActionButton() {
        return (LargeActionButton) this.primaryActionButton.f();
    }

    private final LargeActionButton getSecondaryActionButton() {
        return (LargeActionButton) this.secondaryActionButton.f();
    }

    private final View getSpace() {
        return this.space.f();
    }

    private final AppCompatTextView getTextView() {
        return (AppCompatTextView) this.textView.f();
    }

    public static /* synthetic */ void setText$default(TwinHorizontalButton twinHorizontalButton, Clause clause, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = true;
        }
        twinHorizontalButton.setText(clause, z);
    }

    public final rr0.f a() {
        return getPrimaryActionButton().A.V();
    }

    public final rr0.f b() {
        return getSecondaryActionButton().A.V();
    }

    public final r c() {
        return getPrimaryActionButton().o;
    }

    public final r d() {
        return getSecondaryActionButton().o;
    }

    public final void f() {
        getPrimaryActionButton().X();
    }

    @Override // ny0.h
    public boolean getFitsReadableArea() {
        return false;
    }

    @Override // ix0.w0, ix0.v0
    public /* bridge */ boolean getInsetsAdjustable() {
        return super.getInsetsAdjustable();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(this.f59005a.c(insets));
        Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.f59010j.b(i);
        super.onMeasure(i, i2);
    }

    public final void setAnimateLayoutChanges(boolean animate) {
        setLayoutTransition(animate ? new LayoutTransition() : null);
    }

    public final void setButtonsReversed(boolean reversed) {
        if (reversed == (getButtonsContainer().indexOfChild(getSecondaryActionButton()) < getButtonsContainer().indexOfChild(getPrimaryActionButton()))) {
            return;
        }
        getButtonsContainer().removeView(getPrimaryActionButton());
        getButtonsContainer().removeView(getSecondaryActionButton());
        if (reversed) {
            getButtonsContainer().addView(getSecondaryActionButton(), 0);
            getButtonsContainer().addView(getPrimaryActionButton(), getButtonsContainer().getChildCount());
        } else {
            getButtonsContainer().addView(getPrimaryActionButton(), 0);
            getButtonsContainer().addView(getSecondaryActionButton(), getButtonsContainer().getChildCount());
        }
    }

    public final void setGradientBackgroundEnabled(boolean enabled) {
        if (enabled == this.f59009h) {
            return;
        }
        this.f59009h = enabled;
        g gVar = enabled ? g.DEFAULT : null;
        BottomGradientDrawable bottomGradientDrawable = this.i;
        bottomGradientDrawable.c(gVar);
        setBackground(bottomGradientDrawable);
    }

    public final void setGradientTint(int color) {
        this.i.setTint(color);
    }

    public final void setPrimaryButtonAnalyticsContext(Parcelable analyticsContext) {
        getPrimaryActionButton().setAnalyticsContext(analyticsContext);
    }

    public final void setPrimaryButtonBadge(NewBadgeContent badgeContent) {
        getPrimaryActionButton().setBadge(badgeContent);
    }

    public final void setPrimaryButtonContentDescription(Clause contentDescription) {
        b.p(getPrimaryActionButton(), contentDescription);
    }

    public final void setPrimaryButtonCustomE2ETestId(String id10) {
        getPrimaryActionButton().setCustomE2ETestId(id10);
    }

    public final void setPrimaryButtonEnabled(boolean enabled) {
        getPrimaryActionButton().setEnabled(enabled);
    }

    public final void setPrimaryButtonIcon(Image image) {
        getPrimaryActionButton().setIcon(image);
    }

    public final void setPrimaryButtonLoadingStrategy(k3 strategy) {
        getPrimaryActionButton().setLoadingStrategy(strategy);
    }

    public final void setPrimaryButtonLoadingTag(@NotNull String tag2) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        getPrimaryActionButton().setLoadingButtonTag(tag2);
    }

    public final void setPrimaryButtonStyle(@NotNull LargeActionButton.ButtonStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        getPrimaryActionButton().o(style);
    }

    public final void setPrimaryButtonText(Clause clause) {
        getPrimaryActionButton().setText(clause);
    }

    public final void setPrimaryButtonVisible(boolean visible) {
        getPrimaryActionButton().setVisibility(visible ? 0 : 8);
        getSpace().setVisibility(getPrimaryActionButton().getVisibility() == 0 && getSecondaryActionButton().getVisibility() == 0 ? 0 : 8);
    }

    public final void setPrimaryButtonWeight(float weight) {
        ViewGroup.LayoutParams layoutParams = getPrimaryActionButton().getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        int buttonHeightPx = weight == BitmapDescriptorFactory.HUE_RED ? getPrimaryActionButton().getButtonHeightPx() : 0;
        if (layoutParams2.weight == weight && layoutParams2.width == buttonHeightPx) {
            return;
        }
        LargeActionButton primaryActionButton = getPrimaryActionButton();
        ViewGroup.LayoutParams layoutParams3 = primaryActionButton.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.weight = weight;
        layoutParams4.width = buttonHeightPx;
        primaryActionButton.setLayoutParams(layoutParams4);
    }

    public final void setSecondaryButtonAnalyticsContext(Parcelable analyticsContext) {
        getSecondaryActionButton().setAnalyticsContext(analyticsContext);
    }

    public final void setSecondaryButtonBadge(NewBadgeContent badgeContent) {
        getSecondaryActionButton().setBadge(badgeContent);
    }

    public final void setSecondaryButtonContentDescription(Clause contentDescription) {
        b.p(getSecondaryActionButton(), contentDescription);
    }

    public final void setSecondaryButtonCustomE2ETestId(String id10) {
        getSecondaryActionButton().setCustomE2ETestId(id10);
    }

    public final void setSecondaryButtonEnabled(boolean enabled) {
        getSecondaryActionButton().setEnabled(enabled);
    }

    public final void setSecondaryButtonIcon(Image image) {
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

    public final void setSecondaryButtonText(Clause clause) {
        getSecondaryActionButton().setText(clause);
    }

    public final void setSecondaryButtonVisible(boolean visible) {
        getSecondaryActionButton().setVisibility(visible ? 0 : 8);
        getSpace().setVisibility(getPrimaryActionButton().getVisibility() == 0 && getSecondaryActionButton().getVisibility() == 0 ? 0 : 8);
    }

    public final void setSecondaryButtonWeight(float weight) {
        ViewGroup.LayoutParams layoutParams = getSecondaryActionButton().getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        int buttonHeightPx = weight == BitmapDescriptorFactory.HUE_RED ? getSecondaryActionButton().getButtonHeightPx() : 0;
        if (layoutParams2.weight == weight && layoutParams2.width == buttonHeightPx) {
            return;
        }
        LargeActionButton secondaryActionButton = getSecondaryActionButton();
        ViewGroup.LayoutParams layoutParams3 = secondaryActionButton.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.weight = weight;
        layoutParams4.width = buttonHeightPx;
        secondaryActionButton.setLayoutParams(layoutParams4);
    }

    public final void setText(Clause text, boolean belowButtons) {
        c.b(u.k(this).b0(), text, getTextView(), new m1(this.f59008g), null, 8);
        getTextView().setVisibility(text != null ? 0 : 8);
        if (indexOfChild(getTextView()) != belowButtons) {
            removeView(getTextView());
            addView(getTextView(), belowButtons ? 1 : 0);
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = a.k(context, 16.0f);
        AppCompatTextView textView = getTextView();
        Integer numValueOf = Integer.valueOf(iK);
        if (!belowButtons) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        Integer numValueOf2 = belowButtons ? null : Integer.valueOf(iK);
        textView.setPaddingRelative(0, iIntValue, 0, numValueOf2 != null ? numValueOf2.intValue() : 0);
    }

    public final void setTextColor(int color) {
        getTextView().setTextColor(color);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TwinHorizontalButton(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TwinHorizontalButton(@NotNull Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TwinHorizontalButton(Context context, AttributeSet attributeSet, int i, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        int i3 = R$style.InternalActionFooterView;
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, i, i3);
        this.f59005a = new c2(this);
        this.primaryActionButton = a.J(R$id.primaryActionButton, this);
        this.secondaryActionButton = a.J(R$id.secondaryActionButton, this);
        this.space = a.J(R$id.space, this);
        this.textView = a.J(R$id.twinHorizontalButton_text, this);
        this.buttonsContainer = a.J(R$id.twinHorizontalButton_buttonsContainer, this);
        this.f59008g = v0.a.d("create(...)");
        this.i = new BottomGradientDrawable(context);
        k kVar = new k(this);
        this.f59010j = kVar;
        View.inflate(context, R$layout.internal_view_twin_horizontal_button, this);
        setClipToPadding(false);
        setClipChildren(false);
        setOrientation(1);
        getPrimaryActionButton().o(LargeActionButton.ButtonStyle.f58725a);
        getSecondaryActionButton().o(LargeActionButton.ButtonStyle.f58726b);
        getTextView().setMovementMethod(c0.f169220a);
        kVar.d(true);
    }
}
