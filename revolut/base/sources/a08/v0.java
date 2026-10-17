package a08;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedGenderClause;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.feature.insurance_pet.impl.ui.planbuilder.plan.PetPlanBuilderActivity;
import java.util.Date;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zw7.h1;
import zw7.k1;

/* JADX INFO: loaded from: classes4.dex */
public final class v0 extends a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xpi.g f229j;
    public final iqi.h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final uz7.b f230l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final uz7.a f231m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final yx7.h f232n;
    public final mm.d o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(xpi.g navBar, iqi.h twinVerticalButtonView, uz7.b router, uz7.a presentationModel, yx7.h petImageBuilder, mm.d actionDispatcher) {
        super(navBar, twinVerticalButtonView);
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(twinVerticalButtonView, "twinVerticalButtonView");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(petImageBuilder, "petImageBuilder");
        Intrinsics.checkNotNullParameter(actionDispatcher, "actionDispatcher");
        this.f229j = navBar;
        this.k = twinVerticalButtonView;
        this.f230l = router;
        this.f231m = presentationModel;
        this.f232n = petImageBuilder;
        this.o = actionDispatcher;
    }

    @Override // a08.g
    public final void A(j view) {
        Intrinsics.checkNotNullParameter(view, "view");
        N(new TextLocalisedClause(R$string.pets_plan_builder_footer_cancel_renewal_title, null, null, 14), false);
    }

    @Override // a08.g
    public final void D(h1 h1Var) {
        String str;
        boolean z = h1Var != null;
        iqi.b bVar = (iqi.b) this.k;
        bVar.setVisible(z);
        if (h1Var != null) {
            uz7.r rVar = (uz7.r) ((uz7.p) this.f231m).e;
            int i = ((Boolean) rVar.f284623l.getValue(rVar, uz7.r.f284617m[9]).get()).booleanValue() ? R$string.pets_plan_builder_footer_renewal_title : R$string.pets_plan_builder_footer_renew_title;
            zw7.l lVar = h1Var.e;
            if (lVar == null || (str = lVar.f325811a) == null) {
                str = h1Var.f325792b;
            }
            bVar.a0(new TextLocalisedClause(i, zhm.u.c(str), null, 12));
        }
    }

    @Override // a08.g
    public final ifm.c F() {
        return null;
    }

    @Override // a08.g
    public final ifm.c H(j view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return null;
    }

    @Override // a08.g
    public final boolean b() {
        return false;
    }

    @Override // a08.g
    public final void f(zw7.d0 pet) {
        Intrinsics.checkNotNullParameter(pet, "pet");
        TextLocalisedGenderClause textLocalisedGenderClause = new TextLocalisedGenderClause(pet.e.b(), R$string.pets_plan_builder_title_male, zhm.u.c(pet.d));
        xpi.c cVar = (xpi.c) this.f229j;
        cVar.n0(textLocalisedGenderClause);
        cVar.p0(textLocalisedGenderClause);
        cVar.a0(this.f232n.a(pet));
        zw7.s0 s0Var = pet.o;
        Intrinsics.checkNotNullParameter(s0Var, "<this>");
        k1 k1Var = ((zw7.r0) s0Var).f325848p;
        ((iqi.b) this.k).e0(pd.b.j(k1Var != null ? Boolean.valueOf(k1Var.f325809b) : null));
    }

    @Override // a08.g
    public final void k() {
        qfm.r0 r0VarD = te0.w.D(((iqi.b) this.k).O(), new n0(this, 4));
        Function1 function1K = K();
        pfm.a aVar = new pfm.a(r0VarD, new p0(0, new p(new BreadcrumbException(), 21)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new o0(0, function1K), new q(2, r0.f220a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(this.f239031a, hVarW);
    }

    @Override // a08.g
    public final ifm.c m() {
        qfm.r0 r0VarD = te0.w.D(((xpi.c) this.f229j).Q(), new n0(this, 3));
        Function1 function1K = K();
        pfm.a aVar = new pfm.a(r0VarD, new p0(0, new p(new BreadcrumbException(), 20)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new o0(0, function1K), new q(2, q0.f217a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(this.f239031a, hVarW);
        return hVarW;
    }

    @Override // a08.g
    public final ifm.c n() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // a08.g
    public final ifm.c o(j view) {
        Intrinsics.checkNotNullParameter(view, "view");
        qfm.r0 r0VarD = te0.w.D(((TwinHorizontalButtonDelegate) ((PetPlanBuilderActivity) view).C0.getValue()).f53572c.f121375b, new n0(this, 1));
        Function1 function1K = K();
        pfm.a aVar = new pfm.a(r0VarD, new p0(0, new p(new BreadcrumbException(), 23)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new o0(0, function1K), new q(2, t0.f225a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(this.f239031a, hVarW);
        return hVarW;
    }

    @Override // a08.g
    public final ifm.c q() {
        qfm.r0 r0VarD = te0.w.D(((iqi.b) this.k).Q(), new n0(this, 0));
        Function1 function1K = K();
        pfm.a aVar = new pfm.a(r0VarD, new p0(0, new p(new BreadcrumbException(), 22)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new o0(0, function1K), new q(2, s0.f223a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(this.f239031a, hVarW);
        return hVarW;
    }

    @Override // a08.g
    public final void v(Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // a08.g
    public final ifm.c x(j view) {
        Intrinsics.checkNotNullParameter(view, "view");
        qfm.r0 r0VarD = te0.w.D(te0.w.B0(((TwinHorizontalButtonDelegate) ((PetPlanBuilderActivity) view).C0.getValue()).d.f121375b, m70.a.g(((uz7.p) this.f231m).p3(), null, new n(1), 1)), new n0(this, 2));
        Function1 function1K = K();
        pfm.a aVar = new pfm.a(r0VarD, new p0(0, new p(new BreadcrumbException(), 24)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new o0(0, function1K), new q(2, u0.f227a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(this.f239031a, hVarW);
        return hVarW;
    }

    @Override // a08.g
    public final void z(boolean z) {
    }
}
