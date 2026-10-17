package zyc;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.selfserve.sot.impl.ui.home.SotHomeFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import zc0.x2;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 extends bsi.a implements d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final pyc.f f326409j;
    public final b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final pyc.h f326410l;

    public a0(pyc.f presentationModel, b mapper, pyc.h router) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(router, "router");
        this.f326409j = presentationModel;
        this.k = mapper;
        this.f326410l = router;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        f view = (f) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        SotHomeFragment sotHomeFragment = (SotHomeFragment) view;
        pfm.a aVar2 = new pfm.a(te0.w.D(sotHomeFragment.D().f59357t, new x(this, 0)), new zp0.a0(2, new x2(new BreadcrumbException(), 17)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        yzc.p pVar = new yzc.p(8, y.f326433a);
        akl.s sVar = this.i;
        ofm.h hVarW = aVar2.w(new xy7.l(6, sVar), pVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        te0.w.j0(bVar, hVarW);
        efm.b bVarSwitchMapCompletable = ((RowDelegate) sotHomeFragment.f85948d0.getValue()).f53218h.switchMapCompletable(new zx0.b(new x(this, 1), 25));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        zp0.a0 a0Var = new zp0.a0(2, new x2(new BreadcrumbException(), 18));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar3 = new pfm.a(bVarSwitchMapCompletable, a0Var, 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new xy7.l(6, sVar), new yzc.p(8, z.f326434a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        te0.w.j0(bVar, hVarW2);
        pyc.t tVar = (pyc.t) this.f326409j;
        efm.r rVarW = nim.a.w(tVar.f240801g.o(), new pyc.p(0));
        kpj.f fVar = tVar.d;
        efm.r map = te0.w.m(rVarW, fVar.l(), nim.a.w(fVar.i(), new pyc.p(1))).map(new zx0.b(new x(this, 2), 26));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarF = o70.a.f(map);
        zrd.q qVar = new zrd.q(view, 18);
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new zp0.a0(2, new x2(new BreadcrumbException(), 16)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new xy7.l(6, qVar), new xy7.l(6, sVar), new yzc.p(8, function0J));
        te0.w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }
}
