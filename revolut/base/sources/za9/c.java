package za9;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.manage_tax_rates.ManageTaxRatesFlowContract$Step;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$State;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.core.models.recipients.SpinContact;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRecipientDetailsDestination;
import com.revolut.feature.apm.spin.impl.ui.transfer.SpinTransferFlowContract$InputData;
import com.revolut.feature.backend_flow.domain.models.BackendItem;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.crypto.exchange.fees.impl.ui.CryptoExchangeFeesControllerContract$PagerItem;
import com.revolut.feature.full_screen_prompt.c;
import com.revolut.feature.junior_graduation.api.navigation.IdentificationFlowPublicContract$OutputData;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.flow.IndiaAppRedirectionFlowContract$Step;
import com.revolut.feature.payments.social.api.model.StartAction;
import com.revolut.feature.payments.social.api.navigation.SocialPaymentsFeatureConfig;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.rev10_main_screen.api.navigation.MainContainerScreenFeatureConfig;
import com.revolut.feature.shared_separate_favourites.common.screen.add_asset_rev10.AddAssetRev10Screen;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlow;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.esim.api.EsimApi$Toggles;
import com.revolut.retail.feature.esim.api.model.EsimMobilePlanPointsOption;
import com.revolut.retail.feature.esim.api.model.EsimUserPocket;
import com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.PlanGiftingReceiverFlowContract$Step;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountAvailableToOnboard;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import d67.p;
import d67.q;
import d67.r;
import d67.s;
import d67.t;
import d67.u;
import ef9.f;
import efm.d0;
import ff1.f;
import ff1.g;
import g4b.a0;
import gck.m;
import gck.n;
import gck.p;
import grl.k9;
import ikk.f;
import ip0.nb0;
import ip0.pb0;
import ip0.v7;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import obc.j;
import od0.i;
import oki.h;
import te0.w;
import wg9.l;
import zac.f;
import zb6.o;
import zc0.b0;
import zga.k;
import zgj.l0;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f320589b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f320588a = i;
        this.f320589b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        TradingAccountType.Gia gia;
        Object next;
        Object next2;
        int i = this.f320588a;
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        int i2 = 13;
        int i3 = 1;
        int i5 = 0;
        Continuation continuation = null;
        Object obj3 = this.f320589b;
        switch (i) {
            case 0:
                com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.flow.a aVar = (com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.flow.a) obj3;
                u output = (u) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (Intrinsics.f(output, q.f111462a)) {
                    aVar.B2();
                } else if (Intrinsics.f(output, s.f111464a)) {
                    aVar.C1(new ExternalDestination.Browser("https://get.revolut.com/PFpO/4c5qd8un", null));
                } else if (Intrinsics.f(output, t.f111465a)) {
                    h.w2(aVar.f78444q, new IndiaAppRedirectionFlowContract$Step.ChangeCountry(true), popup);
                } else {
                    if (!(output instanceof p) && !Intrinsics.f(output, r.f111463a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    r6.b.D("PromptMarketingScreen unexpected output");
                }
                return Unit.f186387a;
            case 1:
                f update = (f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return f.a(update, null, ((j) obj3).f223921a, 13);
            case 2:
                aii.q it8 = (aii.q) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                ((com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.a) obj3).C1(u0.c(new MainContainerScreenFeatureConfig(new MainContainerScreenDestination.JustShow(ibb.c.f160141b.f83420a, (SliderLayout.SlidingSpec) null, (Parcelable) null, 14), 335577088, false)));
                return Unit.f186387a;
            case 3:
                Long it9 = (Long) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return ((zb1.b) obj3).u;
            case 4:
                o oVar = (o) obj3;
                zb6.h update2 = (zb6.h) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return zb6.h.a(update2, oVar.f320816a, oVar.f320817b, null, oVar.f320818c, null, null, 116);
            case 5:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                return (List) ((zb8.b) obj3).f320842b.get("ALLOWANCE_RECURRING_PAYMENTS_KEY");
            case 6:
                zbj.q qVar = (zbj.q) obj3;
                zbj.q qVar2 = (zbj.q) obj2;
                Data data = qVar.f320925a;
                xi0.b bVar = qVar.f320926b;
                i iVar = qVar.f320927c;
                Data data2 = qVar.d;
                Data data3 = qVar.f;
                Data data4 = qVar.e;
                i iVar2 = qVar.f320928g;
                i iVar3 = qVar.f320929h;
                jbj.a aVar2 = qVar.f320931l;
                zbj.u0 u0Var = qVar2.f320932m;
                if (u0Var == null) {
                    u0Var = qVar.f320932m;
                }
                return zbj.q.a(qVar2, data, bVar, iVar, data2, data4, data3, iVar2, iVar3, null, null, aVar2, u0Var, 9984);
            case 7:
                return zbj.q.a((zbj.q) obj2, null, null, null, null, null, null, null, null, (CircleActionButtonsBarDelegate.CircleActionButton) obj3, null, null, null, 15871);
            case 8:
                com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.d dVar = (com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.d) obj3;
                yki.a aVar3 = dVar.f102479x;
                gck.p output2 = (gck.p) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof m) {
                    dVar.K2(((m) output2).f142504a);
                } else if (output2 instanceof n) {
                    n nVar = (n) output2;
                    dVar.l2(new com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.c(dVar, nVar.f142506b, nVar.f142505a, null), new yi5.b(26));
                } else if (output2 instanceof gck.r) {
                    gck.r rVar = (gck.r) output2;
                    h.w2(aVar3, new PlanGiftingReceiverFlowContract$Step.FullBenefitsList(rVar.f142511a, rVar.f142512b, rVar.f142513c), popup);
                } else if (output2 instanceof gck.o) {
                    dVar.C1(u0.b(com.revolut.retail.core.navigation.a.c(jbb.a.a(ibb.c.f160140a, null, null, null, 14), new FeatureCommand(new SocialPaymentsFeatureConfig.PaymentsProfileChat(((gck.o) output2).f142507a, (TransferMoneyPocket) null, (StartAction.ShowBottomDialog) null, false, 30)))));
                } else if (output2 instanceof gck.q) {
                    gck.q qVar3 = (gck.q) output2;
                    h.w2(aVar3, new PlanGiftingReceiverFlowContract$Step.DocumentsList(qVar3.f142509a, qVar3.f142510b), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                } else {
                    if (!(output2 instanceof p.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h.D2(aVar3);
                }
                return Unit.f186387a;
            case 9:
                BackendItem backendItem = (BackendItem) obj3;
                Data data5 = (Data) obj2;
                Intrinsics.checkNotNullParameter(data5, "data");
                return data5.getContent() == null ? Data.copy$default(data5, backendItem, null, false, 6, null) : data5;
            case 10:
                com.revolut.feature.acquiring.lite_pos.impl.ui.flow.manage_tax_rates.a aVar4 = (com.revolut.feature.acquiring.lite_pos.impl.ui.flow.manage_tax_rates.a) obj3;
                ff1.f result = (ff1.f) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (Intrinsics.f(result, f.a.f134693a)) {
                    aVar4.E2(ManageTaxRatesFlowContract$Step.AddTaxRate.f60746a, true, null, false);
                } else {
                    if (!(result instanceof g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar4.E2(new ManageTaxRatesFlowContract$Step.EditTaxRate(((g) result).f134694a), true, null, false);
                }
                return Unit.f186387a;
            case 11:
                com.revolut.feature.apm.spin.impl.ui.transfer.b bVar2 = (com.revolut.feature.apm.spin.impl.ui.transfer.b) obj3;
                SpinTransferFlowContract$InputData spinTransferFlowContract$InputData = bVar2.o;
                oy1.b bVar3 = bVar2.f62893r;
                kz9.e result2 = (kz9.e) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof kz9.c) {
                    SpinContact recipient = spinTransferFlowContract$InputData.f62887a;
                    bVar3.getClass();
                    Intrinsics.checkNotNullParameter(recipient, "recipient");
                    bVar2.C1(new ApmRecipientDetailsDestination(recipient));
                } else {
                    if (!(result2 instanceof kz9.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar2.C1(bVar3.g(spinTransferFlowContract$InputData.f62887a, hrf.f.OUTGOING, new TransferMoneyPocket(null, null, 3)));
                }
                return Unit.f186387a;
            case 12:
                com.revolut.feature.credit.application.plugins.impl.ui.mortgage_valuation.flow.a aVar5 = (com.revolut.feature.credit.application.plugins.impl.ui.mortgage_valuation.flow.a) obj3;
                af4.p outputData = (af4.p) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof af4.o) {
                    c84.t.J2(aVar5, false, null, null, 7);
                } else {
                    if (!(outputData instanceof af4.n)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar5.l2(new zah.f(aVar5, outputData, continuation, i3), new yi5.b(26));
                }
                return Unit.f186387a;
            case 13:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                return (Map) ((zeb.g) obj3).f321654b.get("REVERYWHERE_CONFIG_MEMORY_KEY");
            case 14:
                zf5.g update3 = (zf5.g) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return zf5.g.a(update3, null, null, ((CryptoExchangeFeesControllerContract$PagerItem) obj3).getF94249a(), null, null, null, 123);
            case 15:
                com.revolut.feature.pay_bills_taxes.impl.ui.flow.form.b bVar4 = (com.revolut.feature.pay_bills_taxes.impl.ui.flow.form.b) obj3;
                l outputData2 = (l) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                if (outputData2 instanceof l.c) {
                    bVar4.C2(f.b.f125297a);
                } else {
                    bVar4.C2(f.a.f125296a);
                }
                return Unit.f186387a;
            case 16:
                AddAssetRev10Screen addAssetRev10Screen = (AddAssetRev10Screen) obj3;
                zfd.g it10 = (zfd.g) obj2;
                AddAssetRev10Screen.Companion aVar6 = AddAssetRev10Screen.INSTANCE;
                Intrinsics.checkNotNullParameter(it10, "it");
                WatchlistAddAssetFlow watchlistAddAssetFlow = (WatchlistAddAssetFlow) it10;
                int i6 = 4;
                int i21 = 2;
                com.revolut.kompot.navigable.a.g2(addAssetRev10Screen, new y5j.e(((com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.h) watchlistAddAssetFlow.R2()).f86958t.B(new hhd.n(i3)), 29), null, new ys.i(i21, addAssetRev10Screen.T2(), zfd.j.class, "onUiEvent", "onUiEvent(Lcom/revolut/feature/shared_separate_favourites/common/screen/add_asset_rev10/AddAssetRev10ScreenContract$UiEvent;)V", i6, 18), 3);
                com.revolut.kompot.navigable.a.g2(addAssetRev10Screen, new zfd.e(((com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.h) watchlistAddAssetFlow.R2()).f86958t.B(new hhd.n(2)), 0), null, new ys.i(i21, addAssetRev10Screen.T2(), zfd.j.class, "onUiEvent", "onUiEvent(Lcom/revolut/feature/shared_separate_favourites/common/screen/add_asset_rev10/AddAssetRev10ScreenContract$UiEvent;)V", i6, 19), 3);
                com.revolut.kompot.navigable.a.g2(addAssetRev10Screen, new zfd.e(vkm.q.q(new a0(((com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.h) watchlistAddAssetFlow.R2()).f86958t.B(new hhd.n(i5)), 16)), 1), null, new ys.i(i21, addAssetRev10Screen.T2(), zfd.j.class, "onUiEvent", "onUiEvent(Lcom/revolut/feature/shared_separate_favourites/common/screen/add_asset_rev10/AddAssetRev10ScreenContract$UiEvent;)V", i6, 17), 3);
                return Unit.f186387a;
            case 17:
                Function0 it11 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                ((com.revolut.feature.shared_separate_favourites.common.screen.add_asset_rev10.b) obj3).getClass();
                return zhm.u.c(new pb0("PAGE_LOADING_ITEM_ID"));
            case 18:
                com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.a aVar7 = (com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.a) obj3;
                dh4.j outputData3 = (dh4.j) obj2;
                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                if (outputData3 instanceof dh4.g) {
                    aVar7.n2(new yzb.c(aVar7, continuation, i2), new whi.b(6));
                } else if (outputData3 instanceof dh4.i) {
                    aVar7.n2(new zg4.c(outputData3, aVar7, null), new whi.b(6));
                } else {
                    if (!(outputData3 instanceof dh4.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar7.n2(new zah.f(aVar7, outputData3, continuation, 3), new whi.b(6));
                }
                return Unit.f186387a;
            case 19:
                com.revolut.feature.junior_graduation.impl.ui.flow.identification.a aVar8 = (com.revolut.feature.junior_graduation.impl.ui.flow.identification.a) obj3;
                com.revolut.feature.full_screen_prompt.c result3 = (com.revolut.feature.full_screen_prompt.c) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (Intrinsics.f(result3, c.C0497c.f74506a)) {
                    aVar8.C1(new BridgeDestination(aVar8.f76929p.a()));
                } else if (result3 instanceof c.a) {
                    aVar8.C2(IdentificationFlowPublicContract$OutputData.Success.f76912a);
                } else if (!Intrinsics.f(result3, c.d.f74507a) && !Intrinsics.f(result3, c.b.f74505a) && !(result3 instanceof d67.h)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 20:
                zga.c params = (zga.c) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (zga.f) ((zga.g) obj3).f322100b.get(params.f322096h);
            case 21:
                String currentPlanId = (String) obj2;
                Intrinsics.checkNotNullParameter(currentPlanId, "currentPlanId");
                return (k) v7.r("pricing_plan_contextual_nudge_", currentPlanId, ((zga.m) obj3).f322105b);
            case 22:
                zgj.r update4 = (zgj.r) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return zgj.r.a(update4, null, null, null, null, null, null, null, null, null, zi0.c.P(u1.a((EsimMobilePlanPointsOption) obj3), false, null, 3), null, null, null, null, null, 32255);
            case 23:
                Pair pair = (Pair) obj2;
                return new yhm.r((EsimUserPocket) pair.f186385a, (Optional) pair.f186386b, (dej.a) obj3);
            case 24:
                Function0 it12 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                boolean zC = ((jte.d) ((l0) obj3).d.f135254a).c(EsimApi$Toggles.EsimAnyToAnyCheckout.f100168c);
                if (zC) {
                    str = "PAYMENT_METHOD_PAYMENT_METHODS_LIST_ID";
                } else {
                    if (zC) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "ID_PAY_WITH_ITEM";
                }
                return nb0.b(pb0.Companion, str, false, 0, false, 30);
            case 25:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.invitation.e eVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.invitation.e) obj3;
                ikk.f it13 = (ikk.f) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                if (!Intrinsics.f(it13, f.a.f161995a)) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar.l2(new yzb.c(eVar, continuation, 17), new yi5.b(26));
                return Unit.f186387a;
            case 26:
                zh1.b bVar5 = (zh1.b) obj3;
                gi1.l output3 = (gi1.l) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                bVar5.H2(bVar5.f322213q, new c(output3, 27));
                bVar5.C2(new AddressFlowContract$OutputData(output3.f144038a, output3.f144039b, output3.f144040c, output3.d));
                return Unit.f186387a;
            case 27:
                AddressFlowContract$State update5 = (AddressFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                Address address = ((gi1.l) obj3).f144038a;
                update5.getClass();
                Intrinsics.checkNotNullParameter(address, "address");
                return new AddressFlowContract$State(address);
            case 28:
                zh3.k kVar = (zh3.k) obj3;
                rh3.c action = (rh3.c) obj2;
                Intrinsics.checkNotNullParameter(action, "action");
                sh3.a aVar9 = kVar.d;
                CheckoutParams.CardOrder params2 = action.f254304a;
                boolean z = !((db9.d) kVar.f322236c).c();
                Intrinsics.checkNotNullParameter(params2, "params");
                pfm.a aVar10 = new pfm.a(w.o0(kotlin.coroutines.g.f186406a, new ald.m(params2, (ei3.m) aVar9, z, (Continuation) null, 11)), new b0(new zf5.n(kVar, action, 8), 28), 4);
                Intrinsics.checkNotNullExpressionValue(aVar10, "flatMapCompletable(...)");
                return aVar10;
            default:
                zh7.c cVar = (zh7.c) obj3;
                TradingAccounts it14 = (TradingAccounts) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                Iterator it15 = it14.f105278a.iterator();
                while (true) {
                    boolean zHasNext = it15.hasNext();
                    gia = TradingAccountType.Gia.f105270a;
                    if (zHasNext) {
                        next = it15.next();
                        TradingAccount tradingAccount = (TradingAccount) next;
                        if (tradingAccount.getD() == cfl.b.TERMINATED || !Intrinsics.f(tradingAccount.W(), gia)) {
                        }
                    } else {
                        next = null;
                    }
                }
                TradingAccount tradingAccount2 = (TradingAccount) next;
                Iterator it16 = it14.f105279b.iterator();
                while (true) {
                    if (it16.hasNext()) {
                        next2 = it16.next();
                        if (Intrinsics.f(((TradingAccountAvailableToOnboard) next2).d, gia)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                TradingAccountAvailableToOnboard tradingAccountAvailableToOnboard = (TradingAccountAvailableToOnboard) next2;
                String str2 = tradingAccountAvailableToOnboard != null ? tradingAccountAvailableToOnboard.f105265a : null;
                TradingOnboardingFeatureConfig.TradingAccountOrType withTradingAccount = tradingAccount2 != null ? new TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccount(tradingAccount2) : str2 != null ? new TradingOnboardingFeatureConfig.TradingAccountOrType.WithAvailableAccountId(str2, null) : null;
                if (withTradingAccount == null) {
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.WARNING, "OnboardingNavigationProviderImpl", "no suitable gia account found", null, null, 16);
                    return d0.m(Optional.empty());
                }
                c1l.e eVar2 = cVar.f322245b;
                FeatureCommand featureCommand = new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160141b.f83420a, null), null, null, 6)));
                k9 value = k9.Trading;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value, "value");
                return new ufm.i(eVar2.b(DummyCommand.f98635a, new TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig(featureCommand, withTradingAccount, null, new EndPromptParams(false, EndPromptType.TRADING), new AnalyticsProduct.Retail(value)), null), new zh7.a(i5, new zg6.c(i2)), 1);
        }
    }
}
