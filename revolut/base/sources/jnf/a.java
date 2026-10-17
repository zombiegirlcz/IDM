package jnf;

import android.content.Context;
import android.os.Environment;
import androidx.compose.foundation.lazy.layout.LazySaveableStateHolderKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.recyclerview.widget.RecyclerView;
import b9.w2;
import c10.g;
import c10.h;
import com.revolut.camerakit.vision_framework.generated.FaceExtractorWrapper;
import com.revolut.chat.ui.messageslist.MessagesScreen;
import com.revolut.feature.apm.bizum.impl.ui.transfer.amount.BizumTransferAmountContract$InputData;
import com.revolut.feature.apm.bizum.impl.ui.transfer.amount.BizumTransferAmountScreen;
import com.revolut.feature.credit.card.impl.ui.direct_debit_selection.CreditCardDirectDebitFlowContract$InputData;
import com.revolut.feature.credit.card.impl.ui.direct_debit_selection.CreditCardDirectDebitRootFlow;
import com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.CreditCardEditPostPurchaseInstalmentTermScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.CreditCardEditPostPurchaseInstalmentTermScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.onboarding.business_description.FreelancerBusinessDescriptionScreen;
import com.revolut.feature.freelancer.impl.ui.onboarding.business_description.FreelancerBusinessDescriptionScreenContract$InputData;
import com.revolut.feature.kyc.impl.trustdock.icchip.screen.TrustdockIcChipScreen;
import com.revolut.feature.kyc.impl.trustdock.icchip.screen.TrustdockIcChipScreenContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_new.flow.bills_selection.PaymentsGroupsBillsSelectionFlow;
import com.revolut.feature.payments.groups.impl.ui_new.flow.bills_selection.PaymentsGroupsBillsSelectionFlowContract$InputData;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.new_transfer.NewTransferScreen;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.new_transfer.NewTransferScreenContract$InputData;
import com.revolut.feature.raffle.impl.screen.raffle.RaffleScreen;
import com.revolut.feature.raffle.impl.screen.raffle.RaffleScreenContract$InputData;
import com.revolut.feature.security_hub.impl.ui.security_hub.SecurityHubScreen;
import com.revolut.feature.security_hub.impl.ui.security_hub.SecurityHubScreenContract$InputData;
import com.revolut.feature.security_hub.impl.ui.transactions_limits_change.TransactionsLimitsChangeScreen;
import com.revolut.feature.security_hub.impl.ui.transactions_limits_change.TransactionsLimitsChangeScreenContract$InputData;
import com.revolut.feature.shared.help_centre.impl.faq.screens.list.FaqListScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.list.FaqListScreenContract$InputData;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.transfer.IncomeSorterTransferDestinationsFlow;
import com.revolut.feature.stock_lending.impl.ui.screens.transaction.StockLendingTransactionDetailsScreen;
import com.revolut.feature.stock_lending.impl.ui.screens.transaction.StockLendingTransactionDetailsScreenContract$InputData;
import com.revolut.feature.transactions.impl.ui.pending.revert.PendingTransactionRevertController;
import com.revolut.feature.transactions.impl.ui.pending.revert.PendingTransactionRevertControllerContract$InputData;
import com.revolut.feature.transport.impl.ui.hub.transit.TransportHubTransitScreen;
import com.revolut.feature.transport.impl.ui.hub.transit.TransportHubTransitScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.flow.tabs.TravelExperiencesTabsFlow;
import com.revolut.feature.travel.experiences.impl.ui.flow.tabs.TravelExperiencesTabsFlowContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.search.TravelExperiencesSearchScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.search.TravelExperiencesSearchScreenContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.screen.manage_booking.TravelFlightsManageBookingScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.manage_booking.TravelFlightsManageBookingScreenContract$InputData;
import com.revolut.feature.workflow.engine.rfi.impl.ui.base.BaseQuestionScreenContract$InputData;
import com.revolut.feature.workflow.engine.rfi.impl.ui.choice.ChoiceQuestionScreen;
import com.revolut.feature_cards_kompot_flows_api.navigation.CardDetailsFlowDestination;
import com.revolut.feature_cards_kompot_flows_impl.flow.CardDetailsFlow;
import com.revolut.feature_crypto_order_flow.impl.order_summary.OrderSummaryScreen;
import com.revolut.feature_crypto_order_flow.impl.order_summary.OrderSummaryScreenContract$InputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount.RemittanceAmountScreen;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount.RemittanceAmountScreenContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.sentiment.IndexMarketSentimentController;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.sentiment.IndexMarketSentimentControllerContract$InputData;
import fmf.o0;
import ip0.vj0;
import java.io.File;
import java.time.LocalDateTime;
import java.util.List;
import jm4.a3;
import jm4.a4;
import jm4.t1;
import jm4.y0;
import jsl.d0;
import jsl.p;
import jsl.u0;
import k50.j4;
import k50.x0;
import k50.z0;
import koi.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kr9.i;
import kr9.l;
import ms1.r;
import ms1.t;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import p2k.y;
import p2k.z;
import ppd.l0;
import ppd.n;
import prk.g0;
import prk.w;
import prk.x;
import s3a.k;
import u09.q;
import us6.s;
import vtc.a0;
import vtc.u;
import vtc.v;
import z0g.j0;
import zu8.h0;
import zu8.i0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f176730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f176731c;

    public /* synthetic */ a(Context context, jx.e eVar, fx.a aVar) {
        this.f176729a = 14;
        this.f176730b = context;
        this.f176731c = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws InterruptedException {
        b60.a aVar;
        List<j> listB;
        int i = this.f176729a;
        int i2 = 0;
        Object obj2 = this.f176731c;
        Object obj3 = this.f176730b;
        switch (i) {
            case 0:
                PendingTransactionRevertControllerContract$InputData pendingTransactionRevertControllerContract$InputData = (PendingTransactionRevertControllerContract$InputData) obj2;
                phm.a aVar2 = (phm.a) ue0.e.j(((PendingTransactionRevertController) obj3).m2()).a().get(gnf.a.class);
                aVar = aVar2 != null ? (b60.a) aVar2.get() : null;
                if (aVar != null) {
                    return new gnf.d(((gnf.a) aVar.b()).f, pendingTransactionRevertControllerContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", gnf.a.class, " is not found"));
            case 1:
                jqd.d dVar = (jqd.d) obj2;
                phm.a aVar3 = (phm.a) ue0.e.j(((IncomeSorterTransferDestinationsFlow) obj3).m2()).a().get(n.class);
                aVar = aVar3 != null ? (b60.a) aVar3.get() : null;
                if (aVar != null) {
                    return new l0(((n) aVar.b()).L0, dVar);
                }
                throw new IllegalStateException(a0.d.q("Api ", n.class, " is not found"));
            case 2:
                CreditCardDirectDebitFlowContract$InputData creditCardDirectDebitFlowContract$InputData = (CreditCardDirectDebitFlowContract$InputData) obj2;
                phm.a aVar4 = (phm.a) ue0.e.j(((CreditCardDirectDebitRootFlow) obj3).m2()).a().get(a3.class);
                aVar = aVar4 != null ? (b60.a) aVar4.get() : null;
                if (aVar != null) {
                    return new a4(((a3) aVar.b()).Y, creditCardDirectDebitFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
            case 3:
                KProperty[] kPropertyArr = CreditCardEditPostPurchaseInstalmentTermScreen.U;
                qji.b bVarU2 = ((CreditCardEditPostPurchaseInstalmentTermScreen) obj3).U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.post_purchase.update.term.di.CreditCardEditPostPurchaseInstalmentTermScreenInjector");
                t1 t1Var = (t1) bVarU2;
                return new y0(t1Var.f176363b, t1Var.f176364c, (CreditCardEditPostPurchaseInstalmentTermScreenContract$InputData) obj2);
            case 4:
                return mra.d.b((u0) obj3, new p(0), (d0) obj2, null, false, 12);
            case 5:
                BizumTransferAmountScreen bizumTransferAmountScreen = (BizumTransferAmountScreen) obj3;
                BizumTransferAmountContract$InputData bizumTransferAmountContract$InputData = (BizumTransferAmountContract$InputData) obj2;
                KProperty[] kPropertyArr2 = BizumTransferAmountScreen.l0;
                qji.b bVarQ2 = bizumTransferAmountScreen.Q2();
                Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.apm.bizum.impl.ui.transfer.amount.di.BizumTransferAmountScreenInjector");
                t tVar = (t) bVarQ2;
                ms1.j jVar = tVar.f208589b;
                t tVar2 = tVar.f208590c;
                bizumTransferAmountContract$InputData.getClass();
                return new r(jVar, tVar2, bizumTransferAmountScreen, bizumTransferAmountContract$InputData);
            case 6:
                PaymentsGroupsBillsSelectionFlowContract$InputData paymentsGroupsBillsSelectionFlowContract$InputData = (PaymentsGroupsBillsSelectionFlowContract$InputData) obj2;
                phm.a aVar5 = (phm.a) ue0.e.j(((PaymentsGroupsBillsSelectionFlow) obj3).m2()).a().get(l.class);
                aVar = aVar5 != null ? (b60.a) aVar5.get() : null;
                if (aVar != null) {
                    return new i(((l) aVar.b()).F, paymentsGroupsBillsSelectionFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", l.class, " is not found"));
            case 7:
                RaffleScreen raffleScreen = (RaffleScreen) obj3;
                KProperty[] kPropertyArr3 = RaffleScreen.S;
                qji.b bVarU22 = raffleScreen.U2();
                Intrinsics.i(bVarU22, "null cannot be cast to non-null type com.revolut.feature.raffle.impl.screen.raffle.di.RaffleScreenInjector");
                fta.c cVar = (fta.c) bVarU22;
                return new fta.d(cVar.f137989b, cVar.f137990c, raffleScreen, (RaffleScreenContract$InputData) obj2);
            case 8:
                int i3 = ChoiceQuestionScreen.U;
                qji.b bVarU23 = ((ChoiceQuestionScreen) obj3).U2();
                Intrinsics.i(bVarU23, "null cannot be cast to non-null type com.revolut.feature.workflow.engine.rfi.impl.ui.choice.di.ChoiceQuestionScreenInjector");
                euh.e eVar = (euh.e) bVarU23;
                return new euh.b(eVar.f129583b, eVar.f129584c, (BaseQuestionScreenContract$InputData) obj2);
            case 9:
                IndexMarketSentimentController indexMarketSentimentController = (IndexMarketSentimentController) obj3;
                KProperty[] kPropertyArr4 = IndexMarketSentimentController.S;
                qji.b bVarR1 = indexMarketSentimentController.z2().R1();
                Intrinsics.i(bVarR1, "null cannot be cast to non-null type com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.screens.sentiment.di.IndexMarketSentimentControllerInjector");
                x xVar = (x) bVarR1;
                g0 g0Var = xVar.f239310b;
                x xVar2 = xVar.f239311c;
                avk.j jVar2 = indexMarketSentimentController.R;
                jVar2.getClass();
                return new w(g0Var, xVar2, (IndexMarketSentimentControllerContract$InputData) obj2, jVar2);
            case 10:
                SecurityHubScreen securityHubScreen = (SecurityHubScreen) obj3;
                KProperty[] kPropertyArr5 = SecurityHubScreen.U;
                qji.b bVarU24 = securityHubScreen.U2();
                Intrinsics.i(bVarU24, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.security_hub.di.SecurityHubScreenInjector");
                u uVar = (u) bVarU24;
                vtc.t tVar3 = uVar.f292082b;
                u uVar2 = uVar.f292083c;
                o0 o0Var = securityHubScreen.Q;
                o0Var.getClass();
                return new v(tVar3, uVar2, securityHubScreen, (SecurityHubScreenContract$InputData) obj2, o0Var);
            case 11:
                KProperty[] kPropertyArr6 = TransactionsLimitsChangeScreen.W;
                qji.b bVarU25 = ((TransactionsLimitsChangeScreen) obj3).U2();
                Intrinsics.i(bVarU25, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.transactions_limits_change.di.TransactionsLimitsChangeInjector");
                u uVar3 = (u) bVarU25;
                return new a0(uVar3.f292082b, uVar3.f292083c, (TransactionsLimitsChangeScreenContract$InputData) obj2);
            case 12:
                KProperty[] kPropertyArr7 = TransportHubTransitScreen.f92543e0;
                qji.b bVarQ22 = ((TransportHubTransitScreen) obj3).Q2();
                Intrinsics.i(bVarQ22, "null cannot be cast to non-null type com.revolut.feature.transport.impl.ui.hub.transit.di.TransportHubTransitScreenInjector");
                hvf.r rVar = (hvf.r) bVarQ22;
                return new hvf.t(rVar.f155951b, rVar.f155952c, (TransportHubTransitScreenContract$InputData) obj2);
            case 13:
                CardDetailsFlowDestination.InputData inputData = (CardDetailsFlowDestination.InputData) obj2;
                phm.a aVar6 = (phm.a) ue0.e.j(((CardDetailsFlow) obj3).m2()).a().get(fwh.a.class);
                aVar = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar == null) {
                    throw new IllegalStateException(a0.d.q("Api ", fwh.a.class, " is not found"));
                }
                iwh.c cVar2 = ((iwh.c) aVar.b()).f;
                inputData.getClass();
                return new iwh.e(cVar2, inputData);
            case 14:
                File externalFilesDir = ((Context) obj3).getExternalFilesDir(Environment.DIRECTORY_PICTURES);
                String str = LocalDateTime.now().format(((fx.a) obj2).f138710a);
                File file = new File(externalFilesDir, t61.a.p(str, "format(...)", "default_", str));
                file.mkdirs();
                return file;
            case 15:
                w2 w2Var = (w2) obj3;
                zw.e eVar2 = (zw.e) w2Var.f13501g;
                cx.a aVar7 = (cx.a) ((cx.c) obj2);
                String str2 = aVar7.f109871a;
                String str3 = aVar7.f109872b;
                File fileA = eVar2.a(str2, str3);
                if (fileA == null) {
                    return null;
                }
                ti0.a aVar8 = (ti0.a) ((d4m.a) w2Var.f13500c).get();
                String modelPath = fileA.getPath();
                Intrinsics.checkNotNullExpressionValue(modelPath, "getPath(...)");
                q3m.a model = new q3m.a(modelPath, str3);
                aVar8.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                i4b.f fVar = aVar8.f271394a;
                Intrinsics.checkNotNullParameter(modelPath, "modelPath");
                ((h) ((g) fVar.f158330b)).a();
                FaceExtractorWrapper faceExtractorWrapperCreateFromFile = FaceExtractorWrapper.createFromFile(modelPath);
                Intrinsics.checkNotNullExpressionValue(faceExtractorWrapperCreateFromFile, "createFromFile(...)");
                return new ti0.c(new c10.d(faceExtractorWrapperCreateFromFile), model);
            case 16:
                qji.b bVarU26 = ((TrustdockIcChipScreen) obj3).U2();
                Intrinsics.i(bVarU26, "null cannot be cast to non-null type com.revolut.feature.kyc.impl.trustdock.icchip.screen.di.TrustdockIcChipScreenInjector");
                i0 i0Var = (i0) bVarU26;
                return new h0(i0Var.f325295b, i0Var.f325296c, (TrustdockIcChipScreenContract$InputData) obj2);
            case 17:
                KProperty[] kPropertyArr8 = FreelancerBusinessDescriptionScreen.Q;
                qji.b bVarU27 = ((FreelancerBusinessDescriptionScreen) obj3).U2();
                Intrinsics.i(bVarU27, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.onboarding.business_description.di.FreelancerBusinessDescriptionScreenInjector");
                us6.d0 d0Var = (us6.d0) bVarU27;
                return new s(d0Var.f282487c, d0Var.d, (FreelancerBusinessDescriptionScreenContract$InputData) obj2);
            case 18:
                OrderSummaryScreen orderSummaryScreen = (OrderSummaryScreen) obj3;
                OrderSummaryScreenContract$InputData orderSummaryScreenContract$InputData = (OrderSummaryScreenContract$InputData) obj2;
                KProperty[] kPropertyArr9 = OrderSummaryScreen.f96774a0;
                qji.b bVarU28 = orderSummaryScreen.U2();
                Intrinsics.i(bVarU28, "null cannot be cast to non-null type com.revolut.feature_crypto_order_flow.impl.order_summary.di.OrderSummaryScreenInjector");
                tyh.c cVar3 = (tyh.c) bVarU28;
                tyh.b bVar = cVar3.f275604b;
                tyh.c cVar4 = cVar3.f275605c;
                orderSummaryScreenContract$InputData.getClass();
                return new tyh.g(bVar, cVar4, orderSummaryScreen, orderSummaryScreenContract$InputData, orderSummaryScreen, orderSummaryScreen, orderSummaryScreen);
            case 19:
                ((k09.g) obj3).f179994m.K1(u09.v.CRYPTO, (q) obj2);
                return Unit.f186387a;
            case 20:
                ((k09.g) obj3).A2(((dz8.b) obj2).f121291a);
                return Unit.f186387a;
            case 21:
                return LazySaveableStateHolderKt.LazySaveableStateHolderProvider$lambda$0$0((SaveableStateRegistry) obj3, (SaveableStateHolder) obj2);
            case 22:
                StockLendingTransactionDetailsScreenContract$InputData stockLendingTransactionDetailsScreenContract$InputData = (StockLendingTransactionDetailsScreenContract$InputData) obj2;
                KProperty[] kPropertyArr10 = StockLendingTransactionDetailsScreen.c0;
                phm.a aVar9 = (phm.a) ue0.e.j(((StockLendingTransactionDetailsScreen) obj3).m2()).a().get(u0e.a.class);
                aVar = aVar9 != null ? (b60.a) aVar9.get() : null;
                if (aVar != null) {
                    return new a1e.g(((a1e.b) aVar.b()).f595l, stockLendingTransactionDetailsScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", u0e.a.class, " is not found"));
            case 23:
                TravelExperiencesTabsFlowContract$InputData travelExperiencesTabsFlowContract$InputData = (TravelExperiencesTabsFlowContract$InputData) obj2;
                KProperty[] kPropertyArr11 = TravelExperiencesTabsFlow.Q;
                phm.a aVar10 = (phm.a) ue0.e.j(((TravelExperiencesTabsFlow) obj3).m2()).a().get(z0g.b.class);
                aVar = aVar10 != null ? (b60.a) aVar10.get() : null;
                if (aVar != null) {
                    return new z0g.q(((z0g.b) aVar.b()).B, travelExperiencesTabsFlowContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", z0g.b.class, " is not found"));
            case 24:
                TravelExperiencesSearchScreen travelExperiencesSearchScreen = (TravelExperiencesSearchScreen) obj3;
                TravelExperiencesSearchScreenContract$InputData travelExperiencesSearchScreenContract$InputData = (TravelExperiencesSearchScreenContract$InputData) obj2;
                KProperty[] kPropertyArr12 = TravelExperiencesSearchScreen.f93130h0;
                qji.b bVarQ23 = travelExperiencesSearchScreen.Q2();
                Intrinsics.i(bVarQ23, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.impl.ui.screen.search.di.TravelExperiencesSearchScreenInjector");
                j0 j0VarD = ((l3g.a) bVarQ23).D();
                switch (j0VarD.f318388a) {
                    case 0:
                        j0VarD.d = travelExperiencesSearchScreenContract$InputData;
                        break;
                    default:
                        j0VarD.d = travelExperiencesSearchScreenContract$InputData;
                        break;
                }
                return (z0g.l0) ((j0) j0VarD.S(travelExperiencesSearchScreen)).mo3800build();
            case 25:
                RemittanceAmountScreen remittanceAmountScreen = (RemittanceAmountScreen) obj3;
                RemittanceAmountScreenContract$InputData remittanceAmountScreenContract$InputData = (RemittanceAmountScreenContract$InputData) obj2;
                KProperty[] kPropertyArr13 = RemittanceAmountScreen.p0;
                qji.b bVarQ24 = remittanceAmountScreen.Q2();
                Intrinsics.i(bVarQ24, "null cannot be cast to non-null type com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount.di.RemittanceAmountScreenInjector");
                z zVar = (z) bVarQ24;
                p2k.x xVar3 = zVar.f232536b;
                z zVar2 = zVar.f232537c;
                remittanceAmountScreenContract$InputData.getClass();
                return new y(xVar3, zVar2, remittanceAmountScreen, remittanceAmountScreenContract$InputData);
            case 26:
                NewTransferScreen newTransferScreen = (NewTransferScreen) obj3;
                NewTransferScreenContract$InputData newTransferScreenContract$InputData = (NewTransferScreenContract$InputData) obj2;
                KProperty[] kPropertyArr14 = NewTransferScreen.U;
                phm.a aVar11 = (phm.a) ue0.e.j(newTransferScreen.m2()).a().get(s3a.r.class);
                aVar = aVar11 != null ? (b60.a) aVar11.get() : null;
                if (aVar != null) {
                    return new s3a.c(((k) ((s3a.r) aVar.b())).g0, newTransferScreen, newTransferScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", s3a.r.class, " is not found"));
            case 27:
                MessagesScreen messagesScreen = (MessagesScreen) obj3;
                z0 z0Var = (z0) obj2;
                MessagesScreen.Companion aVar12 = MessagesScreen.INSTANCE;
                RecyclerView.Adapter adapter = messagesScreen.f3().f1528l.getAdapter();
                koi.h hVar = adapter instanceof koi.h ? (koi.h) adapter : null;
                if (hVar == null || (listB = hVar.b()) == null) {
                    i2 = -1;
                } else {
                    for (j jVar3 : listB) {
                        if (jVar3 instanceof vj0) {
                            Object obj4 = ((vj0) jVar3).e;
                            Instant instant = obj4 instanceof Instant ? (Instant) obj4 : null;
                            if (instant == null) {
                                continue;
                            } else {
                                Instant instant2 = ((x0) z0Var).f181280a;
                                Object value = ((j4) messagesScreen.R2()).f181142x0.getValue();
                                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                                if (!jli.b.c(instant, instant2, (DateTimeZone) value)) {
                                }
                            }
                        }
                        i2++;
                    }
                    i2 = -1;
                }
                return Integer.valueOf(i2);
            case 28:
                TravelFlightsManageBookingScreenContract$InputData travelFlightsManageBookingScreenContract$InputData = (TravelFlightsManageBookingScreenContract$InputData) obj2;
                phm.a aVar13 = (phm.a) ue0.e.j(((TravelFlightsManageBookingScreen) obj3).m2()).a().get(f4g.b.class);
                aVar = aVar13 != null ? (b60.a) aVar13.get() : null;
                if (aVar != null) {
                    return new f4g.u(((f4g.b) aVar.b()).o, travelFlightsManageBookingScreenContract$InputData);
                }
                throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
            default:
                KProperty[] kPropertyArr15 = FaqListScreen.g0;
                qji.b bVarQ25 = ((FaqListScreen) obj3).Q2();
                Intrinsics.i(bVarQ25, "null cannot be cast to non-null type com.revolut.feature.shared.help_centre.impl.faq.screens.list.di.FaqListScreenInjector");
                r7d.t tVar4 = (r7d.t) ((v7d.a) bVarQ25);
                return new r7d.i(tVar4.f252174b, tVar4.f252175c, (FaqListScreenContract$InputData) obj2);
        }
    }

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f176729a = i;
        this.f176730b = obj2;
        this.f176731c = obj3;
    }
}
