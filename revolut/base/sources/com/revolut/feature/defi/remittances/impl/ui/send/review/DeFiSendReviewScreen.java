package com.revolut.feature.defi.remittances.impl.ui.send.review;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.defi.remittances.impl.ui.send.review.DeFiSendReviewScreen;
import com.revolut.feature.defi.remittances.impl.ui.send.review.DeFiSendReviewScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import vo8.b;
import w56.c;
import w56.d;
import w56.f;
import w56.j;
import w56.k;
import w56.p;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/defi/remittances/impl/ui/send/review/DeFiSendReviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lw56/j;", "Ldli/a;", "Lw56/k;", "feature_defi_remittances_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeFiSendReviewScreen extends ViewController<j> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(DeFiSendReviewScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final DeFiSendReviewScreenContract$InputData K;
    public final h L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public DeFiSendReviewScreen(DeFiSendReviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, c.f);
        this.M = R$layout.screen_recycler_navbar_action_footer;
        this.N = w.y0(new b(29));
        final int i = 0;
        this.O = w.y0(new w56.a(0));
        this.P = w.y0(new Function0(this) { // from class: w56.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiSendReviewScreen f294700b;

            {
                this.f294700b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DeFiSendReviewScreen deFiSendReviewScreen = this.f294700b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiSendReviewScreen.S;
                        DeFiSendReviewScreen deFiSendReviewScreen2 = this.f294700b;
                        return dli.f.a(deFiSendReviewScreen2, deFiSendReviewScreen2.R2(), v.k(new CellDetailsDelegate(), new CounterTextDelegate(), (FullScreenStateDelegate) deFiSendReviewScreen2.N.getValue(), (RowDelegate) deFiSendReviewScreen2.O.getValue(), new RowLoadingDelegate()), deFiSendReviewScreen2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiSendReviewScreen.S;
                        qji.b bVarR1 = deFiSendReviewScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.defi.remittances.impl.ui.send.review.di.DeFiSendReviewScreenComponentInjector");
                        g56.g gVar = (g56.g) bVarR1;
                        g56.d dVar = gVar.f140655b;
                        g56.g gVar2 = gVar.f140656c;
                        DeFiSendReviewScreenContract$InputData deFiSendReviewScreenContract$InputData = deFiSendReviewScreen.K;
                        deFiSendReviewScreenContract$InputData.getClass();
                        return new g56.h(dVar, gVar2, deFiSendReviewScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = DeFiSendReviewScreen.S;
                        return (p) ((g56.h) deFiSendReviewScreen.Q.getValue()).f140659c.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: w56.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiSendReviewScreen f294700b;

            {
                this.f294700b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DeFiSendReviewScreen deFiSendReviewScreen = this.f294700b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiSendReviewScreen.S;
                        DeFiSendReviewScreen deFiSendReviewScreen2 = this.f294700b;
                        return dli.f.a(deFiSendReviewScreen2, deFiSendReviewScreen2.R2(), v.k(new CellDetailsDelegate(), new CounterTextDelegate(), (FullScreenStateDelegate) deFiSendReviewScreen2.N.getValue(), (RowDelegate) deFiSendReviewScreen2.O.getValue(), new RowLoadingDelegate()), deFiSendReviewScreen2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiSendReviewScreen.S;
                        qji.b bVarR1 = deFiSendReviewScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.defi.remittances.impl.ui.send.review.di.DeFiSendReviewScreenComponentInjector");
                        g56.g gVar = (g56.g) bVarR1;
                        g56.d dVar = gVar.f140655b;
                        g56.g gVar2 = gVar.f140656c;
                        DeFiSendReviewScreenContract$InputData deFiSendReviewScreenContract$InputData = deFiSendReviewScreen.K;
                        deFiSendReviewScreenContract$InputData.getClass();
                        return new g56.h(dVar, gVar2, deFiSendReviewScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = DeFiSendReviewScreen.S;
                        return (p) ((g56.h) deFiSendReviewScreen.Q.getValue()).f140659c.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: w56.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiSendReviewScreen f294700b;

            {
                this.f294700b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DeFiSendReviewScreen deFiSendReviewScreen = this.f294700b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiSendReviewScreen.S;
                        DeFiSendReviewScreen deFiSendReviewScreen2 = this.f294700b;
                        return dli.f.a(deFiSendReviewScreen2, deFiSendReviewScreen2.R2(), v.k(new CellDetailsDelegate(), new CounterTextDelegate(), (FullScreenStateDelegate) deFiSendReviewScreen2.N.getValue(), (RowDelegate) deFiSendReviewScreen2.O.getValue(), new RowLoadingDelegate()), deFiSendReviewScreen2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiSendReviewScreen.S;
                        qji.b bVarR1 = deFiSendReviewScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.defi.remittances.impl.ui.send.review.di.DeFiSendReviewScreenComponentInjector");
                        g56.g gVar = (g56.g) bVarR1;
                        g56.d dVar = gVar.f140655b;
                        g56.g gVar2 = gVar.f140656c;
                        DeFiSendReviewScreenContract$InputData deFiSendReviewScreenContract$InputData = deFiSendReviewScreen.K;
                        deFiSendReviewScreenContract$InputData.getClass();
                        return new g56.h(dVar, gVar2, deFiSendReviewScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = DeFiSendReviewScreen.S;
                        return (p) ((g56.h) deFiSendReviewScreen.Q.getValue()).f140659c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar screenRecyclerNavbarActionFooterNavBar = d3().f174534c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterNavBar, "screenRecyclerNavbarActionFooterNavBar");
        screenRecyclerNavbarActionFooterNavBar.setTitle(uiState.f294707b, null);
        d3().f174533b.setModel(uiState.f294708c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g56.h) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174534c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new d(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new d(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.O.getValue()).f53218h), new w56.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.N.getValue()).f52371h.f121375b), new f(this, null), 3);
    }

    public final jii.k d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final p R2() {
        return (p) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
