package sek;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.bills.core.api.provider.BillsDialogProvider$Payload;
import com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.institution_info.BrazilInstitutionInfoScreen;
import com.revolut.feature.payees.impl.ui.payees_overview.flow.PayeesOverviewFlow;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.feature.security_hub.impl.ui.linked_wallet_card_cancel.LinkedWalletCardCancelScreen;
import com.revolut.feature.spending_analytics.impl.ui.budget.category_budgets.CategoryBudgetsController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.custom_asset_details.CustomAssetDetailsController;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.travel.miles.impl.ui.screen.account_registration_tax_id.TravelMilesAccountRegistrationTaxIdScreen;
import com.revolut.feature.user_declarations.shared.flows.date_of_birth.screen.DateOfBirthScreen;
import com.revolut.feature.workflow.engine.rfi.impl.ui.timeline.YearPickerBottomSheetController;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.transition.AccountCreationTransitionAnimation;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.lounge_details.AirportLoungeDetailsScreen;
import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.terms.EsimMobilePlanPowerOfAttorneyTermsScreen;
import com.revolut.retail.wealth.resources.R$string;
import ip0.sp0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;
import rp0.y;
import sbb.w;
import tnb.b0;
import tnb.e0;
import vkm.j2;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f262218w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f262218w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q qVar = new q((r) this.f262218w, continuation, 0);
                qVar.v = obj2;
                return qVar;
            case 1:
                q qVar2 = new q((sf9.g) this.f262218w, continuation, 1);
                qVar2.v = obj2;
                return qVar2;
            case 2:
                q qVar3 = new q((TravelMilesAccountRegistrationTaxIdScreen) this.f262218w, continuation, 2);
                qVar3.v = obj2;
                return qVar3;
            case 3:
                q qVar4 = new q((BrazilInstitutionInfoScreen) this.f262218w, continuation, 3);
                qVar4.v = obj2;
                return qVar4;
            case 4:
                q qVar5 = new q((sjk.g) this.f262218w, continuation, 4);
                qVar5.v = obj2;
                return qVar5;
            case 5:
                q qVar6 = new q((sk4.e) this.f262218w, continuation, 5);
                qVar6.v = obj2;
                return qVar6;
            case 6:
                q qVar7 = new q((com.revolut.feature.backend_driven_limits.impl.v2.ui.list.d) this.f262218w, continuation, 6);
                qVar7.v = obj2;
                return qVar7;
            case 7:
                q qVar8 = new q((EsimMobilePlanPowerOfAttorneyTermsScreen) this.f262218w, continuation, 7);
                qVar8.v = obj2;
                return qVar8;
            case 8:
                q qVar9 = new q((PayeesOverviewFlow) this.f262218w, continuation, 8);
                qVar9.v = obj2;
                return qVar9;
            case 9:
                q qVar10 = new q((CategoryBudgetsController) this.f262218w, continuation, 9);
                qVar10.v = obj2;
                return qVar10;
            case 10:
                q qVar11 = new q((sne.g) this.f262218w, continuation, 10);
                qVar11.v = obj2;
                return qVar11;
            case 11:
                q qVar12 = new q((DateOfBirthScreen) this.f262218w, continuation, 11);
                qVar12.v = obj2;
                return qVar12;
            case 12:
                q qVar13 = new q((snk.r) this.f262218w, continuation, 12);
                qVar13.v = obj2;
                return qVar13;
            case 13:
                q qVar14 = new q((sob.g) this.f262218w, continuation, 13);
                qVar14.v = obj2;
                return qVar14;
            case 14:
                return new q((spb.m) this.v, (spb.p) this.f262218w, continuation, 14);
            case 15:
                q qVar15 = new q((spc.d) this.f262218w, continuation, 15);
                qVar15.v = obj2;
                return qVar15;
            case 16:
                q qVar16 = new q((com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.i) this.f262218w, continuation, 16);
                qVar16.v = obj2;
                return qVar16;
            case 17:
                return new q((sqf.g) this.v, (String) this.f262218w, continuation, 17);
            case 18:
                q qVar17 = new q((CustomAssetDetailsController) this.f262218w, continuation, 18);
                qVar17.v = obj2;
                return qVar17;
            case 19:
                q qVar18 = new q((st1.f) this.f262218w, continuation, 19);
                qVar18.v = obj2;
                return qVar18;
            case 20:
                q qVar19 = new q((LinkedWalletCardCancelScreen) this.f262218w, continuation, 20);
                qVar19.v = obj2;
                return qVar19;
            case 21:
                q qVar20 = new q((YearPickerBottomSheetController) this.f262218w, continuation, 21);
                qVar20.v = obj2;
                return qVar20;
            case 22:
                q qVar21 = new q((sw2.h) this.f262218w, continuation, 22);
                qVar21.v = obj2;
                return qVar21;
            case 23:
                q qVar22 = new q((sw6.h) this.f262218w, continuation, 23);
                qVar22.v = obj2;
                return qVar22;
            case 24:
                q qVar23 = new q((com.revolut.feature.transport.impl.ui.transit_checkout.fields.a) this.f262218w, continuation, 24);
                qVar23.v = obj2;
                return qVar23;
            case 25:
                q qVar24 = new q((swg.f) this.f262218w, continuation, 25);
                qVar24.v = obj2;
                return qVar24;
            case 26:
                q qVar25 = new q((sxg.k) this.f262218w, continuation, 26);
                qVar25.v = obj2;
                return qVar25;
            case 27:
                q qVar26 = new q((AirportLoungeDetailsScreen) this.f262218w, continuation, 27);
                qVar26.v = obj2;
                return qVar26;
            case 28:
                q qVar27 = new q((sxi.q) this.f262218w, continuation, 28);
                qVar27.v = obj2;
                return qVar27;
            default:
                q qVar28 = new q((com.revolut.camerakit.revolut.ui.flow.steps.camera.a) this.f262218w, continuation, 29);
                qVar28.v = obj2;
                return qVar28;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((q) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((q) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((q) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((q) create((EsimDescriptorValue) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((q) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((q) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((q) create((sne.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((q) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((q) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((q) create((spc.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((q) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((q) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((q) create((suc.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((q) create((sp0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((q) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                ((q) create(null, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                throw null;
            case 26:
                return ((q) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((q) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((q) create((sxi.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((q) create((xv.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v52, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object value;
        MainContainerScreenDestination.JustShow justShow;
        nmc.e eVar;
        Object value2;
        int i = this.u;
        int i2 = 8;
        int i3 = 14;
        int i5 = 3;
        int i6 = 0;
        int i21 = 7;
        int i22 = 1;
        int i32 = 26;
        LocalDate localDate = 0;
        y yVar = null;
        localDate = 0;
        Object obj3 = this.f262218w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVar = (r) obj3;
                rVar.H2(rVar.f262221r, new s86.k(data, i21));
                return Unit.f186387a;
            case 1:
                n1 n1Var = (n1) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Parcelable parcelableA = n1Var.a().a();
                if ((parcelableA instanceof BillsDialogProvider$Payload) && ((BillsDialogProvider$Payload) parcelableA).f61465a == 57421) {
                    j2 j2Var = ((sf9.g) obj3).f262381t;
                    do {
                        value = j2Var.getValue();
                    } while (!j2Var.h(value, sf9.j.a((sf9.j) value, null, null, null, 55)));
                }
                return Unit.f186387a;
            case 2:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sgg.f fVar = (sgg.f) ((TravelMilesAccountRegistrationTaxIdScreen) obj3).Q.getValue();
                Intrinsics.h(clickData);
                sgg.j jVar = (sgg.j) fVar;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (Intrinsics.f(clickData.f275445a, "SIGN_UP_TEXT_CLICK_ID")) {
                    jVar.C1(new ExternalDestination.Browser(jVar.o.f94263b.e, null));
                } else {
                    int i33 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 3:
                ty0.a aVar4 = (ty0.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sj6.d dVar = (sj6.d) ((BrazilInstitutionInfoScreen) obj3).P.getValue();
                String url2 = aVar4.f275445a;
                sj6.f fVar2 = (sj6.f) dVar;
                fVar2.getClass();
                Intrinsics.checkNotNullParameter(url2, "url");
                fVar2.C1(new ExternalDestination.Browser(url2, null));
                return Unit.f186387a;
            case 4:
                Data data2 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sjk.g gVar = (sjk.g) obj3;
                gVar.H2(gVar.f263741q, new s86.k(data2, i2));
                return Unit.f186387a;
            case 5:
                Data data3 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((sk4.e) obj3).x2(new s86.k(data3, 9));
                return Unit.f186387a;
            case 6:
                Data data4 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.backend_driven_limits.impl.v2.ui.list.d dVar2 = (com.revolut.feature.backend_driven_limits.impl.v2.ui.list.d) obj3;
                dVar2.H2(dVar2.f63220t, new s86.k(data4, 10));
                return Unit.f186387a;
            case 7:
                EsimDescriptorValue parcel = (EsimDescriptorValue) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                slj.h hVarE3 = ((EsimMobilePlanPowerOfAttorneyTermsScreen) obj3).R2();
                Intrinsics.h(parcel);
                slj.k kVar = (slj.k) hVarE3;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (!(parcel instanceof EsimDescriptorValue.Action)) {
                    if (!(parcel instanceof EsimDescriptorValue.Link)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kVar.l2(new w(kVar, ((EsimDescriptorValue.Link) parcel).f100253a, localDate, 15), new yi5.b(i32));
                }
                return Unit.f186387a;
            case 8:
                String tabId = (String) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sm9.c cVar = (sm9.c) ((PayeesOverviewFlow) obj3).P.getValue();
                Intrinsics.h(tabId);
                com.revolut.feature.payees.impl.ui.payees_overview.flow.c cVar2 = (com.revolut.feature.payees.impl.ui.payees_overview.flow.c) cVar;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                cVar2.H2(cVar2.f79009q, new sef.j(tabId, i5));
                return Unit.f186387a;
            case 9:
                String menuItemId = (String) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                smd.u uVarE3 = ((CategoryBudgetsController) obj3).R2();
                Intrinsics.h(menuItemId);
                uVarE3.getClass();
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                if (menuItemId.equals("CATEGORY_BUDGETS_RESET")) {
                    uVarE3.H2(uVarE3.u, new sl3.i(uVarE3, i3));
                }
                return Unit.f186387a;
            case 10:
                sne.d dVar3 = (sne.d) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                pne.y yVar2 = (pne.y) j6.a.k(pne.y.class, ((sne.g) obj3).f264568c, sne.g.a(dVar3));
                if (yVar2 != null) {
                    return knm.b.K(yVar2);
                }
                return null;
            case 11:
                od0.i iVar = (od0.i) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sng.i iVar2 = (sng.i) ((DateOfBirthScreen) obj3).P.getValue();
                LocalDate localDate2 = (LocalDate) iVar.f224257a;
                if (localDate2 != null) {
                    iVar2.getClass();
                    if (localDate2.getYear() >= 1000) {
                        localDate = localDate2;
                    }
                }
                iVar2.H2(iVar2.o, new a15.l(29, localDate));
                return Unit.f186387a;
            case 12:
                String str = (String) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                snk.r rVar2 = (snk.r) obj3;
                rVar2.H2(rVar2.f264654w, new rk.b(rVar2.f264650q.a("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$", str), i2));
                return Unit.f186387a;
            case 13:
                Data data5 = (Data) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sob.g gVar2 = (sob.g) obj3;
                gVar2.H2(gVar2.f264811s, new s86.k(data5, 16));
                return Unit.f186387a;
            case 14:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                uc7.a aVar17 = ((spb.m) this.v).f264940j;
                spb.p pVar = (spb.p) obj3;
                if (pVar instanceof spb.o) {
                    justShow = spb.m.N(((spb.o) pVar).f264942a.f234881a);
                } else {
                    if (!(pVar instanceof spb.n)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pcd.s sVar = ((spb.n) pVar).f264941a;
                    if (sVar != null) {
                        justShow = spb.m.N(sVar.f234881a);
                    } else {
                        MainScreenTab mainScreenTab = ibb.c.f160140a;
                        ProductId productId = ProductId.SAVINGS;
                        e0.Companion.getClass();
                        justShow = new MainContainerScreenDestination.JustShow(mainScreenTab, new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(b0.f272369b, null), productId), null), (AccountCreationTransitionAnimation) null, 12);
                    }
                }
                aVar17.b(new fc7.d(justShow));
                return Unit.f186387a;
            case 15:
                spc.j jVar2 = (spc.j) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c84.c cVar3 = ((spc.d) obj3).d;
                xdh.b rebalanceStatus = jVar2.f264950a;
                Intrinsics.checkNotNullParameter(rebalanceStatus, "rebalanceStatus");
                ((spc.f) cVar3.f22078n).getClass();
                Intrinsics.checkNotNullParameter(rebalanceStatus, "rebalanceStatus");
                Intrinsics.checkNotNullParameter(rebalanceStatus, "rebalanceStatus");
                switch (nmc.f.f217268a[rebalanceStatus.ordinal()]) {
                    case 1:
                        eVar = new nmc.e(R$string.wealth_robo_portfolio_rebalance_state_pending_initial_funding, R$string.wealth_robo_portfolio_rebalance_state_pending_initial_funding_description);
                        break;
                    case 2:
                        eVar = new nmc.e(R$string.wealth_robo_portfolio_rebalance_state_pending_cash_allocation, R$string.wealth_robo_portfolio_rebalance_state_pending_cash_allocation_description);
                        break;
                    case 3:
                        eVar = new nmc.e(R$string.wealth_robo_portfolio_rebalance_state_pending_rebalancing, R$string.wealth_robo_portfolio_rebalance_state_pending_rebalancing_description);
                        break;
                    case 4:
                        eVar = new nmc.e(R$string.wealth_robo_portfolio_rebalance_state_pending_template_change, R$string.wealth_robo_portfolio_rebalance_state_pending_template_change_description);
                        break;
                    case 5:
                        eVar = new nmc.e(R$string.wealth_robo_portfolio_rebalance_state_pending_template_allocation_change, R$string.wealth_robo_portfolio_rebalance_state_pending_template_allocation_change_description);
                        break;
                    case 6:
                        eVar = null;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                if (eVar != null) {
                    rp0.t tVar = new rp0.t(new TextLocalisedClause(eVar.f217266a, null, null, 14), new TextLocalisedClause(eVar.f217267b, null, null, 14), null, 28);
                    LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("got-it-button", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.wealth_robo_common_got_it, null, null, 14), false, null, null, spc.i.f264949a, null, 744);
                    int i43 = R$attr.uikit_dp24;
                    yp0.b.r(model, i43, i43, 0, 0, 12);
                    yVar = new y(zhm.u.c(model), tVar, null, null, null, null, 1020);
                }
                if (yVar != null) {
                    ((j60.a) cVar3.f22077m).x(yVar);
                }
                return Unit.f186387a;
            case 16:
                Data data6 = (Data) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.i iVar3 = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review.i) obj3;
                iVar3.H2(iVar3.z, new s86.k(data6, 17));
                return Unit.f186387a;
            case 17:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((sqf.g) this.v).x2(new sef.j((String) obj3, 11));
                return Unit.f186387a;
            case 18:
                ty0.a aVar21 = (ty0.a) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Object obj4 = aVar21.d;
                String url3 = obj4 instanceof String ? (String) obj4 : null;
                if (url3 != null) {
                    srd.q qVar = (srd.q) ((CustomAssetDetailsController) obj3).R2();
                    qVar.getClass();
                    Intrinsics.checkNotNullParameter(url3, "url");
                    qVar.C1(u0.c(new WebViewFeatureConfig(url3, null, 0, false, false, false, 130958)));
                }
                return Unit.f186387a;
            case 19:
                od0.i iVar4 = (od0.i) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j2 j2Var2 = ((st1.f) obj3).u;
                do {
                    value2 = j2Var2.getValue();
                } while (!j2Var2.h(value2, st1.c.a((st1.c) value2, (e7l.c) iVar4.g(), null, 2)));
                return Unit.f186387a;
            case 20:
                suc.j parcel2 = (suc.j) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                suc.m mVar = (suc.m) ((LinkedWalletCardCancelScreen) obj3).S.getValue();
                mVar.getClass();
                Intrinsics.checkNotNullParameter(parcel2, "parcel");
                String str2 = mVar.o.f85589a;
                if (Intrinsics.f(parcel2, suc.h.f265708a)) {
                    mVar.l2(new suc.l(mVar, str2, localDate, i6), new yi5.b(i32));
                } else {
                    if (!Intrinsics.f(parcel2, suc.i.f265709a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mVar.l2(new suc.l(mVar, str2, localDate, i22), new yi5.b(i32));
                }
                return Unit.f186387a;
            case 21:
                sp0 sp0Var = (sp0) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                suh.o oVar = ((YearPickerBottomSheetController) obj3).Q;
                int i59 = sp0Var.f166384b;
                oVar.getClass();
                oVar.C2(new suh.n(i59));
                return Unit.f186387a;
            case 22:
                Data data7 = (Data) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sw2.h hVar = (sw2.h) obj3;
                hVar.H2(hVar.f266077q, new s86.k(data7, 23));
                return Unit.f186387a;
            case 23:
                Data data8 = (Data) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sw6.h hVar2 = (sw6.h) obj3;
                hVar2.H2(hVar2.f266123s, new s86.k(data8, 24));
                return Unit.f186387a;
            case 24:
                List list = (List) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j2 j2Var3 = ((com.revolut.feature.transport.impl.ui.transit_checkout.fields.a) obj3).f92581p;
                swf.f fVarA = swf.f.a((swf.f) j2Var3.getValue(), null, list, 1);
                j2Var3.getClass();
                j2Var3.g(null, fVarA);
                return Unit.f186387a;
            case 25:
                if (this.v != null) {
                    throw new ClassCastException();
                }
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                throw null;
            case 26:
                List list2 = (List) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj5 : list2) {
                    iwg.a aVar31 = ((mwg.k) obj5).f209469a;
                    Object arrayList = linkedHashMap.get(aVar31);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(aVar31, arrayList);
                    }
                    ((List) arrayList).add(obj5);
                }
                sxg.k kVar2 = (sxg.k) obj3;
                ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    arrayList2.add(sxg.k.c(kVar2, (iwg.a) entry.getKey(), (List) entry.getValue()));
                }
                return arrayList2.isEmpty() ? new go.g(zi0.c.P(f0.f322471a, false, null, 3), 2) : nim.a.v(u0.k(arrayList2), new sx2.g(13));
            case 27:
                String itemId = (String) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sxi.l lVarI3 = ((AirportLoungeDetailsScreen) obj3).T2();
                Intrinsics.h(itemId);
                sxi.q qVar2 = (sxi.q) lVarI3;
                qVar2.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (itemId.equals("ID_ADD_REMOVE_SAVED_LOUNGE_MENU_ITEM")) {
                    qVar2.l2(new rf9.h(qVar2, Intrinsics.f(((sxi.g) qVar2.t2()).f266500a.f266505b.getContent(), Boolean.TRUE), (Continuation) null), new yi5.b(i32));
                }
                return Unit.f186387a;
            case 28:
                sxi.i iVar5 = (sxi.i) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((sxi.q) obj3).x2(new sx8.a(iVar5, i22));
                return Unit.f186387a;
            default:
                xv.l detectorResult = (xv.l) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.camerakit.revolut.ui.flow.steps.camera.a aVar35 = (com.revolut.camerakit.revolut.ui.flow.steps.camera.a) obj3;
                cli.y yVar3 = aVar35.z;
                sy.e eVar2 = (sy.e) ((j2) yVar3.f22677a).getValue();
                if (eVar2 instanceof sy.c) {
                    sy.c cVar4 = (sy.c) eVar2;
                    aVar35.H2(yVar3, new sx2.h(cVar4, detectorResult, i21));
                    yy.c cVar5 = aVar35.f50807t;
                    gv.d screenFlashState = cVar4.d;
                    cVar5.getClass();
                    Intrinsics.checkNotNullParameter(detectorResult, "detectorResult");
                    Intrinsics.checkNotNullParameter(screenFlashState, "screenFlashState");
                    ((sx.b) cVar5.f317737n).d(detectorResult, screenFlashState);
                } else if (!(eVar2 instanceof sy.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f262218w = obj2;
    }
}
