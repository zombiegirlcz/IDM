package com.revolut.core.ui_kit.views.navbar;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import au0.j0;
import au0.u2;
import au0.v2;
import au0.z4;
import aw0.k9;
import aw0.t1;
import aw0.v1;
import aw0.y9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.core.ui_kit.R$dimen;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.framelayout.UIKitFrameLayout;
import com.revolut.core.ui_kit.internal.views.navbar.CollapsingAppBarLayout$Behavior;
import com.revolut.core.ui_kit.internal.views.navbar.NavBarWithContainerBehaviour;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import com.revolut.core.ui_kit.views.ImageWithAnimatedBackgroundView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.youTransactor.uCube.rpc.Constants;
import ix0.d1;
import ix0.n1;
import ix0.o1;
import ix0.r1;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ro0.e0;
import ro0.g0;
import tc7.m0;
import tx0.e2;
import tx0.f3;
import tx0.g3;
import tx0.t2;
import tx0.x2;
import tx0.y2;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 Z2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0006)[\\]^_B\u001d\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\r2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b'\u0010(J\u0015\u0010'\u001a\u00020\r2\u0006\u0010&\u001a\u00020)¢\u0006\u0004\b'\u0010*J\u0015\u0010,\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u001d¢\u0006\u0004\b,\u0010 J!\u0010.\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u001d2\b\u0010-\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b.\u0010/J\u0019\u00102\u001a\u00020\r2\n\b\u0001\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\r2\b\u00104\u001a\u0004\u0018\u00010%¢\u0006\u0004\b5\u0010(J\u001b\u00109\u001a\u00020\r2\f\u00108\u001a\b\u0012\u0004\u0012\u00020706¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\r2\b\u0010;\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b<\u0010 J\u0017\u0010?\u001a\u00020\r2\b\u0010>\u001a\u0004\u0018\u00010=¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\r2\b\u0010B\u001a\u0004\u0018\u00010A¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\r2\u0006\u0010E\u001a\u00020\u000bH\u0007¢\u0006\u0004\bF\u0010\u000fJ\u000f\u0010G\u001a\u000200H\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u000200H\u0002¢\u0006\u0004\bI\u0010HJ\u000f\u0010J\u001a\u000200H\u0002¢\u0006\u0004\bJ\u0010HJ\u000f\u0010K\u001a\u000200H\u0002¢\u0006\u0004\bK\u0010HJ\u0015\u0010N\u001a\b\u0012\u0004\u0012\u00020M0LH\u0002¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u000200H\u0002¢\u0006\u0004\bP\u0010HR.\u0010Y\u001a\u0004\u0018\u00010Q2\b\u0010R\u001a\u0004\u0018\u00010Q8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010X¨\u0006`"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/NavBarWithContainer;", "Lau0/o;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Ltx0/e2;", "Ltx0/y2;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "enabled", "", "setBottomViewInteractionsEnabled$ui_kit_components_release", "(Z)V", "setBottomViewInteractionsEnabled", "", "alpha", "setBottomViewAlpha$ui_kit_components_release", "(F)V", "setBottomViewAlpha", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Lcom/google/android/material/appbar/AppBarLayout;", "getBehavior", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Lcom/revolut/core/ui_kit/views/navbar/NavBarWithContainerHeaderView;", "getHeaderView", "()Lcom/revolut/core/ui_kit/views/navbar/NavBarWithContainerHeaderView;", "Lcom/revolut/core/ui_kit/models/Clause;", "searchButtonText", "setSearchButtonText", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "Law0/k9;", "buttons", "setSearchButtonActions", "(Law0/k9;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "avatar", "setAvatar", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "Ltx0/t2;", "(Ltx0/t2;)V", "title", "setTitle", "subtitle", "setTitleWithSubtitle", "(Lcom/revolut/core/ui_kit/models/Clause;Lcom/revolut/core/ui_kit/models/Clause;)V", "", "iconRes", "setNavigationButtonIcon", "(Ljava/lang/Integer;)V", "image", "setNavigationButtonImage", "", "Lcom/revolut/core/ui_kit/views/navbar/NavBarMenuItem;", "menuItems", "setMenuItems", "(Ljava/util/List;)V", "headerDisclaimerClause", "setHeaderDisclaimer", "Lcom/revolut/core/ui_kit/models/navbar/NavBarMessage;", "message", "setMessage", "(Lcom/revolut/core/ui_kit/models/navbar/NavBarMessage;)V", "Ltx0/f3;", "model", "setTagView", "(Ltx0/f3;)V", "hide", "setHideTitleWhenExpanded", "getOverlapMode", "()I", "getHeaderDisclaimerHeight", "getCollapsedContentViewHeight", "getContentViewBottomMargin", "Lix0/d1;", "Law0/y9;", "getOrCreateStatusBarLayer", "()Lix0/d1;", "getContentViewExtraBottomInset", "Landroid/os/Parcelable;", "value", "l", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "Companion", "tx0/x2", "tx0/v2", "tx0/u2", "tx0/w2", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NavBarWithContainer extends au0.o implements TrackableItem, e2, y2 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final p56.a A;
    public final int B;
    public final int C;
    public boolean D;
    public int E;
    public View F;
    public int G;
    public boolean H;
    public int I;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public Parcelable analyticsContext;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f59362m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final FrameLayout f59363n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public v1 f59364p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f59365q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f59366r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f59367s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f59368t;
    public y9 u;
    public final z4 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final r10.v f59369w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public n1 f59370x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final UIKitFrameLayout f59371y;
    public View z;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.navbar.NavBarWithContainer$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBarWithContainer(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f59362m = g0.b(context, e0.NAV_BAR);
        this.o = getResources().getDimensionPixelSize(R$dimen.internal_nav_bar_with_container_toolbar_height);
        v1.Companion.getClass();
        this.f59364p = t1.a(context);
        this.f59368t = kli.a.s(R$attr.uikit_colorBackground, context);
        this.v = new z4(this);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        AttributeSet attributeSet2 = null;
        int i = 6;
        int i2 = 0;
        NavBarWithContainerHeaderView navBarWithContainerHeaderView = new NavBarWithContainerHeaderView(context2, attributeSet2, i, i2);
        navBarWithContainerHeaderView.setMenuItemsBackgroundType$ui_kit_components_release(0);
        navBarWithContainerHeaderView.setId(R$id.navBarWithContainer_headerView);
        navBarWithContainerHeaderView.setLayoutParams(new CoordinatorLayout.LayoutParams(-1, -2));
        navBarWithContainerHeaderView.setLongClickable(true);
        r10.v vVar = new r10.v(this, navBarWithContainerHeaderView, new j0(0));
        this.f59369w = vVar;
        this.f59371y = new UIKitFrameLayout(context, attributeSet2, i, i2);
        int iK = kli.a.k(context, 8.0f);
        this.B = iK;
        this.C = iK;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f59363n = frameLayout;
        AppBarLayout.LayoutParams layoutParams = new AppBarLayout.LayoutParams(-1, -2);
        layoutParams.setScrollFlags(3);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setFitsSystemWindows(true);
        addView(frameLayout);
        vVar.c();
        navBarWithContainerHeaderView.setAnimationCallback$ui_kit_components_release(this);
        this.A = new p56.a(this, 28);
        ViewCompat.setOnApplyWindowInsetsListener(frameLayout, new m0(6));
        setStateListAnimator(null);
        setFitsSystemWindows(true);
        setBackgroundColor(0);
        c8g.a.a(this, ny0.a.f220589a, new tpl.o(this, 26));
    }

    private final int getCollapsedContentViewHeight() {
        KeyEvent.Callback callback = this.F;
        x2 x2Var = callback instanceof x2 ? (x2) callback : null;
        if (x2Var == null) {
            return 0;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return x2Var.n(context);
    }

    private final int getContentViewBottomMargin() {
        View view = this.F;
        ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    private final int getContentViewExtraBottomInset() {
        KeyEvent.Callback callback = this.F;
        x2 x2Var = callback instanceof x2 ? (x2) callback : null;
        if (x2Var == null) {
            return 0;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return x2Var.w(context);
    }

    private final int getHeaderDisclaimerHeight() {
        r10.v vVar = this.f59369w;
        vVar.c();
        TextView headerDisclaimer = ((NavBarWithContainerHeaderView) ((ViewGroup) vVar.f250864c)).getHeaderDisclaimer();
        int measuredHeight = headerDisclaimer.getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = headerDisclaimer.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = measuredHeight + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        ViewGroup.LayoutParams layoutParams2 = headerDisclaimer.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        Integer numValueOf = headerDisclaimer.getVisibility() == 0 ? Integer.valueOf(i + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0)) : null;
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    private final d1 getOrCreateStatusBarLayer() {
        h30.q qVar;
        Window window;
        View decorView;
        n1 n1Var = this.f59370x;
        if (n1Var != null) {
            return n1Var;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        int i = R$id.internal_status_bar_controller_tag;
        y9 y9Var = y9.THEME;
        a5.a styleApplicator = new a5.a(19);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(styleApplicator, "styleApplicator");
        Activity activityI = z92.f.i(context);
        View viewFindViewById = (activityI == null || (window = activityI.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : decorView.findViewById(R.id.content);
        if (activityI == null || viewFindViewById == null) {
            qVar = null;
        } else {
            Object tag2 = viewFindViewById.getTag(i);
            r1 r1Var = tag2 instanceof r1 ? (r1) tag2 : null;
            if (r1Var == null) {
                r1Var = new r1();
                viewFindViewById.setTag(i, r1Var);
            }
            qVar = new h30.q(y9Var, styleApplicator, r1Var, context);
        }
        o1 priority = o1.OVERLAY;
        Intrinsics.checkNotNullParameter(priority, "priority");
        n1 n1Var2 = new n1(qVar, qVar != null ? Long.valueOf(qVar.K0(priority)) : null);
        this.f59370x = n1Var2;
        return n1Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setHeaderDisclaimer$lambda$0(NavBarWithContainer navBarWithContainer) {
        int i = navBarWithContainer.G;
        if (i != 0) {
            navBarWithContainer.A(i);
        }
    }

    public final void A(int i) {
        int headerDisclaimerHeight = this.o + i + getHeaderDisclaimerHeight();
        N();
        KeyEvent.Callback callback = this.F;
        x2 x2Var = callback instanceof x2 ? (x2) callback : null;
        if (x2Var != null) {
            x2Var.d0(headerDisclaimerHeight);
        }
    }

    public final boolean B() {
        View childAt = this.f59371y.getChildAt(0);
        return (childAt == null || childAt.getVisibility() == 8) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean C() {
        return this.f59362m || ((Boolean) jo0.g.D.getValue()).booleanValue();
    }

    public final efm.r D() {
        r10.v vVar = this.f59369w;
        vVar.c();
        return ((NavBarWithContainerHeaderView) ((ViewGroup) vVar.f250864c)).P;
    }

    public final efm.r F() {
        r10.v vVar = this.f59369w;
        vVar.c();
        return ((NavBarWithContainerHeaderView) ((ViewGroup) vVar.f250864c)).Q;
    }

    public final efm.r H() {
        r10.v vVar = this.f59369w;
        vVar.c();
        return ((NavBarWithContainerHeaderView) ((ViewGroup) vVar.f250864c)).U;
    }

    public final efm.r I() {
        r10.v vVar = this.f59369w;
        vVar.c();
        return ((NavBarWithContainerHeaderView) ((ViewGroup) vVar.f250864c)).V;
    }

    public final efm.r K() {
        r10.v vVar = this.f59369w;
        vVar.c();
        return ((NavBarWithContainerHeaderView) ((ViewGroup) vVar.f250864c)).R;
    }

    public final efm.r L() {
        r10.v vVar = this.f59369w;
        vVar.c();
        return ((NavBarWithContainerHeaderView) ((ViewGroup) vVar.f250864c)).f59386m.f59002m;
    }

    public final void M() {
        r10.v vVar = this.f59369w;
        vVar.c();
        ((NavBarWithContainerHeaderView) ((ViewGroup) vVar.f250864c)).f59386m.setVisibility(8);
    }

    public final void N() {
        View viewB;
        if ((!C() || B()) && (viewB = this.v.b()) != null) {
            viewB.setY(B() ? (getY() + getHeight()) - getContentViewExtraBottomInset() : this.o + this.G + getHeaderDisclaimerHeight() + getCollapsedContentViewHeight() + this.I);
        }
    }

    public final void O(float f) {
        r10.v vVar = this.f59369w;
        vVar.c();
        y9 y9VarC = (f < ((NavBarWithContainerHeaderView) ((ViewGroup) vVar.f250864c)).getExpandRatioToChangeAppearance() || this.F == null) ? y9.THEME : this.f59364p.c();
        if (y9VarC != this.u) {
            this.u = y9VarC;
            ((n1) getOrCreateStatusBarLayer()).a(y9VarC);
        }
    }

    @Override // tx0.e2
    public final int a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        View view = this.F;
        int dimensionPixelSize = 0;
        if (!B() && (view instanceof x2)) {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(R$dimen.internal_nav_bar_with_container_content_overlap);
        }
        return dimensionPixelSize + getContentViewExtraBottomInset();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        FrameLayout frameLayout = this.f59363n;
        if (Intrinsics.f(view, frameLayout)) {
            super.addView(view, i, layoutParams);
            return;
        }
        boolean z = view instanceof x2;
        u2 u2Var = this.k;
        r10.v vVar = this.f59369w;
        if (z) {
            this.F = view;
            x2 x2Var = z ? (x2) view : null;
            if (x2Var != null) {
                x2Var.setColorSchemeListener(this.A);
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            frameLayout.addView(view, 0, ((x2) view).N(context));
            vVar.c();
            v2 source = (v2) ((ViewGroup) vVar.f250864c);
            Intrinsics.checkNotNullParameter(source, "source");
            u2Var.f(source);
            return;
        }
        UIKitFrameLayout uIKitFrameLayout = this.f59371y;
        if (uIKitFrameLayout.getChildCount() > 0) {
            throw new IllegalStateException("Only one bottom view is supported");
        }
        uIKitFrameLayout.addView(view);
        uIKitFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        uIKitFrameLayout.setPadding(uIKitFrameLayout.getPaddingLeft(), uIKitFrameLayout.getPaddingTop(), uIKitFrameLayout.getPaddingRight(), getContentViewExtraBottomInset());
        View view2 = new View(getContext());
        view2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        view2.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.z = view2;
        view2.setBackgroundColor(this.f59368t);
        frameLayout.addView(this.z);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = this.B;
        layoutParams2.bottomMargin = this.C;
        layoutParams2.gravity = 80;
        Unit unit = Unit.f186387a;
        frameLayout.addView(uIKitFrameLayout, layoutParams2);
        vVar.c();
        v2 source2 = (v2) ((ViewGroup) vVar.f250864c);
        Intrinsics.checkNotNullParameter(source2, "source");
        u2Var.f(source2);
    }

    public final efm.r b() {
        r10.v vVar = this.f59369w;
        vVar.c();
        return ((NavBarWithContainerHeaderView) ((ViewGroup) vVar.f250864c)).f59375b.f57403b;
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public Parcelable getF53584p() {
        return this.analyticsContext;
    }

    @Override // au0.o, com.google.android.material.appbar.AppBarLayout, androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NotNull
    /* JADX INFO: renamed from: getBehavior */
    public CoordinatorLayout.Behavior<AppBarLayout> getShadowBehaviour() {
        return new NavBarWithContainerBehaviour();
    }

    @NotNull
    public final NavBarWithContainerHeaderView getHeaderView() {
        r10.v vVar = this.f59369w;
        vVar.c();
        return (NavBarWithContainerHeaderView) ((ViewGroup) vVar.f250864c);
    }

    @Override // tx0.e2
    public int getOverlapMode() {
        return 1;
    }

    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // au0.o
    public final void k(float f, int i) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        if (this.H) {
            f = 1.0f;
        }
        r10.v vVar = this.f59369w;
        vVar.c();
        ViewGroup viewGroup = (ViewGroup) vVar.f250864c;
        ((NavBarWithContainerHeaderView) viewGroup).K = i;
        vVar.c();
        ((NavBarWithContainerHeaderView) viewGroup).setExpandRatio(f);
        KeyEvent.Callback callback = this.F;
        View viewFindViewById = null;
        x2 x2Var = callback instanceof x2 ? (x2) callback : null;
        if (x2Var != null) {
            x2Var.d(f, i);
        }
        O(f);
        boolean zB = B();
        z4 z4Var = this.v;
        if (zB) {
            if (((Boolean) jo0.g.D.getValue()).booleanValue()) {
                vVar.c();
                float expandRatioToChangeAppearance = ((NavBarWithContainerHeaderView) viewGroup).getExpandRatioToChangeAppearance();
                float f4 = expandRatioToChangeAppearance > BitmapDescriptorFactory.HUE_RED ? kotlin.ranges.f.f((expandRatioToChangeAppearance - f) / expandRatioToChangeAppearance, BitmapDescriptorFactory.HUE_RED, 1.0f) : f == BitmapDescriptorFactory.HUE_RED ? 1.0f : 0.0f;
                View view = this.z;
                if (view != null) {
                    view.setAlpha(f4);
                }
                View viewB = z4Var.b();
                if (viewB != null) {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate2 = viewB.animate();
                    if (viewPropertyAnimatorAnimate2 != null) {
                        viewPropertyAnimatorAnimate2.cancel();
                    }
                    au0.o.w(viewB, f4);
                }
            } else if (f == BitmapDescriptorFactory.HUE_RED && !this.D) {
                this.D = true;
                y(true);
            } else if (f > BitmapDescriptorFactory.HUE_RED && this.D) {
                this.D = false;
                y(false);
            }
        }
        if (getTotalScrollRange() != 0) {
            if (!B() && !C()) {
                View viewB2 = z4Var.b();
                if (getCollapsedContentViewHeight() <= 0) {
                    float fN = au0.o.n(f, 0.5f, true);
                    if (viewB2 != null && (viewPropertyAnimatorAnimate = viewB2.animate()) != null) {
                        viewPropertyAnimatorAnimate.cancel();
                    }
                    if (viewB2 != null) {
                        au0.o.w(viewB2, fN);
                    }
                } else if (viewB2 != null) {
                    viewB2.setAlpha(f != BitmapDescriptorFactory.HUE_RED ? 0.0f : 1.0f);
                }
            } else if ((B() && f == 1.0f) || (!B() && C())) {
                View view2 = z4Var.f9456c;
                if (view2 == null) {
                    ViewParent parent = z4Var.f9454a.getParent();
                    CoordinatorLayout coordinatorLayout = parent instanceof CoordinatorLayout ? (CoordinatorLayout) parent : null;
                    if (coordinatorLayout != null) {
                        viewFindViewById = coordinatorLayout.findViewById(z4Var.f9455b);
                    }
                } else {
                    viewFindViewById = view2;
                }
                if (viewFindViewById != null) {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate3 = viewFindViewById.animate();
                    if (viewPropertyAnimatorAnimate3 != null) {
                        viewPropertyAnimatorAnimate3.cancel();
                    }
                    viewFindViewById.setAlpha(BitmapDescriptorFactory.HUE_RED);
                }
            }
        }
        N();
    }

    @Override // com.google.android.material.appbar.AppBarLayoutProxy
    public final WindowInsetsCompat onApplyWindowInsets(WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        int iSystemBars = WindowInsetsCompat.Type.systemBars();
        Insets insets2 = insets.getInsets(iSystemBars);
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        int i = insets2.top;
        if (i != this.G) {
            this.G = i;
            A(i);
        }
        Insets insetsOf = Insets.of(insets.getSystemWindowInsetLeft(), 0, insets.getSystemWindowInsetRight(), insets.getSystemWindowInsetBottom());
        Intrinsics.checkNotNullExpressionValue(insetsOf, "of(...)");
        WindowInsetsCompat windowInsetsCompatBuild = new WindowInsetsCompat.Builder(insets).setSystemWindowInsets(insetsOf).setInsets(iSystemBars, Insets.of(insets2.left, 0, insets2.right, insets2.bottom)).build();
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompatBuild, "build(...)");
        return windowInsetsCompatBuild;
    }

    @Override // com.google.android.material.appbar.AppBarLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        y9 y9Var = this.u;
        if (y9Var != null) {
            ((n1) getOrCreateStatusBarLayer()).a(y9Var);
        }
    }

    @Override // au0.o, com.google.android.material.appbar.AppBarLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n1 n1Var = this.f59370x;
        if (n1Var != null) {
            n1Var.b();
            this.f59370x = null;
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f59369w.c();
    }

    @Override // au0.o, com.google.android.material.appbar.AppBarLayoutProxy, com.google.android.material.appbar.AppBarLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        N();
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.google.android.material.appbar.AppBarLayout, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int dimensionPixelSize;
        int paddingBottom;
        float bottom;
        View view = this.F;
        ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        boolean zB = B();
        int i3 = this.o;
        int i5 = 0;
        if (zB) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            UIKitFrameLayout uIKitFrameLayout = this.f59371y;
            uIKitFrameLayout.measure(i, iMakeMeasureSpec);
            int measuredHeight = uIKitFrameLayout.getMeasuredHeight() - uIKitFrameLayout.getPaddingBottom();
            int i6 = measuredHeight / 2;
            dimensionPixelSize = uIKitFrameLayout.getPaddingBottom() + i6;
            int i21 = this.C;
            paddingBottom = uIKitFrameLayout.getPaddingBottom() + this.G + i3 + measuredHeight + i21 + this.B + getHeaderDisclaimerHeight();
            setReflectiveSurfaceCollapsedHeight$ui_kit_components_release(null);
            i5 = i6 + i21;
        } else {
            dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.internal_nav_bar_with_container_content_overlap) + getContentViewExtraBottomInset();
            int headerDisclaimerHeight = i3 + getHeaderDisclaimerHeight() + getCollapsedContentViewHeight();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iK = kli.a.k(context, 32.0f) + headerDisclaimerHeight;
            if (((Boolean) jo0.g.D.getValue()).booleanValue()) {
                headerDisclaimerHeight = 0;
            }
            Integer numValueOf = Integer.valueOf(iK);
            if (!((Boolean) jo0.g.D.getValue()).booleanValue()) {
                numValueOf = null;
            }
            setReflectiveSurfaceCollapsedHeight$ui_kit_components_release(numValueOf);
            paddingBottom = headerDisclaimerHeight;
        }
        if (dimensionPixelSize != this.E) {
            this.E = dimensionPixelSize;
            KeyEvent.Callback callback = this.F;
            x2 x2Var = callback instanceof x2 ? (x2) callback : null;
            if (x2Var != null) {
                x2Var.H(dimensionPixelSize);
            }
        }
        if (i5 != getContentViewBottomMargin() && marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = i5;
        }
        FrameLayout frameLayout = this.f59363n;
        if (paddingBottom != frameLayout.getMinimumHeight()) {
            frameLayout.setMinimumHeight(paddingBottom);
        }
        r10.v vVar = this.f59369w;
        vVar.c();
        ViewGroup viewGroup = (ViewGroup) vVar.f250864c;
        ((NavBarWithContainerHeaderView) viewGroup).setHasDockedBottomView$ui_kit_components_release(B());
        super.onMeasure(i, i2);
        vVar.c();
        NavBarWithContainerHeaderView navBarWithContainerHeaderView = (NavBarWithContainerHeaderView) viewGroup;
        int measuredHeight2 = frameLayout.getMeasuredHeight();
        int minimumHeight = frameLayout.getMinimumHeight();
        int i22 = this.E;
        int i32 = measuredHeight2 - minimumHeight;
        navBarWithContainerHeaderView.q0 = i32;
        int i33 = g3.f275144b[navBarWithContainerHeaderView.expandAnimatorTiming.ordinal()];
        if (i33 == 1) {
            float f = measuredHeight2;
            bottom = (f - (navBarWithContainerHeaderView.getBottom() / 2.0f)) / f;
        } else {
            if (i33 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bottom = i22 / i32;
        }
        navBarWithContainerHeaderView.expandRatioToChangeAppearance = bottom;
    }

    @Override // au0.o
    public final void q(int i, int i2, ViewGroup viewGroup) {
        int i3;
        super.q(i, i2, viewGroup);
        int height = i2 - getHeight();
        int totalScrollRange = getTotalScrollRange();
        if (totalScrollRange < 0) {
            totalScrollRange = 0;
        }
        int iMin = B() ? Integer.MAX_VALUE : Math.min(Math.max(0, i - height), totalScrollRange);
        if (getMaxCollapseOffset$ui_kit_components_release() != iMin) {
            setMaxCollapseOffset$ui_kit_components_release(iMin);
            CollapsingAppBarLayout$Behavior currentBehaviourOrNull$ui_kit_components_release = getCurrentBehaviourOrNull$ui_kit_components_release();
            if (currentBehaviourOrNull$ui_kit_components_release != null) {
                Intrinsics.checkNotNullParameter(this, "appBarLayout");
                int maxCollapseOffset$ui_kit_components_release = getMaxCollapseOffset$ui_kit_components_release();
                if (maxCollapseOffset$ui_kit_components_release != Integer.MAX_VALUE && currentBehaviourOrNull$ui_kit_components_release.getTopAndBottomOffset() < (i3 = -maxCollapseOffset$ui_kit_components_release)) {
                    currentBehaviourOrNull$ui_kit_components_release.c(this, i3);
                }
            }
            viewGroup.requestLayout();
        }
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        this.analyticsContext = parcelable;
        r10.v vVar = this.f59369w;
        vVar.c();
        ((NavBarWithContainerHeaderView) ((ViewGroup) vVar.f250864c)).setAnalyticsContext(parcelable);
    }

    public final void setAvatar(@NotNull t2 avatar) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        r10.v vVar = this.f59369w;
        vVar.c();
        ((NavBarWithContainerHeaderView) ((ViewGroup) vVar.f250864c)).setAvatar(avatar);
    }

    public final void setBottomViewAlpha$ui_kit_components_release(float alpha) {
        this.f59371y.setAlpha(alpha);
    }

    public final void setBottomViewInteractionsEnabled$ui_kit_components_release(boolean enabled) {
        this.f59371y.setTouchingEnabled(enabled);
    }

    public final void setHeaderDisclaimer(Clause headerDisclaimerClause) {
        r10.v vVar = this.f59369w;
        vVar.c();
        ((NavBarWithContainerHeaderView) ((ViewGroup) vVar.f250864c)).setHeaderDisclaimer(headerDisclaimerClause);
        post(new t70.x(this, 10));
    }

    @yhm.d
    public final void setHideTitleWhenExpanded(boolean hide) {
        r10.v vVar = this.f59369w;
        vVar.c();
        ((NavBarWithContainerHeaderView) ((ViewGroup) vVar.f250864c)).setHideTitleWhenExpanded(hide);
    }

    public final void setMenuItems(@NotNull List<? extends NavBarMenuItem> menuItems) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        r10.v vVar = this.f59369w;
        vVar.c();
        ((NavBarWithContainerHeaderView) ((ViewGroup) vVar.f250864c)).setMenuItems(menuItems);
    }

    public final void setMessage(NavBarMessage message) {
        r10.v vVar = this.f59369w;
        vVar.c();
        ((NavBarWithContainerHeaderView) ((ViewGroup) vVar.f250864c)).setPersistentMessage(message);
    }

    public final void setNavigationButtonIcon(Integer iconRes) {
        r10.v vVar = this.f59369w;
        vVar.c();
        ((NavBarWithContainerHeaderView) ((ViewGroup) vVar.f250864c)).setNavigationButtonImage(iconRes != null ? new ResourceImage(iconRes.intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null);
    }

    public final void setNavigationButtonImage(Image image) {
        r10.v vVar = this.f59369w;
        vVar.c();
        ((NavBarWithContainerHeaderView) ((ViewGroup) vVar.f250864c)).setNavigationButtonImage(image);
    }

    public final void setSearchButtonActions(@NotNull k9 buttons) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        r10.v vVar = this.f59369w;
        vVar.c();
        ((NavBarWithContainerHeaderView) ((ViewGroup) vVar.f250864c)).setSearchButtonActions(buttons);
    }

    public final void setSearchButtonText(Clause searchButtonText) {
        r10.v vVar = this.f59369w;
        vVar.c();
        ((NavBarWithContainerHeaderView) ((ViewGroup) vVar.f250864c)).setSearchButtonText(searchButtonText);
    }

    public final void setTagView(f3 model) {
        r10.v vVar = this.f59369w;
        vVar.c();
        ((NavBarWithContainerHeaderView) ((ViewGroup) vVar.f250864c)).setTagView(model);
    }

    public final void setTitle(@NotNull Clause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        r10.v vVar = this.f59369w;
        vVar.c();
        ((NavBarWithContainerHeaderView) ((ViewGroup) vVar.f250864c)).setTitle(title);
    }

    @yhm.d
    public final void setTitleWithSubtitle(@NotNull Clause title, Clause subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        r10.v vVar = this.f59369w;
        vVar.c();
        ((NavBarWithContainerHeaderView) ((ViewGroup) vVar.f250864c)).setTitleWithSubtitle(title, subtitle);
    }

    public final void y(boolean z) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        View view = this.z;
        float f = BitmapDescriptorFactory.HUE_RED;
        if (view != null && (viewPropertyAnimatorAnimate2 = view.animate()) != null) {
            ViewPropertyAnimator viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate2.alpha(z ? 1.0f : 0.0f);
            if (viewPropertyAnimatorAlpha != null) {
                viewPropertyAnimatorAlpha.setDuration(200L);
            }
        }
        View viewB = this.v.b();
        if (viewB == null || (viewPropertyAnimatorAnimate = viewB.animate()) == null) {
            return;
        }
        if (z) {
            f = 1.0f;
        }
        ViewPropertyAnimator viewPropertyAnimatorAlpha2 = viewPropertyAnimatorAnimate.alpha(f);
        if (viewPropertyAnimatorAlpha2 != null) {
            viewPropertyAnimatorAlpha2.setDuration(200L);
        }
    }

    @yhm.d
    public final void setAvatar(@NotNull Image avatar) {
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(avatar, "avatarImage");
        ImageWithAnimatedBackgroundView.Model avatarImage = new ImageWithAnimatedBackgroundView.Model(avatar, null);
        Intrinsics.checkNotNullParameter(avatarImage, "avatarImage");
        setAvatar(new t2(new AvatarModel.Default(avatar, null, null, null, Constants.TAG_EE_SUPPORTED_RPC_ID_LIST), false));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavBarWithContainer(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
