package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_invoices;

import afj.e2;
import afj.f2;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
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
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_invoices.EsimMobilePlanInvoicesScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_invoices.EsimMobilePlanInvoicesScreenContract$InputData;
import dli.a;
import hba.k;
import hhd.n;
import hkj.b;
import hkj.c;
import hkj.e;
import hkj.f;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_invoices/EsimMobilePlanInvoicesScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Ldli/a;", "Lhkj/e;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimMobilePlanInvoicesScreen extends ViewController<Object> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(EsimMobilePlanInvoicesScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final EsimMobilePlanInvoicesScreenContract$InputData K;
    public final int L;
    public final h M;
    public final RowDelegate N;
    public final FullScreenStateDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public EsimMobilePlanInvoicesScreen(EsimMobilePlanInvoicesScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        this.N = new RowDelegate(null, null, 7);
        this.O = new FullScreenStateDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: hkj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanInvoicesScreen f152931b;

            {
                this.f152931b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimMobilePlanInvoicesScreen esimMobilePlanInvoicesScreen = this.f152931b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanInvoicesScreen.S;
                        EsimMobilePlanInvoicesScreen esimMobilePlanInvoicesScreen2 = this.f152931b;
                        return dli.f.a(esimMobilePlanInvoicesScreen2, (f) esimMobilePlanInvoicesScreen2.R.getValue(), v.k(esimMobilePlanInvoicesScreen2.N, new RowLoadingDelegate(), new ListSubheaderDelegate(), esimMobilePlanInvoicesScreen2.O, new ListSubheaderLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanInvoicesScreen.S;
                        qji.b bVarU2 = esimMobilePlanInvoicesScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_invoices.di.EsimMobilePlanInvoicesScreenInjector");
                        }
                        e2 e2Var = (e2) ((ikj.a) bVarU2).c().mo3808a(esimMobilePlanInvoicesScreen);
                        EsimMobilePlanInvoicesScreenContract$InputData esimMobilePlanInvoicesScreenContract$InputData = esimMobilePlanInvoicesScreen.K;
                        switch (e2Var.f4223a) {
                            case 0:
                                esimMobilePlanInvoicesScreenContract$InputData.getClass();
                                e2Var.d = esimMobilePlanInvoicesScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanInvoicesScreenContract$InputData.getClass();
                                e2Var.d = esimMobilePlanInvoicesScreenContract$InputData;
                                break;
                        }
                        return (f2) e2Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanInvoicesScreen.S;
                        f2 f2Var = (f2) esimMobilePlanInvoicesScreen.Q.getValue();
                        switch (f2Var.f4242a) {
                            case 0:
                                return (f) f2Var.e.get();
                            default:
                                return (f) f2Var.e.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: hkj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanInvoicesScreen f152931b;

            {
                this.f152931b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimMobilePlanInvoicesScreen esimMobilePlanInvoicesScreen = this.f152931b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanInvoicesScreen.S;
                        EsimMobilePlanInvoicesScreen esimMobilePlanInvoicesScreen2 = this.f152931b;
                        return dli.f.a(esimMobilePlanInvoicesScreen2, (f) esimMobilePlanInvoicesScreen2.R.getValue(), v.k(esimMobilePlanInvoicesScreen2.N, new RowLoadingDelegate(), new ListSubheaderDelegate(), esimMobilePlanInvoicesScreen2.O, new ListSubheaderLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanInvoicesScreen.S;
                        qji.b bVarU2 = esimMobilePlanInvoicesScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_invoices.di.EsimMobilePlanInvoicesScreenInjector");
                        }
                        e2 e2Var = (e2) ((ikj.a) bVarU2).c().mo3808a(esimMobilePlanInvoicesScreen);
                        EsimMobilePlanInvoicesScreenContract$InputData esimMobilePlanInvoicesScreenContract$InputData = esimMobilePlanInvoicesScreen.K;
                        switch (e2Var.f4223a) {
                            case 0:
                                esimMobilePlanInvoicesScreenContract$InputData.getClass();
                                e2Var.d = esimMobilePlanInvoicesScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanInvoicesScreenContract$InputData.getClass();
                                e2Var.d = esimMobilePlanInvoicesScreenContract$InputData;
                                break;
                        }
                        return (f2) e2Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanInvoicesScreen.S;
                        f2 f2Var = (f2) esimMobilePlanInvoicesScreen.Q.getValue();
                        switch (f2Var.f4242a) {
                            case 0:
                                return (f) f2Var.e.get();
                            default:
                                return (f) f2Var.e.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: hkj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanInvoicesScreen f152931b;

            {
                this.f152931b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimMobilePlanInvoicesScreen esimMobilePlanInvoicesScreen = this.f152931b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanInvoicesScreen.S;
                        EsimMobilePlanInvoicesScreen esimMobilePlanInvoicesScreen2 = this.f152931b;
                        return dli.f.a(esimMobilePlanInvoicesScreen2, (f) esimMobilePlanInvoicesScreen2.R.getValue(), v.k(esimMobilePlanInvoicesScreen2.N, new RowLoadingDelegate(), new ListSubheaderDelegate(), esimMobilePlanInvoicesScreen2.O, new ListSubheaderLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanInvoicesScreen.S;
                        qji.b bVarU2 = esimMobilePlanInvoicesScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_invoices.di.EsimMobilePlanInvoicesScreenInjector");
                        }
                        e2 e2Var = (e2) ((ikj.a) bVarU2).c().mo3808a(esimMobilePlanInvoicesScreen);
                        EsimMobilePlanInvoicesScreenContract$InputData esimMobilePlanInvoicesScreenContract$InputData = esimMobilePlanInvoicesScreen.K;
                        switch (e2Var.f4223a) {
                            case 0:
                                esimMobilePlanInvoicesScreenContract$InputData.getClass();
                                e2Var.d = esimMobilePlanInvoicesScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanInvoicesScreenContract$InputData.getClass();
                                e2Var.d = esimMobilePlanInvoicesScreenContract$InputData;
                                break;
                        }
                        return (f2) e2Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanInvoicesScreen.S;
                        f2 f2Var = (f2) esimMobilePlanInvoicesScreen.Q.getValue();
                        switch (f2Var.f4242a) {
                            case 0:
                                return (f) f2Var.e.get();
                            default:
                                return (f) f2Var.e.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((e) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (f2) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.esim_mobile_plans_invoices_header_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.esim_mobile_plans_invoices_header_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new hbg.h(this, continuation, 12), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52371h.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(this.N.f53218h, new n(16))), null, new k(this, continuation, 24), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
