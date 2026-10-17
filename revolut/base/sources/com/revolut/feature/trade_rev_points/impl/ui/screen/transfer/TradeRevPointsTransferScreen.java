package com.revolut.feature.trade_rev_points.impl.ui.screen.transfer;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.q;
import com.revolut.core.ui_kit.delegates.AmountDualEditDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trade_rev_points.api.R$string;
import com.revolut.feature.trade_rev_points.impl.R$id;
import com.revolut.feature.trade_rev_points.impl.R$layout;
import com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.TradeRevPointsTransferScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lk7.n;
import ltf.b;
import m2f.f;
import m2f.i;
import m2f.j;
import m2f.k;
import m2f.o;
import m2f.p;
import m2f.r;
import t1f.l;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trade_rev_points/impl/ui/screen/transfer/TradeRevPointsTransferScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lm2f/o;", "Ldli/a;", "Lm2f/r;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TradeRevPointsTransferScreen extends ViewController<o> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(TradeRevPointsTransferScreen.class, "binding", "getBinding()Lcom/revolut/feature/trade_rev_points/impl/databinding/ScreenRevpointsTransferBinding;", 0))};
    public final h K;
    public final FullScreenStateDelegate L;
    public final AmountDualEditDelegate M;
    public final RowDelegate N;
    public final Object O;
    public final int P;
    public final boolean Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public TradeRevPointsTransferScreen(TradeRevPointsTransferScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, f.f);
        this.L = new FullScreenStateDelegate();
        this.M = new AmountDualEditDelegate(new n(this, 15));
        this.N = new RowDelegate(null, null, 7);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: m2f.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradeRevPointsTransferScreen f201970b;

            {
                this.f201970b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TradeRevPointsTransferScreen tradeRevPointsTransferScreen = this.f201970b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TradeRevPointsTransferScreen.U;
                        return tradeRevPointsTransferScreen.d3().f241432c.A.V();
                    case 1:
                        KProperty[] kPropertyArr2 = TradeRevPointsTransferScreen.U;
                        TradeRevPointsTransferScreen tradeRevPointsTransferScreen2 = this.f201970b;
                        return dli.f.a(tradeRevPointsTransferScreen2, tradeRevPointsTransferScreen2.R2(), zhm.v.k(tradeRevPointsTransferScreen2.L, tradeRevPointsTransferScreen2.M, tradeRevPointsTransferScreen2.N), R$id.revPointsTransfer_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = TradeRevPointsTransferScreen.U;
                        return (q) ((t1f.l) tradeRevPointsTransferScreen.S.getValue()).i.get();
                }
            }
        });
        this.P = R$layout.screen_revpoints_transfer;
        this.Q = true;
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: m2f.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradeRevPointsTransferScreen f201970b;

            {
                this.f201970b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TradeRevPointsTransferScreen tradeRevPointsTransferScreen = this.f201970b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TradeRevPointsTransferScreen.U;
                        return tradeRevPointsTransferScreen.d3().f241432c.A.V();
                    case 1:
                        KProperty[] kPropertyArr2 = TradeRevPointsTransferScreen.U;
                        TradeRevPointsTransferScreen tradeRevPointsTransferScreen2 = this.f201970b;
                        return dli.f.a(tradeRevPointsTransferScreen2, tradeRevPointsTransferScreen2.R2(), zhm.v.k(tradeRevPointsTransferScreen2.L, tradeRevPointsTransferScreen2.M, tradeRevPointsTransferScreen2.N), R$id.revPointsTransfer_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = TradeRevPointsTransferScreen.U;
                        return (q) ((t1f.l) tradeRevPointsTransferScreen.S.getValue()).i.get();
                }
            }
        });
        this.S = w.y0(new b(this, inputData, 11));
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: m2f.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradeRevPointsTransferScreen f201970b;

            {
                this.f201970b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TradeRevPointsTransferScreen tradeRevPointsTransferScreen = this.f201970b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TradeRevPointsTransferScreen.U;
                        return tradeRevPointsTransferScreen.d3().f241432c.A.V();
                    case 1:
                        KProperty[] kPropertyArr2 = TradeRevPointsTransferScreen.U;
                        TradeRevPointsTransferScreen tradeRevPointsTransferScreen2 = this.f201970b;
                        return dli.f.a(tradeRevPointsTransferScreen2, tradeRevPointsTransferScreen2.R2(), zhm.v.k(tradeRevPointsTransferScreen2.L, tradeRevPointsTransferScreen2.M, tradeRevPointsTransferScreen2.N), R$id.revPointsTransfer_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = TradeRevPointsTransferScreen.U;
                        return (q) ((t1f.l) tradeRevPointsTransferScreen.S.getValue()).i.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        r uiState = (r) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        p pVar = qVar instanceof p ? (p) qVar : null;
        if (pVar == null || pVar.f201988b) {
            LargeActionButton largeActionButton = d3().f241432c;
            k kVar = uiState.f201991c;
            largeActionButton.setEnabled(kVar.f201974b);
            largeActionButton.setText(kVar.f201973a);
            ((rr0.f) ((sy0.b) this.O.getValue())).b(kVar.f201975c);
        }
        if (pVar == null || pVar.f201987a) {
            d3().f241431b.setToolbarDescription(uiState.f201990b);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithAvatar navBarWithAvatar = d3().f241431b;
        navBarWithAvatar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_arrow_thin_left));
        navBarWithAvatar.setToolbarTitle(new TextLocalisedClause(R$string.trade_rev_points_transfer_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f241431b.f59338a), new m2f.h(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f241432c.o), new m2f.h(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.L.f52371h.f121375b), new i(this, null), 3);
        AmountDualEditDelegate amountDualEditDelegate = this.M;
        ViewController.P2(this, rd0.e.b(amountDualEditDelegate.e.f121375b), new m2f.h(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(amountDualEditDelegate.k.f121375b), new m2f.h(this, continuation, 3), 3);
        ViewController.P2(this, rd0.e.b(amountDualEditDelegate.f51618n.f121375b), new m2f.h(this, continuation, 4), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53218h), new j(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f241431b.f59343j), new m2f.h(this, continuation, 5), 3);
    }

    public final q1f.a d3() {
        ViewBinding value = this.K.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (q1f.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final m2f.q d() {
        return (m2f.q) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.Q);
    }
}
