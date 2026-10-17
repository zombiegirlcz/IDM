package xy7;

import akl.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_pet.impl.R$string;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import tx0.j0;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends bsi.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xpi.g f309642j;
    public final ypi.i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f9b.f f309643l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k f309644m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f f309645n;
    public final yy7.c o;

    public o(xpi.g navBarView, ypi.i nextButtonView, f9b.f errorView, k presentationModel, f router, yy7.c uiBuilder) {
        Intrinsics.checkNotNullParameter(navBarView, "navBarView");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(uiBuilder, "uiBuilder");
        this.f309642j = navBarView;
        this.k = nextButtonView;
        this.f309643l = errorView;
        this.f309644m = presentationModel;
        this.f309645n = router;
        this.o = uiBuilder;
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        g view = (g) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pets_dashboard_issues_address_change_title, null, null, 14);
        xpi.c cVar = (xpi.c) this.f309642j;
        cVar.n0(textLocalisedClause);
        cVar.p0(textLocalisedClause);
        cVar.c0(j0.MULTILINE);
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14);
        ypi.i iVar = this.k;
        iVar.f(textLocalisedClause2);
        efm.r rVarMerge = efm.r.merge(cVar.Q(), iVar.s());
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        pfm.a aVar2 = new pfm.a(w.D(rVarMerge, new xw9.c(this, 12)), new l(0, new n(new BreadcrumbException(), 0)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        t1i.n nVar = new t1i.n(24, m.f309639a);
        s sVar = this.i;
        ofm.h hVarW = aVar2.w(new n1i.b(27, sVar), nVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        k kVar = this.f309644m;
        efm.r rVarN = hx7.a.N(o70.a.f(m70.a.f(pd.b.t(((w4l.f) ((kx7.w) kVar.f309635b.f138763a).e.getValue()).f(Unit.f186387a, true), new i(kVar, 0)), new xo8.j0(this, 10), new xwd.a(this, 4), new xx9.e(18))), this.f309643l, false, false);
        xpe.c cVar2 = new xpe.c(view, this, 28);
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarN.onErrorResumeNext(new l(0, new x94.q(new BreadcrumbException(), 29)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new n1i.b(27, cVar2), new n1i.b(27, sVar), new t1i.n(24, function0J));
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }
}
