package com.revolut.core.ui_kit.views.navbar;

import android.animation.Animator;
import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.WindowInsetsCompat;
import au0.g0;
import au0.i0;
import au0.j4;
import au0.z4;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.SimpleLimitProgressBarWithText;
import com.revolut.core.ui_kit.internal.views.TimerView;
import com.revolut.core.ui_kit.internal.views.button.ButtonAddNew;
import com.revolut.core.ui_kit.internal.views.navbar.CollapsingAppBarSnapBehavior;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.AvatarView;
import com.revolut.core.ui_kit.views.FitsSystemWindowsConstraintLayout;
import com.revolut.core.ui_kit.views.buttons.SearchButton;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import ix0.c0;
import ix0.h2;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mx0.c9;
import org.jetbrains.annotations.NotNull;
import tx0.e4;
import tx0.k1;
import tx0.m1;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u007f2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\u0080\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0018J\u0017\u0010!\u001a\u00020\u00122\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010)\u001a\u00020\u00122\b\u0010(\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b)\u0010*J\u0019\u0010-\u001a\u00020\u00122\b\u0010,\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0004\b-\u0010.J\u0019\u00101\u001a\u00020\u00122\b\u00100\u001a\u0004\u0018\u00010/H\u0002¢\u0006\u0004\b1\u00102J\u0019\u00104\u001a\u00020\u00122\b\u00103\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b4\u0010*R\u001b\u0010:\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001b\u0010=\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00107\u001a\u0004\b<\u00109R\u001b\u0010@\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u00107\u001a\u0004\b?\u00109R\u001b\u0010C\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u00107\u001a\u0004\bB\u00109R\u001b\u0010H\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u00107\u001a\u0004\bF\u0010GR\u001b\u0010M\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u00107\u001a\u0004\bK\u0010LR\u001b\u0010R\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u00107\u001a\u0004\bP\u0010QR\u001b\u0010W\u001a\u00020S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u00107\u001a\u0004\bU\u0010VR\u001b\u0010\\\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u00107\u001a\u0004\bZ\u0010[R\u001b\u0010a\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u00107\u001a\u0004\b_\u0010`R\u001b\u0010f\u001a\u00020b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u00107\u001a\u0004\bd\u0010eR\u001b\u0010k\u001a\u00020g8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u00107\u001a\u0004\bi\u0010jR\u001b\u0010p\u001a\u00020l8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u00107\u001a\u0004\bn\u0010oR\u001b\u0010v\u001a\u00020q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR$\u0010~\u001a\u0004\u0018\u00010w8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}¨\u0006\u0081\u0001"}, d2 = {"Lcom/revolut/core/ui_kit/views/navbar/NavBarBottomSheet;", "Lau0/o;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lau0/a;", "Ltx0/e4;", "Lny0/h;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Lcom/google/android/material/appbar/AppBarLayout;", "getBehavior", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "", "active", "", "setSearchButtonActive", "(Z)V", "Lcom/revolut/core/ui_kit/models/Clause;", "input", "setSearchInput", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "", "index", "setSearchInputSelection", "(I)V", "hint", "setHint", "Llw0/m;", "headerModel", "setHeaderModel", "(Llw0/m;)V", "", "valueDp", "setRootBottomPadding", "(F)V", "Llw0/g;", "headerAsset", "setupLayoutRelativeToAsset", "(Llw0/g;)V", "Llw0/i;", "loadingType", "setLoading", "(Llw0/i;)V", "Llw0/l;", "item", "setMenuItem", "(Llw0/l;)V", "asset", "setHeaderAsset", "Landroid/widget/TextView;", "l", "Le8/q;", "getTitleView", "()Landroid/widget/TextView;", "titleView", "m", "getDescriptionView", "descriptionView", "n", "getMenuTextView", "menuTextView", "o", "getMenuButtonTextView", "menuButtonTextView", "Lcom/revolut/core/ui_kit/internal/views/button/ButtonAddNew;", "p", "getMenuButtonAddNew", "()Lcom/revolut/core/ui_kit/internal/views/button/ButtonAddNew;", "menuButtonAddNew", "Landroid/widget/ImageView;", "q", "getImageView", "()Landroid/widget/ImageView;", "imageView", "Lcom/revolut/core/ui_kit/views/AvatarView;", "r", "getAvatarView", "()Lcom/revolut/core/ui_kit/views/AvatarView;", "avatarView", "Lcom/revolut/core/ui_kit/internal/views/SimpleLimitProgressBarWithText;", "s", "getProgressWithText", "()Lcom/revolut/core/ui_kit/internal/views/SimpleLimitProgressBarWithText;", "progressWithText", "Lcom/revolut/core/ui_kit/internal/views/navbar/SearchView;", "t", "getSearchView", "()Lcom/revolut/core/ui_kit/internal/views/navbar/SearchView;", "searchView", "Lcom/revolut/core/ui_kit/views/buttons/SearchButton;", "u", "getSearchButton", "()Lcom/revolut/core/ui_kit/views/buttons/SearchButton;", "searchButton", "Landroid/widget/FrameLayout;", "v", "getAssetContainer", "()Landroid/widget/FrameLayout;", "assetContainer", "Lcom/revolut/core/ui_kit/views/FitsSystemWindowsConstraintLayout;", "w", "getRoot", "()Lcom/revolut/core/ui_kit/views/FitsSystemWindowsConstraintLayout;", "root", "Landroid/view/ViewStub;", "x", "getTimerViewStub", "()Landroid/view/ViewStub;", "timerViewStub", "Lix0/h2;", "A", "Lkotlin/Lazy;", "getMenuItemViews", "()Lix0/h2;", "menuItemViews", "Landroid/os/Parcelable;", "D", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NavBarBottomSheet extends au0.o implements TrackableItem, au0.a, e4 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final Object A;
    public final z4 B;
    public WindowInsetsCompat C;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public Parcelable analyticsContext;
    public final ihm.f E;
    public final ihm.f F;
    public final k1 G;
    public lw0.l H;
    public final ifm.b I;
    public boolean J;
    public boolean K;
    public final ihm.f L;
    public ifm.c M;
    public MotionEvent N;
    public RectF O;
    public Animator P;
    public lw0.m Q;
    public float R;
    public final ihm.f S;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final e8.q titleView;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final e8.q descriptionView;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final e8.q menuTextView;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final e8.q menuButtonTextView;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final e8.q menuButtonAddNew;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final e8.q imageView;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final e8.q avatarView;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final e8.q progressWithText;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final e8.q searchView;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final e8.q searchButton;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final e8.q assetContainer;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final e8.q root;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final e8.q timerViewStub;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TimerView f59284y;
    public i0 z;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBarBottomSheet(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.titleView = kli.a.J(R$id.dialogHeader_titleView, this);
        this.descriptionView = kli.a.J(R$id.dialogHeader_descriptionView, this);
        this.menuTextView = kli.a.J(R$id.dialogHeader_menuTextView, this);
        this.menuButtonTextView = kli.a.J(R$id.dialogHeader_menuButtonTextView, this);
        this.menuButtonAddNew = kli.a.J(R$id.dialogHeader_menuButtonAddNew, this);
        this.imageView = kli.a.J(R$id.dialogHeader_image, this);
        this.avatarView = kli.a.J(R$id.dialogHeader_avatar, this);
        this.progressWithText = kli.a.J(R$id.dialogHeader_progress, this);
        this.searchView = kli.a.J(R$id.dialogHeader_SearchView, this);
        this.searchButton = kli.a.J(R$id.dialogHeader_SearchButton, this);
        this.assetContainer = kli.a.J(R$id.dialogHeader_assetContainer, this);
        this.root = kli.a.J(R$id.dialogHeader_root, this);
        this.timerViewStub = kli.a.J(R$id.dialogHeader_timerStub, this);
        this.A = te0.w.y0(new th9.t(this, 25));
        this.B = new z4(this);
        this.E = v0.a.d("create(...)");
        this.F = v0.a.d("create(...)");
        this.G = new k1(this, 3);
        this.I = new ifm.b();
        this.L = v0.a.d("create(...)");
        this.O = new RectF();
        this.R = 16.0f;
        this.S = v0.a.d("create(...)");
        LayoutInflater.from(context).inflate(R$layout.internal_view_nav_bar_bottom_sheet, (ViewGroup) this, true);
        c9 c9Var = new c9(this, 21);
        or0.u.u(getMenuTextView(), this, c9Var);
        or0.u.u(getMenuButtonTextView(), this, c9Var);
        getMenuButtonAddNew().setOnClickListener(c9Var);
        getDescriptionView().setMovementMethod(c0.f169220a);
        setStateListAnimator(null);
        setBackground(null);
        F(null);
    }

    public static Unit A(NavBarBottomSheet navBarBottomSheet) {
        View viewFindFocus;
        navBarBottomSheet.C(true, j4.FADE);
        navBarBottomSheet.getSearchView().o();
        if (navBarBottomSheet.J && (viewFindFocus = navBarBottomSheet.getSearchView().findFocus()) != null) {
            kli.c.d(viewFindFocus, 0L);
        }
        return Unit.f186387a;
    }

    public static h2 B(NavBarBottomSheet navBarBottomSheet) {
        return new h2(navBarBottomSheet.getMenuTextView(), navBarBottomSheet.getMenuButtonTextView(), navBarBottomSheet.getMenuButtonAddNew());
    }

    private final FrameLayout getAssetContainer() {
        return (FrameLayout) this.assetContainer.f();
    }

    private final AvatarView getAvatarView() {
        return (AvatarView) this.avatarView.f();
    }

    private final TextView getDescriptionView() {
        return (TextView) this.descriptionView.f();
    }

    private final ImageView getImageView() {
        return (ImageView) this.imageView.f();
    }

    private final ButtonAddNew getMenuButtonAddNew() {
        return (ButtonAddNew) this.menuButtonAddNew.f();
    }

    private final TextView getMenuButtonTextView() {
        return (TextView) this.menuButtonTextView.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final h2 getMenuItemViews() {
        return (h2) this.A.getValue();
    }

    private final TextView getMenuTextView() {
        return (TextView) this.menuTextView.f();
    }

    private final SimpleLimitProgressBarWithText getProgressWithText() {
        return (SimpleLimitProgressBarWithText) this.progressWithText.f();
    }

    private final FitsSystemWindowsConstraintLayout getRoot() {
        return (FitsSystemWindowsConstraintLayout) this.root.f();
    }

    private final SearchButton getSearchButton() {
        return (SearchButton) this.searchButton.f();
    }

    private final SearchView getSearchView() {
        return (SearchView) this.searchView.f();
    }

    private final ViewStub getTimerViewStub() {
        return (ViewStub) this.timerViewStub.f();
    }

    private final TextView getTitleView() {
        return (TextView) this.titleView.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f3 A[PHI: r15
      0x00f3: PHI (r15v12 com.revolut.core.ui_kit.internal.views.TimerView) = (r15v4 com.revolut.core.ui_kit.internal.views.TimerView), (r15v7 com.revolut.core.ui_kit.internal.views.TimerView) binds: [B:30:0x00d0, B:35:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setHeaderAsset(lw0.g r15) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet.setHeaderAsset(lw0.g):void");
    }

    private final void setLoading(lw0.i loadingType) {
        if (loadingType == null && this.z == null) {
            return;
        }
        i0 i0Var = this.z;
        if (i0Var == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            i0Var = new i0(context, null);
            i0Var.setLayoutParams(new AppBarLayout.LayoutParams(-1, -2));
            getRoot().addView(i0Var);
            this.z = i0Var;
        }
        int i = loadingType == null ? -1 : m1.f275197a[loadingType.ordinal()];
        if (i == -1) {
            i0Var.setVisibility(8);
            return;
        }
        if (i == 1) {
            i0Var.n0(g0.TITLE_SUBTITLE);
            i0Var.setVisibility(0);
            return;
        }
        if (i == 2) {
            i0Var.n0(g0.ICON);
            i0Var.setVisibility(0);
            return;
        }
        if (i == 3) {
            i0Var.n0(g0.AVATAR);
            i0Var.setVisibility(0);
        } else if (i == 4) {
            i0Var.n0(g0.IMAGE_80);
            i0Var.setVisibility(0);
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i0Var.n0(g0.PROGRESS);
            i0Var.setVisibility(0);
        }
    }

    private final void setMenuItem(lw0.l item) {
        this.H = item;
        if (item instanceof lw0.k) {
            ty0.c.b(or0.u.k(this).b0(), ((lw0.k) item).f200401b, getMenuTextView(), null, null, 12);
            getMenuTextView().setVisibility(0);
            getMenuButtonTextView().setVisibility(8);
            getMenuButtonAddNew().setVisibility(8);
            return;
        }
        if (!(item instanceof lw0.j)) {
            getMenuTextView().setVisibility(8);
            getMenuButtonTextView().setVisibility(8);
            getMenuButtonAddNew().setVisibility(8);
        } else {
            getMenuButtonAddNew().setModel(((lw0.j) item).f200399b);
            getMenuTextView().setVisibility(8);
            getMenuButtonTextView().setVisibility(8);
            getMenuButtonAddNew().setVisibility(0);
        }
    }

    private final void setRootBottomPadding(float valueDp) {
        if (this.R == valueDp) {
            return;
        }
        this.R = valueDp;
        if (this.Q != null) {
            FitsSystemWindowsConstraintLayout root = getRoot();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            root.setPadding(root.getPaddingLeft(), root.getPaddingTop(), root.getPaddingRight(), kli.a.k(context, valueDp));
        }
    }

    private final void setupLayoutRelativeToAsset(lw0.g headerAsset) {
        if (headerAsset == null) {
            FrameLayout assetContainer = getAssetContainer();
            ViewGroup.LayoutParams layoutParams = assetContainer.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
            assetContainer.setLayoutParams(layoutParams2);
            for (View view : getMenuItemViews().f169242a) {
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = 0;
                layoutParams4.topToTop = getTitleView().getId();
                layoutParams4.bottomToBottom = getTitleView().getId();
                view.setLayoutParams(layoutParams4);
            }
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 12.0f);
        FrameLayout assetContainer2 = getAssetContainer();
        ViewGroup.LayoutParams layoutParams5 = assetContainer2.getLayoutParams();
        if (layoutParams5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
        ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = iK;
        assetContainer2.setLayoutParams(layoutParams6);
        for (View view2 : getMenuItemViews().f169242a) {
            ViewGroup.LayoutParams layoutParams7 = view2.getLayoutParams();
            if (layoutParams7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
            ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin = iK;
            layoutParams8.topToTop = 0;
            layoutParams8.bottomToBottom = -1;
            view2.setLayoutParams(layoutParams8);
        }
    }

    public static Unit x(NavBarBottomSheet navBarBottomSheet, float f) {
        navBarBottomSheet.getSearchView().setAlpha(f);
        float f4 = 1 - f;
        navBarBottomSheet.N(f4);
        navBarBottomSheet.L(f4);
        return Unit.f186387a;
    }

    public static Unit y(NavBarBottomSheet navBarBottomSheet) {
        navBarBottomSheet.getSearchView().j();
        navBarBottomSheet.C(false, j4.FADE);
        navBarBottomSheet.setExpanded(true);
        return Unit.f186387a;
    }

    public final void C(final boolean z, j4 j4Var) {
        Animator animatorL;
        if (this.K == z) {
            return;
        }
        this.K = z;
        Animator animator = this.P;
        if (animator != null) {
            animator.cancel();
        }
        if (this.J) {
            K();
            if (!z) {
                getSearchView().j();
                e0m.e.a(getSearchView().getFocusedChild());
            }
        }
        if (j4Var == j4.NO_ANIMATION) {
            if (z) {
                getSearchView().setVisibility(0);
                O(4);
            } else {
                getSearchView().setVisibility(4);
                O(0);
            }
            M(z);
            return;
        }
        MotionEvent motionEvent = this.N;
        if (!z) {
            this.N = null;
        }
        if (j4Var == j4.FADE || motionEvent == null) {
            final int i = 0;
            animatorL = getSearchView().l(z, new Function0(this) { // from class: tx0.l1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ NavBarBottomSheet f275184b;

                {
                    this.f275184b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i2 = i;
                    boolean z3 = z;
                    NavBarBottomSheet navBarBottomSheet = this.f275184b;
                    switch (i2) {
                        case 0:
                            NavBarBottomSheet.Companion companion = NavBarBottomSheet.INSTANCE;
                            navBarBottomSheet.O(0);
                            navBarBottomSheet.M(z3);
                            break;
                        default:
                            NavBarBottomSheet.Companion companion2 = NavBarBottomSheet.INSTANCE;
                            navBarBottomSheet.O(0);
                            navBarBottomSheet.M(z3);
                            break;
                    }
                    return Unit.f186387a;
                }
            }, new k1(this, 6), new k1(this, 7));
        } else {
            if (z) {
                this.O = getSearchView().g(motionEvent);
            }
            final int i2 = 1;
            animatorL = getSearchView().k(z, this.O, new Function0(this) { // from class: tx0.l1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ NavBarBottomSheet f275184b;

                {
                    this.f275184b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i2;
                    boolean z3 = z;
                    NavBarBottomSheet navBarBottomSheet = this.f275184b;
                    switch (i22) {
                        case 0:
                            NavBarBottomSheet.Companion companion = NavBarBottomSheet.INSTANCE;
                            navBarBottomSheet.O(0);
                            navBarBottomSheet.M(z3);
                            break;
                        default:
                            NavBarBottomSheet.Companion companion2 = NavBarBottomSheet.INSTANCE;
                            navBarBottomSheet.O(0);
                            navBarBottomSheet.M(z3);
                            break;
                    }
                    return Unit.f186387a;
                }
            }, new k1(this, i2), new k1(this, 2));
        }
        animatorL.setDuration(400L);
        animatorL.start();
        this.P = animatorL;
    }

    public final void D(float f) {
        if (this.J && isLaidOut()) {
            getSearchButton().setExpandRatio(f);
            getSearchButton().setClickable(!(f == BitmapDescriptorFactory.HUE_RED));
        }
    }

    public final void F(lw0.m mVar) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float f = BitmapDescriptorFactory.HUE_RED;
        int iK = kli.a.k(context, mVar == null ? 0.0f : 28.0f);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (mVar != null) {
            f = this.R;
        }
        int iK2 = kli.a.k(context2, f);
        FitsSystemWindowsConstraintLayout root = getRoot();
        root.setPadding(root.getPaddingLeft(), iK, root.getPaddingRight(), iK2);
        if (mVar instanceof lw0.a) {
            setLoading(null);
            TextView titleView = getTitleView();
            lw0.a aVar = (lw0.a) mVar;
            lw0.g gVar = aVar.f200388c;
            Clause clause = aVar.f200386a;
            kli.a.b(titleView, clause, ty0.f.f275450a);
            getTitleView().setTag(R$id.internal_nav_bar_title_clause, clause);
            kli.a.d(getDescriptionView(), aVar.f200387b, this, this.G, 8);
            setMenuItem(aVar.d);
            setHeaderAsset(gVar);
            setupLayoutRelativeToAsset(gVar);
            getTitleView().setMaxLines(aVar.e ? 1 : 4);
            return;
        }
        if (mVar instanceof lw0.h) {
            setLoading(((lw0.h) mVar).f200397a);
            kli.a.b(getTitleView(), null, ty0.f.f275450a);
            kli.a.d(getDescriptionView(), null, this, null, 12);
            setMenuItem(null);
            setHeaderAsset(null);
            return;
        }
        if (mVar != null) {
            throw new NoWhenBranchMatchedException();
        }
        kli.a.b(getTitleView(), null, ty0.f.f275450a);
        kli.a.d(getDescriptionView(), null, this, null, 12);
        setMenuItem(null);
        setHeaderAsset(null);
        setLoading(null);
    }

    public final void H() {
        setRootBottomPadding(8.0f);
    }

    public final efm.r I() {
        return getSearchView().f57337m;
    }

    public final void K() {
        if (this.J) {
            if (this.K) {
                setAlwaysExpandedFlagEnabled$ui_kit_components_release(false);
                setScrollEnabled$ui_kit_components_release(false);
                setExpanded(false);
            } else {
                setAlwaysExpandedFlagEnabled$ui_kit_components_release(true);
            }
            this.S.onNext(Boolean.valueOf(this.K));
        }
    }

    public final void L(float f) {
        getDescriptionView().setAlpha(f);
    }

    public final void M(boolean z) {
        Clause clause;
        lw0.m mVar = this.Q;
        if (mVar instanceof lw0.a) {
            clause = ((lw0.a) mVar).f200387b;
        } else {
            if (!(mVar instanceof lw0.h) && mVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            clause = null;
        }
        if (clause != null) {
            getDescriptionView().setVisibility(z ? 8 : 0);
        }
    }

    public final void N(float f) {
        getTitleView().setAlpha(f);
        if (getMenuButtonTextView().getVisibility() != 8) {
            getMenuButtonTextView().setAlpha(f);
        }
        if (getMenuTextView().getVisibility() != 8) {
            getMenuTextView().setAlpha(f);
        }
        if (getMenuButtonAddNew().getVisibility() != 8) {
            getMenuButtonAddNew().setAlpha(f);
        }
    }

    public final void O(int i) {
        getTitleView().setVisibility(i);
        if (getMenuButtonTextView().getVisibility() != 8) {
            getMenuButtonTextView().setVisibility(i);
        }
        if (getMenuTextView().getVisibility() != 8) {
            getMenuTextView().setVisibility(i);
        }
        if (getMenuButtonAddNew().getVisibility() != 8) {
            getMenuButtonAddNew().setVisibility(i);
        }
    }

    @Override // tx0.e4
    public final void d(int i) {
        int paddingTop;
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
        View viewB = this.B.b();
        if (viewB != null) {
            au0.o.w(viewB, f);
        }
        WindowInsetsCompat windowInsetsCompat = this.C;
        if (windowInsetsCompat != null) {
            paddingTop = windowInsetsCompat.getSystemWindowInsetTop();
        } else {
            ViewParent parent = getParent();
            CoordinatorLayout coordinatorLayout = parent instanceof CoordinatorLayout ? (CoordinatorLayout) parent : null;
            paddingTop = coordinatorLayout != null ? coordinatorLayout.getPaddingTop() : 0;
        }
        if (viewB != null) {
            viewB.setY(getHeight() + paddingTop);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.K && ((motionEvent != null && motionEvent.getAction() == 1) || (motionEvent != null && motionEvent.getAction() == 3))) {
            this.N = motionEvent;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public Parcelable getK() {
        return this.analyticsContext;
    }

    @Override // au0.o, com.google.android.material.appbar.AppBarLayout, androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    @NotNull
    /* JADX INFO: renamed from: getBehavior */
    public CoordinatorLayout.Behavior<AppBarLayout> getShadowBehaviour() {
        return new CollapsingAppBarSnapBehavior();
    }

    @Override // au0.o
    public final void k(float f, int i) {
        int paddingTop;
        float f4 = i;
        float f5 = -f4;
        getSearchView().setTranslationY(f5);
        getImageView().setTranslationY(f5);
        getAvatarView().setTranslationY(f5);
        getTitleView().setTranslationY(f5);
        getDescriptionView().setTranslationY(f5);
        getMenuTextView().setTranslationY(f5);
        getMenuButtonTextView().setTranslationY(f5);
        getMenuButtonAddNew().setTranslationY(f5);
        D(f);
        if (getTotalScrollRange() != 0) {
            float fN = au0.o.n(f, 0.5f, true);
            View viewB = this.B.b();
            if (viewB != null) {
                au0.o.w(viewB, fN);
            }
            WindowInsetsCompat windowInsetsCompat = this.C;
            if (windowInsetsCompat != null) {
                paddingTop = windowInsetsCompat.getSystemWindowInsetTop();
            } else {
                ViewParent parent = getParent();
                CoordinatorLayout coordinatorLayout = parent instanceof CoordinatorLayout ? (CoordinatorLayout) parent : null;
                paddingTop = coordinatorLayout != null ? coordinatorLayout.getPaddingTop() : 0;
            }
            if (viewB != null) {
                viewB.setY(getHeight() + paddingTop + f4);
            }
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayoutProxy
    public final WindowInsetsCompat onApplyWindowInsets(WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        if (getFitsSystemWindows() && !ObjectsCompat.equals(this.C, insets)) {
            this.C = insets;
            View viewB = this.B.b();
            if (viewB != null) {
                viewB.setY(getHeight() + insets.getSystemWindowInsetTop());
                viewB.requestLayout();
            }
        }
        return super.onApplyWindowInsets(insets);
    }

    @Override // au0.o, com.google.android.material.appbar.AppBarLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ifm.c cVar = this.M;
        if (cVar != null) {
            cVar.dispose();
        }
        this.M = null;
    }

    @Override // au0.o, com.google.android.material.appbar.AppBarLayoutProxy, com.google.android.material.appbar.AppBarLayout, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        int iK;
        View view;
        super.onLayout(z, i, i2, i3, i5);
        int i6 = 0;
        if (this.J) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iK = kli.a.k(context, 16.0f);
        } else {
            iK = 0;
        }
        int measuredHeight = (getRoot().getMeasuredHeight() - getSearchButton().getMeasuredHeight()) - iK;
        if (measuredHeight != getRoot().getMinimumHeight()) {
            getRoot().setMinimumHeight(measuredHeight);
        }
        if (getTitleView().getVisibility() == 0) {
            View[] viewArr = getMenuItemViews().f169242a;
            int length = viewArr.length;
            while (true) {
                if (i6 >= length) {
                    view = null;
                    break;
                }
                view = viewArr[i6];
                if (view.getVisibility() == 0) {
                    break;
                } else {
                    i6++;
                }
            }
            if (view == null) {
                return;
            }
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int iK2 = kli.a.k(context2, 8.0f);
            int width = (getRoot().getWidth() / 2) - ((getTitleView().getRight() + getTitleView().getLeft()) / 2);
            if (width <= 0) {
                return;
            }
            int left = (view.getLeft() - iK2) - getTitleView().getRight();
            if (width > left) {
                width = left;
            }
            if (width > 0) {
                getTitleView().offsetLeftAndRight(width);
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = parcelable instanceof Bundle ? (Bundle) parcelable : null;
        if (bundle == null) {
            return;
        }
        if (bundle.getBoolean("STATE_KEY_SEARCH_VISIBLE")) {
            C(true, j4.NO_ANIMATION);
        } else {
            C(false, j4.NO_ANIMATION);
        }
        super.onRestoreInstanceState(bundle.getParcelable("STATE_KEY_SUPER"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("STATE_KEY_SUPER", super.onSaveInstanceState());
        bundle.putBoolean("STATE_KEY_SEARCH_VISIBLE", this.K);
        return bundle;
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        this.analyticsContext = parcelable;
    }

    public final void setHeaderModel(lw0.m headerModel) {
        if (Intrinsics.f(headerModel, this.Q)) {
            return;
        }
        this.Q = headerModel;
        F(headerModel);
    }

    public void setHint(@NotNull Clause hint) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        List<? extends Clause> listC = zhm.u.c(hint);
        getSearchView().setHints(listC);
        if (this.J) {
            getSearchButton().setText((Clause) d0.d0(listC));
        }
    }

    @Override // au0.a
    public void setSearchButtonActive(boolean active) {
        if (active == this.J) {
            return;
        }
        this.J = active;
        getSearchButton().setVisibility(active ? 0 : 8);
        getSearchButton().setText((Clause) d0.d0(getSearchView().getHints()));
        ifm.b bVar = this.I;
        if (active) {
            te0.w.j0(bVar, getSearchButton().f59002m.subscribe(new twl.h(28, new k1(this, 4))));
            te0.w.j0(bVar, getSearchView().f57336l.subscribe(new twl.h(29, new k1(this, 5))));
            D(getExpandRatio());
            K();
            return;
        }
        getSearchView().j();
        C(false, j4.FADE);
        setAlwaysExpandedFlagEnabled$ui_kit_components_release(true);
        bVar.d();
    }

    public void setSearchInput(@NotNull Clause input) {
        Intrinsics.checkNotNullParameter(input, "input");
        getSearchView().setSearchInput(input);
    }

    public void setSearchInputSelection(int index) {
        getSearchView().setSearchInputSelection(index);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavBarBottomSheet(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
