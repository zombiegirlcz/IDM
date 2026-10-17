package xz7;

import akl.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument;
import com.revolut.feature.insurance_pet.impl.ui.planbuilder.confirmation.PetPlanConfirmPurchaseActivity;
import efm.r;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nii.o0;
import te0.w;
import tsk.t;
import tx0.j0;
import uz7.p;
import xlb.o;
import xy7.n;
import zhm.d0;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends bsi.a implements b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xpi.g f309879j;
    public final iqi.h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final uz7.b f309880l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final uz7.a f309881m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final tpi.j f309882n;
    public final f9b.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yz7.a f309883p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f309884q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ihm.b f309885r;

    public m(xpi.g navBar, iqi.h twinVerticalButtonView, uz7.b router, uz7.a presentationModel, tpi.j progressView, f9b.f errorView, yz7.a uiBuilder, t policyPurchaseActionDispatcher) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(twinVerticalButtonView, "twinVerticalButtonView");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(uiBuilder, "uiBuilder");
        Intrinsics.checkNotNullParameter(policyPurchaseActionDispatcher, "policyPurchaseActionDispatcher");
        this.f309879j = navBar;
        this.k = twinVerticalButtonView;
        this.f309880l = router;
        this.f309881m = presentationModel;
        this.f309882n = progressView;
        this.o = errorView;
        this.f309883p = uiBuilder;
        this.f309884q = policyPurchaseActionDispatcher;
        ihm.b bVarE = ihm.b.e(new Data(Boolean.FALSE, null, false, 6, null));
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f309885r = bVarE;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        c view = (c) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        p pVar = (p) this.f309881m;
        pVar.d.getClass();
        pfm.m mVar = pfm.m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        pfm.a aVar2 = new pfm.a(ue0.e.v(mVar), new f(0, new n(new BreadcrumbException(), 9)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        t1i.n nVar = new t1i.n(25, l.f309878a);
        s sVar = this.i;
        ofm.h hVarW = aVar2.w(new nw8.d(25, sVar), nVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pets_confirm_purchase_title, null, null, 14);
        xpi.c cVar = (xpi.c) this.f309879j;
        cVar.setVisible(true);
        cVar.n0(textLocalisedClause);
        cVar.p0(textLocalisedClause);
        cVar.c0(j0.MULTILINE);
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        iqi.b bVar2 = (iqi.b) this.k;
        bVar2.setVisible(true);
        bVar2.V(true);
        bVar2.X(true);
        bVar2.Y(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorBackground), (List) null, (ImageTransformations) null, (Clause) null, 246));
        bVar2.Z(false);
        bVar2.a0(new TextLocalisedClause(R$string.pets_confirm_purchase_action_button_title, null, null, 14));
        bVar2.e0(false);
        pfm.a aVar3 = new pfm.a(w.D(bVar2.N(), new xyc.j(this, view, 3)), new f(0, new n(new BreadcrumbException(), 8)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new nw8.d(25, sVar), new t1i.n(25, k.f309877a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        PetPlanConfirmPurchaseActivity petPlanConfirmPurchaseActivity = (PetPlanConfirmPurchaseActivity) view;
        r rVarHide = petPlanConfirmPurchaseActivity.f76363x0.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        r map = rVarHide.distinctUntilChanged().map(new xy7.j(5, new e(this, 4)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        e eVar = new e(this, 5);
        Function0 function0J = J();
        r rVarOnErrorResumeNext = map.onErrorResumeNext(new f(0, new n(new BreadcrumbException(), 7)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new nw8.d(25, eVar), new nw8.d(25, sVar), new t1i.n(25, function0J));
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        pfm.a aVar4 = new pfm.a(w.D(cVar.Q(), new e(this, 1)), new f(0, new n(new BreadcrumbException(), 4)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new nw8.d(25, sVar), new t1i.n(25, h.f309874a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar, hVarW3);
        ihm.f fVar = petPlanConfirmPurchaseActivity.f76362w0.f52518c;
        e eVar2 = new e(this, 6);
        Function0 function0J2 = J();
        r rVarOnErrorResumeNext2 = fVar.onErrorResumeNext(new f(0, new n(new BreadcrumbException(), 1)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new nw8.d(25, eVar2), new nw8.d(25, sVar), new t1i.n(25, function0J2));
        w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        pfm.a aVar5 = new pfm.a(w.D(bVar2.O(), new e(this, 2)), new f(0, new n(new BreadcrumbException(), 5)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new nw8.d(25, sVar), new t1i.n(25, i.f309875a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        w.j0(bVar, hVarW4);
        fx7.f fVar2 = pVar.f284612c;
        uz7.r rVar = (uz7.r) pVar.e;
        r map2 = fVar2.e((Date) rVar.f284618b.i0().get(), (String) rVar.x0().get(), false).map(new o0(21, new uz7.i(pVar, 0)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        r rVarR = mo3.a.r(o70.a.f(nim.a.w(mif.a.f(w.v(nim.a.w(map2, new uz7.e(pVar, 0)), w.h(d0.d1(((Map) pVar.f.f191187a.getValue()).values())), new uyh.s(9)), pVar.q3(), zi0.c.j(new PolicyDocument.ExternalLink(new TextLocalisedClause(R$string.pets_confirm_purchase_documents_general_info, null, null, 14), "https://www.revolut.com/legal/insurance", false)), this.f309885r), new e(this, 7))), this.f309882n);
        Intrinsics.checkNotNullExpressionValue(rVarR, "withAbsenceDataProgress(...)");
        r rVarN = hx7.a.N(m70.a.g(rVarR, null, new xx9.e(24), 1), this.o, false, false);
        o oVar = new o(1, view, c.class, "setItems", "setItems(Ljava/util/List;)V", 0, 14);
        Function0 function0J3 = J();
        r rVarOnErrorResumeNext3 = rVarN.onErrorResumeNext(new f(0, new n(new BreadcrumbException(), 2)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new nw8.d(25, oVar), new nw8.d(25, sVar), new t1i.n(25, function0J3));
        w.j0(bVar, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
        pfm.a aVar6 = new pfm.a(w.D(((RowDelegate) petPlanConfirmPurchaseActivity.u0.getValue()).f53218h, new e(this, 0)), new f(0, new n(new BreadcrumbException(), 6)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar6.w(new nw8.d(25, sVar), new t1i.n(25, j.f309876a));
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        w.j0(bVar, hVarW5);
        pfm.a aVar7 = new pfm.a(w.D(((TextDelegate) petPlanConfirmPurchaseActivity.f76361v0.getValue()).d, new e(this, 3)), new f(0, new n(new BreadcrumbException(), 3)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar7, "onErrorResumeNext(...)");
        ofm.h hVarW6 = aVar7.w(new nw8.d(25, sVar), new t1i.n(25, g.f309873a));
        Intrinsics.checkNotNullExpressionValue(hVarW6, "subscribe(...)");
        w.j0(bVar, hVarW6);
    }
}
