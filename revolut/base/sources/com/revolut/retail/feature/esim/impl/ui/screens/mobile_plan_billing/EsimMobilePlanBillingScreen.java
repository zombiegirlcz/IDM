package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing;

import afj.w1;
import afj.x1;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.EsimMobilePlanBillingScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.EsimMobilePlanBillingScreenContract$InputData;
import ff4.z;
import fg8.e0;
import fjj.b;
import fjj.c;
import fjj.d;
import fjj.g;
import fjj.i;
import fjj.j;
import fjj.p;
import fjj.r;
import ihm.f;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_billing/EsimMobilePlanBillingScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lfjj/p;", "Ldli/a;", "Lfjj/r;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimMobilePlanBillingScreen extends ViewController<p> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(EsimMobilePlanBillingScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final EsimMobilePlanBillingScreenContract$InputData K;
    public final int L;
    public final h M;
    public final RowDelegate N;
    public final FullScreenStateDelegate O;
    public final InputDisclosureDelegate P;
    public final CellDetailsChevronDelegate Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public EsimMobilePlanBillingScreen(EsimMobilePlanBillingScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, c.f);
        this.N = new RowDelegate(null, null, 7);
        this.O = new FullScreenStateDelegate();
        this.P = new InputDisclosureDelegate();
        this.Q = new CellDetailsChevronDelegate();
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: fjj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanBillingScreen f135651b;

            {
                this.f135651b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimMobilePlanBillingScreen esimMobilePlanBillingScreen = this.f135651b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanBillingScreen.U;
                        EsimMobilePlanBillingScreen esimMobilePlanBillingScreen2 = this.f135651b;
                        return dli.f.a(esimMobilePlanBillingScreen2, esimMobilePlanBillingScreen2.d(), zhm.v.k(esimMobilePlanBillingScreen2.N, new RowLoadingDelegate(), new ListSubheaderDelegate(), esimMobilePlanBillingScreen2.P, esimMobilePlanBillingScreen2.O, new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), esimMobilePlanBillingScreen2.Q), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanBillingScreen.U;
                        qji.b bVarU2 = esimMobilePlanBillingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.di.EsimMobilePlanBillingScreenInjector");
                        w1 w1Var = (w1) ((gjj.a) bVarU2).I().mo3808a(esimMobilePlanBillingScreen);
                        EsimMobilePlanBillingScreenContract$InputData esimMobilePlanBillingScreenContract$InputData = esimMobilePlanBillingScreen.K;
                        switch (w1Var.f4507a) {
                            case 0:
                                esimMobilePlanBillingScreenContract$InputData.getClass();
                                w1Var.d = esimMobilePlanBillingScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanBillingScreenContract$InputData.getClass();
                                w1Var.d = esimMobilePlanBillingScreenContract$InputData;
                                break;
                        }
                        return (x1) w1Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanBillingScreen.U;
                        x1 x1Var = (x1) esimMobilePlanBillingScreen.S.getValue();
                        switch (x1Var.f4519a) {
                            case 0:
                                return (q) x1Var.e.get();
                            default:
                                return (q) x1Var.e.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: fjj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanBillingScreen f135651b;

            {
                this.f135651b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimMobilePlanBillingScreen esimMobilePlanBillingScreen = this.f135651b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanBillingScreen.U;
                        EsimMobilePlanBillingScreen esimMobilePlanBillingScreen2 = this.f135651b;
                        return dli.f.a(esimMobilePlanBillingScreen2, esimMobilePlanBillingScreen2.d(), zhm.v.k(esimMobilePlanBillingScreen2.N, new RowLoadingDelegate(), new ListSubheaderDelegate(), esimMobilePlanBillingScreen2.P, esimMobilePlanBillingScreen2.O, new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), esimMobilePlanBillingScreen2.Q), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanBillingScreen.U;
                        qji.b bVarU2 = esimMobilePlanBillingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.di.EsimMobilePlanBillingScreenInjector");
                        w1 w1Var = (w1) ((gjj.a) bVarU2).I().mo3808a(esimMobilePlanBillingScreen);
                        EsimMobilePlanBillingScreenContract$InputData esimMobilePlanBillingScreenContract$InputData = esimMobilePlanBillingScreen.K;
                        switch (w1Var.f4507a) {
                            case 0:
                                esimMobilePlanBillingScreenContract$InputData.getClass();
                                w1Var.d = esimMobilePlanBillingScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanBillingScreenContract$InputData.getClass();
                                w1Var.d = esimMobilePlanBillingScreenContract$InputData;
                                break;
                        }
                        return (x1) w1Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanBillingScreen.U;
                        x1 x1Var = (x1) esimMobilePlanBillingScreen.S.getValue();
                        switch (x1Var.f4519a) {
                            case 0:
                                return (q) x1Var.e.get();
                            default:
                                return (q) x1Var.e.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: fjj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanBillingScreen f135651b;

            {
                this.f135651b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimMobilePlanBillingScreen esimMobilePlanBillingScreen = this.f135651b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanBillingScreen.U;
                        EsimMobilePlanBillingScreen esimMobilePlanBillingScreen2 = this.f135651b;
                        return dli.f.a(esimMobilePlanBillingScreen2, esimMobilePlanBillingScreen2.d(), zhm.v.k(esimMobilePlanBillingScreen2.N, new RowLoadingDelegate(), new ListSubheaderDelegate(), esimMobilePlanBillingScreen2.P, esimMobilePlanBillingScreen2.O, new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), esimMobilePlanBillingScreen2.Q), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanBillingScreen.U;
                        qji.b bVarU2 = esimMobilePlanBillingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.di.EsimMobilePlanBillingScreenInjector");
                        w1 w1Var = (w1) ((gjj.a) bVarU2).I().mo3808a(esimMobilePlanBillingScreen);
                        EsimMobilePlanBillingScreenContract$InputData esimMobilePlanBillingScreenContract$InputData = esimMobilePlanBillingScreen.K;
                        switch (w1Var.f4507a) {
                            case 0:
                                esimMobilePlanBillingScreenContract$InputData.getClass();
                                w1Var.d = esimMobilePlanBillingScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanBillingScreenContract$InputData.getClass();
                                w1Var.d = esimMobilePlanBillingScreenContract$InputData;
                                break;
                        }
                        return (x1) w1Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanBillingScreen.U;
                        x1 x1Var = (x1) esimMobilePlanBillingScreen.S.getValue();
                        switch (x1Var.f4519a) {
                            case 0:
                                return (q) x1Var.e.get();
                            default:
                                return (q) x1Var.e.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((r) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x1) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.esim_mobile_plans_billing_header_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.esim_mobile_plans_billing_header_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new z(this, null, 10), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52371h.f121375b), null, new fjj.h(this, null), 3);
        RowDelegate rowDelegate = this.N;
        efm.r rVarFilter = rowDelegate.f53218h.filter(new e0(29, new fj5.e(17)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(rVarFilter, new fj5.e(12))), null, new g(this, null, 1), 3);
        f fVar = rowDelegate.f53218h;
        efm.r rVarFilter2 = fVar.filter(new b(new fj5.e(13), 0));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter2), null, new i(this, null), 3);
        efm.r rVarFilter3 = fVar.filter(new b(new fj5.e(14), 1));
        Intrinsics.checkNotNullExpressionValue(rVarFilter3, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter3), null, new j(this, null), 3);
        efm.r rVarFilter4 = fVar.mergeWith(rowDelegate.f53224q).filter(new b(new fj5.e(15), 2));
        Intrinsics.checkNotNullExpressionValue(rVarFilter4, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter4), null, new d(this, null), 3);
        efm.r rVarFilter5 = rowDelegate.f53225r.filter(new b(new fj5.e(16), 3));
        Intrinsics.checkNotNullExpressionValue(rVarFilter5, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter5), null, new fjj.e(this, null), 3);
        efm.r rVarFilter6 = this.P.f52538c.filter(new b(new fj5.e(18), 4));
        Intrinsics.checkNotNullExpressionValue(rVarFilter6, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter6), null, new fjj.f(this, null), 3);
        efm.r rVarFilter7 = this.Q.f51821c.filter(new b(new fj5.e(19), 5));
        Intrinsics.checkNotNullExpressionValue(rVarFilter7, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(rVarFilter7, new fj5.e(20))), null, new g(this, null, 0), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final fjj.q d() {
        return (fjj.q) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
