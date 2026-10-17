package x03;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_management.impl.ui.replace_reasons.CardSelectReplaceReasonActivity;
import com.revolut.feature.cards_core.R$string;
import efm.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import qfm.r0;
import te0.s;
import te0.w;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends pri.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f301473h;
    public final f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xpi.g f301474j;
    public final c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final tpi.j f301475l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f9b.f f301476m;

    public n(h presentationModel, f itemsProvider, xpi.g navBarWithToolbarView, c router, tpi.j progressView, f9b.f errorView) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(itemsProvider, "itemsProvider");
        Intrinsics.checkNotNullParameter(navBarWithToolbarView, "navBarWithToolbarView");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        this.f301473h = presentationModel;
        this.i = itemsProvider;
        this.f301474j = navBarWithToolbarView;
        this.k = router;
        this.f301475l = progressView;
        this.f301476m = errorView;
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        e view = (e) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        h hVar = this.f301473h;
        d0 d0VarJ3 = hVar.j3();
        yf.c cVar = hVar.e;
        r rVar = (r) hVar.f301465b;
        ufm.i iVarX = nim.a.x(cVar.g((String) rVar.w0().get()), new wyc.p(16));
        od0.i.Companion.getClass();
        ufm.i iVar = new ufm.i(iVarX, new wx9.b(new wyc.p(17), 12), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        z zVarF = ue0.e.F(zi0.c.t(iVar), od0.i.f224256b);
        d0 d0VarFirstOrError = rVar.f301485c.getValue(rVar, r.e[1]).c(s.f270018a).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        ufm.i iVar2 = new ufm.i(w.I0(d0VarJ3, zVarF, d0VarFirstOrError), new wx9.b(new wyc.p(15), 10), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        ufm.i iVar3 = new ufm.i(iVar2, new wx9.b(new i(this, 0), 14), 1);
        Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
        ufm.n nVarB = o70.a.b(iVar3);
        wwa.a aVar2 = new wwa.a(this, view, 14);
        Function1 function1K = K();
        ufm.i iVar4 = new ufm.i(nVarB, new twl.o(7, new wrj.p(new BreadcrumbException(), 9)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar4, "onErrorResumeNext(...)");
        ofm.i iVar5 = new ofm.i(new wl3.e(1, aVar2), new wl3.e(1, function1K), 0);
        iVar4.q(iVar5);
        Intrinsics.checkNotNullExpressionValue(iVar5, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, iVar5);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.card_action_replace_title, null, null, 14);
        xpi.c cVar2 = (xpi.c) this.f301474j;
        cVar2.n0(textLocalisedClause);
        cVar2.e0(Integer.valueOf(R$drawable.uikit_icn_24_back));
        r0 r0VarD = w.D(cVar2.Q(), new i(this, 1));
        Function1 function1K2 = K();
        pfm.a aVar3 = new pfm.a(r0VarD, new twl.o(7, new wrj.p(new BreadcrumbException(), 10)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar3.w(new wl3.e(1, function1K2), new t1i.n(18, j.f301469a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(bVar, hVarW);
        efm.r map = ((InputDisclosureDelegate) ((CardSelectReplaceReasonActivity) view).u0.getValue()).f52538c.map(new wx9.b(new wyc.p(14), 9));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r map2 = map.map(new wx9.b(new wyc.p(18), 15));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        efm.b bVarL = hx7.a.L(w.D(map2, new i(this, 2)), this.f301476m, true, null, 24);
        Function1 function1K3 = K();
        pfm.a aVar4 = new pfm.a(bVarL, new twl.o(7, new wrj.p(new BreadcrumbException(), 11)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar4.w(new wl3.e(1, function1K3), new t1i.n(18, k.f301470a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
    }
}
