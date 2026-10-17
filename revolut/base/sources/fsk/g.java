package fsk;

import a08.f0;
import a08.g0;
import au6.k0;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.statement.StockFinancialsStatementContract$Configuration;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.statement.StockFinancialsStatementFragment;
import efm.r;
import f2i.x;
import fi7.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ofm.h;
import qfm.r0;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends pri.a {
    public final StockFinancialsStatementContract$Configuration i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final yrk.g f137721j;
    public final d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o9h.e f137722l;

    public g(StockFinancialsStatementContract$Configuration configuration, yrk.g presentationModel, d mapper, o9h.e footerDisclosureDelegate) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(footerDisclosureDelegate, "footerDisclosureDelegate");
        this.i = configuration;
        this.f137721j = presentationModel;
        this.k = mapper;
        this.f137722l = footerDisclosureDelegate;
        P(u.c(footerDisclosureDelegate));
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        b view = (b) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        StockFinancialsStatementFragment stockFinancialsStatementFragment = (StockFinancialsStatementFragment) view;
        r map = stockFinancialsStatementFragment.j0.f52371h.f121375b.map(new fs5.d(1, new fo9.a(24)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarSwitchMap = map.startWith(Unit.f186387a).switchMap(new fs5.d(3, new e(this, 1)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        r rVarL = w.l(m70.a.f(rVarSwitchMap, new eki.f(3, this, g.class, "handleStatementData", "handleStatementData(Lcom/revolut/retail/feature/stockdetails/impl/ui/activities/statements/statement/models/StockFinancialsStatementData;ZLjava/lang/Throwable;)Ljava/util/List;", 0, 1), new s(2, this, g.class, "handleNullStatementData", "handleNullStatementData(ZLjava/lang/Throwable;)Ljava/util/List;", 0, 1), new k0(this, 2)), this.f137722l.N(new p0h.e(null, 3)));
        r rVarHide = this.f137721j.d.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        r map2 = rVarL.takeUntil(rVarHide).map(new fs5.d(2, new fo9.a(25)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        r rVarF = o70.a.f(map2);
        x xVar = new x(1, view, b.class, "setItems", "setItems(Ljava/util/List;)V", 0, 20);
        Function1 function1K = K();
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new g0(18, new fa9.c(new BreadcrumbException(), 12)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new f0(13, xVar), new f0(13, function1K), new ea9.c(9, function0J));
        ifm.b bVar = this.f239031a;
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        r0 r0VarD = w.D(w.a0(stockFinancialsStatementFragment.f103803h0.f, new fo9.a(26)), new e(this, 0));
        Function1 function1K2 = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new g0(18, new fa9.c(new BreadcrumbException(), 13)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        h hVarW = aVar2.w(new f0(13, function1K2), new ea9.c(9, f.f137720a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar, hVarW);
    }
}
