package com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.CommodityTargetPriceScreen;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.CommodityTargetPriceScreenContract$InputData;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import njj.n;
import no.m;
import nx2.f;
import o7j.g;
import o7j.p;
import o7j.r;
import o7j.t;
import o7j.u;
import o7j.v;
import te0.w;
import tki.c;
import tx0.t3;
import vc.s;
import xki.e;
import yhm.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/target_price/CommodityTargetPriceScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lo7j/p;", "", "Lno/m;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CommodityTargetPriceScreen extends ViewController<p> implements c, m {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(CommodityTargetPriceScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final CommodityTargetPriceScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final CenteredAmountDelegate Q;
    public final Object R;
    public final Object S;
    public final Lazy T;

    public CommodityTargetPriceScreen(CommodityTargetPriceScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, g.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: o7j.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommodityTargetPriceScreen f222858b;

            {
                this.f222858b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CommodityTargetPriceScreen commodityTargetPriceScreen = this.f222858b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CommodityTargetPriceScreen.U;
                        qji.b bVarU2 = commodityTargetPriceScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.di.CommodityTargetPriceScreenInjector");
                        r6j.d dVar = (r6j.d) bVarU2;
                        r6j.c cVar = dVar.f251895b;
                        r6j.d dVar2 = dVar.f251896c;
                        CommodityTargetPriceScreenContract$InputData commodityTargetPriceScreenContract$InputData = commodityTargetPriceScreen.K;
                        commodityTargetPriceScreenContract$InputData.getClass();
                        return new r6j.g(cVar, dVar2, commodityTargetPriceScreen, commodityTargetPriceScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CommodityTargetPriceScreen.U;
                        return (r) ((r6j.g) commodityTargetPriceScreen.N.getValue()).f.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CommodityTargetPriceScreen.U;
                        qd0.b bVarN = ((r6j.g) commodityTargetPriceScreen.N.getValue()).f251910b.d.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        return zhm.v.k(commodityTargetPriceScreen.Q, new FullScreenStateDelegate());
                    default:
                        KProperty[] kPropertyArr4 = CommodityTargetPriceScreen.U;
                        CommodityTargetPriceScreen commodityTargetPriceScreen2 = this.f222858b;
                        r rVarD = commodityTargetPriceScreen2.d();
                        List list = (List) commodityTargetPriceScreen2.R.getValue();
                        ScreenContentRecyclerView recyclerView = commodityTargetPriceScreen2.d3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return tki.g.a(commodityTargetPriceScreen2, rVarD, list, recyclerView.getId(), null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: o7j.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommodityTargetPriceScreen f222858b;

            {
                this.f222858b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CommodityTargetPriceScreen commodityTargetPriceScreen = this.f222858b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CommodityTargetPriceScreen.U;
                        qji.b bVarU2 = commodityTargetPriceScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.di.CommodityTargetPriceScreenInjector");
                        r6j.d dVar = (r6j.d) bVarU2;
                        r6j.c cVar = dVar.f251895b;
                        r6j.d dVar2 = dVar.f251896c;
                        CommodityTargetPriceScreenContract$InputData commodityTargetPriceScreenContract$InputData = commodityTargetPriceScreen.K;
                        commodityTargetPriceScreenContract$InputData.getClass();
                        return new r6j.g(cVar, dVar2, commodityTargetPriceScreen, commodityTargetPriceScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CommodityTargetPriceScreen.U;
                        return (r) ((r6j.g) commodityTargetPriceScreen.N.getValue()).f.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CommodityTargetPriceScreen.U;
                        qd0.b bVarN = ((r6j.g) commodityTargetPriceScreen.N.getValue()).f251910b.d.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        return zhm.v.k(commodityTargetPriceScreen.Q, new FullScreenStateDelegate());
                    default:
                        KProperty[] kPropertyArr4 = CommodityTargetPriceScreen.U;
                        CommodityTargetPriceScreen commodityTargetPriceScreen2 = this.f222858b;
                        r rVarD = commodityTargetPriceScreen2.d();
                        List list = (List) commodityTargetPriceScreen2.R.getValue();
                        ScreenContentRecyclerView recyclerView = commodityTargetPriceScreen2.d3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return tki.g.a(commodityTargetPriceScreen2, rVarD, list, recyclerView.getId(), null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: o7j.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommodityTargetPriceScreen f222858b;

            {
                this.f222858b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CommodityTargetPriceScreen commodityTargetPriceScreen = this.f222858b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CommodityTargetPriceScreen.U;
                        qji.b bVarU2 = commodityTargetPriceScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.di.CommodityTargetPriceScreenInjector");
                        r6j.d dVar = (r6j.d) bVarU2;
                        r6j.c cVar = dVar.f251895b;
                        r6j.d dVar2 = dVar.f251896c;
                        CommodityTargetPriceScreenContract$InputData commodityTargetPriceScreenContract$InputData = commodityTargetPriceScreen.K;
                        commodityTargetPriceScreenContract$InputData.getClass();
                        return new r6j.g(cVar, dVar2, commodityTargetPriceScreen, commodityTargetPriceScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CommodityTargetPriceScreen.U;
                        return (r) ((r6j.g) commodityTargetPriceScreen.N.getValue()).f.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CommodityTargetPriceScreen.U;
                        qd0.b bVarN = ((r6j.g) commodityTargetPriceScreen.N.getValue()).f251910b.d.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        return zhm.v.k(commodityTargetPriceScreen.Q, new FullScreenStateDelegate());
                    default:
                        KProperty[] kPropertyArr4 = CommodityTargetPriceScreen.U;
                        CommodityTargetPriceScreen commodityTargetPriceScreen2 = this.f222858b;
                        r rVarD = commodityTargetPriceScreen2.d();
                        List list = (List) commodityTargetPriceScreen2.R.getValue();
                        ScreenContentRecyclerView recyclerView = commodityTargetPriceScreen2.d3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return tki.g.a(commodityTargetPriceScreen2, rVarD, list, recyclerView.getId(), null, null, null, 56);
                }
            }
        });
        this.Q = new CenteredAmountDelegate(new f(this, 25));
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: o7j.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommodityTargetPriceScreen f222858b;

            {
                this.f222858b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CommodityTargetPriceScreen commodityTargetPriceScreen = this.f222858b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CommodityTargetPriceScreen.U;
                        qji.b bVarU2 = commodityTargetPriceScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.di.CommodityTargetPriceScreenInjector");
                        r6j.d dVar = (r6j.d) bVarU2;
                        r6j.c cVar = dVar.f251895b;
                        r6j.d dVar2 = dVar.f251896c;
                        CommodityTargetPriceScreenContract$InputData commodityTargetPriceScreenContract$InputData = commodityTargetPriceScreen.K;
                        commodityTargetPriceScreenContract$InputData.getClass();
                        return new r6j.g(cVar, dVar2, commodityTargetPriceScreen, commodityTargetPriceScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CommodityTargetPriceScreen.U;
                        return (r) ((r6j.g) commodityTargetPriceScreen.N.getValue()).f.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CommodityTargetPriceScreen.U;
                        qd0.b bVarN = ((r6j.g) commodityTargetPriceScreen.N.getValue()).f251910b.d.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        return zhm.v.k(commodityTargetPriceScreen.Q, new FullScreenStateDelegate());
                    default:
                        KProperty[] kPropertyArr4 = CommodityTargetPriceScreen.U;
                        CommodityTargetPriceScreen commodityTargetPriceScreen2 = this.f222858b;
                        r rVarD = commodityTargetPriceScreen2.d();
                        List list = (List) commodityTargetPriceScreen2.R.getValue();
                        ScreenContentRecyclerView recyclerView = commodityTargetPriceScreen2.d3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return tki.g.a(commodityTargetPriceScreen2, rVarD, list, recyclerView.getId(), null, null, null, 56);
                }
            }
        });
        final int i6 = 4;
        this.S = w.y0(new Function0(this) { // from class: o7j.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommodityTargetPriceScreen f222858b;

            {
                this.f222858b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                CommodityTargetPriceScreen commodityTargetPriceScreen = this.f222858b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CommodityTargetPriceScreen.U;
                        qji.b bVarU2 = commodityTargetPriceScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.di.CommodityTargetPriceScreenInjector");
                        r6j.d dVar = (r6j.d) bVarU2;
                        r6j.c cVar = dVar.f251895b;
                        r6j.d dVar2 = dVar.f251896c;
                        CommodityTargetPriceScreenContract$InputData commodityTargetPriceScreenContract$InputData = commodityTargetPriceScreen.K;
                        commodityTargetPriceScreenContract$InputData.getClass();
                        return new r6j.g(cVar, dVar2, commodityTargetPriceScreen, commodityTargetPriceScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CommodityTargetPriceScreen.U;
                        return (r) ((r6j.g) commodityTargetPriceScreen.N.getValue()).f.get();
                    case 2:
                        KProperty[] kPropertyArr3 = CommodityTargetPriceScreen.U;
                        qd0.b bVarN = ((r6j.g) commodityTargetPriceScreen.N.getValue()).f251910b.d.n();
                        vc.s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 3:
                        return zhm.v.k(commodityTargetPriceScreen.Q, new FullScreenStateDelegate());
                    default:
                        KProperty[] kPropertyArr4 = CommodityTargetPriceScreen.U;
                        CommodityTargetPriceScreen commodityTargetPriceScreen2 = this.f222858b;
                        r rVarD = commodityTargetPriceScreen2.d();
                        List list = (List) commodityTargetPriceScreen2.R.getValue();
                        ScreenContentRecyclerView recyclerView = commodityTargetPriceScreen2.d3().d;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                        return tki.g.a(commodityTargetPriceScreen2, rVarD, list, recyclerView.getId(), null, null, null, 56);
                }
            }
        });
        this.T = j.b(o7j.f.f222861a);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        o7j.w uiState = (o7j.w) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        u uVar = uiState.f222881a;
        o7j.s sVar = uiState.f222883c;
        if (uVar instanceof t) {
            t tVar = (t) uVar;
            NavBarWithToolbar.setToolbar$default(navBarWithToolbar, tVar.f222875a, tVar.f222876b, null, 4, null);
            navBarWithToolbar.setMenuItems(tVar.f222877c);
        } else if (uVar instanceof u.a) {
            navBarWithToolbar.I0(t3.TWO_LINES, true);
        } else {
            if (!(uVar instanceof v)) {
                throw new NoWhenBranchMatchedException();
            }
            v vVar = (v) uVar;
            TextLocalisedClause textLocalisedClause = vVar.f222879a;
            m70.a.c(t0.f186434a);
            NavBarWithToolbar.setToolbar$default(navBarWithToolbar, textLocalisedClause, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 4, null);
            navBarWithToolbar.setMenuItems(vVar.f222880b);
        }
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setText(sVar.f222873a);
        goToButton.setEnabled(sVar.f222874b);
        goToButton.setAnalyticsContext(null);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return (AnalyticsProduct) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r6j.g) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.j0(false);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new o7j.h(this, null, 0), 3);
        ViewController.P2(this, new n(rd0.e.b(navBarWithToolbar.o.f57403b), 29), new o7j.h(this, null, 1), 3);
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        ViewController.P2(this, rd0.e.b(goToButton.o), new o7j.h(this, null, 2), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final r d() {
        return (r) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.S.getValue();
    }
}
