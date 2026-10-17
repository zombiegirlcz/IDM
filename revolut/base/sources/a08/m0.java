package a08;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedGenderClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_pet.impl.R$string;
import java.util.Date;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zw7.h1;

/* JADX INFO: loaded from: classes4.dex */
public final class m0 extends a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xpi.g f198j;
    public final iqi.h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final uz7.b f199l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final uz7.a f200m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b08.c f201n;
    public final yx7.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mm.d f202p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(xpi.g navBar, iqi.h twinVerticalButtonView, uz7.b router, uz7.a presentationModel, b08.c uiBuilder, yx7.h petImageBuilder, mm.d actionDispatcher) {
        super(navBar, twinVerticalButtonView);
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(twinVerticalButtonView, "twinVerticalButtonView");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(uiBuilder, "uiBuilder");
        Intrinsics.checkNotNullParameter(petImageBuilder, "petImageBuilder");
        Intrinsics.checkNotNullParameter(actionDispatcher, "actionDispatcher");
        this.f198j = navBar;
        this.k = twinVerticalButtonView;
        this.f199l = router;
        this.f200m = presentationModel;
        this.f201n = uiBuilder;
        this.o = petImageBuilder;
        this.f202p = actionDispatcher;
    }

    @Override // a08.g
    public final void A(j view) {
        Intrinsics.checkNotNullParameter(view, "view");
        N(null, true);
    }

    @Override // a08.g
    public final void D(h1 quote) {
        String str;
        boolean z = quote != null;
        iqi.b bVar = (iqi.b) this.k;
        bVar.setVisible(z);
        if (quote != null) {
            this.f201n.getClass();
            Intrinsics.checkNotNullParameter(quote, "quote");
            int i = R$string.pets_plan_builder_footer_monthly_price_title;
            zw7.l lVar = quote.e;
            if (lVar == null || (str = lVar.f325811a) == null) {
                str = quote.f325792b;
            }
            bVar.a0(new TextLocalisedClause(i, zhm.u.c(str), null, 12));
        }
    }

    @Override // a08.g
    public final ifm.c F() {
        NavBarWithToolbar navBarWithToolbar = ((xpi.c) this.f198j).f307974j;
        if (navBarWithToolbar == null) {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
        qfm.r0 r0VarD = te0.w.D(navBarWithToolbar.q0(), new d0(this, 2));
        Function1 function1K = K();
        pfm.a aVar = new pfm.a(r0VarD, new g0(0, new p(new BreadcrumbException(), 17)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new f0(0, function1K), new q(1, j0.f190a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(this.f239031a, hVarW);
        return hVarW;
    }

    @Override // a08.g
    public final ifm.c H(j view) {
        Intrinsics.checkNotNullParameter(view, "view");
        qfm.r0 r0VarD = te0.w.D(((iqi.b) this.k).N(), new o(this, view));
        Function1 function1K = K();
        pfm.a aVar = new pfm.a(r0VarD, new g0(0, new p(new BreadcrumbException(), 19)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new f0(0, function1K), new q(1, l0.f195a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(this.f239031a, hVarW);
        return hVarW;
    }

    @Override // a08.g
    public final boolean b() {
        return true;
    }

    @Override // a08.g
    public final void f(zw7.d0 pet) {
        Intrinsics.checkNotNullParameter(pet, "pet");
        TextLocalisedGenderClause textLocalisedGenderClause = new TextLocalisedGenderClause(pet.e.b(), R$string.pets_plan_builder_title_male, zhm.u.c(pet.d));
        xpi.c cVar = (xpi.c) this.f198j;
        cVar.n0(textLocalisedGenderClause);
        cVar.p0(textLocalisedGenderClause);
        cVar.a0(this.o.a(pet));
        cVar.b0(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_pencil, R$attr.uikit_colorWhite, R$attr.uikit_colorAccent));
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        j view = (j) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        ((uz7.p) this.f200m).d.getClass();
        pfm.m mVar = pfm.m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        pfm.a aVarV = ue0.e.v(mVar);
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(aVarV, new g0(0, new p(new BreadcrumbException(), 14)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new f0(0, function1K), new q(1, e0.f179a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(this.f239031a, hVarW);
    }

    @Override // a08.g
    public final void k() {
        qfm.r0 r0VarD = te0.w.D(((iqi.b) this.k).O(), new d0(this, 3));
        Function1 function1K = K();
        pfm.a aVar = new pfm.a(r0VarD, new g0(0, new p(new BreadcrumbException(), 18)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new f0(0, function1K), new q(1, k0.f191a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(this.f239031a, hVarW);
    }

    @Override // a08.g
    public final ifm.c m() {
        qfm.r0 r0VarD = te0.w.D(((xpi.c) this.f198j).Q(), new d0(this, 0));
        Function1 function1K = K();
        pfm.a aVar = new pfm.a(r0VarD, new g0(0, new p(new BreadcrumbException(), 16)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new f0(0, function1K), new q(1, i0.f189a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(this.f239031a, hVarW);
        return hVarW;
    }

    @Override // a08.g
    public final ifm.c n() {
        NavBarWithToolbar navBarWithToolbar = ((xpi.c) this.f198j).f307974j;
        if (navBarWithToolbar == null) {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
        qfm.r0 r0VarD = te0.w.D(navBarWithToolbar.r0(), new d0(this, 1));
        Function1 function1K = K();
        pfm.a aVar = new pfm.a(r0VarD, new g0(0, new p(new BreadcrumbException(), 15)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new f0(0, function1K), new q(1, h0.f186a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(this.f239031a, hVarW);
        return hVarW;
    }

    @Override // a08.g
    public final ifm.c o(j view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return null;
    }

    @Override // a08.g
    public final ifm.c q() {
        return null;
    }

    @Override // a08.g
    public final void v(Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pets_plan_review_subtitle, zhm.u.c(new TimeClause(date.getTime(), new TimeClause.Format.DayAndMonth(0), null, null, 12)), new Custom(new Custom.Color.Solid(R$attr.uikit_colorAccent), false, false, 254), 8);
        xpi.c cVar = (xpi.c) this.f198j;
        cVar.Z(true);
        cVar.Y(textLocalisedClause);
    }

    @Override // a08.g
    public final ifm.c x(j view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return null;
    }

    @Override // a08.g
    public final void z(boolean z) {
        ((iqi.b) this.k).R(!z, true);
    }
}
