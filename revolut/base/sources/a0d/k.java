package a0d;

import a08.p;
import a08.q;
import a08.r;
import akl.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.selfserve.sow.impl.ui.evidencetypes.SowEvidenceTypesFragment;
import gzc.n;
import kotlin.jvm.internal.Intrinsics;
import ozc.s0;
import ozc.t;
import te0.w;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends bsi.a implements b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ozc.d f330j;
    public final ozc.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ozc.f f331l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final mxc.b f332m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final tpi.j f333n;

    public k(ozc.d presentationModel, ozc.a mapper, ozc.f router, mxc.b errorItemsFactory, tpi.j progressView) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(errorItemsFactory, "errorItemsFactory");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        this.f330j = presentationModel;
        this.k = mapper;
        this.f331l = router;
        this.f332m = errorItemsFactory;
        this.f333n = progressView;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        c view = (c) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        SowEvidenceTypesFragment sowEvidenceTypesFragment = (SowEvidenceTypesFragment) view;
        efm.b bVarSwitchMapCompletable = ((InputChecklistDelegate) sowEvidenceTypesFragment.f0.getValue()).f52518c.switchMapCompletable(new a05.a(new e(this, 4), 16));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        r rVar = new r(1, new p(new BreadcrumbException(), 25));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar2 = new pfm.a(bVarSwitchMapCompletable, rVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        q qVar = new q(3, f.f324a);
        s sVar = this.i;
        ofm.h hVarW = aVar2.w(new g(0, sVar), qVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        efm.b bVarSwitchMapCompletable2 = ((ErrorDelegate) sowEvidenceTypesFragment.g0.getValue()).f52226c.switchMapCompletable(new a05.a(new e(this, 0), 12));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable2, "switchMapCompletable(...)");
        r rVar2 = new r(1, new p(new BreadcrumbException(), 26));
        bVarSwitchMapCompletable2.getClass();
        pfm.a aVar3 = new pfm.a(bVarSwitchMapCompletable2, rVar2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new g(0, sVar), new q(3, h.f327a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        efm.b bVarQ = Q();
        r rVar3 = new r(1, new p(new BreadcrumbException(), 27));
        bVarQ.getClass();
        pfm.a aVar4 = new pfm.a(bVarQ, rVar3, 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new g(0, sVar), new q(3, i.f328a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar, hVarW3);
        efm.b bVarSwitchMapCompletable3 = ((t) this.f330j).w3().switchMapCompletable(new a05.a(new e(this, 1), 13));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable3, "switchMapCompletable(...)");
        r rVar4 = new r(1, new p(new BreadcrumbException(), 28));
        bVarSwitchMapCompletable3.getClass();
        pfm.a aVar5 = new pfm.a(bVarSwitchMapCompletable3, rVar4, 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new g(0, sVar), new q(3, j.f329a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        w.j0(bVar, hVarW4);
    }

    public final efm.b Q() {
        t tVar = (t) this.f330j;
        efm.r map = w.l(((nzc.d) tVar.f231330c.f185148b).a(), ((s0) tVar.f231329b).N0().c(te0.s.f270018a)).map(new a05.a(new e(this, 2), 14));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.b bVarIgnoreElements = o70.a.f(map).doOnNext(new a05.a(new e(this, 3), 15)).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        return bVarIgnoreElements;
    }

    public final pfm.a R(n incomeSource) {
        t tVar = (t) this.f330j;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(incomeSource, "incomeSource");
        pfm.a aVarE = tVar.j3(incomeSource.f148014a).e(w.A0(((s0) tVar.f231329b).N0(), incomeSource));
        Intrinsics.checkNotNullExpressionValue(aVarE, "updateIncomeSource(...)");
        te0.e eVarM0 = ((s0) tVar.f231329b).M0();
        od0.i.Companion.getClass();
        od0.i iVar = od0.i.f224256b;
        pfm.a aVarE2 = aVarE.e(w.z0(eVarM0, iVar));
        s0 s0Var = (s0) tVar.f231329b;
        pfm.a aVarE3 = w.z0(s0Var.J0(), iVar).e(w.z0(s0Var.K0(), iVar)).e(w.z0(s0Var.C0(), r0.g())).e(w.z0(s0Var.w0(), h0.f322473a));
        Intrinsics.checkNotNullExpressionValue(aVarE3, "andThen(...)");
        return aVarE2.e(aVarE3).e(((qri.b) this.f331l).m());
    }
}
