package eae;

import a08.g0;
import a08.o0;
import aw0.o9;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.subscriptions.impl.history.SubscriptionHistoryActivity;
import com.revolut.feature.subscriptions.impl.history.flow.SubscriptionsHistoryFlowContract$Configuration;
import efm.r;
import g9j.v;
import ip0.pb0;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import te0.j;
import te0.s;
import te0.w;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends pri.b implements b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gae.f f124221h;
    public final xpi.g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jae.a f124222j;
    public final f9b.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SubscriptionsHistoryFlowContract$Configuration f124223l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final gae.c f124224m;

    public h(gae.f router, xpi.g navBarView, jae.a mapper, f9b.f errorView, SubscriptionsHistoryFlowContract$Configuration configuration, gae.c presentationModel) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(navBarView, "navBarView");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        this.f124221h = router;
        this.i = navBarView;
        this.f124222j = mapper;
        this.k = errorView;
        this.f124223l = configuration;
        this.f124224m = presentationModel;
    }

    @Override // pri.b
    public final void M(rri.a aVar) {
        c view = (c) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        this.f124222j.getClass();
        pb0[] pb0VarArr = new pb0[5];
        for (int i = 0; i < 5; i++) {
            pb0VarArr[i] = new pb0(a0.d.n("LIST_ID_LOADING_", i));
        }
        List listV0 = kotlin.collections.d.v0(pb0VarArr);
        yp0.b.k(listV0, 0, 0, 0, 0, 31);
        ((SubscriptionHistoryActivity) view).setItems(listV0);
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        c view = (c) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        SubscriptionsHistoryFlowContract$Configuration subscriptionsHistoryFlowContract$Configuration = this.f124223l;
        String str = subscriptionsHistoryFlowContract$Configuration.f89200b;
        TextClause textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        xpi.c cVar = (xpi.c) this.i;
        cVar.n0(textClause);
        cVar.p0(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_back));
        pfm.h hVarB = w.b(cVar.Q(), new e(this, 0));
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(hVarB, new o0(11, new e05.h(new BreadcrumbException(), 22)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new g0(12, function1K), new ea9.c(1, g.f124220a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        boolean z = subscriptionsHistoryFlowContract$Configuration.d;
        gae.c cVar2 = this.f124224m;
        gae.e eVar = (gae.e) cVar2.d;
        j jVar = eVar.f142151c;
        KProperty[] kPropertyArr = gae.e.d;
        te0.e value = jVar.getValue(eVar, kPropertyArr[1]);
        s sVar = s.f270018a;
        r rVarC = value.c(sVar);
        whf.b bVar2 = cVar2.e;
        gae.e eVar2 = (gae.e) cVar2.f142147b;
        r rVarFlatMap = eVar2.f142150b.getValue(eVar2, kPropertyArr[0]).c(sVar).flatMap(new v(new g9i.s(1, cVar2.f142146a, xua.a.class, "observeRecurringPaymentById", "observeRecurringPaymentById(Ljava/lang/String;)Lio/reactivex/Observable;", 0, 3), 4));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        r map = m70.a.g(rVarFlatMap, new g5k.f(18), null, 2).map(new v(new gae.a(cVar2, z, 0), 5));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarFlatMapSingle = w.l(rVarC, m70.a.g(whf.b.a(bVar2, map, null, null, null, 14), null, new g5k.f(17), 1)).flatMapSingle(new v(new g4k.e(cVar2, 18), 3));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMapSingle, "flatMapSingle(...)");
        r map2 = w.v0(rVarFlatMapSingle).map(new e8h.c(19, new e(this, 1)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        r rVarN = hx7.a.N(o70.a.f(map2), this.k, false, false);
        dkm.a aVar3 = new dkm.a(1, view, c.class, "setItems", "setItems(Ljava/util/List;)V", 0, 21);
        Function1 function1K2 = K();
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarN.onErrorResumeNext(new o0(11, new e05.h(new BreadcrumbException(), 20)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new g0(12, aVar3), new g0(12, function1K2), new ea9.c(1, function0J));
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        pfm.h hVarB2 = w.b(((RowDelegate) ((SubscriptionHistoryActivity) view).u0.getValue()).f53218h, new e(this, 2));
        Function1 function1K3 = K();
        pfm.a aVar4 = new pfm.a(hVarB2, new o0(11, new e05.h(new BreadcrumbException(), 21)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar4.w(new g0(12, function1K3), new ea9.c(1, f.f124219a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
    }
}
