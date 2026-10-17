package com.revolut.feature.wealth.private_equity.impl.ui.fund_details.performance;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FanChartDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.MultiTargetFanChartLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RatingBarDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth.private_equity.impl.R$string;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.performance.FundPerformanceScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import d1h.j;
import efm.r;
import ihm.f;
import jii.m;
import kge.b;
import kgh.d;
import kgh.l;
import kgh.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tki.c;
import ufh.g;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/performance/FundPerformanceScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ltki/c;", "Lkgh/n;", "Ld1h/j;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FundPerformanceScreen extends ViewController<q> implements c, j {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f95827a0 = {o0.f186429a.j(new h0(FundPerformanceScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final l K;
    public final h L;
    public final Object M;
    public final int N;
    public final HeaderDelegate O;
    public final TrendViewDelegate P;
    public final FixedTabsDelegate Q;
    public final ListSubheaderDelegate R;
    public final TextDelegate S;
    public final FanChartDelegate T;
    public final CellDetailsActionDelegate U;
    public final FooterTextDelegate V;
    public final FullScreenStateDelegate W;
    public final Object X;
    public final Object Y;
    public final d Z;

    public FundPerformanceScreen(l inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, kgh.c.f);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: kgh.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundPerformanceScreen f183986b;

            {
                this.f183986b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = FundPerformanceScreen.f95827a0;
                        return (m) ((ufh.g) this.f183986b.Y.getValue()).f279847l.get();
                    case 1:
                        KProperty[] kPropertyArr2 = FundPerformanceScreen.f95827a0;
                        FundPerformanceScreen fundPerformanceScreen = this.f183986b;
                        return tki.g.a(fundPerformanceScreen, fundPerformanceScreen.R2(), v.k(new RatingBarDelegate(), fundPerformanceScreen.T, new MultiTargetFanChartLoadingDelegate(), fundPerformanceScreen.S, new PlainTextLoadingDelegate(), fundPerformanceScreen.V, new FooterTextLoadingDelegate(), fundPerformanceScreen.O, new HeaderLoadingDelegate(), fundPerformanceScreen.P, fundPerformanceScreen.Q, fundPerformanceScreen.R, new ListSubheaderLoadingDelegate(), new CellDetailsDelegate(), fundPerformanceScreen.U, new CellDetailsLoadingDelegate(), fundPerformanceScreen.W), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = FundPerformanceScreen.f95827a0;
                        FundPerformanceScreen fundPerformanceScreen2 = this.f183986b;
                        phm.a aVar = (phm.a) ue0.e.j(fundPerformanceScreen2.m2()).a().get(ufh.i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ufh.i.class, " is not found"));
                        }
                        ufh.i iVar = ((ufh.i) aVar2.b()).f279862s;
                        l lVar = fundPerformanceScreen2.K;
                        lVar.getClass();
                        d dVar = fundPerformanceScreen2.Z;
                        dVar.getClass();
                        return new ufh.g(iVar, new f3h.b(), new f3h.a(), fundPerformanceScreen2, lVar, dVar);
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar;
        this.O = new HeaderDelegate();
        this.P = new TrendViewDelegate(1000L);
        this.Q = new FixedTabsDelegate();
        this.R = new ListSubheaderDelegate();
        this.S = new TextDelegate();
        this.T = new FanChartDelegate();
        this.U = new CellDetailsActionDelegate();
        this.V = new FooterTextDelegate();
        this.W = new FullScreenStateDelegate();
        final int i2 = 1;
        this.X = w.y0(new Function0(this) { // from class: kgh.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundPerformanceScreen f183986b;

            {
                this.f183986b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FundPerformanceScreen.f95827a0;
                        return (m) ((ufh.g) this.f183986b.Y.getValue()).f279847l.get();
                    case 1:
                        KProperty[] kPropertyArr2 = FundPerformanceScreen.f95827a0;
                        FundPerformanceScreen fundPerformanceScreen = this.f183986b;
                        return tki.g.a(fundPerformanceScreen, fundPerformanceScreen.R2(), v.k(new RatingBarDelegate(), fundPerformanceScreen.T, new MultiTargetFanChartLoadingDelegate(), fundPerformanceScreen.S, new PlainTextLoadingDelegate(), fundPerformanceScreen.V, new FooterTextLoadingDelegate(), fundPerformanceScreen.O, new HeaderLoadingDelegate(), fundPerformanceScreen.P, fundPerformanceScreen.Q, fundPerformanceScreen.R, new ListSubheaderLoadingDelegate(), new CellDetailsDelegate(), fundPerformanceScreen.U, new CellDetailsLoadingDelegate(), fundPerformanceScreen.W), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = FundPerformanceScreen.f95827a0;
                        FundPerformanceScreen fundPerformanceScreen2 = this.f183986b;
                        phm.a aVar = (phm.a) ue0.e.j(fundPerformanceScreen2.m2()).a().get(ufh.i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ufh.i.class, " is not found"));
                        }
                        ufh.i iVar = ((ufh.i) aVar2.b()).f279862s;
                        l lVar = fundPerformanceScreen2.K;
                        lVar.getClass();
                        d dVar = fundPerformanceScreen2.Z;
                        dVar.getClass();
                        return new ufh.g(iVar, new f3h.b(), new f3h.a(), fundPerformanceScreen2, lVar, dVar);
                }
            }
        });
        final int i3 = 2;
        this.Y = w.y0(new Function0(this) { // from class: kgh.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundPerformanceScreen f183986b;

            {
                this.f183986b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = FundPerformanceScreen.f95827a0;
                        return (m) ((ufh.g) this.f183986b.Y.getValue()).f279847l.get();
                    case 1:
                        KProperty[] kPropertyArr2 = FundPerformanceScreen.f95827a0;
                        FundPerformanceScreen fundPerformanceScreen = this.f183986b;
                        return tki.g.a(fundPerformanceScreen, fundPerformanceScreen.R2(), v.k(new RatingBarDelegate(), fundPerformanceScreen.T, new MultiTargetFanChartLoadingDelegate(), fundPerformanceScreen.S, new PlainTextLoadingDelegate(), fundPerformanceScreen.V, new FooterTextLoadingDelegate(), fundPerformanceScreen.O, new HeaderLoadingDelegate(), fundPerformanceScreen.P, fundPerformanceScreen.Q, fundPerformanceScreen.R, new ListSubheaderLoadingDelegate(), new CellDetailsDelegate(), fundPerformanceScreen.U, new CellDetailsLoadingDelegate(), fundPerformanceScreen.W), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = FundPerformanceScreen.f95827a0;
                        FundPerformanceScreen fundPerformanceScreen2 = this.f183986b;
                        phm.a aVar = (phm.a) ue0.e.j(fundPerformanceScreen2.m2()).a().get(ufh.i.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ufh.i.class, " is not found"));
                        }
                        ufh.i iVar = ((ufh.i) aVar2.b()).f279862s;
                        l lVar = fundPerformanceScreen2.K;
                        lVar.getClass();
                        d dVar = fundPerformanceScreen2.Z;
                        dVar.getClass();
                        return new ufh.g(iVar, new f3h.b(), new f3h.a(), fundPerformanceScreen2, lVar, dVar);
                }
            }
        });
        this.Z = new d(this);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((n) oVar);
    }

    @Override // d1h.j
    /* JADX INFO: renamed from: H0, reason: from getter */
    public final FooterTextDelegate getV() {
        return this.V;
    }

    @Override // d1h.j
    /* JADX INFO: renamed from: Q, reason: from getter */
    public final FullScreenStateDelegate getW() {
        return this.W;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, f95827a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.wealth_private_equity_fund_details_performance_details_header, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.wealth_private_equity_fund_details_performance_details_header, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, f95827a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new k22.c(this, null, 20), 3);
        f fVar = this.R.d;
        HeaderDelegate headerDelegate = this.O;
        r rVarMerge = r.merge(fVar, headerDelegate.e.f121375b, headerDelegate.f.f121375b, this.U.d);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        com.revolut.kompot.navigable.a.g2(this, new b(rd0.e.b(rVarMerge), 2), null, new kgh.h(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, new b(rd0.e.b(this.T.f.f121375b), 3), null, new kgh.h(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, new b(rd0.e.b(this.S.d), 4), null, new kgh.h(this, null, 2), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final kgh.m R2() {
        return (kgh.m) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.X.getValue();
    }
}
