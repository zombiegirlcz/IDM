package s08;

import akl.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.feature.insurance_pet.impl.ui.profile.plan.PetPolicyDetailsActivity;
import efm.r;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ozc.z;
import rp0.y;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends bsi.a implements c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xpi.g f258893j;
    public final ypi.i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f08.d f258894l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f08.a f258895m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f9b.f f258896n;
    public final opi.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u08.a f258897p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g08.k f258898q;

    public p(xpi.g navBar, ypi.i nextButton, f08.d router, f08.a presentationModel, f9b.f errorView, opi.d expandableDialogView, u08.a clipboardDelegate, g08.k uiBuilder) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(nextButton, "nextButton");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        Intrinsics.checkNotNullParameter(clipboardDelegate, "clipboardDelegate");
        Intrinsics.checkNotNullParameter(uiBuilder, "uiBuilder");
        this.f258893j = navBar;
        this.k = nextButton;
        this.f258894l = router;
        this.f258895m = presentationModel;
        this.f258896n = errorView;
        this.o = expandableDialogView;
        this.f258897p = clipboardDelegate;
        this.f258898q = uiBuilder;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        d view = (d) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pets_plan_detail_header_title, null, null, 14);
        xpi.c cVar = (xpi.c) this.f258893j;
        cVar.setVisible(true);
        cVar.n0(textLocalisedClause);
        cVar.p0(textLocalisedClause);
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_back));
        this.f258898q.getClass();
        cVar.d0(u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "NAV_MENU_ITEM_FAQ_ID", new ResourceImage(R$drawable.uikit_icn_24_question_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124)));
        ypi.i iVar = this.k;
        iVar.setVisible(false);
        iVar.setEnabled(false);
        pfm.a aVar2 = new pfm.a(w.D(cVar.Q(), new f(this, 1)), new ly7.g(15, new ry7.j(new BreadcrumbException(), 8)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        z zVar = new z(28, j.f258887a);
        s sVar = this.i;
        ofm.h hVarW = aVar2.w(new n1i.b(15, sVar), zVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        pfm.a aVar3 = new pfm.a(w.D(cVar.b(), new f(this, 6)), new ly7.g(15, new ry7.j(new BreadcrumbException(), 9)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new n1i.b(15, sVar), new z(28, k.f258888a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        PetPolicyDetailsActivity petPolicyDetailsActivity = (PetPolicyDetailsActivity) view;
        pfm.a aVar4 = new pfm.a(w.D(((SmallActionButtonDelegate) petPolicyDetailsActivity.f76412v0.getValue()).f53336c.f121375b, new f(this, 0)), new ly7.g(15, new ry7.j(new BreadcrumbException(), 12)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new n1i.b(15, sVar), new z(28, n.f258891a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar, hVarW3);
        pfm.a aVar5 = new pfm.a(w.D(((CellDetailsActionDelegate) petPolicyDetailsActivity.f76413w0.getValue()).d, new f(this, 4)), new ly7.g(15, new ry7.j(new BreadcrumbException(), 5)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new n1i.b(15, sVar), new z(28, h.f258885a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        w.j0(bVar, hVarW4);
        ?? r56 = petPolicyDetailsActivity.f76414x0;
        pfm.a aVar6 = new pfm.a(w.D(((RowDelegate) r56.getValue()).f53218h, new f(this, 3)), new ly7.g(15, new ry7.j(new BreadcrumbException(), 10)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar6.w(new n1i.b(15, sVar), new z(28, l.f258889a));
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        w.j0(bVar, hVarW5);
        pfm.a aVar7 = new pfm.a(w.D(((RowDelegate) r56.getValue()).k, new f(this, 5)), new ly7.g(15, new ry7.j(new BreadcrumbException(), 11)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar7, "onErrorResumeNext(...)");
        ofm.h hVarW6 = aVar7.w(new n1i.b(15, sVar), new z(28, m.f258890a));
        Intrinsics.checkNotNullExpressionValue(hVarW6, "subscribe(...)");
        w.j0(bVar, hVarW6);
        pfm.a aVar8 = new pfm.a(w.D(((LargeActionButtonDelegate) petPolicyDetailsActivity.y0.getValue()).d.f121375b, new f(this, 2)), new ly7.g(15, new ry7.j(new BreadcrumbException(), 7)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar8, "onErrorResumeNext(...)");
        ofm.h hVarW7 = aVar8.w(new n1i.b(15, sVar), new z(28, i.f258886a));
        Intrinsics.checkNotNullExpressionValue(hVarW7, "subscribe(...)");
        w.j0(bVar, hVarW7);
        f08.h hVar = (f08.h) this.f258895m;
        r rVarG = m70.a.g(hVar.l3(), null, new ryd.l(17), 1);
        r rVarN = new rfm.m(hVar.e.d.c(), new ey7.a(new f08.f(hVar, 0), 9), 1).n();
        Intrinsics.checkNotNullExpressionValue(rVarN, "toObservable(...)");
        r map = o70.a.f(w.l(rVarG, rVarN)).map(new g(0, new f(this, 7))).doOnNext(new g(1, new f(this, 8))).map(new ryd.j(new f(this, 9), 29));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarN2 = hx7.a.N(map, this.f258896n, false, false);
        rnb.u uVar = new rnb.u(1, view, d.class, "setItems", "setItems(Ljava/util/List;)V", 0, 16);
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarN2.onErrorResumeNext(new ly7.g(15, new ry7.j(new BreadcrumbException(), 6)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new n1i.b(15, uVar), new n1i.b(15, sVar), new z(28, function0J));
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }

    public final pfm.h Q(y yVar) {
        pfm.h hVar = new pfm.h(new rzc.b(this, yVar, 1), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }
}
