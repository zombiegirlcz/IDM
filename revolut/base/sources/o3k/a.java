package o3k;

import a15.l;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.card_screen.common.cards.models.CardsStateSnapshot$SubscriptionsContent;
import com.revolut.feature.credit.autopay.models.AccountDetails;
import com.revolut.feature.credit.autopay.models.repayment.AutoPayRepaymentData;
import com.revolut.feature.credit.autopay.models.repayment.AutoPayRepaymentDataRequest;
import com.revolut.feature.credit.autopay.models.repayment.RepaymentSource;
import com.revolut.feature.credit.autopay.models.repayment.RepresentationAmountStyle;
import com.revolut.feature.credit.autopay.models.repayment.RepresentationDayStyle;
import com.revolut.feature.credit.autopay.models.repayment.RepresentationFromStyle;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.defi.remittances.impl.ui.receive.flow.DeFiReceiveFlowContract$Step;
import com.revolut.feature.onboarding.api.esignature.models.ESignatureProcess;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.PixAuthorisationRequestScreenContract$InputData;
import com.revolut.feature.shared.help_centre.impl.R$string;
import com.revolut.feature.support.api.SupportApi$Toggles$HelpCenterRevampLoading;
import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.CommodityTargetPriceScreenContract$TargetPriceInputValue;
import com.revolut.retail.feature.payments.bank_transfer.impl.common.RemittanceRoutesException;
import com.revolut.retail.operation_status.step.OperationStatusFragment;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountAvailableToOnboard;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import d9.e1;
import efm.r;
import ip0.bf0;
import ip0.nb0;
import ip0.pb0;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import ne0.o;
import o7b.i;
import o7j.j;
import o7j.k;
import o9c.m0;
import o9c.s;
import oki.h;
import org.jmrtd.lds.LDSFile;
import q64.m;
import u3a.n;
import vkm.j2;
import yp0.e0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f221828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f221829b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f221828a = i;
        this.f221829b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        d3a.a aVar;
        RepresentationFromStyle externalAccount;
        int i = this.f221828a;
        int i2 = 14;
        int i3 = 3;
        dj0.d dVar = null;
        Object obj3 = this.f221829b;
        switch (i) {
            case 0:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                ServerError serverErrorA = ((g) obj3).f.a(error);
                r rVarError = (serverErrorA == null || serverErrorA.f51362a != 1502) ? r.error(error) : r.just(new e3k.c(RemittanceRoutesException.CurrencyNotSupported1502.f101990a));
                Intrinsics.h(rVarError);
                return rVarError;
            case 1:
                ty0.a it8 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                ((OperationStatusFragment) obj3).f104421b0.onNext(it8);
                return Unit.f186387a;
            case 2:
                List availableFilters = (List) obj2;
                Intrinsics.checkNotNullParameter(availableFilters, "availableFilters");
                ((o4a.d) obj3).getClass();
                List<WhoToTransferFilter> list = availableFilters;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (WhoToTransferFilter whoToTransferFilter : list) {
                    if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Revolut.f80005a)) {
                        aVar = d3a.a.REVOLUT;
                    } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmAani.f79985a)) {
                        aVar = d3a.a.APM_AANI;
                    } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmBizum.f79986a)) {
                        aVar = d3a.a.APM_BIZUM;
                    } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmBlik.f79987a)) {
                        aVar = d3a.a.APM_BLIK;
                    } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmBreb.f79988a)) {
                        aVar = d3a.a.APM_BREB;
                    } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmIris.f79989a)) {
                        aVar = d3a.a.APM_IRIS;
                    } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmMultibanco.f79990a)) {
                        aVar = d3a.a.APM_MULTIBANCO;
                    } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmPayId.f79991a)) {
                        aVar = d3a.a.APM_PAYID;
                    } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmPix.f79992a)) {
                        aVar = d3a.a.APM_PIX;
                    } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmQvik.f79993a)) {
                        aVar = d3a.a.APM_QVIK;
                    } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmSpin.f79994a)) {
                        aVar = d3a.a.APM_SPIN;
                    } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmUpi.f79995a)) {
                        aVar = d3a.a.APM_UPI;
                    } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.ApmWero.f79996a)) {
                        aVar = d3a.a.APM_WERO;
                    } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Billers.f79997a)) {
                        aVar = d3a.a.BILLERS;
                    } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Accounts.f79984a)) {
                        aVar = d3a.a.ACCOUNTS;
                    } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Cards.f79998a)) {
                        aVar = d3a.a.CARDS;
                    } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Groups.f80003a)) {
                        aVar = d3a.a.GROUPS;
                    } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.CryptoWallets.f80001a)) {
                        aVar = d3a.a.CRYPTO_WALLET;
                    } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Charities.f79999a)) {
                        aVar = d3a.a.CHARITIES;
                    } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Checks.f80000a)) {
                        aVar = d3a.a.CHECKS;
                    } else if (Intrinsics.f(whoToTransferFilter, WhoToTransferFilter.Device.f80002a)) {
                        aVar = d3a.a.DEVICE;
                    } else {
                        if (!(whoToTransferFilter instanceof WhoToTransferFilter.MobileWallet)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar = d3a.a.MOBILE_WALLET;
                    }
                    arrayList.add(aVar);
                }
                return arrayList;
            case 3:
                lal.a aVar2 = (lal.a) obj3;
                List searchSections = (List) obj2;
                Intrinsics.checkNotNullParameter(searchSections, "searchSections");
                return ((n) ((d3a.b) aVar2.f193426b)).d(null, searchSections, ((vq8.a) aVar2.e).a());
            case 4:
                bk4.d autoPayDetails = (bk4.d) obj2;
                Intrinsics.checkNotNullParameter(autoPayDetails, "autoPayDetails");
                RepaymentSource f67151a = ((AutoPayRepaymentDataRequest) obj3).getF70325a();
                RepresentationAmountStyle.SimpleMoney simpleMoney = new RepresentationAmountStyle.SimpleMoney(autoPayDetails.f16253b);
                RepresentationDayStyle representationDayStyle = new RepresentationDayStyle(autoPayDetails.f16252a, false);
                if (f67151a instanceof RepaymentSource.RevolutWallet) {
                    externalAccount = new RepresentationFromStyle.RevolutWallet((String) null, 3);
                } else {
                    if (!(f67151a instanceof RepaymentSource.ExternalAccount)) {
                        if ((f67151a instanceof RepaymentSource.Pocket) || (f67151a instanceof RepaymentSource.JointAccount)) {
                            throw new IllegalStateException(j6.a.q("Unsupported repayment source type: ", o0.f186429a.b(f67151a.getClass()).m()));
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    RepaymentSource.ExternalAccount.Companion companion = RepaymentSource.ExternalAccount.INSTANCE;
                    AccountDetails.LinkedAccount linkedAccount = ((RepaymentSource.ExternalAccount) f67151a).f68552a;
                    companion.getClass();
                    externalAccount = new RepresentationFromStyle.ExternalAccount(RepaymentSource.ExternalAccount.Companion.a(linkedAccount), false);
                }
                return new AutoPayRepaymentData(simpleMoney, representationDayStyle, externalAccount, autoPayDetails, null, 112);
            case 5:
                com.revolut.feature.defi.remittances.impl.ui.receive.flow.a aVar3 = (com.revolut.feature.defi.remittances.impl.ui.receive.flow.a) obj3;
                r66.a output = (r66.a) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                h.u2(aVar3, aVar3.f71812p, new DeFiReceiveFlowContract$Step.Deposit(output.f251645a), null, 6);
                return Unit.f186387a;
            case 6:
                com.revolut.feature.wealth.commodity_additional_services.impl.ui.flows.physical_delivery.a aVar4 = (com.revolut.feature.wealth.commodity_additional_services.impl.ui.flows.physical_delivery.a) obj3;
                yja.b output2 = (yja.b) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                int i5 = o5h.c.f222438a[output2.ordinal()];
                if (i5 == 1 || i5 == 2 || i5 == 3) {
                    r6.b.D("Unexpected access to undeveloped physical delivery form");
                } else {
                    if (i5 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h.D2(aVar4.o);
                }
                return Unit.f186387a;
            case 7:
                NaviCommand command = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command, "command");
                return ((o5i.d) obj3).f222445b.a(command);
            case 8:
                com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.flow.a aVar5 = (com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.flow.a) obj3;
                m result = (m) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!(result instanceof m)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar5.K2(null);
                return Unit.f186387a;
            case 9:
                o65.d update = (o65.d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.getClass();
                return new o65.d((LoanDetails) obj3);
            case 10:
                o69.g gVar = (o69.g) obj3;
                x39.b locationState = (x39.b) obj2;
                Intrinsics.checkNotNullParameter(locationState, "locationState");
                r rVarSwitchMap = ue0.e.I(((z39.b) gVar.f222531c).b(), h0.f322473a, new o5.b(29)).x().switchMap(new o5i.a(i3, new o54.a(gVar, locationState, 5)));
                Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                return rVarSwitchMap;
            case 11:
                o6f.a update2 = (o6f.a) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return o6f.a.a(update2, null, (a6f.f) obj3, null, false, false, 61);
            case 12:
                com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.schedule.a aVar6 = (com.revolut.feature.credit.application.plugins.impl.ui.conveyancing_appointment.scheduling.schedule.a) obj3;
                m74.d outputData = (m74.d) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData == null) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar6.H2(aVar6.f67326p, new l(22, outputData.f203312a));
                return Unit.f186387a;
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                ((i) obj3).getClass();
                ArrayList arrayList2 = new ArrayList(3);
                while (i < 3) {
                    arrayList2.add(new bf0(a0.d.n("reward_selection_loading_", i)));
                    i++;
                }
                return arrayList2;
            case 14:
                NaviCommand naviCommand = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(naviCommand, "naviCommand");
                return new pfm.h(new o((o7c.e) obj3, naviCommand, i2), 2);
            case 15:
                NaviCommand naviCommand2 = (NaviCommand) obj2;
                sri.m mVar = ((o7c.m) obj3).f222767a;
                Intrinsics.h(naviCommand2);
                mVar.c(naviCommand2);
                return Unit.f186387a;
            case 16:
                com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.b bVar = (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price.b) obj3;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                CommodityTargetPriceScreenContract$TargetPriceInputValue targetPriceInputValue = (CommodityTargetPriceScreenContract$TargetPriceInputValue) pair.f186385a;
                BigDecimal currentRate = (BigDecimal) pair.f186386b;
                o7j.a aVar7 = bVar.f99924p;
                wd6.h orderType = ((j) ((j2) bVar.getState().f22677a).getValue()).f222864b;
                wd6.e exchangeMode = ((j) ((j2) bVar.getState().f22677a).getValue()).e;
                aVar7.getClass();
                Intrinsics.checkNotNullParameter(targetPriceInputValue, "targetPriceInputValue");
                Intrinsics.checkNotNullParameter(currentRate, "currentRate");
                Intrinsics.checkNotNullParameter(orderType, "orderType");
                Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
                BigDecimal bigDecimal = targetPriceInputValue.f99921a;
                BigDecimal bigDecimalSubtract = bigDecimal.subtract(currentRate);
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                BigDecimal bigDecimalAbs = bigDecimalSubtract.abs();
                BigDecimal bigDecimalMultiply = currentRate.multiply(new BigDecimal(String.valueOf(5.0E-4f)), MathContext.DECIMAL128);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                i = bigDecimalAbs.compareTo(bigDecimalMultiply) < 0 ? 1 : 0;
                if (e1.I(bigDecimal)) {
                    return new o7j.l(u.c(k.VALUE_IS_ZERO), bigDecimal);
                }
                wd6.h hVar = wd6.h.LIMIT;
                if (orderType == hVar && exchangeMode == wd6.e.BUY && bigDecimal.compareTo(currentRate) > 0) {
                    return new o7j.l(u.c(k.PRICE_HAS_TO_BE_LOWER), bigDecimal);
                }
                if (orderType == hVar && exchangeMode == wd6.e.SELL && bigDecimal.compareTo(currentRate) < 0) {
                    return new o7j.l(u.c(k.PRICE_HAS_TO_BE_HIGHER), bigDecimal);
                }
                wd6.h hVar2 = wd6.h.STOP;
                return (orderType == hVar2 && exchangeMode == wd6.e.BUY && bigDecimal.compareTo(currentRate) < 0) ? new o7j.l(u.c(k.PRICE_HAS_TO_BE_HIGHER), bigDecimal) : (orderType == hVar2 && exchangeMode == wd6.e.SELL && bigDecimal.compareTo(currentRate) > 0) ? new o7j.l(u.c(k.PRICE_HAS_TO_BE_LOWER), bigDecimal) : i != 0 ? new o7j.n(u.c(o7j.m.PRICE_IS_CLOSE_TO_MARKET_RATE), bigDecimal) : new o7j.n(f0.f322471a, bigDecimal);
            case 17:
                j jVar = (j) obj3;
                List exchangeRates = (List) obj2;
                Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
                qta.a aVar8 = (qta.a) d0.d0(exchangeRates);
                if (aVar8 == null) {
                    return null;
                }
                BigDecimal bigDecimal2 = jVar.e == wd6.e.BUY ? aVar8.f249041c : aVar8.d;
                if (bigDecimal2 == null) {
                    return null;
                }
                return bigDecimal2;
            case 18:
                CardsStateSnapshot$SubscriptionsContent cardsStateSnapshot$SubscriptionsContent = (CardsStateSnapshot$SubscriptionsContent) obj3;
                Intrinsics.h(cardsStateSnapshot$SubscriptionsContent);
                return o83.f.a((o83.f) obj2, cardsStateSnapshot$SubscriptionsContent, null, 2);
            case 19:
                return o87.b.a((o87.b) obj2, (j87.f) obj3, null, null, null, null, 30);
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return ((hu4.c) ((o8i.f) obj3).f223036a).b();
            case 21:
                o99.a aVar9 = (o99.a) obj3;
                od0.i eSignatureIdOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(eSignatureIdOptional, "eSignatureIdOptional");
                ESignatureProcess eSignatureProcess = (ESignatureProcess) eSignatureIdOptional.f224257a;
                if (eSignatureProcess != null) {
                    return new ufm.i(aVar9.c(eSignatureProcess), new o5i.a(15, new nzj.n(1, od0.i.Companion, od0.h.class, "of", "of(Ljava/lang/Object;)Lcom/revolut/core/common/Optional;", 0, 13)), 1);
                }
                od0.i.Companion.getClass();
                ufm.b bVarM = efm.d0.m(od0.i.f224256b);
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
            case 22:
                r9a.g gVar2 = (r9a.g) obj3;
                o9a.j update3 = (o9a.j) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                if (!(gVar2 instanceof r9a.f)) {
                    if (!(gVar2 instanceof r9a.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar = ((r9a.e) gVar2).f252547a;
                }
                return o9a.j.a(update3, null, null, null, dVar, false, null, LDSFile.EF_DG15_TAG);
            case 23:
                return o9a.j.a((o9a.j) obj2, null, ((PixAuthorisationRequestScreenContract$InputData) obj3).f80589b, null, null, false, null, 123);
            case 24:
                s update4 = (s) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return s.a(update4, null, null, null, null, null, null, null, null, null, null, null, (l6c.b) obj3, false, null, null, null, 253951);
            case 25:
                o9c.o0 o0Var = (o9c.o0) obj3;
                s6c.i finalAmount = (s6c.i) obj2;
                Intrinsics.checkNotNullParameter(finalAmount, "finalAmount");
                return new m0(o0Var.f223215a, o0Var.f223216b, finalAmount);
            case 26:
                s update5 = (s) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                ArrayList arrayListF1 = d0.f1(update5.f223230j);
                arrayListF1.add(((eec.f) ((eec.g) obj3)).f125170a);
                Unit unit = Unit.f186387a;
                return s.a(update5, null, null, null, null, null, null, null, arrayListF1, null, null, null, null, false, null, null, null, 261631);
            case 27:
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                return new Pair((q6c.h) obj3, bool);
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                if (!((jte.d) ((o9d.d) obj3).f223254a.f194089a).c(SupportApi$Toggles$HelpCenterRevampLoading.f89338c)) {
                    ArrayList arrayList3 = new ArrayList(3);
                    while (i < 3) {
                        arrayList3.add(nb0.b(pb0.Companion, "QUICK_HELP_LOADING_ITEM_ID", false, R$attr.uikit_dp12, false, 16));
                        i++;
                    }
                    return yp0.b.g(arrayList3, p9d.j.a(new TextLocalisedClause(R$string.help_center_section_quick_help_title_select_issue, null, null, 14), "QUICK_HELP_TITLE_ITEM_ID"), e0.INSIDE_BOX, 0, 0, 124);
                }
                ArrayList arrayList4 = new ArrayList(8);
                while (i < 8) {
                    arrayList4.add(nb0.b(pb0.Companion, "QUICK_HELP_LOADING_ITEM_ID", false, R$attr.uikit_dp12, false, 16));
                    i++;
                }
                yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
                return arrayList4;
            default:
                TradingAccounts tradingAccounts = (TradingAccounts) obj2;
                Intrinsics.checkNotNullParameter(tradingAccounts, "tradingAccounts");
                boolean zC = ((jte.d) ((o9f.a) obj3).f223257b).c(FeatureWealthApi$Toggles.JointInvestStocksTransfer.f95165c);
                List list2 = tradingAccounts.f105278a;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj4 : list2) {
                    TradingAccount tradingAccount = (TradingAccount) obj4;
                    Intrinsics.checkNotNullParameter(tradingAccount, "<this>");
                    if (com.revolut.shared.feature.wealth.models.trading_accounts.d.j(tradingAccount.z()) && (!(tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa) || !com.revolut.shared.feature.wealth.models.trading_accounts.d.b(tradingAccount.getD()))) {
                        if (zC || !com.revolut.shared.feature.wealth.models.trading_accounts.d.c(tradingAccount)) {
                            arrayList5.add(obj4);
                        }
                    }
                }
                List list3 = tradingAccounts.f105279b;
                ArrayList arrayList6 = new ArrayList();
                for (Object obj5 : list3) {
                    TradingAccountAvailableToOnboard tradingAccountAvailableToOnboard = (TradingAccountAvailableToOnboard) obj5;
                    Intrinsics.checkNotNullParameter(tradingAccountAvailableToOnboard, "<this>");
                    if (com.revolut.shared.feature.wealth.models.trading_accounts.d.j(tradingAccountAvailableToOnboard.f105268g) && (zC || !com.revolut.shared.feature.wealth.models.trading_accounts.b.e(tradingAccountAvailableToOnboard))) {
                        arrayList6.add(obj5);
                    }
                }
                if (!arrayList5.isEmpty()) {
                    Iterator it9 = arrayList5.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            if (((TradingAccount) it9.next()) instanceof TradingAccount.TaxAdvantage.JIsa) {
                                ArrayList arrayList7 = new ArrayList();
                                for (Object obj6 : arrayList6) {
                                    if (!com.revolut.shared.feature.wealth.models.trading_accounts.b.c((TradingAccountAvailableToOnboard) obj6)) {
                                        arrayList7.add(obj6);
                                    }
                                }
                                arrayList6 = arrayList7;
                            }
                        }
                    }
                }
                return new u8f.a(arrayList5, arrayList6);
        }
    }

    public /* synthetic */ a(o54.b bVar, AutoPayRepaymentDataRequest autoPayRepaymentDataRequest) {
        this.f221828a = 4;
        this.f221829b = autoPayRepaymentDataRequest;
    }
}
