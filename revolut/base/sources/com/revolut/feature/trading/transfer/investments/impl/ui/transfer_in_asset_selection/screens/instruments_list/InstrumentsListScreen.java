package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.instruments_list;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trading.transfer.investments.impl.R$string;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.instruments_list.InstrumentsListScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.instruments_list.InstrumentsListScreenContract$ScreenConfig;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import java.util.Set;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l9f.b;
import te0.w;
import uwe.f;
import v9f.c;
import v9f.d;
import v9f.i;
import v9f.j;
import v9f.k;
import vc.s;
import xki.e;
import yp0.y;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_in_asset_selection/screens/instruments_list/InstrumentsListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lv9f/i;", "Ldli/a;", "Lv9f/k;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InstrumentsListScreen extends ViewController<i> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(InstrumentsListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final String K;
    public final Set L;
    public final h M;
    public final RowDelegate N;
    public final FullScreenStateDelegate O;
    public final int P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public InstrumentsListScreen(String accountId, Set hiddenInstruments) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(hiddenInstruments, "hiddenInstruments");
        this.K = accountId;
        this.L = hiddenInstruments;
        this.M = s.t(this, c.f);
        this.N = new RowDelegate(null, null, 7);
        this.O = new FullScreenStateDelegate();
        this.P = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: v9f.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstrumentsListScreen f287029b;

            {
                this.f287029b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InstrumentsListScreen instrumentsListScreen = this.f287029b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InstrumentsListScreen.T;
                        qji.b bVarU2 = instrumentsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.instruments_list.di.InstrumentsListScreenInjector");
                        l9f.h hVar = (l9f.h) bVarU2;
                        return new l9f.b(hVar.f193174b, hVar.f193175c, new InstrumentsListScreenContract$ScreenConfig(instrumentsListScreen.K, instrumentsListScreen.L));
                    case 1:
                        KProperty[] kPropertyArr2 = InstrumentsListScreen.T;
                        return (j) ((l9f.b) instrumentsListScreen.Q.getValue()).f193157c.get();
                    default:
                        KProperty[] kPropertyArr3 = InstrumentsListScreen.T;
                        InstrumentsListScreen instrumentsListScreen2 = this.f287029b;
                        return dli.f.a(instrumentsListScreen2, instrumentsListScreen2.d(), v.k(new RowLoadingDelegate(), instrumentsListScreen2.N, instrumentsListScreen2.O), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: v9f.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstrumentsListScreen f287029b;

            {
                this.f287029b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InstrumentsListScreen instrumentsListScreen = this.f287029b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InstrumentsListScreen.T;
                        qji.b bVarU2 = instrumentsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.instruments_list.di.InstrumentsListScreenInjector");
                        l9f.h hVar = (l9f.h) bVarU2;
                        return new l9f.b(hVar.f193174b, hVar.f193175c, new InstrumentsListScreenContract$ScreenConfig(instrumentsListScreen.K, instrumentsListScreen.L));
                    case 1:
                        KProperty[] kPropertyArr2 = InstrumentsListScreen.T;
                        return (j) ((l9f.b) instrumentsListScreen.Q.getValue()).f193157c.get();
                    default:
                        KProperty[] kPropertyArr3 = InstrumentsListScreen.T;
                        InstrumentsListScreen instrumentsListScreen2 = this.f287029b;
                        return dli.f.a(instrumentsListScreen2, instrumentsListScreen2.d(), v.k(new RowLoadingDelegate(), instrumentsListScreen2.N, instrumentsListScreen2.O), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: v9f.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstrumentsListScreen f287029b;

            {
                this.f287029b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InstrumentsListScreen instrumentsListScreen = this.f287029b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InstrumentsListScreen.T;
                        qji.b bVarU2 = instrumentsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.instruments_list.di.InstrumentsListScreenInjector");
                        l9f.h hVar = (l9f.h) bVarU2;
                        return new l9f.b(hVar.f193174b, hVar.f193175c, new InstrumentsListScreenContract$ScreenConfig(instrumentsListScreen.K, instrumentsListScreen.L));
                    case 1:
                        KProperty[] kPropertyArr2 = InstrumentsListScreen.T;
                        return (j) ((l9f.b) instrumentsListScreen.Q.getValue()).f193157c.get();
                    default:
                        KProperty[] kPropertyArr3 = InstrumentsListScreen.T;
                        InstrumentsListScreen instrumentsListScreen2 = this.f287029b;
                        return dli.f.a(instrumentsListScreen2, instrumentsListScreen2.d(), v.k(new RowLoadingDelegate(), instrumentsListScreen2.N, instrumentsListScreen2.O), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((k) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.j0(false);
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.trading_stocks_transfer_in_broker_search, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.trading_stocks_transfer_in_assets_picker_header_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.trading_stocks_transfer_in_assets_picker_header_title, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        ScreenContentRecyclerView recyclerView = d3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        y.g(recyclerView, m2());
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.K0(j4.NO_ANIMATION);
        navBarWithToolbar.post(new cgd.e(navBarWithToolbar, 5));
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new f(this, null, 12), 3);
        ViewController.P2(this, vkm.q.q(rd0.e.b(navBarWithToolbar.f59409p.f57337m)), new v44.e(this, null, 12), 3);
        ViewController.P2(this, rd0.e.b(this.N.f53218h), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new v9f.e(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j d() {
        return (j) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
