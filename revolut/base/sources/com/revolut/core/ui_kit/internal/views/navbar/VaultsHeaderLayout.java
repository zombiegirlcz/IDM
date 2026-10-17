package com.revolut.core.ui_kit.internal.views.navbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.util.ObjectsCompat;
import au0.f5;
import au0.h5;
import aw0.d0;
import aw0.o9;
import aw0.v1;
import com.revolut.core.ui_kit.R$dimen;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.UIKitImageView;
import com.revolut.core.ui_kit.internal.views.layout.UIKitConstraintLayout;
import com.revolut.core.ui_kit.internal.views.navbar.VaultsHeaderLayout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import e8.q;
import efm.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mx0.t;
import or0.u;
import org.jetbrains.annotations.NotNull;
import tx0.d5;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0019\u0010\u001d\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001f\u0010\u0017J\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010\u001bJ\u0017\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010#J\u0017\u0010%\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b%\u0010#J\u0017\u0010&\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b&\u0010#J\u0017\u0010'\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b'\u0010#J\u0017\u0010(\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b(\u0010#J\u0017\u0010)\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b)\u0010#J\u0017\u0010*\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b*\u0010#J\u0017\u0010-\u001a\u00020\r2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\r2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u001d\u00106\u001a\u00020\r2\f\u00105\u001a\b\u0012\u0004\u0012\u00020403H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\r2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b8\u0010#R\u001b\u0010>\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001b\u0010A\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010;\u001a\u0004\b@\u0010=R\u001b\u0010D\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010;\u001a\u0004\bC\u0010=R\u001b\u0010I\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010;\u001a\u0004\bG\u0010HR\u001b\u0010L\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010;\u001a\u0004\bK\u0010=R\u001b\u0010Q\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010;\u001a\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010;\u001a\u0004\bT\u0010UR\u001b\u0010Y\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010;\u001a\u0004\bX\u0010UR\u001b\u0010\\\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010;\u001a\u0004\b[\u0010UR\u001b\u0010a\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010;\u001a\u0004\b_\u0010`R\u001b\u0010f\u001a\u00020b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010;\u001a\u0004\bd\u0010e¨\u0006g"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/navbar/VaultsHeaderLayout;", "Lcom/revolut/core/ui_kit/internal/views/layout/UIKitConstraintLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "", "setBackgroundImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "setAvatarImage", "setAvatarBadgeImage", "setHeaderTitleIcon", "setEndBottomIconImage", "", "title", "setDescriptionText", "(Ljava/lang/String;)V", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "setDescription", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "setHeaderTitleText", "setHeaderSubtitleText", "status", "setHeaderStatusText", "", "visible", "setHeaderStatusTextVisibility", "(Z)V", "setHeaderTitleIconVisibility", "setAvatarImageVisibility", "setAvatarBadgeImageVisibility", "setEndBottomIconVisibility", "setHeaderTitleVisibility", "setHeaderSubtitleVisibility", "setBackgroundGradientOverlayVisibility", "Lau0/f5;", "style", "setBackgroundGradientOverlayStyle", "(Lau0/f5;)V", "Law0/v1;", "colorScheme", "setColorScheme", "(Law0/v1;)V", "", "Lcom/revolut/core/ui_kit/views/ActionsView$Item;", "actions", "setActions", "(Ljava/util/List;)V", "setActionsVisibility", "Landroid/widget/ImageView;", "o", "Le8/q;", "getIcon", "()Landroid/widget/ImageView;", "icon", "p", "getIconBadge", "iconBadge", "q", "getTitleIcon", "titleIcon", "Lcom/revolut/core/ui_kit/internal/views/UIKitImageView;", "r", "getBackgroundImage", "()Lcom/revolut/core/ui_kit/internal/views/UIKitImageView;", "backgroundImage", "s", "getEndBottomIcon", "endBottomIcon", "Lcom/revolut/core/ui_kit/internal/views/navbar/ImageAutoSizeTextView;", "t", "getDescriptionText", "()Lcom/revolut/core/ui_kit/internal/views/navbar/ImageAutoSizeTextView;", "descriptionText", "Landroid/widget/TextView;", "u", "getTitleView", "()Landroid/widget/TextView;", "titleView", "v", "getSubtitleView", "subtitleView", "w", "getActionStatus", "actionStatus", "Landroid/view/View;", "x", "getBackgroundImageOverlay", "()Landroid/view/View;", "backgroundImageOverlay", "Lcom/revolut/core/ui_kit/views/ActionsView;", "y", "getActionsView", "()Lcom/revolut/core/ui_kit/views/ActionsView;", "actionsView", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VaultsHeaderLayout extends UIKitConstraintLayout {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.f f57347h;
    public final ihm.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ihm.f f57348j;
    public final ihm.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f57349l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public WindowInsets f57350m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Image f57351n;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final q icon;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final q iconBadge;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final q titleIcon;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final q backgroundImage;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final q endBottomIcon;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final q descriptionText;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final q titleView;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final q subtitleView;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final q actionStatus;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final q backgroundImageOverlay;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final q actionsView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VaultsHeaderLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final TextView getActionStatus() {
        return (TextView) this.actionStatus.f();
    }

    private final ActionsView getActionsView() {
        return (ActionsView) this.actionsView.f();
    }

    private final UIKitImageView getBackgroundImage() {
        return (UIKitImageView) this.backgroundImage.f();
    }

    private final View getBackgroundImageOverlay() {
        return this.backgroundImageOverlay.f();
    }

    private final ImageAutoSizeTextView getDescriptionText() {
        return (ImageAutoSizeTextView) this.descriptionText.f();
    }

    private final ImageView getEndBottomIcon() {
        return (ImageView) this.endBottomIcon.f();
    }

    private final ImageView getIcon() {
        return (ImageView) this.icon.f();
    }

    private final ImageView getIconBadge() {
        return (ImageView) this.iconBadge.f();
    }

    private final TextView getSubtitleView() {
        return (TextView) this.subtitleView.f();
    }

    private final ImageView getTitleIcon() {
        return (ImageView) this.titleIcon.f();
    }

    private final TextView getTitleView() {
        return (TextView) this.titleView.f();
    }

    public final void f0() {
        if (getActionStatus().getVisibility() == 0 || getTitleView().getVisibility() == 0 || getActionsView().getVisibility() == 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getIcon().getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = kli.a.k(context, 24.0f);
        getIcon().setLayoutParams(layoutParams2);
    }

    public final void g0() {
        int iK;
        TextView titleView = getTitleView();
        ViewGroup.LayoutParams layoutParams = titleView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        if (getTitleView().getVisibility() == 0 && getSubtitleView().getVisibility() == 0) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iK = kli.a.k(context, 8.0f);
        } else if (getTitleView().getVisibility() == 0 && getSubtitleView().getVisibility() != 0 && getActionsView().getVisibility() == 0) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            iK = kli.a.k(context2, 16.0f);
        } else {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            iK = kli.a.k(context3, 24.0f);
        }
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = iK;
        titleView.setLayoutParams(layoutParams);
    }

    public final r h0() {
        return getActionsView().f58296a.f121375b;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (!ObjectsCompat.equals(windowInsets, this.f57350m)) {
            this.f57350m = windowInsets;
            if (windowInsets != null) {
                ViewGroup.LayoutParams layoutParams = getDescriptionText().getLayoutParams();
                Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = windowInsets.getSystemWindowInsetTop() + this.f57349l;
                getDescriptionText().requestLayout();
            }
        }
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    public void setActions(@NotNull List<ActionsView.Item> actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        getActionsView().k(actions, t.f210002a);
    }

    public void setActionsVisibility(boolean visible) {
        getActionsView().setVisibility(visible ? 0 : 8);
        f0();
        g0();
    }

    public void setAvatarBadgeImage(@NotNull Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        getIconBadge().setVisibility(0);
        yy0.f.e(u.k(this).Q(), image, getIconBadge(), null, null, 12);
    }

    public void setAvatarBadgeImageVisibility(boolean visible) {
        getIconBadge().setVisibility(visible ? 0 : 8);
    }

    public void setAvatarImage(@NotNull Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        yy0.f.e(u.k(this).Q(), image, getIcon(), null, null, 12);
    }

    public void setAvatarImageVisibility(boolean visible) {
        getIcon().setVisibility(visible ? 0 : 8);
    }

    public void setBackgroundGradientOverlayStyle(@NotNull f5 style) {
        Intrinsics.checkNotNullParameter(style, "style");
        getBackgroundImageOverlay().setAlpha(style.a());
    }

    public void setBackgroundGradientOverlayVisibility(boolean visible) {
        getBackgroundImageOverlay().setVisibility(visible ? 0 : 8);
    }

    public void setBackgroundImage(@NotNull Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        if (Intrinsics.f(image, this.f57351n)) {
            return;
        }
        this.f57351n = image;
        yy0.f.e(u.k(this).Q(), image, getBackgroundImage(), null, null, 12);
    }

    public void setColorScheme(@NotNull v1 colorScheme) {
        int i;
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        int i2 = h5.f9225a[colorScheme.ordinal()];
        if (i2 == 1) {
            i = R$attr.uikit_colorWhite;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.uikit_colorBlack;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(i, context);
        getTitleView().setTextColor(iS);
        getDescriptionText().setTextColor(iS);
        getSubtitleView().setTextColor(iS);
        getActionStatus().setTextColor(iS);
    }

    public void setDescription(@NotNull Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        getDescriptionText().setVisibility(0);
        ImageAutoSizeTextView.setText$default(getDescriptionText(), clause, null, 2, null);
    }

    public void setDescriptionText(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        getDescriptionText().setVisibility(0);
        ImageAutoSizeTextView.setText$default(getDescriptionText(), new TextClause(title, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 2, null);
    }

    public void setEndBottomIconImage(Image image) {
        getEndBottomIcon().setVisibility(image != null ? 0 : 8);
        yy0.f.e(u.k(this).Q(), image, getEndBottomIcon(), null, null, 12);
    }

    public void setEndBottomIconVisibility(boolean visible) {
        getEndBottomIcon().setVisibility(visible ? 0 : 8);
    }

    public void setHeaderStatusText(@NotNull String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        setHeaderStatusText(new TextClause(status, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
    }

    public void setHeaderStatusTextVisibility(boolean visible) {
        getActionStatus().setVisibility(visible ? 0 : 8);
        f0();
    }

    public void setHeaderSubtitleText(Clause clause) {
        ty0.c.b(u.k(getSubtitleView()).b0(), clause, getSubtitleView(), null, null, 8);
    }

    public void setHeaderSubtitleVisibility(boolean visible) {
        getSubtitleView().setVisibility(visible ? 0 : 8);
        g0();
    }

    public void setHeaderTitleIcon(@NotNull Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        getTitleIcon().setVisibility(0);
        yy0.f.e(u.k(this).Q(), image, getTitleIcon(), null, null, 12);
    }

    public void setHeaderTitleIconVisibility(boolean visible) {
        getTitleIcon().setVisibility(visible ? 0 : 8);
    }

    public void setHeaderTitleText(Clause clause) {
        ty0.c.b(u.k(getTitleView()).b0(), clause, getTitleView(), null, null, 12);
        getTitleView().setVisibility(clause != null ? 0 : 8);
    }

    public void setHeaderTitleVisibility(boolean visible) {
        getTitleView().setVisibility(visible ? 0 : 8);
        f0();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VaultsHeaderLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public void setHeaderStatusText(@NotNull Clause status) {
        Intrinsics.checkNotNullParameter(status, "status");
        getActionStatus().setVisibility(0);
        ty0.c.b(u.k(this).b0(), status, getActionStatus(), null, null, 12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VaultsHeaderLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f57347h = v0.a.d("create(...)");
        this.i = v0.a.d("create(...)");
        this.f57348j = v0.a.d("create(...)");
        this.k = v0.a.d("create(...)");
        this.f57349l = context.getResources().getDimensionPixelOffset(R$dimen.internal_vaults_menu_height);
        this.icon = kli.a.J(R$id.icon, this);
        this.iconBadge = kli.a.J(R$id.iconBadge, this);
        this.titleIcon = kli.a.J(R$id.titleIcon, this);
        this.backgroundImage = kli.a.J(R$id.backgroundImage, this);
        this.endBottomIcon = kli.a.J(R$id.endBottomIcon, this);
        this.descriptionText = kli.a.J(R$id.descriptionText, this);
        this.titleView = kli.a.J(R$id.titleView, this);
        this.subtitleView = kli.a.J(R$id.vaultsHeaderLayout_subtitleView, this);
        this.actionStatus = kli.a.J(R$id.actionStatus, this);
        this.backgroundImageOverlay = kli.a.J(R$id.backgroundImageOverlay, this);
        this.actionsView = kli.a.J(R$id.actionsView, this);
        View.inflate(context, R$layout.internal_view_header_vaults, this);
        final int i2 = 0;
        getIcon().setOnClickListener(new View.OnClickListener(this) { // from class: au0.g5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VaultsHeaderLayout f9213b;

            {
                this.f9213b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f9213b.f57347h.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f9213b.f57347h.onNext(Unit.f186387a);
                        break;
                    case 2:
                        this.f9213b.i.onNext(Unit.f186387a);
                        break;
                    case 3:
                        this.f9213b.f57348j.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f9213b.k.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        final int i3 = 1;
        getIconBadge().setOnClickListener(new View.OnClickListener(this) { // from class: au0.g5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VaultsHeaderLayout f9213b;

            {
                this.f9213b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.f9213b.f57347h.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f9213b.f57347h.onNext(Unit.f186387a);
                        break;
                    case 2:
                        this.f9213b.i.onNext(Unit.f186387a);
                        break;
                    case 3:
                        this.f9213b.f57348j.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f9213b.k.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        final int i5 = 2;
        getTitleIcon().setOnClickListener(new View.OnClickListener(this) { // from class: au0.g5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VaultsHeaderLayout f9213b;

            {
                this.f9213b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        this.f9213b.f57347h.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f9213b.f57347h.onNext(Unit.f186387a);
                        break;
                    case 2:
                        this.f9213b.i.onNext(Unit.f186387a);
                        break;
                    case 3:
                        this.f9213b.f57348j.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f9213b.k.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        final int i6 = 3;
        getBackgroundImage().setOnClickListener(new View.OnClickListener(this) { // from class: au0.g5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VaultsHeaderLayout f9213b;

            {
                this.f9213b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i6) {
                    case 0:
                        this.f9213b.f57347h.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f9213b.f57347h.onNext(Unit.f186387a);
                        break;
                    case 2:
                        this.f9213b.i.onNext(Unit.f186387a);
                        break;
                    case 3:
                        this.f9213b.f57348j.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f9213b.k.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        final int i21 = 4;
        getEndBottomIcon().setOnClickListener(new View.OnClickListener(this) { // from class: au0.g5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ VaultsHeaderLayout f9213b;

            {
                this.f9213b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i21) {
                    case 0:
                        this.f9213b.f57347h.onNext(Unit.f186387a);
                        break;
                    case 1:
                        this.f9213b.f57347h.onNext(Unit.f186387a);
                        break;
                    case 2:
                        this.f9213b.i.onNext(Unit.f186387a);
                        break;
                    case 3:
                        this.f9213b.f57348j.onNext(Unit.f186387a);
                        break;
                    default:
                        this.f9213b.k.onNext(Unit.f186387a);
                        break;
                }
            }
        });
        getBackgroundImage().setFitsReadableArea(false);
        setAspectRatioConfig(new ut0.e(new d0(12, 10), ut0.a.ADJUST_HEIGHT));
        setMaxHeight(d5.b(context));
        setReadableAreaGuidelinesEnabled(true);
    }

    public /* synthetic */ VaultsHeaderLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
