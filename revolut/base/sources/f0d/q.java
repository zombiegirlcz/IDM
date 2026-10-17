package f0d;

import a08.f0;
import a08.g0;
import akl.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.selfserve.sow.impl.ui.question.SowQuestionFragment;
import efm.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ozc.t;
import te0.w;

/* JADX INFO: loaded from: classes7.dex */
public final class q extends bsi.a implements c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ozc.d f131100j;
    public final b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ozc.f f131101l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ypi.i f131102m;

    public q(ozc.d presentationModel, b mapper, ozc.f router, ypi.i nextButtonView) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        this.f131100j = presentationModel;
        this.k = mapper;
        this.f131101l = router;
        this.f131102m = nextButtonView;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        f view = (f) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        t tVar = (t) this.f131100j;
        r map = w.a0(tVar.z3(), new k(2)).switchMap(new ey7.a(new j(this, 1), 18)).map(new ey7.a(new j(this, 2), 19));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarF = o70.a.f(map);
        j jVar = new j(this, 3);
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new g0(15, new ew2.q(new BreadcrumbException(), 11)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        f0 f0Var = new f0(10, jVar);
        s sVar = this.i;
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(f0Var, new f0(10, sVar), new ea9.c(4, function0J));
        ifm.b bVar = this.f239031a;
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        pfm.a aVar2 = new pfm.a(w.D(tVar.w3(), new j(this, 4)), new g0(15, new ew2.q(new BreadcrumbException(), 10)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new f0(10, sVar), new ea9.c(4, p.f131099a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar, hVarW);
        SowQuestionFragment sowQuestionFragment = (SowQuestionFragment) view;
        efm.b bVarSwitchMapCompletable = ((InputTextDelegate) sowQuestionFragment.f0.getValue()).e.f121375b.switchMapCompletable(new ey7.a(new j(this, 0), 17));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        g0 g0Var = new g0(15, new ew2.q(new BreadcrumbException(), 9));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar3 = new pfm.a(bVarSwitchMapCompletable, g0Var, 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new f0(10, sVar), new ea9.c(4, o.f131098a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        efm.b bVarSwitchMapCompletable2 = ((InputChecklistDelegate) sowQuestionFragment.g0.getValue()).f52518c.switchMapCompletable(new ey7.a(new j(this, 5), 12));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable2, "switchMapCompletable(...)");
        g0 g0Var2 = new g0(15, new ew2.q(new BreadcrumbException(), 8));
        bVarSwitchMapCompletable2.getClass();
        pfm.a aVar4 = new pfm.a(bVarSwitchMapCompletable2, g0Var2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new f0(10, sVar), new ea9.c(4, n.f131097a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar, hVarW3);
    }
}
