package com.revolut.feature.tab.lifestyle.impl.ui.screen;

import android.net.Uri;
import android.os.Parcelable;
import bn2.p;
import cli.y;
import com.revolut.core.ui_kit.delegates.ChallengeMediumDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.b2;
import com.revolut.core.ui_kit.delegates.widgets.k4;
import com.revolut.core.ui_kit.delegates.widgets.l4;
import com.revolut.core.ui_kit.delegates.widgets.m4;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.lifestyle.core.api.navigation.TabLifestyleDocuments;
import com.revolut.feature.lifestyle_feed.api.models.LifestyleWidgetContext;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.retail.reverywhere.api.ReverywhereApi$Toggles$ReverywhereOnboardingConfiguration;
import com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination;
import com.revolut.feature.rev_points.extensions.RevPointsTabAction;
import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.tab.lifestyle.impl.R$string;
import com.revolut.feature.tab.lifestyle.impl.ui.screen.TabLifestyleScreenContract$InputData;
import com.revolut.feature.tab.lifestyle.impl.ui.screen.TabLifestyleScreenContract$ModalStep;
import com.revolut.feature.tab.lifestyle.impl.ui.screen.b;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import com.youTransactor.uCube.rpc.Constants;
import eub.i;
import ffk.t;
import hha.s;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jul.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nme.a1;
import nme.c0;
import nme.c1;
import nme.d0;
import nme.e0;
import nme.g0;
import nme.z;
import nme.z0;
import nyb.i0;
import nyb.j;
import oki.h;
import q06.l;
import r10.q;
import u29.g;
import u29.m;
import vge.r;
import vkm.j2;
import vkm.z1;
import wsg.n;
import x19.a;
import zh9.u0;
import zhm.f0;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends h implements z {
    public final eub.a A;
    public final rul.e B;
    public final i0 C;
    public final g D;
    public final i E;
    public final n F;
    public final t G;
    public final p H;
    public final xn.c I;
    public final j J;
    public final pme.a K;
    public final ztb.a L;
    public final utk.f M;
    public final o N;
    public final j40.a O;
    public final ash.e P;
    public final k39.a Q;
    public final q R;
    public final i4b.f S;
    public final r10.d T;
    public final l61.a U;
    public final yle.a V;
    public final u29.b W;
    public final jyb.c X;
    public final web.b Y;
    public final ash.j Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final mk0.a f89941a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final vii.b f89942b0;
    public final vii.b c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final vii.b f89943d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final ihm.f f89944e0;
    public final j2 f0;
    public final y g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f89945h0;
    public final TabLifestyleScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f89946p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p19.a f89947q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kbb.c f89948r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f89949s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wle.a f89950t;
    public final o1c.a u;
    public final mkd.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final gte.a f89951w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final bd3.a f89952x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final u29.p f89953y;
    public final wn.a z;

    public f(c1 mapper, TabLifestyleScreenContract$InputData inputData, m lifestyleTabInteractor, p19.a lifestyleContentGatewayInteractor, kbb.c headerUiParamsProvider, l deeplinkRouter, wle.a tabLifestyleActionExtension, o1c.a revPointsSpareChangeResultDialogExtension, mkd.d slotManagerFeedControllerModelExtension, gte.a featureToggleInteractor, bd3.a cashbackInteractor, u29.p urlEligibilityInteractor, wn.a adsTrackingControllerModelExtension, eub.a revPointsAvailabilityInteractor, rul.e revPointsSpareChangeInteractor, i0 revPointsProductEligibilityInteractor, g lifestyleTabAvailabilityInteractor, i revPointsOptInInteractor, aub.a revPointsOptInExtension, n walletInteractor, t pricingPlanInteractor, p backgroundsInteractor, dyb.a revPointsKycCheckExtension, xn.c adsUrlDecoratorInteractor, j revPointsEarningRatesInteractor, pme.a tabLifestyleRouter, ztb.a revPointsEarningRatesExtension, utk.f profileNotificationInteractor, o lifestyleIntroChecklistAvailabilityProvider, j40.a assistantModelExtension, ash.e widgetsControllerModelExtension, k39.a lifestyleFeedWidgetsEventObserver, q userRegisteredIdentitiesInteractor, i4b.f legalEntityContextProvider, r10.d legalEntityProviderFactory, l61.a userCompanyInteractor, yle.a tabLifestyleDeeplinkExtension, u29.b lifestyleHomeOnboardingInteractor, jyb.c personalisationTargetingOnboardingExtension, web.b reverywhereConfigInteractor, ash.j widgetsView, mk0.a personalisationStorage) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(lifestyleTabInteractor, "lifestyleTabInteractor");
        Intrinsics.checkNotNullParameter(lifestyleContentGatewayInteractor, "lifestyleContentGatewayInteractor");
        Intrinsics.checkNotNullParameter(headerUiParamsProvider, "headerUiParamsProvider");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(tabLifestyleActionExtension, "tabLifestyleActionExtension");
        Intrinsics.checkNotNullParameter(revPointsSpareChangeResultDialogExtension, "revPointsSpareChangeResultDialogExtension");
        Intrinsics.checkNotNullParameter(slotManagerFeedControllerModelExtension, "slotManagerFeedControllerModelExtension");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(cashbackInteractor, "cashbackInteractor");
        Intrinsics.checkNotNullParameter(urlEligibilityInteractor, "urlEligibilityInteractor");
        Intrinsics.checkNotNullParameter(adsTrackingControllerModelExtension, "adsTrackingControllerModelExtension");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(revPointsSpareChangeInteractor, "revPointsSpareChangeInteractor");
        Intrinsics.checkNotNullParameter(revPointsProductEligibilityInteractor, "revPointsProductEligibilityInteractor");
        Intrinsics.checkNotNullParameter(lifestyleTabAvailabilityInteractor, "lifestyleTabAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(revPointsOptInInteractor, "revPointsOptInInteractor");
        Intrinsics.checkNotNullParameter(revPointsOptInExtension, "revPointsOptInExtension");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(backgroundsInteractor, "backgroundsInteractor");
        Intrinsics.checkNotNullParameter(revPointsKycCheckExtension, "revPointsKycCheckExtension");
        Intrinsics.checkNotNullParameter(adsUrlDecoratorInteractor, "adsUrlDecoratorInteractor");
        Intrinsics.checkNotNullParameter(revPointsEarningRatesInteractor, "revPointsEarningRatesInteractor");
        Intrinsics.checkNotNullParameter(tabLifestyleRouter, "tabLifestyleRouter");
        Intrinsics.checkNotNullParameter(revPointsEarningRatesExtension, "revPointsEarningRatesExtension");
        Intrinsics.checkNotNullParameter(profileNotificationInteractor, "profileNotificationInteractor");
        Intrinsics.checkNotNullParameter(lifestyleIntroChecklistAvailabilityProvider, "lifestyleIntroChecklistAvailabilityProvider");
        Intrinsics.checkNotNullParameter(assistantModelExtension, "assistantModelExtension");
        Intrinsics.checkNotNullParameter(widgetsControllerModelExtension, "widgetsControllerModelExtension");
        Intrinsics.checkNotNullParameter(lifestyleFeedWidgetsEventObserver, "lifestyleFeedWidgetsEventObserver");
        Intrinsics.checkNotNullParameter(userRegisteredIdentitiesInteractor, "userRegisteredIdentitiesInteractor");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(legalEntityProviderFactory, "legalEntityProviderFactory");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(tabLifestyleDeeplinkExtension, "tabLifestyleDeeplinkExtension");
        Intrinsics.checkNotNullParameter(lifestyleHomeOnboardingInteractor, "lifestyleHomeOnboardingInteractor");
        Intrinsics.checkNotNullParameter(personalisationTargetingOnboardingExtension, "personalisationTargetingOnboardingExtension");
        Intrinsics.checkNotNullParameter(reverywhereConfigInteractor, "reverywhereConfigInteractor");
        Intrinsics.checkNotNullParameter(widgetsView, "widgetsView");
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        this.o = inputData;
        this.f89946p = lifestyleTabInteractor;
        this.f89947q = lifestyleContentGatewayInteractor;
        this.f89948r = headerUiParamsProvider;
        this.f89949s = deeplinkRouter;
        this.f89950t = tabLifestyleActionExtension;
        this.u = revPointsSpareChangeResultDialogExtension;
        this.v = slotManagerFeedControllerModelExtension;
        this.f89951w = featureToggleInteractor;
        this.f89952x = cashbackInteractor;
        this.f89953y = urlEligibilityInteractor;
        this.z = adsTrackingControllerModelExtension;
        this.A = revPointsAvailabilityInteractor;
        this.B = revPointsSpareChangeInteractor;
        this.C = revPointsProductEligibilityInteractor;
        this.D = lifestyleTabAvailabilityInteractor;
        this.E = revPointsOptInInteractor;
        this.F = walletInteractor;
        this.G = pricingPlanInteractor;
        this.H = backgroundsInteractor;
        this.I = adsUrlDecoratorInteractor;
        this.J = revPointsEarningRatesInteractor;
        this.K = tabLifestyleRouter;
        this.L = revPointsEarningRatesExtension;
        this.M = profileNotificationInteractor;
        this.N = lifestyleIntroChecklistAvailabilityProvider;
        this.O = assistantModelExtension;
        this.P = widgetsControllerModelExtension;
        this.Q = lifestyleFeedWidgetsEventObserver;
        this.R = userRegisteredIdentitiesInteractor;
        this.S = legalEntityContextProvider;
        this.T = legalEntityProviderFactory;
        this.U = userCompanyInteractor;
        this.V = tabLifestyleDeeplinkExtension;
        this.W = lifestyleHomeOnboardingInteractor;
        this.X = personalisationTargetingOnboardingExtension;
        this.Y = reverywhereConfigInteractor;
        this.Z = widgetsView;
        this.f89941a0 = personalisationStorage;
        w4l.h initialLoadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(initialLoadingStrategy, "initialLoadingStrategy");
        vii.b.Companion.getClass();
        z1 internalFlow = vkm.q.b(1, 1, ukm.f.DROP_OLDEST);
        Intrinsics.checkNotNullParameter(internalFlow, "internalFlow");
        Intrinsics.checkNotNullParameter(initialLoadingStrategy, "initialLoadingStrategy");
        new r(initialLoadingStrategy, null, 15);
        this.f89942b0 = new vii.b();
        this.c0 = new vii.b();
        this.f89943d0 = new vii.b();
        this.f89944e0 = v0.a.d("create(...)");
        this.f0 = vkm.q.c(Boolean.FALSE);
        itb.b.Companion.getClass();
        itb.b bVar = itb.b.d;
        Data data = new Data(null, null, true, 3, null);
        Data data2 = new Data(null, null, true, 3, null);
        od0.i.Companion.getClass();
        Data data3 = new Data(od0.i.f224256b, null, false, 6, null);
        Data data4 = new Data(null, null, true, 3, null);
        Data data5 = new Data(null, null, true, 3, null);
        Data data6 = new Data(null, null, true, 3, null);
        Data data7 = new Data(null, null, true, 3, null);
        Data data8 = new Data(null, null, true, 3, null);
        Data data9 = new Data(null, null, true, 3, null);
        Data data10 = new Data(null, null, true, 3, null);
        boolean zF = ((nyb.b) revPointsAvailabilityInteractor).f();
        Data data11 = new Data(null, null, true, 3, null);
        Data data12 = new Data(null, null, true, 3, null);
        h0 h0Var = h0.f322473a;
        f0 f0Var = f0.f322471a;
        this.g0 = mra.d.b(this, new a(bVar, data12, data, zF, false, data3, data2, data9, data8, b.a.f89940a, data7, h0Var, data4, data5, data6, data10, data11, f0Var, false, new Data(null, null, false, 7, null), new Data(null, null, true, 3, null), null, f0Var, false, new Data(null, null, true, 3, null), null, new Data(null, null, true, 3, null)), mapper, null, true, 4);
        this.f89945h0 = hx7.e.a(this, new nk4.o(this, 4));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, this.f89948r.P(), null, null, new nme.f0(11, this, continuation), 3);
        nyb.b bVar = (nyb.b) this.A;
        if (!bVar.f()) {
            yji.l.a1(this, rd0.e.b(nim.a.w(this.f89952x.e(), new c0(8))), null, null, new nme.f0(4, this, continuation), 3);
        }
        l2(new g0(0, this, continuation), new yi5.b(26));
        if (!this.f226127l) {
            TabLifestyleScreenContract$InputData tabLifestyleScreenContract$InputData = this.o;
            if (tabLifestyleScreenContract$InputData instanceof TabLifestyleScreenContract$InputData.Action) {
                Parcelable parcel = ((TabLifestyleScreenContract$InputData.Action) tabLifestyleScreenContract$InputData).f89916a;
                wle.a aVar = this.f89950t;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel instanceof RevPointsTabAction) {
                    RevPointsTabAction action = (RevPointsTabAction) parcel;
                    lyb.d dVar = (lyb.d) aVar.f298477l;
                    dVar.getClass();
                    Intrinsics.checkNotNullParameter(action, "action");
                    if (action.equals(RevPointsTabAction.ShowRewardsActivatedMessage.f83614a)) {
                        dVar.Z2();
                    } else {
                        if (!action.equals(RevPointsTabAction.ShowSpareChangeUpsell.f83615a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dVar.T2(new lyb.c(dVar, null), new yi5.b(27));
                    }
                }
            } else if (!(tabLifestyleScreenContract$InputData instanceof TabLifestyleScreenContract$InputData.Default)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (bVar.f()) {
            yji.l.a1(this, rd0.e.b(((nyb.o) this.E).f(false)), null, null, new nme.f0(14, this, continuation), 3);
        }
        c0 c0Var = new c0(5);
        y yVar = this.g0;
        yji.l.a1(this, vkm.q.Q(vkm.q.q(yVar.B(c0Var)), new e0(0, this, continuation)), null, null, new nme.f0(0, this, continuation), 3);
        yji.l.a1(this, rd0.e.b(hng.g.b(((ang.b) this.U).f7765a)), null, null, new nme.f0(2, this, continuation), 3);
        yji.l.a1(this, nim.a.u(new n8a.r(this, continuation, 17), vkm.q.q(yVar.B(new c0(9)))), null, null, new nme.f0(1, this, continuation), 3);
        if (bVar.f()) {
            u29.b bVar2 = this.W;
            bVar2.getClass();
            w4l.h loadingStrategy = w4l.h.f294642c;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            yji.l.a1(this, xam.a.h(new qqj.g(bVar2, loadingStrategy, continuation, 29), f39.c.b(bVar2.f276563b)), null, null, new nme.f0(12, this, continuation), 3);
        } else {
            H2(yVar, new c0(2));
        }
        if (((jte.d) this.f89951w).c(ReverywhereApi$Toggles$ReverywhereOnboardingConfiguration.f82881c)) {
            yji.l.a1(this, vkm.q.P(a.a.k(zi0.c.w(vkm.q.q(yVar.B(new c0(6)))), new d0(this, 2)), 1), null, null, new nme.h0(0, this, continuation), 3);
        }
    }

    public final void I2(ChallengeMediumDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        model.getClass();
    }

    public final void J2(kme.a parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        h19.d dVar = parcel.f185787a;
        String deeplink = dVar.f148481c;
        h19.c type = dVar.f148480b;
        this.V.getClass();
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(type, "type");
        switch (yle.b.f314703a[type.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                deeplink = Uri.parse(deeplink).buildUpon().appendQueryParameter("listId", "LIFESTYLE_HOME_ICON" + type.name()).build().toString();
                Intrinsics.h(deeplink);
                break;
        }
        String originalDeeplink = deeplink;
        Intrinsics.checkNotNullParameter(originalDeeplink, "originalDeeplink");
        n2(new n8a.r(this, originalDeeplink, parcel, null, 18), new whi.b(6));
        this.z.Z2(parcel);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f89945h0;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void K2(String actionId) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        int iHashCode = actionId.hashCode();
        com.revolut.kompot.navigable.vc.modal.a aVar = this.f89945h0;
        pme.a aVar2 = this.K;
        switch (iHashCode) {
            case -1962068058:
                if (actionId.equals("LIFESTYLE_ACTION_TRANSACTIONS_ID")) {
                    pme.b bVar = (pme.b) aVar2;
                    bVar.getClass();
                    bVar.A2(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenTransactionList(null, null, 3)));
                    return;
                }
                break;
            case -1513288173:
                if (actionId.equals("LIFESTYLE_ACTION_CLOSE_ACCOUNT_ID")) {
                    C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("46a0f46b-5bd2-4d42-acdb-401c64d9f0a2", 14), (SharedFaqDestination.PassthroughData) null, false, 14));
                    return;
                }
                break;
            case -1180426561:
                if (actionId.equals("LIFESTYLE_ACTION_REDEEM_ID")) {
                    pme.b bVar2 = (pme.b) aVar2;
                    bVar2.getClass();
                    bVar2.A2(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenRedeemHub(false)));
                    return;
                }
                break;
            case -1132819645:
                if (actionId.equals("LIFESTYLE_ACTION_EARN_ID")) {
                    pme.b bVar3 = (pme.b) aVar2;
                    bVar3.getClass();
                    bVar3.A2(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenEarnHub(3)));
                    return;
                }
                break;
            case 407714435:
                if (actionId.equals("LIFESTYLE_ACTION_FAQ_ID")) {
                    C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("31ecc9e5-b810-4c3f-914d-41d2653bf5ac", 14), (SharedFaqDestination.PassthroughData) null, false, 14));
                    return;
                }
                break;
            case 469339146:
                if (actionId.equals("LIFESTYLE_ACTION_POINTS_EXPIRY_ID")) {
                    pme.b bVar4 = (pme.b) aVar2;
                    bVar4.getClass();
                    bVar4.A2(new RevPointsFlowDestination(RevPointsFlowDestination.StartType.OpenRevPointsExpiryHome.f83508a));
                    return;
                }
                break;
            case 533196377:
                if (actionId.equals("LIFESTYLE_ACTION_ADD_WIDGET_ID")) {
                    LifestyleWidgetContext.INSTANCE.getClass();
                    this.P.b3(new LifestyleWidgetContext("LifestyleHome", null));
                    return;
                }
                break;
            case 549401708:
                if (actionId.equals("LIFESTYLE_ACTION_PLAN_PERKS_ID")) {
                    pme.b bVar5 = (pme.b) aVar2;
                    bVar5.A2(u0.b(bVar5.f237552m.b()));
                    return;
                }
                break;
            case 1158383408:
                if (actionId.equals("LIFESTYLE_ACTION_THEME_ID")) {
                    h.v2(aVar, TabLifestyleScreenContract$ModalStep.ThemeCustomisation.f89922a, ModalDestination.Style.POPUP.f98311a);
                    return;
                }
                break;
            case 1921241185:
                if (actionId.equals("LIFESTYLE_ACTION_DOCUMENTS_ID")) {
                    ((pme.b) aVar2).A2(TabLifestyleDocuments.f78060a);
                    return;
                }
                break;
        }
        y yVar = this.g0;
        x19.a aVar3 = (x19.a) ((a) ((j2) yVar.f22677a).getValue()).f89925c.getContent();
        if (aVar3 != null) {
            if (!(aVar3 instanceof x19.b)) {
                if (aVar3 instanceof a.b) {
                    N2(new c0(7));
                    h.v2(aVar, new TabLifestyleScreenContract$ModalStep.RevPointsFullScreenOptInModal(RevPointsOptInSource.TabHeader.f84008a), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                    return;
                }
                return;
            }
            List list = (List) ((a) ((j2) yVar.f22677a).getValue()).o.getContent();
            if (list == null || list.isEmpty()) {
                return;
            }
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    if (!s.p((hha.d) it8.next())) {
                        pme.b bVar6 = (pme.b) aVar2;
                        bVar6.getClass();
                        bVar6.A2(new BridgeDestination(new FeatureCommand(new PricingPlanFeatureConfig.UpgradeToAnyPlan(xfa.b.REV_POINTS, null, 14))));
                        return;
                    }
                }
            }
            pme.b bVar7 = (pme.b) aVar2;
            bVar7.getClass();
            bVar7.A2(new BridgeDestination(new FeatureCommand(new PricingPlanFeatureConfig.UltraDashboard(null))));
        }
    }

    public final void L2(BaseDraggableWidgetDelegate.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof com.revolut.core.ui_kit.delegates.widgets.j) {
            this.Z.z1(((com.revolut.core.ui_kit.delegates.widgets.j) event).f55385b, zi0.c.d(u.c(com.revolut.core.ui_kit.models.popup.a.a("LIFESTYLE_ACTION_ADD_WIDGET_ID", new TextLocalisedClause(R$string.lifestyle_header_actions_add_new_widget, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_widgets, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION))));
            return;
        }
        boolean z = event instanceof com.revolut.core.ui_kit.delegates.widgets.j2;
        wn.a aVar = this.z;
        if (z) {
            Object obj2 = ((com.revolut.core.ui_kit.delegates.widgets.j2) event).f55394c.i;
            if (obj2 instanceof kme.a) {
                J2((kme.a) obj2);
                return;
            }
            if (!(obj2 instanceof gme.e)) {
                int i = jli.h.f175850a;
                return;
            }
            k19.c cVar = ((gme.e) obj2).f144812a;
            String str = cVar.f180147a;
            k19.d0 d0Var = cVar.f180148b;
            M2(str, d0Var != null ? d0Var.f180151a : null, (com.revolut.analytics.ads.model.a) obj2);
            aVar.Z2((zn.d) obj2);
            return;
        }
        if (event instanceof b2) {
            b bVar = ((a) ((j2) this.g0.f22677a).getValue()).f89928j;
            if (bVar instanceof nme.y) {
                N2(new nfj.l(bVar, 27));
                return;
            } else {
                if (!(bVar instanceof b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i2 = jli.h.f175850a;
                return;
            }
        }
        if (event instanceof m4) {
            Object obj3 = ((m4) event).d;
            if (!(obj3 instanceof bme.a)) {
                int i3 = jli.h.f175850a;
                return;
            }
            k19.c cVar2 = ((bme.a) obj3).f16830a;
            String str2 = cVar2.f180147a;
            k19.d0 d0Var2 = cVar2.f180148b;
            M2(str2, d0Var2 != null ? d0Var2.f180151a : null, (com.revolut.analytics.ads.model.a) obj3);
            aVar.Z2((zn.d) obj3);
            return;
        }
        if (!(event instanceof k4)) {
            if (event instanceof l4) {
                l2(new z0(this, null), new yi5.b(26));
                return;
            }
            return;
        }
        Object obj4 = ((k4) event).f55408c;
        if (!(obj4 instanceof bme.a)) {
            int i5 = jli.h.f175850a;
            return;
        }
        k19.c cVar3 = ((bme.a) obj4).f16830a;
        String str3 = cVar3.f180147a;
        k19.d0 d0Var3 = cVar3.f180148b;
        M2(str3, d0Var3 != null ? d0Var3.f180151a : null, (com.revolut.analytics.ads.model.a) obj4);
        aVar.Z2((zn.d) obj4);
    }

    public final void M2(String originalDeeplink, String str, com.revolut.analytics.ads.model.a aVar) {
        Continuation continuation = null;
        if (str != null) {
            n2(new a1(this, new ProductArticleParams(new ProductArticleParams.ArticleReference.Id(str)), null), new whi.b(6));
            return;
        }
        Intrinsics.checkNotNullParameter(originalDeeplink, "originalDeeplink");
        n2(new n8a.r(this, originalDeeplink, aVar, continuation, 18), new whi.b(6));
        Unit unit = Unit.f186387a;
    }

    public final void N2(Function1 function1) {
        H2(this.g0, new js7.c(9, function1));
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f89943d0, new e0(1, this, continuation)), null, null, new nme.f0(10, this, continuation), 3);
        yji.l.b1(this, this.D.b(), null, new nme.f0(9, this, continuation), 3);
        yji.l.b1(this, rd0.e.b(osg.b.d(this.F)), null, new nme.f0(3, this, continuation), 3);
        t tVar = this.G;
        yji.l.b1(this, rd0.e.b(tVar.o()), null, new nme.f0(7, this, continuation), 3);
        yji.l.b1(this, rd0.e.b(tVar.q()), null, new nme.f0(5, this, continuation), 3);
        boolean zF = ((nyb.b) this.A).f();
        y yVar = this.g0;
        if (zF) {
            yji.l.b1(this, boh.f.e(u0.m(a.a.k(vkm.q.q(yVar.B(new nl0.c(29))), new c0(0)), vkm.q.q(yVar.B(new c0(1)))), new d0(this, 0)), null, new nme.f0(6, this, continuation), 3);
        }
        n2(new g0(2, this, continuation), new whi.b(6));
        n2(new g0(3, this, continuation), new whi.b(6));
        o oVar = this.N;
        yji.l.b1(this, vkm.q.Q(new n1g.p((z1) oVar.f178696c, oVar, 20), new e0(2, this, continuation)), null, new d(this, null), 3);
        ((z1) oVar.f178696c).k(Unit.f186387a);
        yji.l.b1(this, vkm.q.Q(a.a.k(zi0.c.w(vkm.q.q(yVar.B(new nl0.c(28)))), new c0(4)), new e0(3, this, continuation)), null, new nme.f0(13, this, continuation), 3);
        yji.l.b1(this, this.Q.f180650a, null, new nme.f0(15, this, continuation), 3);
        LifestyleWidgetContext.INSTANCE.getClass();
        yji.l.b1(this, this.P.c3(new LifestyleWidgetContext("LifestyleHome", null), dsh.s.NONE), null, new nme.f0(16, this, continuation), 3);
        n2(new c(this, null), new whi.b(6));
        e0 e0Var = new e0(4, this, continuation);
        vii.b bVar = this.f89942b0;
        yji.l.b1(this, vkm.q.Q(bVar, e0Var), null, new nme.f0(18, this, continuation), 3);
        yji.l.b1(this, vkm.q.Q(bVar, new e0(5, this, continuation)), null, new nme.f0(19, this, continuation), 3);
        yji.l.b1(this, vkm.q.Q(bVar, new e0(6, this, continuation)), null, new nme.f0(20, this, continuation), 3);
        yji.l.b1(this, vkm.q.Q(bVar, new e0(7, this, continuation)), null, new nme.f0(21, this, continuation), 3);
        yji.l.b1(this, this.M.d(), null, new jkh.g(this, continuation, 13), 3);
        yji.l.b1(this, this.O.Z2(), null, new nme.f0(17, this, continuation), 3);
        yji.l.b1(this, vkm.q.Q(this.c0, new e0(9, this, continuation)), null, null, 7);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.g0;
    }
}
