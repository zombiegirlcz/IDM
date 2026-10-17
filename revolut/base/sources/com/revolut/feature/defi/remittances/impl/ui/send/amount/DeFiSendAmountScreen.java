package com.revolut.feature.defi.remittances.impl.ui.send.amount;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.feature.defi.remittances.impl.ui.send.amount.DeFiSendAmountScreen;
import com.revolut.feature.defi.remittances.impl.ui.send.amount.DeFiSendAmountScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import g56.f;
import h30.l;
import jii.b0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import s56.g;
import s56.i;
import s56.j;
import s56.k;
import s56.r;
import s56.t;
import s56.u;
import s56.v;
import te0.w;
import vc.s;
import vkm.z1;
import xki.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/defi/remittances/impl/ui/send/amount/DeFiSendAmountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ls56/r;", "Ldli/a;", "Ls56/w;", "feature_defi_remittances_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeFiSendAmountScreen extends ViewController<r> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(DeFiSendAmountScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithavatarNextbuttonBinding;", 0))};
    public final DeFiSendAmountScreenContract$InputData K;
    public final h L;
    public final int M;
    public final z1 N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public DeFiSendAmountScreen(DeFiSendAmountScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, s56.b.f);
        this.M = R$layout.screen_recycler_navbarwithavatar_nextbutton;
        this.N = ta6.a.a(0);
        this.O = w.y0(new s1g.a(13));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: s56.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiSendAmountScreen f259931b;

            {
                this.f259931b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DeFiSendAmountScreen deFiSendAmountScreen = this.f259931b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiSendAmountScreen.U;
                        return new CenteredAmountDelegate(new s42.f(deFiSendAmountScreen, 5));
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiSendAmountScreen.U;
                        DeFiSendAmountScreen deFiSendAmountScreen2 = this.f259931b;
                        return dli.f.a(deFiSendAmountScreen2, deFiSendAmountScreen2.d(), zhm.v.k((CellDetailsDelegate) deFiSendAmountScreen2.Q.getValue(), new CellDetailsLoadingDelegate(), (CenteredAmountDelegate) deFiSendAmountScreen2.P.getValue(), (FullScreenStateDelegate) deFiSendAmountScreen2.O.getValue()), deFiSendAmountScreen2.d3().d.getId(), null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = DeFiSendAmountScreen.U;
                        qji.b bVarR1 = deFiSendAmountScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.defi.remittances.impl.ui.send.amount.di.DeFiSendAmountScreenComponentInjector");
                        g56.g gVar = (g56.g) bVarR1;
                        g56.d dVar = gVar.f140655b;
                        g56.g gVar2 = gVar.f140656c;
                        DeFiSendAmountScreenContract$InputData deFiSendAmountScreenContract$InputData = deFiSendAmountScreen.K;
                        deFiSendAmountScreenContract$InputData.getClass();
                        return new g56.f(dVar, gVar2, deFiSendAmountScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = DeFiSendAmountScreen.U;
                        return (t) ((g56.f) deFiSendAmountScreen.S.getValue()).f140653c.get();
                }
            }
        });
        this.Q = w.y0(new s1g.a(14));
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: s56.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiSendAmountScreen f259931b;

            {
                this.f259931b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DeFiSendAmountScreen deFiSendAmountScreen = this.f259931b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiSendAmountScreen.U;
                        return new CenteredAmountDelegate(new s42.f(deFiSendAmountScreen, 5));
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiSendAmountScreen.U;
                        DeFiSendAmountScreen deFiSendAmountScreen2 = this.f259931b;
                        return dli.f.a(deFiSendAmountScreen2, deFiSendAmountScreen2.d(), zhm.v.k((CellDetailsDelegate) deFiSendAmountScreen2.Q.getValue(), new CellDetailsLoadingDelegate(), (CenteredAmountDelegate) deFiSendAmountScreen2.P.getValue(), (FullScreenStateDelegate) deFiSendAmountScreen2.O.getValue()), deFiSendAmountScreen2.d3().d.getId(), null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = DeFiSendAmountScreen.U;
                        qji.b bVarR1 = deFiSendAmountScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.defi.remittances.impl.ui.send.amount.di.DeFiSendAmountScreenComponentInjector");
                        g56.g gVar = (g56.g) bVarR1;
                        g56.d dVar = gVar.f140655b;
                        g56.g gVar2 = gVar.f140656c;
                        DeFiSendAmountScreenContract$InputData deFiSendAmountScreenContract$InputData = deFiSendAmountScreen.K;
                        deFiSendAmountScreenContract$InputData.getClass();
                        return new g56.f(dVar, gVar2, deFiSendAmountScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = DeFiSendAmountScreen.U;
                        return (t) ((g56.f) deFiSendAmountScreen.S.getValue()).f140653c.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: s56.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiSendAmountScreen f259931b;

            {
                this.f259931b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DeFiSendAmountScreen deFiSendAmountScreen = this.f259931b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiSendAmountScreen.U;
                        return new CenteredAmountDelegate(new s42.f(deFiSendAmountScreen, 5));
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiSendAmountScreen.U;
                        DeFiSendAmountScreen deFiSendAmountScreen2 = this.f259931b;
                        return dli.f.a(deFiSendAmountScreen2, deFiSendAmountScreen2.d(), zhm.v.k((CellDetailsDelegate) deFiSendAmountScreen2.Q.getValue(), new CellDetailsLoadingDelegate(), (CenteredAmountDelegate) deFiSendAmountScreen2.P.getValue(), (FullScreenStateDelegate) deFiSendAmountScreen2.O.getValue()), deFiSendAmountScreen2.d3().d.getId(), null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = DeFiSendAmountScreen.U;
                        qji.b bVarR1 = deFiSendAmountScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.defi.remittances.impl.ui.send.amount.di.DeFiSendAmountScreenComponentInjector");
                        g56.g gVar = (g56.g) bVarR1;
                        g56.d dVar = gVar.f140655b;
                        g56.g gVar2 = gVar.f140656c;
                        DeFiSendAmountScreenContract$InputData deFiSendAmountScreenContract$InputData = deFiSendAmountScreen.K;
                        deFiSendAmountScreenContract$InputData.getClass();
                        return new g56.f(dVar, gVar2, deFiSendAmountScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = DeFiSendAmountScreen.U;
                        return (t) ((g56.f) deFiSendAmountScreen.S.getValue()).f140653c.get();
                }
            }
        });
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: s56.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeFiSendAmountScreen f259931b;

            {
                this.f259931b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                DeFiSendAmountScreen deFiSendAmountScreen = this.f259931b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DeFiSendAmountScreen.U;
                        return new CenteredAmountDelegate(new s42.f(deFiSendAmountScreen, 5));
                    case 1:
                        KProperty[] kPropertyArr2 = DeFiSendAmountScreen.U;
                        DeFiSendAmountScreen deFiSendAmountScreen2 = this.f259931b;
                        return dli.f.a(deFiSendAmountScreen2, deFiSendAmountScreen2.d(), zhm.v.k((CellDetailsDelegate) deFiSendAmountScreen2.Q.getValue(), new CellDetailsLoadingDelegate(), (CenteredAmountDelegate) deFiSendAmountScreen2.P.getValue(), (FullScreenStateDelegate) deFiSendAmountScreen2.O.getValue()), deFiSendAmountScreen2.d3().d.getId(), null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = DeFiSendAmountScreen.U;
                        qji.b bVarR1 = deFiSendAmountScreen.z2().R1();
                        Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.feature.defi.remittances.impl.ui.send.amount.di.DeFiSendAmountScreenComponentInjector");
                        g56.g gVar = (g56.g) bVarR1;
                        g56.d dVar = gVar.f140655b;
                        g56.g gVar2 = gVar.f140656c;
                        DeFiSendAmountScreenContract$InputData deFiSendAmountScreenContract$InputData = deFiSendAmountScreen.K;
                        deFiSendAmountScreenContract$InputData.getClass();
                        return new g56.f(dVar, gVar2, deFiSendAmountScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = DeFiSendAmountScreen.U;
                        return (t) ((g56.f) deFiSendAmountScreen.S.getValue()).f140653c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        s56.w uiState = (s56.w) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithAvatar navBarWithAvatar = d3().f174500c;
        v vVar = uiState.f260002b;
        navBarWithAvatar.setToolbarTitle(vVar.f259996a);
        navBarWithAvatar.setToolbarDescription(vVar.f259997b);
        navBarWithAvatar.setAvatarImage(vVar.f259998c);
        LargeActionButton largeActionButton = d3().f174499b;
        u uVar = uiState.f260003c;
        largeActionButton.setText(uVar.f259991a);
        largeActionButton.setEnabled(uVar.f259992b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174500c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174500c.f59338a), new s56.e(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174500c.f59339b), new s56.e(this, continuation, 2), 3);
        ViewController.P2(this, this.N, new s56.f(this, null), 3);
        ?? r62 = this.P;
        ViewController.P2(this, rd0.e.b(((CenteredAmountDelegate) r62.getValue()).e.f121375b), new g(this, null), 3);
        ViewController.P2(this, l.y(((CenteredAmountDelegate) r62.getValue()).f51965h.f121375b, ((CenteredAmountDelegate) r62.getValue()).i.f121375b, "merge(...)"), new s56.h(this, null), 3);
        int i = 0;
        ViewController.P2(this, new ryj.w(rd0.e.b(((CenteredAmountDelegate) r62.getValue()).f.f121375b), 10), new i(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.O.getValue()).f52371h.f121375b), new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(((CellDetailsDelegate) this.Q.getValue()).f), new k(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174499b.o), new s56.e(this, continuation, i), 3);
    }

    public final b0 d3() {
        ViewBinding value = this.L.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (b0) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final t d() {
        return (t) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
