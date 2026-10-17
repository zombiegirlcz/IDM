package com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason;

import afj.m3;
import afj.n3;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.EsimRefundReasonScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.EsimRefundReasonScreenContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import h30.l;
import jii.u;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nnj.d;
import nnj.f;
import nnj.g;
import nnj.n;
import nnj.p;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/refund_reason/EsimRefundReasonScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/refund_reason/a;", "Ldli/a;", "Lnnj/p;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimRefundReasonScreen extends ViewController<a> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(EsimRefundReasonScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final EsimRefundReasonScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public EsimRefundReasonScreen(EsimRefundReasonScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, nnj.c.f);
        this.N = w.y0(new nme.c(18));
        this.O = w.y0(new nme.c(19));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: nnj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimRefundReasonScreen f217688b;

            {
                this.f217688b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimRefundReasonScreen esimRefundReasonScreen = this.f217688b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimRefundReasonScreen.S;
                        EsimRefundReasonScreen esimRefundReasonScreen2 = this.f217688b;
                        return dli.f.a(esimRefundReasonScreen2, esimRefundReasonScreen2.d(), v.k((InputChecklistDelegate) esimRefundReasonScreen2.N.getValue(), new RowLoadingDelegate(), (FullScreenStateDelegate) esimRefundReasonScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimRefundReasonScreen.S;
                        qji.b bVarU2 = esimRefundReasonScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.di.EsimRefundReasonScreenInjector");
                        m3 m3Var = (m3) ((onj.a) bVarU2).q().mo3808a(esimRefundReasonScreen);
                        EsimRefundReasonScreenContract$InputData esimRefundReasonScreenContract$InputData = esimRefundReasonScreen.K;
                        switch (m3Var.f4347a) {
                            case 0:
                                esimRefundReasonScreenContract$InputData.getClass();
                                m3Var.d = esimRefundReasonScreenContract$InputData;
                                break;
                            default:
                                esimRefundReasonScreenContract$InputData.getClass();
                                m3Var.d = esimRefundReasonScreenContract$InputData;
                                break;
                        }
                        return (n3) m3Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimRefundReasonScreen.S;
                        n3 n3Var = (n3) esimRefundReasonScreen.Q.getValue();
                        switch (n3Var.f4363a) {
                            case 0:
                                return (n) n3Var.f.get();
                            default:
                                return (n) n3Var.f.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: nnj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimRefundReasonScreen f217688b;

            {
                this.f217688b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimRefundReasonScreen esimRefundReasonScreen = this.f217688b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimRefundReasonScreen.S;
                        EsimRefundReasonScreen esimRefundReasonScreen2 = this.f217688b;
                        return dli.f.a(esimRefundReasonScreen2, esimRefundReasonScreen2.d(), v.k((InputChecklistDelegate) esimRefundReasonScreen2.N.getValue(), new RowLoadingDelegate(), (FullScreenStateDelegate) esimRefundReasonScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimRefundReasonScreen.S;
                        qji.b bVarU2 = esimRefundReasonScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.di.EsimRefundReasonScreenInjector");
                        m3 m3Var = (m3) ((onj.a) bVarU2).q().mo3808a(esimRefundReasonScreen);
                        EsimRefundReasonScreenContract$InputData esimRefundReasonScreenContract$InputData = esimRefundReasonScreen.K;
                        switch (m3Var.f4347a) {
                            case 0:
                                esimRefundReasonScreenContract$InputData.getClass();
                                m3Var.d = esimRefundReasonScreenContract$InputData;
                                break;
                            default:
                                esimRefundReasonScreenContract$InputData.getClass();
                                m3Var.d = esimRefundReasonScreenContract$InputData;
                                break;
                        }
                        return (n3) m3Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimRefundReasonScreen.S;
                        n3 n3Var = (n3) esimRefundReasonScreen.Q.getValue();
                        switch (n3Var.f4363a) {
                            case 0:
                                return (n) n3Var.f.get();
                            default:
                                return (n) n3Var.f.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: nnj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimRefundReasonScreen f217688b;

            {
                this.f217688b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimRefundReasonScreen esimRefundReasonScreen = this.f217688b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimRefundReasonScreen.S;
                        EsimRefundReasonScreen esimRefundReasonScreen2 = this.f217688b;
                        return dli.f.a(esimRefundReasonScreen2, esimRefundReasonScreen2.d(), v.k((InputChecklistDelegate) esimRefundReasonScreen2.N.getValue(), new RowLoadingDelegate(), (FullScreenStateDelegate) esimRefundReasonScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimRefundReasonScreen.S;
                        qji.b bVarU2 = esimRefundReasonScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund_reason.di.EsimRefundReasonScreenInjector");
                        m3 m3Var = (m3) ((onj.a) bVarU2).q().mo3808a(esimRefundReasonScreen);
                        EsimRefundReasonScreenContract$InputData esimRefundReasonScreenContract$InputData = esimRefundReasonScreen.K;
                        switch (m3Var.f4347a) {
                            case 0:
                                esimRefundReasonScreenContract$InputData.getClass();
                                m3Var.d = esimRefundReasonScreenContract$InputData;
                                break;
                            default:
                                esimRefundReasonScreenContract$InputData.getClass();
                                m3Var.d = esimRefundReasonScreenContract$InputData;
                                break;
                        }
                        return (n3) m3Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimRefundReasonScreen.S;
                        n3 n3Var = (n3) esimRefundReasonScreen.Q.getValue();
                        switch (n3Var.f4363a) {
                            case 0:
                                return (n) n3Var.f.get();
                            default:
                                return (n) n3Var.f.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        int i = nnj.b.f217689a[uiState.f217701b.ordinal()];
        if (i == 1) {
            LargeActionButton goToButton = d3().f174564b;
            Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
            goToButton.setVisibility(8);
        } else {
            if (i == 2) {
                LargeActionButton goToButton2 = d3().f174564b;
                Intrinsics.checkNotNullExpressionValue(goToButton2, "goToButton");
                goToButton2.setVisibility(0);
                d3().f174564b.setEnabled(true);
                return;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            LargeActionButton goToButton3 = d3().f174564b;
            Intrinsics.checkNotNullExpressionValue(goToButton3, "goToButton");
            goToButton3.setVisibility(0);
            d3().f174564b.setEnabled(false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n3) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitleAutoSize(false);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setTitle(f3(), null);
        navBarWithToolbar.setToolbarTitle(f3());
        EsimRefundReasonScreenContract$InputData esimRefundReasonScreenContract$InputData = this.K;
        if (esimRefundReasonScreenContract$InputData instanceof EsimRefundReasonScreenContract$InputData.RefundDataPlanSubscription) {
            i = R$string.esim_refund_reason_subtitle;
        } else {
            if (!(esimRefundReasonScreenContract$InputData instanceof EsimRefundReasonScreenContract$InputData.CancelMobilePlan)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.esim_mobile_plans_cancellation_reason_header_subtitle;
        }
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 10));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        l.A(R.string.common_action_continue, null, null, 14, d3().f174564b);
    }

    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new d(this, continuation, 1), 3);
        ?? r56 = this.N;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputChecklistDelegate) r56.getValue()).f52518c), null, new nnj.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputChecklistDelegate) r56.getValue()).e.f121375b), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.O.getValue()).f52371h.f121375b), null, new g(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n d() {
        return (n) this.R.getValue();
    }

    public final TextLocalisedClause f3() {
        EsimRefundReasonScreenContract$InputData esimRefundReasonScreenContract$InputData = this.K;
        if (esimRefundReasonScreenContract$InputData instanceof EsimRefundReasonScreenContract$InputData.RefundDataPlanSubscription) {
            return new TextLocalisedClause(R$string.esim_refund_reason_title, null, null, 14);
        }
        if (esimRefundReasonScreenContract$InputData instanceof EsimRefundReasonScreenContract$InputData.CancelMobilePlan) {
            return new TextLocalisedClause(R$string.esim_mobile_plans_cancellation_reason_header_title, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
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
