package ty7;

import akl.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.feature.insurance_pet.impl.ui.edit.review.PetEditReviewChangesActivity;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import t33.r;
import te0.w;
import tx0.g4;
import tx0.j0;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends bsi.a implements d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xpi.g f275506j;
    public final iqi.h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ly7.b f275507l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ly7.a f275508m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final tpi.j f275509n;
    public final f9b.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final opi.d f275510p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final uy7.f f275511q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mm.d f275512r;

    public p(xpi.g navBar, iqi.h twinVerticalButtonView, ly7.b router, ly7.a presentationModel, tpi.j progressView, f9b.f errorView, opi.d expandableDialogView, uy7.f uiBuilder, mm.d actionsDispatcher) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(twinVerticalButtonView, "twinVerticalButtonView");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        Intrinsics.checkNotNullParameter(uiBuilder, "uiBuilder");
        Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
        this.f275506j = navBar;
        this.k = twinVerticalButtonView;
        this.f275507l = router;
        this.f275508m = presentationModel;
        this.f275509n = progressView;
        this.o = errorView;
        this.f275510p = expandableDialogView;
        this.f275511q = uiBuilder;
        this.f275512r = actionsDispatcher;
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        e view = (e) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pets_pet_details_review_changes_title, null, null, 14);
        xpi.c cVar = (xpi.c) this.f275506j;
        cVar.setVisible(true);
        cVar.n0(textLocalisedClause);
        cVar.p0(textLocalisedClause);
        cVar.c0(j0.MULTILINE);
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        iqi.b bVar = (iqi.b) this.k;
        bVar.setVisible(true);
        bVar.V(true);
        bVar.X(true);
        bVar.Y(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, (Clause) null, 246));
        bVar.Z(true);
        bVar.a0(new TextLocalisedClause(R$string.pets_pet_details_review_changes_confirm_button_title, null, null, 14));
        bVar.e0(false);
        pfm.a aVar2 = new pfm.a(w.D(bVar.N(), new h(this, view)), new nw8.d(11, new r(new BreadcrumbException(), 18)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        t1i.n nVar = new t1i.n(4, n.f275504a);
        s sVar = this.i;
        ofm.h hVarW = aVar2.w(new ly7.g(19, sVar), nVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar2 = this.f239031a;
        w.j0(bVar2, hVarW);
        ihm.b bVar3 = bVar.k;
        g4 g4Var = new g4(1, view, e.class, "updateBottomPadding", "updateBottomPadding(I)V", 0, 2);
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = bVar3.onErrorResumeNext(new nw8.d(11, new r(new BreadcrumbException(), 17)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new ly7.g(19, g4Var), new ly7.g(19, sVar), new t1i.n(4, function0J));
        w.j0(bVar2, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        PetEditReviewChangesActivity petEditReviewChangesActivity = (PetEditReviewChangesActivity) view;
        efm.r rVarHide = petEditReviewChangesActivity.A0.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        efm.r map = rVarHide.distinctUntilChanged().map(new ty1.c(new g(this, 0), 7));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        g gVar = new g(this, 1);
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = map.onErrorResumeNext(new nw8.d(11, new r(new BreadcrumbException(), 16)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new ly7.g(19, gVar), new ly7.g(19, sVar), new t1i.n(4, function0J2));
        w.j0(bVar2, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        pfm.a aVar3 = new pfm.a(w.D(cVar.Q(), new g(this, 11)), new nw8.d(11, new r(new BreadcrumbException(), 14)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new ly7.g(19, sVar), new t1i.n(4, l.f275502a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar2, hVarW2);
        pfm.a aVar4 = new pfm.a(w.D(bVar.O(), new g(this, 10)), new nw8.d(11, new r(new BreadcrumbException(), 15)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new ly7.g(19, sVar), new t1i.n(4, m.f275503a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar2, hVarW3);
        pfm.a aVar5 = new pfm.a(w.D(((TextDelegate) petEditReviewChangesActivity.f76306v0.getValue()).d, new g(this, 4)), new nw8.d(11, new r(new BreadcrumbException(), 12)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new ly7.g(19, sVar), new t1i.n(4, j.f275500a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        w.j0(bVar2, hVarW4);
        ly7.h hVar = (ly7.h) this.f275508m;
        efm.r rVarR = mo3.a.r(o70.a.f(nim.a.w(nim.a.w(pd.b.t(u1.d(hVar.l3(), hVar.m3()), new g(this, 5)), new g(this, 6)), new g(this, 7))), this.f275509n);
        Intrinsics.checkNotNullExpressionValue(rVarR, "withAbsenceDataProgress(...)");
        efm.r rVarN = hx7.a.N(m70.a.g(rVarR, null, new tw8.g(10), 1), this.o, false, false);
        h hVar2 = new h(view, this);
        Function0 function0J3 = J();
        efm.r rVarOnErrorResumeNext3 = rVarN.onErrorResumeNext(new nw8.d(11, new r(new BreadcrumbException(), 11)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new ly7.g(19, hVar2), new ly7.g(19, sVar), new t1i.n(4, function0J3));
        w.j0(bVar2, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
        pfm.a aVar6 = new pfm.a(w.D(((LargeActionButtonDelegate) petEditReviewChangesActivity.f76307w0.getValue()).d.f121375b, new g(this, 2)), new nw8.d(11, new r(new BreadcrumbException(), 13)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar6.w(new ly7.g(19, sVar), new t1i.n(4, k.f275501a));
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        w.j0(bVar2, hVarW5);
        pfm.a aVar7 = new pfm.a(w.D(((CellDetailsDelegate) petEditReviewChangesActivity.u0.getValue()).d, new g(this, 3)), new nw8.d(11, new r(new BreadcrumbException(), 10)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar7, "onErrorResumeNext(...)");
        ofm.h hVarW6 = aVar7.w(new ly7.g(19, sVar), new t1i.n(4, i.f275499a));
        Intrinsics.checkNotNullExpressionValue(hVarW6, "subscribe(...)");
        w.j0(bVar2, hVarW6);
        hVar.i.getClass();
        pfm.m mVar = pfm.m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        pfm.a aVar8 = new pfm.a(ue0.e.v(mVar), new nw8.d(11, new r(new BreadcrumbException(), 19)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar8, "onErrorResumeNext(...)");
        ofm.h hVarW7 = aVar8.w(new ly7.g(19, sVar), new t1i.n(4, o.f275505a));
        Intrinsics.checkNotNullExpressionValue(hVarW7, "subscribe(...)");
        w.j0(bVar2, hVarW7);
    }
}
