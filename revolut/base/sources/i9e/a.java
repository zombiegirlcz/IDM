package i9e;

import bgd.e;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.earn.assets.shared.impl.ui.root.EarnAssetsRootScreenContract$Step;
import com.revolut.feature.extension_auth.api.model.ExtensionAuthRequestData;
import com.revolut.feature.retail.restaurants.impl.domain.model.TimeSlot;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.ReservationCreationScreenContract$SlotSelection;
import com.revolut.feature.shared_separate_favourites.converter.ui.flow.add_asset.SharedAddAssetFlowContract$State;
import com.revolut.feature.shared_separate_favourites.converter.ui.flow.add_asset.SharedAddAssetFlowContract$Step;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInSelectedAsset;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionSortOption;
import com.revolut.feature.wealth.api.navigation.models.DepositInfo;
import com.revolut.feature.wealth.impl.ui.flows.add_money.composite.CompositeAddMoneyFlowContract$State;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.InstrumentsCollectionController;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.feature.wealth.private_equity.api.WealthPrivateEquityApi$Toggles$PreTradeStateRevamp;
import com.revolut.feature_travel_hotels_models.campaign.TravelHotelsCampaign;
import com.revolut.feature_travel_hotels_models.dropoff.NavigableTravelHotelsDropoff;
import com.revolut.feature_travel_hotels_models.dropoff.TravelHotelsDropoff;
import com.revolut.feature_travel_hotels_models.dropoff.TravelHotelsDropoffSearchParameters;
import com.revolut.feature_travel_hotels_models.location.HotelsLocation;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.otp.a;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.a;
import efm.d0;
import i9g.h0;
import igd.b;
import ip0.gu;
import ip0.s7;
import ip0.yl;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ms0.h4;
import ms0.j4;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.joda.time.DateTime;
import vb3.l;
import vkm.j2;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f159646b;

    public /* synthetic */ a(iaf.r rVar, TransferInSelectedAsset transferInSelectedAsset) {
        this.f159645a = 6;
        this.f159646b = transferInSelectedAsset;
    }

    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        d0 d0VarM;
        Object obj3;
        Object propertyDetails;
        xzg.d0 d0Var;
        int i = this.f159645a;
        int i2 = 15;
        int i3 = 12;
        int i5 = 2;
        int i6 = 1;
        Continuation continuation = null;
        Object obj4 = this.f159646b;
        switch (i) {
            case 0:
                c cVar = (c) obj4;
                List pairs = (List) obj2;
                Intrinsics.checkNotNullParameter(pairs, "pairs");
                List list = pairs;
                return !list.isEmpty() ? m70.a.g(cVar.f159667a.b(list, false), null, new i83.m(4), 1).firstOrError() : te0.w.j(f0.f322471a);
            case 1:
                i9g.c cVar2 = (i9g.c) obj4;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                zfi.c cVar3 = (zfi.c) pair.f186385a;
                o9g.a aVar = (o9g.a) pair.f186386b;
                cVar2.getClass();
                String str = aVar.e;
                if (str != null) {
                    h0 h0Var = cVar2.f159782b;
                    ffi.e eVar = aVar.f223270a;
                    HotelsLocation hotelsLocation = eVar instanceof HotelsLocation ? (HotelsLocation) eVar : null;
                    d0 d0VarFirstOrError = m70.a.g(h0Var.i(hotelsLocation != null ? hotelsLocation.f97954b : null), null, null, 3).firstOrError();
                    i52.j jVar = new i52.j(16, new ho6.n(str, 19));
                    d0VarFirstOrError.getClass();
                    d0VarM = new pfm.z(new ufm.i(d0VarFirstOrError, jVar, 1), 1, new h35.c(14), continuation);
                } else {
                    od0.i.Companion.getClass();
                    d0VarM = d0.m(od0.i.f224256b);
                    Intrinsics.checkNotNullExpressionValue(d0VarM, "just(...)");
                }
                ufm.i iVar = new ufm.i(d0VarM, new i52.j(i2, new hsa.l(cVar2, 16, aVar, cVar3)), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
            case 2:
                i9g.o oVar = (i9g.o) obj4;
                List list2 = (List) obj2;
                Intrinsics.checkNotNullParameter(list2, "list");
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : list2) {
                    TravelHotelsCampaign travelHotelsCampaign = (TravelHotelsCampaign) obj5;
                    DateTime dateTimeG = ((l80.f) oVar.f159825b).g();
                    if (dateTimeG.isAfter(travelHotelsCampaign.f97894c) && dateTimeG.isBefore(travelHotelsCampaign.d)) {
                        arrayList.add(obj5);
                    }
                }
                return arrayList;
            case 3:
                hha.d pricingPlan = (hha.d) obj2;
                Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
                return nim.a.w(((i9g.p) obj4).f159829a.M.f(Unit.f186387a, false), new clk.a(pricingPlan, 16));
            case 4:
                i9g.t tVar = (i9g.t) obj4;
                List<TravelHotelsDropoff> dropOffs = (List) obj2;
                Intrinsics.checkNotNullParameter(dropOffs, "dropOffs");
                ArrayList arrayList2 = new ArrayList();
                for (TravelHotelsDropoff travelHotelsDropoff : dropOffs) {
                    tVar.getClass();
                    bfi.a aVar2 = travelHotelsDropoff.f97915b;
                    TravelHotelsDropoffSearchParameters travelHotelsDropoffSearchParameters = travelHotelsDropoff.f97919j;
                    String str2 = travelHotelsDropoff.f97918h;
                    int i21 = i9g.s.f159837a[aVar2.ordinal()];
                    if (i21 == i6 || i21 == i5) {
                        obj3 = null;
                    } else if (i21 == 3) {
                        if (str2 != null) {
                            propertyDetails = new NavigableTravelHotelsDropoff.PropertyDetails(travelHotelsDropoff.f97914a, travelHotelsDropoff.f97915b, travelHotelsDropoff.f97916c, travelHotelsDropoff.d, travelHotelsDropoff.e, str2, travelHotelsDropoffSearchParameters.f97926c, travelHotelsDropoffSearchParameters.d, hx7.a.E(travelHotelsDropoffSearchParameters.e));
                            obj3 = propertyDetails;
                        }
                        obj3 = null;
                    } else if (i21 == 4) {
                        if (str2 != null) {
                            propertyDetails = new NavigableTravelHotelsDropoff.Rooms(travelHotelsDropoff.f97914a, travelHotelsDropoff.f97915b, travelHotelsDropoff.f97916c, travelHotelsDropoff.d, travelHotelsDropoff.e, str2, travelHotelsDropoffSearchParameters.f97926c, travelHotelsDropoffSearchParameters.d, hx7.a.E(travelHotelsDropoffSearchParameters.e));
                            obj3 = propertyDetails;
                        }
                        obj3 = null;
                    } else {
                        if (i21 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (str2 != null) {
                            String str3 = travelHotelsDropoff.f97914a;
                            bfi.a aVar3 = travelHotelsDropoff.f97915b;
                            String str4 = travelHotelsDropoff.f97916c;
                            String str5 = travelHotelsDropoff.d;
                            String str6 = travelHotelsDropoff.e;
                            LocalDate localDate = travelHotelsDropoffSearchParameters.f97926c;
                            LocalDate localDate2 = travelHotelsDropoffSearchParameters.d;
                            List listE = hx7.a.E(travelHotelsDropoffSearchParameters.e);
                            List list3 = travelHotelsDropoff.i;
                            if (list3 == null) {
                                list3 = f0.f322471a;
                            }
                            propertyDetails = new NavigableTravelHotelsDropoff.Checkout(str3, aVar3, str4, str5, str6, str2, localDate, localDate2, listE, list3);
                            obj3 = propertyDetails;
                        }
                        obj3 = null;
                    }
                    if (obj3 != null) {
                        arrayList2.add(obj3);
                    }
                    i6 = 1;
                    i5 = 2;
                }
                return arrayList2;
            case 5:
                Map it8 = (Map) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                int i22 = i9h.t.f159874b[((i9h.u) obj4).ordinal()];
                if (i22 == 1) {
                    d0Var = xzg.d0.MOST_TRADED;
                } else if (i22 == 2) {
                    d0Var = xzg.d0.MOST_BOUGHT;
                } else {
                    if (i22 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    d0Var = xzg.d0.MOST_SOLD;
                }
                return (List) it8.get(d0Var);
            case 6:
                iaf.j update = (iaf.j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                LinkedHashMap linkedHashMapZ = r0.z(update.f160003a);
                linkedHashMapZ.remove(((TransferInSelectedAsset) obj4).f91510a.f91506a);
                return iaf.j.a(update, linkedHashMapZ, !linkedHashMapZ.isEmpty(), 2);
            case 7:
                com.revolut.feature.wealth.impl.ui.flows.add_money.composite.a aVar4 = (com.revolut.feature.wealth.impl.ui.flows.add_money.composite.a) obj4;
                lah.c output = (lah.c) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                DepositInfo depositInfo = output.f193397a;
                if ((depositInfo instanceof DepositInfo.OneOffDeposit) || (depositInfo instanceof DepositInfo.RecurringDeposit)) {
                    UUID uuid = ((CompositeAddMoneyFlowContract$State) ((j2) aVar4.f95550t.f22677a).getValue()).f95545a;
                    TransferSubjectId transferSubjectIdI2 = aVar4.o.getF95540a();
                    afa.u request = new afa.u(26, aVar4, transferSubjectIdI2, depositInfo, uuid, (Continuation) null);
                    String portfolioId = transferSubjectIdI2.getF95657a();
                    iah.h successDialogConfigurationFactory = new iah.h(depositInfo, aVar4, transferSubjectIdI2, null);
                    Intrinsics.checkNotNullParameter(request, "request");
                    Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                    Intrinsics.checkNotNullParameter(successDialogConfigurationFactory, "successDialogConfigurationFactory");
                    aVar4.l2(new fc0.e(successDialogConfigurationFactory, aVar4, request, portfolioId, (Continuation) null, 9), new yi5.b(26));
                } else {
                    if (depositInfo != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar4.C2(iah.d.f160026a);
                }
                return Unit.f186387a;
            case 8:
                com.revolut.feature_retail_user_declarations.citizenship.submit_citizenship.a aVar5 = (com.revolut.feature_retail_user_declarations.citizenship.submit_citizenship.a) obj4;
                com.revolut.feature_retail_user_declarations.citizenship.collect_citizenship.a flowResult = (com.revolut.feature_retail_user_declarations.citizenship.collect_citizenship.a) obj2;
                Intrinsics.checkNotNullParameter(flowResult, "flowResult");
                aVar5.l2(new iai.e(flowResult, aVar5, null), new yi5.b(26));
                return Unit.f186387a;
            case 9:
                psg.a it9 = (psg.a) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return hj8.a.a(((ibe.c) obj4).f, it9.f239485b, w4l.h.f294642c);
            case 10:
                com.revolut.feature_retail_user_declarations.employer.flow.a aVar6 = (com.revolut.feature_retail_user_declarations.employer.flow.a) obj4;
                com.revolut.feature_retail_user_declarations.employer.screen.a result = (com.revolut.feature_retail_user_declarations.employer.screen.a) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                aVar6.l2(new i44.a(aVar6, result, continuation, i3), new yi5.b(26));
                return Unit.f186387a;
            case 11:
                com.revolut.feature.cash_topup.impl.ui.flow.select_store.a aVar7 = (com.revolut.feature.cash_topup.impl.ui.flow.select_store.a) obj4;
                vb3.l result2 = (vb3.l) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof vb3.j) {
                    nd.o oVar2 = aVar7.f65675q;
                    String str7 = ((vb3.j) result2).f287385a;
                    oVar2.getClass();
                    aVar7.C1(new BridgeDestination(nd.o.h(str7)));
                } else if (result2 instanceof vb3.k) {
                    aVar7.C2(new ic3.d(((vb3.k) result2).f287386a));
                } else if (result2 instanceof vb3.i) {
                    IllegalStateException illegalStateException = new IllegalStateException("received unexpected result NavigationButtonClicked");
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var2);
                } else if (result2 instanceof vb3.h) {
                    IllegalStateException illegalStateException2 = new IllegalStateException(p.a.p("received unexpected result DepositCashClicked(locationId=", ((vb3.h) result2).f287383a, ")"));
                    zhm.h0 h0Var3 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var3);
                } else {
                    if (!(result2 instanceof l.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalStateException illegalStateException3 = new IllegalStateException("received unexpected result ShowBarcode");
                    zhm.h0 h0Var4 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException3, h0Var4);
                }
                return Unit.f186387a;
            case 12:
                ic4.a aVar8 = (ic4.a) obj4;
                gc4.h outputData = (gc4.h) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof gc4.g) {
                    aVar8.l2(new i44.a(aVar8, outputData, continuation, 13), new yi5.b(26));
                } else {
                    int i32 = 26;
                    if (!(outputData instanceof gc4.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar8.l2(new iaf.d(aVar8, continuation, i5), new yi5.b(i32));
                }
                return Unit.f186387a;
            case 13:
                ica.n nVar = (ica.n) obj4;
                gpf.a output2 = (gpf.a) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                nVar.H2(nVar.f160233s, new as1.q(output2, i6));
                return Unit.f186387a;
            case 14:
                InstrumentsCollectionController.Companion aVar9 = InstrumentsCollectionController.INSTANCE;
                Intrinsics.checkNotNullParameter((List) obj2, "it");
                return Boolean.valueOf(((InstrumentsCollectionController) obj4).d3().f174540c.getScrollState() == 0);
            case 15:
                ich.l update2 = (ich.l) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return ich.l.a(update2, null, null, null, false, null, null, (InstrumentsCollectionSortOption) obj4, null, null, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG);
            case 16:
                com.revolut.feature_retail_user_declarations.risk_assessment.flow.a aVar10 = (com.revolut.feature_retail_user_declarations.risk_assessment.flow.a) obj4;
                jci.f result3 = (jci.f) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                aVar10.l2(new i44.a(aVar10, result3, continuation, i2), new yi5.b(26));
                return Unit.f186387a;
            case 17:
                return ie6.a.a((ie6.a) obj2, (ExtensionAuthRequestData) obj4, null, false, false, 2);
            case 18:
                ieb.g update3 = (ieb.g) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return ieb.g.a(update3, null, null, null, null, null, null, null, (ReservationCreationScreenContract$SlotSelection) obj4, CertificateBody.profileType);
            case 19:
                TimeSlot slot = (TimeSlot) obj2;
                Intrinsics.checkNotNullParameter(slot, "slot");
                return new ReservationCreationScreenContract$SlotSelection(slot, ((xdb.x) obj4).f304414b);
            case 20:
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.b bVar = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.b) obj4;
                afi.a draft = (afi.a) obj2;
                Intrinsics.checkNotNullParameter(draft, "draft");
                efm.r rVarJust = efm.r.just(zi0.c.P(draft, false, null, 3));
                Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
                efm.r rVarHide = bVar.u.f303883a.hide();
                Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
                efm.r rVarSwitchMap = rVarHide.switchMap(new icc.c(new ieg.s(bVar, draft, i6), 21));
                Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                return te0.w.l(rVarJust, rVarSwitchMap);
            case 21:
                com.revolut.feature.crypto.earn.assets.shared.impl.ui.root.b.I2((com.revolut.feature.crypto.earn.assets.shared.impl.ui.root.b) obj4, EarnAssetsRootScreenContract$Step.Loading.f70806a);
                return Unit.f186387a;
            case 22:
                Data benefitsLayout = new Data(null, ((dga.b) obj4).f114611a, false, 5, null);
                ((iga.e) obj2).getClass();
                Intrinsics.checkNotNullParameter(benefitsLayout, "benefitsLayout");
                return new iga.e(benefitsLayout);
            case 23:
                igd.e eVar2 = (igd.e) obj4;
                bgd.e outputData2 = (bgd.e) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                if (outputData2 instanceof e.a) {
                    eVar2.G2(b.a.f161159a);
                    eVar2.I2();
                } else {
                    if (!(outputData2 instanceof bgd.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SharedAddAssetFlowContract$State sharedAddAssetFlowContract$State = (SharedAddAssetFlowContract$State) eVar2.A2().f98429a;
                    FavouritesAssetTypeKey favouritesAssetTypeKey = ((bgd.d) outputData2).f15176a;
                    sharedAddAssetFlowContract$State.getClass();
                    eVar2.L2(new SharedAddAssetFlowContract$State(favouritesAssetTypeKey));
                    dki.g.F2(eVar2, SharedAddAssetFlowContract$Step.ASSET_CHOOSER, false, null, 12);
                }
                return Unit.f186387a;
            case 24:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = zhm.u.b();
                if (((jte.d) ((igh.z) obj4).d).c(WealthPrivateEquityApi$Toggles$PreTradeStateRevamp.f95727c)) {
                    eVarB.add(new yl("FUND_DETAILS_PERFORMANCE_PRICE_HEADER_LOADING", 0, 30));
                }
                IntRange intRange = new IntRange(0, 2, 1);
                ArrayList arrayList3 = new ArrayList(zhm.w.t(intRange, 10));
                vim.f it10 = intRange.iterator();
                while (it10.f289625c) {
                    arrayList3.add(new s7(a0.d.n("FUND_DETAILS_PERFORMANCE_ITEM_LOADING", it10.nextInt()), 0, 0, 0, 0, false, null, 94));
                }
                eVarB.addAll(arrayList3);
                h4 h4Var = h4.SHIMMER;
                int i33 = R$attr.uikit_dp16;
                eVarB.add(new SmallActionButtonDelegate.Model("FUND_DETAILS_PERFORMANCE_EXPLORE_INSIGHTS_LOADING", h4Var, null, null, null, null, j4.f208300a, null, null, i33, i33, i33, i33, 1880));
                return yp0.b.h(zhm.u.a(eVarB), new gu("FUND_DETAILS_PERFORMANCE_HEADER_LOADING", 0, 0, 30), null, 0, 126);
            case 25:
                com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.otp.b bVar2 = (com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.otp.b) obj4;
                com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.a result4 = (com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.a) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                if (Intrinsics.f(result4, a.C0619a.f101296a)) {
                    bVar2.C2(new a.C0613a(false));
                } else if (Intrinsics.f(result4, a.b.f101297a)) {
                    bVar2.C2(a.b.f100780a);
                } else {
                    if (!(result4 instanceof blj.i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    blj.i iVar2 = (blj.i) result4;
                    bVar2.C2(new igj.c(iVar2.f16711a, iVar2.f16712b));
                }
                return Unit.f186387a;
            case 26:
                com.revolut.feature.crypto.locked.balance.impl.ui.balance_breakdown.a aVar11 = (com.revolut.feature.crypto.locked.balance.impl.ui.balance_breakdown.a) obj4;
                og5.d output3 = (og5.d) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                if (output3 instanceof og5.b) {
                    aVar11.C2(new fh5.b(((og5.b) output3).f225033a));
                } else if (!(output3 instanceof og5.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 27:
                com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.a aVar12 = (com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.a) obj4;
                lh9.m outputData3 = (lh9.m) obj2;
                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                if (outputData3 instanceof lh9.l) {
                    aVar12.C2(ih9.e.f161312a);
                } else {
                    if (!Intrinsics.f(outputData3, lh9.k.f195184a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar12.C2(ih9.d.f161311a);
                }
                return Unit.f186387a;
            case 28:
                ihd.v vVar = (ihd.v) obj4;
                gfd.d outputData4 = (gfd.d) obj2;
                Intrinsics.checkNotNullParameter(outputData4, "outputData");
                if (!outputData4.f143391a.isEmpty()) {
                    vVar.x2(new i25.e(vVar, outputData4, 24));
                }
                return Unit.f186387a;
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return ((ihg.b) obj4).f161405b.b();
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f159645a = i;
        this.f159646b = obj2;
    }
}
