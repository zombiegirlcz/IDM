package com.revolut.feature.pockets.impl.details_v2.linked_account_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.f0;
import c65.i;
import cea.b;
import cea.c;
import cea.d;
import cea.j;
import cea.k;
import cea.l;
import cea.m;
import cea.n;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsAccountDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.pockets.impl.details_v2.linked_account_details.LinkedAccountDetailsScreen;
import com.revolut.feature.pockets.impl.details_v2.linked_account_details.LinkedAccountDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import oda.g;
import te0.w;
import tx0.t3;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pockets/impl/details_v2/linked_account_details/LinkedAccountDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcea/j;", "Ldli/a;", "Lcea/o;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LinkedAccountDetailsScreen extends ViewController<j> implements dli.a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(LinkedAccountDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final LinkedAccountDetailsScreenContract$InputData K;
    public final h L;
    public final int M;
    public final RowDelegate N;
    public final PlainTextWarningDelegate O;
    public final SmallActionButtonDelegate P;
    public final CellDetailsAccountDelegate Q;
    public final FullScreenStateDelegate R;
    public final Object S;
    public final Object T;
    public final Object U;

    public LinkedAccountDetailsScreen(LinkedAccountDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_recycler_navbar;
        this.N = new RowDelegate(null, null, 7);
        this.O = new PlainTextWarningDelegate();
        this.P = new SmallActionButtonDelegate();
        this.Q = new CellDetailsAccountDelegate();
        this.R = new FullScreenStateDelegate();
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: cea.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkedAccountDetailsScreen f23441b;

            {
                this.f23441b = this;
            }

            /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LinkedAccountDetailsScreen linkedAccountDetailsScreen = this.f23441b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LinkedAccountDetailsScreen.V;
                        LinkedAccountDetailsScreen linkedAccountDetailsScreen2 = this.f23441b;
                        return dli.f.a(linkedAccountDetailsScreen2, linkedAccountDetailsScreen2.R2(), zhm.v.k(linkedAccountDetailsScreen2.N, linkedAccountDetailsScreen2.O, linkedAccountDetailsScreen2.P, linkedAccountDetailsScreen2.Q, linkedAccountDetailsScreen2.R, new ListSubheaderDelegate(), new CellDetailsLoadingDelegate(), new CellDetailsChevronDelegate(), new ErrorWidgetDelegate()), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    case 1:
                        KProperty[] kPropertyArr2 = LinkedAccountDetailsScreen.V;
                        qji.b bVarU2 = linkedAccountDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pockets.impl.details_v2.linked_account_details.di.LinkedAccountDetailsScreenInjector");
                        oda.l lVar = (oda.l) bVarU2;
                        oda.o oVar = lVar.f224386c;
                        oda.l lVar2 = lVar.d;
                        LinkedAccountDetailsScreenContract$InputData linkedAccountDetailsScreenContract$InputData = linkedAccountDetailsScreen.K;
                        linkedAccountDetailsScreenContract$InputData.getClass();
                        return new oda.g(oVar, lVar2, linkedAccountDetailsScreen, linkedAccountDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = LinkedAccountDetailsScreen.V;
                        return (k) ((oda.g) linkedAccountDetailsScreen.T.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: cea.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkedAccountDetailsScreen f23441b;

            {
                this.f23441b = this;
            }

            /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LinkedAccountDetailsScreen linkedAccountDetailsScreen = this.f23441b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LinkedAccountDetailsScreen.V;
                        LinkedAccountDetailsScreen linkedAccountDetailsScreen2 = this.f23441b;
                        return dli.f.a(linkedAccountDetailsScreen2, linkedAccountDetailsScreen2.R2(), zhm.v.k(linkedAccountDetailsScreen2.N, linkedAccountDetailsScreen2.O, linkedAccountDetailsScreen2.P, linkedAccountDetailsScreen2.Q, linkedAccountDetailsScreen2.R, new ListSubheaderDelegate(), new CellDetailsLoadingDelegate(), new CellDetailsChevronDelegate(), new ErrorWidgetDelegate()), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    case 1:
                        KProperty[] kPropertyArr2 = LinkedAccountDetailsScreen.V;
                        qji.b bVarU2 = linkedAccountDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pockets.impl.details_v2.linked_account_details.di.LinkedAccountDetailsScreenInjector");
                        oda.l lVar = (oda.l) bVarU2;
                        oda.o oVar = lVar.f224386c;
                        oda.l lVar2 = lVar.d;
                        LinkedAccountDetailsScreenContract$InputData linkedAccountDetailsScreenContract$InputData = linkedAccountDetailsScreen.K;
                        linkedAccountDetailsScreenContract$InputData.getClass();
                        return new oda.g(oVar, lVar2, linkedAccountDetailsScreen, linkedAccountDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = LinkedAccountDetailsScreen.V;
                        return (k) ((oda.g) linkedAccountDetailsScreen.T.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: cea.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkedAccountDetailsScreen f23441b;

            {
                this.f23441b = this;
            }

            /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LinkedAccountDetailsScreen linkedAccountDetailsScreen = this.f23441b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LinkedAccountDetailsScreen.V;
                        LinkedAccountDetailsScreen linkedAccountDetailsScreen2 = this.f23441b;
                        return dli.f.a(linkedAccountDetailsScreen2, linkedAccountDetailsScreen2.R2(), zhm.v.k(linkedAccountDetailsScreen2.N, linkedAccountDetailsScreen2.O, linkedAccountDetailsScreen2.P, linkedAccountDetailsScreen2.Q, linkedAccountDetailsScreen2.R, new ListSubheaderDelegate(), new CellDetailsLoadingDelegate(), new CellDetailsChevronDelegate(), new ErrorWidgetDelegate()), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    case 1:
                        KProperty[] kPropertyArr2 = LinkedAccountDetailsScreen.V;
                        qji.b bVarU2 = linkedAccountDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pockets.impl.details_v2.linked_account_details.di.LinkedAccountDetailsScreenInjector");
                        oda.l lVar = (oda.l) bVarU2;
                        oda.o oVar = lVar.f224386c;
                        oda.l lVar2 = lVar.d;
                        LinkedAccountDetailsScreenContract$InputData linkedAccountDetailsScreenContract$InputData = linkedAccountDetailsScreen.K;
                        linkedAccountDetailsScreenContract$InputData.getClass();
                        return new oda.g(oVar, lVar2, linkedAccountDetailsScreen, linkedAccountDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = LinkedAccountDetailsScreen.V;
                        return (k) ((oda.g) linkedAccountDetailsScreen.T.getValue()).e.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [com.revolut.core.ui_kit_core.displayers.image.Image, java.lang.Object] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        cea.o uiState = (cea.o) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        n nVar = uiState.f23453b;
        if (nVar instanceof m) {
            NavBarWithToolbar navBarWithToolbar = d3().f174539b;
            Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
            t3 t3Var = t3.PROFILE;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
            return;
        }
        if (!(nVar instanceof l)) {
            throw new NoWhenBranchMatchedException();
        }
        NavBarWithToolbar navBarWithToolbar2 = d3().f174539b;
        navBarWithToolbar2.l0();
        l lVar = (l) nVar;
        TextLocalisedClause textLocalisedClause = lVar.f23448a;
        NavBarWithToolbar.setToolbar$default(navBarWithToolbar2, textLocalisedClause, lVar.f23449b, null, 4, null);
        navBarWithToolbar2.setTitle(textLocalisedClause, null);
        navBarWithToolbar2.setDescriptionText(lVar.f23449b);
        f0.t(navBarWithToolbar2, lVar.f23450c, false, 6);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new i(this, continuation, 9), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53218h), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.d.f121375b), new aee.g(2, R2(), k.class, "onBannerActionClicked", "onBannerActionClicked(Lcom/revolut/core/ui_kit/delegates/PlainTextWarningDelegate$ActionClickData;)V", 4, 23), 3);
        ViewController.P2(this, rd0.e.b(this.P.f53336c.f121375b), new d(2, 4, k.class, R2(), "onSmallActionButtonClicked", "onSmallActionButtonClicked(Lcom/revolut/core/ui_kit/delegates/SmallActionButtonDelegate$Model;)V"), 3);
        ViewController.P2(this, rd0.e.b(this.Q.d), new cbh.g(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(this.R.f52371h.f121375b), new cea.e(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.L.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k R2() {
        return (k) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
