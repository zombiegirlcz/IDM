package com.revolut.feature.external_accounts.impl.ui.brazil.limits_update;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.BrPaymentLimitsUpdateScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.BrPaymentLimitsUpdateScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.common.ui.R$string;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import te0.w;
import vc.s;
import w50.g;
import wde.f;
import wj6.c;
import xf6.e3;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/limits_update/BrPaymentLimitsUpdateScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/limits_update/BrPaymentLimitsUpdateScreenContract$OutputData;", "Ldli/a;", "Lwj6/f;", "Lno/k;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BrPaymentLimitsUpdateScreen extends ViewController<BrPaymentLimitsUpdateScreenContract$OutputData> implements dli.a, k {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(BrPaymentLimitsUpdateScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final BrPaymentLimitsUpdateScreenContract$InputData K;
    public AnalyticsContext L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final xi0.b S;
    public final CenteredAmountDelegate T;

    public BrPaymentLimitsUpdateScreen(BrPaymentLimitsUpdateScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.M = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.N = s.t(this, wj6.b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: wj6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrPaymentLimitsUpdateScreen f297959b;

            {
                this.f297959b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BrPaymentLimitsUpdateScreen brPaymentLimitsUpdateScreen = this.f297959b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BrPaymentLimitsUpdateScreen.U;
                        qji.b bVarU2 = brPaymentLimitsUpdateScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.di.BrPaymentLimitsUpdateScreenInjector");
                        xf6.l lVar = (xf6.l) ((xj6.a) bVarU2).b().mo3808a(brPaymentLimitsUpdateScreen);
                        BrPaymentLimitsUpdateScreenContract$InputData brPaymentLimitsUpdateScreenContract$InputData = brPaymentLimitsUpdateScreen.K;
                        switch (lVar.f304919a) {
                            case 0:
                                brPaymentLimitsUpdateScreenContract$InputData.getClass();
                                lVar.f304921c = brPaymentLimitsUpdateScreenContract$InputData;
                                break;
                            case 1:
                                brPaymentLimitsUpdateScreenContract$InputData.getClass();
                                lVar.f304921c = brPaymentLimitsUpdateScreenContract$InputData;
                                break;
                            default:
                                brPaymentLimitsUpdateScreenContract$InputData.getClass();
                                lVar.f304921c = brPaymentLimitsUpdateScreenContract$InputData;
                                break;
                        }
                        return (e3) lVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = BrPaymentLimitsUpdateScreen.U;
                        e3 e3Var = (e3) brPaymentLimitsUpdateScreen.O.getValue();
                        switch (e3Var.f304838a) {
                            case 0:
                                return (e) e3Var.d.get();
                            case 1:
                                return (e) e3Var.d.get();
                            default:
                                return (e) e3Var.d.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = BrPaymentLimitsUpdateScreen.U;
                        BrPaymentLimitsUpdateScreen brPaymentLimitsUpdateScreen2 = this.f297959b;
                        return dli.f.a(brPaymentLimitsUpdateScreen2, brPaymentLimitsUpdateScreen2.R2(), u.c(brPaymentLimitsUpdateScreen2.T), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = BrPaymentLimitsUpdateScreen.U;
                        return new u80.d(((s80.b) ((e3) brPaymentLimitsUpdateScreen.O.getValue()).i()).b());
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: wj6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrPaymentLimitsUpdateScreen f297959b;

            {
                this.f297959b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BrPaymentLimitsUpdateScreen brPaymentLimitsUpdateScreen = this.f297959b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BrPaymentLimitsUpdateScreen.U;
                        qji.b bVarU2 = brPaymentLimitsUpdateScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.di.BrPaymentLimitsUpdateScreenInjector");
                        xf6.l lVar = (xf6.l) ((xj6.a) bVarU2).b().mo3808a(brPaymentLimitsUpdateScreen);
                        BrPaymentLimitsUpdateScreenContract$InputData brPaymentLimitsUpdateScreenContract$InputData = brPaymentLimitsUpdateScreen.K;
                        switch (lVar.f304919a) {
                            case 0:
                                brPaymentLimitsUpdateScreenContract$InputData.getClass();
                                lVar.f304921c = brPaymentLimitsUpdateScreenContract$InputData;
                                break;
                            case 1:
                                brPaymentLimitsUpdateScreenContract$InputData.getClass();
                                lVar.f304921c = brPaymentLimitsUpdateScreenContract$InputData;
                                break;
                            default:
                                brPaymentLimitsUpdateScreenContract$InputData.getClass();
                                lVar.f304921c = brPaymentLimitsUpdateScreenContract$InputData;
                                break;
                        }
                        return (e3) lVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = BrPaymentLimitsUpdateScreen.U;
                        e3 e3Var = (e3) brPaymentLimitsUpdateScreen.O.getValue();
                        switch (e3Var.f304838a) {
                            case 0:
                                return (e) e3Var.d.get();
                            case 1:
                                return (e) e3Var.d.get();
                            default:
                                return (e) e3Var.d.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = BrPaymentLimitsUpdateScreen.U;
                        BrPaymentLimitsUpdateScreen brPaymentLimitsUpdateScreen2 = this.f297959b;
                        return dli.f.a(brPaymentLimitsUpdateScreen2, brPaymentLimitsUpdateScreen2.R2(), u.c(brPaymentLimitsUpdateScreen2.T), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = BrPaymentLimitsUpdateScreen.U;
                        return new u80.d(((s80.b) ((e3) brPaymentLimitsUpdateScreen.O.getValue()).i()).b());
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: wj6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrPaymentLimitsUpdateScreen f297959b;

            {
                this.f297959b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BrPaymentLimitsUpdateScreen brPaymentLimitsUpdateScreen = this.f297959b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BrPaymentLimitsUpdateScreen.U;
                        qji.b bVarU2 = brPaymentLimitsUpdateScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.di.BrPaymentLimitsUpdateScreenInjector");
                        xf6.l lVar = (xf6.l) ((xj6.a) bVarU2).b().mo3808a(brPaymentLimitsUpdateScreen);
                        BrPaymentLimitsUpdateScreenContract$InputData brPaymentLimitsUpdateScreenContract$InputData = brPaymentLimitsUpdateScreen.K;
                        switch (lVar.f304919a) {
                            case 0:
                                brPaymentLimitsUpdateScreenContract$InputData.getClass();
                                lVar.f304921c = brPaymentLimitsUpdateScreenContract$InputData;
                                break;
                            case 1:
                                brPaymentLimitsUpdateScreenContract$InputData.getClass();
                                lVar.f304921c = brPaymentLimitsUpdateScreenContract$InputData;
                                break;
                            default:
                                brPaymentLimitsUpdateScreenContract$InputData.getClass();
                                lVar.f304921c = brPaymentLimitsUpdateScreenContract$InputData;
                                break;
                        }
                        return (e3) lVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = BrPaymentLimitsUpdateScreen.U;
                        e3 e3Var = (e3) brPaymentLimitsUpdateScreen.O.getValue();
                        switch (e3Var.f304838a) {
                            case 0:
                                return (e) e3Var.d.get();
                            case 1:
                                return (e) e3Var.d.get();
                            default:
                                return (e) e3Var.d.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = BrPaymentLimitsUpdateScreen.U;
                        BrPaymentLimitsUpdateScreen brPaymentLimitsUpdateScreen2 = this.f297959b;
                        return dli.f.a(brPaymentLimitsUpdateScreen2, brPaymentLimitsUpdateScreen2.R2(), u.c(brPaymentLimitsUpdateScreen2.T), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = BrPaymentLimitsUpdateScreen.U;
                        return new u80.d(((s80.b) ((e3) brPaymentLimitsUpdateScreen.O.getValue()).i()).b());
                }
            }
        });
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: wj6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrPaymentLimitsUpdateScreen f297959b;

            {
                this.f297959b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                BrPaymentLimitsUpdateScreen brPaymentLimitsUpdateScreen = this.f297959b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BrPaymentLimitsUpdateScreen.U;
                        qji.b bVarU2 = brPaymentLimitsUpdateScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.di.BrPaymentLimitsUpdateScreenInjector");
                        xf6.l lVar = (xf6.l) ((xj6.a) bVarU2).b().mo3808a(brPaymentLimitsUpdateScreen);
                        BrPaymentLimitsUpdateScreenContract$InputData brPaymentLimitsUpdateScreenContract$InputData = brPaymentLimitsUpdateScreen.K;
                        switch (lVar.f304919a) {
                            case 0:
                                brPaymentLimitsUpdateScreenContract$InputData.getClass();
                                lVar.f304921c = brPaymentLimitsUpdateScreenContract$InputData;
                                break;
                            case 1:
                                brPaymentLimitsUpdateScreenContract$InputData.getClass();
                                lVar.f304921c = brPaymentLimitsUpdateScreenContract$InputData;
                                break;
                            default:
                                brPaymentLimitsUpdateScreenContract$InputData.getClass();
                                lVar.f304921c = brPaymentLimitsUpdateScreenContract$InputData;
                                break;
                        }
                        return (e3) lVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = BrPaymentLimitsUpdateScreen.U;
                        e3 e3Var = (e3) brPaymentLimitsUpdateScreen.O.getValue();
                        switch (e3Var.f304838a) {
                            case 0:
                                return (e) e3Var.d.get();
                            case 1:
                                return (e) e3Var.d.get();
                            default:
                                return (e) e3Var.d.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = BrPaymentLimitsUpdateScreen.U;
                        BrPaymentLimitsUpdateScreen brPaymentLimitsUpdateScreen2 = this.f297959b;
                        return dli.f.a(brPaymentLimitsUpdateScreen2, brPaymentLimitsUpdateScreen2.R2(), u.c(brPaymentLimitsUpdateScreen2.T), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = BrPaymentLimitsUpdateScreen.U;
                        return new u80.d(((s80.b) ((e3) brPaymentLimitsUpdateScreen.O.getValue()).i()).b());
                }
            }
        });
        this.S = inputData.f72618a.getF72633a().f115083b;
        this.T = new CenteredAmountDelegate(new f(this, 13));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        wj6.f uiState = (wj6.f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        AnalyticsContext analyticsContext = uiState.f;
        this.L = analyticsContext;
        jii.s sVarD3 = d3();
        sVarD3.f174557b.setEnabled(uiState.d);
        sVarD3.f174557b.setAnalyticsContext(analyticsContext);
        NavBarWithToolbar screenRecyclerNavbarFooterNextbuttonToolbar = sVarD3.e;
        Clause clause = uiState.f297964b;
        screenRecyclerNavbarFooterNextbuttonToolbar.setToolbarTitle(clause);
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonToolbar, "screenRecyclerNavbarFooterNextbuttonToolbar");
        screenRecyclerNavbarFooterNextbuttonToolbar.setTitle(clause, null);
        screenRecyclerNavbarFooterNextbuttonToolbar.setMenuItems(uiState.e);
        sVarD3.f174558c.setTextClause(uiState.f297965c);
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.L = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (e3) this.O.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getL() {
        return this.L;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        jii.s sVarD3 = d3();
        sVarD3.e.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        sVarD3.f174557b.setText(new TextLocalisedClause(R$string.common_action_confirm, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        jii.s sVarD3 = d3();
        ViewController.P2(this, rd0.e.b(sVarD3.e.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(sVarD3.f174557b.o), new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(sVarD3.e.o.f57403b), null, new g(this, (Continuation) null, 26), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.N.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final wj6.e d() {
        return (wj6.e) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
