package az7;

import a08.q;
import a2i.j;
import akl.s;
import auj.o;
import av8.n;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_pet.impl.R$string;
import efm.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import tx0.j0;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends bsi.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xpi.g f11399j;
    public final ypi.i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f9b.f f11400l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f11401m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f11402n;
    public final bz7.b o;

    public g(xpi.g navBarView, ypi.i nextButtonView, f9b.f errorView, e presentationModel, b router, bz7.b uiBuilder) {
        Intrinsics.checkNotNullParameter(navBarView, "navBarView");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(uiBuilder, "uiBuilder");
        this.f11399j = navBarView;
        this.k = nextButtonView;
        this.f11400l = errorView;
        this.f11401m = presentationModel;
        this.f11402n = router;
        this.o = uiBuilder;
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        c view = (c) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pets_dashboard_issues_address_not_supported_title, null, null, 14);
        xpi.c cVar = (xpi.c) this.f11399j;
        cVar.n0(textLocalisedClause);
        cVar.p0(textLocalisedClause);
        cVar.c0(j0.MULTILINE);
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14);
        ypi.i iVar = this.k;
        iVar.f(textLocalisedClause2);
        r rVarMerge = r.merge(cVar.Q(), iVar.s());
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        pfm.a aVar2 = new pfm.a(w.D(rVarMerge, new o(this, 23)), new a08.r(6, new j(new BreadcrumbException(), 21)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        q qVar = new q(6, f.f11398a);
        s sVar = this.i;
        ofm.h hVarW = aVar2.w(new a0d.g(3, sVar), qVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        r rVarN = hx7.a.N(o70.a.f(m70.a.f(((w4l.f) ((kx7.w) this.f11401m.f11397b.f138763a).f.getValue()).f(Unit.f186387a, true), new a2f.q(this, 22), new n(this, 7), new axd.e(4))), this.f11400l, false, false);
        as9.a aVar3 = new as9.a(view, this, 15);
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarN.onErrorResumeNext(new a08.r(6, new j(new BreadcrumbException(), 20)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new a0d.g(3, aVar3), new a0d.g(3, sVar), new q(6, function0J));
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }
}
