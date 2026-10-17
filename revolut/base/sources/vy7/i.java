package vy7;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.feature.insurance_pet.impl.ui.hub.flow.PetHubFlowActivity;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import tnb.g0;
import twl.o;
import vx5.r;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends bsi.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xpi.g f293252j;
    public final b k;

    public i(xpi.g navBarWithToolbarView, b router) {
        Intrinsics.checkNotNullParameter(navBarWithToolbarView, "navBarWithToolbarView");
        Intrinsics.checkNotNullParameter(router, "router");
        this.f293252j = navBarWithToolbarView;
        this.k = router;
    }

    @Override // pri.a
    public final void N(rri.a aVar) {
        e view = (e) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        xpi.c cVar = (xpi.c) this.f293252j;
        cVar.setVisible(true);
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pets_dashboard_header_title, null, null, 14);
        cVar.n0(textLocalisedClause);
        cVar.p0(textLocalisedClause);
        pfm.a aVar2 = new pfm.a(w.D(((PetHubFlowActivity) view).f154555r0.b().f59410q, new vx9.b(this, 11)), new g0(new r(new BreadcrumbException(), 8)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        h function = h.f293251a;
        Intrinsics.checkNotNullParameter(function, "function");
        ofm.h hVarW = aVar2.w(new o(4, this.i), new a1l.c(22));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(this.f239031a, hVarW);
    }
}
