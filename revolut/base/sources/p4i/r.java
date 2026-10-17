package p4i;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature_market_data_impl.ui.activity.stackedbreakdown.StackedBreakdownActivity;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mga.h0;
import n8i.b1;
import ozc.z;
import qfm.r0;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
public final class r extends pri.a {
    public final com.revolut.feature_market_data_impl.ui.activity.stackedbreakdown.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o5i.d f232945j;
    public final b1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final opi.d f232946l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ihm.b f232947m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final tpi.j f232948n;

    public r(com.revolut.feature_market_data_impl.ui.activity.stackedbreakdown.a payloadMapper, o5i.d router, b1 screenDelegates, opi.d expandableDialogView, ihm.b screenStackSubject, h0 upgradeEntryPointItemPresenterDelegate, tpi.j progressView) {
        Intrinsics.checkNotNullParameter(payloadMapper, "payloadMapper");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(screenDelegates, "screenDelegates");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        Intrinsics.checkNotNullParameter(screenStackSubject, "screenStackSubject");
        Intrinsics.checkNotNullParameter(upgradeEntryPointItemPresenterDelegate, "upgradeEntryPointItemPresenterDelegate");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        this.i = payloadMapper;
        this.f232945j = router;
        this.k = screenDelegates;
        this.f232946l = expandableDialogView;
        this.f232947m = screenStackSubject;
        this.f232948n = progressView;
        P(zhm.u.c(upgradeEntryPointItemPresenterDelegate));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        g view = (g) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        int i = 10;
        p4c.u uVar = new p4c.u(i);
        ihm.b bVar = this.f232947m;
        efm.r rVarDistinctUntilChanged = w.a0(bVar, uVar).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        int i2 = 8;
        int i3 = 9;
        efm.r rVarSwitchMap = o70.a.f(rVarDistinctUntilChanged).doOnNext(new p30.b(i2, new j(this, 2))).delay(300L, TimeUnit.MILLISECONDS).switchMap(new p30.b(i3, new j(this, i2)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        int i5 = 11;
        efm.r rVarDoOnError = o70.a.f(rVarSwitchMap).doOnNext(new p30.b(i, new j(this, i3))).doOnError(new p30.b(i5, new j(this, i)));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnError, "doOnError(...)");
        int i6 = 13;
        pfm.a aVarA = ue0.e.A(w.D(rVarDoOnError, new j(this, i5)), new j(this, i6));
        Function1 function1K = K();
        int i21 = 16;
        pfm.a aVar2 = new pfm.a(aVarA, new nw8.d(3, new p2i.l(new BreadcrumbException(), i21)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new ly7.g(10, function1K), new z(5, l.f232940a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar2 = this.f239031a;
        w.j0(bVar2, hVarW);
        opi.b bVar3 = (opi.b) this.f232946l;
        int i22 = 12;
        efm.r rVarFilter = bVar3.V().skip(1L).filter(new p30.b(i22, new p4c.u(i3)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        efm.r rVarB0 = w.B0(w.a0(rVarFilter, new p4c.u(i5)), bVar);
        p4c.u uVar2 = new p4c.u(i22);
        int i32 = 14;
        rVarB0.map(new p30.b(i32, uVar2)).subscribe(bVar);
        Q(view).filter(new p30.b(15, new p4c.u(i6))).map(new p30.b(i21, new j(this, i32))).subscribe(bVar);
        q qVar = q.f;
        efm.r rVarFilter2 = bVar.filter(new o0.a(17));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        r0 r0VarD = w.D(rVarFilter2, new j(this, 0));
        Function1 function1K2 = K();
        pfm.a aVar3 = new pfm.a(r0VarD, new nw8.d(3, new p2i.l(new BreadcrumbException(), 17)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new ly7.g(10, function1K2), new z(5, m.f232941a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar2, hVarW2);
        int i33 = 6;
        efm.r rVarFilter3 = Q(view).filter(new p30.b(i33, new j(this, 1)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter3, "filter(...)");
        r0 r0VarD2 = w.D(rVarFilter3, new j(this, 3));
        Function1 function1K3 = K();
        pfm.a aVar4 = new pfm.a(r0VarD2, new nw8.d(3, new p2i.l(new BreadcrumbException(), 18)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new ly7.g(10, function1K3), new z(5, n.f232942a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar2, hVarW3);
        StackedBreakdownActivity stackedBreakdownActivity = (StackedBreakdownActivity) view;
        r0 r0VarD3 = w.D(((TextDelegate) stackedBreakdownActivity.A0.getValue()).d, new j(this, 4));
        Function1 function1K4 = K();
        pfm.a aVar5 = new pfm.a(r0VarD3, new nw8.d(3, new p2i.l(new BreadcrumbException(), 19)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new ly7.g(10, function1K4), new z(5, o.f232943a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        w.j0(bVar2, hVarW4);
        r0 r0VarD4 = w.D(stackedBreakdownActivity.B0.e.f121375b, new j(this, 5));
        Function1 function1K5 = K();
        pfm.a aVar6 = new pfm.a(r0VarD4, new nw8.d(3, new p2i.l(new BreadcrumbException(), i32)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar6.w(new ly7.g(10, function1K5), new z(5, p.f232944a));
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        w.j0(bVar2, hVarW5);
        ihm.f fVar = ((LargeActionButtonDelegate) stackedBreakdownActivity.f97155t0.getValue()).d.f121375b;
        j jVar = new j(this, i33);
        Function1 function1K6 = K();
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = fVar.onErrorResumeNext(new nw8.d(3, new p2i.l(new BreadcrumbException(), 13)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new ly7.g(10, jVar), new ly7.g(10, function1K6), new z(5, function0J));
        w.j0(bVar2, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        r0 r0VarD5 = w.D(w.a0(bVar3.W0(), new p4c.u(8)), new j(this, 7));
        Function1 function1K7 = K();
        pfm.a aVar7 = new pfm.a(r0VarD5, new nw8.d(3, new p2i.l(new BreadcrumbException(), 15)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar7, "onErrorResumeNext(...)");
        ofm.h hVarW6 = aVar7.w(new ly7.g(10, function1K7), new z(5, k.f232939a));
        Intrinsics.checkNotNullExpressionValue(hVarW6, "subscribe(...)");
        w.j0(bVar2, hVarW6);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    public final efm.r Q(g gVar) {
        gVar.getClass();
        StackedBreakdownActivity stackedBreakdownActivity = (StackedBreakdownActivity) gVar;
        ?? r06 = stackedBreakdownActivity.f97158x0;
        efm.r rVarMerge = efm.r.merge(((CellDetailsActionDelegate) r06.getValue()).d.map(new p30.b(2, new p4c.u(4))), ((CellDetailsActionDelegate) r06.getValue()).f51780c.filter(new p30.b(3, new p4c.u(5))).map(new p30.b(4, new p4c.u(6))));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        efm.r rVarMerge2 = efm.r.merge(rVarMerge, ((CellDetailsDelegate) stackedBreakdownActivity.f97157w0.getValue()).d.map(new p30.b(5, new p4c.u(7))));
        Intrinsics.checkNotNullExpressionValue(rVarMerge2, "merge(...)");
        return rVarMerge2.flatMapSingle(new p30.b(13, new j(this, 12)));
    }
}
