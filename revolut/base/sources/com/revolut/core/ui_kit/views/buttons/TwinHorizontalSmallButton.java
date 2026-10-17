package com.revolut.core.ui_kit.views.buttons;

import android.animation.LayoutTransition;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kli.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b!\u0010\u000eJ\u0017\u0010\"\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\"\u0010\u0012J\u0017\u0010#\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b#\u0010\u0016J\u0015\u0010$\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b$\u0010\u001aJ\u0015\u0010%\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b%\u0010\u001aJ\u0017\u0010&\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b&\u0010 J\u0015\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\f2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b+\u0010*R \u00103\u001a\u00020,8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b1\u00102\u001a\u0004\b/\u00100R \u00107\u001a\u00020,8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u0010.\u0012\u0004\b6\u00102\u001a\u0004\b5\u00100¨\u00068"}, d2 = {"Lcom/revolut/core/ui_kit/views/buttons/TwinHorizontalSmallButton;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "tag", "", "setPrimaryButtonLoadingTag", "(Ljava/lang/String;)V", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "setPrimaryButtonText", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "setPrimaryButtonIcon", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "", "enabled", "setPrimaryButtonEnabled", "(Z)V", "visible", "setPrimaryButtonVisible", "Landroid/os/Parcelable;", "analyticsContext", "setPrimaryButtonAnalyticsContext", "(Landroid/os/Parcelable;)V", "setSecondaryButtonLoadingTag", "setSecondaryButtonText", "setSecondaryButtonIcon", "setSecondaryButtonEnabled", "setSecondaryButtonVisible", "setSecondaryButtonAnalyticsContext", "Lms0/h4;", "style", "setPrimaryButtonStyle", "(Lms0/h4;)V", "setSecondaryButtonStyle", "Lcom/revolut/core/ui_kit/internal/views/SmallActionButton;", "a", "Lcom/revolut/core/ui_kit/internal/views/SmallActionButton;", "getPrimaryActionButton", "()Lcom/revolut/core/ui_kit/internal/views/SmallActionButton;", "getPrimaryActionButton$annotations", "()V", "primaryActionButton", "b", "getSecondaryActionButton", "getSecondaryActionButton$annotations", "secondaryActionButton", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TwinHorizontalSmallButton extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final SmallActionButton primaryActionButton;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final SmallActionButton secondaryActionButton;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TwinHorizontalSmallButton(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void getPrimaryActionButton$annotations() {
    }

    public static /* synthetic */ void getSecondaryActionButton$annotations() {
    }

    @NotNull
    public final SmallActionButton getPrimaryActionButton() {
        return this.primaryActionButton;
    }

    @NotNull
    public final SmallActionButton getSecondaryActionButton() {
        return this.secondaryActionButton;
    }

    public final void setPrimaryButtonAnalyticsContext(Parcelable analyticsContext) {
        this.primaryActionButton.setAnalyticsContext(analyticsContext);
    }

    public final void setPrimaryButtonEnabled(boolean enabled) {
        this.primaryActionButton.setEnabled(enabled);
    }

    public final void setPrimaryButtonIcon(Image image) {
        this.primaryActionButton.setIcon(image);
    }

    public final void setPrimaryButtonLoadingTag(String tag2) {
        this.primaryActionButton.setLoadingButtonTag(tag2);
    }

    public final void setPrimaryButtonStyle(@NotNull h4 style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.primaryActionButton.i(style);
    }

    public final void setPrimaryButtonText(Clause clause) {
        this.primaryActionButton.setText(clause);
    }

    public final void setPrimaryButtonVisible(boolean visible) {
        this.primaryActionButton.setVisibility(visible ? 0 : 8);
    }

    public final void setSecondaryButtonAnalyticsContext(Parcelable analyticsContext) {
        this.secondaryActionButton.setAnalyticsContext(analyticsContext);
    }

    public final void setSecondaryButtonEnabled(boolean enabled) {
        this.secondaryActionButton.setEnabled(enabled);
    }

    public final void setSecondaryButtonIcon(Image image) {
        this.secondaryActionButton.setIcon(image);
    }

    public final void setSecondaryButtonLoadingTag(String tag2) {
        this.secondaryActionButton.setLoadingButtonTag(tag2);
    }

    public final void setSecondaryButtonStyle(@NotNull h4 style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.secondaryActionButton.i(style);
    }

    public final void setSecondaryButtonText(Clause clause) {
        this.secondaryActionButton.setText(clause);
    }

    public final void setSecondaryButtonVisible(boolean visible) {
        this.secondaryActionButton.setVisibility(visible ? 0 : 8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TwinHorizontalSmallButton(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwinHorizontalSmallButton(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        int i2 = 0;
        setClipToPadding(false);
        setClipChildren(false);
        setOrientation(0);
        setLayoutTransition(new LayoutTransition());
        AttributeSet attributeSet2 = null;
        int i3 = 6;
        SmallActionButton smallActionButton = new SmallActionButton(context, attributeSet2, i3, i2);
        this.primaryActionButton = smallActionButton;
        smallActionButton.setId(R$id.uikit_twinHorizontalSmallButton_primaryActionButton);
        smallActionButton.i(h4.ACCENT);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMarginEnd(a.k(context, 4.0f));
        layoutParams.weight = 1.0f;
        Unit unit = Unit.f186387a;
        addView(smallActionButton, layoutParams);
        SmallActionButton smallActionButton2 = new SmallActionButton(context, attributeSet2, i3, i2);
        this.secondaryActionButton = smallActionButton2;
        smallActionButton2.setId(R$id.uikit_twinHorizontalSmallButton_secondaryActionButton);
        smallActionButton2.i(h4.SEMIACCENT);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMarginStart(a.k(context, 4.0f));
        layoutParams2.weight = 1.0f;
        addView(smallActionButton2, layoutParams2);
    }

    public /* synthetic */ TwinHorizontalSmallButton(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
