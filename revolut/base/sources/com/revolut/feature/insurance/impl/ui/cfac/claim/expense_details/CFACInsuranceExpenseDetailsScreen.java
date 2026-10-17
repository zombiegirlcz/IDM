package com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance.impl.R$string;
import com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.CFACInsuranceExpenseDetailsScreen;
import com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.CFACInsuranceExpenseDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import ik7.f;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nk7.p;
import te0.w;
import vc.s;
import wj7.c;
import wj7.d;
import wj7.g;
import wj7.j;
import wj7.m;
import wj7.n;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/claim/expense_details/CFACInsuranceExpenseDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/insurance/impl/ui/cfac/claim/expense_details/a;", "Ldli/a;", "Lwj7/n;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CFACInsuranceExpenseDetailsScreen extends ViewController<a> implements dli.a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(CFACInsuranceExpenseDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final CFACInsuranceExpenseDetailsScreenContract$InputData K;
    public final int L;
    public final boolean M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;

    public CFACInsuranceExpenseDetailsScreen(CFACInsuranceExpenseDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = true;
        this.N = s.t(this, wj7.b.f);
        this.O = w.y0(new wf5.a(10));
        this.P = w.y0(new wf5.a(11));
        this.Q = w.y0(new wf5.a(12));
        this.R = w.y0(new wf5.a(13));
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: wj7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CFACInsuranceExpenseDetailsScreen f297974b;

            {
                this.f297974b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CFACInsuranceExpenseDetailsScreen cFACInsuranceExpenseDetailsScreen = this.f297974b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CFACInsuranceExpenseDetailsScreen.V;
                        CFACInsuranceExpenseDetailsScreen cFACInsuranceExpenseDetailsScreen2 = this.f297974b;
                        return dli.f.a(cFACInsuranceExpenseDetailsScreen2, cFACInsuranceExpenseDetailsScreen2.e3(), v.k((AmountEditDelegate) cFACInsuranceExpenseDetailsScreen2.O.getValue(), (CellDetailsActionDelegate) cFACInsuranceExpenseDetailsScreen2.P.getValue(), (CellDetailsChevronDelegate) cFACInsuranceExpenseDetailsScreen2.Q.getValue(), new ListSubheaderDelegate(), (RowDelegate) cFACInsuranceExpenseDetailsScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CFACInsuranceExpenseDetailsScreen.V;
                        qji.b bVarU2 = cFACInsuranceExpenseDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.di.CFACInsuranceExpenseDetailsScreenInjector");
                        nk7.j jVar = (nk7.j) bVarU2;
                        nk7.q qVar = jVar.f216688b;
                        nk7.j jVar2 = jVar.f216689c;
                        CFACInsuranceExpenseDetailsScreenContract$InputData cFACInsuranceExpenseDetailsScreenContract$InputData = cFACInsuranceExpenseDetailsScreen.K;
                        cFACInsuranceExpenseDetailsScreenContract$InputData.getClass();
                        return new nk7.p(qVar, jVar2, cFACInsuranceExpenseDetailsScreen, cFACInsuranceExpenseDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CFACInsuranceExpenseDetailsScreen.V;
                        return (m) ((nk7.p) cFACInsuranceExpenseDetailsScreen.T.getValue()).f216714p.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: wj7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CFACInsuranceExpenseDetailsScreen f297974b;

            {
                this.f297974b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CFACInsuranceExpenseDetailsScreen cFACInsuranceExpenseDetailsScreen = this.f297974b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CFACInsuranceExpenseDetailsScreen.V;
                        CFACInsuranceExpenseDetailsScreen cFACInsuranceExpenseDetailsScreen2 = this.f297974b;
                        return dli.f.a(cFACInsuranceExpenseDetailsScreen2, cFACInsuranceExpenseDetailsScreen2.e3(), v.k((AmountEditDelegate) cFACInsuranceExpenseDetailsScreen2.O.getValue(), (CellDetailsActionDelegate) cFACInsuranceExpenseDetailsScreen2.P.getValue(), (CellDetailsChevronDelegate) cFACInsuranceExpenseDetailsScreen2.Q.getValue(), new ListSubheaderDelegate(), (RowDelegate) cFACInsuranceExpenseDetailsScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CFACInsuranceExpenseDetailsScreen.V;
                        qji.b bVarU2 = cFACInsuranceExpenseDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.di.CFACInsuranceExpenseDetailsScreenInjector");
                        nk7.j jVar = (nk7.j) bVarU2;
                        nk7.q qVar = jVar.f216688b;
                        nk7.j jVar2 = jVar.f216689c;
                        CFACInsuranceExpenseDetailsScreenContract$InputData cFACInsuranceExpenseDetailsScreenContract$InputData = cFACInsuranceExpenseDetailsScreen.K;
                        cFACInsuranceExpenseDetailsScreenContract$InputData.getClass();
                        return new nk7.p(qVar, jVar2, cFACInsuranceExpenseDetailsScreen, cFACInsuranceExpenseDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CFACInsuranceExpenseDetailsScreen.V;
                        return (m) ((nk7.p) cFACInsuranceExpenseDetailsScreen.T.getValue()).f216714p.get();
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: wj7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CFACInsuranceExpenseDetailsScreen f297974b;

            {
                this.f297974b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CFACInsuranceExpenseDetailsScreen cFACInsuranceExpenseDetailsScreen = this.f297974b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CFACInsuranceExpenseDetailsScreen.V;
                        CFACInsuranceExpenseDetailsScreen cFACInsuranceExpenseDetailsScreen2 = this.f297974b;
                        return dli.f.a(cFACInsuranceExpenseDetailsScreen2, cFACInsuranceExpenseDetailsScreen2.e3(), v.k((AmountEditDelegate) cFACInsuranceExpenseDetailsScreen2.O.getValue(), (CellDetailsActionDelegate) cFACInsuranceExpenseDetailsScreen2.P.getValue(), (CellDetailsChevronDelegate) cFACInsuranceExpenseDetailsScreen2.Q.getValue(), new ListSubheaderDelegate(), (RowDelegate) cFACInsuranceExpenseDetailsScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CFACInsuranceExpenseDetailsScreen.V;
                        qji.b bVarU2 = cFACInsuranceExpenseDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.di.CFACInsuranceExpenseDetailsScreenInjector");
                        nk7.j jVar = (nk7.j) bVarU2;
                        nk7.q qVar = jVar.f216688b;
                        nk7.j jVar2 = jVar.f216689c;
                        CFACInsuranceExpenseDetailsScreenContract$InputData cFACInsuranceExpenseDetailsScreenContract$InputData = cFACInsuranceExpenseDetailsScreen.K;
                        cFACInsuranceExpenseDetailsScreenContract$InputData.getClass();
                        return new nk7.p(qVar, jVar2, cFACInsuranceExpenseDetailsScreen, cFACInsuranceExpenseDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CFACInsuranceExpenseDetailsScreen.V;
                        return (m) ((nk7.p) cFACInsuranceExpenseDetailsScreen.T.getValue()).f216714p.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f297988b);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        j jVar = uiState.f297989c;
        navBarWithToolbar.setDescriptionText(jVar.f297983a);
        Clause clause = jVar.f297984b;
        navBarWithToolbar.setSecondDescriptionText(clause);
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
        navBarWithToolbar.setEndIconImage(jVar.f297985c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().d.setTag("InsuranceExpenseDetailsRecyclerView");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.cfac_claim_expense_add_details_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.cfac_claim_expense_add_details_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setMenuItems(f.b());
        d3().f174564b.setText(new TextLocalisedClause(this.K.i ? R$string.cfac_claim_expense_add_details_action_save : R$string.cfac_claim_expense_add_details_action_add, null, null, 14));
        d3().f174564b.setEnabled(false);
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.o.f57403b), null, new d(this, continuation, 1), 3);
        r rVarFilter = ((CellDetailsChevronDelegate) this.Q.getValue()).f51821c.filter(new wf6.o(19, new wgk.f(20)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter), null, new wj7.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new d(this, continuation, 2), 3);
        ?? r62 = this.O;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((AmountEditDelegate) r62.getValue()).d.f121375b), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((AmountEditDelegate) r62.getValue()).i.f121375b), null, new c(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsActionDelegate) this.P.getValue()).d), null, new wj7.f(this, null), 3);
        ?? r64 = this.R;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r64.getValue()).f53218h), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(((RowDelegate) r64.getValue()).k, new wgk.f(21))), null, new c(this, continuation, 0), 3);
    }

    public final u d3() {
        ViewBinding value = this.N.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final m e3() {
        return (m) this.U.getValue();
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
