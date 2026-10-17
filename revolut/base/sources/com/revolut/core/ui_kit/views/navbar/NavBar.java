package com.revolut.core.ui_kit.views.navbar;

import android.animation.Animator;
import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import au0.c0;
import au0.g2;
import au0.j4;
import au0.k4;
import au0.z4;
import aw0.k9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.core.ui_kit.R$dimen;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.internal.views.navbar.CollapsingAppBarSnapBehavior;
import com.revolut.core.ui_kit.internal.views.navbar.ConstraintHeaderLayout;
import com.revolut.core.ui_kit.internal.views.navbar.ImageAutoSizeTextView;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.FitsSystemWindowsConstraintLayout;
import com.revolut.core.ui_kit.views.buttons.SearchButton;
import com.revolut.core.ui_kit.views.navbar.NavBar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tx0.e4;
import tx0.g0;
import tx0.h0;
import tx0.h1;
import tx0.i0;
import tx0.i1;
import tx0.j1;
import tx0.k0;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \u0096\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0005f\u0097\u0001\u0098\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010 J\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\"H\u0016¢\u0006\u0004\b\u001f\u0010#J\u001d\u0010%\u001a\u00020\u00112\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0018H\u0016¢\u0006\u0004\b%\u0010\u001cJ\u0019\u0010'\u001a\u00020\u00112\b\u0010&\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b'\u0010 J\u0017\u0010*\u001a\u00020\u00112\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00112\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u000fH\u0016¢\u0006\u0004\b1\u0010\u0013J\u0017\u00104\u001a\u00020\u00112\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J%\u0010:\u001a\u00020\u00112\f\u00107\u001a\b\u0012\u0004\u0012\u0002060\u00182\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u001d\u0010:\u001a\u00020\u00112\f\u00107\u001a\b\u0012\u0004\u0012\u0002060\u0018H\u0016¢\u0006\u0004\b:\u0010\u001cJ\u0019\u0010=\u001a\u00020\u00112\b\u0010<\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b=\u0010 J\u0015\u0010=\u001a\u00020\u00112\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b=\u0010@J\u0015\u0010B\u001a\u00020\u00112\u0006\u0010A\u001a\u00020\u000f¢\u0006\u0004\bB\u0010\u0013J\u0019\u0010D\u001a\u00020\u00112\b\b\u0001\u0010C\u001a\u000202H\u0007¢\u0006\u0004\bD\u00105J\u0017\u0010E\u001a\u00020\u00112\b\u0010<\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\bE\u0010 J\u0017\u0010F\u001a\u00020\u00112\b\u0010<\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\bF\u0010 J\u0015\u0010I\u001a\u00020\u00112\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bI\u0010JJ\u0019\u0010K\u001a\u00020\u00112\b\b\u0001\u0010C\u001a\u000202H\u0007¢\u0006\u0004\bK\u00105J\u0019\u0010L\u001a\u00020\u00112\b\b\u0001\u0010C\u001a\u000202H\u0007¢\u0006\u0004\bL\u00105J-\u0010R\u001a\u00020\u00112\b\u0010N\u001a\u0004\u0018\u00010M2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010O2\b\b\u0002\u0010Q\u001a\u00020\u000f¢\u0006\u0004\bR\u0010SJ-\u0010R\u001a\u00020\u00112\b\u0010N\u001a\u0004\u0018\u00010T2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010O2\b\b\u0002\u0010Q\u001a\u00020\u000f¢\u0006\u0004\bR\u0010UJ\u0015\u0010V\u001a\u00020\u00112\u0006\u0010A\u001a\u00020\u000f¢\u0006\u0004\bV\u0010\u0013J\u0017\u0010W\u001a\u00020\u00112\u0006\u0010A\u001a\u00020\u000fH\u0007¢\u0006\u0004\bW\u0010\u0013J\u0015\u0010W\u001a\u00020\u00112\u0006\u0010Y\u001a\u00020X¢\u0006\u0004\bW\u0010ZJ\u0017\u0010\\\u001a\u00020\u00112\u0006\u0010-\u001a\u00020[H\u0007¢\u0006\u0004\b\\\u0010]J\u0017\u0010^\u001a\u00020\u00112\b\u0010N\u001a\u0004\u0018\u00010M¢\u0006\u0004\b^\u0010_J\u001b\u0010b\u001a\u00020\u00112\f\u0010a\u001a\b\u0012\u0004\u0012\u00020`0\u0018¢\u0006\u0004\bb\u0010\u001cJ\r\u0010d\u001a\u00020c¢\u0006\u0004\bd\u0010eJ\u0015\u0010h\u001a\u00020\u00112\u0006\u0010g\u001a\u00020f¢\u0006\u0004\bh\u0010iR\u001b\u0010o\u001a\u00020j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u001b\u0010t\u001a\u00020p8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010l\u001a\u0004\br\u0010sR\u001b\u0010y\u001a\u00020u8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010l\u001a\u0004\bw\u0010xR\u001b\u0010~\u001a\u00020z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010l\u001a\u0004\b|\u0010}R\u001f\u0010\u0083\u0001\u001a\u00020\u007f8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0080\u0001\u0010l\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R \u0010\u0088\u0001\u001a\u00030\u0084\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0085\u0001\u0010l\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R \u0010\u008d\u0001\u001a\u00030\u0089\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008a\u0001\u0010l\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R)\u0010\u0092\u0001\u001a\u00020\u000f2\u0007\u0010\u008e\u0001\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0005\b\u0091\u0001\u0010\u0013R)\u0010\u0095\u0001\u001a\u00020\u000f2\u0007\u0010\u008e\u0001\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0093\u0001\u0010\u0090\u0001\"\u0005\b\u0094\u0001\u0010\u0013¨\u0006\u0099\u0001"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/NavBar;", "Lau0/o;", "Lau0/g2;", "Lau0/k4;", "Ltx0/e4;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Lcom/google/android/material/appbar/AppBarLayout;", "getBehavior", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "", "active", "", "setSearchButtonActive", "(Z)V", "Landroid/os/Parcelable;", "analyticsContext", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "", "Landroid/text/InputFilter;", "filters", "setSearchInputFilters", "(Ljava/util/List;)V", "Lcom/revolut/core/ui_kit/models/Clause;", "input", "setSearchInput", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "setSearchInputSilently", "", "(Ljava/lang/String;)V", "hints", "setHints", "clause", "setSearchContentDescription", "Law0/k9;", "buttons", "setSearchFieldActionButtons", "(Law0/k9;)V", "Law0/e4;", "state", "setFiltersState", "(Law0/e4;)V", "enabled", "setSortingEnabled", "", "index", "setSearchInputSelection", "(I)V", "Lcom/revolut/core/ui_kit/views/navbar/NavBarMenuItem;", "menuItems", "Lyy0/f;", "imageDisplayer", "setMenuItems", "(Ljava/util/List;Lyy0/f;)V", "text", "setTitle", "Lcom/revolut/core/ui_kit/views/navbar/NavBar$b;", "title", "(Lcom/revolut/core/ui_kit/views/navbar/NavBar$b;)V", "clickable", "setTitleLeadingIconClickable", "colorAttrId", "setTitleColor", "setDescriptionText", "setSecondDescriptionText", "", "payload", "setDescriptionClickPayload", "(Ljava/lang/Object;)V", "setSecondDescriptionColor", "setDescriptionColor", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "Lcom/revolut/core/ui_kit/internal/views/ProgressStyle;", "progress", "imageBadgeVisible", "setDescriptionImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;Lcom/revolut/core/ui_kit/internal/views/ProgressStyle;Z)V", "Ltx0/i0;", "(Ltx0/i0;Lcom/revolut/core/ui_kit/internal/views/ProgressStyle;Z)V", "setTitleClickable", "setDescriptionClickable", "Lau0/c0;", "clickableMode", "(Lau0/c0;)V", "Ltx0/g0;", "setTitleChevron", "(Ltx0/g0;)V", "setTitleChevronIcon", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "Lcom/revolut/core/ui_kit/views/ActionsView$Item;", "actions", "setActions", "Landroid/view/View;", "getHeaderView", "()Landroid/view/View;", "Ltx0/i1;", "margin", "setHeaderEndMargin", "(Ltx0/i1;)V", "Landroidx/recyclerview/widget/RecyclerView;", "l", "Le8/q;", "getHeaderExtraContainer", "()Landroidx/recyclerview/widget/RecyclerView;", "headerExtraContainer", "Lcom/revolut/core/ui_kit/internal/views/navbar/ConstraintHeaderLayout;", "m", "getHeaderLayout", "()Lcom/revolut/core/ui_kit/internal/views/navbar/ConstraintHeaderLayout;", "headerLayout", "Lcom/revolut/core/ui_kit/views/FitsSystemWindowsConstraintLayout;", "n", "getNavBarRoot", "()Lcom/revolut/core/ui_kit/views/FitsSystemWindowsConstraintLayout;", "navBarRoot", "Lcom/revolut/core/ui_kit/internal/views/navbar/SearchView;", "o", "getSearchView", "()Lcom/revolut/core/ui_kit/internal/views/navbar/SearchView;", "searchView", "Lcom/revolut/core/ui_kit/internal/views/navbar/ImageAutoSizeTextView;", "p", "getChevronTextView", "()Lcom/revolut/core/ui_kit/internal/views/navbar/ImageAutoSizeTextView;", "chevronTextView", "Lcom/revolut/core/ui_kit/views/ActionsView;", "q", "getActionsView", "()Lcom/revolut/core/ui_kit/views/ActionsView;", "actionsView", "Lcom/revolut/core/ui_kit/views/buttons/SearchButton;", "r", "getSearchButton", "()Lcom/revolut/core/ui_kit/views/buttons/SearchButton;", "searchButton", "value", "getDescriptionVisible", "()Z", "setDescriptionVisible", "descriptionVisible", "getSecondDescriptionVisible", "setSecondDescriptionVisible", "secondDescriptionVisible", "Companion", "b", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NavBar extends au0.o implements g2, k4, e4 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public Animator A;
    public b B;
    public final ihm.f C;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final e8.q headerExtraContainer;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final e8.q headerLayout;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final e8.q navBarRoot;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final e8.q searchView;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final e8.q chevronTextView;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final e8.q actionsView;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final e8.q searchButton;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.core.ui_kit.internal.views.navbar.d f59269s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z4 f59270t;
    public final ifm.b u;
    public final boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f59271w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f59272x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public MotionEvent f59273y;
    public RectF z;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.navbar.NavBar$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static abstract class b {
        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBar(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.headerExtraContainer = kli.a.J(R$id.headerExtraContainer, this);
        this.headerLayout = kli.a.J(R$id.headerLayout, this);
        this.navBarRoot = kli.a.J(R$id.navBarRoot, this);
        this.searchView = kli.a.J(R$id.searchView, this);
        this.chevronTextView = kli.a.J(R$id.headerLayout_chevronTextView, this);
        this.actionsView = kli.a.J(R$id.navBar_actionsView, this);
        this.searchButton = kli.a.J(R$id.navBar_searchButton, this);
        this.f59270t = new z4(this);
        this.u = new ifm.b();
        this.v = true;
        this.z = new RectF();
        this.C = v0.a.d("create(...)");
        View.inflate(context, R$layout.internal_view_nav_bar, this);
        this.f59269s = new com.revolut.core.ui_kit.internal.views.navbar.d(getHeaderExtraContainer());
        setClipChildren(false);
        setClipToPadding(false);
        setStateListAnimator(null);
        setBackground(null);
    }

    public static Unit A(NavBar navBar, float f) {
        float f4 = 1 - f;
        navBar.getHeaderExtraContainer().setAlpha(f4);
        navBar.getChevronTextView().setAlpha(f4);
        return Unit.f186387a;
    }

    public static Unit B(NavBar navBar) {
        navBar.getHeaderExtraContainer().setVisibility(0);
        navBar.getChevronTextView().setVisibility(0);
        return Unit.f186387a;
    }

    public static Unit C(NavBar navBar) {
        navBar.getHeaderExtraContainer().setVisibility(0);
        return Unit.f186387a;
    }

    public static Unit D(NavBar navBar, boolean z) {
        if (z) {
            navBar.getHeaderExtraContainer().setVisibility(4);
            navBar.getHeaderExtraContainer().setAlpha(BitmapDescriptorFactory.HUE_RED);
        } else {
            navBar.getHeaderExtraContainer().setVisibility(0);
            navBar.getHeaderExtraContainer().setAlpha(1.0f);
        }
        return Unit.f186387a;
    }

    public static Unit F(NavBar navBar, float f) {
        navBar.getSearchView().setAlpha(f);
        navBar.getHeaderExtraContainer().setAlpha(1 - f);
        return Unit.f186387a;
    }

    private final ActionsView getActionsView() {
        return (ActionsView) this.actionsView.f();
    }

    private final ImageAutoSizeTextView getChevronTextView() {
        return (ImageAutoSizeTextView) this.chevronTextView.f();
    }

    private final RecyclerView getHeaderExtraContainer() {
        return (RecyclerView) this.headerExtraContainer.f();
    }

    private final ConstraintHeaderLayout getHeaderLayout() {
        return (ConstraintHeaderLayout) this.headerLayout.f();
    }

    private final FitsSystemWindowsConstraintLayout getNavBarRoot() {
        return (FitsSystemWindowsConstraintLayout) this.navBarRoot.f();
    }

    private final SearchButton getSearchButton() {
        return (SearchButton) this.searchButton.f();
    }

    private final SearchView getSearchView() {
        return (SearchView) this.searchView.f();
    }

    public static /* synthetic */ void setDescriptionImage$default(NavBar navBar, Image image, ProgressStyle progressStyle, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            progressStyle = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        navBar.setDescriptionImage(image, progressStyle, z);
    }

    public static Unit x(NavBar navBar, boolean z) {
        if (z) {
            navBar.getHeaderExtraContainer().setVisibility(4);
            navBar.getHeaderExtraContainer().setAlpha(BitmapDescriptorFactory.HUE_RED);
            navBar.getChevronTextView().setVisibility(4);
            navBar.getChevronTextView().setAlpha(BitmapDescriptorFactory.HUE_RED);
        } else {
            navBar.getHeaderExtraContainer().setVisibility(0);
            navBar.getHeaderExtraContainer().setAlpha(1.0f);
            navBar.getChevronTextView().setVisibility(0);
            navBar.getChevronTextView().setAlpha(1.0f);
        }
        return Unit.f186387a;
    }

    public static Unit y(NavBar navBar) {
        View viewFindFocus;
        if (navBar.v) {
            j4 animation = j4.FADE;
            Intrinsics.checkNotNullParameter(animation, "animation");
            navBar.H(true, animation);
            navBar.getSearchView().o();
            if (navBar.f59271w && (viewFindFocus = navBar.getSearchView().findFocus()) != null) {
                kli.c.d(viewFindFocus, 0L);
            }
        }
        return Unit.f186387a;
    }

    public final void H(boolean z, j4 j4Var) {
        Animator animatorL;
        if (this.f59272x == z) {
            return;
        }
        this.f59272x = z;
        Animator animator = this.A;
        if (animator != null) {
            animator.cancel();
        }
        if (this.f59271w) {
            L();
            if (!z) {
                getSearchView().j();
                e0m.e.a(getSearchView().getFocusedChild());
            }
        }
        if (j4Var == j4.NO_ANIMATION) {
            if (z) {
                getSearchView().setVisibility(0);
                getHeaderExtraContainer().setVisibility(4);
                return;
            } else {
                getSearchView().setVisibility(4);
                getHeaderExtraContainer().setVisibility(0);
                return;
            }
        }
        MotionEvent motionEvent = this.f59273y;
        if (!z) {
            this.f59273y = null;
        }
        if (j4Var == j4.FADE || motionEvent == null) {
            final int i = 0;
            animatorL = getSearchView().l(z, new Function0(this) { // from class: tx0.g1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ NavBar f275137b;

                {
                    this.f275137b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i) {
                        case 0:
                            return NavBar.C(this.f275137b);
                        default:
                            return NavBar.B(this.f275137b);
                    }
                }
            }, new h1(this, 0), new h1(this, 1));
        } else {
            if (z) {
                this.z = getSearchView().g(motionEvent);
            }
            final int i2 = 1;
            animatorL = getSearchView().k(z, this.z, new Function0(this) { // from class: tx0.g1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ NavBar f275137b;

                {
                    this.f275137b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i2) {
                        case 0:
                            return NavBar.C(this.f275137b);
                        default:
                            return NavBar.B(this.f275137b);
                    }
                }
            }, new h1(this, 2), new h1(this, 3));
        }
        animatorL.setDuration(400L);
        animatorL.start();
        this.A = animatorL;
    }

    public final void I(float f, int i) {
        if (this.f59271w && isLaidOut()) {
            getSearchButton().setExpandRatio(f);
            getSearchButton().setTranslationY(i);
            getSearchButton().setClickable(!(f == BitmapDescriptorFactory.HUE_RED));
        }
    }

    public final efm.r K() {
        return getHeaderLayout().f57243b;
    }

    public final void L() {
        if (this.f59271w) {
            if (this.f59272x) {
                setAlwaysExpandedFlagEnabled$ui_kit_components_release(false);
                setScrollEnabled$ui_kit_components_release(false);
                setExpanded(false);
            } else {
                setAlwaysExpandedFlagEnabled$ui_kit_components_release(true);
            }
            this.C.onNext(Boolean.valueOf(this.f59272x));
        }
    }

    @Override // au0.g2
    public final efm.r b() {
        return this.f59269s.f57403b;
    }

    @Override // tx0.e4
    public final void d(int i) {
        if (getTotalScrollRange() != 0) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 60.0f);
        if (i > iK) {
            i = iK;
        }
        float f = i / iK;
        View viewB = this.f59270t.b();
        if (viewB != null) {
            au0.o.w(viewB, f);
        }
        ViewParent parent = getParent();
        CoordinatorLayout coordinatorLayout = parent instanceof CoordinatorLayout ? (CoordinatorLayout) parent : null;
        int paddingTop = coordinatorLayout != null ? coordinatorLayout.getPaddingTop() : 0;
        if (viewB != null) {
            viewB.setY(getHeight() + paddingTop);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f59272x && ((motionEvent != null && motionEvent.getAction() == 1) || (motionEvent != null && motionEvent.getAction() == 3))) {
            this.f59273y = motionEvent;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // au0.o, com.google.android.material.appbar.AppBarLayout, androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NotNull
    /* JADX INFO: renamed from: getBehavior */
    public CoordinatorLayout.Behavior<AppBarLayout> getShadowBehaviour() {
        return new CollapsingAppBarSnapBehavior();
    }

    public final boolean getDescriptionVisible() {
        return getHeaderLayout().getDescriptionVisible();
    }

    @NotNull
    public final View getHeaderView() {
        return getHeaderLayout();
    }

    public final boolean getSecondDescriptionVisible() {
        return getHeaderLayout().getSecondDescriptionVisible();
    }

    @Override // au0.o
    public final void k(float f, int i) {
        float f4 = i;
        getHeaderLayout().setTranslationY(-f4);
        getActionsView().setTranslationY(f4);
        I(f, i);
        float fN = au0.o.n(f, 0.3f, false);
        getHeaderLayout().setDescriptionsVisibilityRatio(fN);
        getActionsView().setAlpha(fN);
        if (!getActionsView().f58306q.f319395l.isEmpty()) {
            getActionsView().setVisibility(fN > BitmapDescriptorFactory.HUE_RED ? 0 : 4);
        }
        if (getTotalScrollRange() != 0) {
            float fN2 = au0.o.n(f, 0.5f, true);
            View viewB = this.f59270t.b();
            if (viewB != null) {
                au0.o.w(viewB, fN2);
            }
            ViewParent parent = getParent();
            CoordinatorLayout coordinatorLayout = parent instanceof CoordinatorLayout ? (CoordinatorLayout) parent : null;
            int paddingTop = coordinatorLayout != null ? coordinatorLayout.getPaddingTop() : 0;
            if (viewB != null) {
                viewB.setY(getHeight() + paddingTop + f4);
            }
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayoutProxy
    public final WindowInsetsCompat onApplyWindowInsets(WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        setPadding(getPaddingLeft(), insets.getInsets(WindowInsetsCompat.Type.systemBars()).top, getPaddingRight(), getPaddingBottom());
        return super.onApplyWindowInsets(insets);
    }

    @Override // au0.o, com.google.android.material.appbar.AppBarLayoutProxy, com.google.android.material.appbar.AppBarLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        int paddingTop = getNavBarRoot().getPaddingTop() + getHeaderLayout().getCollapsedHeight() + getHeaderLayout().getPaddingBottom() + getHeaderLayout().getPaddingTop();
        if (paddingTop != getNavBarRoot().getMinimumHeight()) {
            getNavBarRoot().setMinimumHeight(paddingTop);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = parcelable instanceof Bundle ? (Bundle) parcelable : null;
        if (bundle == null) {
            return;
        }
        if (bundle.getBoolean("STATE_KEY_SEARCH_VISIBLE")) {
            j4 animation = j4.NO_ANIMATION;
            Intrinsics.checkNotNullParameter(animation, "animation");
            H(true, animation);
        } else {
            j4 animation2 = j4.NO_ANIMATION;
            Intrinsics.checkNotNullParameter(animation2, "animation");
            H(false, animation2);
        }
        super.onRestoreInstanceState(bundle.getParcelable("STATE_KEY_SUPER"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("STATE_KEY_SUPER", super.onSaveInstanceState());
        bundle.putBoolean("STATE_KEY_SEARCH_VISIBLE", this.f59272x);
        return bundle;
    }

    public final void setActions(@NotNull List<ActionsView.Item> actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        getActionsView().k(actions, mx0.t.f210002a);
        getActionsView().setVisibility(!actions.isEmpty() ? 0 : 8);
    }

    public final void setAnalyticsContext(Parcelable analyticsContext) {
        getSearchButton().setAnalyticsContext(analyticsContext);
        getSearchView().setAnalyticsContext(analyticsContext);
        getHeaderLayout().setAnalyticsContext(analyticsContext);
    }

    public final void setDescriptionClickPayload(@NotNull Object payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        getHeaderLayout().setDescriptionClickPayload(payload);
    }

    @yhm.d
    public final void setDescriptionClickable(boolean clickable) {
        setDescriptionClickable(clickable ? c0.TEXT_AND_ICON : c0.NONE);
    }

    @yhm.d
    public final void setDescriptionColor(int colorAttrId) {
        getHeaderLayout().setDescriptionColor(colorAttrId);
    }

    public final void setDescriptionImage(Image image, ProgressStyle progress, boolean imageBadgeVisible) {
        setDescriptionImage(image != null ? new i0(image, h0.SIZE_24) : null, progress, imageBadgeVisible);
    }

    public final void setDescriptionText(Clause text) {
        getHeaderLayout().setDescriptionText(text);
    }

    public final void setDescriptionVisible(boolean z) {
        getHeaderLayout().setDescriptionVisible(z);
    }

    public void setFiltersState(@NotNull aw0.e4 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        getSearchView().setFiltersState(state);
        if (this.f59271w) {
            getSearchButton().setFiltersState(state);
        }
    }

    public final void setHeaderEndMargin(@NotNull i1 margin) {
        int dimensionPixelSize;
        Intrinsics.checkNotNullParameter(margin, "margin");
        int i = j1.f275166a[margin.ordinal()];
        if (i == 1) {
            dimensionPixelSize = -2;
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.internal_nav_bar_menu_area_width);
        }
        RecyclerView headerExtraContainer = getHeaderExtraContainer();
        ViewGroup.LayoutParams layoutParams = headerExtraContainer.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = dimensionPixelSize;
        headerExtraContainer.setLayoutParams(layoutParams);
    }

    @Override // au0.k4
    public void setHint(@NotNull Clause hint) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        setHints(zhm.u.c(hint));
    }

    @Override // au0.k4
    public void setHints(@NotNull List<? extends Clause> hints) {
        Intrinsics.checkNotNullParameter(hints, "hints");
        getSearchView().setHints(hints);
        if (this.f59271w) {
            getSearchButton().setText((Clause) d0.d0(hints));
        }
    }

    public void setMenuItems(@NotNull List<? extends NavBarMenuItem> menuItems, @NotNull yy0.f imageDisplayer) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(imageDisplayer, "imageDisplayer");
        this.f59269s.setMenuItems(menuItems);
    }

    @Override // au0.a
    public void setSearchButtonActive(boolean active) {
        if (active == this.f59271w) {
            return;
        }
        this.f59271w = active;
        getSearchButton().setVisibility(active ? 0 : 8);
        getSearchButton().setText((Clause) d0.d0(getSearchView().getHints()));
        ifm.b bVar = this.u;
        if (!active) {
            setAlwaysExpandedFlagEnabled$ui_kit_components_release(true);
            bVar.d();
        } else {
            te0.w.j0(bVar, getSearchButton().f59002m.subscribe(new twl.h(25, new h1(this, 4))));
            te0.w.j0(bVar, getSearchView().f57336l.subscribe(new twl.h(26, new h1(this, 5))));
            I(getExpandRatio(), rim.d.c(getExpandRatio() - 1.0f) * getTotalScrollRange());
            L();
        }
    }

    public void setSearchContentDescription(Clause clause) {
        getSearchView().setSearchContentDescription(clause);
    }

    public void setSearchFieldActionButtons(@NotNull k9 buttons) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        getSearchView().setActionButtons(buttons);
        if (this.f59271w) {
            getSearchButton().setActionButtons(buttons);
        }
    }

    public void setSearchInput(@NotNull Clause input) {
        Intrinsics.checkNotNullParameter(input, "input");
        getSearchView().setSearchInput(input);
    }

    public void setSearchInputFilters(@NotNull List<? extends InputFilter> filters) {
        Intrinsics.checkNotNullParameter(filters, "filters");
        getSearchView().setSearchInputFilters(filters);
    }

    public void setSearchInputSelection(int index) {
        getSearchView().setSearchInputSelection(index);
    }

    public void setSearchInputSilently(@NotNull Clause input) {
        Intrinsics.checkNotNullParameter(input, "input");
        getSearchView().setSearchInputSilently(input);
    }

    @yhm.d
    public final void setSecondDescriptionColor(int colorAttrId) {
        getHeaderLayout().setSecondDescriptionColor(colorAttrId);
    }

    public final void setSecondDescriptionText(Clause text) {
        getHeaderLayout().setSecondDescriptionText(text);
    }

    public final void setSecondDescriptionVisible(boolean z) {
        getHeaderLayout().setSecondDescriptionVisible(z);
    }

    public void setSortingEnabled(boolean enabled) {
        if (this.f59271w) {
            getSearchButton().setSortingEnabled(enabled);
        }
    }

    @yhm.d
    public final void setTitle(Clause text) {
        this.B = null;
        getHeaderLayout().setTitle(text, null);
        getHeaderLayout().setTag(R$id.internal_nav_bar_title_clause, text);
    }

    @yhm.d
    public final void setTitleChevron(@NotNull g0 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        getHeaderLayout().setTitleChevron(state);
    }

    public final void setTitleChevronIcon(Image image) {
        getHeaderLayout().setTitleChevronIcon(image);
    }

    public final void setTitleClickable(boolean clickable) {
        getHeaderLayout().setTitleClickable(clickable);
    }

    @yhm.d
    public final void setTitleColor(int colorAttrId) {
        getHeaderLayout().setTitleColor(colorAttrId);
    }

    public final void setTitleLeadingIconClickable(boolean clickable) {
        getHeaderLayout().setTitleLeadingIconClickable(clickable);
    }

    public static /* synthetic */ void setDescriptionImage$default(NavBar navBar, i0 i0Var, ProgressStyle progressStyle, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            progressStyle = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        navBar.setDescriptionImage(i0Var, progressStyle, z);
    }

    public final void setDescriptionClickable(@NotNull c0 clickableMode) {
        Intrinsics.checkNotNullParameter(clickableMode, "clickableMode");
        getHeaderLayout().setDescriptionClickable(clickableMode);
    }

    public final void setDescriptionImage(i0 image, ProgressStyle progress, boolean imageBadgeVisible) {
        getHeaderLayout().setDescriptionImage(image, progress, imageBadgeVisible);
    }

    @Override // au0.g2
    public void setMenuItems(@NotNull List<? extends NavBarMenuItem> menuItems) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f59269s.setMenuItems(menuItems);
    }

    public void setSearchInput(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        getSearchView().setSearchInput(input);
    }

    @Override // au0.k4
    @yhm.d
    public /* bridge */ void setHint(@NotNull String str) {
        super.setHint(str);
    }

    public final void setTitle(@NotNull b title) {
        Intrinsics.checkNotNullParameter(title, "title");
        if (Intrinsics.f(this.B, title)) {
            return;
        }
        this.B = title;
        if (title instanceof i) {
            getHeaderLayout().setTitleStyle(k0.LARGE);
            ConstraintHeaderLayout headerLayout = getHeaderLayout();
            TextLocalisedClause textLocalisedClause = ((i) title).f59532a;
            headerLayout.setTitle(textLocalisedClause, null);
            getHeaderLayout().setTag(R$id.internal_nav_bar_title_clause, textLocalisedClause);
            return;
        }
        if (title instanceof h) {
            getHeaderLayout().setTitleStyle(k0.EXTRA_SMALL);
            ConstraintHeaderLayout headerLayout2 = getHeaderLayout();
            h hVar = (h) title;
            TextLocalisedClause textLocalisedClause2 = hVar.f59530b;
            headerLayout2.setTitleWithLeadingIcon(textLocalisedClause2, hVar.f59529a, pd.b.j(hVar.f59531c), hVar.d);
            getHeaderLayout().setTag(R$id.internal_nav_bar_title_clause, textLocalisedClause2);
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavBar(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
