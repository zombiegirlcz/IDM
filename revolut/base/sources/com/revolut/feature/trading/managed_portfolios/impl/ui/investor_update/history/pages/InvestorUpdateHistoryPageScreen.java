package com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.pages;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceLoadingDelegate;
import com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.pages.InvestorUpdateHistoryPageScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.pages.InvestorUpdateHistoryPageScreenContract$InputData;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l7f.e;
import n7f.h;
import n7f.i;
import pki.b;
import te0.w;
import w5f.c;
import w5f.m;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/investor_update/history/pages/InvestorUpdateHistoryPageScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ll7f/e;", "Ldli/a;", "Ln7f/i;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvestorUpdateHistoryPageScreen extends ViewController<e> implements dli.a {
    public final InvestorUpdateHistoryPageScreenContract$InputData K;
    public final int L;
    public final SingleChoiceDelegate M;
    public final FullScreenStateDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public InvestorUpdateHistoryPageScreen(InvestorUpdateHistoryPageScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_view;
        this.M = new SingleChoiceDelegate();
        this.N = new FullScreenStateDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: n7f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestorUpdateHistoryPageScreen f213081b;

            {
                this.f213081b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InvestorUpdateHistoryPageScreen investorUpdateHistoryPageScreen = this.f213081b;
                switch (i2) {
                    case 0:
                        InvestorUpdateHistoryPageScreen investorUpdateHistoryPageScreen2 = this.f213081b;
                        return dli.f.a(investorUpdateHistoryPageScreen2, (h) investorUpdateHistoryPageScreen2.Q.getValue(), v.k(investorUpdateHistoryPageScreen2.M, new SingleChoiceLoadingDelegate(), investorUpdateHistoryPageScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        qji.b bVarU2 = investorUpdateHistoryPageScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.pages.di.InvestorUpdateHistoryPageScreenInjector");
                        w5f.b bVar = (w5f.b) bVarU2;
                        m mVar = bVar.f295115b;
                        w5f.b bVar2 = bVar.f295116c;
                        InvestorUpdateHistoryPageScreenContract$InputData investorUpdateHistoryPageScreenContract$InputData = investorUpdateHistoryPageScreen.K;
                        investorUpdateHistoryPageScreenContract$InputData.getClass();
                        return new w5f.c(mVar, bVar2, investorUpdateHistoryPageScreenContract$InputData);
                    default:
                        return (h) ((w5f.c) investorUpdateHistoryPageScreen.P.getValue()).f295121b.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: n7f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestorUpdateHistoryPageScreen f213081b;

            {
                this.f213081b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InvestorUpdateHistoryPageScreen investorUpdateHistoryPageScreen = this.f213081b;
                switch (i22) {
                    case 0:
                        InvestorUpdateHistoryPageScreen investorUpdateHistoryPageScreen2 = this.f213081b;
                        return dli.f.a(investorUpdateHistoryPageScreen2, (h) investorUpdateHistoryPageScreen2.Q.getValue(), v.k(investorUpdateHistoryPageScreen2.M, new SingleChoiceLoadingDelegate(), investorUpdateHistoryPageScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        qji.b bVarU2 = investorUpdateHistoryPageScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.pages.di.InvestorUpdateHistoryPageScreenInjector");
                        w5f.b bVar = (w5f.b) bVarU2;
                        m mVar = bVar.f295115b;
                        w5f.b bVar2 = bVar.f295116c;
                        InvestorUpdateHistoryPageScreenContract$InputData investorUpdateHistoryPageScreenContract$InputData = investorUpdateHistoryPageScreen.K;
                        investorUpdateHistoryPageScreenContract$InputData.getClass();
                        return new w5f.c(mVar, bVar2, investorUpdateHistoryPageScreenContract$InputData);
                    default:
                        return (h) ((w5f.c) investorUpdateHistoryPageScreen.P.getValue()).f295121b.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: n7f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestorUpdateHistoryPageScreen f213081b;

            {
                this.f213081b = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InvestorUpdateHistoryPageScreen investorUpdateHistoryPageScreen = this.f213081b;
                switch (i22) {
                    case 0:
                        InvestorUpdateHistoryPageScreen investorUpdateHistoryPageScreen2 = this.f213081b;
                        return dli.f.a(investorUpdateHistoryPageScreen2, (h) investorUpdateHistoryPageScreen2.Q.getValue(), v.k(investorUpdateHistoryPageScreen2.M, new SingleChoiceLoadingDelegate(), investorUpdateHistoryPageScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        qji.b bVarU2 = investorUpdateHistoryPageScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.pages.di.InvestorUpdateHistoryPageScreenInjector");
                        w5f.b bVar = (w5f.b) bVarU2;
                        m mVar = bVar.f295115b;
                        w5f.b bVar2 = bVar.f295116c;
                        InvestorUpdateHistoryPageScreenContract$InputData investorUpdateHistoryPageScreenContract$InputData = investorUpdateHistoryPageScreen.K;
                        investorUpdateHistoryPageScreenContract$InputData.getClass();
                        return new w5f.c(mVar, bVar2, investorUpdateHistoryPageScreenContract$InputData);
                    default:
                        return (h) ((w5f.c) investorUpdateHistoryPageScreen.P.getValue()).f295121b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((i) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b e3() {
        return (h) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.M.p()), new n7f.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new n7f.c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
