package gul;

import androidx.camera.core.Camera;
import aw0.f4;
import aw0.n6;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.data.model.Data;
import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.details.EnrollmentDetailsScreen;
import com.revolut.feature.card_order_new.impl.kompot.screen.delivery_to_form.DeliveryToFormController;
import com.revolut.feature.card_screen.impl.kompot.physical_card_replacement_dialog.screen.PhysicalCardReplacementDialogScreen;
import com.revolut.feature.cards.models.delivery.CardDeliveryRecipient;
import com.revolut.feature.credit.core.ui.picker.PickerBottomSheetController;
import com.revolut.feature.hyper_text.model.HyperTextTarget;
import com.revolut.feature.hyper_text.ui.HyperTextClickData;
import com.revolut.feature.invest_feed.impl.widgets.analytics.screen.AnalyticsMethodScreen;
import com.revolut.feature.kyc.api.navigation.ConfirmAddressDestination;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import com.revolut.feature.security_hub.impl.ui.secure_account.SecureAccountController;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.support.api.navigation.SupportFeatureConfig;
import com.revolut.feature.topup_screen.impl.mcy.account_verification.McyTopupAccountVerificationScreen;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import com.revolut.feature.wealth.analytics.ui.widgetised.total_value.WidgetisedAnalyticsTotalValueScreen;
import com.revolut.feature.wealth.analytics.ui.widgetised.total_value.WidgetisedAnalyticsTotalValueScreenContract$ModalStep;
import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig;
import com.revolut.feature_move_money.api.MoveMoneyFeatureApi$Toggles;
import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.traveller_details.AsftTravellerDetailsScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_list.AirportLoungesPassListScreen;
import com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.BankBeneficiaryDetailsScreen;
import com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.BankBeneficiaryDetailsScreenContract$ModalStep;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.holdings_average_price.CommodityHoldingsAvgPriceController;
import com.revolut.retail.feature.payments.payment_links.core.actions.accept_link.AcceptPaymentLinkAction$DialogPayload;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import cul.k0;
import h6i.p0;
import ip0.t5;
import ip0.um0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mzj.e;
import nxa.t0;
import tof.a3;
import tof.i7;
import tof.q6;
import tof.u7;
import vkm.j2;
import zh9.u0;
import zhm.r0;

/* JADX INFO: loaded from: classes12.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f146991w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f146991w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                n nVar = new n((k0) this.f146991w, continuation, 0);
                nVar.v = obj2;
                return nVar;
            case 1:
                n nVar2 = new n((SecureAccountController) this.f146991w, continuation, 1);
                nVar2.v = obj2;
                return nVar2;
            case 2:
                n nVar3 = new n((AsftTravellerDetailsScreen) this.f146991w, continuation, 2);
                nVar3.v = obj2;
                return nVar3;
            case 3:
                n nVar4 = new n((gvi.r) this.f146991w, continuation, 3);
                nVar4.v = obj2;
                return nVar4;
            case 4:
                return new n((gw.e) this.v, (Camera) this.f146991w, continuation, 4);
            case 5:
                n nVar5 = new n((gxa.c) this.f146991w, continuation, 5);
                nVar5.v = obj2;
                return nVar5;
            case 6:
                n nVar6 = new n((PickerBottomSheetController) this.f146991w, continuation, 6);
                nVar6.v = obj2;
                return nVar6;
            case 7:
                n nVar7 = new n((AirportLoungesPassListScreen) this.f146991w, continuation, 7);
                nVar7.v = obj2;
                return nVar7;
            case 8:
                n nVar8 = new n((gzd.h) this.f146991w, continuation, 8);
                nVar8.v = obj2;
                return nVar8;
            case 9:
                n nVar9 = new n((WidgetisedAnalyticsTotalValueScreen) this.f146991w, continuation, 9);
                nVar9.v = obj2;
                return nVar9;
            case 10:
                n nVar10 = new n((gzj.d) this.f146991w, continuation, 10);
                nVar10.v = obj2;
                return nVar10;
            case 11:
                n nVar11 = new n((McyTopupAccountVerificationScreen) this.f146991w, continuation, 11);
                nVar11.v = obj2;
                return nVar11;
            case 12:
                n nVar12 = new n((com.revolut.feature.topup_screen.impl.mcy.account_verification.c) this.f146991w, continuation, 12);
                nVar12.v = obj2;
                return nVar12;
            case 13:
                n nVar13 = new n((h1k.l) this.f146991w, continuation, 13);
                nVar13.v = obj2;
                return nVar13;
            case 14:
                n nVar14 = new n((AnalyticsMethodScreen) this.f146991w, continuation, 14);
                nVar14.v = obj2;
                return nVar14;
            case 15:
                n nVar15 = new n((DeliveryToFormController) this.f146991w, continuation, 15);
                nVar15.v = obj2;
                return nVar15;
            case 16:
                n nVar16 = new n((BankBeneficiaryDetailsScreen) this.f146991w, continuation, 16);
                nVar16.v = obj2;
                return nVar16;
            case 17:
                return new n((h4d.h) this.v, (ArrayList) this.f146991w, continuation, 17);
            case 18:
                n nVar17 = new n((h5b.m) this.f146991w, continuation, 18);
                nVar17.v = obj2;
                return nVar17;
            case 19:
                n nVar18 = new n((h5g.e) this.f146991w, continuation, 19);
                nVar18.v = obj2;
                return nVar18;
            case 20:
                n nVar19 = new n((p0) this.f146991w, continuation, 20);
                nVar19.v = obj2;
                return nVar19;
            case 21:
                n nVar20 = new n((CommodityHoldingsAvgPriceController) this.f146991w, continuation, 21);
                nVar20.v = obj2;
                return nVar20;
            case 22:
                n nVar21 = new n((h7k.i) this.f146991w, continuation, 22);
                nVar21.v = obj2;
                return nVar21;
            case 23:
                n nVar22 = new n((PhysicalCardReplacementDialogScreen) this.f146991w, continuation, 23);
                nVar22.v = obj2;
                return nVar22;
            case 24:
                n nVar23 = new n((EnrollmentDetailsScreen) this.f146991w, continuation, 24);
                nVar23.v = obj2;
                return nVar23;
            case 25:
                n nVar24 = new n((com.revolut.feature.apm.multibanco.impl.via_verde.ui.details.b) this.f146991w, continuation, 25);
                nVar24.v = obj2;
                return nVar24;
            case 26:
                n nVar25 = new n((h9f.d) this.f146991w, continuation, 26);
                nVar25.v = obj2;
                return nVar25;
            case 27:
                n nVar26 = new n((hae.l) this.f146991w, continuation, 27);
                nVar26.v = obj2;
                return nVar26;
            case 28:
                n nVar27 = new n((com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.e) this.f146991w, continuation, 28);
                nVar27.v = obj2;
                return nVar27;
            default:
                n nVar28 = new n((com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donationbreakdown.a) this.f146991w, continuation, 29);
                nVar28.v = obj2;
                return nVar28;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((n) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [aii.u] */
    /* JADX WARN: Type inference failed for: r15v11, types: [gzj.d, yji.n] */
    /* JADX WARN: Type inference failed for: r2v103, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v107, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v58, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v62, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v66, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v88, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object moveMoneyDestination;
        int i = this.u;
        int i2 = 25;
        int i3 = 7;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        int i5 = 18;
        int i6 = 6;
        int i21 = 26;
        int i22 = 27;
        final int i32 = 1;
        ?? C = 0;
        C = 0;
        final int i33 = 0;
        Object obj3 = this.f146991w;
        switch (i) {
            case 0:
                BigDecimal bigDecimal = (BigDecimal) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((k0) obj3).invoke(bigDecimal);
                return Unit.f186387a;
            case 1:
                gvc.t parcel = (gvc.t) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.security_hub.impl.ui.secure_account.a aVar3 = (com.revolut.feature.security_hub.impl.ui.secure_account.a) ((SecureAccountController) obj3).R2();
                cli.y yVar = aVar3.f85635t;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel instanceof gvc.p) {
                    aVar3.H2(yVar, new gqd.s(aVar3, ((gvc.p) parcel).f147141a, 28));
                } else if (parcel instanceof gvc.q) {
                    String str = ((gvc.q) parcel).f147142a;
                    LinkedHashMap linkedHashMapZ = r0.z(((gvc.g) ((j2) yVar.f22677a).getValue()).e);
                    if (((Boolean) linkedHashMapZ.get(str)) != null) {
                        linkedHashMapZ.put(str, Boolean.valueOf(!r5.booleanValue()));
                        aVar3.H2(yVar, new awk.j(linkedHashMapZ, 5));
                    }
                } else if (parcel instanceof gvc.r) {
                    String str2 = ((gvc.r) parcel).f147143a;
                    LinkedHashMap linkedHashMapZ2 = r0.z(((gvc.g) ((j2) yVar.f22677a).getValue()).f);
                    if (((Boolean) linkedHashMapZ2.get(str2)) != null) {
                        linkedHashMapZ2.put(str2, Boolean.valueOf(!r6.booleanValue()));
                        aVar3.H2(yVar, new awk.j(linkedHashMapZ2, i3));
                    }
                } else {
                    if (!(parcel instanceof gvc.s)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str3 = ((gvc.s) parcel).f147144a;
                    LinkedHashMap linkedHashMapZ3 = r0.z(((gvc.g) ((j2) yVar.f22677a).getValue()).f147128g);
                    if (((Boolean) linkedHashMapZ3.get(str3)) != null) {
                        linkedHashMapZ3.put(str3, Boolean.valueOf(!r5.booleanValue()));
                        aVar3.H2(yVar, new awk.j(linkedHashMapZ3, i6));
                    }
                }
                return Unit.f186387a;
            case 2:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                gvi.l lVarE3 = ((AsftTravellerDetailsScreen) obj3).R2();
                Intrinsics.h(clickData);
                gvi.r rVar = (gvi.r) lVarE3;
                rVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj4 = clickData.d;
                if (obj4 instanceof HyperTextClickData) {
                    HyperTextTarget hyperTextTarget = ((HyperTextClickData) obj4).f74762a;
                    if (hyperTextTarget instanceof HyperTextTarget.Link) {
                        rVar.C1(new ExternalDestination.Browser(((HyperTextTarget.Link) hyperTextTarget).f74757a, null));
                    }
                } else {
                    r6.b.D("Parcel must be HyperTextClickData");
                }
                return Unit.f186387a;
            case 3:
                Data data = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                gvi.r rVar2 = (gvi.r) obj3;
                rVar2.H2(rVar2.f147200t, new ghg.r(data, i2));
                return Unit.f186387a;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Camera camera = (Camera) obj3;
                gw.e.f(camera, 0);
                hw.a.a(camera, false);
                return Unit.f186387a;
            case 5:
                String str4 = (String) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return j6.a.k(t0.class, ((gxa.c) obj3).f147740a, gxa.c.a(str4));
            case 6:
                Pair pair = (Pair) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((gy4.k) ((PickerBottomSheetController) obj3).T.getValue()).I2(new gy4.f(((Number) pair.f186386b).intValue()));
                return Unit.f186387a;
            case 7:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                gyi.h hVarE3 = ((AirportLoungesPassListScreen) obj3).k3();
                Intrinsics.h(clickData2);
                gyi.d0 d0Var = (gyi.d0) hVarE3;
                d0Var.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                Object obj5 = clickData2.d;
                HyperTextClickData hyperTextClickData = obj5 instanceof HyperTextClickData ? (HyperTextClickData) obj5 : null;
                if (hyperTextClickData != null) {
                    HyperTextTarget hyperTextTarget2 = hyperTextClickData.f74762a;
                    HyperTextTarget.Link link = hyperTextTarget2 instanceof HyperTextTarget.Link ? (HyperTextTarget.Link) hyperTextTarget2 : null;
                    if (link != null) {
                        d0Var.l2(new gyi.b0(d0Var, link, null), new yi5.b(i21));
                    }
                }
                return Unit.f186387a;
            case 8:
                Set set = (Set) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                gzd.h hVar = (gzd.h) obj3;
                hVar.H2(hVar.f148060p, new a83.d0(i2, set));
                return Unit.f186387a;
            case 9:
                TagViewData tagViewData = (TagViewData) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                gzg.p pVarE3 = ((WidgetisedAnalyticsTotalValueScreen) obj3).d();
                Intrinsics.h(tagViewData);
                com.revolut.feature.wealth.analytics.ui.widgetised.total_value.a aVar12 = (com.revolut.feature.wealth.analytics.ui.widgetised.total_value.a) pVarE3;
                aVar12.getClass();
                Intrinsics.checkNotNullParameter(tagViewData, "tagViewData");
                Object obj6 = tagViewData.k;
                if (obj6 instanceof gzg.q) {
                    oki.h.v2(aVar12.f95136w, new WidgetisedAnalyticsTotalValueScreenContract$ModalStep.ContributionsSelection(((gzg.q) obj6).f148119a), bottom_dialog);
                }
                return Unit.f186387a;
            case 10:
                mzj.e destination = (mzj.e) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ?? r152 = (gzj.d) obj3;
                ((r60.d) r152.f148148r).Q();
                mzj.g gVar = r152.f148149s;
                Intrinsics.h(destination);
                gVar.getClass();
                Intrinsics.checkNotNullParameter(destination, "destination");
                if (destination.equals(e.a.f210780a)) {
                    C = mzj.g.c(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, null, 6)));
                } else {
                    if (destination.equals(e.b.f210781a)) {
                        moveMoneyDestination = new ConfirmAddressDestination(null, 7);
                    } else if (destination.equals(e.c.f210782a)) {
                        C = zj2.a.a(gVar.f210790a, null, 3);
                    } else if (destination.equals(e.C1189e.f210784a)) {
                        if (((jte.d) gVar.f210791b).c(MoveMoneyFeatureApi$Toggles.MoveMoneyExchangeEntryPointsMovedPlans.f97189c)) {
                            moveMoneyDestination = new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveMoney(StartUpPocket.FiatAccountsAll.f104847a, (com.revolut.shared.feature.move_money.api.navigation.a) null, 6), (Set) null, 6), null);
                        } else {
                            C = mzj.g.c(new ExchangeFeatureConfig.Default(i33));
                        }
                    } else if (destination.equals(e.g.f210786a)) {
                        C = mzj.g.c(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160141b.f83420a, null), null, null, 6)));
                    } else if (destination instanceof mzj.f) {
                        mzj.f fVar = (mzj.f) destination;
                        hha.u uVar = fVar.f210787a;
                        xfa.b bVar = fVar.f210788b;
                        List list = fVar.f210789c;
                        if (list != null && list.size() == 1 && hha.s.p((hha.d) list.get(0))) {
                            C = mzj.g.c(new PricingPlanFeatureConfig.UltraDashboard(uVar));
                        } else {
                            if (list == null) {
                                list = zhm.f0.f322471a;
                            }
                            List list2 = list;
                            ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                            Iterator it8 = list2.iterator();
                            while (it8.hasNext()) {
                                arrayList.add(((hha.d) it8.next()).f152287a);
                            }
                            C = mzj.g.c(new PricingPlanFeatureConfig.DashboardByPlans(uVar, arrayList, null, null, false, bVar, 188));
                        }
                    } else if (!destination.equals(e.d.f210783a) && !destination.equals(e.f.f210785a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C = moveMoneyDestination;
                }
                if (C != 0) {
                    r152.A2(C);
                }
                return Unit.f186387a;
            case 11:
                f4 f4Var = (f4) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h0f.g gVarE3 = ((McyTopupAccountVerificationScreen) obj3).d();
                Intrinsics.h(f4Var);
                ((com.revolut.feature.topup_screen.impl.mcy.account_verification.c) gVarE3).J2(new h0f.h(f4Var));
                return Unit.f186387a;
            case 12:
                n61.d dVar = (n61.d) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.topup_screen.impl.mcy.account_verification.c cVar = (com.revolut.feature.topup_screen.impl.mcy.account_verification.c) obj3;
                cVar.H2(cVar.u, new gwe.d(dVar, 12));
                return Unit.f186387a;
            case 13:
                Data data2 = (Data) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((h1k.l) obj3).x2(new h1k.k(data2, i33));
                return Unit.f186387a;
            case 14:
                h28.c cVar2 = (h28.c) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((h28.j) ((AnalyticsMethodScreen) obj3).O.getValue()).accept(cVar2);
                return Unit.f186387a;
            case 15:
                final h33.o event = (h33.o) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h33.g gVar2 = (h33.g) ((DeliveryToFormController) obj3).M.getValue();
                cli.y yVar2 = gVar2.o;
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof h33.n) {
                    String str5 = ((h33.n) event).f149032a;
                    int iHashCode = str5.hashCode();
                    if (iHashCode != -497451604) {
                        if (iHashCode != 252782246) {
                            if (iHashCode == 318758048 && str5.equals("FIRST_NAME_ID")) {
                                gVar2.H2(yVar2, new Function1() { // from class: h33.f
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj7) {
                                        h update = (h) obj7;
                                        switch (i33) {
                                            case 0:
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                return h.a(update, ((n) event).f149033b, null, null, 6);
                                            case 1:
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                return h.a(update, null, ((n) event).f149033b, null, 5);
                                            default:
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                return h.a(update, null, null, ((n) event).f149033b, 3);
                                        }
                                    }
                                });
                            }
                        } else if (str5.equals("LAST_NAME_ID")) {
                            gVar2.H2(yVar2, new Function1() { // from class: h33.f
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj7) {
                                    h update = (h) obj7;
                                    switch (i32) {
                                        case 0:
                                            Intrinsics.checkNotNullParameter(update, "$this$update");
                                            return h.a(update, ((n) event).f149033b, null, null, 6);
                                        case 1:
                                            Intrinsics.checkNotNullParameter(update, "$this$update");
                                            return h.a(update, null, ((n) event).f149033b, null, 5);
                                        default:
                                            Intrinsics.checkNotNullParameter(update, "$this$update");
                                            return h.a(update, null, null, ((n) event).f149033b, 3);
                                    }
                                }
                            });
                        }
                    } else if (str5.equals("PHONE_ID")) {
                        final int i43 = 2;
                        gVar2.H2(yVar2, new Function1() { // from class: h33.f
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                h update = (h) obj7;
                                switch (i43) {
                                    case 0:
                                        Intrinsics.checkNotNullParameter(update, "$this$update");
                                        return h.a(update, ((n) event).f149033b, null, null, 6);
                                    case 1:
                                        Intrinsics.checkNotNullParameter(update, "$this$update");
                                        return h.a(update, null, ((n) event).f149033b, null, 5);
                                    default:
                                        Intrinsics.checkNotNullParameter(update, "$this$update");
                                        return h.a(update, null, null, ((n) event).f149033b, 3);
                                }
                            }
                        });
                    }
                } else if (event instanceof h33.m) {
                    j2 j2Var = (j2) yVar2.f22677a;
                    j2 j2Var2 = (j2) yVar2.f22677a;
                    gVar2.C2(new h33.i(new CardDeliveryRecipient(((h33.h) j2Var.getValue()).f149024a, ((h33.h) j2Var2.getValue()).f149025b, ((h33.h) j2Var2.getValue()).f149026c)));
                } else {
                    if (!(event instanceof h33.l)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gVar2.B2();
                }
                return Unit.f186387a;
            case 16:
                Object obj7 = this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h3j.g gVar3 = (h3j.g) ((BankBeneficiaryDetailsScreen) obj3).U.getValue();
                String listId = ((koi.j) obj7).getF55069b();
                Object z = ((qv0.p) obj7).getF55076n();
                com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.b bVar2 = (com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.b) gVar3;
                cli.y yVar3 = bVar2.f99672t;
                com.revolut.kompot.navigable.vc.modal.a aVar20 = bVar2.u;
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (z instanceof a3) {
                    a3 transaction = (a3) z;
                    Intrinsics.checkNotNullParameter(transaction, "transaction");
                    bVar2.C1(u0.b(new FeatureCommand(new TransactionsFeatureConfig.Details(ofm.q.P(transaction), null, null, null, 126))));
                } else if (!(z instanceof iy9.b)) {
                    switch (listId.hashCode()) {
                        case -1668528987:
                            if (listId.equals("ITEM_ID_CHANGE_BACKGROUND")) {
                                oki.h.v2(aVar20, BankBeneficiaryDetailsScreenContract$ModalStep.ChangeBackgroundDialog.f99662a, ModalDestination.Style.POPUP.f98311a);
                            }
                            break;
                        case -194451883:
                            if (listId.equals("ITEM_ID_PDA")) {
                                bVar2.l2(new h3j.q(bVar2, C, i33), new yi5.b(i21));
                            }
                            break;
                        case 652606243:
                            if (listId.equals("ITEM_ID_DELETE")) {
                                n61.o oVar = ((h3j.e) ((j2) yVar3.f22677a).getValue()).f;
                                if (oVar != null && oVar.f212697b) {
                                    oki.h.v2(aVar20, BankBeneficiaryDetailsScreenContract$ModalStep.PdaDialog.f99666a, bottom_dialog);
                                } else {
                                    oki.h.v2(aVar20, new BankBeneficiaryDetailsScreenContract$ModalStep.DeleteConfirmationDialog(n61.j.c(bVar2.I2())), bottom_dialog);
                                }
                            }
                            break;
                        case 1053543084:
                            if (listId.equals("ITEM_ID_REPORT")) {
                                bVar2.C1(u0.b(new FeatureCommand(SupportFeatureConfig.f89363a)));
                            }
                            break;
                        case 1418501635:
                            if (listId.equals("ITEM_ID_TRANSACTIONS_SEE_ALL")) {
                                i7.c cVar3 = i7.Companion;
                                i7[] i7VarArr = {new u7(bVar2.I2().f132329a)};
                                cVar3.getClass();
                                bVar2.C1(new TransactionListDestination(new TransactionListDestination.InputData((Clause) null, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByTransactionsFilter(i7.c.b(i7VarArr), null, null, 6), (String) null, (AccountId) null, (rhf.h) null, (rhf.g) null, (TransactionDestination) TransactionDestination.Details.f91984a, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) null, false, 65007)));
                            }
                            break;
                    }
                } else {
                    RecipientPaymentsSettings.Setting setting = ((h3j.e) ((j2) yVar3.f22677a).getValue()).e;
                    if (setting == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    bVar2.l2(new h3j.o(bVar2, RecipientPaymentsSettings.Setting.a(setting, new RecipientPaymentsSettings.Setting.Value.Binary(!setting.b())), null), new yi5.b(i21));
                }
                return Unit.f186387a;
            case 17:
                ArrayList arrayList2 = (ArrayList) obj3;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h4d.a aVar22 = ((h4d.h) this.v).f149338a;
                i4d.a aVarC = aVar22.c();
                if (aVarC != null) {
                    aVar22.d(arrayList2.size());
                    aVar22.e(aVarC);
                }
                int i59 = aVarC != null ? aVarC.d + 1 : -1;
                Iterator it9 = arrayList2.iterator();
                while (it9.hasNext()) {
                    aVar22.e(n14.e.J((z3d.c) it9.next(), i59));
                    i59++;
                }
                return Unit.f186387a;
            case 18:
                Data data3 = (Data) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((h5b.m) obj3).d3(new qna.p(data3, i22));
                return Unit.f186387a;
            case 19:
                List list3 = (List) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h5g.e eVar = (h5g.e) obj3;
                eVar.H2(eVar.f149558p, new fvk.q(list3, i5));
                return Unit.f186387a;
            case 20:
                List list4 = (List) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return ((p0) obj3).e.a(list4);
            case 21:
                n6 largeActionButtonModel = (n6) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h6j.f fVar2 = (h6j.f) ((h6j.c) ((CommodityHoldingsAvgPriceController) obj3).S.getValue());
                fVar2.getClass();
                Intrinsics.checkNotNullParameter(largeActionButtonModel, "largeActionButtonModel");
                fVar2.B2();
                return Unit.f186387a;
            case 22:
                um0 um0Var = (um0) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h7k.i iVar = (h7k.i) obj3;
                Intrinsics.h(um0Var);
                Object obj8 = um0Var.d;
                AcceptPaymentLinkAction$DialogPayload acceptPaymentLinkAction$DialogPayload = obj8 instanceof AcceptPaymentLinkAction$DialogPayload ? (AcceptPaymentLinkAction$DialogPayload) obj8 : null;
                if (acceptPaymentLinkAction$DialogPayload != null) {
                    TransferLinkDetails.Active active = acceptPaymentLinkAction$DialogPayload.f102179a;
                    if (active == null) {
                        active = null;
                    }
                    if (active != null) {
                        j60.a.v(iVar.f149915l, false, null, 3);
                        String str6 = um0Var.f166695a;
                        if (Intrinsics.f(str6, "PL_CANCEL_CONFIRMATION_ID")) {
                            iVar.T2(new h7k.f(iVar, active, null), new yi5.b(i22));
                        } else if (Intrinsics.f(str6, "PL_DECLINE_CONFIRMATION_ID")) {
                            iVar.T2(new h7k.h(iVar, active, null), new yi5.b(i22));
                        }
                    }
                }
                return Unit.f186387a;
            case 23:
                h83.b event2 = (h83.b) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h83.e eVar2 = (h83.e) ((PhysicalCardReplacementDialogScreen) obj3).S.getValue();
                eVar2.getClass();
                Intrinsics.checkNotNullParameter(event2, "event");
                if (!Intrinsics.f(event2, h83.b.f149940a)) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar2.C2(new h83.a(eVar2.o.f65486a));
                return Unit.f186387a;
            case 24:
                t5 t5Var = (t5) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.apm.multibanco.impl.via_verde.ui.details.b) ((h92.f) ((EnrollmentDetailsScreen) obj3).S.getValue())).I2(t5Var.e);
                return Unit.f186387a;
            case 25:
                Data data4 = (Data) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.apm.multibanco.impl.via_verde.ui.details.b bVar3 = (com.revolut.feature.apm.multibanco.impl.via_verde.ui.details.b) obj3;
                bVar3.H2(bVar3.f62651q, new h1k.k(data4, 14));
                return Unit.f186387a;
            case 26:
                String str7 = (String) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Object obj9 = ((h9f.d) obj3).f150243c.get();
                Intrinsics.checkNotNullExpressionValue(obj9, "get(...)");
                g9f.y yVar4 = (g9f.y) j6.a.k(g9f.y.class, (ue0.c) obj9, h9f.d.a(str7));
                if (yVar4 != null) {
                    return ifk.b.u(yVar4);
                }
                return null;
            case 27:
                Data data5 = (Data) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                hae.l lVar = (hae.l) obj3;
                lVar.H2(lVar.f150501t, new h1k.k(data5, 16));
                return Unit.f186387a;
            case 28:
                Data data6 = (Data) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.e eVar3 = (com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.screen.e) obj3;
                Throwable error = data6.getError();
                if (error != null) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                }
                eVar3.H2(eVar3.f67685r, new h1k.k(data6, 17));
                eVar3.U1(new hb4.k(i33));
                return Unit.f186387a;
            default:
                Data data7 = (Data) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donationbreakdown.a aVar35 = (com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donationbreakdown.a) obj3;
                aVar35.H2(aVar35.f72008q, new h1k.k(data7, i5));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f146991w = obj2;
    }
}
