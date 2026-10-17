package kp0;

import android.animation.ValueAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.runtime.Composer;
import au0.b5;
import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.chat.ui.chat_profile.TranscriptPeriodOption;
import com.revolut.chat.ui.chat_profile.profile_screen.ChatProfileScreenContract$ModelStep;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.ProductIntroView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.onboarding.impl.ui.eligibility.CryptoOnboardingWorkflowFlowContract$Step;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.DonationSchedule;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.funds_confirmation.OpenBankingFundsConfirmationFlowContract$Step;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.funds_confirmation.OpenBankingFundsConfirmationScreen;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.funds_confirmation.OpenBankingFundsConfirmationScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.us.plaid.flow.UsPlaidFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.us.plaid.flow.UsPlaidFlowContract$Step;
import com.revolut.feature.external_accounts.impl.ui.us.plaid.screen.webview.UsPlaidWebViewScreen;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_embedded.api.navigation.InsuranceEmbeddedDestinations;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.travel.miles.impl.ui.flow.search_dashboard.TravelMilesFlightSearchDashboardPagerFlowContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.flow.search_dashboard.TravelMilesFlightSearchDashboardPagerFlowContract$PagerItem;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.TravelMilesFlightFinderScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.TravelMilesFlightFinderScreenContract$InputData;
import com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.a;
import com.revolut.feature.travel.miles.impl.ui.screen.home.TravelMilesHomeScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.home.b;
import com.revolut.feature.travel.miles.impl.ui.screen.main.TravelMilesMainScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.main.b;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlow;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch_entry.PlanSwitchToAnnualEntryFlowContract$Step;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowType;
import com.revolut.tracking.v3.NudgeContext;
import com.youTransactor.uCube.rpc.Constants;
import grl.i7;
import grl.k9;
import ip0.zj;
import java.io.File;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ms0.g3;
import ms0.i3;
import no.r1;
import org.jmrtd.lds.LDSFile;
import q6h.j;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f188037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f188038c;

    public /* synthetic */ m(Object obj2, Object obj3, int i) {
        this.f188036a = i;
        this.f188037b = obj2;
        this.f188038c = obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws Throwable {
        List listC;
        FeatureCommand featureCommandC;
        long j2;
        int i = this.f188036a;
        int i2 = 26;
        final int i3 = 2;
        Continuation continuation = null;
        int i5 = 1;
        Object obj4 = this.f188038c;
        int i6 = 0;
        Object obj5 = this.f188037b;
        switch (i) {
            case 0:
                n nVar = (n) obj5;
                a2.a aVar = (a2.a) obj4;
                ((Integer) obj2).getClass();
                Float f = (Float) obj3;
                if (!Intrinsics.e(nVar.f188041g, f)) {
                    nVar.f188041g = f;
                    aVar.invoke();
                }
                return Unit.f186387a;
            case 1:
                kp7.j jVar = (kp7.j) obj4;
                Function1 defaultItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultItems, "defaultItems");
                ServerError serverErrorA = ((kp7.t) obj5).f188197a.a((Throwable) obj2);
                Integer numValueOf = serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null;
                if (numValueOf != null && numValueOf.intValue() == 4507) {
                    FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("start_date_in_past", new TextLocalisedClause(R$string.car_insurance_plan_selection_error_start_date_in_past_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D074", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R$string.car_insurance_plan_selection_error_start_date_in_past_action, null, null, 14), false, null, null, false, 0, 0, 31684);
                    yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                    listC = zhm.u.c(model);
                } else {
                    listC = (List) defaultItems.invoke(new iii.d(14, null, true, false, null));
                }
                return kp7.t.g(listC, jVar.f188180g);
            case 2:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return ((kxg.e) obj5).f190579c.c((String) obj4);
            case 3:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj5;
                fb.c cVar = (fb.c) obj4;
                oki.g onResult = (oki.g) obj2;
                aii.r result = (aii.r) obj3;
                Intrinsics.checkNotNullParameter(onResult, "$this$onResult");
                Intrinsics.checkNotNullParameter(result, "result");
                if (ref$BooleanRef.f186407a) {
                    return Unit.f186387a;
                }
                cVar.invoke(new ky4.h(ref$BooleanRef, onResult, 0), result);
                return Unit.f186387a;
            case 4:
                Ref$BooleanRef ref$BooleanRef2 = (Ref$BooleanRef) obj5;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj4;
                oki.g onResult2 = (oki.g) obj2;
                aii.r output = (aii.r) obj3;
                Intrinsics.checkNotNullParameter(onResult2, "$this$onResult");
                Intrinsics.checkNotNullParameter(output, "output");
                if (!ref$BooleanRef2.f186407a) {
                    ref$BooleanRef2.f186407a = true;
                    ref$ObjectRef.f186409a = output;
                    onResult2.pop();
                }
                return Unit.f186387a;
            case 5:
                return PagerStateKt.animateScrollToPage$lambda$2((kotlin.jvm.internal.m0) obj5, (LazyLayoutScrollScope) obj4, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
            case 6:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                ((lc6.c) obj5).getClass();
                Clause[] elements = {new TextLocalisedClause(com.revolut.feature.donations.impl.R$string.donations_common_no_fees, null, null, 14), ic6.c.a((DonationSchedule) obj4)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return new bw0.m(new CompositeClause(kotlin.collections.d.L(elements), new DotDividerClause((Integer) null), null, null, 12), bw0.l.INFO, null, false, null, 20);
            case 7:
                ll9.f fVar = (ll9.f) obj5;
                File file = (File) obj4;
                oki.g showModalSticky = (oki.g) obj2;
                al9.g outputData = (al9.g) obj3;
                Intrinsics.checkNotNullParameter(showModalSticky, "$this$showModalSticky");
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                fVar.f196686t = showModalSticky;
                if (outputData instanceof al9.d) {
                    fVar.f196685s = fVar.T2(new ll6.i(fVar, file, continuation, 6), new yi5.b(27));
                } else if (outputData instanceof al9.e) {
                    fVar.Z2();
                } else if (!(outputData instanceof al9.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return ((lph.j) obj5).a((lph.a) obj4);
            case 9:
                String id10 = (String) obj4;
                ((Boolean) obj2).getClass();
                ((m28.h) ((m28.e) obj5).f201727c).getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                return new ErrorWidgetDelegate.Model(id10, null, new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.commodities_widget_assets_error_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_widget_common_error_action, null, null, 14), op0.q.MEDIUM, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
            case 10:
                UsPlaidFlowContract$InputData usPlaidFlowContract$InputData = (UsPlaidFlowContract$InputData) obj5;
                com.revolut.feature.external_accounts.impl.ui.us.plaid.flow.a aVar2 = (com.revolut.feature.external_accounts.impl.ui.us.plaid.flow.a) obj4;
                yki.l FlowCoordinator = (yki.l) obj2;
                UsPlaidFlowContract$Step step = (UsPlaidFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!Intrinsics.f(step, UsPlaidFlowContract$Step.WebView.f73083a)) {
                    throw new NoWhenBranchMatchedException();
                }
                UsPlaidWebViewScreen usPlaidWebViewScreen = new UsPlaidWebViewScreen(new no6.c(usPlaidFlowContract$InputData.f73082a));
                mk5.s block = new mk5.s(aVar2, FlowCoordinator, 18);
                Intrinsics.checkNotNullParameter(block, "block");
                usPlaidWebViewScreen.H = block;
                return usPlaidWebViewScreen;
            case 11:
                mq4.o oVar = (mq4.o) obj5;
                mq4.g gVar = (mq4.g) obj4;
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                ResourceImage resourceImageA = oVar.a();
                aw0.e eVarA = oVar.f207870c.a(false, gVar.f207857a, null);
                List list = (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null));
                com.revolut.feature.credit.card.api.navigation.a screenMode = gVar.f207857a;
                TextLocalisedClause textLocalisedClauseA = oq4.h.a(screenMode);
                Intrinsics.checkNotNullParameter(screenMode, "screenMode");
                return new mq4.j(eVarA, textLocalisedClauseA, resourceImageA, list);
            case 12:
                i3 i3Var = (i3) obj5;
                g3 g3Var = (g3) obj4;
                Throwable th10 = (Throwable) obj3;
                if (th10 != null) {
                    i3Var.c(1.0f);
                    ProductIntroView productIntroView = i3Var.f208280a;
                    productIntroView.setWillNotDraw(true);
                    productIntroView.j0(productIntroView.f56311w.r(th10));
                    return Unit.f186387a;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
                i3Var.f208281b = valueAnimatorOfFloat;
                if (valueAnimatorOfFloat != null) {
                    valueAnimatorOfFloat.addUpdateListener(new b5(i3Var, 26));
                }
                ValueAnimator valueAnimator = i3Var.f208281b;
                if (valueAnimator != null) {
                    valueAnimator.addListener(new az0.o0(i3Var, g3Var, 7));
                }
                ValueAnimator valueAnimator2 = i3Var.f208281b;
                if (valueAnimator2 != null) {
                    valueAnimator2.setDuration(i3Var.f208283g);
                }
                ValueAnimator valueAnimator3 = i3Var.f208281b;
                if (valueAnimator3 != null) {
                    valueAnimator3.start();
                }
                return Unit.f186387a;
            case 13:
                n8i.h1 h1Var = (n8i.h1) obj5;
                n8i.q qVar = (n8i.q) obj4;
                Function1 items = (Function1) obj3;
                Intrinsics.checkNotNullParameter(items, "items");
                return new n8i.n0(h1Var.f213435h.a(qVar.f213462b, null), new n8i.h0(h1Var.f213434g.a(qVar), false), n8i.k0.f213442a, null, (List) items.invoke(new iii.d(14, null, true, false, null)));
            case 14:
                TravelMilesFlightSearchDashboardPagerFlowContract$InputData travelMilesFlightSearchDashboardPagerFlowContract$InputData = (TravelMilesFlightSearchDashboardPagerFlowContract$InputData) obj5;
                final com.revolut.feature.travel.miles.impl.ui.flow.search_dashboard.a aVar3 = (com.revolut.feature.travel.miles.impl.ui.flow.search_dashboard.a) obj4;
                ali.b PagerCoordinator = (ali.b) obj2;
                TravelMilesFlightSearchDashboardPagerFlowContract$PagerItem pager = (TravelMilesFlightSearchDashboardPagerFlowContract$PagerItem) obj3;
                Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                Intrinsics.checkNotNullParameter(pager, "pager");
                if (pager instanceof TravelMilesFlightSearchDashboardPagerFlowContract$PagerItem.AirlinesHome) {
                    TravelMilesHomeScreen travelMilesHomeScreen = new TravelMilesHomeScreen();
                    final int i21 = 0;
                    Function1 block2 = new Function1() { // from class: ngg.m
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i21) {
                                case 0:
                                    com.revolut.feature.travel.miles.impl.ui.screen.home.b output2 = (com.revolut.feature.travel.miles.impl.ui.screen.home.b) obj6;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (!(output2 instanceof b.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar3.C2(new f((b.a) output2));
                                    return Unit.f186387a;
                                case 1:
                                    com.revolut.feature.travel.miles.impl.ui.screen.main.b output3 = (com.revolut.feature.travel.miles.impl.ui.screen.main.b) obj6;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    if (!(output3 instanceof b.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar3.C2(new g((b.a) output3));
                                    return Unit.f186387a;
                                default:
                                    com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.a outputData2 = (com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.a) obj6;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    boolean z = outputData2 instanceof ghg.k;
                                    com.revolut.feature.travel.miles.impl.ui.flow.search_dashboard.a aVar4 = aVar3;
                                    if (z) {
                                        ghg.k kVar = (ghg.k) outputData2;
                                        aVar4.C2(new e(kVar.f143914a, kVar.f143915b, kVar.f143916c));
                                    } else {
                                        if (!Intrinsics.f(outputData2, a.C0574a.f94288a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        String tabId = aVar4.f94253p.f94249a;
                                        Intrinsics.checkNotNullParameter(tabId, "tabId");
                                        aVar4.H2(aVar4.f94254q, new mll.h(tabId, 26));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block2, "block");
                    travelMilesHomeScreen.H = block2;
                    return travelMilesHomeScreen;
                }
                if (pager instanceof TravelMilesFlightSearchDashboardPagerFlowContract$PagerItem.AirlinesMain) {
                    TravelMilesMainScreen travelMilesMainScreen = new TravelMilesMainScreen();
                    final int i22 = 1;
                    Function1 block3 = new Function1() { // from class: ngg.m
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i22) {
                                case 0:
                                    com.revolut.feature.travel.miles.impl.ui.screen.home.b output2 = (com.revolut.feature.travel.miles.impl.ui.screen.home.b) obj6;
                                    Intrinsics.checkNotNullParameter(output2, "output");
                                    if (!(output2 instanceof b.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar3.C2(new f((b.a) output2));
                                    return Unit.f186387a;
                                case 1:
                                    com.revolut.feature.travel.miles.impl.ui.screen.main.b output3 = (com.revolut.feature.travel.miles.impl.ui.screen.main.b) obj6;
                                    Intrinsics.checkNotNullParameter(output3, "output");
                                    if (!(output3 instanceof b.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar3.C2(new g((b.a) output3));
                                    return Unit.f186387a;
                                default:
                                    com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.a outputData2 = (com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.a) obj6;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    boolean z = outputData2 instanceof ghg.k;
                                    com.revolut.feature.travel.miles.impl.ui.flow.search_dashboard.a aVar4 = aVar3;
                                    if (z) {
                                        ghg.k kVar = (ghg.k) outputData2;
                                        aVar4.C2(new e(kVar.f143914a, kVar.f143915b, kVar.f143916c));
                                    } else {
                                        if (!Intrinsics.f(outputData2, a.C0574a.f94288a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        String tabId = aVar4.f94253p.f94249a;
                                        Intrinsics.checkNotNullParameter(tabId, "tabId");
                                        aVar4.H2(aVar4.f94254q, new mll.h(tabId, 26));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block3, "block");
                    travelMilesMainScreen.H = block3;
                    return travelMilesMainScreen;
                }
                if (!(pager instanceof TravelMilesFlightSearchDashboardPagerFlowContract$PagerItem.FlightFinder)) {
                    throw new NoWhenBranchMatchedException();
                }
                TravelMilesFlightFinderScreen travelMilesFlightFinderScreen = new TravelMilesFlightFinderScreen(new TravelMilesFlightFinderScreenContract$InputData(travelMilesFlightSearchDashboardPagerFlowContract$InputData.f94246b, travelMilesFlightSearchDashboardPagerFlowContract$InputData.f94247c));
                Function1 block4 = new Function1() { // from class: ngg.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        switch (i3) {
                            case 0:
                                com.revolut.feature.travel.miles.impl.ui.screen.home.b output2 = (com.revolut.feature.travel.miles.impl.ui.screen.home.b) obj6;
                                Intrinsics.checkNotNullParameter(output2, "output");
                                if (!(output2 instanceof b.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar3.C2(new f((b.a) output2));
                                return Unit.f186387a;
                            case 1:
                                com.revolut.feature.travel.miles.impl.ui.screen.main.b output3 = (com.revolut.feature.travel.miles.impl.ui.screen.main.b) obj6;
                                Intrinsics.checkNotNullParameter(output3, "output");
                                if (!(output3 instanceof b.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar3.C2(new g((b.a) output3));
                                return Unit.f186387a;
                            default:
                                com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.a outputData2 = (com.revolut.feature.travel.miles.impl.ui.screen.flight_finder.a) obj6;
                                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                boolean z = outputData2 instanceof ghg.k;
                                com.revolut.feature.travel.miles.impl.ui.flow.search_dashboard.a aVar4 = aVar3;
                                if (z) {
                                    ghg.k kVar = (ghg.k) outputData2;
                                    aVar4.C2(new e(kVar.f143914a, kVar.f143915b, kVar.f143916c));
                                } else {
                                    if (!Intrinsics.f(outputData2, a.C0574a.f94288a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    String tabId = aVar4.f94253p.f94249a;
                                    Intrinsics.checkNotNullParameter(tabId, "tabId");
                                    aVar4.H2(aVar4.f94254q, new mll.h(tabId, 26));
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block4, "block");
                travelMilesFlightFinderScreen.H = block4;
                return travelMilesFlightFinderScreen;
            case 15:
                ni6.c cVar2 = (ni6.c) obj5;
                com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.funds_confirmation.a aVar4 = (com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.funds_confirmation.a) obj4;
                yki.l FlowCoordinator2 = (yki.l) obj2;
                OpenBankingFundsConfirmationFlowContract$Step step2 = (OpenBankingFundsConfirmationFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (!(step2 instanceof OpenBankingFundsConfirmationFlowContract$Step.FundsConfirmationScreen)) {
                    throw new NoWhenBranchMatchedException();
                }
                OpenBankingFundsConfirmationScreen openBankingFundsConfirmationScreen = new OpenBankingFundsConfirmationScreen(new OpenBankingFundsConfirmationScreenContract$InputData(cVar2.f215656a, cVar2.f215657b, cVar2.f215658c, cVar2.d, cVar2.e, cVar2.f));
                nc1.j block5 = new nc1.j(aVar4, FlowCoordinator2, 10);
                Intrinsics.checkNotNullParameter(block5, "block");
                openBankingFundsConfirmationScreen.H = block5;
                return openBankingFundsConfirmationScreen;
            case 16:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return ((nnf.n) obj5).b(((nnf.d) obj4).f217616b);
            case 17:
                AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
                NudgeContext.a aVarA = r1.a((r1) obj5, (txl.e) obj4);
                i7 i7Var = i7.Appeared;
                aVarA.c();
                ((NudgeContext) aVarA.f49761b).setAction(i7Var);
                com.google.protobuf.w0 w0VarA = aVarA.a();
                companion.getClass();
                return new ho.f((String) obj2, (AnalyticsProduct) obj3, AnalyticsContext.Companion.a(w0VarA));
            case 18:
                o88.b bVar = (o88.b) obj5;
                String listId = (String) obj4;
                ((Boolean) obj2).getClass();
                if (((Throwable) obj3) == null) {
                    return null;
                }
                ((p88.b) bVar.f222959c).getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                return new ErrorWidgetDelegate.Model(listId, null, new TextLocalisedClause(com.revolut.feature.junior.accounts.impl.R$string.junior_widgets_challenges_error_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.junior.accounts.impl.R$string.junior_widgets_challenges_error_description, null, null, 14), op0.q.SMALL, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
            case 19:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new obg.o((List) getDefaultErrorItems2.invoke(new iii.d(12, null, true, true, null)), (obg.n) iii.c.f(((obg.f) obj4).f223939a, new obg.q(i6), new ob2.a(3), new obg.p((obg.r) obj5, i5)));
            case 20:
                com.revolut.feature.crypto.onboarding.impl.ui.eligibility.a aVar5 = (com.revolut.feature.crypto.onboarding.impl.ui.eligibility.a) obj5;
                oi5.c cVar3 = (oi5.c) obj4;
                yki.l FlowCoordinator3 = (yki.l) obj2;
                CryptoOnboardingWorkflowFlowContract$Step step3 = (CryptoOnboardingWorkflowFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (!(step3 instanceof CryptoOnboardingWorkflowFlowContract$Step.Initial)) {
                    throw new NoWhenBranchMatchedException();
                }
                til.m mVar = aVar5.o;
                String str = cVar3.f225452a;
                AnalyticsProduct.Companion companion2 = AnalyticsProduct.INSTANCE;
                k9 k9Var = k9.Crypto;
                companion2.getClass();
                WorkflowFlow workflowFlowB = til.m.b(mVar, new WorkflowConfiguration.Workflow(str, (wi0.b) null, (NaviCommand) null, (String) null, AnalyticsProduct.Companion.b(k9Var), (WorkflowConfiguration.Extras) null, LDSFile.EF_DG14_TAG), WorkflowFlowType.Inner.f105817a, til.i.ANIMATED, 52);
                ofg.a block6 = new ofg.a(aVar5, FlowCoordinator3, 9);
                Intrinsics.checkNotNullParameter(block6, "block");
                workflowFlowB.H = block6;
                return workflowFlowB;
            case 21:
                return DefaultTextContextMenuDropdownProvider_androidKt.OpenContextMenu$lambda$2((TextContextMenuDataProvider) obj5, (TextContextMenuSession) obj4, (Composer) obj2, ((Integer) obj3).intValue());
            case 22:
                com.revolut.chat.ui.chat_profile.profile_screen.b bVar2 = (com.revolut.chat.ui.chat_profile.profile_screen.b) obj5;
                ChatProfileScreenContract$ModelStep chatProfileScreenContract$ModelStep = (ChatProfileScreenContract$ModelStep) obj4;
                eii.k result2 = (eii.k) obj3;
                Intrinsics.checkNotNullParameter((oki.g) obj2, "$this$onResult");
                Intrinsics.checkNotNullParameter(result2, "result");
                if (!(result2 instanceof eii.i)) {
                    return Unit.f186387a;
                }
                Object obj6 = ((eii.i) result2).f126655a;
                if (!(obj6 instanceof TranscriptPeriodOption)) {
                    return Unit.f186387a;
                }
                if (obj6 == TranscriptPeriodOption.ALL_TIME) {
                    bVar2.C2(o40.b.f221904a);
                } else if (obj6 == TranscriptPeriodOption.CUSTOM) {
                    ChatProfileScreenContract$ModelStep.TranscriptPeriodSelectionStep transcriptPeriodSelectionStep = (ChatProfileScreenContract$ModelStep.TranscriptPeriodSelectionStep) chatProfileScreenContract$ModelStep;
                    oki.h.v2(bVar2.B, new ChatProfileScreenContract$ModelStep.TranscriptPeriodCalendarStep(transcriptPeriodSelectionStep.f51130b, transcriptPeriodSelectionStep.f51129a), ModalDestination.Style.POPUP.f98311a);
                }
                return Unit.f186387a;
            case 23:
                ((Boolean) obj2).getClass();
                return ((pbe.a) obj5).h((hce.c) obj4, null);
            case 24:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch_entry.a aVar6 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch_entry.a) obj5;
                d67.u output2 = (d67.u) obj2;
                oki.g handle = (oki.g) obj3;
                Intrinsics.checkNotNullParameter(output2, "output");
                Intrinsics.checkNotNullParameter(handle, "handle");
                PlanSwitchToAnnualEntryFlowContract$Step.Prompt prompt = (PlanSwitchToAnnualEntryFlowContract$Step.Prompt) ((PlanSwitchToAnnualEntryFlowContract$Step) obj4);
                hha.d plan = prompt.f103249b;
                boolean z = prompt.f103250c;
                yki.i iVar = aVar6.f103255r;
                if (Intrinsics.f(output2, d67.s.f111464a)) {
                    handle.pop();
                    oki.h.w2(iVar, new PlanSwitchToAnnualEntryFlowContract$Step.SwitchToAnnual(plan, z), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                } else if (Intrinsics.f(output2, d67.q.f111462a)) {
                    oki.h.D2(iVar);
                } else if (Intrinsics.f(output2, d67.t.f111465a) || Intrinsics.f(output2, d67.r.f111463a)) {
                    int i32 = jli.h.f175850a;
                } else {
                    if (!(output2 instanceof d67.p)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str2 = ((d67.p) output2).f111461a.f275445a;
                    jgk.v vVar = aVar6.f103254q;
                    int iHashCode = str2.hashCode();
                    if (iHashCode != -1619115367) {
                        if (iHashCode != -654631745) {
                            if (iHashCode == 1619886170 && str2.equals("ID_PRICING_PLAN_FOOTER_GENERAL_TERMS_AND_CONDITIONS")) {
                                aVar6.l2(new pdi.j(aVar6, plan, continuation, 15), new yi5.b(i2));
                            }
                        } else if (str2.equals("ID_PRICING_PLAN_FOOTER_PROMOTION_TERMS_AND_CONDITIONS") && (featureCommandC = ((jjk.c) vVar).c(plan)) != null) {
                            aVar6.C1(zh9.u0.b(featureCommandC));
                        }
                    } else if (str2.equals("ID_PRICING_PLAN_FOOTER_INSURANCE_COVERAGE_POLICY")) {
                        ((jjk.c) vVar).getClass();
                        Intrinsics.checkNotNullParameter(plan, "plan");
                        aVar6.C1(zh9.u0.b(zh9.u0.f(new InsuranceEmbeddedDestinations.InsuranceDocumentsReview(plan.f152287a))));
                    }
                }
                return Unit.f186387a;
            case 25:
                String str3 = (String) obj4;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                ((pjh.k) obj5).getClass();
                String strQ = j6.a.q("PRODUCT_WIDGET_ERROR_combined_buying_power_", str3);
                RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_cash, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 16.0f, Float.valueOf(24.0f), null, 32), null, null, false, null, false, 60);
                List listK = zhm.v.k(new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), new ImageClause(R$drawable.uikit_icn_16_warning, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Float) null, (Float) null, 28));
                kotlin.jvm.internal.t0 t0Var = kotlin.jvm.internal.t0.f186434a;
                m70.a.t(t0Var);
                CompositeClause compositeClause = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                List listK2 = zhm.v.k(new ImageClause(R$drawable.uikit_icn_16_arrow_recurring, Integer.valueOf(R$attr.uikit_colorAccent), (Float) null, (Float) null, 28), new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14));
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                return new RowDelegate.Model(strQ, image40, compositeClause, null, 0, null, new CompositeClause(listK2, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Click(28, (Integer) null, (Object) wjh.p.f298108a, j6.a.q("PRODUCT_WIDGET_ERROR_combined_buying_power_", str3), false), null, 8), null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868792);
            case 26:
                pqg.i0 i0Var = (pqg.i0) obj5;
                xi0.b bVar3 = (xi0.b) obj4;
                pqg.q pocketData = (pqg.q) obj2;
                acb.b transferBreakdown = (acb.b) obj3;
                Intrinsics.checkNotNullParameter(pocketData, "pocketData");
                Intrinsics.checkNotNullParameter(transferBreakdown, "transferBreakdown");
                long jB = i0Var.z.b(((pqg.o) i0Var.t2()).f238750b, ((pqg.o) i0Var.t2()).f238749a.f306286a);
                qr0.i iVar2 = i0Var.E;
                long j3 = pocketData.f238760b;
                xi0.b bVar4 = ((pqg.o) i0Var.t2()).f238749a;
                if (transferBreakdown != null) {
                    dj0.d dVar = transferBreakdown.f3107b;
                    if (dVar == null) {
                        dVar = transferBreakdown.f3106a;
                    }
                    j2 = dVar.f115082a;
                } else {
                    j2 = 0;
                }
                long j5 = j2;
                sqg.b input = new sqg.b(jB, j3, bVar4, bVar3, j5, ((pqg.o) i0Var.t2()).f238751c + jB);
                iVar2.getClass();
                Intrinsics.checkNotNullParameter(input, "input");
                return pqg.o.b((pqg.o) i0Var.t2(), null, pocketData.f238759a, pocketData.f238760b, bVar3, null, transferBreakdown, ((srf.h) iVar2.f248595b).validate(new sqg.a(new srf.b(jB, j3, bVar3, bVar4, 1.0d, j5), new dcb.c(jB))).f316033b, null, false, false, null, 63887);
            case 27:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return new jsl.j0(((ssl.c) ((kbb.c) obj5).f182550c).a((jsl.a0) obj4), (List) getDefaultErrorItems3.invoke(new iii.d(14, null, false, false, null)));
            case 28:
                j.a aVar7 = q6h.j.Companion;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return ((q6h.j) obj5).b((q6h.a) obj4, null);
            default:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new o7j.v((TextLocalisedClause) obj5, (List) obj4);
        }
    }
}
