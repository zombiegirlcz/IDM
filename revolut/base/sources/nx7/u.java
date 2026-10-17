package nx7;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit_resources.R$drawable;
import efm.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nii.o0;
import tx0.j0;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends bsi.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xpi.g f220474j;
    public final iqi.h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final tri.c f220475l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final rpi.c f220476m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f220477n;
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mm.d f220478p;

    public u(xpi.g navBar, iqi.h twinVerticalButton, tri.c backButtonView, rpi.c keyboardView, c router, b presentationModel, mm.d actionDispatcher) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(twinVerticalButton, "twinVerticalButton");
        Intrinsics.checkNotNullParameter(backButtonView, "backButtonView");
        Intrinsics.checkNotNullParameter(keyboardView, "keyboardView");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(actionDispatcher, "actionDispatcher");
        this.f220474j = navBar;
        this.k = twinVerticalButton;
        this.f220475l = backButtonView;
        this.f220476m = keyboardView;
        this.f220477n = router;
        this.o = presentationModel;
        this.f220478p = actionDispatcher;
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        f view = (f) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        xpi.c cVar = (xpi.c) this.f220474j;
        cVar.setVisible(true);
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        cVar.c0(j0.MULTILINE);
        efm.r rVarDoOnNext = efm.r.merge(cVar.Q(), this.f220475l.f273801b).doOnNext(new i(new o(this, 4), 5));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        pfm.a aVar2 = new pfm.a(te0.w.D(rVarDoOnNext, new o(this, 5)), new n1i.b(4, new ne0.e(new BreadcrumbException(), 20)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        j7a.j jVar = new j7a.j(21, s.f220472a);
        akl.s sVar = this.i;
        ofm.h hVarW = aVar2.w(new o0(1, sVar), jVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        te0.w.j0(bVar, hVarW);
        efm.r rVarDoOnNext2 = ((iqi.b) this.k).O().doOnNext(new i(new o(this, 6), 6));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext2, "doOnNext(...)");
        pfm.a aVar3 = new pfm.a(ue0.e.v(te0.w.D(rVarDoOnNext2, new o(this, 7))), new n1i.b(4, new ne0.e(new BreadcrumbException(), 21)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new o0(1, sVar), new j7a.j(21, t.f220473a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        te0.w.j0(bVar, hVarW2);
        Object obj2 = this.o;
        n nVar = (n) obj2;
        efm.b bVarFlatMapCompletable = o70.a.f(((a0) nVar.i).w0().c(te0.s.f270018a)).flatMapCompletable(new i(new o(this, 0), 2));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        n1i.b bVar2 = new n1i.b(4, new ne0.e(new BreadcrumbException(), 17));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar4 = new pfm.a(bVarFlatMapCompletable, bVar2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new o0(1, sVar), new j7a.j(21, q.f220470a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        te0.w.j0(bVar, hVarW3);
        efm.r rVarHide = ((ihm.f) nVar.o.getValue()).hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        efm.r rVarF = o70.a.f(rVarHide);
        o oVar = new o(this, 1);
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new n1i.b(4, new ne0.e(new BreadcrumbException(), 18)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new o0(1, oVar), new o0(1, sVar), new j7a.j(21, function0J));
        te0.w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        pfm.a aVar5 = new pfm.a(o70.a.g(te0.w.D(m70.a.g(nim.a.z(((tm.g) nVar.f220466n.getValue()).f, new nuc.n(28)), null, null, 3), new o(this, 2))), new n1i.b(4, new ne0.e(new BreadcrumbException(), 19)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new o0(1, sVar), new j7a.j(21, r.f220471a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        te0.w.j0(bVar, hVarW4);
        ((nri.a) obj2).init();
    }

    public final pfm.a Q(String str) {
        n nVar = (n) this.o;
        d0 d0VarFirstOrError = nVar.f220460c.Y().firstOrError();
        d0 d0VarFirstOrError2 = nVar.f220459b.F().firstOrError();
        d0 d0VarFirstOrError3 = nVar.d.R1().firstOrError();
        d0 d0VarFirstOrError4 = nVar.f220461g.o().firstOrError();
        a0 a0Var = (a0) nVar.i;
        pfm.a aVar = new pfm.a(d0.A(d0VarFirstOrError, d0VarFirstOrError2, d0VarFirstOrError3, d0VarFirstOrError4, a0Var.f220450h.getValue(a0Var, a0.f220446j[1]).c(te0.s.f270018a).firstOrError(), new i(new b6i.p(str, 2), 3)), new i(new o(this, 3), 4), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }
}
