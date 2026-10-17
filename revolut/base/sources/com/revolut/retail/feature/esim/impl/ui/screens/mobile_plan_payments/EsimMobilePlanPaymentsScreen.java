package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_payments;

import afj.i2;
import afj.j2;
import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_payments.EsimMobilePlanPaymentsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_payments.EsimMobilePlanPaymentsScreenContract$InputData;
import dli.a;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import x0f.g;
import xki.e;
import xlj.b;
import xlj.c;
import xlj.f;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_payments/EsimMobilePlanPaymentsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lxlj/f;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimMobilePlanPaymentsScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(EsimMobilePlanPaymentsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final EsimMobilePlanPaymentsScreenContract$InputData K;
    public final int L;
    public final h M;
    public final RowDelegate N;
    public final FullScreenStateDelegate O;
    public final SwipeToActionDelegate P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public EsimMobilePlanPaymentsScreen(EsimMobilePlanPaymentsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.N = rowDelegate;
        this.O = new FullScreenStateDelegate();
        this.P = new SwipeToActionDelegate(rowDelegate, false);
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: xlj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanPaymentsScreen f307021b;

            {
                this.f307021b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimMobilePlanPaymentsScreen esimMobilePlanPaymentsScreen = this.f307021b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanPaymentsScreen.T;
                        EsimMobilePlanPaymentsScreen esimMobilePlanPaymentsScreen2 = this.f307021b;
                        return dli.f.a(esimMobilePlanPaymentsScreen2, (e) esimMobilePlanPaymentsScreen2.S.getValue(), v.k(esimMobilePlanPaymentsScreen2.N, new RowLoadingDelegate(), esimMobilePlanPaymentsScreen2.P, new ListSubheaderDelegate(), esimMobilePlanPaymentsScreen2.O, new ListSubheaderLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanPaymentsScreen.T;
                        qji.b bVarU2 = esimMobilePlanPaymentsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_payments.di.EsimMobilePlanPaymentsScreenInjector");
                        i2 i2Var = (i2) ((ylj.a) bVarU2).Q().mo3808a(esimMobilePlanPaymentsScreen);
                        EsimMobilePlanPaymentsScreenContract$InputData esimMobilePlanPaymentsScreenContract$InputData = esimMobilePlanPaymentsScreen.K;
                        switch (i2Var.f4287a) {
                            case 0:
                                esimMobilePlanPaymentsScreenContract$InputData.getClass();
                                i2Var.d = esimMobilePlanPaymentsScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanPaymentsScreenContract$InputData.getClass();
                                i2Var.d = esimMobilePlanPaymentsScreenContract$InputData;
                                break;
                        }
                        return (j2) i2Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanPaymentsScreen.T;
                        j2 j2Var = (j2) esimMobilePlanPaymentsScreen.R.getValue();
                        switch (j2Var.f4302a) {
                            case 0:
                                return (e) j2Var.e.get();
                            default:
                                return (e) j2Var.e.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: xlj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanPaymentsScreen f307021b;

            {
                this.f307021b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimMobilePlanPaymentsScreen esimMobilePlanPaymentsScreen = this.f307021b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanPaymentsScreen.T;
                        EsimMobilePlanPaymentsScreen esimMobilePlanPaymentsScreen2 = this.f307021b;
                        return dli.f.a(esimMobilePlanPaymentsScreen2, (e) esimMobilePlanPaymentsScreen2.S.getValue(), v.k(esimMobilePlanPaymentsScreen2.N, new RowLoadingDelegate(), esimMobilePlanPaymentsScreen2.P, new ListSubheaderDelegate(), esimMobilePlanPaymentsScreen2.O, new ListSubheaderLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanPaymentsScreen.T;
                        qji.b bVarU2 = esimMobilePlanPaymentsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_payments.di.EsimMobilePlanPaymentsScreenInjector");
                        i2 i2Var = (i2) ((ylj.a) bVarU2).Q().mo3808a(esimMobilePlanPaymentsScreen);
                        EsimMobilePlanPaymentsScreenContract$InputData esimMobilePlanPaymentsScreenContract$InputData = esimMobilePlanPaymentsScreen.K;
                        switch (i2Var.f4287a) {
                            case 0:
                                esimMobilePlanPaymentsScreenContract$InputData.getClass();
                                i2Var.d = esimMobilePlanPaymentsScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanPaymentsScreenContract$InputData.getClass();
                                i2Var.d = esimMobilePlanPaymentsScreenContract$InputData;
                                break;
                        }
                        return (j2) i2Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanPaymentsScreen.T;
                        j2 j2Var = (j2) esimMobilePlanPaymentsScreen.R.getValue();
                        switch (j2Var.f4302a) {
                            case 0:
                                return (e) j2Var.e.get();
                            default:
                                return (e) j2Var.e.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: xlj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanPaymentsScreen f307021b;

            {
                this.f307021b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimMobilePlanPaymentsScreen esimMobilePlanPaymentsScreen = this.f307021b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanPaymentsScreen.T;
                        EsimMobilePlanPaymentsScreen esimMobilePlanPaymentsScreen2 = this.f307021b;
                        return dli.f.a(esimMobilePlanPaymentsScreen2, (e) esimMobilePlanPaymentsScreen2.S.getValue(), v.k(esimMobilePlanPaymentsScreen2.N, new RowLoadingDelegate(), esimMobilePlanPaymentsScreen2.P, new ListSubheaderDelegate(), esimMobilePlanPaymentsScreen2.O, new ListSubheaderLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanPaymentsScreen.T;
                        qji.b bVarU2 = esimMobilePlanPaymentsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_payments.di.EsimMobilePlanPaymentsScreenInjector");
                        i2 i2Var = (i2) ((ylj.a) bVarU2).Q().mo3808a(esimMobilePlanPaymentsScreen);
                        EsimMobilePlanPaymentsScreenContract$InputData esimMobilePlanPaymentsScreenContract$InputData = esimMobilePlanPaymentsScreen.K;
                        switch (i2Var.f4287a) {
                            case 0:
                                esimMobilePlanPaymentsScreenContract$InputData.getClass();
                                i2Var.d = esimMobilePlanPaymentsScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanPaymentsScreenContract$InputData.getClass();
                                i2Var.d = esimMobilePlanPaymentsScreenContract$InputData;
                                break;
                        }
                        return (j2) i2Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanPaymentsScreen.T;
                        j2 j2Var = (j2) esimMobilePlanPaymentsScreen.R.getValue();
                        switch (j2Var.f4302a) {
                            case 0:
                                return (e) j2Var.e.get();
                            default:
                                return (e) j2Var.e.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j2) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (xlj.e) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.esim_mobile_plans_billing_billing_item_payment_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.esim_mobile_plans_billing_billing_item_payment_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new g(this, null, 25), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f53218h), null, new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
