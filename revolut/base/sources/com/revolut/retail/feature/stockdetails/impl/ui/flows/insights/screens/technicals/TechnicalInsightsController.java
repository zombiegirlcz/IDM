package com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.technicals;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import avk.j;
import cli.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.BigRadialGaugeDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsBadgeDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.technicals.TechnicalInsightsController;
import com.revolut.retail.wealth.resources.R$string;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import muk.b;
import muk.g;
import muk.k;
import prk.l0;
import te0.w;
import tki.c;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/screens/technicals/TechnicalInsightsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TechnicalInsightsController extends ViewController<q> implements c {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(TechnicalInsightsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K;
    public final h L;
    public final FullScreenStateDelegate M;
    public final ListSubheaderDelegate N;
    public final TextDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final j S;

    public TechnicalInsightsController(TechnicalInsightsControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar;
        this.L = s.t(this, b.f);
        this.M = new FullScreenStateDelegate();
        this.N = new ListSubheaderDelegate();
        this.O = new TextDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: muk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TechnicalInsightsController f209039b;

            {
                this.f209039b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = TechnicalInsightsController.T;
                        TechnicalInsightsController technicalInsightsController = this.f209039b;
                        return tki.g.a(technicalInsightsController, (g) technicalInsightsController.R.getValue(), v.k(technicalInsightsController.M, technicalInsightsController.N, new BigRadialGaugeDelegate(), new CellDetailsBadgeDelegate(), new GridBoxDelegate(u.c(new CounterTextDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), new ListSubheaderLoadingDelegate(), new CellDetailsLoadingDelegate(), technicalInsightsController.O), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TechnicalInsightsController.T;
                        return (g) ((l0) this.f209039b.Q.getValue()).f.get();
                }
            }
        });
        this.Q = w.y0(new mhd.b(this, inputData, 21));
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: muk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TechnicalInsightsController f209039b;

            {
                this.f209039b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TechnicalInsightsController.T;
                        TechnicalInsightsController technicalInsightsController = this.f209039b;
                        return tki.g.a(technicalInsightsController, (g) technicalInsightsController.R.getValue(), v.k(technicalInsightsController.M, technicalInsightsController.N, new BigRadialGaugeDelegate(), new CellDetailsBadgeDelegate(), new GridBoxDelegate(u.c(new CounterTextDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), new ListSubheaderLoadingDelegate(), new CellDetailsLoadingDelegate(), technicalInsightsController.O), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = TechnicalInsightsController.T;
                        return (g) ((l0) this.f209039b.Q.getValue()).f.get();
                }
            }
        });
        this.S = new j(this, 16);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((k) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l0) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.instrument_technicals_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new mta.c(this, continuation, 2), 3);
        ViewController.P2(this, new mmh.e(rd0.e.b(this.M.f52371h.f121375b), 9), new muk.e(this, null), 3);
        ViewController.P2(this, new mmh.e(rd0.e.b(this.N.d), 10), new mkk.q(this, continuation, 21), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.P.getValue();
    }
}
