package com.revolut.feature.apm.services.ideal.impl.ui.accounts;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.services.ideal.impl.ui.accounts.IDealAccountsListController;
import com.revolut.feature.apm.services.ideal.impl.ui.accounts.IDealAccountsListControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import gaa.b;
import gaa.g;
import gaf.l;
import gd2.c;
import gd2.j;
import jd2.f;
import jii.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/services/ideal/impl/ui/accounts/IDealAccountsListController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ljd2/f;", "Ldli/a;", "Lgd2/f;", "feature_apm_services_ideal_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IDealAccountsListController extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(IDealAccountsListController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final IDealAccountsListControllerContract$InputData K;
    public final int L;
    public final boolean M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final h T;

    public IDealAccountsListController(IDealAccountsListControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_action_footer;
        this.M = true;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: gd2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IDealAccountsListController f143034b;

            {
                this.f143034b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                IDealAccountsListController iDealAccountsListController = this.f143034b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = IDealAccountsListController.U;
                        qji.b bVarU2 = iDealAccountsListController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.services.ideal.impl.ui.accounts.di.IDealAccountsListScreenInjector");
                        fd2.j jVar = (fd2.j) ((kd2.a) bVarU2);
                        fd2.g gVar = jVar.f133878b;
                        fd2.j jVar2 = jVar.f133879c;
                        IDealAccountsListControllerContract$InputData iDealAccountsListControllerContract$InputData = iDealAccountsListController.K;
                        iDealAccountsListControllerContract$InputData.getClass();
                        return new fd2.h(gVar, jVar2, iDealAccountsListControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = IDealAccountsListController.U;
                        return (j) ((fd2.h) iDealAccountsListController.N.getValue()).f133874c.get();
                    case 2:
                        KProperty[] kPropertyArr3 = IDealAccountsListController.U;
                        return new SelectableDelegate((RowDelegate) iDealAccountsListController.P.getValue());
                    default:
                        KProperty[] kPropertyArr4 = IDealAccountsListController.U;
                        IDealAccountsListController iDealAccountsListController2 = this.f143034b;
                        return dli.f.a(iDealAccountsListController2, iDealAccountsListController2.R2(), v.k(new RowLoadingDelegate(), new ListSubheaderDelegate(), (RowDelegate) iDealAccountsListController2.P.getValue(), (SelectableDelegate) iDealAccountsListController2.Q.getValue(), (LargeActionButtonDelegate) iDealAccountsListController2.R.getValue()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: gd2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IDealAccountsListController f143034b;

            {
                this.f143034b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                IDealAccountsListController iDealAccountsListController = this.f143034b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IDealAccountsListController.U;
                        qji.b bVarU2 = iDealAccountsListController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.services.ideal.impl.ui.accounts.di.IDealAccountsListScreenInjector");
                        fd2.j jVar = (fd2.j) ((kd2.a) bVarU2);
                        fd2.g gVar = jVar.f133878b;
                        fd2.j jVar2 = jVar.f133879c;
                        IDealAccountsListControllerContract$InputData iDealAccountsListControllerContract$InputData = iDealAccountsListController.K;
                        iDealAccountsListControllerContract$InputData.getClass();
                        return new fd2.h(gVar, jVar2, iDealAccountsListControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = IDealAccountsListController.U;
                        return (j) ((fd2.h) iDealAccountsListController.N.getValue()).f133874c.get();
                    case 2:
                        KProperty[] kPropertyArr3 = IDealAccountsListController.U;
                        return new SelectableDelegate((RowDelegate) iDealAccountsListController.P.getValue());
                    default:
                        KProperty[] kPropertyArr4 = IDealAccountsListController.U;
                        IDealAccountsListController iDealAccountsListController2 = this.f143034b;
                        return dli.f.a(iDealAccountsListController2, iDealAccountsListController2.R2(), v.k(new RowLoadingDelegate(), new ListSubheaderDelegate(), (RowDelegate) iDealAccountsListController2.P.getValue(), (SelectableDelegate) iDealAccountsListController2.Q.getValue(), (LargeActionButtonDelegate) iDealAccountsListController2.R.getValue()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = w.y0(new b(6));
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: gd2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IDealAccountsListController f143034b;

            {
                this.f143034b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                IDealAccountsListController iDealAccountsListController = this.f143034b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IDealAccountsListController.U;
                        qji.b bVarU2 = iDealAccountsListController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.services.ideal.impl.ui.accounts.di.IDealAccountsListScreenInjector");
                        fd2.j jVar = (fd2.j) ((kd2.a) bVarU2);
                        fd2.g gVar = jVar.f133878b;
                        fd2.j jVar2 = jVar.f133879c;
                        IDealAccountsListControllerContract$InputData iDealAccountsListControllerContract$InputData = iDealAccountsListController.K;
                        iDealAccountsListControllerContract$InputData.getClass();
                        return new fd2.h(gVar, jVar2, iDealAccountsListControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = IDealAccountsListController.U;
                        return (j) ((fd2.h) iDealAccountsListController.N.getValue()).f133874c.get();
                    case 2:
                        KProperty[] kPropertyArr3 = IDealAccountsListController.U;
                        return new SelectableDelegate((RowDelegate) iDealAccountsListController.P.getValue());
                    default:
                        KProperty[] kPropertyArr4 = IDealAccountsListController.U;
                        IDealAccountsListController iDealAccountsListController2 = this.f143034b;
                        return dli.f.a(iDealAccountsListController2, iDealAccountsListController2.R2(), v.k(new RowLoadingDelegate(), new ListSubheaderDelegate(), (RowDelegate) iDealAccountsListController2.P.getValue(), (SelectableDelegate) iDealAccountsListController2.Q.getValue(), (LargeActionButtonDelegate) iDealAccountsListController2.R.getValue()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = w.y0(new b(7));
        final int i5 = 3;
        this.S = w.y0(new Function0(this) { // from class: gd2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IDealAccountsListController f143034b;

            {
                this.f143034b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                IDealAccountsListController iDealAccountsListController = this.f143034b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IDealAccountsListController.U;
                        qji.b bVarU2 = iDealAccountsListController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.services.ideal.impl.ui.accounts.di.IDealAccountsListScreenInjector");
                        fd2.j jVar = (fd2.j) ((kd2.a) bVarU2);
                        fd2.g gVar = jVar.f133878b;
                        fd2.j jVar2 = jVar.f133879c;
                        IDealAccountsListControllerContract$InputData iDealAccountsListControllerContract$InputData = iDealAccountsListController.K;
                        iDealAccountsListControllerContract$InputData.getClass();
                        return new fd2.h(gVar, jVar2, iDealAccountsListControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = IDealAccountsListController.U;
                        return (j) ((fd2.h) iDealAccountsListController.N.getValue()).f133874c.get();
                    case 2:
                        KProperty[] kPropertyArr3 = IDealAccountsListController.U;
                        return new SelectableDelegate((RowDelegate) iDealAccountsListController.P.getValue());
                    default:
                        KProperty[] kPropertyArr4 = IDealAccountsListController.U;
                        IDealAccountsListController iDealAccountsListController2 = this.f143034b;
                        return dli.f.a(iDealAccountsListController2, iDealAccountsListController2.R2(), v.k(new RowLoadingDelegate(), new ListSubheaderDelegate(), (RowDelegate) iDealAccountsListController2.P.getValue(), (SelectableDelegate) iDealAccountsListController2.Q.getValue(), (LargeActionButtonDelegate) iDealAccountsListController2.R.getValue()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.T = s.t(this, gd2.b.f);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        gd2.f uiState = (gd2.f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174533b.setModel(uiState.d);
        NavBarWithToolbar screenRecyclerNavbarActionFooterNavBar = d3().f174534c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterNavBar, "screenRecyclerNavbarActionFooterNavBar");
        TextLocalisedClause textLocalisedClause = uiState.f143039b;
        screenRecyclerNavbarActionFooterNavBar.setToolbarTitle(textLocalisedClause);
        screenRecyclerNavbarActionFooterNavBar.setTitle(textLocalisedClause, null);
        Clause clause = uiState.f143040c;
        screenRecyclerNavbarActionFooterNavBar.setSecondDescriptionText(clause);
        screenRecyclerNavbarActionFooterNavBar.setSecondDescriptionVisible(clause != null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (fd2.h) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar screenRecyclerNavbarActionFooterNavBar = d3().f174534c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterNavBar, "screenRecyclerNavbarActionFooterNavBar");
        screenRecyclerNavbarActionFooterNavBar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back));
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar screenRecyclerNavbarActionFooterNavBar = d3().f174534c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterNavBar, "screenRecyclerNavbarActionFooterNavBar");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(screenRecyclerNavbarActionFooterNavBar.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174533b.f), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174533b.f58955g), null, new c(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(((SelectableDelegate) this.Q.getValue()).r(), new l(23))), null, new g(this, null, 9), 3);
    }

    public final k d3() {
        ViewBinding value = this.T.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j d() {
        return (j) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
