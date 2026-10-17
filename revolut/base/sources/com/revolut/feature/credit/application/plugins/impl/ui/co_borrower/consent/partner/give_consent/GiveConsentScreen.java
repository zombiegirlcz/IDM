package com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent;

import an9.g;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw3.k;
import b75.d;
import cli.o;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.application.plugins.impl.R$id;
import com.revolut.feature.credit.application.plugins.impl.R$layout;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.GiveConsentScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginScreenController;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dw3.d8;
import dw3.i0;
import dw3.v7;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import njj.l;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import q64.c;
import q64.i;
import q64.m;
import q64.n;
import q64.p;
import q64.r;
import rp0.f1;
import rr0.f;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0002\b\tB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/co_borrower/consent/partner/give_consent/GiveConsentScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginScreenController;", "Lq64/m;", "Ldli/a;", "Lq64/r;", "<init>", "()V", "Companion", "q64/c", "a", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GiveConsentScreen extends PluginScreenController<m> implements dli.a {
    public final Object M;
    public final Object N;
    public f O;
    public final Lazy V;
    public final Object W;
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(GiveConsentScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCreditRecyclerNavbarTwinbuttonsBinding;", 0))};

    @NotNull
    private static final a Companion = new a();
    public final int L = R$layout.screen_credit_recycler_navbar_twinbuttons;
    public final h P = s.t(this, b.f);
    public final TextDelegate Q = new TextDelegate();
    public final ListSubheaderDelegate R = new ListSubheaderDelegate();
    public final ListCellDelegate S = new ListCellDelegate();
    public final CellDetailsDelegate T = new CellDetailsDelegate();
    public final FullScreenStateDelegate U = new FullScreenStateDelegate();

    public static final class a {
        private a() {
        }
    }

    public static final /* synthetic */ class b extends q implements Function1 {
        public static final b f = new b();

        public b() {
            super(1, k.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/credit/application/plugins/impl/databinding/ScreenCreditRecyclerNavbarTwinbuttonsBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return k.a(p0);
        }
    }

    public GiveConsentScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: q64.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GiveConsentScreen f242475b;

            {
                this.f242475b = this;
            }

            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 5;
                int i5 = 1;
                int i6 = 0;
                GiveConsentScreen giveConsentScreen = this.f242475b;
                int i21 = 6;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = GiveConsentScreen.X;
                        qji.b bVarU2 = giveConsentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.di.GiveConsentScreenComponentInjector");
                        i0 i0Var = ((i0) bVarU2).d;
                        d8 d8Var = new d8();
                        d8Var.f118594a = e4m.b.b(e4m.c.a(giveConsentScreen));
                        v7 v7Var = new v7(i0Var, d8Var, i5, i21);
                        d8Var.f118595b = v7Var;
                        d8Var.f118596c = e4m.b.b(v7Var);
                        d8Var.d = e4m.b.b(new v7(i0Var, d8Var, i6, i21));
                        d8Var.e = e4m.b.b(d8Var.f118595b);
                        d8Var.f = e4m.b.b(new v7(i0Var, d8Var, 2, i21));
                        return d8Var;
                    case 1:
                        KProperty[] kPropertyArr2 = GiveConsentScreen.X;
                        return (n) ((d8) giveConsentScreen.M.getValue()).f.get();
                    case 2:
                        KProperty[] kPropertyArr3 = GiveConsentScreen.X;
                        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = giveConsentScreen.d3().f10697a;
                        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
                        ScreenContentRecyclerView creditApplicationRecyclerView = giveConsentScreen.d3().f10699c;
                        Intrinsics.checkNotNullExpressionValue(creditApplicationRecyclerView, "creditApplicationRecyclerView");
                        TwinVerticalButton creditApplicationTwinVerticalButton = giveConsentScreen.d3().d;
                        Intrinsics.checkNotNullExpressionValue(creditApplicationTwinVerticalButton, "creditApplicationTwinVerticalButton");
                        return new c(controllerContainerCoordinatorLayout, creditApplicationRecyclerView, creditApplicationTwinVerticalButton, new q56.o(giveConsentScreen, i3));
                    default:
                        KProperty[] kPropertyArr4 = GiveConsentScreen.X;
                        GiveConsentScreen giveConsentScreen2 = this.f242475b;
                        return dli.f.a(giveConsentScreen2, giveConsentScreen2.d(), v.k(new RowDelegate(null, null, 7), giveConsentScreen2.T, new RowLoadingDelegate(), giveConsentScreen2.Q, giveConsentScreen2.R, giveConsentScreen2.S, giveConsentScreen2.U), R$id.creditApplication_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: q64.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GiveConsentScreen f242475b;

            {
                this.f242475b = this;
            }

            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 5;
                int i5 = 1;
                int i6 = 0;
                GiveConsentScreen giveConsentScreen = this.f242475b;
                int i21 = 6;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GiveConsentScreen.X;
                        qji.b bVarU2 = giveConsentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.di.GiveConsentScreenComponentInjector");
                        i0 i0Var = ((i0) bVarU2).d;
                        d8 d8Var = new d8();
                        d8Var.f118594a = e4m.b.b(e4m.c.a(giveConsentScreen));
                        v7 v7Var = new v7(i0Var, d8Var, i5, i21);
                        d8Var.f118595b = v7Var;
                        d8Var.f118596c = e4m.b.b(v7Var);
                        d8Var.d = e4m.b.b(new v7(i0Var, d8Var, i6, i21));
                        d8Var.e = e4m.b.b(d8Var.f118595b);
                        d8Var.f = e4m.b.b(new v7(i0Var, d8Var, 2, i21));
                        return d8Var;
                    case 1:
                        KProperty[] kPropertyArr2 = GiveConsentScreen.X;
                        return (n) ((d8) giveConsentScreen.M.getValue()).f.get();
                    case 2:
                        KProperty[] kPropertyArr3 = GiveConsentScreen.X;
                        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = giveConsentScreen.d3().f10697a;
                        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
                        ScreenContentRecyclerView creditApplicationRecyclerView = giveConsentScreen.d3().f10699c;
                        Intrinsics.checkNotNullExpressionValue(creditApplicationRecyclerView, "creditApplicationRecyclerView");
                        TwinVerticalButton creditApplicationTwinVerticalButton = giveConsentScreen.d3().d;
                        Intrinsics.checkNotNullExpressionValue(creditApplicationTwinVerticalButton, "creditApplicationTwinVerticalButton");
                        return new c(controllerContainerCoordinatorLayout, creditApplicationRecyclerView, creditApplicationTwinVerticalButton, new q56.o(giveConsentScreen, i3));
                    default:
                        KProperty[] kPropertyArr4 = GiveConsentScreen.X;
                        GiveConsentScreen giveConsentScreen2 = this.f242475b;
                        return dli.f.a(giveConsentScreen2, giveConsentScreen2.d(), v.k(new RowDelegate(null, null, 7), giveConsentScreen2.T, new RowLoadingDelegate(), giveConsentScreen2.Q, giveConsentScreen2.R, giveConsentScreen2.S, giveConsentScreen2.U), R$id.creditApplication_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.V = j.b(new Function0(this) { // from class: q64.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GiveConsentScreen f242475b;

            {
                this.f242475b = this;
            }

            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 5;
                int i5 = 1;
                int i6 = 0;
                GiveConsentScreen giveConsentScreen = this.f242475b;
                int i21 = 6;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GiveConsentScreen.X;
                        qji.b bVarU2 = giveConsentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.di.GiveConsentScreenComponentInjector");
                        i0 i0Var = ((i0) bVarU2).d;
                        d8 d8Var = new d8();
                        d8Var.f118594a = e4m.b.b(e4m.c.a(giveConsentScreen));
                        v7 v7Var = new v7(i0Var, d8Var, i5, i21);
                        d8Var.f118595b = v7Var;
                        d8Var.f118596c = e4m.b.b(v7Var);
                        d8Var.d = e4m.b.b(new v7(i0Var, d8Var, i6, i21));
                        d8Var.e = e4m.b.b(d8Var.f118595b);
                        d8Var.f = e4m.b.b(new v7(i0Var, d8Var, 2, i21));
                        return d8Var;
                    case 1:
                        KProperty[] kPropertyArr2 = GiveConsentScreen.X;
                        return (n) ((d8) giveConsentScreen.M.getValue()).f.get();
                    case 2:
                        KProperty[] kPropertyArr3 = GiveConsentScreen.X;
                        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = giveConsentScreen.d3().f10697a;
                        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
                        ScreenContentRecyclerView creditApplicationRecyclerView = giveConsentScreen.d3().f10699c;
                        Intrinsics.checkNotNullExpressionValue(creditApplicationRecyclerView, "creditApplicationRecyclerView");
                        TwinVerticalButton creditApplicationTwinVerticalButton = giveConsentScreen.d3().d;
                        Intrinsics.checkNotNullExpressionValue(creditApplicationTwinVerticalButton, "creditApplicationTwinVerticalButton");
                        return new c(controllerContainerCoordinatorLayout, creditApplicationRecyclerView, creditApplicationTwinVerticalButton, new q56.o(giveConsentScreen, i32));
                    default:
                        KProperty[] kPropertyArr4 = GiveConsentScreen.X;
                        GiveConsentScreen giveConsentScreen2 = this.f242475b;
                        return dli.f.a(giveConsentScreen2, giveConsentScreen2.d(), v.k(new RowDelegate(null, null, 7), giveConsentScreen2.T, new RowLoadingDelegate(), giveConsentScreen2.Q, giveConsentScreen2.R, giveConsentScreen2.S, giveConsentScreen2.U), R$id.creditApplication_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.W = w.y0(new Function0(this) { // from class: q64.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GiveConsentScreen f242475b;

            {
                this.f242475b = this;
            }

            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                int i32 = 5;
                int i59 = 1;
                int i6 = 0;
                GiveConsentScreen giveConsentScreen = this.f242475b;
                int i21 = 6;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GiveConsentScreen.X;
                        qji.b bVarU2 = giveConsentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.di.GiveConsentScreenComponentInjector");
                        i0 i0Var = ((i0) bVarU2).d;
                        d8 d8Var = new d8();
                        d8Var.f118594a = e4m.b.b(e4m.c.a(giveConsentScreen));
                        v7 v7Var = new v7(i0Var, d8Var, i59, i21);
                        d8Var.f118595b = v7Var;
                        d8Var.f118596c = e4m.b.b(v7Var);
                        d8Var.d = e4m.b.b(new v7(i0Var, d8Var, i6, i21));
                        d8Var.e = e4m.b.b(d8Var.f118595b);
                        d8Var.f = e4m.b.b(new v7(i0Var, d8Var, 2, i21));
                        return d8Var;
                    case 1:
                        KProperty[] kPropertyArr2 = GiveConsentScreen.X;
                        return (n) ((d8) giveConsentScreen.M.getValue()).f.get();
                    case 2:
                        KProperty[] kPropertyArr3 = GiveConsentScreen.X;
                        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = giveConsentScreen.d3().f10697a;
                        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
                        ScreenContentRecyclerView creditApplicationRecyclerView = giveConsentScreen.d3().f10699c;
                        Intrinsics.checkNotNullExpressionValue(creditApplicationRecyclerView, "creditApplicationRecyclerView");
                        TwinVerticalButton creditApplicationTwinVerticalButton = giveConsentScreen.d3().d;
                        Intrinsics.checkNotNullExpressionValue(creditApplicationTwinVerticalButton, "creditApplicationTwinVerticalButton");
                        return new c(controllerContainerCoordinatorLayout, creditApplicationRecyclerView, creditApplicationTwinVerticalButton, new q56.o(giveConsentScreen, i32));
                    default:
                        KProperty[] kPropertyArr4 = GiveConsentScreen.X;
                        GiveConsentScreen giveConsentScreen2 = this.f242475b;
                        return dli.f.a(giveConsentScreen2, giveConsentScreen2.d(), v.k(new RowDelegate(null, null, 7), giveConsentScreen2.T, new RowLoadingDelegate(), giveConsentScreen2.Q, giveConsentScreen2.R, giveConsentScreen2.S, giveConsentScreen2.U), R$id.creditApplication_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        if (!(uiState instanceof q64.o)) {
            if (!(uiState instanceof p) && !(uiState instanceof q64.q)) {
                throw new NoWhenBranchMatchedException();
            }
            TwinVerticalButton creditApplicationTwinVerticalButton = d3().d;
            Intrinsics.checkNotNullExpressionValue(creditApplicationTwinVerticalButton, "creditApplicationTwinVerticalButton");
            w01.k.a(creditApplicationTwinVerticalButton);
            return;
        }
        NavBarWithToolbar navBarWithToolbar = d3().f10698b;
        q64.o oVar2 = (q64.o) uiState;
        TextLocalisedClause textLocalisedClause = oVar2.f242486a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(oVar2.f242487b);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        TwinVerticalButton twinVerticalButton = d3().d;
        twinVerticalButton.setMainButtonText(oVar2.f242488c);
        twinVerticalButton.setSecondaryButtonText(oVar2.d);
        f fVar = this.O;
        if (fVar == null) {
            Intrinsics.r("mainButtonLoadingController");
            throw null;
        }
        fVar.b(oVar2.e);
        NavBarWithToolbar navBarWithToolbar2 = d3().f10698b;
        Lazy lazy = this.V;
        navBarWithToolbar2.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) lazy.getValue());
        d3().f10699c.addOnScrollListener((c) lazy.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d8) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.b bVar = (com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.give_consent.b) d();
        bVar.getClass();
        if (i == 10 && i2 == -1) {
            bVar.I2();
            bVar.X1(new mii.k("details-updated-dialog-id", new TextLocalisedClause(R$string.co_borrower_consent_details_success, null, null, 14), null, null, f1.ABOVE_ANCHOR_VIEW, 12));
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f10698b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        TwinVerticalButton twinVerticalButton = d3().d;
        w01.k.a(twinVerticalButton);
        twinVerticalButton.setCollapsed(true, false);
        twinVerticalButton.setSecondaryButtonVisible(false);
        twinVerticalButton.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
        twinVerticalButton.setFabImage(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, new TextLocalisedClause(R$string.credit_application_quick_scroll_action, null, null, 14), LDSFile.EF_DG4_TAG));
        this.O = twinVerticalButton.l0();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        NavBarWithToolbar navBarWithToolbar = d3().f10698b;
        Lazy lazy = this.V;
        navBarWithToolbar.removeOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) lazy.getValue());
        d3().f10699c.removeOnScrollListener((c) lazy.getValue());
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewGroup.LayoutParams layoutParams = d3().d.getLayoutParams();
        Continuation continuation = null;
        CoordinatorLayout.LayoutParams layoutParams2 = layoutParams instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.setBehavior(null);
        }
        k kVarD3 = d3();
        NavBarWithToolbar navBarWithToolbar = kVarD3.f10698b;
        TwinVerticalButton twinVerticalButton = kVarD3.d;
        int i = 0;
        int i2 = 3;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new q64.h(this, continuation, i), 3);
        int i3 = 1;
        ViewController.P2(this, rd0.e.b(kVarD3.f10698b.x0()), new q64.h(this, continuation, i3), 3);
        ViewController.P2(this, rd0.e.b(twinVerticalButton.m0()), new i(kVarD3, this, null), 3);
        int i5 = 2;
        ViewController.P2(this, rd0.e.b(twinVerticalButton.o0()), new q64.h(this, continuation, i5), 3);
        ViewController.P2(this, rd0.e.b(twinVerticalButton.p0()), new q64.h(this, continuation, i2), 3);
        ViewController.P2(this, rd0.e.b(this.U.f52371h.f121375b), new q64.k(this, null), 3);
        ListSubheaderDelegate listSubheaderDelegate = this.R;
        ViewController.P2(this, new g(vkm.q.J(rd0.e.b(listSubheaderDelegate.e), rd0.e.b(listSubheaderDelegate.d)), 23), new q64.j(this, continuation, i3), 3);
        ViewController.P2(this, vkm.q.J(rd0.e.b(this.Q.d), rd0.e.b(this.S.d)), new q64.j(this, continuation, i5), 3);
        CellDetailsDelegate cellDetailsDelegate = this.T;
        ViewController.P2(this, new d(rd0.e.b(cellDetailsDelegate.d), yx4.b.Companion, 14), new q64.j(this, continuation, i2), 3);
        ViewController.P2(this, new l(new pvk.i(rd0.e.b(cellDetailsDelegate.e), 24), 15), new q64.j(this, continuation, i), 3);
    }

    public final k d3() {
        ViewBinding value = this.P.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n d() {
        return (n) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.W.getValue();
    }
}
