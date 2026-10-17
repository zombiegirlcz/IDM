package px7;

import akl.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_pet.impl.R$string;
import efm.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nx7.n;
import ozc.z;
import pjg.k;
import te0.w;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends bsi.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xpi.g f240576j;
    public final iqi.h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.revolut.feature.insurance_pet.impl.ui.pet.dob.a f240577l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final nx7.b f240578m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final qx7.a f240579n;

    public h(xpi.g navBar, iqi.h nextButtonView, com.revolut.feature.insurance_pet.impl.ui.pet.dob.a dobErrorChecker, nx7.b presentationModel, qx7.a uiBuilder) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(dobErrorChecker, "dobErrorChecker");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(uiBuilder, "uiBuilder");
        this.f240576j = navBar;
        this.k = nextButtonView;
        this.f240577l = dobErrorChecker;
        this.f240578m = presentationModel;
        this.f240579n = uiBuilder;
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        c view = (c) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        n nVar = (n) this.f240578m;
        r map = nVar.d.R1().map(new pva.c(3, new f(this, 0)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarF = o70.a.f(map);
        f fVar = new f(this, 1);
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new m3l.d(17, new k(new BreadcrumbException(), 15)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        o9h.d dVar = new o9h.d(10, fVar);
        s sVar = this.i;
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(dVar, new o9h.d(10, sVar), new z(12, function0J));
        ifm.b bVar = this.f239031a;
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        iqi.b bVar2 = (iqi.b) this.k;
        bVar2.setVisible(true);
        bVar2.W();
        bVar2.e0(false);
        bVar2.V(false);
        bVar2.a0(new TextLocalisedClause(R$string.pets_common_action_continue, null, null, 14));
        r map2 = nVar.e.M().filter(new pva.c(5, new px0.a(2))).map(new pva.c(6, new f(this, 3)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        r rVarF2 = o70.a.f(map2);
        pvc.e eVar = new pvc.e(1, view, c.class, "setItems", "setItems(Ljava/util/List;)V", 0, 1);
        Function0 function0J2 = J();
        r rVarOnErrorResumeNext2 = rVarF2.onErrorResumeNext(new m3l.d(17, new k(new BreadcrumbException(), 12)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new o9h.d(10, eVar), new o9h.d(10, sVar), new z(12, function0J2));
        w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        int i = 4;
        r map3 = view.s0().map(new pva.c(i, new pvc.e(1, this.f240577l, com.revolut.feature.insurance_pet.impl.ui.pet.dob.a.class, "check", "check(Lcom/revolut/feature/insurance_pet/impl/ui/pet/dob/DOBInputData;)Lcom/revolut/feature/insurance_pet/impl/ui/pet/dob/DOBInputData;", 0, 2)));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        pfm.a aVar2 = new pfm.a(w.D(map3, new f(this, 2)), new m3l.d(17, new k(new BreadcrumbException(), 13)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new o9h.d(10, sVar), new z(12, g.f240575a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar, hVarW);
        r rVarDistinctUntilChanged = nVar.j3(nx7.e.PET_AGE).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        r rVarF3 = o70.a.f(rVarDistinctUntilChanged);
        pvc.e eVar2 = new pvc.e(1, this.k, iqi.h.class, "setLargeButtonEnabled", "setLargeButtonEnabled(Z)V", 0, 3);
        Function0 function0J3 = J();
        r rVarOnErrorResumeNext3 = rVarF3.onErrorResumeNext(new m3l.d(17, new k(new BreadcrumbException(), 14)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new o9h.d(10, eVar2), new o9h.d(10, sVar), new z(12, function0J3));
        w.j0(bVar, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
    }
}
