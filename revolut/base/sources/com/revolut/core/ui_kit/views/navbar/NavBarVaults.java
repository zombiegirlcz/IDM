package com.revolut.core.ui_kit.views.navbar;

import android.animation.ArgbEvaluator;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import au0.f5;
import au0.g2;
import au0.p2;
import au0.z4;
import aw0.v1;
import aw0.y9;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.internal.views.navbar.VaultsHeaderLayout;
import com.revolut.core.ui_kit.models.CharSequenceClause;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tx0.j2;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0006\b\u0007\u0018\u0000 G2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001HB\u001d\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u0016J\u0019\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u0016J\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b#\u0010\"J\u0019\u0010$\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b$\u0010\"J\u0017\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010\"J\u0017\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u001bH\u0016¢\u0006\u0004\b&\u0010\u001eJ\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b+\u0010*J\u0017\u0010,\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b,\u0010*J\u0017\u0010-\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b-\u0010*J\u0015\u00100\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b2\u0010*J\u0017\u00103\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b3\u0010*J\u0017\u00104\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b4\u0010*J\u0017\u00107\u001a\u00020\u000f2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b9\u0010*J\u0017\u0010<\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u001d\u0010@\u001a\u00020\u000f2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\nH\u0016¢\u0006\u0004\b@\u0010\u0012J\u0017\u0010A\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\bA\u0010*J\u0015\u0010B\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\bB\u0010\u0016J\u0017\u0010D\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020CH\u0007¢\u0006\u0004\bD\u0010EJ\u0015\u0010F\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\bF\u0010\"¨\u0006I"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/NavBarVaults;", "Lau0/o;", "Lau0/g2;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "Lcom/revolut/core/ui_kit/views/navbar/NavBarMenuItem;", "menuItems", "Lyy0/f;", "imageDisplayer", "", "setMenuItems", "(Ljava/util/List;Lyy0/f;)V", "(Ljava/util/List;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "setBackgroundImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "setAvatarImage", "setAvatarBadgeImage", "setHeaderTitleIcon", "setEndBottomIconImage", "", "title", "setDescriptionText", "(Ljava/lang/String;)V", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "setDescription", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "setHeaderTitleText", "setHeaderSubtitleText", "status", "setHeaderStatusText", "", "visible", "setHeaderStatusTextVisibility", "(Z)V", "setHeaderTitleIconVisibility", "setAvatarImageVisibility", "setAvatarBadgeImageVisibility", "Law0/y9;", "expandedStyle", "setStatusBarStyle", "(Law0/y9;)V", "setEndBottomIconVisibility", "setHeaderTitleVisibility", "setHeaderSubtitleVisibility", "Lau0/f5;", "style", "setBackgroundGradientOverlayStyle", "(Lau0/f5;)V", "setBackgroundGradientOverlayVisibility", "Law0/v1;", "colorScheme", "setColorScheme", "(Law0/v1;)V", "Lcom/revolut/core/ui_kit/views/ActionsView$Item;", "actions", "setActions", "setActionsVisibility", "setNavigationButtonIcon", "", "setToolbarTitleText", "(Ljava/lang/CharSequence;)V", "setToolbarTitle", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final class NavBarVaults extends au0.o implements g2 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.revolut.core.ui_kit.internal.views.navbar.d f59327l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ihm.f f59328m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public WindowInsetsCompat f59329n;
    public final z4 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f59330p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f59331q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public v1 f59332r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final NavBarNavigationButtonView f59333s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AsyncDiffRecyclerView f59334t;
    public final VaultsHeaderLayout u;
    public final LinearLayout v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f59335w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public y9 f59336x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public y9 f59337y;

    @NotNull
    private static final a Companion = new a();
    public static final AccelerateInterpolator z = new AccelerateInterpolator(2.0f);
    public static final ArgbEvaluator A = new ArgbEvaluator();

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBarVaults(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f59328m = v0.a.d("create(...)");
        this.o = new z4(this);
        this.f59330p = kli.a.s(R$attr.uikit_colorForeground, context);
        this.f59331q = kli.a.s(R$attr.uikit_colorWhite, context);
        this.f59332r = v1.DARK;
        y9 y9Var = y9.THEME;
        this.f59336x = y9Var;
        this.f59337y = y9Var;
        View.inflate(context, R$layout.internal_view_nav_bar_vaults, this);
        View viewFindViewById = findViewById(R$id.navigationButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        NavBarNavigationButtonView navBarNavigationButtonView = (NavBarNavigationButtonView) viewFindViewById;
        this.f59333s = navBarNavigationButtonView;
        View viewFindViewById2 = findViewById(R$id.menuRecyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        AsyncDiffRecyclerView asyncDiffRecyclerView = (AsyncDiffRecyclerView) viewFindViewById2;
        this.f59334t = asyncDiffRecyclerView;
        View viewFindViewById3 = findViewById(R$id.vaultsHeader);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.u = (VaultsHeaderLayout) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.menuLayout);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.v = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = findViewById(R$id.toolbarTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f59335w = (TextView) viewFindViewById5;
        fp0.p clickHandler = navBarNavigationButtonView.getClickHandler();
        fp0.p.b(clickHandler, true);
        View view = clickHandler.f137029a;
        or0.m.a(view);
        view.setOnClickListener(new p2(this, 13));
        this.f59327l = new com.revolut.core.ui_kit.internal.views.navbar.d(asyncDiffRecyclerView);
        setStateListAnimator(null);
        float expandRatio = getExpandRatio();
        x(z.getInterpolation(expandRatio > 0.6f ? 1.0f : expandRatio / 0.6f));
    }

    @Override // au0.g2
    public final efm.r b() {
        throw null;
    }

    @Override // au0.o
    public final void k(float f, int i) {
        Window window;
        LinearLayout linearLayout = this.v;
        linearLayout.setTranslationY(-i);
        float interpolation = z.getInterpolation(f > 0.6f ? 1.0f : f / 0.6f);
        this.f59335w.setTranslationY(linearLayout.getHeight() * interpolation);
        x(interpolation);
        View viewB = this.o.b();
        if (viewB != null) {
            viewB.setY(linearLayout.getHeight() + (this.f59329n != null ? r3.getSystemWindowInsetTop() : 0));
        }
        float fN = au0.o.n(f, 0.2f, true);
        float fN2 = au0.o.n(f, 0.1f, false);
        if (viewB != null) {
            au0.o.w(viewB, fN);
        }
        au0.o.w(this.u, fN2);
        au0.o.w(this.f59334t, fN2);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Activity activityI = z92.f.i(context);
        if (activityI == null || (window = activityI.getWindow()) == null) {
            return;
        }
        y9 y9Var = f > 0.6f ? this.f59336x : y9.THEME;
        if (y9Var != this.f59337y) {
            y9Var.a(window);
            this.f59337y = y9Var;
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayoutProxy
    public final WindowInsetsCompat onApplyWindowInsets(WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        if (getFitsSystemWindows() && !ObjectsCompat.equals(this.f59329n, insets)) {
            this.f59329n = insets;
            ViewCompat.onApplyWindowInsets(this.u, insets);
            LinearLayout linearLayout = this.v;
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = insets.getSystemWindowInsetTop();
            linearLayout.requestLayout();
        }
        return super.onApplyWindowInsets(insets);
    }

    @Override // au0.o, com.google.android.material.appbar.AppBarLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Window window;
        y9 y9Var;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Activity activityI = z92.f.i(context);
        if (activityI != null && (window = activityI.getWindow()) != null && (y9Var = y9.THEME) != this.f59337y) {
            y9Var.a(window);
            this.f59337y = y9Var;
        }
        super.onDetachedFromWindow();
    }

    public void setActions(@NotNull List<ActionsView.Item> actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.u.setActions(actions);
    }

    public void setActionsVisibility(boolean visible) {
        this.u.setActionsVisibility(visible);
    }

    public void setAvatarBadgeImage(@NotNull Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.u.setAvatarBadgeImage(image);
    }

    public void setAvatarBadgeImageVisibility(boolean visible) {
        this.u.setAvatarBadgeImageVisibility(visible);
    }

    public void setAvatarImage(@NotNull Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.u.setAvatarImage(image);
    }

    public void setAvatarImageVisibility(boolean visible) {
        this.u.setAvatarImageVisibility(visible);
    }

    public void setBackgroundGradientOverlayStyle(@NotNull f5 style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.u.setBackgroundGradientOverlayStyle(style);
    }

    public void setBackgroundGradientOverlayVisibility(boolean visible) {
        this.u.setBackgroundGradientOverlayVisibility(visible);
    }

    public void setBackgroundImage(@NotNull Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.u.setBackgroundImage(image);
    }

    public void setColorScheme(@NotNull v1 colorScheme) {
        int i;
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        if (colorScheme == this.f59332r) {
            return;
        }
        this.f59332r = colorScheme;
        int i2 = j2.f275167a[colorScheme.ordinal()];
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
        this.f59331q = kli.a.s(i, context);
        float expandRatio = getExpandRatio();
        x(z.getInterpolation(expandRatio > 0.6f ? 1.0f : expandRatio / 0.6f));
    }

    public void setDescription(@NotNull Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        VaultsHeaderLayout vaultsHeaderLayout = this.u;
        vaultsHeaderLayout.setDescription(clause);
        vaultsHeaderLayout.setTag(R$id.internal_nav_bar_title_clause, clause);
    }

    public void setDescriptionText(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.u.setDescriptionText(title);
    }

    public void setEndBottomIconImage(Image image) {
        this.u.setEndBottomIconImage(image);
    }

    public void setEndBottomIconVisibility(boolean visible) {
        this.u.setEndBottomIconVisibility(visible);
    }

    public void setHeaderStatusText(@NotNull Clause status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.u.setHeaderStatusText(status);
    }

    public void setHeaderStatusTextVisibility(boolean visible) {
        this.u.setHeaderStatusTextVisibility(visible);
    }

    public void setHeaderSubtitleText(Clause clause) {
        this.u.setHeaderSubtitleText(clause);
    }

    public void setHeaderSubtitleVisibility(boolean visible) {
        this.u.setHeaderSubtitleVisibility(visible);
    }

    public void setHeaderTitleIcon(@NotNull Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.u.setHeaderTitleIcon(image);
    }

    public void setHeaderTitleIconVisibility(boolean visible) {
        this.u.setHeaderTitleIconVisibility(visible);
    }

    public void setHeaderTitleText(Clause clause) {
        this.u.setHeaderTitleText(clause);
    }

    public void setHeaderTitleVisibility(boolean visible) {
        this.u.setHeaderTitleVisibility(visible);
    }

    public void setMenuItems(@NotNull List<? extends NavBarMenuItem> menuItems, @NotNull yy0.f imageDisplayer) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(imageDisplayer, "imageDisplayer");
        this.f59327l.setMenuItems(menuItems);
    }

    public final void setNavigationButtonIcon(@NotNull Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        yy0.f.e(or0.u.k(this).Q(), image, this.f59333s, null, null, 12);
        NavBarNavigationButtonView navBarNavigationButtonView = this.f59333s;
        navBarNavigationButtonView.setContentDescription(navBarNavigationButtonView.getContext().getString(R$string.uikit_navigate_up_description));
    }

    public final void setStatusBarStyle(@NotNull y9 expandedStyle) {
        Intrinsics.checkNotNullParameter(expandedStyle, "expandedStyle");
        this.f59336x = expandedStyle;
    }

    public final void setToolbarTitle(@NotNull Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        ty0.c.b(or0.u.k(this).b0(), clause, this.f59335w, null, null, 12);
        this.f59335w.setTag(R$id.internal_nav_bar_title_clause, clause);
    }

    @yhm.d
    public final void setToolbarTitleText(@NotNull CharSequence title) {
        Intrinsics.checkNotNullParameter(title, "title");
        setToolbarTitle(new CharSequenceClause(title));
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void x(float f) {
        this.u.setColorScheme(this.f59332r);
        Object objEvaluate = A.evaluate(f, Integer.valueOf(this.f59330p), Integer.valueOf(this.f59331q));
        Intrinsics.i(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) objEvaluate).intValue();
        this.f59335w.setTextColor(iIntValue);
        if (((Boolean) jo0.g.D.getValue()).booleanValue()) {
            return;
        }
        this.f59333s.setDrawableTint(iIntValue);
    }

    public void setHeaderStatusText(@NotNull String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.u.setHeaderStatusText(status);
    }

    @Override // au0.g2
    public void setMenuItems(@NotNull List<? extends NavBarMenuItem> menuItems) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f59327l.setMenuItems(menuItems);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavBarVaults(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
