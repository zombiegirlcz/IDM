package h0d;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.selfserve.sow.impl.ui.summary.SowSummaryFragment;
import gld.h0;
import gzg.a0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ozc.t;
import te0.w;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends bsi.a implements c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ozc.d f148371j;
    public final b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ozc.f f148372l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final tpi.j f148373m;

    public s(ozc.d presentationModel, b mapper, ozc.f router, tpi.j progressView) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        this.f148371j = presentationModel;
        this.k = mapper;
        this.f148372l = router;
        this.f148373m = progressView;
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        k view = (k) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        t tVar = (t) this.f148371j;
        efm.r map = tVar.A3().map(new gv5.b(new n(this, 0), 26));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarF = o70.a.f(map);
        n nVar = new n(this, 2);
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new a08.r(22, new h0(new BreadcrumbException(), 29)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        a0d.g gVar = new a0d.g(17, nVar);
        akl.s sVar = this.i;
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(gVar, new a0d.g(17, sVar), new ea9.c(19, function0J));
        ifm.b bVar = this.f239031a;
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        efm.r rVarHide = tVar.f231335m.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        efm.b bVarSwitchMapCompletable = o70.a.f(rVarHide).switchMapCompletable(new gv5.b(new n(this, 3), 27));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        a08.r rVar = new a08.r(22, new h0(new BreadcrumbException(), 28));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar2 = new pfm.a(bVarSwitchMapCompletable, rVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new a0d.g(17, sVar), new ea9.c(19, r.f148370a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar, hVarW);
        efm.b bVarSwitchMapCompletable2 = tVar.A3().switchMapCompletable(new gv5.b(new n(this, 1), 25));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable2, "switchMapCompletable(...)");
        a08.r rVar2 = new a08.r(22, new h0(new BreadcrumbException(), 27));
        bVarSwitchMapCompletable2.getClass();
        pfm.a aVar3 = new pfm.a(bVarSwitchMapCompletable2, rVar2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new a0d.g(17, sVar), new ea9.c(19, q.f148369a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        efm.b bVarSwitchMapCompletable3 = tVar.w3().switchMapCompletable(new gv5.b(new n(this, 5), 24));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable3, "switchMapCompletable(...)");
        a08.r rVar3 = new a08.r(22, new h0(new BreadcrumbException(), 25));
        bVarSwitchMapCompletable3.getClass();
        pfm.a aVar4 = new pfm.a(bVarSwitchMapCompletable3, rVar3, 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new a0d.g(17, sVar), new ea9.c(19, o.f148367a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar, hVarW3);
        efm.b bVarSwitchMapCompletable4 = ((RowDelegate) ((SowSummaryFragment) view).f0.getValue()).f53218h.filter(new gv5.b(new a0(7), 28)).switchMapCompletable(new gv5.b(new n(this, 4), 29));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable4, "switchMapCompletable(...)");
        a08.r rVar4 = new a08.r(22, new h0(new BreadcrumbException(), 26));
        bVarSwitchMapCompletable4.getClass();
        pfm.a aVar5 = new pfm.a(bVarSwitchMapCompletable4, rVar4, 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new a0d.g(17, sVar), new ea9.c(19, p.f148368a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        w.j0(bVar, hVarW4);
    }
}
