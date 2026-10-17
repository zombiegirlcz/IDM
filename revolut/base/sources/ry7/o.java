package ry7;

import akl.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.feature.insurance_pet.impl.ui.edit.planeditor.PetEditQuoteActivity;
import efm.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import mic.a0;
import ozc.z;
import qp5.x;
import rnb.u;
import te0.w;
import tx0.j0;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends bsi.a implements c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xpi.g f258253j;
    public final ypi.i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ly7.b f258254l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ly7.a f258255m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final tpi.j f258256n;
    public final f9b.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final opi.d f258257p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sy7.a f258258q;

    public o(xpi.g navBar, ypi.i nextButton, ly7.b router, ly7.a presentationModel, tpi.j progressView, f9b.f errorView, opi.d expandableDialogView, sy7.a uiBuilder) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(nextButton, "nextButton");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        Intrinsics.checkNotNullParameter(uiBuilder, "uiBuilder");
        this.f258253j = navBar;
        this.k = nextButton;
        this.f258254l = router;
        this.f258255m = presentationModel;
        this.f258256n = progressView;
        this.o = errorView;
        this.f258257p = expandableDialogView;
        this.f258258q = uiBuilder;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        d view = (d) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pets_pet_details_copayment_title, null, null, 14);
        xpi.c cVar = (xpi.c) this.f258253j;
        cVar.setVisible(true);
        cVar.n0(textLocalisedClause);
        cVar.p0(textLocalisedClause);
        cVar.Z(true);
        cVar.Y(new TextLocalisedClause(R$string.pets_pet_details_copayment_subtitle, null, null, 14));
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        cVar.c0(j0.MULTILINE);
        ypi.i iVar = this.k;
        iVar.setVisible(true);
        iVar.setEnabled(true);
        iVar.f(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14));
        pfm.a aVar2 = new pfm.a(w.D(cVar.Q(), new f(this, 2)), new o9h.d(17, new j(new BreadcrumbException(), 2)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        z zVar = new z(27, l.f258250a);
        s sVar = this.i;
        ofm.h hVarW = aVar2.w(new nw8.d(10, sVar), zVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        pfm.a aVar3 = new pfm.a(w.D(iVar.s(), new f(this, 3)), new o9h.d(17, new j(new BreadcrumbException(), 3)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new nw8.d(10, sVar), new z(27, m.f258251a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        w.j0(bVar, hVarW2);
        PetEditQuoteActivity petEditQuoteActivity = (PetEditQuoteActivity) view;
        pfm.a aVar4 = new pfm.a(w.D(((InputChecklistDelegate) petEditQuoteActivity.u0.getValue()).f52518c, new f(this, 4)), new o9h.d(17, new x(new BreadcrumbException(), 29)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new nw8.d(10, sVar), new z(27, h.f258245a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        w.j0(bVar, hVarW3);
        pfm.a aVar5 = new pfm.a(w.D(((ListSubheaderDelegate) petEditQuoteActivity.f76299v0.getValue()).d, new f(this, 1)), new o9h.d(17, new j(new BreadcrumbException(), 1)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new nw8.d(10, sVar), new z(27, k.f258249a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        w.j0(bVar, hVarW4);
        pfm.a aVar6 = new pfm.a(w.D(((LargeActionButtonDelegate) petEditQuoteActivity.f76300w0.getValue()).d.f121375b, new f(this, 0)), new o9h.d(17, new j(new BreadcrumbException(), 0)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar6.w(new nw8.d(10, sVar), new z(27, i.f258246a));
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        w.j0(bVar, hVarW5);
        ly7.h hVar = (ly7.h) this.f258255m;
        r map = ((ly7.k) hVar.f200733l).x0().c(te0.s.f270018a).map(new a0(10, g.f258244a));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarR = mo3.a.r(u1.d(map, hVar.m3()), this.f258256n);
        Intrinsics.checkNotNullExpressionValue(rVarR, "withAbsenceDataProgress(...)");
        r map2 = m70.a.g(rVarR, null, new ru5.m(23), 1).map(new rxb.f(18, new f(this, 5)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        r rVarN = hx7.a.N(o70.a.f(map2), this.o, false, false);
        u uVar = new u(1, view, d.class, "setItems", "setItems(Ljava/util/List;)V", 0, 14);
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarN.onErrorResumeNext(new o9h.d(17, new x(new BreadcrumbException(), 28)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new nw8.d(10, uVar), new nw8.d(10, sVar), new z(27, function0J));
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        hVar.i.getClass();
        pfm.m mVar = pfm.m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        pfm.a aVar7 = new pfm.a(ue0.e.v(mVar), new o9h.d(17, new j(new BreadcrumbException(), 4)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar7, "onErrorResumeNext(...)");
        ofm.h hVarW6 = aVar7.w(new nw8.d(10, sVar), new z(27, n.f258252a));
        Intrinsics.checkNotNullExpressionValue(hVarW6, "subscribe(...)");
        w.j0(bVar, hVarW6);
    }
}
