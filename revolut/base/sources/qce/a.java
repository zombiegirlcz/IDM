package qce;

import aw0.k3;
import aw0.m6;
import aw0.n6;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.data.model.Data;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.backgroundpicker.impl.flow.upload.UploadBackgroundController;
import com.revolut.feature.credit.application.plugins.impl.ui.post_retail_onboarding.CreditCardPostRetailOnboardingFlowContract$Step$ModalStep$Info;
import com.revolut.feature.credit.application.plugins.impl.ui.rollee.RolleeFlowContract$Step;
import com.revolut.feature.credit.application.plugins.impl.ui.rollee.RolleeScreen;
import com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.confirmation.CryptoWithdrawToAddressConfirmationActivity;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import com.revolut.feature.insurance_car.impl.data.model.Survey;
import com.revolut.feature.junior_remote_login.impl.ui.flow.invite_creation.JuniorInviteCreationFlowContract$Step;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.profile.impl.ui.details.address.flow.ProfileAddressFlowContract$Step;
import com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.SharedAddAlertFlowContract$Step;
import com.revolut.feature.shared_separate_favourites.domain.AssetIdWithSymbol;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.tab.crypto.impl.ui.TabCryptoFlowContract$FlowState;
import com.revolut.feature.wealth.models.robo.PortfolioGoal;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig;
import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfigFinishBehavior;
import com.revolut.feature_move_money.api.MoveMoneyFeatureApi$Toggles;
import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection.CountriesSelectionScreenContract$ModalStep;
import com.revolut.feature_retail_user_declarations.transaction_countries.models.TransactionDestination;
import com.revolut.feature_rev_points_pocket_impl.ui.add_money.RevPointsAddMoneyFlowContract$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositDestination;
import com.revolut.retail.feature.crypto_deposits.api.navigation.CryptoDepositInput;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import com.revolut.sso.impl.domain.models.Identifier;
import com.youTransactor.uCube.rpc.Constants;
import dx4.m1;
import hha.w0;
import ip0.mj;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.joda.time.LocalDate;
import qc0.e1;
import rv3.b;
import vj5.a;
import vkm.j2;
import y5i.b;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f244713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f244714c;

    public /* synthetic */ a(int i, String str, Object obj2) {
        this.f244712a = i;
        this.f244714c = obj2;
        this.f244713b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object domain) {
        Object next;
        Object next2;
        jlc.r rVarA;
        int i = this.f244712a;
        int i2 = 1;
        int i3 = 0;
        ?? r132 = 0;
        mjVarA = null;
        mj mjVarA = null;
        Object obj2 = this.f244714c;
        Object obj3 = this.f244713b;
        switch (i) {
            case 0:
                d dVar = (d) obj2;
                vf0.h hVar = (vf0.h) domain;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                Data data = (Data) hVar.f288433a;
                Data data2 = (Data) hVar.f288434b;
                od0.i iVar = (od0.i) hVar.f288435c;
                k71.q qVar = (k71.q) hVar.d;
                List list = (List) iii.c.f(t1.t(data, data2), new qc7.c(dVar, 7), new b(dVar, qVar, i3), new q87.z(dVar, qVar, 5));
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.subscription_block_confirm_title, zhm.u.c((String) obj3), null, 12);
                String str = (String) iVar.f224257a;
                return new rp0.y(list, new rp0.t(textLocalisedClause, str != null ? new TextLocalisedClause(R$string.subscription_block_confirm_someones_subtitle, zhm.u.c(str), null, 12) : (Clause) iii.c.f(data, new qc7.c(5), new qc8.a(3), new pv7.t(25)), null, 28), rp0.l.WINDOW, null, null, null, "SUBSCRIPTION_ACTIONS_DELEGATES_KEY", null, null, null, 3832);
            case 1:
                com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection.a aVar = (com.revolut.feature_retail_user_declarations.transaction_countries.countries_selection.a) obj2;
                sci.h output = (sci.h) domain;
                Intrinsics.checkNotNullParameter(output, "output");
                aVar.H2(aVar.f97762p, new qa9.r(new TransactionDestination(((CountriesSelectionScreenContract$ModalStep.ExpectedAmount) ((CountriesSelectionScreenContract$ModalStep) obj3)).f97761a, output.f261752a, output.f261753b), 21));
                return Unit.f186387a;
            case 2:
                com.revolut.feature_rev_points_pocket_impl.ui.add_money.a aVar2 = (com.revolut.feature_rev_points_pocket_impl.ui.add_money.a) obj3;
                RevPointsAddMoneyFlowContract$InputData revPointsAddMoneyFlowContract$InputData = (RevPointsAddMoneyFlowContract$InputData) obj2;
                y5i.b result = (y5i.b) domain;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!(result instanceof b.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar2.C1(u0.c(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160140a.f83420a, null), new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(revPointsAddMoneyFlowContract$InputData.f97808a, ExtendedSubaccountType.RevPoints.INSTANCE), ProductId.SUBACCOUNT), null), null, 4))));
                return Unit.f186387a;
            case 3:
                Function0 it8 = (Function0) domain;
                Intrinsics.checkNotNullParameter(it8, "it");
                AnimatedBackgroundType animatedBackgroundTypeA = ((m5e.o) obj3).a((qdk.x) obj2);
                zhm.f0 f0Var = zhm.f0.f322471a;
                return new qdk.r0(qdk.a0.f244957a, animatedBackgroundTypeA, f0Var, null, f0Var);
            case 4:
                Intrinsics.checkNotNullParameter(domain, "domain");
                return new qe0.e((ArrayList) obj3, obj2, domain);
            case 5:
                com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.a aVar3 = (com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.a) obj3;
                FavouritesAssetTypeKey favouritesAssetTypeKey = (FavouritesAssetTypeKey) obj2;
                yfd.p outputData = (yfd.p) domain;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (!(outputData instanceof yfd.o)) {
                    throw new NoWhenBranchMatchedException();
                }
                Pair pair = (Pair) zhm.d0.b0(((yfd.o) outputData).f313221a);
                aVar3.H2(aVar3.f86698q, new pza.d((AssetIdWithSymbol) pair.f186385a, 20, favouritesAssetTypeKey, (AssetIdWithSymbol) pair.f186386b));
                oki.h.t2(aVar3, aVar3.f86699r, SharedAddAlertFlowContract$Step.CREATE_ALERT, true, null, false, 12);
                return Unit.f186387a;
            case 6:
                qeg.j jVar = (qeg.j) obj3;
                qeg.e update = (qeg.e) domain;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                meg.h hVar2 = jVar.f245157q;
                zfi.a aVar4 = ((qeg.e) ((j2) jVar.f245158r.f22677a).getValue()).f245150b;
                hVar2.getClass();
                return qeg.e.a(update, null, meg.h.b(aVar4, (meg.g) obj2), null, 5);
            case 7:
                return qeg.e.a((qeg.e) domain, (Data) obj3, (zfi.a) obj2, null, 4);
            case 8:
                dt3.a aVar5 = (dt3.a) obj3;
                com.revolut.feature.credit.application.plugins.impl.ui.post_retail_onboarding.a aVar6 = (com.revolut.feature.credit.application.plugins.impl.ui.post_retail_onboarding.a) obj2;
                d67.u outputData2 = (d67.u) domain;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                if (outputData2 instanceof d67.s) {
                    aVar6.l2(new e1(aVar6, aVar5.e.f117356b, r132, 7), new yi5.b(26));
                } else {
                    int i5 = 26;
                    int i6 = 7;
                    if (outputData2 instanceof d67.t) {
                        aVar6.l2(new e1(aVar6, aVar5.f.f117356b, r132, i6), new yi5.b(i5));
                    } else if (outputData2 instanceof d67.q) {
                        aVar6.C1(new BridgeDestination(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.AS_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, null, 6)))));
                    } else if (outputData2 instanceof d67.p) {
                        Iterator it9 = aVar6.o.f68217b.f117354g.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                next = it9.next();
                                String str2 = ((m1) next).f120675a;
                                String str3 = ((d67.p) outputData2).f111461a.f275445a;
                                if (Intrinsics.f(str2, kotlin.text.d0.w0('/', str3, str3))) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        m1 m1Var = (m1) next;
                        if (m1Var != null) {
                            dx4.l lVar = m1Var.f120676b;
                            if (lVar instanceof dx4.h) {
                                oki.h.w2(aVar6.f68223s, new CreditCardPostRetailOnboardingFlowContract$Step$ModalStep$Info(((dx4.h) lVar).f120610a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                            } else {
                                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unexpected action " + lVar);
                                zhm.h0 h0Var = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                            }
                        } else {
                            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Unknown link");
                            zhm.h0 h0Var2 = zhm.h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2, h0Var2);
                        }
                    } else {
                        if (!(outputData2 instanceof d67.r)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i21 = jli.h.f175850a;
                    }
                }
                return Unit.f186387a;
            case 9:
                List list2 = (List) obj3;
                qgf.h update2 = (qgf.h) domain;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                YearMonth yearMonth = ((qgf.h) ((j2) ((com.revolut.feature.transaction_list.impl.ui.list.flow.a) obj2).u.f22677a).getValue()).f245800b;
                if (yearMonth == null) {
                    yearMonth = (YearMonth) zhm.d0.o0(list2);
                }
                return qgf.h.a(update2, list2, yearMonth, false, null, false, null, null, null, Constants.TAG_FC_SPEED_MODE);
            case 10:
                qgf.h update3 = (qgf.h) domain;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return qgf.h.a(update3, null, null, false, null, false, (Clause) obj3, (Clause) obj2, null, 159);
            case 11:
                com.revolut.feature.credit.application.plugins.impl.ui.rollee.c cVar = (com.revolut.feature.credit.application.plugins.impl.ui.rollee.c) obj3;
                yki.l lVar2 = (yki.l) obj2;
                rv3.b outputData3 = (rv3.b) domain;
                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                if (outputData3 instanceof b.a) {
                    c84.t.J2(cVar, false, null, null, 7);
                } else if (outputData3 instanceof rv3.c) {
                    int i22 = qh4.f.f246457a[((rv3.c) outputData3).f257692a.ordinal()];
                    if (i22 == 1) {
                        oki.h.t2(cVar, lVar2, RolleeFlowContract$Step.Login.f68328a, true, null, false, 12);
                    } else if (i22 == 2) {
                        cVar.l2(new qh4.g(cVar, (Continuation) r132, i3), new yi5.b(26));
                    } else {
                        if (i22 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        cVar.K2(null);
                    }
                } else {
                    if (!(outputData3 instanceof b.C1428b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zhm.h0 h0Var3 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "RolleeFlowModel", "Unsupported requirements link output", null, h0Var3);
                }
                return Unit.f186387a;
            case 12:
                RolleeScreen rolleeScreen = (RolleeScreen) obj2;
                String str4 = (String) obj3;
                cz3.a analyticsPayload = (cz3.a) domain;
                KProperty[] kPropertyArr = RolleeScreen.T;
                Intrinsics.checkNotNullParameter(analyticsPayload, "analyticsPayload");
                String screen = analyticsPayload.getIb.b.Screen java.lang.String();
                if (screen == null) {
                    screen = "default";
                }
                rolleeScreen.g3(screen, analyticsPayload.getStatus(), str4, analyticsPayload.getDatasourceId(), analyticsPayload.getOtpStatus());
                return Unit.f186387a;
            case 13:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.select_family_plan.a aVar7 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.select_family_plan.a) obj2;
                String str5 = (String) obj3;
                phk.j result2 = (phk.j) domain;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar7.C2(new qik.c(str5, result2.f236326a));
                return Unit.f186387a;
            case 14:
                Function0 it10 = (Function0) domain;
                Intrinsics.checkNotNullParameter(it10, "it");
                return ((qje.v) obj3).a((TabCryptoFlowContract$FlowState) obj2);
            case 15:
                qjk.t tVar = (qjk.t) obj2;
                List plans = (List) domain;
                Intrinsics.checkNotNullParameter(plans, "plans");
                hha.d dVarB = hha.s.b(plans, (w0) obj3);
                if (dVarB == null) {
                    od0.i.Companion.getClass();
                    return new go.g(new Data(od0.i.f224256b, null, false, 6, null), 2);
                }
                vf5.d dVar2 = tVar.e;
                String planId = dVarB.f152287a;
                Intrinsics.checkNotNullParameter(planId, "planId");
                w4l.h loadingStrategy = w4l.h.f294642c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                ffk.t tVar2 = dVar2.f288508a;
                return boh.f.e(rd0.e.b(kli.a.h(tVar2.q(), tVar2.r(planId))), new vf5.a(dVar2, loadingStrategy, i2));
            case 16:
                String str6 = (String) obj3;
                List it11 = (List) domain;
                Intrinsics.checkNotNullParameter(it11, "it");
                ((qjk.t) obj2).getClass();
                Iterator it12 = it11.iterator();
                while (true) {
                    if (it12.hasNext()) {
                        Object next3 = it12.next();
                        Iterator it13 = ((ggc.g0) next3).e.iterator();
                        while (true) {
                            if (it13.hasNext()) {
                                next2 = it13.next();
                                if (Intrinsics.f(((ggc.h0) next2).f143631a, str6)) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        if (next2 != null) {
                            r132 = next3;
                        }
                    }
                }
                return (ggc.g0) r132;
            case 17:
                com.revolut.feature.crypto.remittance.impl.ui.currency_picker.flow.a aVar8 = (com.revolut.feature.crypto.remittance.impl.ui.currency_picker.flow.a) obj3;
                vj5.g output2 = (vj5.g) domain;
                Intrinsics.checkNotNullParameter(output2, "output");
                CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint entrypoint = ((CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData) obj2).d;
                if (output2 instanceof vj5.e) {
                    xi0.a aVar9 = xi0.b.Companion;
                    String str7 = ((vj5.e) output2).f289653a;
                    aVar9.getClass();
                    xi0.b bVarA = xi0.a.a(str7);
                    if (entrypoint instanceof CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint.Deposit) {
                        aVar8.C1(new CryptoDepositDestination(new CryptoDepositInput.Overview(bVarA, (com.revolut.retail.feature.crypto_deposits.api.navigation.a) null, true, (hbj.b) null, (wk5.a) null, 42)));
                    } else if (entrypoint instanceof CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint.OrdersWidget) {
                        aVar8.I2(bVarA, ExchangeFeatureConfigFinishBehavior.Finish.f96861a);
                    } else {
                        boolean z = entrypoint instanceof CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint.RecurringStrategy;
                        ExchangeFeatureConfigFinishBehavior.Default r87 = ExchangeFeatureConfigFinishBehavior.Default.f96860a;
                        if (z) {
                            aVar8.I2(bVarA, r87);
                        } else {
                            if (!(entrypoint instanceof CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint.TakeProfitStopLossBuy)) {
                                throw new IllegalStateException(a0.d.s("SelectedCurrency(currency=", str7, ") result is not allowed for entrypointType=", entrypoint.getClass().getSimpleName()));
                            }
                            aVar8.C1(new BridgeDestination(new CompositeCommand(new FinishCommand(null, null, null, 7), ((jte.d) aVar8.o).c(MoveMoneyFeatureApi$Toggles.MoveMoneyExchangeEntryPointsMoved.f97187c) ? u0.f(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveMoney(new StartUpPocket.CurrencyAccount(bVarA), com.revolut.shared.feature.move_money.api.navigation.a.TARGET, 4), (Set) null, 6), null)) : gc0.c.f(new ExchangeFeatureConfig.Buy(null, bVarA, wd6.h.MARKET, wd6.c.CRYPTO_ONLY, r87, null, false, null, 3041)))));
                        }
                    }
                } else if (output2 instanceof vj5.f) {
                    vj5.f fVar = (vj5.f) output2;
                    aVar8.C2(new vj5.b(fVar.f289654a, fVar.f289655b));
                } else if (entrypoint instanceof CryptoRemittanceKompotFeatureConfig.CurrencyPicker.Entrypoint.DepositWidget) {
                    aVar8.C2(a.C1600a.f289646a);
                } else {
                    aVar8.C1(new BridgeDestination(new FinishCommand(null, null, null, 7)));
                }
                return Unit.f186387a;
            case 18:
                com.revolut.feature.junior_remote_login.impl.ui.flow.invite_creation.a aVar10 = (com.revolut.feature.junior_remote_login.impl.ui.flow.invite_creation.a) obj3;
                yki.l lVar3 = (yki.l) obj2;
                cm8.g result3 = (cm8.g) domain;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (result3 instanceof cm8.d) {
                    oki.h.t2(aVar10, lVar3, new JuniorInviteCreationFlowContract$Step.CreatePhoneNumber(aVar10.o.f77186a), true, null, false, 12);
                } else if (Intrinsics.f(result3, cm8.f.f25162a)) {
                    oki.h.t2(aVar10, lVar3, JuniorInviteCreationFlowContract$Step.QrCodeScanner.f77190a, true, null, false, 12);
                } else {
                    if (!Intrinsics.f(result3, cm8.e.f25161a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(aVar10.f77191p);
                }
                return Unit.f186387a;
            case 19:
                Identifier.Phone phone = (Identifier.Phone) obj2;
                qll.q update4 = (qll.q) domain;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return qll.q.a(update4, new qll.o(((tll.d) ((com.revolut.sso.impl.ui.combined_authentication.unified.a) obj3).v).a(phone)), phone, null, null, 28);
            case 20:
                Throwable throwable = (Throwable) domain;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return ((um.c) ((gpk.c) obj3).f145464b).c0(new um.a(mm.e.f207100a, throwable)).f(efm.d0.m(new Pair(Boolean.TRUE, obj2)));
            case 21:
                com.revolut.feature.backgroundpicker.impl.flow.a aVar11 = (com.revolut.feature.backgroundpicker.impl.flow.a) obj3;
                yki.l lVar4 = (yki.l) obj2;
                rm2.n output3 = (rm2.n) domain;
                Intrinsics.checkNotNullParameter(output3, "output");
                if (output3 instanceof rm2.k) {
                    em2.e eVar = ((rm2.k) output3).f255192a;
                    aVar11.l2(new qg7.p(aVar11.o.f63739a, aVar11, eVar.a(), fm2.a.a(eVar), (Continuation) null, 3), new yi5.b(26));
                } else {
                    int i32 = 26;
                    if (output3 instanceof rm2.l) {
                        oki.h.D2(lVar4);
                        aVar11.l2(new qm2.d(aVar11, r132, i2), new yi5.b(i32));
                    } else {
                        if (!(output3 instanceof rm2.m)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar11.f2(new UploadBackgroundController(new zm2.e(((rm2.m) output3).f255194a)), ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a, new qgf.o(aVar11, 13));
                    }
                }
                return Unit.f186387a;
            case 22:
                vp7.j outputData4 = (vp7.j) domain;
                Intrinsics.checkNotNullParameter(outputData4, "outputData");
                ((com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims.b) obj3).G2(new qm7.b(new Survey.Claims((Answer.ClaimsState) obj2, outputData4.f291117a)));
                return Unit.f186387a;
            case 23:
                com.revolut.feature.profile.impl.ui.details.address.flow.c cVar2 = (com.revolut.feature.profile.impl.ui.details.address.flow.c) obj3;
                AddressFlowContract$OutputData output4 = (AddressFlowContract$OutputData) domain;
                Intrinsics.checkNotNullParameter(output4, "output");
                cVar2.l2(new com.revolut.feature.profile.impl.ui.details.address.flow.a(output4, (ProfileAddressFlowContract$Step.AddressStep) obj2, cVar2, null), new yi5.b(26));
                return Unit.f186387a;
            case 24:
                alc.n nVar = (alc.n) obj2;
                Pair pair2 = (Pair) domain;
                od0.i iVar2 = (od0.i) pair2.f186385a;
                od0.i iVar3 = (od0.i) pair2.f186386b;
                Template template = (Template) iVar2.f224257a;
                Template template2 = (Template) iVar3.f224257a;
                ((qmc.h) obj3).getClass();
                return new RoboPortfolioInfo(template, template2, nVar.f6207a, nVar.f6209c, nVar.d, nVar.i, nVar.f6208b, ofm.q.n(nVar), nVar.k);
            case 25:
                LocalDate localDate = (LocalDate) obj2;
                List it14 = (List) domain;
                Intrinsics.checkNotNullParameter(it14, "it");
                Intrinsics.h(localDate);
                ((qmd.g) obj3).getClass();
                List list3 = it14;
                ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                for (Object obj4 : list3) {
                    int i33 = i3 + 1;
                    if (i3 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    arrayList.add(new Pair(localDate.plusDays(i33), Long.valueOf(-((Number) obj4).longValue())));
                    i3 = i33;
                }
                return zhm.r0.t(arrayList);
            case 26:
                dj0.d money = (dj0.d) domain;
                Intrinsics.checkNotNullParameter(money, "convertedMoney");
                ((qoc.r) obj3).C.getClass();
                Intrinsics.checkNotNullParameter(money, "money");
                return new PortfolioGoal(dj0.d.c(money, g4i.a.s(money.f115082a, cp5.d.k(money.f115083b)), null, 2), ((PortfolioGoal) obj2).f95700b);
            case 27:
                qoc.r rVar = (qoc.r) obj2;
                uoc.d it15 = (uoc.d) domain;
                Intrinsics.checkNotNullParameter(it15, "it");
                int i43 = qoc.n.f248129a[((qoc.c0) obj3).f248101a.ordinal()];
                if (i43 == 1) {
                    rVarA = jlc.r.a((jlc.r) rVar.b3(), null, null, null, it15.f281606a, null, null, null, null, null, null, null, null, null, null, 32759);
                } else {
                    if (i43 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rVarA = jlc.r.a((jlc.r) rVar.b3(), null, null, null, null, it15.f281606a, null, null, null, null, null, null, null, null, null, 32751);
                }
                rVar.d3(new fnc.z(rVarA, 4));
                rVar.j3(rVarA);
                return Unit.f186387a;
            case 28:
                Integer num = (Integer) obj3;
                qoc.r rVar2 = (qoc.r) obj2;
                jlc.r updateState = (jlc.r) domain;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                if (num != null) {
                    int iIntValue = num.intValue();
                    rVar2.f248134m.getClass();
                    int iC = rim.d.c(iIntValue / 12.0f) * 12;
                    flc.a aVar12 = (flc.a) updateState.k.get(Integer.valueOf(iC));
                    if (aVar12 != null) {
                        soc.b bVar = rVar2.f248135n;
                        boolean z3 = updateState.f175697a instanceof jlc.l;
                        bVar.getClass();
                        mjVarA = soc.b.a(aVar12, iC, z3);
                    }
                }
                return jlc.r.a(updateState, null, null, null, null, null, null, null, null, null, null, null, mjVarA, null, null, 28671);
            default:
                Pair pair3 = (Pair) domain;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                Boolean bool = (Boolean) pair3.f186385a;
                od0.i iVar4 = (od0.i) pair3.f186386b;
                m6 m6Var = n6.Companion;
                ((tp5.b) ((qp5.c0) obj3).f248260l).getClass();
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.crypto.withdraw.impl.R$string.crypto_withdrawals_screen_review_withdrawal_button_send_title, null, null, 14);
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                Intrinsics.h(bool);
                aw0.e model = new aw0.e(true, null, null, m6.c(m6Var, textLocalisedClause2, defaultFilledButton, null, null, bool.booleanValue(), null, (k3) iVar4.f224257a, null, 860), null, null, 54);
                CryptoWithdrawToAddressConfirmationActivity cryptoWithdrawToAddressConfirmationActivity = (CryptoWithdrawToAddressConfirmationActivity) ((qp5.i) obj2);
                cryptoWithdrawToAddressConfirmationActivity.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                j90.a aVar13 = cryptoWithdrawToAddressConfirmationActivity.u0;
                KProperty[] kPropertyArr2 = CryptoWithdrawToAddressConfirmationActivity.I0;
                ((ActionFooterView) aVar13.getValue(cryptoWithdrawToAddressConfirmationActivity, kPropertyArr2[0])).setModel(model);
                ((ActionFooterView) aVar13.getValue(cryptoWithdrawToAddressConfirmationActivity, kPropertyArr2[0])).setVisibility(0);
                return Unit.f186387a;
        }
    }

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f244712a = i;
        this.f244713b = obj2;
        this.f244714c = obj3;
    }
}
