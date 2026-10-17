package rx7;

import akl.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_pet.impl.R$string;
import efm.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ozc.z;
import qp5.x;
import rnb.u;
import te0.w;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends bsi.a implements c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xpi.g f258072j;
    public final iqi.h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final nx7.b f258073l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final nx7.c f258074m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final opi.d f258075n;
    public final os2.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sx7.d f258076p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sz7.b f258077q;

    public m(xpi.g navBar, iqi.h nextButtonView, nx7.b presentationModel, nx7.c router, opi.d expandableDialogView, os2.g bottomSheetDelegate, sx7.d uiBuilder, sz7.b amountDataFactory) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        Intrinsics.checkNotNullParameter(bottomSheetDelegate, "bottomSheetDelegate");
        Intrinsics.checkNotNullParameter(uiBuilder, "uiBuilder");
        Intrinsics.checkNotNullParameter(amountDataFactory, "amountDataFactory");
        this.f258072j = navBar;
        this.k = nextButtonView;
        this.f258073l = presentationModel;
        this.f258074m = router;
        this.f258075n = expandableDialogView;
        this.o = bottomSheetDelegate;
        this.f258076p = uiBuilder;
        this.f258077q = amountDataFactory;
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        e view = (e) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        nx7.n nVar = (nx7.n) this.f258073l;
        int i = 3;
        r map = w.l(nVar.f220460c.Y(), nVar.d.R1()).distinctUntilChanged().map(new rw9.d(new h(this, 2), i));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarF = o70.a.f(map);
        h hVar = new h(this, i);
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new ly7.g(14, new x(new BreadcrumbException(), 27)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        n1i.b bVar = new n1i.b(14, hVar);
        s sVar = this.i;
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(bVar, new n1i.b(14, sVar), new z(26, function0J));
        ifm.b bVar2 = this.f239031a;
        w.j0(bVar2, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        iqi.b bVar3 = (iqi.b) this.k;
        bVar3.setVisible(true);
        bVar3.W();
        bVar3.e0(false);
        bVar3.V(false);
        bVar3.a0(new TextLocalisedClause(R$string.pets_common_action_continue, null, null, 14));
        r rVarF2 = nVar.f220459b.F();
        rz7.d dVar = nVar.f220461g;
        r map2 = w.p(rVarF2, dVar.t2(), dVar.O1(), dVar.o(), nVar.f.A1(), nVar.f220462h.f0()).distinctUntilChanged().map(new rw9.d(new ru6.r(28), 8)).concatMap(new rw9.d(new h(this, 7), 9)).map(new rw9.d(new h(this, 8), 10));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        r rVarF3 = o70.a.f(map2);
        u uVar = new u(1, view, e.class, "setItems", "setItems(Ljava/util/List;)V", 0, 12);
        Function0 function0J2 = J();
        r rVarOnErrorResumeNext2 = rVarF3.onErrorResumeNext(new ly7.g(14, new x(new BreadcrumbException(), 23)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new n1i.b(14, uVar), new n1i.b(14, sVar), new z(26, function0J2));
        w.j0(bVar2, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        pfm.a aVar2 = new pfm.a(w.D(view.y0(), new h(this, 1)), new ly7.g(14, new x(new BreadcrumbException(), 24)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new n1i.b(14, sVar), new z(26, k.f258070a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar2, hVarW);
        pfm.a aVar3 = new pfm.a(w.D(view.K0(), new h(this, 0)), new ly7.g(14, new x(new BreadcrumbException(), 22)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new n1i.b(14, sVar), new z(26, j.f258069a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar2, hVarW2);
        efm.b bVarFlatMapCompletable = view.t1().distinctUntilChanged().flatMapCompletable(new rw9.d(new h(this, 6), 7));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        ly7.g gVar = new ly7.g(14, new x(new BreadcrumbException(), 21));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar4 = new pfm.a(bVarFlatMapCompletable, gVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new n1i.b(14, sVar), new z(26, i.f258068a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar2, hVarW3);
        pfm.a aVar5 = new pfm.a(w.D(view.q1(), new h(this, 9)), new ly7.g(14, new x(new BreadcrumbException(), 26)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new n1i.b(14, sVar), new z(26, l.f258071a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        w.j0(bVar2, hVarW4);
        r rVarDistinctUntilChanged = nVar.j3(nx7.e.BREED_SELECTION).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        r rVarF4 = o70.a.f(rVarDistinctUntilChanged);
        u uVar2 = new u(1, this.k, iqi.h.class, "setLargeButtonEnabled", "setLargeButtonEnabled(Z)V", 0, 13);
        Function0 function0J3 = J();
        r rVarOnErrorResumeNext3 = rVarF4.onErrorResumeNext(new ly7.g(14, new x(new BreadcrumbException(), 25)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new n1i.b(14, uVar2), new n1i.b(14, sVar), new z(26, function0J3));
        w.j0(bVar2, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
    }
}
