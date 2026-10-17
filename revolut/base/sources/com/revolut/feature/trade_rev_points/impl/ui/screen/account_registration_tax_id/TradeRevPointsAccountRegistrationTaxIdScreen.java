package com.revolut.feature.trade_rev_points.impl.ui.screen.account_registration_tax_id;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c1i.f;
import c2f.b;
import c2f.c;
import c2f.g;
import c2f.i;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.trade_rev_points.impl.ui.screen.account_registration_tax_id.TradeRevPointsAccountRegistrationTaxIdScreen;
import com.revolut.feature.trade_rev_points.impl.ui.screen.account_registration_tax_id.TradeRevPointsAccountRegistrationTaxIdScreenContract$InputData;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.kompot.common.R$id;
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
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trade_rev_points/impl/ui/screen/account_registration_tax_id/TradeRevPointsAccountRegistrationTaxIdScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lc2f/g;", "Ldli/a;", "Lc2f/i;", "feature_trade_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TradeRevPointsAccountRegistrationTaxIdScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TradeRevPointsAccountRegistrationTaxIdScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetNextbuttonBinding;", 0))};
    public final TradeRevPointsAccountRegistrationTaxIdScreenContract$InputData K;
    public final int L;
    public final h M;
    public final FullScreenStateDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public TradeRevPointsAccountRegistrationTaxIdScreen(TradeRevPointsAccountRegistrationTaxIdScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet_nextbutton;
        this.M = s.t(this, b.f);
        this.N = new FullScreenStateDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: c2f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradeRevPointsAccountRegistrationTaxIdScreen f20768b;

            {
                this.f20768b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TradeRevPointsAccountRegistrationTaxIdScreen tradeRevPointsAccountRegistrationTaxIdScreen = this.f20768b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TradeRevPointsAccountRegistrationTaxIdScreen.R;
                        TradeRevPointsAccountRegistrationTaxIdScreen tradeRevPointsAccountRegistrationTaxIdScreen2 = this.f20768b;
                        return dli.f.a(tradeRevPointsAccountRegistrationTaxIdScreen2, (h) tradeRevPointsAccountRegistrationTaxIdScreen2.Q.getValue(), v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), tradeRevPointsAccountRegistrationTaxIdScreen2.N), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TradeRevPointsAccountRegistrationTaxIdScreen.R;
                        qji.b bVarU2 = tradeRevPointsAccountRegistrationTaxIdScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trade_rev_points.impl.ui.screen.account_registration_tax_id.di.TradeRevPointsAccountRegistrationTaxIdScreenInjector");
                        t1f.e eVar = (t1f.e) bVarU2;
                        t1f.h hVar = eVar.f267288b;
                        t1f.e eVar2 = eVar.f267289c;
                        TradeRevPointsAccountRegistrationTaxIdScreenContract$InputData tradeRevPointsAccountRegistrationTaxIdScreenContract$InputData = tradeRevPointsAccountRegistrationTaxIdScreen.K;
                        tradeRevPointsAccountRegistrationTaxIdScreenContract$InputData.getClass();
                        return new t1f.b(hVar, eVar2, tradeRevPointsAccountRegistrationTaxIdScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TradeRevPointsAccountRegistrationTaxIdScreen.R;
                        return (h) ((t1f.b) tradeRevPointsAccountRegistrationTaxIdScreen.P.getValue()).f267280b.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: c2f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradeRevPointsAccountRegistrationTaxIdScreen f20768b;

            {
                this.f20768b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TradeRevPointsAccountRegistrationTaxIdScreen tradeRevPointsAccountRegistrationTaxIdScreen = this.f20768b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TradeRevPointsAccountRegistrationTaxIdScreen.R;
                        TradeRevPointsAccountRegistrationTaxIdScreen tradeRevPointsAccountRegistrationTaxIdScreen2 = this.f20768b;
                        return dli.f.a(tradeRevPointsAccountRegistrationTaxIdScreen2, (h) tradeRevPointsAccountRegistrationTaxIdScreen2.Q.getValue(), v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), tradeRevPointsAccountRegistrationTaxIdScreen2.N), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TradeRevPointsAccountRegistrationTaxIdScreen.R;
                        qji.b bVarU2 = tradeRevPointsAccountRegistrationTaxIdScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trade_rev_points.impl.ui.screen.account_registration_tax_id.di.TradeRevPointsAccountRegistrationTaxIdScreenInjector");
                        t1f.e eVar = (t1f.e) bVarU2;
                        t1f.h hVar = eVar.f267288b;
                        t1f.e eVar2 = eVar.f267289c;
                        TradeRevPointsAccountRegistrationTaxIdScreenContract$InputData tradeRevPointsAccountRegistrationTaxIdScreenContract$InputData = tradeRevPointsAccountRegistrationTaxIdScreen.K;
                        tradeRevPointsAccountRegistrationTaxIdScreenContract$InputData.getClass();
                        return new t1f.b(hVar, eVar2, tradeRevPointsAccountRegistrationTaxIdScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TradeRevPointsAccountRegistrationTaxIdScreen.R;
                        return (h) ((t1f.b) tradeRevPointsAccountRegistrationTaxIdScreen.P.getValue()).f267280b.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: c2f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TradeRevPointsAccountRegistrationTaxIdScreen f20768b;

            {
                this.f20768b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TradeRevPointsAccountRegistrationTaxIdScreen tradeRevPointsAccountRegistrationTaxIdScreen = this.f20768b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TradeRevPointsAccountRegistrationTaxIdScreen.R;
                        TradeRevPointsAccountRegistrationTaxIdScreen tradeRevPointsAccountRegistrationTaxIdScreen2 = this.f20768b;
                        return dli.f.a(tradeRevPointsAccountRegistrationTaxIdScreen2, (h) tradeRevPointsAccountRegistrationTaxIdScreen2.Q.getValue(), v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), tradeRevPointsAccountRegistrationTaxIdScreen2.N), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = TradeRevPointsAccountRegistrationTaxIdScreen.R;
                        qji.b bVarU2 = tradeRevPointsAccountRegistrationTaxIdScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trade_rev_points.impl.ui.screen.account_registration_tax_id.di.TradeRevPointsAccountRegistrationTaxIdScreenInjector");
                        t1f.e eVar = (t1f.e) bVarU2;
                        t1f.h hVar = eVar.f267288b;
                        t1f.e eVar2 = eVar.f267289c;
                        TradeRevPointsAccountRegistrationTaxIdScreenContract$InputData tradeRevPointsAccountRegistrationTaxIdScreenContract$InputData = tradeRevPointsAccountRegistrationTaxIdScreen.K;
                        tradeRevPointsAccountRegistrationTaxIdScreenContract$InputData.getClass();
                        return new t1f.b(hVar, eVar2, tradeRevPointsAccountRegistrationTaxIdScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = TradeRevPointsAccountRegistrationTaxIdScreen.R;
                        return (h) ((t1f.b) tradeRevPointsAccountRegistrationTaxIdScreen.P.getValue()).f267280b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174546c.setHeaderModel(uiState.f20773b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t1f.b) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c2f.h) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        LargeActionButton largeActionButton = d3().f174545b;
        largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
        largeActionButton.setText(new TextLocalisedClause(R$string.miles_common_continue, null, null, 14));
        largeActionButton.setLoadingButtonTag("SUBMIT_BUTTON_LOADING_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174545b.o), new brc.h(this, continuation, 25), 3);
        ViewController.P2(this, rd0.e.b(d3().f174546c.F), new f(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new c(this, null), 3);
    }

    public final jii.o d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.o) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
