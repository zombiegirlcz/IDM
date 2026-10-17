package ft;

import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.biometric_verification.impl.ui.step.document.document_picker.BiometricVerificationDocumentSelectionScreen;
import com.revolut.feature.business.referrals.ui.screens.referral_invitee_details.ReferralInviteeDetailsScreen;
import com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.DisposableCardSettingsController;
import com.revolut.feature.credit.card.impl.ui.statement.details.CreditCardStatementDetailsScreen;
import com.revolut.feature.credit.impl.ui.entry_points.CreditEntryPointsController;
import com.revolut.feature.credit.loan.autopay.impl.ui.select_account.details.AccountDetailsController;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.selection.LoanSelectionController;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.details.FreelancerAcquiringOrderDetailsScreen;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.FreelancerAcquiringPaymentListScreen;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.details.OrderInitPageDetailsScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.TaxHubScreen;
import com.revolut.feature.payments.groups.impl.ui_new.details_settlement.GroupDetailsSettlementScreen;
import com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.MigrateSubscriptionsController;
import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit;
import com.revolut.feature.security_hub.impl.ui.card_security.CardSecurityController;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreen;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$InputData;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$LimitFlowType;
import com.revolut.feature.select.payment.impl.ui.select_card.SelectPaymentScreen;
import com.revolut.feature.structured_note.details.impl.ui.screens.about_note.AboutNoteScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.itinerary_preview.TravelFlightsItineraryPreviewScreen;
import com.revolut.feature.wealth.assetdetails.ui.impl.high_risk.InstrumentHighRiskWarningController;
import com.revolut.feature.workflow.chat.impl.ui.flow.screen.initial.WorkflowChatScreen;
import com.revolut.feature_crypto_order_details.impl.ui.details.CryptoOrderDetailsController;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.recommendation_history_screen.RecommendationHistoryScreen;
import com.revolut.retail.feature.travel_status.impl.ui.screens.overview.TravelStatusOverviewScreen;
import ft4.w;
import fzd.r;
import fzd.u;
import g27.t;
import g4k.f0;
import g4k.i0;
import ip0.dt;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import rp0.p;
import vkm.j2;
import vkm.q;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes17.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d((BiometricVerificationDocumentSelectionScreen) this.v, continuation, 0);
            case 1:
                return new d((ReferralInviteeDetailsScreen) this.v, continuation, 1);
            case 2:
                return new d((GroupDetailsSettlementScreen) this.v, continuation, 2);
            case 3:
                return new d((WorkflowChatScreen) this.v, continuation, 3);
            case 4:
                return new d((FreelancerAcquiringOrderDetailsScreen) this.v, continuation, 4);
            case 5:
                return new d((CardSecurityController) this.v, continuation, 5);
            case 6:
                return new d((CreditCardStatementDetailsScreen) this.v, continuation, 6);
            case 7:
                return new d((FreelancerAcquiringPaymentListScreen) this.v, continuation, 7);
            case 8:
                return new d((TransactionsLimitsScreen) this.v, continuation, 8);
            case 9:
                return new d((com.revolut.feature.security_hub.impl.ui.transactions_limits.a) this.v, continuation, 9);
            case 10:
                return new d((RecommendationHistoryScreen) this.v, continuation, 10);
            case 11:
                return new d((SelectPaymentScreen) this.v, continuation, 11);
            case 12:
                return new d((CryptoOrderDetailsController) this.v, continuation, 12);
            case 13:
                return new d((u) this.v, continuation, 13);
            case 14:
                return new d((DisposableCardSettingsController) this.v, continuation, 14);
            case 15:
                return new d((g11.b) this.v, continuation, 15);
            case 16:
                return new d((g1g.a) this.v, continuation, 16);
            case 17:
                return new d((ArrayList) this.v, continuation, 17);
            case 18:
                return new d((OrderInitPageDetailsScreen) this.v, continuation, 18);
            case 19:
                return new d((TravelStatusOverviewScreen) this.v, continuation, 19);
            case 20:
                return new d((CreditEntryPointsController) this.v, continuation, 20);
            case 21:
                return new d((TaxHubScreen) this.v, continuation, 21);
            case 22:
                return new d((AccountDetailsController) this.v, continuation, 22);
            case 23:
                return new d((InstrumentHighRiskWarningController) this.v, continuation, 23);
            case 24:
                return new d((f0) this.v, continuation, 24);
            case 25:
                return new d((AboutNoteScreen) this.v, continuation, 25);
            case 26:
                return new d((LoanSelectionController) this.v, continuation, 26);
            case 27:
                return new d((MigrateSubscriptionsController) this.v, continuation, 27);
            case 28:
                return new d((com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c) this.v, continuation, 28);
            default:
                return new d((TravelFlightsItineraryPreviewScreen) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((d) create((dt) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((d) create((p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((d) create((p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v57, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v61, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v69, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v73, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v80, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list;
        OutboundTransactionLimit outboundTransactionLimit;
        int i = this.u;
        Continuation continuation = null;
        int i2 = 0;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((BiometricVerificationDocumentSelectionScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((ReferralInviteeDetailsScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((GroupDetailsSettlementScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((WorkflowChatScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.freelancer.impl.ui.acquiring_order.details.a) ((FreelancerAcquiringOrderDetailsScreen) obj3).R2()).B2();
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((CardSecurityController) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.credit.card.impl.ui.statement.details.a) ((CreditCardStatementDetailsScreen) obj3).e3()).B2();
                return Unit.f186387a;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.b bVar = (com.revolut.feature.freelancer.impl.ui.acquiring_payment.list.b) ((FreelancerAcquiringPaymentListScreen) obj3).R2();
                y yVar = bVar.f73736s;
                if (((fv6.g) ((j2) yVar.f22677a).getValue()).d) {
                    bVar.H2(yVar, new w(28));
                } else {
                    bVar.C2(fv6.h.f138362a);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.security_hub.impl.ui.transactions_limits.a aVar10 = (com.revolut.feature.security_hub.impl.ui.transactions_limits.a) ((TransactionsLimitsScreen) obj3).d();
                fwc.i iVar = (fwc.i) ((fwc.j) ((j2) aVar10.v.f22677a).getValue()).f138606a.getContent();
                if (iVar != null && (list = iVar.f138604a) != null && (outboundTransactionLimit = (OutboundTransactionLimit) d0.d0(list)) != null) {
                    aVar10.J2(outboundTransactionLimit);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.security_hub.impl.ui.transactions_limits.a aVar12 = (com.revolut.feature.security_hub.impl.ui.transactions_limits.a) obj3;
                TransactionsLimitsScreenContract$InputData transactionsLimitsScreenContract$InputData = aVar12.u;
                TransactionsLimitsScreenContract$LimitFlowType transactionsLimitsScreenContract$LimitFlowType = transactionsLimitsScreenContract$InputData.f85734a;
                return yji.l.b1(aVar12, aVar12.f85749r.a(transactionsLimitsScreenContract$LimitFlowType, transactionsLimitsScreenContract$InputData.f85735b), null, new f23.y(aVar12, transactionsLimitsScreenContract$LimitFlowType, continuation, 9), 3);
            case 10:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((fwk.e) ((RecommendationHistoryScreen) obj3).N.getValue()).B2();
                return Unit.f186387a;
            case 11:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((SelectPaymentScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 12:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((fyh.n) ((fyh.g) ((CryptoOrderDetailsController) obj3).L.getValue())).B2();
                return Unit.f186387a;
            case 13:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                u uVar = (u) obj3;
                uVar.n2(new r(uVar, continuation, i2), new whi.b(6));
                return Unit.f186387a;
            case 14:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((DisposableCardSettingsController) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 15:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return wp5.y.t(f11.b.class, ((g11.b) obj3).f139514a, "CHALLENGE_STATUS_STORAGE_KEY");
            case 16:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g1g.a aVar20 = (g1g.a) obj3;
                Stack stack = aVar20.d;
                if (aVar20.e) {
                    aVar20.e = false;
                    return Unit.f186387a;
                }
                stack.pop();
                if (!stack.isEmpty()) {
                    j60.a aVar21 = aVar20.f139592c;
                    Object objPeek = stack.peek();
                    Intrinsics.checkNotNullExpressionValue(objPeek, "peek(...)");
                    aVar21.x((rp0.y) objPeek);
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj4 : (ArrayList) obj3) {
                    LocalDate localDateI = oc.c.I(((rzj.f) obj4).d().e.getMillis());
                    Object objU = linkedHashMap.get(localDateI);
                    if (objU == null) {
                        objU = h30.l.u(linkedHashMap, localDateI);
                    }
                    ((List) objU).add(obj4);
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    arrayList.add(new g1k.e((LocalDate) entry.getKey(), (List) entry.getValue()));
                }
                return d0.P0(arrayList, new g1k.a());
            case 18:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((t) ((OrderInitPageDetailsScreen) obj3).R2()).B2();
                return Unit.f186387a;
            case 19:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((g2l.m) ((TravelStatusOverviewScreen) obj3).R.getValue()).B2();
                return Unit.f186387a;
            case 20:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.credit.impl.ui.entry_points.a) ((g35.f) ((CreditEntryPointsController) obj3).N.getValue())).J2(g35.j.f140197a);
                return Unit.f186387a;
            case 21:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.e) ((TaxHubScreen) obj3).R2()).B2();
                return Unit.f186387a;
            case 22:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((g45.e) ((AccountDetailsController) obj3).O.getValue()).B2();
                return Unit.f186387a;
            case 23:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((g4h.d) ((InstrumentHighRiskWarningController) obj3).N.getValue()).B2();
                return Unit.f186387a;
            case 24:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((i0) ((f0) obj3).d).Z2();
                return Unit.f186387a;
            case 25:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.structured_note.details.impl.ui.screens.about_note.a) ((g5e.e) ((AboutNoteScreen) obj3).P.getValue())).B2();
                return Unit.f186387a;
            case 26:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((LoanSelectionController) obj3).m2().finish();
                return Unit.f186387a;
            case 27:
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c) ((MigrateSubscriptionsController) obj3).R2()).B2();
                return Unit.f186387a;
            case 28:
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c cVar = (com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c) obj3;
                d6a.m mVar = cVar.f80268s;
                return yji.l.a1(cVar, q.Q(t1.e(mVar.f111478b, new d27.d0(25)), new a67.c(12, (Object) null, (Object) mVar, (String) (0 == true ? 1 : 0), (Continuation) (0 == true ? 1 : 0))), null, null, new g06.k(cVar, 0 == true ? 1 : 0, 18), 3);
            default:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((TravelFlightsItineraryPreviewScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
        }
    }
}
