package nn7;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.additional_cards.limit.AdditionalCardsChangeLimitScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.confirmation.CreditCardAnticipationConfirmationScreen;
import com.revolut.feature.credit.card.impl.ui.limit_hub.limit_history.CreditCardLimitHistoryController;
import com.revolut.feature.credit.card.impl.ui.statement.export.CreditCardStatementExportScreen;
import com.revolut.feature.freelancer.impl.ui.cashback.screen.details.FreelancerCashbackDetailsScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.common.date_range.DateRangeScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.confirmation.CarConfirmationScreen;
import com.revolut.feature.payments.groups.impl.mappers.transactions.GroupTransactionItem;
import com.revolut.feature.payments.groups.impl.ui_chat.group_transactions.GroupTransactionsScreen;
import com.revolut.feature.payments.groups.impl.ui_new.group_creation.GroupCreationScreen;
import com.revolut.feature.retail.savings.impl.ui.automations.SavingsAutomationsScreen;
import com.revolut.feature.salary_switch.impl.ui.mexico.screen.terms.TermsViewerController;
import com.revolut.feature.transactions.impl.ui.pending.screen.PendingTransactionScreen;
import com.revolut.feature.wealth_discovery.impl.screener.screens.result.ScreenerResultScreen;
import hpg.j;
import java.util.Date;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import nii.n1;
import nnb.o;
import nnd.c0;
import no6.m;
import nsl.n;
import nv6.s;
import nv7.l;
import tof.a3;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f217472w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f217472w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d((DateRangeScreen) this.f217472w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d((o) this.f217472w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            case 2:
                d dVar3 = new d((c0) this.f217472w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
            case 3:
                d dVar4 = new d((PendingTransactionScreen) this.f217472w, continuation, 3);
                dVar4.v = obj2;
                return dVar4;
            case 4:
                return new d((m) this.v, (io3.d) this.f217472w, continuation, 4);
            case 5:
                d dVar5 = new d((CarConfirmationScreen) this.f217472w, continuation, 5);
                dVar5.v = obj2;
                return dVar5;
            case 6:
                d dVar6 = new d((SavingsAutomationsScreen) this.f217472w, continuation, 6);
                dVar6.v = obj2;
                return dVar6;
            case 7:
                d dVar7 = new d((nob.i) this.f217472w, continuation, 7);
                dVar7.v = obj2;
                return dVar7;
            case 8:
                d dVar8 = new d((AdditionalCardsChangeLimitScreen) this.f217472w, continuation, 8);
                dVar8.v = obj2;
                return dVar8;
            case 9:
                d dVar9 = new d((nqd.o) this.f217472w, continuation, 9);
                dVar9.v = obj2;
                return dVar9;
            case 10:
                d dVar10 = new d((ScreenerResultScreen) this.f217472w, continuation, 10);
                dVar10.v = obj2;
                return dVar10;
            case 11:
                d dVar11 = new d((TermsViewerController) this.f217472w, continuation, 11);
                dVar11.v = obj2;
                return dVar11;
            case 12:
                d dVar12 = new d((nrd.h) this.f217472w, continuation, 12);
                dVar12.v = obj2;
                return dVar12;
            case 13:
                d dVar13 = new d((CreditCardAnticipationConfirmationScreen) this.f217472w, continuation, 13);
                dVar13.v = obj2;
                return dVar13;
            case 14:
                d dVar14 = new d((GroupTransactionsScreen) this.f217472w, continuation, 14);
                dVar14.v = obj2;
                return dVar14;
            case 15:
                d dVar15 = new d((com.revolut.feature.payments.groups.impl.ui_chat.group_transactions.a) this.f217472w, continuation, 15);
                dVar15.v = obj2;
                return dVar15;
            case 16:
                d dVar16 = new d((com.revolut.feature.sca_prompt.impl.trusted_entities.a) this.f217472w, continuation, 16);
                dVar16.v = obj2;
                return dVar16;
            case 17:
                d dVar17 = new d((nsl.b) this.f217472w, continuation, 17);
                dVar17.v = obj2;
                return dVar17;
            case 18:
                d dVar18 = new d((CreditCardLimitHistoryController) this.f217472w, continuation, 18);
                dVar18.v = obj2;
                return dVar18;
            case 19:
                d dVar19 = new d((nt4.g) this.f217472w, continuation, 19);
                dVar19.v = obj2;
                return dVar19;
            case 20:
                d dVar20 = new d((GroupCreationScreen) this.f217472w, continuation, 20);
                dVar20.v = obj2;
                return dVar20;
            case 21:
                d dVar21 = new d((com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details.a) this.f217472w, continuation, 21);
                dVar21.v = obj2;
                return dVar21;
            case 22:
                d dVar22 = new d((com.revolut.feature.security_hub.impl.ui.hidden_transactions.a) this.f217472w, continuation, 22);
                dVar22.v = obj2;
                return dVar22;
            case 23:
                return new d((com.revolut.feature.workflow.engine.rfi.impl.ui.flow.a) this.v, (List) this.f217472w, continuation, 23);
            case 24:
                d dVar23 = new d((com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.b) this.f217472w, continuation, 24);
                dVar23.v = obj2;
                return dVar23;
            case 25:
                d dVar24 = new d((CreditCardStatementExportScreen) this.f217472w, continuation, 25);
                dVar24.v = obj2;
                return dVar24;
            case 26:
                d dVar25 = new d((FreelancerCashbackDetailsScreen) this.f217472w, continuation, 26);
                dVar25.v = obj2;
                return dVar25;
            case 27:
                d dVar26 = new d((s) this.f217472w, continuation, 27);
                dVar26.v = obj2;
                return dVar26;
            case 28:
                d dVar27 = new d((l) this.f217472w, continuation, 28);
                dVar27.v = obj2;
                return dVar27;
            default:
                d dVar28 = new d((nw5.i) this.f217472w, continuation, 29);
                dVar28.v = obj2;
                return dVar28;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((Date) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((d) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((d) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((d) create((j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((d) create((yx4.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((d) create((GroupTransactionItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((d) create((n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((d) create((yx4.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((d) create((nt9.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((d) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((d) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((d) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((d) create((yx4.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((d) create((a3) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((xi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x073b  */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v52, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v58, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v54, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 2100
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nn7.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(oki.h hVar, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = hVar;
        this.f217472w = obj2;
    }
}
