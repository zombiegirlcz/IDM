package b0d;

import a08.g0;
import a08.o0;
import a08.q;
import a2i.j;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.selfserve.sow.impl.ui.frequency.SowFrequencyFragment;
import efm.d0;
import efm.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ozc.m;
import ozc.o;
import ozc.s0;
import ozc.t;
import te0.s;
import te0.w;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends bsi.a implements d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ozc.d f11655j;
    public final c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ozc.f f11656l;

    public i(ozc.d presentationModel, c mapper, ozc.f router) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(router, "router");
        this.f11655j = presentationModel;
        this.k = mapper;
        this.f11656l = router;
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        e view = (e) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        t tVar = (t) this.f11655j;
        te0.e eVarN0 = ((s0) tVar.f231329b).N0();
        s sVar = s.f270018a;
        d0 d0VarFirstOrError = eVarN0.c(sVar).firstOrError();
        o oVar = new o(8, new m(tVar, 10));
        d0VarFirstOrError.getClass();
        sfm.b bVar = new sfm.b(d0VarFirstOrError, oVar, 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        r map = w.l(pd.b.r(bVar, new m(tVar, 11)), ((s0) tVar.f231329b).M0().c(sVar)).map(new b0a.h(5, new g(this, 1)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarF = o70.a.f(map);
        g gVar = new g(this, 2);
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new o0(3, new j(new BreadcrumbException(), 24)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        g0 g0Var = new g0(2, gVar);
        akl.s sVar2 = this.i;
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(g0Var, new g0(2, sVar2), new q(8, function0J));
        ifm.b bVar2 = this.f239031a;
        w.j0(bVar2, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        efm.b bVarSwitchMapCompletable = ((InputChecklistDelegate) ((SowFrequencyFragment) view).f0.getValue()).f52518c.switchMapCompletable(new b0a.h(4, new g(this, 0)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        o0 o0Var = new o0(3, new j(new BreadcrumbException(), 23));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar2 = new pfm.a(bVarSwitchMapCompletable, o0Var, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new g0(2, sVar2), new q(8, h.f11654a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar2, hVarW);
    }
}
