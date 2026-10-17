package pak;

import akl.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.pda.impl.ui.selection.SelectionPdaFragment;
import efm.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m3j.n;
import org.jetbrains.annotations.NotNull;
import oxd.m;
import ozc.z;
import p2i.l;
import te0.w;
import tpi.j;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends bsi.a implements b {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final iak.b f234574j;
    public final j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f9b.f f234575l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n f234576m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final lak.c f234577n;

    public i(iak.b presentationModel, j progressView, f9b.f errorView, n beneficiaryItemViewMapper, lak.c router) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(beneficiaryItemViewMapper, "beneficiaryItemViewMapper");
        Intrinsics.checkNotNullParameter(router, "router");
        this.f234574j = presentationModel;
        this.k = progressView;
        this.f234575l = errorView;
        this.f234576m = beneficiaryItemViewMapper;
        this.f234577n = router;
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        c view = (c) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        r rVarS = mo3.a.s(o70.a.f(((r21.h) this.f234574j.f160045b.f182495a).f251040g.f(Unit.f186387a, true)), this.k);
        Intrinsics.checkNotNullExpressionValue(rVarS, "withDataProgress(...)");
        r map = m70.a.g(hx7.a.N(rVarS, this.f234575l, false, false), null, new p4a.g(24), 1).map(new h(new e(this, 0)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        m mVar = new m(view, 29);
        Function0 function0J = J();
        r rVarOnErrorResumeNext = map.onErrorResumeNext(new o9h.d(6, new l(new BreadcrumbException(), 24)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        nw8.d dVar = new nw8.d(4, mVar);
        s sVar = this.i;
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(dVar, new nw8.d(4, sVar), new z(8, function0J));
        ifm.b bVar = this.f239031a;
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        pfm.a aVar2 = new pfm.a(w.D(((RowDelegate) ((SelectionPdaFragment) view).g0.getValue()).f53218h, new e(this, 1)), new o9h.d(6, new l(new BreadcrumbException(), 25)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new nw8.d(4, sVar), new z(8, g.f234571a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar, hVarW);
    }
}
