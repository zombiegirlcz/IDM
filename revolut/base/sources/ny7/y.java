package ny7;

import a08.f0;
import a08.g0;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.insurance_pet.impl.ui.edit.details.PetEditDetailsActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends bsi.a implements e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f220711j;
    public final tpi.j k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final rpi.c f220712l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ly7.b f220713m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ly7.a f220714n;
    public final com.revolut.feature.insurance_pet.impl.ui.pet.dob.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sz7.b f220715p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final os2.g f220716q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final opi.d f220717r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final oy7.a f220718s;

    public y(f presenterConfigurationDelegate, tpi.j progressView, rpi.c keyboardView, ly7.b router, ly7.a presentationModel, com.revolut.feature.insurance_pet.impl.ui.pet.dob.a dobErrorChecker, sz7.b amountDataFactory, os2.g bottomSheetDelegate, opi.d expandableDialogView, oy7.a uiBuilder) {
        Intrinsics.checkNotNullParameter(presenterConfigurationDelegate, "presenterConfigurationDelegate");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(keyboardView, "keyboardView");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(dobErrorChecker, "dobErrorChecker");
        Intrinsics.checkNotNullParameter(amountDataFactory, "amountDataFactory");
        Intrinsics.checkNotNullParameter(bottomSheetDelegate, "bottomSheetDelegate");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        Intrinsics.checkNotNullParameter(uiBuilder, "uiBuilder");
        this.f220711j = presenterConfigurationDelegate;
        this.k = progressView;
        this.f220712l = keyboardView;
        this.f220713m = router;
        this.f220714n = presentationModel;
        this.o = dobErrorChecker;
        this.f220715p = amountDataFactory;
        this.f220716q = bottomSheetDelegate;
        this.f220717r = expandableDialogView;
        this.f220718s = uiBuilder;
    }

    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v47, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        g view = (g) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Object obj2 = this.f220714n;
        ((nri.a) obj2).init();
        f fVar = this.f220711j;
        fVar.c();
        pfm.a aVar2 = new pfm.a(fVar.e(), new m3l.d(6, new t(new BreadcrumbException(), 2)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        j7a.j jVar = new j7a.j(22, u.f220707a);
        akl.s sVar = this.i;
        ofm.h hVarW = aVar2.w(new f0(28, sVar), jVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        te0.w.j0(bVar, hVarW);
        fVar.h();
        pfm.a aVar3 = new pfm.a(fVar.g(), new m3l.d(6, new t(new BreadcrumbException(), 3)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new f0(28, sVar), new j7a.j(22, v.f220708a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        te0.w.j0(bVar, hVarW2);
        pfm.a aVar4 = new pfm.a(fVar.f(), new m3l.d(6, new t(new BreadcrumbException(), 4)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new f0(28, sVar), new j7a.j(22, w.f220709a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        te0.w.j0(bVar, hVarW3);
        ly7.h hVar = (ly7.h) obj2;
        efm.r rVarF = hVar.f200728b.F();
        rz7.h hVar2 = hVar.d;
        efm.r rVarV = hVar2.v();
        efm.r rVarR1 = hVar2.R1();
        rz7.j jVar2 = hVar.f200729c;
        efm.r map = te0.w.n(rVarF, rVarV, rVarR1, jVar2.Y()).map(new nx7.i(new nxa.v(8), 21));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        rz7.f fVar2 = hVar.e;
        efm.r rVarFilter = fVar2.M().filter(new nx7.i(new nxa.v(9), 22));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        efm.r rVarF2 = hVar.f200728b.F();
        rz7.d dVar = hVar.f200730g;
        efm.r rVarT2 = dVar.t2();
        efm.r rVarO1 = dVar.O1();
        efm.r rVarO = dVar.o();
        rz7.b bVar2 = hVar.f;
        efm.r rVarConcatMap = te0.w.p(rVarF2, rVarT2, rVarO1, rVarO, bVar2.A1(), hVar.f200731h.f0()).distinctUntilChanged().map(new nx7.i(new nxa.v(10), 24)).concatMap(new nx7.i(new i(this, 2), 25));
        Intrinsics.checkNotNullExpressionValue(rVarConcatMap, "concatMap(...)");
        efm.r map2 = te0.w.m(map, rVarFilter, rVarConcatMap).map(new nx7.i(new i(this, 3), 26));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        efm.r rVarT = mo3.a.t(map2, this.k);
        Intrinsics.h(rVarT);
        efm.r rVarF3 = o70.a.f(rVarT);
        nb6.p pVar = new nb6.p(1, view, g.class, "setItems", "setItems(Ljava/util/List;)V", 0, 19);
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarF3.onErrorResumeNext(new m3l.d(6, new ne0.e(new BreadcrumbException(), 25)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new f0(28, pVar), new f0(28, sVar), new j7a.j(22, function0J));
        te0.w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        PetEditDetailsActivity petEditDetailsActivity = (PetEditDetailsActivity) view;
        efm.r rVarDistinctUntilChanged = petEditDetailsActivity.X0().filter(new nx7.i(new nxa.v(11), 27)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        pfm.a aVar5 = new pfm.a(te0.w.D(rVarDistinctUntilChanged, new i(this, 5)), new m3l.d(6, new ne0.e(new BreadcrumbException(), 29)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new f0(28, sVar), new j7a.j(22, r.f220703a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        te0.w.j0(bVar, hVarW4);
        ?? r110 = petEditDetailsActivity.y0;
        efm.r rVarFilter2 = ((InputChecklistDelegate) r110.getValue()).f52518c.doOnNext(new nx7.i(new i(this, 13), 18)).filter(new nx7.i(new nxa.v(6), 19));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        efm.r map3 = rVarFilter2.filter(new g0(4, o.f220700a)).map(new f0(2, p.f220701a));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        pfm.a aVar6 = new pfm.a(te0.w.D(map3, new i(this, 1)), new m3l.d(6, new ne0.e(new BreadcrumbException(), 28)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar6.w(new f0(28, sVar), new j7a.j(22, q.f220702a));
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        te0.w.j0(bVar, hVarW5);
        efm.r map4 = petEditDetailsActivity.s0().map(new j(new nb6.p(1, this.o, com.revolut.feature.insurance_pet.impl.ui.pet.dob.a.class, "check", "check(Lcom/revolut/feature/insurance_pet/impl/ui/pet/dob/DOBInputData;)Lcom/revolut/feature/insurance_pet/impl/ui/pet/dob/DOBInputData;", 0, 20), 2));
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        pfm.a aVar7 = new pfm.a(te0.w.D(map4, new i(this, 12)), new m3l.d(6, new ne0.e(new BreadcrumbException(), 26)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar7, "onErrorResumeNext(...)");
        ofm.h hVarW6 = aVar7.w(new f0(28, sVar), new j7a.j(22, m.f220698a));
        Intrinsics.checkNotNullExpressionValue(hVarW6, "subscribe(...)");
        te0.w.j0(bVar, hVarW6);
        efm.r rVarDoOnNext = petEditDetailsActivity.y0().doOnNext(new nx7.i(new i(this, 8), 29));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        pfm.a aVar8 = new pfm.a(te0.w.D(rVarDoOnNext, new i(this, 9)), new m3l.d(6, new ne0.e(new BreadcrumbException(), 27)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar8, "onErrorResumeNext(...)");
        ofm.h hVarW7 = aVar8.w(new f0(28, sVar), new j7a.j(22, n.f220699a));
        Intrinsics.checkNotNullExpressionValue(hVarW7, "subscribe(...)");
        te0.w.j0(bVar, hVarW7);
        pfm.a aVar9 = new pfm.a(te0.w.D(((RowDelegate) petEditDetailsActivity.z0.getValue()).f53218h, new i(this, 4)), new m3l.d(6, new ne0.e(new BreadcrumbException(), 24)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar9, "onErrorResumeNext(...)");
        ofm.h hVarW8 = aVar9.w(new f0(28, sVar), new j7a.j(22, l.f220697a));
        Intrinsics.checkNotNullExpressionValue(hVarW8, "subscribe(...)");
        te0.w.j0(bVar, hVarW8);
        pfm.a aVar10 = new pfm.a(te0.w.D(petEditDetailsActivity.t1(), new i(this, 11)), new m3l.d(6, new ne0.e(new BreadcrumbException(), 23)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar10, "onErrorResumeNext(...)");
        ofm.h hVarW9 = aVar10.w(new f0(28, sVar), new j7a.j(22, k.f220696a));
        Intrinsics.checkNotNullExpressionValue(hVarW9, "subscribe(...)");
        te0.w.j0(bVar, hVarW9);
        efm.r rVarDoOnNext2 = ((InputChecklistDelegate) r110.getValue()).f52518c.doOnNext(new nx7.i(new i(this, 6), 28));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext2, "doOnNext(...)");
        pfm.a aVar11 = new pfm.a(te0.w.D(rVarDoOnNext2, new i(this, 7)), new m3l.d(6, new t(new BreadcrumbException(), 0)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar11, "onErrorResumeNext(...)");
        ofm.h hVarW10 = aVar11.w(new f0(28, sVar), new j7a.j(22, s.f220704a));
        Intrinsics.checkNotNullExpressionValue(hVarW10, "subscribe(...)");
        te0.w.j0(bVar, hVarW10);
        efm.r map5 = te0.w.o(jVar2.D2(), hVar2.O(), dVar.D(), fVar2.S(), bVar2.K()).map(new nx7.i(new nxa.v(7), 20));
        Intrinsics.checkNotNullExpressionValue(map5, "map(...)");
        nb6.p pVar2 = new nb6.p(1, this.f220711j, f.class, "setPrimaryButtonEnabled", "setPrimaryButtonEnabled(Z)V", 0, 21);
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = map5.onErrorResumeNext(new m3l.d(6, new t(new BreadcrumbException(), 1)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new f0(28, pVar2), new f0(28, sVar), new j7a.j(22, function0J2));
        te0.w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        pfm.a aVar12 = new pfm.a(fVar.b(), new m3l.d(6, new t(new BreadcrumbException(), 5)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar12, "onErrorResumeNext(...)");
        ofm.h hVarW11 = aVar12.w(new f0(28, sVar), new j7a.j(22, x.f220710a));
        Intrinsics.checkNotNullExpressionValue(hVarW11, "subscribe(...)");
        te0.w.j0(bVar, hVarW11);
    }
}
