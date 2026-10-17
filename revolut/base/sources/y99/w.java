package y99;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.common.ui.R$string;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.o0;

/* JADX INFO: loaded from: classes5.dex */
public final class w extends bsi.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f311802j;
    public final h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f9b.f f311803l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final tpi.j f311804m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final iqi.h f311805n;
    public final xpi.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kpi.c f311806p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tri.c f311807q;

    public w(g presentationModel, h router, f9b.f errorView, tpi.j progressView, iqi.h twinVerticalButtonView, xpi.g navBarWithToolbarView, kpi.c activityResultDelegate, tri.c backButtonView) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(twinVerticalButtonView, "twinVerticalButtonView");
        Intrinsics.checkNotNullParameter(navBarWithToolbarView, "navBarWithToolbarView");
        Intrinsics.checkNotNullParameter(activityResultDelegate, "activityResultDelegate");
        Intrinsics.checkNotNullParameter(backButtonView, "backButtonView");
        this.f311802j = presentationModel;
        this.k = router;
        this.f311803l = errorView;
        this.f311804m = progressView;
        this.f311805n = twinVerticalButtonView;
        this.o = navBarWithToolbarView;
        this.f311806p = activityResultDelegate;
        this.f311807q = backButtonView;
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        j view = (j) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Object obj2 = this.f311802j;
        ((nri.a) obj2).init();
        ((nri.a) this.k).init();
        ((xpi.c) this.o).setVisible(false);
        iqi.b bVar = (iqi.b) this.f311805n;
        bVar.V(false);
        bVar.a0(new TextLocalisedClause(R$string.common_action_continue, null, null, 14));
        o oVar = (o) obj2;
        efm.r rVarF = o70.a.f(oVar.k3());
        y7k.g0 g0Var = new y7k.g0(this, view, 3);
        efm.r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new n1i.b(29, new xy7.n(new BreadcrumbException(), 14)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext.subscribe(new o0(24, g0Var), new o0(24, r.f311797a)), "subscribe(...)");
        v60.i iVar = oVar.f311793j;
        efm.r rVarHide = ((ihm.j) oVar.k.d).hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        efm.r rVarMerge = efm.r.merge(iVar, rVarHide);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        efm.r rVarS = mo3.a.s(o70.a.f(rVarMerge), this.f311804m);
        Intrinsics.checkNotNullExpressionValue(rVarS, "withDataProgress(...)");
        efm.r rVarN = hx7.a.N(rVarS, this.f311803l, false, false);
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext2 = rVarN.onErrorResumeNext(new n1i.b(29, new xy7.n(new BreadcrumbException(), 15)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        o0 o0Var = new o0(24, s.f311798a);
        akl.s sVar = this.i;
        ifm.c cVarSubscribe = rVarOnErrorResumeNext2.subscribe(o0Var, new o0(24, sVar), new t1i.n(27, function0J));
        ifm.b bVar2 = this.f239031a;
        te0.w.j0(bVar2, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        kpi.c cVar = this.f311806p;
        efm.r rVarN2 = cVar.N(2035);
        Intrinsics.checkNotNullParameter(rVarN2, "<this>");
        efm.r rVarFilter = rVarN2.filter(new km2.b(22, new knd.a(29)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        final int i = 0;
        pfm.a aVar2 = new pfm.a(te0.w.D(rVarFilter, new Function1(this) { // from class: y99.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f311795b;

            {
                this.f311795b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                switch (i) {
                    case 0:
                        kpi.a it8 = (kpi.a) obj3;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        e0 e0Var = (e0) this.f311795b.k;
                        efm.k kVarJ3 = e0Var.j3();
                        y25.c cVar2 = new y25.c(new y(e0Var, 3), 25);
                        kVarJ3.getClass();
                        pfm.a aVar3 = new pfm.a(kVarJ3, cVar2, 3);
                        Intrinsics.checkNotNullExpressionValue(aVar3, "flatMapCompletable(...)");
                        return aVar3;
                    case 1:
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e0 e0Var2 = (e0) this.f311795b.k;
                        efm.k kVarJ32 = e0Var2.j3();
                        y25.c cVar3 = new y25.c(new y(e0Var2, 2), 24);
                        kVarJ32.getClass();
                        pfm.a aVar4 = new pfm.a(kVarJ32, cVar3, 3);
                        Intrinsics.checkNotNullExpressionValue(aVar4, "flatMapCompletable(...)");
                        return aVar4;
                    default:
                        return ((e0) this.f311795b.k).k3();
                }
            }
        }), new n1i.b(29, new xy7.n(new BreadcrumbException(), 16)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new o0(24, sVar), new t1i.n(27, t.f311799a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(bVar2, hVarW);
        final int i2 = 1;
        pfm.a aVar3 = new pfm.a(te0.w.D(this.f311807q.f273801b, new Function1(this) { // from class: y99.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f311795b;

            {
                this.f311795b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                switch (i2) {
                    case 0:
                        kpi.a it8 = (kpi.a) obj3;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        e0 e0Var = (e0) this.f311795b.k;
                        efm.k kVarJ3 = e0Var.j3();
                        y25.c cVar2 = new y25.c(new y(e0Var, 3), 25);
                        kVarJ3.getClass();
                        pfm.a aVar32 = new pfm.a(kVarJ3, cVar2, 3);
                        Intrinsics.checkNotNullExpressionValue(aVar32, "flatMapCompletable(...)");
                        return aVar32;
                    case 1:
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e0 e0Var2 = (e0) this.f311795b.k;
                        efm.k kVarJ32 = e0Var2.j3();
                        y25.c cVar3 = new y25.c(new y(e0Var2, 2), 24);
                        kVarJ32.getClass();
                        pfm.a aVar4 = new pfm.a(kVarJ32, cVar3, 3);
                        Intrinsics.checkNotNullExpressionValue(aVar4, "flatMapCompletable(...)");
                        return aVar4;
                    default:
                        return ((e0) this.f311795b.k).k3();
                }
            }
        }), new n1i.b(29, new xy7.n(new BreadcrumbException(), 17)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new o0(24, sVar), new t1i.n(27, u.f311800a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        te0.w.j0(bVar2, hVarW2);
        efm.r rVarMerge2 = efm.r.merge(bVar.O(), i26.l.g(cVar.N(2035)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge2, "merge(...)");
        final int i3 = 2;
        pfm.a aVar4 = new pfm.a(te0.w.D(rVarMerge2, new Function1(this) { // from class: y99.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f311795b;

            {
                this.f311795b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                switch (i3) {
                    case 0:
                        kpi.a it8 = (kpi.a) obj3;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        e0 e0Var = (e0) this.f311795b.k;
                        efm.k kVarJ3 = e0Var.j3();
                        y25.c cVar2 = new y25.c(new y(e0Var, 3), 25);
                        kVarJ3.getClass();
                        pfm.a aVar32 = new pfm.a(kVarJ3, cVar2, 3);
                        Intrinsics.checkNotNullExpressionValue(aVar32, "flatMapCompletable(...)");
                        return aVar32;
                    case 1:
                        Unit it9 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        e0 e0Var2 = (e0) this.f311795b.k;
                        efm.k kVarJ32 = e0Var2.j3();
                        y25.c cVar3 = new y25.c(new y(e0Var2, 2), 24);
                        kVarJ32.getClass();
                        pfm.a aVar42 = new pfm.a(kVarJ32, cVar3, 3);
                        Intrinsics.checkNotNullExpressionValue(aVar42, "flatMapCompletable(...)");
                        return aVar42;
                    default:
                        return ((e0) this.f311795b.k).k3();
                }
            }
        }), new n1i.b(29, new xy7.n(new BreadcrumbException(), 18)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new o0(24, sVar), new t1i.n(27, v.f311801a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        te0.w.j0(bVar2, hVarW3);
    }
}
