package mzj;

import a08.p0;
import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.oc;
import mz3.s;
import qfm.r0;
import rp0.n0;
import te0.w;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends pri.c implements b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final cqi.h f210802h;
    public final f9b.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f210803j;
    public final nzj.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a5h.g f210804l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g f210805m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final v60.i f210806n;
    public final ihm.b o;

    public n(cqi.h promptView, f9b.f errorView, a presentationModel, nzj.c router, a5h.g limitsPromptDataSource, g limitsPromptNavigationProvider) {
        Intrinsics.checkNotNullParameter(promptView, "promptView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(limitsPromptDataSource, "limitsPromptDataSource");
        Intrinsics.checkNotNullParameter(limitsPromptNavigationProvider, "limitsPromptNavigationProvider");
        this.f210802h = promptView;
        this.i = errorView;
        this.f210803j = presentationModel;
        this.k = router;
        this.f210804l = limitsPromptDataSource;
        this.f210805m = limitsPromptNavigationProvider;
        this.f210806n = new v60.i();
        this.o = j6.a.h("create(...)");
    }

    @Override // pri.b, pri.e
    public final void h(rri.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        r rVarSwitchMapSingle = this.f210806n.switchMapSingle(new j(new i(this, 7), 5));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMapSingle, "switchMapSingle(...)");
        r rVarN = hx7.a.N(o70.a.f(rVarSwitchMapSingle), this.i, false, false);
        i iVar = new i(this, 0);
        Function1 function1K = K();
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarN.onErrorResumeNext(new a0d.g(29, new ms2.j(new BreadcrumbException(), 11)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new p0(29, iVar), new p0(29, function1K), new j7a.j(12, function0J));
        ifm.b bVar = this.f239031a;
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        cqi.j jVar = (cqi.j) this.f210802h;
        r rVarFlatMapSingle = w.a0(jVar.i.d(), new oc(20)).flatMapSingle(new s(new i(this, 1), 29));
        rp0.p0 p0Var = jVar.i;
        r rVarMergeWith = rVarFlatMapSingle.mergeWith(w.a0(p0Var.f(), new oc(21)).flatMapSingle(new j(new i(this, 2), 0)));
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        r0 r0VarD = w.D(rVarMergeWith, new i(this, 3));
        Function1 function1K2 = K();
        pfm.a aVar = new pfm.a(r0VarD, new a0d.g(29, new ms2.j(new BreadcrumbException(), 8)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new p0(29, function1K2), new j7a.j(12, k.f210799a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar, hVarW);
        r0 r0VarD2 = w.D(w.a0(p0Var.d(), new oc(22)), new i(this, 4));
        Function1 function1K3 = K();
        pfm.a aVar2 = new pfm.a(r0VarD2, new a0d.g(29, new ms2.j(new BreadcrumbException(), 9)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar2.w(new p0(29, function1K3), new j7a.j(12, l.f210800a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        r map = p0Var.f256148b.d.map(new rof.e(21, new n0(0)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r0 r0VarD3 = w.D(map, new i(this, 5));
        Function1 function1K4 = K();
        pfm.a aVar3 = new pfm.a(r0VarD3, new a0d.g(29, new ms2.j(new BreadcrumbException(), 10)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar3.w(new p0(29, function1K4), new j7a.j(12, m.f210801a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar, hVarW3);
    }
}
