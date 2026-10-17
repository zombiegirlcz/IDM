package ux7;

import a08.f0;
import a08.g0;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_pet.impl.R$string;
import efm.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import tx0.g4;
import up5.s;
import uwi.v;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends bsi.a implements b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xpi.g f283903j;
    public final iqi.h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final nx7.b f283904l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vx7.c f283905m;

    public n(xpi.g navBar, iqi.h nextButtonView, nx7.b presentationModel, vx7.c uiBuilder) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(uiBuilder, "uiBuilder");
        this.f283903j = navBar;
        this.k = nextButtonView;
        this.f283904l = presentationModel;
        this.f283905m = uiBuilder;
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        d view = (d) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pets_onboarding_pet_details_1_header_title, null, null, 14);
        xpi.c cVar = (xpi.c) this.f283903j;
        cVar.n0(textLocalisedClause);
        cVar.p0(textLocalisedClause);
        cVar.l0(false);
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        iqi.b bVar = (iqi.b) this.k;
        bVar.setVisible(true);
        bVar.W();
        bVar.e0(false);
        bVar.V(false);
        bVar.a0(new TextLocalisedClause(R$string.pets_common_action_continue, null, null, 14));
        nx7.n nVar = (nx7.n) this.f283904l;
        r rVarF = nVar.f220459b.F();
        rz7.h hVar = nVar.d;
        r map = w.n(rVarF, hVar.v(), hVar.R1(), nVar.f220460c.Y()).map(new uwf.b(10, new v(14))).map(new uwf.b(11, new h(this, 2)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarF2 = o70.a.f(map);
        g4 g4Var = new g4(1, view, d.class, "setItems", "setItems(Ljava/util/List;)V", 0, 29);
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarF2.onErrorResumeNext(new m3l.d(26, new s(new BreadcrumbException(), 5)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        o9h.d dVar = new o9h.d(20, g4Var);
        akl.s sVar = this.i;
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(dVar, new o9h.d(20, sVar), new t1i.n(7, function0J));
        ifm.b bVar2 = this.f239031a;
        w.j0(bVar2, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        r rVarDistinctUntilChanged = view.X0().filter(new uwf.b(8, new v(12))).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        pfm.a aVar2 = new pfm.a(w.D(rVarDistinctUntilChanged, new h(this, 0)), new m3l.d(26, new s(new BreadcrumbException(), 8)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new o9h.d(20, sVar), new t1i.n(7, m.f283902a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar2, hVarW);
        r rVarFilter = view.y1().filter(new uwf.b(9, new v(13)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        r map2 = rVarFilter.filter(new g0(4, j.f283899a)).map(new f0(2, k.f283900a));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        pfm.a aVar3 = new pfm.a(w.D(map2, new h(this, 1)), new m3l.d(26, new s(new BreadcrumbException(), 7)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new o9h.d(20, sVar), new t1i.n(7, l.f283901a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar2, hVarW2);
        r rVarDistinctUntilChanged2 = nVar.j3(nx7.e.BASE_DETAILS).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
        i iVar = new i(1, this.k, iqi.h.class, "setLargeButtonEnabled", "setLargeButtonEnabled(Z)V", 0, 0);
        Function0 function0J2 = J();
        r rVarOnErrorResumeNext2 = rVarDistinctUntilChanged2.onErrorResumeNext(new m3l.d(26, new s(new BreadcrumbException(), 6)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new o9h.d(20, iVar), new o9h.d(20, sVar), new t1i.n(7, function0J2));
        w.j0(bVar2, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
    }
}
