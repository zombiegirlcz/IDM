package com.revolut.feature.wealth.private_companies.impl.ui.private_company_details;

import ali.g;
import an9.i;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import bfh.d;
import bfh.e;
import bfh.f;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth.private_companies.api.ui.details.PrivateCompanyDetailsContract$InputData;
import com.revolut.feature.wealth.private_companies.impl.R$id;
import com.revolut.feature.wealth.private_companies.impl.R$layout;
import com.revolut.feature.wealth.private_companies.impl.ui.private_company_details.PrivateCompanyDetailsFlowController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import m70.a;
import te0.w;
import tx0.j0;
import tx0.r3;
import tx0.t3;
import tx0.u3;
import vc.s;
import x2h.b;
import yy0.j;
import zjh.c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/private_companies/impl/ui/private_company_details/PrivateCompanyDetailsFlowController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Lali/g;", "Lbfh/f;", "Lcom/revolut/feature/wealth/private_companies/impl/ui/private_company_details/PrivateCompanyDetailsFlowContract$Page;", "feature_wealth_private_companies_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PrivateCompanyDetailsFlowController extends ViewController<Object> implements g {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PrivateCompanyDetailsFlowController.class, "binding", "getBinding()Lcom/revolut/feature/wealth/private_companies/impl/databinding/FlowPrivateCompanyDetailsBinding;", 0))};
    public final PrivateCompanyDetailsContract$InputData K;
    public final int L;
    public final h M;
    public final c N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public PrivateCompanyDetailsFlowController(PrivateCompanyDetailsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.flow_private_company_details;
        this.M = s.t(this, bfh.h.f);
        this.N = new c(this, 7);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: bfh.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PrivateCompanyDetailsFlowController f14993b;

            {
                this.f14993b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PrivateCompanyDetailsFlowController privateCompanyDetailsFlowController = this.f14993b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PrivateCompanyDetailsFlowController.R;
                        return (a) ((afh.c) ((efh.a) privateCompanyDetailsFlowController.Q.getValue())).f4083r.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PrivateCompanyDetailsFlowController.R;
                        return mif.a.a(privateCompanyDetailsFlowController, 0, R$id.flowPrivateCompanyDetails_viewPager, privateCompanyDetailsFlowController.d(), 5);
                    default:
                        KProperty[] kPropertyArr3 = PrivateCompanyDetailsFlowController.R;
                        phm.a aVar = (phm.a) ue0.e.j(privateCompanyDetailsFlowController.m2()).a().get(afh.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", afh.e.class, " is not found"));
                        }
                        afh.e eVar = ((afh.e) aVar2.b()).i;
                        PrivateCompanyDetailsContract$InputData privateCompanyDetailsContract$InputData = privateCompanyDetailsFlowController.K;
                        zjh.c cVar = privateCompanyDetailsFlowController.N;
                        privateCompanyDetailsContract$InputData.getClass();
                        cVar.getClass();
                        return new afh.c(eVar, privateCompanyDetailsFlowController, privateCompanyDetailsContract$InputData, cVar);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: bfh.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PrivateCompanyDetailsFlowController f14993b;

            {
                this.f14993b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PrivateCompanyDetailsFlowController privateCompanyDetailsFlowController = this.f14993b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PrivateCompanyDetailsFlowController.R;
                        return (a) ((afh.c) ((efh.a) privateCompanyDetailsFlowController.Q.getValue())).f4083r.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PrivateCompanyDetailsFlowController.R;
                        return mif.a.a(privateCompanyDetailsFlowController, 0, R$id.flowPrivateCompanyDetails_viewPager, privateCompanyDetailsFlowController.d(), 5);
                    default:
                        KProperty[] kPropertyArr3 = PrivateCompanyDetailsFlowController.R;
                        phm.a aVar = (phm.a) ue0.e.j(privateCompanyDetailsFlowController.m2()).a().get(afh.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", afh.e.class, " is not found"));
                        }
                        afh.e eVar = ((afh.e) aVar2.b()).i;
                        PrivateCompanyDetailsContract$InputData privateCompanyDetailsContract$InputData = privateCompanyDetailsFlowController.K;
                        zjh.c cVar = privateCompanyDetailsFlowController.N;
                        privateCompanyDetailsContract$InputData.getClass();
                        cVar.getClass();
                        return new afh.c(eVar, privateCompanyDetailsFlowController, privateCompanyDetailsContract$InputData, cVar);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: bfh.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PrivateCompanyDetailsFlowController f14993b;

            {
                this.f14993b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PrivateCompanyDetailsFlowController privateCompanyDetailsFlowController = this.f14993b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PrivateCompanyDetailsFlowController.R;
                        return (a) ((afh.c) ((efh.a) privateCompanyDetailsFlowController.Q.getValue())).f4083r.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PrivateCompanyDetailsFlowController.R;
                        return mif.a.a(privateCompanyDetailsFlowController, 0, R$id.flowPrivateCompanyDetails_viewPager, privateCompanyDetailsFlowController.d(), 5);
                    default:
                        KProperty[] kPropertyArr3 = PrivateCompanyDetailsFlowController.R;
                        phm.a aVar = (phm.a) ue0.e.j(privateCompanyDetailsFlowController.m2()).a().get(afh.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", afh.e.class, " is not found"));
                        }
                        afh.e eVar = ((afh.e) aVar2.b()).i;
                        PrivateCompanyDetailsContract$InputData privateCompanyDetailsContract$InputData = privateCompanyDetailsFlowController.K;
                        zjh.c cVar = privateCompanyDetailsFlowController.N;
                        privateCompanyDetailsContract$InputData.getClass();
                        cVar.getClass();
                        return new afh.c(eVar, privateCompanyDetailsFlowController, privateCompanyDetailsContract$InputData, cVar);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        Clause textClause;
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f312934c;
        e eVar = uiState.f14989a;
        if (eVar instanceof d) {
            d dVar = (d) eVar;
            TextClause textClause2 = dVar.f14984a;
            navBarWithToolbar.l0();
            navBarWithToolbar.setDescriptionVisible(true);
            navBarWithToolbar.setDescriptionText(textClause2);
            Clause clause = dVar.f14985b;
            navBarWithToolbar.setSecondDescriptionVisible(clause != null);
            navBarWithToolbar.setSecondDescriptionText(clause);
            if (clause == null) {
                a.c(t0.f186434a);
                textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            } else {
                textClause = clause;
            }
            NavBarWithToolbar.setToolbar$default(navBarWithToolbar, textClause2, textClause, null, 4, null);
            navBarWithToolbar.setEndImage(new r3(new j(dVar.f14986c)));
            navBarWithToolbar.setMenuItems(dVar.d);
        } else {
            if (!(eVar instanceof e.a) && !(eVar instanceof e.b)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarWithToolbar.I0(t3.DEFAULT, true);
        }
        ArrayList arrayList = uiState.f14990b;
        String str = uiState.f14991c;
        Tabs flowPrivateCompanyDetailsTabs = d3().d;
        Intrinsics.checkNotNullExpressionValue(flowPrivateCompanyDetailsTabs, "flowPrivateCompanyDetailsTabs");
        Tabs.setItems$default(flowPrivateCompanyDetailsTabs, arrayList, null, 2, null);
        if (str != null) {
            Tabs flowPrivateCompanyDetailsTabs2 = d3().d;
            Intrinsics.checkNotNullExpressionValue(flowPrivateCompanyDetailsTabs2, "flowPrivateCompanyDetailsTabs");
            Tabs.u(flowPrivateCompanyDetailsTabs2, str, false, false, false, 14);
        }
        b bVar = uiState.d;
        TwinHorizontalButton flowPrivateCompanyDetailsBuySellPanel = d3().f312933b;
        Intrinsics.checkNotNullExpressionValue(flowPrivateCompanyDetailsBuySellPanel, "flowPrivateCompanyDetailsBuySellPanel");
        n2h.h.a(bVar, flowPrivateCompanyDetailsBuySellPanel);
    }

    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        PrivateCompanyDetailsFlowContract$Page page = (PrivateCompanyDetailsFlowContract$Page) pagerItem;
        Intrinsics.checkNotNullParameter(page, "pagerItem");
        Intrinsics.checkNotNullParameter(page, "pagerItem");
        bfh.o oVar = (bfh.o) d();
        oVar.getClass();
        Intrinsics.checkNotNullParameter(page, "page");
        oVar.H2(oVar.f15004t, new b9i.f(page, 22));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (efh.a) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (efh.a) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f312934c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setTitleAutoSize(true);
        navBarWithToolbar.setTitleVisible(false);
        navBarWithToolbar.setToolbarTitleVisibilityMode(u3.COLLAPSING);
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionVisible(false);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f312934c;
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new bf5.a(this, continuation, 3), 3);
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.o.f57403b), new bfh.j(this, continuation, 0), 3);
        ViewController.P2(this, new i(rd0.e.b(d3().d.f58882b), 28), new bfh.j(this, continuation, 1), 3);
    }

    public final yeh.a d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (yeh.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final bfh.a d() {
        return (bfh.a) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (ali.c) this.P.getValue();
    }
}
