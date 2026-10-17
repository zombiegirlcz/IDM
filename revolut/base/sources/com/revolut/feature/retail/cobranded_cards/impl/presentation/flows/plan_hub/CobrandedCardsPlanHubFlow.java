package com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.plan_hub;

import aii.q;
import ali.c;
import ali.g;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import b6b.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.plan_hub.CobrandedCardsPlanHubFlow;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.plan_hub.CobrandedCardsPlanHubFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import iyi.i;
import j6b.b;
import j6b.d;
import j6b.e;
import j6b.f;
import j6b.j;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.t3;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/plan_hub/CobrandedCardsPlanHubFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lali/g;", "Lj6b/h;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/plan_hub/CobrandedCardsPlanHubFlowContract$PagerItem;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CobrandedCardsPlanHubFlow extends ViewController<q> implements g {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(CobrandedCardsPlanHubFlow.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenNavbarTabsPagerBinding;", 0))};
    public final CobrandedCardsPlanHubFlowContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;

    public CobrandedCardsPlanHubFlow(CobrandedCardsPlanHubFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_navbar_tabs_pager;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: j6b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsPlanHubFlow f171717b;

            {
                this.f171717b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CobrandedCardsPlanHubFlow cobrandedCardsPlanHubFlow = this.f171717b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsPlanHubFlow.Q;
                        return mif.a.a(cobrandedCardsPlanHubFlow, 0, R$id.screenNavbarTabsPager_pager, (j) cobrandedCardsPlanHubFlow.P.getValue(), 5);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsPlanHubFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(cobrandedCardsPlanHubFlow.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f12655j;
                        CobrandedCardsPlanHubFlowContract$InputData cobrandedCardsPlanHubFlowContract$InputData = cobrandedCardsPlanHubFlow.K;
                        cobrandedCardsPlanHubFlowContract$InputData.getClass();
                        return new b6b.q(oVar, cobrandedCardsPlanHubFlowContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsPlanHubFlow.Q;
                        return (j) ((b6b.q) cobrandedCardsPlanHubFlow.O.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: j6b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsPlanHubFlow f171717b;

            {
                this.f171717b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CobrandedCardsPlanHubFlow cobrandedCardsPlanHubFlow = this.f171717b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsPlanHubFlow.Q;
                        return mif.a.a(cobrandedCardsPlanHubFlow, 0, R$id.screenNavbarTabsPager_pager, (j) cobrandedCardsPlanHubFlow.P.getValue(), 5);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsPlanHubFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(cobrandedCardsPlanHubFlow.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f12655j;
                        CobrandedCardsPlanHubFlowContract$InputData cobrandedCardsPlanHubFlowContract$InputData = cobrandedCardsPlanHubFlow.K;
                        cobrandedCardsPlanHubFlowContract$InputData.getClass();
                        return new b6b.q(oVar, cobrandedCardsPlanHubFlowContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsPlanHubFlow.Q;
                        return (j) ((b6b.q) cobrandedCardsPlanHubFlow.O.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: j6b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsPlanHubFlow f171717b;

            {
                this.f171717b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CobrandedCardsPlanHubFlow cobrandedCardsPlanHubFlow = this.f171717b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsPlanHubFlow.Q;
                        return mif.a.a(cobrandedCardsPlanHubFlow, 0, R$id.screenNavbarTabsPager_pager, (j) cobrandedCardsPlanHubFlow.P.getValue(), 5);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsPlanHubFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(cobrandedCardsPlanHubFlow.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f12655j;
                        CobrandedCardsPlanHubFlowContract$InputData cobrandedCardsPlanHubFlowContract$InputData = cobrandedCardsPlanHubFlow.K;
                        cobrandedCardsPlanHubFlowContract$InputData.getClass();
                        return new b6b.q(oVar, cobrandedCardsPlanHubFlowContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsPlanHubFlow.Q;
                        return (j) ((b6b.q) cobrandedCardsPlanHubFlow.O.getValue()).e.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        j6b.h uiState = (j6b.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        j6b.g gVar = uiState.f171726a;
        NavBarWithToolbar navBarWithToolbar = d3().f174523c;
        if (gVar instanceof d) {
            navBarWithToolbar.l0();
        } else {
            if (gVar instanceof e) {
                t3 t3Var = t3.TWO_LINES;
                NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
                navBarWithToolbar.I0(t3Var, false);
            } else {
                if (!(gVar instanceof f)) {
                    throw new NoWhenBranchMatchedException();
                }
                navBarWithToolbar.l0();
                f fVar = (f) gVar;
                Clause clause = fVar.f171724b;
                navBarWithToolbar.setTitle(fVar.f171723a, null);
                navBarWithToolbar.setDescriptionText(clause);
                navBarWithToolbar.setEndImage(fVar.f171725c);
                navBarWithToolbar.setDescriptionVisible(clause != null);
            }
        }
        d3().f174522b.setItems(uiState.f171728c, uiState.f171727b);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        CobrandedCardsPlanHubFlowContract$PagerItem pagerItem2 = (CobrandedCardsPlanHubFlowContract$PagerItem) pagerItem;
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        j jVar = (j) this.P.getValue();
        jVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        jVar.H2(jVar.f171732r, new i(pagerItem2, 23));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b6b.q) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (b6b.q) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (j) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174523c;
        t3 t3Var = t3.TWO_LINES;
        NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
        navBarWithToolbar.I0(t3Var, false);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        a.g2(this, rd0.e.b(d3().f174523c.f59410q), null, new j2c.b(this, null, 7), 3);
        ViewController.P2(this, rd0.e.b(d3().f174522b.f58882b), new iug.j(this, (Continuation) null, 26), 3);
    }

    public final jii.g d3() {
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.g) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.N.getValue();
    }
}
