package gz7;

import a08.o0;
import a08.p0;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument;
import com.revolut.feature.insurance_pet.impl.ui.hub.issues.renewal.RenewalDetailsActivity;
import com.revolut.feature.insurance_pet.impl.ui.hub.issues.renewal.RenewalDetailsContract$Configuration;
import com.revolut.feature.insurance_pet.impl.ui.hub.issues.renewal.RenewalDetailsContract$RenewalOptInUpdateSterilizedAction;
import com.revolut.feature.insurance_pet.impl.ui.hub.issues.renewal.action.PetRenewalActionContract$RenewalOptInAction;
import com.revolut.feature.insurance_pet.impl.ui.planbuilder.plan.PetPlanBuilderContract$Configuration;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import gld.h0;
import java.util.Date;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import rp0.y;
import tx0.j0;
import zw7.c0;
import zw7.d0;
import zw7.q0;
import zw7.r0;
import zw7.s0;
import zw7.z;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends bsi.a implements d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xpi.g f147962j;
    public final iqi.h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f9b.f f147963l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final opi.d f147964m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l f147965n;
    public final h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final iz7.c f147966p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final iz7.a f147967q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final RenewalDetailsContract$Configuration f147968r;

    public v(xpi.g navBarView, iqi.h twinVerticalButtonView, f9b.f errorView, opi.d expandableDialogView, l presentationModel, h router, iz7.c uiBuilder, iz7.a screenRendering, RenewalDetailsContract$Configuration configuration) {
        Intrinsics.checkNotNullParameter(navBarView, "navBarView");
        Intrinsics.checkNotNullParameter(twinVerticalButtonView, "twinVerticalButtonView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(uiBuilder, "uiBuilder");
        Intrinsics.checkNotNullParameter(screenRendering, "screenRendering");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f147962j = navBarView;
        this.k = twinVerticalButtonView;
        this.f147963l = errorView;
        this.f147964m = expandableDialogView;
        this.f147965n = presentationModel;
        this.o = router;
        this.f147966p = uiBuilder;
        this.f147967q = screenRendering;
        this.f147968r = configuration;
    }

    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        i view = (i) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        iz7.a aVar2 = this.f147967q;
        xpi.c cVar = (xpi.c) aVar2.f169849a;
        cVar.setVisible(true);
        cVar.Z(false);
        cVar.l0(false);
        cVar.c0(j0.MULTILINE);
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        final int i = 7;
        pfm.a aVar3 = new pfm.a(te0.w.D(((xpi.c) this.f147962j).Q(), new Function1(this) { // from class: gz7.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f147953b;

            {
                this.f147953b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        CellDetailsSwitcherDelegate.Model model = (CellDetailsSwitcherDelegate.Model) pair.f186385a;
                        g gVar = (g) pair.f186386b;
                        if (gVar instanceof e) {
                            throw new IllegalStateException("Multiple view model should not have any cell delegate switch");
                        }
                        if (!(gVar instanceof f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d0 pet = ((f) gVar).f147946a.f147943a;
                        if (pet == null) {
                            pfm.m mVar = pfm.m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                            return mVar;
                        }
                        h hVar = this.f147953b.o;
                        boolean z = model.f51915c;
                        w wVar = (w) hVar;
                        wVar.getClass();
                        Intrinsics.checkNotNullParameter(pet, "pet");
                        mm.d dVar = wVar.f147969a;
                        s0 s0Var = pet.o;
                        Intrinsics.checkNotNullParameter(s0Var, "<this>");
                        return dVar.c0(new RenewalDetailsContract$RenewalOptInUpdateSterilizedAction(((r0) s0Var).f325839a, !z));
                    case 1:
                        h hVar2 = this.f147953b.o;
                        Pair pair2 = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                        g gVar2 = (g) pair2.f186386b;
                        if (gVar2 instanceof e) {
                            return ((w) hVar2).a();
                        }
                        if (!(gVar2 instanceof f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c planRenewalDetail = ((f) gVar2).f147946a;
                        if (planRenewalDetail.f147944b.f325835c) {
                            return ((w) hVar2).a();
                        }
                        w wVar2 = (w) hVar2;
                        wVar2.getClass();
                        Intrinsics.checkNotNullParameter(planRenewalDetail, "planRenewalDetail");
                        mm.d dVar2 = wVar2.f147969a;
                        d0 d0Var = planRenewalDetail.f147943a;
                        if (d0Var != null) {
                            return dVar2.c0(new PetRenewalActionContract$RenewalOptInAction(d0Var.f325764a, null, true, true, null));
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 2:
                        Pair pair3 = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                        g gVar3 = (g) pair3.f186386b;
                        if (gVar3 instanceof e) {
                            throw new IllegalStateException("Opted-out Multiple view model should not have any secondary button");
                        }
                        if (!(gVar3 instanceof f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        h hVar3 = this.f147953b.o;
                        c planRenewalDetail2 = ((f) gVar3).f147946a;
                        w wVar3 = (w) hVar3;
                        wVar3.getClass();
                        Intrinsics.checkNotNullParameter(planRenewalDetail2, "planRenewalDetail");
                        d0 d0Var2 = planRenewalDetail2.f147943a;
                        q0 q0Var = planRenewalDetail2.f147944b;
                        if (d0Var2 == null) {
                            pfm.m mVar2 = pfm.m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                            return mVar2;
                        }
                        a08.k.Companion.getClass();
                        ExplicitActivityDestination explicitActivityDestination = a08.f.f181b;
                        String str = d0Var2.f325764a;
                        c0 c0Var = d0Var2.f325765b;
                        String str2 = d0Var2.d;
                        z zVar = d0Var2.e;
                        Date date = q0Var.f325834b.toDate();
                        Intrinsics.checkNotNullExpressionValue(date, "toDate(...)");
                        return wVar3.f147970b.a(new ActivityNavigateCommand(explicitActivityDestination, new PetPlanBuilderContract$Configuration.RenewalPlanConfig(str, str2, c0Var, zVar, date, q0Var.d.f325829b, q0Var.f325835c), null, null, 0, null, null, null, null, false, 1020));
                    case 3:
                        rp0.z it8 = (rp0.z) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        if (!Intrinsics.f(it8.f256227a, "PRICE_CHANGE_DESCRIPTION_FAQ_CLICK_ID")) {
                            pfm.m mVar3 = pfm.m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar3, "complete(...)");
                            return mVar3;
                        }
                        h hVar4 = this.f147953b.o;
                        Object obj3 = it8.f256228b;
                        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument.Custom");
                        PolicyDocument.Custom document = (PolicyDocument.Custom) obj3;
                        w wVar4 = (w) hVar4;
                        wVar4.getClass();
                        Intrinsics.checkNotNullParameter(document, "document");
                        return wVar4.f147970b.a(document.f76266b);
                    case 4:
                        LargeActionButtonDelegate.Model model2 = (LargeActionButtonDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        if (Intrinsics.f(model2.f52613a, "PRICE_CHANGE_HEADER_LIST_ID")) {
                            return ((opi.b) this.f147953b.f147964m).O();
                        }
                        pfm.m mVar4 = pfm.m.f235744a;
                        Intrinsics.checkNotNullExpressionValue(mVar4, "complete(...)");
                        return mVar4;
                    case 5:
                        RowDelegate.Model it9 = (RowDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        if (!a0.H(it9.f53228a, "PET_PLAN_RENEWAL_ITEM_PREFIX_", false)) {
                            return pfm.m.f235744a;
                        }
                        Object obj4 = it9.u;
                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.hub.issues.renewal.RenewalDetailsContract.PetPlanRenewalDetails");
                        d0 pet2 = ((c) obj4).f147943a;
                        if (pet2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        w wVar5 = (w) this.f147953b.o;
                        wVar5.getClass();
                        Intrinsics.checkNotNullParameter(pet2, "pet");
                        ln.a aVar4 = wVar5.f147970b;
                        j.Companion.getClass();
                        return aVar4.a(new ActivityNavigateCommand(b.f147942b, new RenewalDetailsContract$Configuration("PET_HUB_FLOW", pet2.f325764a), null, null, 0, null, null, null, null, false, 1020));
                    case 6:
                        ListSubheaderDelegate.Model cell = (ListSubheaderDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(cell, "cell");
                        if (!Intrinsics.f(cell.f52708a, "PRICE_CHANGE_HEADER_LIST_ID")) {
                            pfm.m mVar5 = pfm.m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar5, "complete(...)");
                            return mVar5;
                        }
                        v vVar = this.f147953b;
                        vVar.f147966p.getClass();
                        rp0.l lVar = rp0.l.WINDOW;
                        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.common_action_got_it, null, null, 14);
                        int i2 = R$attr.uikit_dp16;
                        List listC = zhm.u.c(new LargeActionButtonDelegate.Model("PRICE_CHANGE_HEADER_LIST_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, i2, i2, i2, i2, 496));
                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_plan_renewal_sections_price_change_details_title, null, null, 14);
                        int i3 = com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_plan_renewal_sections_price_change_details_description_with_args;
                        int i5 = com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_plan_renewal_sections_price_change_details_link_title;
                        pfm.h hVar5 = new pfm.h(new f0d.m(vVar, new y(listC, new rp0.t(textLocalisedClause2, new TextLocalisedClause(i3, zhm.u.c(new TextLocalisedClause(i5, null, new Click(28, (Integer) null, (Object) new PolicyDocument.Custom(new TextLocalisedClause(i5, null, null, 14), new FeatureCommand(new FaqFeatureConfig.Starter("question.why-does-my-pet-insurance-premium-change-at-renewal", 2))), "PRICE_CHANGE_DESCRIPTION_FAQ_CLICK_ID", false), 10)), null, 12), null, 28), lVar, null, null, null, "INFO_DIALOG_DELEGATE_KEY", null, null, null, 3832), 27), 2);
                        Intrinsics.checkNotNullExpressionValue(hVar5, "fromAction(...)");
                        return hVar5;
                    default:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        return ((w) this.f147953b.o).a();
                }
            }
        }), new p0(16, new h0(new BreadcrumbException(), 22)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ea9.c cVar2 = new ea9.c(18, s.f147959a);
        akl.s sVar = this.i;
        ofm.h hVarW = aVar3.w(new o0(19, sVar), cVar2);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        te0.w.j0(bVar, hVarW);
        iqi.b bVar2 = (iqi.b) aVar2.f169850b;
        bVar2.setVisible(false);
        bVar2.V(false);
        bVar2.Z(true);
        bVar2.e0(false);
        bVar2.b0(true);
        bVar2.c0(LargeActionButton.ButtonStyle.f58726b);
        iqi.b bVar3 = (iqi.b) this.k;
        efm.r rVarO = bVar3.O();
        Lazy lazy = aVar2.d;
        Object value = lazy.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        final int i2 = 1;
        pfm.a aVar4 = new pfm.a(te0.w.D(te0.w.B0(rVarO, (efm.r) value), new Function1(this) { // from class: gz7.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f147953b;

            {
                this.f147953b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        CellDetailsSwitcherDelegate.Model model = (CellDetailsSwitcherDelegate.Model) pair.f186385a;
                        g gVar = (g) pair.f186386b;
                        if (gVar instanceof e) {
                            throw new IllegalStateException("Multiple view model should not have any cell delegate switch");
                        }
                        if (!(gVar instanceof f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d0 pet = ((f) gVar).f147946a.f147943a;
                        if (pet == null) {
                            pfm.m mVar = pfm.m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                            return mVar;
                        }
                        h hVar = this.f147953b.o;
                        boolean z = model.f51915c;
                        w wVar = (w) hVar;
                        wVar.getClass();
                        Intrinsics.checkNotNullParameter(pet, "pet");
                        mm.d dVar = wVar.f147969a;
                        s0 s0Var = pet.o;
                        Intrinsics.checkNotNullParameter(s0Var, "<this>");
                        return dVar.c0(new RenewalDetailsContract$RenewalOptInUpdateSterilizedAction(((r0) s0Var).f325839a, !z));
                    case 1:
                        h hVar2 = this.f147953b.o;
                        Pair pair2 = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                        g gVar2 = (g) pair2.f186386b;
                        if (gVar2 instanceof e) {
                            return ((w) hVar2).a();
                        }
                        if (!(gVar2 instanceof f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c planRenewalDetail = ((f) gVar2).f147946a;
                        if (planRenewalDetail.f147944b.f325835c) {
                            return ((w) hVar2).a();
                        }
                        w wVar2 = (w) hVar2;
                        wVar2.getClass();
                        Intrinsics.checkNotNullParameter(planRenewalDetail, "planRenewalDetail");
                        mm.d dVar2 = wVar2.f147969a;
                        d0 d0Var = planRenewalDetail.f147943a;
                        if (d0Var != null) {
                            return dVar2.c0(new PetRenewalActionContract$RenewalOptInAction(d0Var.f325764a, null, true, true, null));
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 2:
                        Pair pair3 = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                        g gVar3 = (g) pair3.f186386b;
                        if (gVar3 instanceof e) {
                            throw new IllegalStateException("Opted-out Multiple view model should not have any secondary button");
                        }
                        if (!(gVar3 instanceof f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        h hVar3 = this.f147953b.o;
                        c planRenewalDetail2 = ((f) gVar3).f147946a;
                        w wVar3 = (w) hVar3;
                        wVar3.getClass();
                        Intrinsics.checkNotNullParameter(planRenewalDetail2, "planRenewalDetail");
                        d0 d0Var2 = planRenewalDetail2.f147943a;
                        q0 q0Var = planRenewalDetail2.f147944b;
                        if (d0Var2 == null) {
                            pfm.m mVar2 = pfm.m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                            return mVar2;
                        }
                        a08.k.Companion.getClass();
                        ExplicitActivityDestination explicitActivityDestination = a08.f.f181b;
                        String str = d0Var2.f325764a;
                        c0 c0Var = d0Var2.f325765b;
                        String str2 = d0Var2.d;
                        z zVar = d0Var2.e;
                        Date date = q0Var.f325834b.toDate();
                        Intrinsics.checkNotNullExpressionValue(date, "toDate(...)");
                        return wVar3.f147970b.a(new ActivityNavigateCommand(explicitActivityDestination, new PetPlanBuilderContract$Configuration.RenewalPlanConfig(str, str2, c0Var, zVar, date, q0Var.d.f325829b, q0Var.f325835c), null, null, 0, null, null, null, null, false, 1020));
                    case 3:
                        rp0.z it8 = (rp0.z) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        if (!Intrinsics.f(it8.f256227a, "PRICE_CHANGE_DESCRIPTION_FAQ_CLICK_ID")) {
                            pfm.m mVar3 = pfm.m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar3, "complete(...)");
                            return mVar3;
                        }
                        h hVar4 = this.f147953b.o;
                        Object obj3 = it8.f256228b;
                        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument.Custom");
                        PolicyDocument.Custom document = (PolicyDocument.Custom) obj3;
                        w wVar4 = (w) hVar4;
                        wVar4.getClass();
                        Intrinsics.checkNotNullParameter(document, "document");
                        return wVar4.f147970b.a(document.f76266b);
                    case 4:
                        LargeActionButtonDelegate.Model model2 = (LargeActionButtonDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        if (Intrinsics.f(model2.f52613a, "PRICE_CHANGE_HEADER_LIST_ID")) {
                            return ((opi.b) this.f147953b.f147964m).O();
                        }
                        pfm.m mVar4 = pfm.m.f235744a;
                        Intrinsics.checkNotNullExpressionValue(mVar4, "complete(...)");
                        return mVar4;
                    case 5:
                        RowDelegate.Model it9 = (RowDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        if (!a0.H(it9.f53228a, "PET_PLAN_RENEWAL_ITEM_PREFIX_", false)) {
                            return pfm.m.f235744a;
                        }
                        Object obj4 = it9.u;
                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.hub.issues.renewal.RenewalDetailsContract.PetPlanRenewalDetails");
                        d0 pet2 = ((c) obj4).f147943a;
                        if (pet2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        w wVar5 = (w) this.f147953b.o;
                        wVar5.getClass();
                        Intrinsics.checkNotNullParameter(pet2, "pet");
                        ln.a aVar42 = wVar5.f147970b;
                        j.Companion.getClass();
                        return aVar42.a(new ActivityNavigateCommand(b.f147942b, new RenewalDetailsContract$Configuration("PET_HUB_FLOW", pet2.f325764a), null, null, 0, null, null, null, null, false, 1020));
                    case 6:
                        ListSubheaderDelegate.Model cell = (ListSubheaderDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(cell, "cell");
                        if (!Intrinsics.f(cell.f52708a, "PRICE_CHANGE_HEADER_LIST_ID")) {
                            pfm.m mVar5 = pfm.m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar5, "complete(...)");
                            return mVar5;
                        }
                        v vVar = this.f147953b;
                        vVar.f147966p.getClass();
                        rp0.l lVar = rp0.l.WINDOW;
                        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.common_action_got_it, null, null, 14);
                        int i22 = R$attr.uikit_dp16;
                        List listC = zhm.u.c(new LargeActionButtonDelegate.Model("PRICE_CHANGE_HEADER_LIST_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, i22, i22, i22, i22, 496));
                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_plan_renewal_sections_price_change_details_title, null, null, 14);
                        int i3 = com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_plan_renewal_sections_price_change_details_description_with_args;
                        int i5 = com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_plan_renewal_sections_price_change_details_link_title;
                        pfm.h hVar5 = new pfm.h(new f0d.m(vVar, new y(listC, new rp0.t(textLocalisedClause2, new TextLocalisedClause(i3, zhm.u.c(new TextLocalisedClause(i5, null, new Click(28, (Integer) null, (Object) new PolicyDocument.Custom(new TextLocalisedClause(i5, null, null, 14), new FeatureCommand(new FaqFeatureConfig.Starter("question.why-does-my-pet-insurance-premium-change-at-renewal", 2))), "PRICE_CHANGE_DESCRIPTION_FAQ_CLICK_ID", false), 10)), null, 12), null, 28), lVar, null, null, null, "INFO_DIALOG_DELEGATE_KEY", null, null, null, 3832), 27), 2);
                        Intrinsics.checkNotNullExpressionValue(hVar5, "fromAction(...)");
                        return hVar5;
                    default:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        return ((w) this.f147953b.o).a();
                }
            }
        }), new p0(16, new h0(new BreadcrumbException(), 23)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar4.w(new o0(19, sVar), new ea9.c(18, t.f147960a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        te0.w.j0(bVar, hVarW2);
        efm.r rVarQ = bVar3.Q();
        Object value2 = lazy.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        final int i3 = 2;
        pfm.a aVar5 = new pfm.a(te0.w.D(te0.w.B0(rVarQ, (efm.r) value2), new Function1(this) { // from class: gz7.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f147953b;

            {
                this.f147953b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        CellDetailsSwitcherDelegate.Model model = (CellDetailsSwitcherDelegate.Model) pair.f186385a;
                        g gVar = (g) pair.f186386b;
                        if (gVar instanceof e) {
                            throw new IllegalStateException("Multiple view model should not have any cell delegate switch");
                        }
                        if (!(gVar instanceof f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d0 pet = ((f) gVar).f147946a.f147943a;
                        if (pet == null) {
                            pfm.m mVar = pfm.m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                            return mVar;
                        }
                        h hVar = this.f147953b.o;
                        boolean z = model.f51915c;
                        w wVar = (w) hVar;
                        wVar.getClass();
                        Intrinsics.checkNotNullParameter(pet, "pet");
                        mm.d dVar = wVar.f147969a;
                        s0 s0Var = pet.o;
                        Intrinsics.checkNotNullParameter(s0Var, "<this>");
                        return dVar.c0(new RenewalDetailsContract$RenewalOptInUpdateSterilizedAction(((r0) s0Var).f325839a, !z));
                    case 1:
                        h hVar2 = this.f147953b.o;
                        Pair pair2 = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                        g gVar2 = (g) pair2.f186386b;
                        if (gVar2 instanceof e) {
                            return ((w) hVar2).a();
                        }
                        if (!(gVar2 instanceof f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c planRenewalDetail = ((f) gVar2).f147946a;
                        if (planRenewalDetail.f147944b.f325835c) {
                            return ((w) hVar2).a();
                        }
                        w wVar2 = (w) hVar2;
                        wVar2.getClass();
                        Intrinsics.checkNotNullParameter(planRenewalDetail, "planRenewalDetail");
                        mm.d dVar2 = wVar2.f147969a;
                        d0 d0Var = planRenewalDetail.f147943a;
                        if (d0Var != null) {
                            return dVar2.c0(new PetRenewalActionContract$RenewalOptInAction(d0Var.f325764a, null, true, true, null));
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 2:
                        Pair pair3 = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                        g gVar3 = (g) pair3.f186386b;
                        if (gVar3 instanceof e) {
                            throw new IllegalStateException("Opted-out Multiple view model should not have any secondary button");
                        }
                        if (!(gVar3 instanceof f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        h hVar3 = this.f147953b.o;
                        c planRenewalDetail2 = ((f) gVar3).f147946a;
                        w wVar3 = (w) hVar3;
                        wVar3.getClass();
                        Intrinsics.checkNotNullParameter(planRenewalDetail2, "planRenewalDetail");
                        d0 d0Var2 = planRenewalDetail2.f147943a;
                        q0 q0Var = planRenewalDetail2.f147944b;
                        if (d0Var2 == null) {
                            pfm.m mVar2 = pfm.m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                            return mVar2;
                        }
                        a08.k.Companion.getClass();
                        ExplicitActivityDestination explicitActivityDestination = a08.f.f181b;
                        String str = d0Var2.f325764a;
                        c0 c0Var = d0Var2.f325765b;
                        String str2 = d0Var2.d;
                        z zVar = d0Var2.e;
                        Date date = q0Var.f325834b.toDate();
                        Intrinsics.checkNotNullExpressionValue(date, "toDate(...)");
                        return wVar3.f147970b.a(new ActivityNavigateCommand(explicitActivityDestination, new PetPlanBuilderContract$Configuration.RenewalPlanConfig(str, str2, c0Var, zVar, date, q0Var.d.f325829b, q0Var.f325835c), null, null, 0, null, null, null, null, false, 1020));
                    case 3:
                        rp0.z it8 = (rp0.z) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        if (!Intrinsics.f(it8.f256227a, "PRICE_CHANGE_DESCRIPTION_FAQ_CLICK_ID")) {
                            pfm.m mVar3 = pfm.m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar3, "complete(...)");
                            return mVar3;
                        }
                        h hVar4 = this.f147953b.o;
                        Object obj3 = it8.f256228b;
                        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument.Custom");
                        PolicyDocument.Custom document = (PolicyDocument.Custom) obj3;
                        w wVar4 = (w) hVar4;
                        wVar4.getClass();
                        Intrinsics.checkNotNullParameter(document, "document");
                        return wVar4.f147970b.a(document.f76266b);
                    case 4:
                        LargeActionButtonDelegate.Model model2 = (LargeActionButtonDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        if (Intrinsics.f(model2.f52613a, "PRICE_CHANGE_HEADER_LIST_ID")) {
                            return ((opi.b) this.f147953b.f147964m).O();
                        }
                        pfm.m mVar4 = pfm.m.f235744a;
                        Intrinsics.checkNotNullExpressionValue(mVar4, "complete(...)");
                        return mVar4;
                    case 5:
                        RowDelegate.Model it9 = (RowDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        if (!a0.H(it9.f53228a, "PET_PLAN_RENEWAL_ITEM_PREFIX_", false)) {
                            return pfm.m.f235744a;
                        }
                        Object obj4 = it9.u;
                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.hub.issues.renewal.RenewalDetailsContract.PetPlanRenewalDetails");
                        d0 pet2 = ((c) obj4).f147943a;
                        if (pet2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        w wVar5 = (w) this.f147953b.o;
                        wVar5.getClass();
                        Intrinsics.checkNotNullParameter(pet2, "pet");
                        ln.a aVar42 = wVar5.f147970b;
                        j.Companion.getClass();
                        return aVar42.a(new ActivityNavigateCommand(b.f147942b, new RenewalDetailsContract$Configuration("PET_HUB_FLOW", pet2.f325764a), null, null, 0, null, null, null, null, false, 1020));
                    case 6:
                        ListSubheaderDelegate.Model cell = (ListSubheaderDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(cell, "cell");
                        if (!Intrinsics.f(cell.f52708a, "PRICE_CHANGE_HEADER_LIST_ID")) {
                            pfm.m mVar5 = pfm.m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar5, "complete(...)");
                            return mVar5;
                        }
                        v vVar = this.f147953b;
                        vVar.f147966p.getClass();
                        rp0.l lVar = rp0.l.WINDOW;
                        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.common_action_got_it, null, null, 14);
                        int i22 = R$attr.uikit_dp16;
                        List listC = zhm.u.c(new LargeActionButtonDelegate.Model("PRICE_CHANGE_HEADER_LIST_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, i22, i22, i22, i22, 496));
                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_plan_renewal_sections_price_change_details_title, null, null, 14);
                        int i32 = com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_plan_renewal_sections_price_change_details_description_with_args;
                        int i5 = com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_plan_renewal_sections_price_change_details_link_title;
                        pfm.h hVar5 = new pfm.h(new f0d.m(vVar, new y(listC, new rp0.t(textLocalisedClause2, new TextLocalisedClause(i32, zhm.u.c(new TextLocalisedClause(i5, null, new Click(28, (Integer) null, (Object) new PolicyDocument.Custom(new TextLocalisedClause(i5, null, null, 14), new FeatureCommand(new FaqFeatureConfig.Starter("question.why-does-my-pet-insurance-premium-change-at-renewal", 2))), "PRICE_CHANGE_DESCRIPTION_FAQ_CLICK_ID", false), 10)), null, 12), null, 28), lVar, null, null, null, "INFO_DIALOG_DELEGATE_KEY", null, null, null, 3832), 27), 2);
                        Intrinsics.checkNotNullExpressionValue(hVar5, "fromAction(...)");
                        return hVar5;
                    default:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        return ((w) this.f147953b.o).a();
                }
            }
        }), new p0(16, new h0(new BreadcrumbException(), 24)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar5.w(new o0(19, sVar), new ea9.c(18, u.f147961a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        te0.w.j0(bVar, hVarW3);
        String str = this.f147968r.f76334b;
        l lVar = this.f147965n;
        efm.r rVarN = hx7.a.N(o70.a.f(m70.a.f(pd.b.t(lVar.f147950b.a(), new k(lVar, str, 0)), new gna.i(this, 11), new ghl.c(this, 27), new gug.c(11))), this.f147963l, false, false);
        gvi.s sVar2 = new gvi.s(view, this, 6);
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarN.onErrorResumeNext(new p0(16, new h0(new BreadcrumbException(), 17)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new o0(19, sVar2), new o0(19, sVar), new ea9.c(18, function0J));
        te0.w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        RenewalDetailsActivity renewalDetailsActivity = (RenewalDetailsActivity) view;
        final int i5 = 6;
        pfm.a aVar6 = new pfm.a(te0.w.D(((ListSubheaderDelegate) renewalDetailsActivity.u0.getValue()).d, new Function1(this) { // from class: gz7.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f147953b;

            {
                this.f147953b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        CellDetailsSwitcherDelegate.Model model = (CellDetailsSwitcherDelegate.Model) pair.f186385a;
                        g gVar = (g) pair.f186386b;
                        if (gVar instanceof e) {
                            throw new IllegalStateException("Multiple view model should not have any cell delegate switch");
                        }
                        if (!(gVar instanceof f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d0 pet = ((f) gVar).f147946a.f147943a;
                        if (pet == null) {
                            pfm.m mVar = pfm.m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                            return mVar;
                        }
                        h hVar = this.f147953b.o;
                        boolean z = model.f51915c;
                        w wVar = (w) hVar;
                        wVar.getClass();
                        Intrinsics.checkNotNullParameter(pet, "pet");
                        mm.d dVar = wVar.f147969a;
                        s0 s0Var = pet.o;
                        Intrinsics.checkNotNullParameter(s0Var, "<this>");
                        return dVar.c0(new RenewalDetailsContract$RenewalOptInUpdateSterilizedAction(((r0) s0Var).f325839a, !z));
                    case 1:
                        h hVar2 = this.f147953b.o;
                        Pair pair2 = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                        g gVar2 = (g) pair2.f186386b;
                        if (gVar2 instanceof e) {
                            return ((w) hVar2).a();
                        }
                        if (!(gVar2 instanceof f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c planRenewalDetail = ((f) gVar2).f147946a;
                        if (planRenewalDetail.f147944b.f325835c) {
                            return ((w) hVar2).a();
                        }
                        w wVar2 = (w) hVar2;
                        wVar2.getClass();
                        Intrinsics.checkNotNullParameter(planRenewalDetail, "planRenewalDetail");
                        mm.d dVar2 = wVar2.f147969a;
                        d0 d0Var = planRenewalDetail.f147943a;
                        if (d0Var != null) {
                            return dVar2.c0(new PetRenewalActionContract$RenewalOptInAction(d0Var.f325764a, null, true, true, null));
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 2:
                        Pair pair3 = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                        g gVar3 = (g) pair3.f186386b;
                        if (gVar3 instanceof e) {
                            throw new IllegalStateException("Opted-out Multiple view model should not have any secondary button");
                        }
                        if (!(gVar3 instanceof f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        h hVar3 = this.f147953b.o;
                        c planRenewalDetail2 = ((f) gVar3).f147946a;
                        w wVar3 = (w) hVar3;
                        wVar3.getClass();
                        Intrinsics.checkNotNullParameter(planRenewalDetail2, "planRenewalDetail");
                        d0 d0Var2 = planRenewalDetail2.f147943a;
                        q0 q0Var = planRenewalDetail2.f147944b;
                        if (d0Var2 == null) {
                            pfm.m mVar2 = pfm.m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                            return mVar2;
                        }
                        a08.k.Companion.getClass();
                        ExplicitActivityDestination explicitActivityDestination = a08.f.f181b;
                        String str2 = d0Var2.f325764a;
                        c0 c0Var = d0Var2.f325765b;
                        String str22 = d0Var2.d;
                        z zVar = d0Var2.e;
                        Date date = q0Var.f325834b.toDate();
                        Intrinsics.checkNotNullExpressionValue(date, "toDate(...)");
                        return wVar3.f147970b.a(new ActivityNavigateCommand(explicitActivityDestination, new PetPlanBuilderContract$Configuration.RenewalPlanConfig(str2, str22, c0Var, zVar, date, q0Var.d.f325829b, q0Var.f325835c), null, null, 0, null, null, null, null, false, 1020));
                    case 3:
                        rp0.z it8 = (rp0.z) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        if (!Intrinsics.f(it8.f256227a, "PRICE_CHANGE_DESCRIPTION_FAQ_CLICK_ID")) {
                            pfm.m mVar3 = pfm.m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar3, "complete(...)");
                            return mVar3;
                        }
                        h hVar4 = this.f147953b.o;
                        Object obj3 = it8.f256228b;
                        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument.Custom");
                        PolicyDocument.Custom document = (PolicyDocument.Custom) obj3;
                        w wVar4 = (w) hVar4;
                        wVar4.getClass();
                        Intrinsics.checkNotNullParameter(document, "document");
                        return wVar4.f147970b.a(document.f76266b);
                    case 4:
                        LargeActionButtonDelegate.Model model2 = (LargeActionButtonDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        if (Intrinsics.f(model2.f52613a, "PRICE_CHANGE_HEADER_LIST_ID")) {
                            return ((opi.b) this.f147953b.f147964m).O();
                        }
                        pfm.m mVar4 = pfm.m.f235744a;
                        Intrinsics.checkNotNullExpressionValue(mVar4, "complete(...)");
                        return mVar4;
                    case 5:
                        RowDelegate.Model it9 = (RowDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        if (!a0.H(it9.f53228a, "PET_PLAN_RENEWAL_ITEM_PREFIX_", false)) {
                            return pfm.m.f235744a;
                        }
                        Object obj4 = it9.u;
                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.hub.issues.renewal.RenewalDetailsContract.PetPlanRenewalDetails");
                        d0 pet2 = ((c) obj4).f147943a;
                        if (pet2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        w wVar5 = (w) this.f147953b.o;
                        wVar5.getClass();
                        Intrinsics.checkNotNullParameter(pet2, "pet");
                        ln.a aVar42 = wVar5.f147970b;
                        j.Companion.getClass();
                        return aVar42.a(new ActivityNavigateCommand(b.f147942b, new RenewalDetailsContract$Configuration("PET_HUB_FLOW", pet2.f325764a), null, null, 0, null, null, null, null, false, 1020));
                    case 6:
                        ListSubheaderDelegate.Model cell = (ListSubheaderDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(cell, "cell");
                        if (!Intrinsics.f(cell.f52708a, "PRICE_CHANGE_HEADER_LIST_ID")) {
                            pfm.m mVar5 = pfm.m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar5, "complete(...)");
                            return mVar5;
                        }
                        v vVar = this.f147953b;
                        vVar.f147966p.getClass();
                        rp0.l lVar2 = rp0.l.WINDOW;
                        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.common_action_got_it, null, null, 14);
                        int i22 = R$attr.uikit_dp16;
                        List listC = zhm.u.c(new LargeActionButtonDelegate.Model("PRICE_CHANGE_HEADER_LIST_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, i22, i22, i22, i22, 496));
                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_plan_renewal_sections_price_change_details_title, null, null, 14);
                        int i32 = com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_plan_renewal_sections_price_change_details_description_with_args;
                        int i59 = com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_plan_renewal_sections_price_change_details_link_title;
                        pfm.h hVar5 = new pfm.h(new f0d.m(vVar, new y(listC, new rp0.t(textLocalisedClause2, new TextLocalisedClause(i32, zhm.u.c(new TextLocalisedClause(i59, null, new Click(28, (Integer) null, (Object) new PolicyDocument.Custom(new TextLocalisedClause(i59, null, null, 14), new FeatureCommand(new FaqFeatureConfig.Starter("question.why-does-my-pet-insurance-premium-change-at-renewal", 2))), "PRICE_CHANGE_DESCRIPTION_FAQ_CLICK_ID", false), 10)), null, 12), null, 28), lVar2, null, null, null, "INFO_DIALOG_DELEGATE_KEY", null, null, null, 3832), 27), 2);
                        Intrinsics.checkNotNullExpressionValue(hVar5, "fromAction(...)");
                        return hVar5;
                    default:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        return ((w) this.f147953b.o).a();
                }
            }
        }), new p0(16, new h0(new BreadcrumbException(), 20)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar6.w(new o0(19, sVar), new ea9.c(18, q.f147957a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        te0.w.j0(bVar, hVarW4);
        final int i6 = 4;
        pfm.a aVar7 = new pfm.a(te0.w.D(((LargeActionButtonDelegate) renewalDetailsActivity.f76331w0.getValue()).d.f121375b, new Function1(this) { // from class: gz7.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f147953b;

            {
                this.f147953b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i6) {
                    case 0:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        CellDetailsSwitcherDelegate.Model model = (CellDetailsSwitcherDelegate.Model) pair.f186385a;
                        g gVar = (g) pair.f186386b;
                        if (gVar instanceof e) {
                            throw new IllegalStateException("Multiple view model should not have any cell delegate switch");
                        }
                        if (!(gVar instanceof f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d0 pet = ((f) gVar).f147946a.f147943a;
                        if (pet == null) {
                            pfm.m mVar = pfm.m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                            return mVar;
                        }
                        h hVar = this.f147953b.o;
                        boolean z = model.f51915c;
                        w wVar = (w) hVar;
                        wVar.getClass();
                        Intrinsics.checkNotNullParameter(pet, "pet");
                        mm.d dVar = wVar.f147969a;
                        s0 s0Var = pet.o;
                        Intrinsics.checkNotNullParameter(s0Var, "<this>");
                        return dVar.c0(new RenewalDetailsContract$RenewalOptInUpdateSterilizedAction(((r0) s0Var).f325839a, !z));
                    case 1:
                        h hVar2 = this.f147953b.o;
                        Pair pair2 = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                        g gVar2 = (g) pair2.f186386b;
                        if (gVar2 instanceof e) {
                            return ((w) hVar2).a();
                        }
                        if (!(gVar2 instanceof f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c planRenewalDetail = ((f) gVar2).f147946a;
                        if (planRenewalDetail.f147944b.f325835c) {
                            return ((w) hVar2).a();
                        }
                        w wVar2 = (w) hVar2;
                        wVar2.getClass();
                        Intrinsics.checkNotNullParameter(planRenewalDetail, "planRenewalDetail");
                        mm.d dVar2 = wVar2.f147969a;
                        d0 d0Var = planRenewalDetail.f147943a;
                        if (d0Var != null) {
                            return dVar2.c0(new PetRenewalActionContract$RenewalOptInAction(d0Var.f325764a, null, true, true, null));
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 2:
                        Pair pair3 = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                        g gVar3 = (g) pair3.f186386b;
                        if (gVar3 instanceof e) {
                            throw new IllegalStateException("Opted-out Multiple view model should not have any secondary button");
                        }
                        if (!(gVar3 instanceof f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        h hVar3 = this.f147953b.o;
                        c planRenewalDetail2 = ((f) gVar3).f147946a;
                        w wVar3 = (w) hVar3;
                        wVar3.getClass();
                        Intrinsics.checkNotNullParameter(planRenewalDetail2, "planRenewalDetail");
                        d0 d0Var2 = planRenewalDetail2.f147943a;
                        q0 q0Var = planRenewalDetail2.f147944b;
                        if (d0Var2 == null) {
                            pfm.m mVar2 = pfm.m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                            return mVar2;
                        }
                        a08.k.Companion.getClass();
                        ExplicitActivityDestination explicitActivityDestination = a08.f.f181b;
                        String str2 = d0Var2.f325764a;
                        c0 c0Var = d0Var2.f325765b;
                        String str22 = d0Var2.d;
                        z zVar = d0Var2.e;
                        Date date = q0Var.f325834b.toDate();
                        Intrinsics.checkNotNullExpressionValue(date, "toDate(...)");
                        return wVar3.f147970b.a(new ActivityNavigateCommand(explicitActivityDestination, new PetPlanBuilderContract$Configuration.RenewalPlanConfig(str2, str22, c0Var, zVar, date, q0Var.d.f325829b, q0Var.f325835c), null, null, 0, null, null, null, null, false, 1020));
                    case 3:
                        rp0.z it8 = (rp0.z) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        if (!Intrinsics.f(it8.f256227a, "PRICE_CHANGE_DESCRIPTION_FAQ_CLICK_ID")) {
                            pfm.m mVar3 = pfm.m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar3, "complete(...)");
                            return mVar3;
                        }
                        h hVar4 = this.f147953b.o;
                        Object obj3 = it8.f256228b;
                        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument.Custom");
                        PolicyDocument.Custom document = (PolicyDocument.Custom) obj3;
                        w wVar4 = (w) hVar4;
                        wVar4.getClass();
                        Intrinsics.checkNotNullParameter(document, "document");
                        return wVar4.f147970b.a(document.f76266b);
                    case 4:
                        LargeActionButtonDelegate.Model model2 = (LargeActionButtonDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        if (Intrinsics.f(model2.f52613a, "PRICE_CHANGE_HEADER_LIST_ID")) {
                            return ((opi.b) this.f147953b.f147964m).O();
                        }
                        pfm.m mVar4 = pfm.m.f235744a;
                        Intrinsics.checkNotNullExpressionValue(mVar4, "complete(...)");
                        return mVar4;
                    case 5:
                        RowDelegate.Model it9 = (RowDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        if (!a0.H(it9.f53228a, "PET_PLAN_RENEWAL_ITEM_PREFIX_", false)) {
                            return pfm.m.f235744a;
                        }
                        Object obj4 = it9.u;
                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.hub.issues.renewal.RenewalDetailsContract.PetPlanRenewalDetails");
                        d0 pet2 = ((c) obj4).f147943a;
                        if (pet2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        w wVar5 = (w) this.f147953b.o;
                        wVar5.getClass();
                        Intrinsics.checkNotNullParameter(pet2, "pet");
                        ln.a aVar42 = wVar5.f147970b;
                        j.Companion.getClass();
                        return aVar42.a(new ActivityNavigateCommand(b.f147942b, new RenewalDetailsContract$Configuration("PET_HUB_FLOW", pet2.f325764a), null, null, 0, null, null, null, null, false, 1020));
                    case 6:
                        ListSubheaderDelegate.Model cell = (ListSubheaderDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(cell, "cell");
                        if (!Intrinsics.f(cell.f52708a, "PRICE_CHANGE_HEADER_LIST_ID")) {
                            pfm.m mVar5 = pfm.m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar5, "complete(...)");
                            return mVar5;
                        }
                        v vVar = this.f147953b;
                        vVar.f147966p.getClass();
                        rp0.l lVar2 = rp0.l.WINDOW;
                        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.common_action_got_it, null, null, 14);
                        int i22 = R$attr.uikit_dp16;
                        List listC = zhm.u.c(new LargeActionButtonDelegate.Model("PRICE_CHANGE_HEADER_LIST_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, i22, i22, i22, i22, 496));
                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_plan_renewal_sections_price_change_details_title, null, null, 14);
                        int i32 = com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_plan_renewal_sections_price_change_details_description_with_args;
                        int i59 = com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_plan_renewal_sections_price_change_details_link_title;
                        pfm.h hVar5 = new pfm.h(new f0d.m(vVar, new y(listC, new rp0.t(textLocalisedClause2, new TextLocalisedClause(i32, zhm.u.c(new TextLocalisedClause(i59, null, new Click(28, (Integer) null, (Object) new PolicyDocument.Custom(new TextLocalisedClause(i59, null, null, 14), new FeatureCommand(new FaqFeatureConfig.Starter("question.why-does-my-pet-insurance-premium-change-at-renewal", 2))), "PRICE_CHANGE_DESCRIPTION_FAQ_CLICK_ID", false), 10)), null, 12), null, 28), lVar2, null, null, null, "INFO_DIALOG_DELEGATE_KEY", null, null, null, 3832), 27), 2);
                        Intrinsics.checkNotNullExpressionValue(hVar5, "fromAction(...)");
                        return hVar5;
                    default:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        return ((w) this.f147953b.o).a();
                }
            }
        }), new p0(16, new h0(new BreadcrumbException(), 19)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar7, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar7.w(new o0(19, sVar), new ea9.c(18, p.f147956a));
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        te0.w.j0(bVar, hVarW5);
        final int i21 = 3;
        pfm.a aVar8 = new pfm.a(te0.w.D(((opi.b) renewalDetailsActivity.y0.getValue()).W0(), new Function1(this) { // from class: gz7.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f147953b;

            {
                this.f147953b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i21) {
                    case 0:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        CellDetailsSwitcherDelegate.Model model = (CellDetailsSwitcherDelegate.Model) pair.f186385a;
                        g gVar = (g) pair.f186386b;
                        if (gVar instanceof e) {
                            throw new IllegalStateException("Multiple view model should not have any cell delegate switch");
                        }
                        if (!(gVar instanceof f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d0 pet = ((f) gVar).f147946a.f147943a;
                        if (pet == null) {
                            pfm.m mVar = pfm.m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                            return mVar;
                        }
                        h hVar = this.f147953b.o;
                        boolean z = model.f51915c;
                        w wVar = (w) hVar;
                        wVar.getClass();
                        Intrinsics.checkNotNullParameter(pet, "pet");
                        mm.d dVar = wVar.f147969a;
                        s0 s0Var = pet.o;
                        Intrinsics.checkNotNullParameter(s0Var, "<this>");
                        return dVar.c0(new RenewalDetailsContract$RenewalOptInUpdateSterilizedAction(((r0) s0Var).f325839a, !z));
                    case 1:
                        h hVar2 = this.f147953b.o;
                        Pair pair2 = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                        g gVar2 = (g) pair2.f186386b;
                        if (gVar2 instanceof e) {
                            return ((w) hVar2).a();
                        }
                        if (!(gVar2 instanceof f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c planRenewalDetail = ((f) gVar2).f147946a;
                        if (planRenewalDetail.f147944b.f325835c) {
                            return ((w) hVar2).a();
                        }
                        w wVar2 = (w) hVar2;
                        wVar2.getClass();
                        Intrinsics.checkNotNullParameter(planRenewalDetail, "planRenewalDetail");
                        mm.d dVar2 = wVar2.f147969a;
                        d0 d0Var = planRenewalDetail.f147943a;
                        if (d0Var != null) {
                            return dVar2.c0(new PetRenewalActionContract$RenewalOptInAction(d0Var.f325764a, null, true, true, null));
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 2:
                        Pair pair3 = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                        g gVar3 = (g) pair3.f186386b;
                        if (gVar3 instanceof e) {
                            throw new IllegalStateException("Opted-out Multiple view model should not have any secondary button");
                        }
                        if (!(gVar3 instanceof f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        h hVar3 = this.f147953b.o;
                        c planRenewalDetail2 = ((f) gVar3).f147946a;
                        w wVar3 = (w) hVar3;
                        wVar3.getClass();
                        Intrinsics.checkNotNullParameter(planRenewalDetail2, "planRenewalDetail");
                        d0 d0Var2 = planRenewalDetail2.f147943a;
                        q0 q0Var = planRenewalDetail2.f147944b;
                        if (d0Var2 == null) {
                            pfm.m mVar2 = pfm.m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                            return mVar2;
                        }
                        a08.k.Companion.getClass();
                        ExplicitActivityDestination explicitActivityDestination = a08.f.f181b;
                        String str2 = d0Var2.f325764a;
                        c0 c0Var = d0Var2.f325765b;
                        String str22 = d0Var2.d;
                        z zVar = d0Var2.e;
                        Date date = q0Var.f325834b.toDate();
                        Intrinsics.checkNotNullExpressionValue(date, "toDate(...)");
                        return wVar3.f147970b.a(new ActivityNavigateCommand(explicitActivityDestination, new PetPlanBuilderContract$Configuration.RenewalPlanConfig(str2, str22, c0Var, zVar, date, q0Var.d.f325829b, q0Var.f325835c), null, null, 0, null, null, null, null, false, 1020));
                    case 3:
                        rp0.z it8 = (rp0.z) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        if (!Intrinsics.f(it8.f256227a, "PRICE_CHANGE_DESCRIPTION_FAQ_CLICK_ID")) {
                            pfm.m mVar3 = pfm.m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar3, "complete(...)");
                            return mVar3;
                        }
                        h hVar4 = this.f147953b.o;
                        Object obj3 = it8.f256228b;
                        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument.Custom");
                        PolicyDocument.Custom document = (PolicyDocument.Custom) obj3;
                        w wVar4 = (w) hVar4;
                        wVar4.getClass();
                        Intrinsics.checkNotNullParameter(document, "document");
                        return wVar4.f147970b.a(document.f76266b);
                    case 4:
                        LargeActionButtonDelegate.Model model2 = (LargeActionButtonDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        if (Intrinsics.f(model2.f52613a, "PRICE_CHANGE_HEADER_LIST_ID")) {
                            return ((opi.b) this.f147953b.f147964m).O();
                        }
                        pfm.m mVar4 = pfm.m.f235744a;
                        Intrinsics.checkNotNullExpressionValue(mVar4, "complete(...)");
                        return mVar4;
                    case 5:
                        RowDelegate.Model it9 = (RowDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        if (!a0.H(it9.f53228a, "PET_PLAN_RENEWAL_ITEM_PREFIX_", false)) {
                            return pfm.m.f235744a;
                        }
                        Object obj4 = it9.u;
                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.hub.issues.renewal.RenewalDetailsContract.PetPlanRenewalDetails");
                        d0 pet2 = ((c) obj4).f147943a;
                        if (pet2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        w wVar5 = (w) this.f147953b.o;
                        wVar5.getClass();
                        Intrinsics.checkNotNullParameter(pet2, "pet");
                        ln.a aVar42 = wVar5.f147970b;
                        j.Companion.getClass();
                        return aVar42.a(new ActivityNavigateCommand(b.f147942b, new RenewalDetailsContract$Configuration("PET_HUB_FLOW", pet2.f325764a), null, null, 0, null, null, null, null, false, 1020));
                    case 6:
                        ListSubheaderDelegate.Model cell = (ListSubheaderDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(cell, "cell");
                        if (!Intrinsics.f(cell.f52708a, "PRICE_CHANGE_HEADER_LIST_ID")) {
                            pfm.m mVar5 = pfm.m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar5, "complete(...)");
                            return mVar5;
                        }
                        v vVar = this.f147953b;
                        vVar.f147966p.getClass();
                        rp0.l lVar2 = rp0.l.WINDOW;
                        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.common_action_got_it, null, null, 14);
                        int i22 = R$attr.uikit_dp16;
                        List listC = zhm.u.c(new LargeActionButtonDelegate.Model("PRICE_CHANGE_HEADER_LIST_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, i22, i22, i22, i22, 496));
                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_plan_renewal_sections_price_change_details_title, null, null, 14);
                        int i32 = com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_plan_renewal_sections_price_change_details_description_with_args;
                        int i59 = com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_plan_renewal_sections_price_change_details_link_title;
                        pfm.h hVar5 = new pfm.h(new f0d.m(vVar, new y(listC, new rp0.t(textLocalisedClause2, new TextLocalisedClause(i32, zhm.u.c(new TextLocalisedClause(i59, null, new Click(28, (Integer) null, (Object) new PolicyDocument.Custom(new TextLocalisedClause(i59, null, null, 14), new FeatureCommand(new FaqFeatureConfig.Starter("question.why-does-my-pet-insurance-premium-change-at-renewal", 2))), "PRICE_CHANGE_DESCRIPTION_FAQ_CLICK_ID", false), 10)), null, 12), null, 28), lVar2, null, null, null, "INFO_DIALOG_DELEGATE_KEY", null, null, null, 3832), 27), 2);
                        Intrinsics.checkNotNullExpressionValue(hVar5, "fromAction(...)");
                        return hVar5;
                    default:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        return ((w) this.f147953b.o).a();
                }
            }
        }), new p0(16, new h0(new BreadcrumbException(), 18)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar8, "onErrorResumeNext(...)");
        ofm.h hVarW6 = aVar8.w(new o0(19, sVar), new ea9.c(18, o.f147955a));
        Intrinsics.checkNotNullExpressionValue(hVarW6, "subscribe(...)");
        te0.w.j0(bVar, hVarW6);
        ihm.f fVar = ((CellDetailsSwitcherDelegate) renewalDetailsActivity.f76332x0.getValue()).f51912c;
        Object value3 = lazy.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        final int i22 = 0;
        pfm.a aVar9 = new pfm.a(te0.w.D(te0.w.B0(fVar, (efm.r) value3), new Function1(this) { // from class: gz7.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f147953b;

            {
                this.f147953b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i22) {
                    case 0:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        CellDetailsSwitcherDelegate.Model model = (CellDetailsSwitcherDelegate.Model) pair.f186385a;
                        g gVar = (g) pair.f186386b;
                        if (gVar instanceof e) {
                            throw new IllegalStateException("Multiple view model should not have any cell delegate switch");
                        }
                        if (!(gVar instanceof f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d0 pet = ((f) gVar).f147946a.f147943a;
                        if (pet == null) {
                            pfm.m mVar = pfm.m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                            return mVar;
                        }
                        h hVar = this.f147953b.o;
                        boolean z = model.f51915c;
                        w wVar = (w) hVar;
                        wVar.getClass();
                        Intrinsics.checkNotNullParameter(pet, "pet");
                        mm.d dVar = wVar.f147969a;
                        s0 s0Var = pet.o;
                        Intrinsics.checkNotNullParameter(s0Var, "<this>");
                        return dVar.c0(new RenewalDetailsContract$RenewalOptInUpdateSterilizedAction(((r0) s0Var).f325839a, !z));
                    case 1:
                        h hVar2 = this.f147953b.o;
                        Pair pair2 = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                        g gVar2 = (g) pair2.f186386b;
                        if (gVar2 instanceof e) {
                            return ((w) hVar2).a();
                        }
                        if (!(gVar2 instanceof f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c planRenewalDetail = ((f) gVar2).f147946a;
                        if (planRenewalDetail.f147944b.f325835c) {
                            return ((w) hVar2).a();
                        }
                        w wVar2 = (w) hVar2;
                        wVar2.getClass();
                        Intrinsics.checkNotNullParameter(planRenewalDetail, "planRenewalDetail");
                        mm.d dVar2 = wVar2.f147969a;
                        d0 d0Var = planRenewalDetail.f147943a;
                        if (d0Var != null) {
                            return dVar2.c0(new PetRenewalActionContract$RenewalOptInAction(d0Var.f325764a, null, true, true, null));
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 2:
                        Pair pair3 = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                        g gVar3 = (g) pair3.f186386b;
                        if (gVar3 instanceof e) {
                            throw new IllegalStateException("Opted-out Multiple view model should not have any secondary button");
                        }
                        if (!(gVar3 instanceof f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        h hVar3 = this.f147953b.o;
                        c planRenewalDetail2 = ((f) gVar3).f147946a;
                        w wVar3 = (w) hVar3;
                        wVar3.getClass();
                        Intrinsics.checkNotNullParameter(planRenewalDetail2, "planRenewalDetail");
                        d0 d0Var2 = planRenewalDetail2.f147943a;
                        q0 q0Var = planRenewalDetail2.f147944b;
                        if (d0Var2 == null) {
                            pfm.m mVar2 = pfm.m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                            return mVar2;
                        }
                        a08.k.Companion.getClass();
                        ExplicitActivityDestination explicitActivityDestination = a08.f.f181b;
                        String str2 = d0Var2.f325764a;
                        c0 c0Var = d0Var2.f325765b;
                        String str22 = d0Var2.d;
                        z zVar = d0Var2.e;
                        Date date = q0Var.f325834b.toDate();
                        Intrinsics.checkNotNullExpressionValue(date, "toDate(...)");
                        return wVar3.f147970b.a(new ActivityNavigateCommand(explicitActivityDestination, new PetPlanBuilderContract$Configuration.RenewalPlanConfig(str2, str22, c0Var, zVar, date, q0Var.d.f325829b, q0Var.f325835c), null, null, 0, null, null, null, null, false, 1020));
                    case 3:
                        rp0.z it8 = (rp0.z) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        if (!Intrinsics.f(it8.f256227a, "PRICE_CHANGE_DESCRIPTION_FAQ_CLICK_ID")) {
                            pfm.m mVar3 = pfm.m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar3, "complete(...)");
                            return mVar3;
                        }
                        h hVar4 = this.f147953b.o;
                        Object obj3 = it8.f256228b;
                        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument.Custom");
                        PolicyDocument.Custom document = (PolicyDocument.Custom) obj3;
                        w wVar4 = (w) hVar4;
                        wVar4.getClass();
                        Intrinsics.checkNotNullParameter(document, "document");
                        return wVar4.f147970b.a(document.f76266b);
                    case 4:
                        LargeActionButtonDelegate.Model model2 = (LargeActionButtonDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        if (Intrinsics.f(model2.f52613a, "PRICE_CHANGE_HEADER_LIST_ID")) {
                            return ((opi.b) this.f147953b.f147964m).O();
                        }
                        pfm.m mVar4 = pfm.m.f235744a;
                        Intrinsics.checkNotNullExpressionValue(mVar4, "complete(...)");
                        return mVar4;
                    case 5:
                        RowDelegate.Model it9 = (RowDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        if (!a0.H(it9.f53228a, "PET_PLAN_RENEWAL_ITEM_PREFIX_", false)) {
                            return pfm.m.f235744a;
                        }
                        Object obj4 = it9.u;
                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.hub.issues.renewal.RenewalDetailsContract.PetPlanRenewalDetails");
                        d0 pet2 = ((c) obj4).f147943a;
                        if (pet2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        w wVar5 = (w) this.f147953b.o;
                        wVar5.getClass();
                        Intrinsics.checkNotNullParameter(pet2, "pet");
                        ln.a aVar42 = wVar5.f147970b;
                        j.Companion.getClass();
                        return aVar42.a(new ActivityNavigateCommand(b.f147942b, new RenewalDetailsContract$Configuration("PET_HUB_FLOW", pet2.f325764a), null, null, 0, null, null, null, null, false, 1020));
                    case 6:
                        ListSubheaderDelegate.Model cell = (ListSubheaderDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(cell, "cell");
                        if (!Intrinsics.f(cell.f52708a, "PRICE_CHANGE_HEADER_LIST_ID")) {
                            pfm.m mVar5 = pfm.m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar5, "complete(...)");
                            return mVar5;
                        }
                        v vVar = this.f147953b;
                        vVar.f147966p.getClass();
                        rp0.l lVar2 = rp0.l.WINDOW;
                        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.common_action_got_it, null, null, 14);
                        int i222 = R$attr.uikit_dp16;
                        List listC = zhm.u.c(new LargeActionButtonDelegate.Model("PRICE_CHANGE_HEADER_LIST_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, i222, i222, i222, i222, 496));
                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_plan_renewal_sections_price_change_details_title, null, null, 14);
                        int i32 = com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_plan_renewal_sections_price_change_details_description_with_args;
                        int i59 = com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_plan_renewal_sections_price_change_details_link_title;
                        pfm.h hVar5 = new pfm.h(new f0d.m(vVar, new y(listC, new rp0.t(textLocalisedClause2, new TextLocalisedClause(i32, zhm.u.c(new TextLocalisedClause(i59, null, new Click(28, (Integer) null, (Object) new PolicyDocument.Custom(new TextLocalisedClause(i59, null, null, 14), new FeatureCommand(new FaqFeatureConfig.Starter("question.why-does-my-pet-insurance-premium-change-at-renewal", 2))), "PRICE_CHANGE_DESCRIPTION_FAQ_CLICK_ID", false), 10)), null, 12), null, 28), lVar2, null, null, null, "INFO_DIALOG_DELEGATE_KEY", null, null, null, 3832), 27), 2);
                        Intrinsics.checkNotNullExpressionValue(hVar5, "fromAction(...)");
                        return hVar5;
                    default:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        return ((w) this.f147953b.o).a();
                }
            }
        }), new p0(16, new h0(new BreadcrumbException(), 16)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar9, "onErrorResumeNext(...)");
        ofm.h hVarW7 = aVar9.w(new o0(19, sVar), new ea9.c(18, n.f147954a));
        Intrinsics.checkNotNullExpressionValue(hVarW7, "subscribe(...)");
        te0.w.j0(bVar, hVarW7);
        final int i32 = 5;
        pfm.a aVar10 = new pfm.a(te0.w.D(((RowDelegate) renewalDetailsActivity.f76330v0.getValue()).f53218h, new Function1(this) { // from class: gz7.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v f147953b;

            {
                this.f147953b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i32) {
                    case 0:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        CellDetailsSwitcherDelegate.Model model = (CellDetailsSwitcherDelegate.Model) pair.f186385a;
                        g gVar = (g) pair.f186386b;
                        if (gVar instanceof e) {
                            throw new IllegalStateException("Multiple view model should not have any cell delegate switch");
                        }
                        if (!(gVar instanceof f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        d0 pet = ((f) gVar).f147946a.f147943a;
                        if (pet == null) {
                            pfm.m mVar = pfm.m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                            return mVar;
                        }
                        h hVar = this.f147953b.o;
                        boolean z = model.f51915c;
                        w wVar = (w) hVar;
                        wVar.getClass();
                        Intrinsics.checkNotNullParameter(pet, "pet");
                        mm.d dVar = wVar.f147969a;
                        s0 s0Var = pet.o;
                        Intrinsics.checkNotNullParameter(s0Var, "<this>");
                        return dVar.c0(new RenewalDetailsContract$RenewalOptInUpdateSterilizedAction(((r0) s0Var).f325839a, !z));
                    case 1:
                        h hVar2 = this.f147953b.o;
                        Pair pair2 = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                        g gVar2 = (g) pair2.f186386b;
                        if (gVar2 instanceof e) {
                            return ((w) hVar2).a();
                        }
                        if (!(gVar2 instanceof f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c planRenewalDetail = ((f) gVar2).f147946a;
                        if (planRenewalDetail.f147944b.f325835c) {
                            return ((w) hVar2).a();
                        }
                        w wVar2 = (w) hVar2;
                        wVar2.getClass();
                        Intrinsics.checkNotNullParameter(planRenewalDetail, "planRenewalDetail");
                        mm.d dVar2 = wVar2.f147969a;
                        d0 d0Var = planRenewalDetail.f147943a;
                        if (d0Var != null) {
                            return dVar2.c0(new PetRenewalActionContract$RenewalOptInAction(d0Var.f325764a, null, true, true, null));
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    case 2:
                        Pair pair3 = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                        g gVar3 = (g) pair3.f186386b;
                        if (gVar3 instanceof e) {
                            throw new IllegalStateException("Opted-out Multiple view model should not have any secondary button");
                        }
                        if (!(gVar3 instanceof f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        h hVar3 = this.f147953b.o;
                        c planRenewalDetail2 = ((f) gVar3).f147946a;
                        w wVar3 = (w) hVar3;
                        wVar3.getClass();
                        Intrinsics.checkNotNullParameter(planRenewalDetail2, "planRenewalDetail");
                        d0 d0Var2 = planRenewalDetail2.f147943a;
                        q0 q0Var = planRenewalDetail2.f147944b;
                        if (d0Var2 == null) {
                            pfm.m mVar2 = pfm.m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                            return mVar2;
                        }
                        a08.k.Companion.getClass();
                        ExplicitActivityDestination explicitActivityDestination = a08.f.f181b;
                        String str2 = d0Var2.f325764a;
                        c0 c0Var = d0Var2.f325765b;
                        String str22 = d0Var2.d;
                        z zVar = d0Var2.e;
                        Date date = q0Var.f325834b.toDate();
                        Intrinsics.checkNotNullExpressionValue(date, "toDate(...)");
                        return wVar3.f147970b.a(new ActivityNavigateCommand(explicitActivityDestination, new PetPlanBuilderContract$Configuration.RenewalPlanConfig(str2, str22, c0Var, zVar, date, q0Var.d.f325829b, q0Var.f325835c), null, null, 0, null, null, null, null, false, 1020));
                    case 3:
                        rp0.z it8 = (rp0.z) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        if (!Intrinsics.f(it8.f256227a, "PRICE_CHANGE_DESCRIPTION_FAQ_CLICK_ID")) {
                            pfm.m mVar3 = pfm.m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar3, "complete(...)");
                            return mVar3;
                        }
                        h hVar4 = this.f147953b.o;
                        Object obj3 = it8.f256228b;
                        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument.Custom");
                        PolicyDocument.Custom document = (PolicyDocument.Custom) obj3;
                        w wVar4 = (w) hVar4;
                        wVar4.getClass();
                        Intrinsics.checkNotNullParameter(document, "document");
                        return wVar4.f147970b.a(document.f76266b);
                    case 4:
                        LargeActionButtonDelegate.Model model2 = (LargeActionButtonDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(model2, "model");
                        if (Intrinsics.f(model2.f52613a, "PRICE_CHANGE_HEADER_LIST_ID")) {
                            return ((opi.b) this.f147953b.f147964m).O();
                        }
                        pfm.m mVar4 = pfm.m.f235744a;
                        Intrinsics.checkNotNullExpressionValue(mVar4, "complete(...)");
                        return mVar4;
                    case 5:
                        RowDelegate.Model it9 = (RowDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        if (!a0.H(it9.f53228a, "PET_PLAN_RENEWAL_ITEM_PREFIX_", false)) {
                            return pfm.m.f235744a;
                        }
                        Object obj4 = it9.u;
                        Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.insurance_pet.impl.ui.hub.issues.renewal.RenewalDetailsContract.PetPlanRenewalDetails");
                        d0 pet2 = ((c) obj4).f147943a;
                        if (pet2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        w wVar5 = (w) this.f147953b.o;
                        wVar5.getClass();
                        Intrinsics.checkNotNullParameter(pet2, "pet");
                        ln.a aVar42 = wVar5.f147970b;
                        j.Companion.getClass();
                        return aVar42.a(new ActivityNavigateCommand(b.f147942b, new RenewalDetailsContract$Configuration("PET_HUB_FLOW", pet2.f325764a), null, null, 0, null, null, null, null, false, 1020));
                    case 6:
                        ListSubheaderDelegate.Model cell = (ListSubheaderDelegate.Model) obj2;
                        Intrinsics.checkNotNullParameter(cell, "cell");
                        if (!Intrinsics.f(cell.f52708a, "PRICE_CHANGE_HEADER_LIST_ID")) {
                            pfm.m mVar5 = pfm.m.f235744a;
                            Intrinsics.checkNotNullExpressionValue(mVar5, "complete(...)");
                            return mVar5;
                        }
                        v vVar = this.f147953b;
                        vVar.f147966p.getClass();
                        rp0.l lVar2 = rp0.l.WINDOW;
                        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.common_action_got_it, null, null, 14);
                        int i222 = R$attr.uikit_dp16;
                        List listC = zhm.u.c(new LargeActionButtonDelegate.Model("PRICE_CHANGE_HEADER_LIST_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, i222, i222, i222, i222, 496));
                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_plan_renewal_sections_price_change_details_title, null, null, 14);
                        int i322 = com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_plan_renewal_sections_price_change_details_description_with_args;
                        int i59 = com.revolut.feature.insurance_pet.impl.R$string.pets_dashboard_issues_plan_renewal_sections_price_change_details_link_title;
                        pfm.h hVar5 = new pfm.h(new f0d.m(vVar, new y(listC, new rp0.t(textLocalisedClause2, new TextLocalisedClause(i322, zhm.u.c(new TextLocalisedClause(i59, null, new Click(28, (Integer) null, (Object) new PolicyDocument.Custom(new TextLocalisedClause(i59, null, null, 14), new FeatureCommand(new FaqFeatureConfig.Starter("question.why-does-my-pet-insurance-premium-change-at-renewal", 2))), "PRICE_CHANGE_DESCRIPTION_FAQ_CLICK_ID", false), 10)), null, 12), null, 28), lVar2, null, null, null, "INFO_DIALOG_DELEGATE_KEY", null, null, null, 3832), 27), 2);
                        Intrinsics.checkNotNullExpressionValue(hVar5, "fromAction(...)");
                        return hVar5;
                    default:
                        Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                        return ((w) this.f147953b.o).a();
                }
            }
        }), new p0(16, new h0(new BreadcrumbException(), 21)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar10, "onErrorResumeNext(...)");
        ofm.h hVarW8 = aVar10.w(new o0(19, sVar), new ea9.c(18, r.f147958a));
        Intrinsics.checkNotNullExpressionValue(hVarW8, "subscribe(...)");
        te0.w.j0(bVar, hVarW8);
    }
}
