package oee;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.details.DetailsStepFragment;
import efm.d0;
import ip0.v7;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qfm.r0;
import rfm.f0;
import te0.w;

/* JADX INFO: loaded from: classes8.dex */
public final class v extends pri.b implements i {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final opi.d f224602h;
    public final nee.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m f224603j;
    public final h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final nee.g f224604l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l80.e f224605m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f9b.f f224606n;
    public final tpi.j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k3l.b f224607p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final uce.c f224608q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final az2.b f224609r;

    public v(opi.d bottomDialogView, nee.c router, m presentationModel, h bottomDialogMapper, nee.g itemsProvider, l80.e dateProvider, f9b.f errorView, tpi.j progressView, k3l.b statusDialogView, uce.c neverReceivedCardMode, az2.b terminateRevolutCardDialogProvider) {
        Intrinsics.checkNotNullParameter(bottomDialogView, "bottomDialogView");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(bottomDialogMapper, "bottomDialogMapper");
        Intrinsics.checkNotNullParameter(itemsProvider, "itemsProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(statusDialogView, "statusDialogView");
        Intrinsics.checkNotNullParameter(neverReceivedCardMode, "neverReceivedCardMode");
        Intrinsics.checkNotNullParameter(terminateRevolutCardDialogProvider, "terminateRevolutCardDialogProvider");
        this.f224602h = bottomDialogView;
        this.i = router;
        this.f224603j = presentationModel;
        this.k = bottomDialogMapper;
        this.f224604l = itemsProvider;
        this.f224605m = dateProvider;
        this.f224606n = errorView;
        this.o = progressView;
        this.f224607p = statusDialogView;
        this.f224608q = neverReceivedCardMode;
        this.f224609r = terminateRevolutCardDialogProvider;
    }

    public final pfm.h N() {
        ufm.i iVar = new ufm.i(((opi.b) this.f224602h).O().f(this.f224603j.b()), new oc8.e(16, new n(this, 4)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return v7.x(new ufm.f(new ufm.i(hx7.a.O(mo3.a.w(o70.a.i(iVar), this.o), this.f224606n, false, null, 24), new oc8.e(17, new obg.q(22)), 1), new oc8.e(18, new n(this, 5)), 3), "ignoreElement(...)");
    }

    public final pfm.h O() {
        m mVar = this.f224603j;
        d0 d0VarB = mVar.b();
        yf.c cVar = mVar.f;
        nee.d dVar = mVar.f224589a;
        f0 f0VarT = zi0.c.t(cVar.g((String) dVar.f214489a.get()));
        ufm.i iVarA = mVar.a();
        ufm.c cVarN = w.N(dVar.f214490b);
        ufm.i iVar = new ufm.i(w.N(dVar.f214489a), new oc8.e(7, new k(mVar, 2)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return v7.x(new ufm.f(hx7.a.O(mo3.a.w(w.K0(d0VarB, f0VarT, iVarA, cVarN, iVar), this.o), this.f224606n, false, null, 24), new oc8.e(15, new n(this, 3)), 3), "ignoreElement(...)");
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        j view = (j) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        d0 d0VarB = this.f224603j.b();
        oc8.e eVar = new oc8.e(19, new n(this, 0));
        d0VarB.getClass();
        ufm.i iVar = new ufm.i(d0VarB, eVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.n nVarI = o70.a.i(iVar);
        o54.a aVar2 = new o54.a(this, view, 29);
        Function1 function1K = K();
        ufm.i iVar2 = new ufm.i(nVarI, new m3l.d(9, new o3l.m(new BreadcrumbException(), 16)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar2, "onErrorResumeNext(...)");
        ofm.i iVar3 = new ofm.i(new o9h.d(1, aVar2), new o9h.d(1, function1K), 0);
        iVar2.q(iVar3);
        Intrinsics.checkNotNullExpressionValue(iVar3, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, iVar3);
        DetailsStepFragment detailsStepFragment = (DetailsStepFragment) view;
        ihm.f fVar = ((ListCellDelegate) detailsStepFragment.f89430d0.getValue()).d;
        ?? r56 = detailsStepFragment.f89431e0;
        efm.r rVarMergeWith = fVar.mergeWith(((RowDelegate) r56.getValue()).f53226s);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        efm.r map = rVarMergeWith.map(new oc8.e(20, new obg.q(23)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r0 r0VarD = w.D(map, new n(this, 7));
        Function1 function1K2 = K();
        pfm.a aVar3 = new pfm.a(r0VarD, new m3l.d(9, new o3l.m(new BreadcrumbException(), 18)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar3.w(new o9h.d(1, function1K2), new j7a.j(27, q.f224597a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar, hVarW);
        r0 r0VarD2 = w.D(((CellDetailsChevronDelegate) detailsStepFragment.i0.getValue()).f51821c, new n(this, 8));
        Function1 function1K3 = K();
        pfm.a aVar4 = new pfm.a(r0VarD2, new m3l.d(9, new o3l.m(new BreadcrumbException(), 19)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar4.w(new o9h.d(1, function1K3), new j7a.j(27, r.f224598a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        r0 r0VarD3 = w.D(((LargeActionButtonDelegate) detailsStepFragment.g0.getValue()).d.f121375b, new n(this, 9));
        Function1 function1K4 = K();
        pfm.a aVar5 = new pfm.a(r0VarD3, new m3l.d(9, new o3l.m(new BreadcrumbException(), 20)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar5.w(new o9h.d(1, function1K4), new j7a.j(27, s.f224599a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar, hVarW3);
        r0 r0VarD4 = w.D(((RowDelegate) r56.getValue()).f53220l, new n(this, 1));
        Function1 function1K5 = K();
        pfm.a aVar6 = new pfm.a(r0VarD4, new m3l.d(9, new o3l.m(new BreadcrumbException(), 21)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar6.w(new o9h.d(1, function1K5), new j7a.j(27, t.f224600a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        w.j0(bVar, hVarW4);
        efm.r rVarFilter = ((k3l.d) this.f224607p).f180813j.filter(new oc8.e(14, new obg.q(21)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        n nVar = new n(this, 6);
        Function1 function1K6 = K();
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarFilter.onErrorResumeNext(new m3l.d(9, new o3l.m(new BreadcrumbException(), 17)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new o9h.d(1, nVar), new o9h.d(1, function1K6), new j7a.j(27, function0J));
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }
}
