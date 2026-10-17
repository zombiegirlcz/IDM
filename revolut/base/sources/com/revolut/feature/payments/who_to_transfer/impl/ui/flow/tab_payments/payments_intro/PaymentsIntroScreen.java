package com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainerHeaderView;
import com.revolut.feature.payments.who_to_transfer.impl.R$id;
import com.revolut.feature.payments.who_to_transfer.impl.R$layout;
import com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.PaymentsIntroScreen;
import com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.PaymentsIntroScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import fnc.s;
import hx0.d0;
import java.util.List;
import jji.h;
import jji.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l5a.f;
import l5a.i;
import l5a.j;
import l5a.m;
import l5a.p;
import r10.v;
import s3a.g;
import te0.w;
import tx0.t2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/ui/flow/tab_payments/payments_intro/PaymentsIntroScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/payments/who_to_transfer/impl/ui/flow/tab_payments/payments_intro/a;", "Ldli/a;", "Ll5a/p;", "Lhx0/d0;", "Ljji/h;", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentsIntroScreen extends ViewController<a> implements dli.a, d0, h {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(PaymentsIntroScreen.class, "binding", "getBinding()Lcom/revolut/feature/payments/who_to_transfer/impl/databinding/ScreenPaymentsIntroBinding;", 0))};
    public final PaymentsIntroScreenContract$InputData K;
    public final s L;
    public final int M;
    public final FullScreenStateDelegate N;
    public final Object O;
    public final ao.h P;
    public final Object Q;
    public final Object R;

    public PaymentsIntroScreen(PaymentsIntroScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new s(new u(this));
        this.M = R$layout.screen_payments_intro;
        this.N = new FullScreenStateDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: l5a.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentsIntroScreen f192200b;

            {
                this.f192200b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PaymentsIntroScreen paymentsIntroScreen = this.f192200b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentsIntroScreen.S;
                        PaymentsIntroScreen paymentsIntroScreen2 = this.f192200b;
                        return dli.f.a(paymentsIntroScreen2, paymentsIntroScreen2.R2(), zhm.d0.E0(((fd6.a) ((s3a.g) paymentsIntroScreen2.Q.getValue()).d.get()).e, zhm.v.k(new RowDelegate(null, null, 7), paymentsIntroScreen2.N, new FullScreenStateLoadingDelegate())), R$id.transferScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentsIntroScreen.S;
                        qji.b bVarU2 = paymentsIntroScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.di.PaymentsIntroScreenInjector");
                        s3a.j jVar = (s3a.j) bVarU2;
                        s3a.k kVar = jVar.f259523b;
                        s3a.j jVar2 = jVar.f259524c;
                        PaymentsIntroScreenContract$InputData paymentsIntroScreenContract$InputData = paymentsIntroScreen.K;
                        paymentsIntroScreenContract$InputData.getClass();
                        return new s3a.g(kVar, jVar2, paymentsIntroScreen, paymentsIntroScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PaymentsIntroScreen.S;
                        return (o) ((s3a.g) paymentsIntroScreen.Q.getValue()).f259515j.get();
                }
            }
        });
        this.P = vc.s.t(this, f.f);
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: l5a.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentsIntroScreen f192200b;

            {
                this.f192200b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PaymentsIntroScreen paymentsIntroScreen = this.f192200b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentsIntroScreen.S;
                        PaymentsIntroScreen paymentsIntroScreen2 = this.f192200b;
                        return dli.f.a(paymentsIntroScreen2, paymentsIntroScreen2.R2(), zhm.d0.E0(((fd6.a) ((s3a.g) paymentsIntroScreen2.Q.getValue()).d.get()).e, zhm.v.k(new RowDelegate(null, null, 7), paymentsIntroScreen2.N, new FullScreenStateLoadingDelegate())), R$id.transferScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentsIntroScreen.S;
                        qji.b bVarU2 = paymentsIntroScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.di.PaymentsIntroScreenInjector");
                        s3a.j jVar = (s3a.j) bVarU2;
                        s3a.k kVar = jVar.f259523b;
                        s3a.j jVar2 = jVar.f259524c;
                        PaymentsIntroScreenContract$InputData paymentsIntroScreenContract$InputData = paymentsIntroScreen.K;
                        paymentsIntroScreenContract$InputData.getClass();
                        return new s3a.g(kVar, jVar2, paymentsIntroScreen, paymentsIntroScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PaymentsIntroScreen.S;
                        return (o) ((s3a.g) paymentsIntroScreen.Q.getValue()).f259515j.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: l5a.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentsIntroScreen f192200b;

            {
                this.f192200b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PaymentsIntroScreen paymentsIntroScreen = this.f192200b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentsIntroScreen.S;
                        PaymentsIntroScreen paymentsIntroScreen2 = this.f192200b;
                        return dli.f.a(paymentsIntroScreen2, paymentsIntroScreen2.R2(), zhm.d0.E0(((fd6.a) ((s3a.g) paymentsIntroScreen2.Q.getValue()).d.get()).e, zhm.v.k(new RowDelegate(null, null, 7), paymentsIntroScreen2.N, new FullScreenStateLoadingDelegate())), R$id.transferScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentsIntroScreen.S;
                        qji.b bVarU2 = paymentsIntroScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.di.PaymentsIntroScreenInjector");
                        s3a.j jVar = (s3a.j) bVarU2;
                        s3a.k kVar = jVar.f259523b;
                        s3a.j jVar2 = jVar.f259524c;
                        PaymentsIntroScreenContract$InputData paymentsIntroScreenContract$InputData = paymentsIntroScreen.K;
                        paymentsIntroScreenContract$InputData.getClass();
                        return new s3a.g(kVar, jVar2, paymentsIntroScreen, paymentsIntroScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PaymentsIntroScreen.S;
                        return (o) ((s3a.g) paymentsIntroScreen.Q.getValue()).f259515j.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        m mVar = uiState.f192213a;
        q3a.a aVarD3 = d3();
        NavBarWithContainer navBarWithContainer = aVarD3.f241917c;
        List<? extends NavBarMenuItem> list = mVar.f192209b;
        navBarWithContainer.setMenuItems(list);
        ((vqi.a) ((g) this.Q.getValue()).f259511b.f259540n0.get()).b(list);
        NavBarWithContainer navBarWithContainer2 = aVarD3.f241917c;
        navBarWithContainer2.setSearchButtonText(mVar.f192210c);
        navBarWithContainer2.setMessage(mVar.f192211g);
        i5a.a aVar = mVar.f192208a;
        if (aVar != null) {
            navBarWithContainer2.setAvatar(new t2(aVar.f158791b, mVar.f));
        }
        aVarD3.f241916b.setModel(mVar.e);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        q3a.a aVarD3 = d3();
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(aVarD3.f241917c.b()), null, new l5a.g(this, null, 0), 3);
        NavBarWithContainer navBarWithContainer = aVarD3.f241917c;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithContainer.D()), null, new l5a.h(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithContainer.F()), null, new l5a.h(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithContainer.L()), null, new l5a.h(this, continuation, 2), 3);
        v vVar = navBarWithContainer.f59369w;
        vVar.c();
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((NavBarWithContainerHeaderView) ((ViewGroup) vVar.f250864c)).f59386m.f59003n), null, new l5a.g(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(aVarD3.f241916b.j()), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f52371h.f121375b), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f241917c.H()), null, new l5a.g(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f241917c.I()), null, new l5a.g(this, null, 3), 3);
    }

    public final q3a.a d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (q3a.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l5a.o R2() {
        return (l5a.o) this.R.getValue();
    }

    @Override // jji.h
    public final NavBarWithContainer f() {
        NavBarWithContainer transferScreenNavBarWithContainer = d3().f241917c;
        Intrinsics.checkNotNullExpressionValue(transferScreenNavBarWithContainer, "transferScreenNavBarWithContainer");
        return transferScreenNavBarWithContainer;
    }

    @Override // jji.h
    public final View getContent() {
        ScreenContentRecyclerView transferScreenRecyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(transferScreenRecyclerView, "transferScreenRecyclerView");
        return transferScreenRecyclerView;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }

    @Override // hx0.d0
    /* JADX INFO: renamed from: k1, reason: from getter */
    public final s getL() {
        return this.L;
    }

    @Override // jji.h
    public final View v() {
        ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = d3().f241915a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerCoordinatorLayout, "getRoot(...)");
        return hx0.h.b(controllerContainerCoordinatorLayout);
    }
}
