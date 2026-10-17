package hsk;

import a08.g0;
import a08.o0;
import ael.t0;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.stats.DetailedStatsActivity;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.stats.DetailedStatsContract$Configuration;
import efm.r;
import hs4.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import qfm.r0;
import r10.t;
import te0.w;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends pri.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DetailedStatsContract$Configuration f155075h;
    public final t i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f155076j;
    public final qy5.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final xpi.g f155077l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final xrk.h f155078m;

    public h(DetailedStatsContract$Configuration config, t tabProvider, d router, qy5.a mapper, xpi.g navBarWithToolbarView, xrk.h presentationModel) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(tabProvider, "tabProvider");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(navBarWithToolbarView, "navBarWithToolbarView");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        this.f155075h = config;
        this.i = tabProvider;
        this.f155076j = router;
        this.k = mapper;
        this.f155077l = navBarWithToolbarView;
        this.f155078m = presentationModel;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        e view = (e) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        DetailedStatsContract$Configuration detailedStatsContract$Configuration = this.f155075h;
        n instrument = detailedStatsContract$Configuration.f103813b;
        xrk.h hVar = this.f155078m;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        r rVarG = m70.a.g(rd0.e.c(hVar.e.a(instrument, w4l.h.f294642c), kotlin.coroutines.g.f186406a), null, null, 3);
        r rVarX = ((t0) hVar.f).g().x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        r rVarF = o70.a.f(w.l(rVarG, rVarX));
        hm3.b bVar = new hm3.b(view, this, 22);
        Function1 function1K = K();
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new o0(21, new h2i.b(new BreadcrumbException(), 4)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new g0(19, bVar), new g0(19, function1K), new ea9.c(21, function0J));
        ifm.b bVar2 = this.f239031a;
        w.j0(bVar2, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        n instrument2 = detailedStatsContract$Configuration.f103813b;
        String ticker = instrument2.e;
        this.k.getClass();
        Intrinsics.checkNotNullParameter(instrument2, "instrument");
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        TextLocalisedClause textLocalisedClauseB = dvk.n.b(ticker, instrument2);
        xpi.c cVar = (xpi.c) this.f155077l;
        cVar.p0(textLocalisedClauseB);
        cVar.n0(textLocalisedClauseB);
        Intrinsics.checkNotNullParameter(instrument2, "instrument");
        cVar.f0(dvk.n.a(instrument2));
        cVar.l0(true);
        r0 r0VarD = w.D(cVar.Q(), new l(this, 4));
        Function1 function1K2 = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new o0(21, new h2i.b(new BreadcrumbException(), 6)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new g0(19, function1K2), new ea9.c(21, g.f155074a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar2, hVarW);
        DetailedStatsActivity detailedStatsActivity = (DetailedStatsActivity) view;
        r rVarMergeWith = w.a0(((Tabs) detailedStatsActivity.f103808t0.getValue(detailedStatsActivity, DetailedStatsActivity.B0[2])).f58882b, new l(detailedStatsActivity, 3)).mergeWith(detailedStatsActivity.y0);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        r rVarDistinctUntilChanged = rVarMergeWith.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        r rVarF2 = o70.a.f(rVarDistinctUntilChanged);
        l lVar = new l(view, 5);
        Function1 function1K3 = K();
        Function0 function0J2 = J();
        r rVarOnErrorResumeNext2 = rVarF2.onErrorResumeNext(new o0(21, new h2i.b(new BreadcrumbException(), 5)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new g0(19, lVar), new g0(19, function1K3), new ea9.c(21, function0J2));
        w.j0(bVar2, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
    }
}
