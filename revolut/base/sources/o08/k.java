package o08;

import akl.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.feature.insurance_pet.impl.ui.profile.petdetails.PetDetailsActivity;
import com.revolut.revolut.feature_fourthline_impl.R;
import efm.r;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import n08.e0;
import nvg.b0;
import ny7.t;
import pfm.m;
import te0.w;
import tx0.j0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends bsi.a implements b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xpi.g f221180j;
    public final ypi.i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f9b.f f221181l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f08.a f221182m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f08.d f221183n;
    public final p08.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e0 f221184p;

    public k(xpi.g navBar, ypi.i nextButton, f9b.f errorView, f08.a presentationModel, f08.d router, p08.b uiBuilder, e0 profileScreenMapper) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(nextButton, "nextButton");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(uiBuilder, "uiBuilder");
        Intrinsics.checkNotNullParameter(profileScreenMapper, "profileScreenMapper");
        this.f221180j = navBar;
        this.k = nextButton;
        this.f221181l = errorView;
        this.f221182m = presentationModel;
        this.f221183n = router;
        this.o = uiBuilder;
        this.f221184p = profileScreenMapper;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        c view = (c) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pets_pet_details_details_title, null, null, 14);
        xpi.c cVar = (xpi.c) this.f221180j;
        cVar.setVisible(true);
        cVar.n0(textLocalisedClause);
        cVar.p0(textLocalisedClause);
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        cVar.c0(j0.MULTILINE);
        this.o.getClass();
        cVar.d0(u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "NAV_FAQ_MENU_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_question_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124)));
        pfm.a aVar2 = new pfm.a(w.D(cVar.Q(), new e(this, 1)), new lhi.b(13, new t(new BreadcrumbException(), 20)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        j7a.j jVar = new j7a.j(25, h.f221177a);
        s sVar = this.i;
        ofm.h hVarW = aVar2.w(new m3l.d(7, sVar), jVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        pfm.a aVar3 = new pfm.a(w.D(cVar.b(), new e(this, 2)), new lhi.b(13, new t(new BreadcrumbException(), 21)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new m3l.d(7, sVar), new j7a.j(25, i.f221178a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        ypi.i iVar = this.k;
        iVar.setEnabled(true);
        iVar.f(new TextLocalisedClause(R.string.common_action_edit, null, null, 14));
        f08.h hVar = (f08.h) this.f221182m;
        r rVarN = hx7.a.N(o70.a.f(m70.a.f(hVar.l3(), new nrd.i(this, 8), new nx2.f(this, 8), new nz7.g(8))), this.f221181l, false, false);
        b0 b0Var = new b0(this, view, 16);
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarN.onErrorResumeNext(new lhi.b(13, new t(new BreadcrumbException(), 18)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new m3l.d(7, b0Var), new m3l.d(7, sVar), new j7a.j(25, function0J));
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        pfm.a aVar4 = new pfm.a(w.D(iVar.s(), new e(this, 3)), new lhi.b(13, new t(new BreadcrumbException(), 19)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new m3l.d(7, sVar), new j7a.j(25, g.f221176a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar, hVarW3);
        pfm.a aVar5 = new pfm.a(w.D(((CellDetailsChevronDelegate) ((PetDetailsActivity) view).u0.getValue()).f51821c, new e(this, 4)), new lhi.b(13, new t(new BreadcrumbException(), 17)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new m3l.d(7, sVar), new j7a.j(25, f.f221175a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        w.j0(bVar, hVarW4);
        hVar.f131014g.getClass();
        m mVar = m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        pfm.a aVar6 = new pfm.a(ue0.e.v(mVar), new lhi.b(13, new t(new BreadcrumbException(), 22)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar6.w(new m3l.d(7, sVar), new j7a.j(25, j.f221179a));
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        w.j0(bVar, hVarW5);
    }
}
