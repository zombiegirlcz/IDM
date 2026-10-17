package yrb;

import android.view.ViewGroup;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputSliderDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.internal.views.linearlayout.UIKitLinearLayout;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ModalViewContainerBehavior;
import com.revolut.data.model.Data;
import com.revolut.data.network.models.recurringpayment.WalletAutomationRequestDto;
import com.revolut.data.network.models.recurringpayment.mapper.WalletAutomationDtoMapper;
import com.revolut.data.network.services.RecurringPaymentService;
import com.revolut.feature.crypto_investments.api.model.transaction_filter.CryptoTransactionFilter;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.flow.PeerToPeerChatFlowContract$Step;
import com.revolut.feature.rev_points.api.navigation.RevPointsOptInNextDestination;
import com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.flow.RevPointsPostOnboardingPersonalisationFlowContract$Step;
import com.revolut.feature.shared.recurring_payments.models.WalletAutomation;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.AddEditAssetContract$InputData$Mode;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.common.SmartEstimationAccess;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.TotalWealthFlowContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.TotalWealthFlowContract$Step;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet.SmartEstimationBottomSheetContract$Variant;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.transfer.core.models.SourceAccount;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.api.custom_assets.models.CustomAsset;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.ChallengeDetailsScreenContract$ModalStep;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.models.StockFinancialsStatementPeriodState;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.o0;
import mx0.ba;
import mx0.ca;
import mx0.da;
import mx0.la;
import nel.s0;
import nel.v0;
import tof.i7;
import tof.ib;
import tof.s9;
import vkm.j2;
import yt0.i0;
import zhm.f0;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f316216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f316217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f316218c;

    public /* synthetic */ i(Object obj2, Object obj3, int i) {
        this.f316216a = i;
        this.f316217b = obj2;
        this.f316218c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v0, types: [amd.b, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v3, types: [com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet.SmartEstimationBottomSheetContract$Variant] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        nel.n nVar;
        yld.g gVar;
        Integer numValueOf;
        d0<o9l.r> d0VarPostWalletAutomationExceeds;
        Data data;
        ArrayList arrayListC;
        int i = this.f316216a;
        int i2 = 26;
        int i3 = 10;
        ?? deferred = 0;
        TransferMoneyPocket transferMoneyPocket = null;
        num = null;
        Integer num = null;
        deferred = 0;
        deferred = 0;
        deferred = 0;
        Object obj3 = this.f316218c;
        Object obj4 = this.f316217b;
        switch (i) {
            case 0:
                x update = (x) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                bfl.g gVar2 = bfl.g.BUY;
                return x.a(update, null, gVar2, ((asb.d) obj3).g(gVar2), null, null, null, false, null, null, (s0) ((v0) obj4), null, null, null, j0b.e.EXPANDED, null, 24057);
            case 1:
                s sVar = (s) obj3;
                x update2 = (x) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return x.a(update2, null, null, (qrb.b) obj4, ((x) ((j2) sVar.z.f22677a).getValue()).e, ((x) ((j2) sVar.z.f22677a).getValue()).d, null, false, null, null, null, null, null, null, null, null, 32739);
            case 2:
                b0 b0Var = (b0) obj4;
                x xVar = (x) obj3;
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                s0 s0Var = xVar.f316256j;
                if (s0Var == null || (nVar = s0Var.e) == null) {
                    return f0.f322471a;
                }
                nel.z zVar = nVar.f214597c;
                Map map = b0Var.f316211b;
                qrb.q.Companion.getClass();
                qrb.q qVarA = qrb.p.a(nVar);
                if (qVarA == null || !map.containsKey(qVarA)) {
                    throw new IllegalStateException("No " + o0.f186429a.b(dsb.d.class) + " found for instrument type " + zVar);
                }
                dsb.d dVar = (dsb.d) r0.h(qVarA, map);
                Map map2 = b0Var.f316212c;
                qrb.q qVarA2 = qrb.p.a(nVar);
                if (qVarA2 == null || !map2.containsKey(qVarA2)) {
                    throw new IllegalStateException("No " + o0.f186429a.b(esb.a.class) + " found for instrument type " + zVar);
                }
                esb.a aVar = (esb.a) r0.h(qVarA2, map2);
                TextLocalisedClause textLocalisedClauseA = aVar.a(xVar.f316253c);
                bw0.h.Companion.getClass();
                CenteredAmountDelegate.Model model = new CenteredAmountDelegate.Model("CENTERED_AMOUNT_LIST_ID", textLocalisedClauseA, bw0.b.a(), null, aVar.b(null, null), null, null, false, false, null, null, YearClass.CLASS_2016);
                InputSliderDelegate.Model modelC = b0.c(false, xVar.f, null);
                TextDelegate.Model modelA = ((dsb.e) dVar).a(null, null);
                bfl.g gVar3 = xVar.f316252b;
                Data data2 = xVar.f316258m;
                BigDecimal ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                return zhm.v.k(model, modelC, modelA, b0.b(false, gVar3, ZERO, data2, null));
            case 3:
                com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f fVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f) obj4;
                AddEditAssetContract$InputData$Mode addEditAssetContract$InputData$Mode = (AddEditAssetContract$InputData$Mode) obj3;
                grd.d outputData = (grd.d) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                nqj.c cVar = fVar.f88003t;
                yki.i iVar = fVar.u;
                cVar.c(true);
                if (addEditAssetContract$InputData$Mode instanceof AddEditAssetContract$InputData$Mode.Create) {
                    if (oki.h.E2(iVar, new ypd.i(24))) {
                        iVar.e(true);
                    } else if (fVar.o instanceof TotalWealthFlowContract$InputData.AddOtherAsset) {
                        Intrinsics.checkNotNullParameter(iVar, "<this>");
                        iVar.a();
                        oki.h.t2(fVar, iVar, new TotalWealthFlowContract$Step.TotalWealth(yld.g.ASSET, amd.b.OTHER_ASSETS), false, null, false, 12);
                        fVar = fVar;
                    }
                    CustomAsset customAsset = outputData.f145992a;
                    int i5 = R$string.analytics_total_wealth_custom_assets_tooltip_asset_added;
                    ZonedDateTime zonedDateTime = customAsset.e;
                    fVar.J2(i5);
                } else {
                    if (!(addEditAssetContract$InputData$Mode instanceof AddEditAssetContract$InputData$Mode.Edit)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iVar.e(true);
                    CustomAsset customAsset2 = outputData.f145992a;
                    SmartEstimationAccess smartEstimationAccess = outputData.f145993b;
                    boolean z = !((AddEditAssetContract$InputData$Mode.Edit) addEditAssetContract$InputData$Mode).f87910b.k && outputData.f145994c;
                    boolean z3 = outputData.d;
                    int i6 = R$string.analytics_total_wealth_custom_assets_tooltip_asset_updated;
                    ZonedDateTime zonedDateTime2 = customAsset2.e;
                    if (zonedDateTime2 != null && smartEstimationAccess != null && z && z3) {
                        deferred = new SmartEstimationBottomSheetContract$Variant.Deferred(smartEstimationAccess.f87945a, smartEstimationAccess.f87947c, smartEstimationAccess.f87950j, zonedDateTime2);
                    }
                    if (deferred != 0) {
                        oki.h.w2(iVar, new TotalWealthFlowContract$Step.SmartEstimationBottomSheet(deferred, smartEstimationAccess != null && smartEstimationAccess.e), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    } else {
                        fVar.J2(i6);
                    }
                }
                return Unit.f186387a;
            case 4:
                com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f fVar2 = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f) obj4;
                TotalWealthFlowContract$Step.RemoveAssetConfirmationBottomSheet removeAssetConfirmationBottomSheet = (TotalWealthFlowContract$Step.RemoveAssetConfirmationBottomSheet) obj3;
                dii.g outputData2 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                if (outputData2 instanceof dii.f) {
                    fVar2.n2(new yg6.v(fVar2, removeAssetConfirmationBottomSheet.f87975a, deferred, 22), new whi.b(6));
                } else if (!(outputData2 instanceof dii.b) && !(outputData2 instanceof dii.c) && !(outputData2 instanceof dii.d) && !(outputData2 instanceof dii.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 5:
                com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f fVar3 = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f) obj4;
                yki.b bVar = (yki.b) obj3;
                etd.c outputData3 = (etd.c) obj2;
                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                if (Intrinsics.f(outputData3, etd.a.f129404a)) {
                    gVar = yld.g.ASSET;
                } else {
                    if (!Intrinsics.f(outputData3, etd.b.f129405a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gVar = yld.g.LIABILITY;
                }
                oki.h.t2(fVar3, bVar, new TotalWealthFlowContract$Step.TotalWealth(gVar, deferred), false, null, false, 12);
                return Unit.f186387a;
            case 6:
                com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f fVar4 = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f) obj4;
                TotalWealthFlowContract$Step totalWealthFlowContract$Step = (TotalWealthFlowContract$Step) obj3;
                yja.b outputData4 = (yja.b) obj2;
                Intrinsics.checkNotNullParameter(outputData4, "outputData");
                if (outputData4 != yja.b.NEXT_CLICK) {
                    return Unit.f186387a;
                }
                fVar4.A1(new com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.c(fVar4, totalWealthFlowContract$Step, null), new yi5.b(25));
                return Unit.f186387a;
            case 7:
                com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f fVar5 = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.f) obj4;
                nrd.b outputData5 = (nrd.b) obj2;
                Intrinsics.checkNotNullParameter(outputData5, "outputData");
                oki.h.t2(fVar5, fVar5.u, new TotalWealthFlowContract$Step.AddEditAsset(new AddEditAssetContract$InputData$Mode.Create((xi0.b) obj3, outputData5.f218611a)), true, null, false, 12);
                return Unit.f186387a;
            case 8:
                yrk.g gVar4 = (yrk.g) obj4;
                uqk.e eVar = (uqk.e) obj3;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                boolean zBooleanValue = ((Boolean) pair.f186386b).booleanValue();
                StockFinancialsStatementPeriodState stockFinancialsStatementPeriodState = (StockFinancialsStatementPeriodState) gVar4.a().get();
                Integer num2 = stockFinancialsStatementPeriodState.f103797a;
                if (num2 == null) {
                    te0.e eVarA = gVar4.a();
                    Iterator it9 = list.iterator();
                    if (it9.hasNext()) {
                        numValueOf = Integer.valueOf(((uqk.f) it9.next()).f282212c);
                        while (it9.hasNext()) {
                            Integer numValueOf2 = Integer.valueOf(((uqk.f) it9.next()).f282212c);
                            if (numValueOf.compareTo(numValueOf2) < 0) {
                                numValueOf = numValueOf2;
                            }
                        }
                    } else {
                        numValueOf = null;
                    }
                    eVarA.set(new StockFinancialsStatementPeriodState(numValueOf, ((StockFinancialsStatementPeriodState) eVarA.get()).f103798b));
                    num2 = numValueOf;
                }
                Integer num3 = stockFinancialsStatementPeriodState.f103798b;
                if (num3 == null) {
                    Intrinsics.h(eVar);
                    int i21 = yrk.f.f316329a[eVar.ordinal()];
                    if (i21 != 1) {
                        if (i21 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj5 : list) {
                            int i22 = ((uqk.f) obj5).f282212c;
                            if (num2 != null && i22 == num2.intValue()) {
                                arrayList.add(obj5);
                            }
                        }
                        Iterator it10 = arrayList.iterator();
                        if (it10.hasNext()) {
                            Integer num4 = ((uqk.f) it10.next()).d;
                            Integer numValueOf3 = Integer.valueOf(num4 != null ? num4.intValue() : 0);
                            while (true) {
                                num = numValueOf3;
                                while (it10.hasNext()) {
                                    Integer num5 = ((uqk.f) it10.next()).d;
                                    numValueOf3 = Integer.valueOf(num5 != null ? num5.intValue() : 0);
                                    if (num.compareTo(numValueOf3) < 0) {
                                    }
                                }
                            }
                        }
                        te0.e eVarA2 = gVar4.a();
                        eVarA2.set(new StockFinancialsStatementPeriodState(((StockFinancialsStatementPeriodState) eVarA2.get()).f103797a, num));
                    }
                    num3 = num;
                    break;
                }
                if (!zBooleanValue) {
                    return f0.f322471a;
                }
                List<uqk.f> list2 = list;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                for (uqk.f fVar6 : list2) {
                    int i32 = fVar6.f282212c;
                    Integer num6 = fVar6.d;
                    arrayList2.add(new esk.b(i32, num2 != null && i32 == num2.intValue() && Intrinsics.f(num6, num3), num6));
                }
                return arrayList2;
            case 9:
                yt0.j jVar = (yt0.j) obj4;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj3;
                Boolean bool = (Boolean) obj2;
                Intrinsics.h(bool);
                boolean zBooleanValue2 = bool.booleanValue();
                boolean z4 = !ref$BooleanRef.f186407a;
                da daVar = jVar.f316568b;
                boolean z6 = daVar instanceof ba;
                if (z6) {
                    jVar.a(zBooleanValue2, z4);
                }
                com.revolut.core.ui_kit.views.o oVar = jVar.f316567a;
                int i33 = -1;
                if (!(daVar instanceof ca) && !zBooleanValue2) {
                    i33 = -2;
                }
                ViewGroup.LayoutParams layoutParams = oVar.getFrame$ui_kit_components_release().getLayoutParams();
                if (layoutParams == null || layoutParams.height != i33) {
                    UIKitLinearLayout frame$ui_kit_components_release = oVar.getFrame$ui_kit_components_release();
                    Intrinsics.checkNotNullExpressionValue(frame$ui_kit_components_release, "<get-frame>(...)");
                    ViewGroup.LayoutParams layoutParams2 = frame$ui_kit_components_release.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams2.height = i33;
                    frame$ui_kit_components_release.setLayoutParams(layoutParams2);
                }
                oVar.getTopPaddingSpace$ui_kit_components_release().setOnLayoutExtraHeightProvider(((Boolean) jo0.g.k.getValue()).booleanValue() && z6 ? jVar.k : null);
                ref$BooleanRef.f186407a = false;
                return Unit.f186387a;
            case 10:
                Boolean bool2 = (Boolean) obj2;
                la laVar = ((ModalViewContainerBehavior) obj4).f58780a;
                Object obj6 = ((i0) obj3).f316565h;
                Intrinsics.h(bool2);
                kotlin.jvm.internal.s.x(laVar, obj6, bool2.booleanValue());
                return Unit.f186387a;
            case 11:
                com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.a aVar2 = (com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.a) obj4;
                ChallengeDetailsScreenContract$ModalStep challengeDetailsScreenContract$ModalStep = (ChallengeDetailsScreenContract$ModalStep) obj3;
                dii.g result = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (Intrinsics.f(result, dii.e.f115068a)) {
                    ChallengeDetailsScreenContract$ModalStep.StartChallengeBottomSheet startChallengeBottomSheet = (ChallengeDetailsScreenContract$ModalStep.StartChallengeBottomSheet) challengeDetailsScreenContract$ModalStep;
                    aVar2.l2(new y65.l(aVar2, startChallengeBottomSheet.f101574a, startChallengeBottomSheet.f101575b, null, 14), new yi5.b(i2));
                }
                return Unit.f186387a;
            case 12:
                CryptoTransactionFilter cryptoTransactionFilter = (CryptoTransactionFilter) obj3;
                yu5.g updateState = (yu5.g) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                List<CryptoTransactionFilter> list3 = ((yu5.g) ((yu5.n) obj4).t2()).f316886a;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                for (CryptoTransactionFilter cryptoTransactionFilterA : list3) {
                    if (Intrinsics.f(cryptoTransactionFilterA, cryptoTransactionFilter)) {
                        cryptoTransactionFilterA = cryptoTransactionFilterA.a();
                    }
                    arrayList3.add(cryptoTransactionFilterA);
                }
                return yu5.g.a(updateState, arrayList3);
            case 13:
                String[] strArr = (String[]) obj3;
                hbd.a params = (hbd.a) obj2;
                Intrinsics.checkNotNullParameter(params, "it");
                s71.a aVar3 = ((yua.q) obj4).f316963a;
                String[] receiverIds = (String[]) Arrays.copyOf(strArr, strArr.length);
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(receiverIds, "receiverIds");
                Intrinsics.checkNotNullParameter(params, "params");
                return nim.a.w(nim.a.w(((a31.x) aVar3).i.f(params, true), new a09.a(24)), new a0.c(receiverIds, i3));
            case 14:
                qua.d type = (qua.d) obj3;
                hbd.a params2 = (hbd.a) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                a31.x xVar2 = (a31.x) ((yua.q) obj4).f316963a;
                Intrinsics.checkNotNullParameter(params2, "params");
                Intrinsics.checkNotNullParameter(type, "type");
                return pd.b.r(xVar2.f1004j.e(type, w4l.i.f294643c), new a31.h(xVar2, params2, 3));
            case 15:
                WalletAutomation request = (WalletAutomation) obj3;
                hbd.a params3 = (hbd.a) obj2;
                Intrinsics.checkNotNullParameter(params3, "it");
                a31.x xVar3 = (a31.x) ((yua.q) obj4).f316963a;
                RecurringPaymentService recurringPaymentService = xVar3.f999a;
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(params3, "params");
                WalletAutomationRequestDto dto = WalletAutomationDtoMapper.INSTANCE.toDto(request);
                if (dto instanceof WalletAutomationRequestDto.DropsBelowDto) {
                    d0VarPostWalletAutomationExceeds = recurringPaymentService.postWalletAutomationDropsBelow((WalletAutomationRequestDto.DropsBelowDto) dto, new wj0.b("payments_automation"));
                } else {
                    if (!(dto instanceof WalletAutomationRequestDto.ExceedsDto)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    d0VarPostWalletAutomationExceeds = recurringPaymentService.postWalletAutomationExceeds((WalletAutomationRequestDto.ExceedsDto) dto, new wj0.b("payments_automation"));
                }
                return te0.w.i0(xVar3.d(d0VarPostWalletAutomationExceeds, params3, null));
            case 16:
                ibd.h hVar = (ibd.h) obj4;
                yua.q qVar = (yua.q) obj3;
                List recurringPayments = (List) obj2;
                Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
                ArrayList arrayList4 = new ArrayList();
                for (Object obj7 : recurringPayments) {
                    qua.p pVar = (qua.p) obj7;
                    if (pVar.getType() == hVar && qua.u.h(pVar, ((l80.f) qVar.f316968j).k())) {
                        arrayList4.add(obj7);
                    }
                }
                return arrayList4;
            case 17:
                yua.q qVar2 = (yua.q) obj4;
                Set set = (Set) obj3;
                List recurringPayments2 = (List) obj2;
                Intrinsics.checkNotNullParameter(recurringPayments2, "recurringPayments");
                if (recurringPayments2.isEmpty()) {
                    return zi0.c.j(r0.g());
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it11 = recurringPayments2.iterator();
                while (it11.hasNext()) {
                    Iterable iterable = ((qua.p) it11.next()).G;
                    if (iterable == null) {
                        iterable = h0.f322473a;
                    }
                    zhm.a0.x(iterable, arrayList5);
                }
                Set setI1 = zhm.d0.i1(arrayList5);
                com.revolut.domain.interactors.transactions.a aVar4 = qVar2.i;
                i7.c cVar2 = i7.Companion;
                s9 s9Var = new s9(setI1);
                Set set2 = set;
                ArrayList arrayList6 = new ArrayList(zhm.w.t(set2, 10));
                Iterator it12 = set2.iterator();
                while (it12.hasNext()) {
                    arrayList6.add(new ib((String) it12.next()));
                }
                ib[] ibVarArr = (ib[]) arrayList6.toArray(new ib[0]);
                i7[] i7VarArr = (i7[]) Arrays.copyOf(ibVarArr, ibVarArr.length);
                cVar2.getClass();
                efm.r map3 = com.revolut.domain.interactors.transactions.a.b(aVar4, i7.c.a(s9Var, i7.c.b(i7VarArr)), null, null, null, null, 30).x().map(new yta.c(29, new n0k.b(recurringPayments2, set)));
                Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
                return map3;
            case 18:
                qua.z zVar2 = (qua.z) obj4;
                String str = (String) obj3;
                List subscriptions = (List) obj2;
                Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
                if (zVar2 instanceof qua.x) {
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj8 : subscriptions) {
                        qua.p pVar2 = (qua.p) obj8;
                        String str2 = pVar2.L;
                        String str3 = ((qua.x) zVar2).f249341a;
                        if ((str2 == null ? false : Intrinsics.f(str2, str3)) || (Intrinsics.f(str3, str) && pVar2.L == null)) {
                            arrayList7.add(obj8);
                        }
                    }
                    return arrayList7;
                }
                if (!(zVar2 instanceof qua.y)) {
                    if (zVar2 instanceof qua.w) {
                        return subscriptions;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                ArrayList arrayList8 = new ArrayList();
                for (Object obj9 : subscriptions) {
                    qua.p pVar3 = (qua.p) obj9;
                    String str4 = pVar3.L;
                    if ((str4 == null ? false : Intrinsics.f(str4, str)) || pVar3.L == null) {
                        arrayList8.add(obj9);
                    }
                }
                return arrayList8;
            case 19:
                zvd.b bVar2 = (zvd.b) obj4;
                StakingProduct stakingProduct = (StakingProduct) obj3;
                n9l.a exchangeRate = (n9l.a) obj2;
                Intrinsics.checkNotNullParameter(exchangeRate, "exchangeRate");
                String str5 = bVar2.f325659a;
                dj0.d dVar2 = bVar2.f325661c;
                double d = exchangeRate.f213663c;
                xi0.b bVar3 = exchangeRate.f213662b;
                dj0.d dVarK = pyd.c.K(dVar2, d, bVar3);
                dj0.d dVar3 = bVar2.e;
                return new StakingPocket(str5, stakingProduct, dVar2, dVarK, dVar3, pyd.c.K(dVar3, exchangeRate.f213663c, bVar3));
            case 20:
                Data data3 = (Data) obj4;
                yv2.f fVar7 = (yv2.f) obj2;
                Intrinsics.h(data3);
                int iB = ((com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.e) obj3).f64427q.b();
                return yv2.f.a(fVar7, 0, data3, null, false, iB != 160 ? iB != 240 ? iB != 320 ? iB != 480 ? iB != 640 ? o5l.g.XHDPI : o5l.g.XXXHDPI : o5l.g.XXHDPI : o5l.g.XHDPI : o5l.g.HDPI : o5l.g.MDPI, true, false, null, Constants.TAG_KSN_FORMATS);
            case 21:
                com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.f fVar8 = (com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.f) obj4;
                yv2.f fVar9 = (yv2.f) obj3;
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new yv2.i((List) getDefaultLoadingItems.invoke(), null, fVar8.g(fVar9), fVar8.f(fVar9), null, false, false, 498);
            case 22:
                com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.edit_key_stats.a aVar5 = (com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.edit_key_stats.a) obj4;
                mtk.d dVar4 = (mtk.d) obj3;
                yvk.f update3 = (yvk.f) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                Data data4 = update3.f317217a;
                try {
                    Object content = data4.getContent();
                    if (content != null) {
                        List list4 = (List) content;
                        nd.p pVar4 = aVar5.f104031r;
                        trk.a aVar6 = aVar5.o.f104027a;
                        Set set3 = dVar4.f208907a;
                        TradingLegalEntityInformation tradingLegalEntityInformation = ((yvk.f) ((j2) aVar5.f104032s.f22677a).getValue()).f317218b;
                        arrayListC = pVar4.c(aVar6, list4, set3, tradingLegalEntityInformation != null ? tradingLegalEntityInformation.f105106a : null);
                    } else {
                        arrayListC = null;
                    }
                    data = new Data(arrayListC, data4.getError(), data4.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data4.getLoading());
                }
                return yvk.f.a(update3, data, null, 2);
            case 23:
                yxb.s sVar2 = (yxb.s) obj4;
                Integer num7 = (Integer) obj3;
                Boolean isEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
                if (!isEnabled.booleanValue()) {
                    return d0.m(Boolean.FALSE);
                }
                ufm.i iVar2 = new ufm.i(yxb.s.d(num7, false), new yxb.c(new yxb.a(sVar2, 20), i2), 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                return ue0.e.F(iVar2, Boolean.TRUE);
            case 24:
                NaviCommand spareChangeNavigation = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(spareChangeNavigation, "spareChangeNavigation");
                return yxb.s.E((yxb.s) obj4, spareChangeNavigation, RevPointsOptInNextDestination.Tab.f83531a, (String) obj3);
            case 25:
                List list5 = (List) obj3;
                NaviCommand pointsCommand = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(pointsCommand, "pointsCommand");
                Intrinsics.h(list5);
                ((yxb.s) obj4).f317631a.c(com.revolut.retail.core.navigation.a.c(pointsCommand, yxb.s.n(list5)));
                return Boolean.TRUE;
            case 26:
                com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.c cVar3 = (com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.c) obj4;
                yki.b bVar4 = (yki.b) obj3;
                v44.j outputData6 = (v44.j) obj2;
                Intrinsics.checkNotNullParameter(outputData6, "outputData");
                if (outputData6 instanceof v44.h) {
                    cVar3.l2(new y65.l(cVar3, outputData6, bVar4, null, 22), new yi5.b(i2));
                } else {
                    if (!(outputData6 instanceof v44.i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar4.e(false);
                }
                return Unit.f186387a;
            case 27:
                com.revolut.feature.payments.social.impl.presentation.p2p_kompot.flow.a aVar7 = (com.revolut.feature.payments.social.impl.presentation.p2p_kompot.flow.a) obj4;
                zz9.u output = (zz9.u) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                yki.a aVar8 = aVar7.f79761r;
                PeerToPeerChatFlowContract$Step.ChatScreen chatScreen = (PeerToPeerChatFlowContract$Step.ChatScreen) ((PeerToPeerChatFlowContract$Step) obj3);
                zm3.a aVar9 = chatScreen.f79753a;
                TransferMoneyPocket transferMoneyPocket2 = chatScreen.f79754b;
                if (transferMoneyPocket2 != null) {
                    dj0.d dVar5 = output.f326632a;
                    SourceAccount sourceAccount = transferMoneyPocket2.f92262b;
                    Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
                    transferMoneyPocket = new TransferMoneyPocket(dVar5, sourceAccount);
                }
                oki.h.t2(aVar7, aVar8, new PeerToPeerChatFlowContract$Step.Transfer(aVar9, m1l.a.SCHEDULE_ENABLED, transferMoneyPocket), true, null, false, 12);
                return Unit.f186387a;
            case 28:
                aii.q it13 = (aii.q) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                oki.h.t2((com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.flow.a) obj4, (yki.l) obj3, RevPointsPostOnboardingPersonalisationFlowContract$Step.Brands.f83837a, false, null, false, 14);
                return Unit.f186387a;
            default:
                z0f.q update4 = (z0f.q) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return z0f.q.a(update4, null, null, null, (AbstractList) obj4, (ArrayList) obj3, false, null, null, 4071);
        }
    }
}
