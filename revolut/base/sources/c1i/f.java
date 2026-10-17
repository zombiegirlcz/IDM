package c1i;

import c2f.l;
import c30.h;
import c7b.t;
import c7e.n;
import c8i.m;
import cbf.j;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.payid.impl.screen.settings.actions.AliasActionsScreen;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.confirmation.CancelLoanConfirmationController;
import com.revolut.feature.defi.exchange.impl.ui.exchange_summary.DeFiExchangeSummaryScreen;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlan;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_selection.CobrandedCardsSelectionScreen;
import com.revolut.feature.trade_rev_points.impl.ui.screen.account_registration_tax_id.TradeRevPointsAccountRegistrationTaxIdScreen;
import com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.flow.SavingWithDisclaimer;
import com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.selector.SavingsSelectorScreen;
import com.revolut.retail.feature.payments.bank_transfer.impl.payment_vendors_bene_creation.vendor_selection.VendorSelectionScreen;
import com.revolut.retail.feature.payments.bank_transfer.impl.structured_reference_transfer_note.StructuredReferenceTransferNoteScreen;
import com.revolut.retail.feature.payments.money_request.impl.ui_kompot.reject_reason.MoneyRequestRejectWithReasonScreen;
import gim.i;
import ip0.y;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import pcd.s;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f20522w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f20522w = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.u] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f((g) this.v, (r0i.a) this.f20522w, continuation, 0);
            case 1:
                f fVar = new f((TradeRevPointsAccountRegistrationTaxIdScreen) this.f20522w, continuation, 1);
                fVar.v = obj2;
                return fVar;
            case 2:
                f fVar2 = new f((l) this.f20522w, continuation, 2);
                fVar2.v = obj2;
                return fVar2;
            case 3:
                f fVar3 = new f((SavingsSelectorScreen) this.f20522w, continuation, 3);
                fVar3.v = obj2;
                return fVar3;
            case 4:
                f fVar4 = new f((h) this.f20522w, continuation, 4);
                fVar4.v = obj2;
                return fVar4;
            case 5:
                f fVar5 = new f((VendorSelectionScreen) this.f20522w, continuation, 5);
                fVar5.v = obj2;
                return fVar5;
            case 6:
                f fVar6 = new f((c3k.g) this.f20522w, continuation, 6);
                fVar6.v = obj2;
                return fVar6;
            case 7:
                f fVar7 = new f((DeFiExchangeSummaryScreen) this.f20522w, continuation, 7);
                fVar7.v = obj2;
                return fVar7;
            case 8:
                f fVar8 = new f((c49.d) this.f20522w, continuation, 8);
                fVar8.v = obj2;
                return fVar8;
            case 9:
                f fVar9 = new f((c4h.b) this.f20522w, continuation, 9);
                fVar9.v = obj2;
                return fVar9;
            case 10:
                f fVar10 = new f((StructuredReferenceTransferNoteScreen) this.f20522w, continuation, 10);
                fVar10.v = obj2;
                return fVar10;
            case 11:
                return new f((com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) this.v, (kkd.d) this.f20522w, continuation, 11);
            case 12:
                f fVar11 = new f((CancelLoanConfirmationController) this.f20522w, continuation, 12);
                fVar11.v = obj2;
                return fVar11;
            case 13:
                f fVar12 = new f((c6h.e) this.f20522w, continuation, 13);
                fVar12.v = obj2;
                return fVar12;
            case 14:
                f fVar13 = new f((c75.g) this.f20522w, continuation, 14);
                fVar13.v = obj2;
                return fVar13;
            case 15:
                f fVar14 = new f((CobrandedCardsSelectionScreen) this.f20522w, continuation, 15);
                fVar14.v = obj2;
                return fVar14;
            case 16:
                f fVar15 = new f((t) this.f20522w, continuation, 16);
                fVar15.v = obj2;
                return fVar15;
            case 17:
                f fVar16 = new f((n) this.f20522w, continuation, 17);
                fVar16.v = obj2;
                return fVar16;
            case 18:
                f fVar17 = new f((MoneyRequestRejectWithReasonScreen) this.f20522w, continuation, 18);
                fVar17.v = obj2;
                return fVar17;
            case 19:
                f fVar18 = new f((c84.a) this.f20522w, continuation, 19);
                fVar18.v = (AnalyticsContext) obj2;
                return fVar18;
            case 20:
                f fVar19 = new f((m) this.f20522w, continuation, 20);
                fVar19.v = obj2;
                return fVar19;
            case 21:
                f fVar20 = new f((c9f.b) this.f20522w, continuation, 21);
                fVar20.v = obj2;
                return fVar20;
            case 22:
                f fVar21 = new f((c9f.f) this.f20522w, continuation, 22);
                fVar21.v = obj2;
                return fVar21;
            case 23:
                f fVar22 = new f((ca.d) this.f20522w, continuation, 23);
                fVar22.v = obj2;
                return fVar22;
            case 24:
                f fVar23 = new f((ca8.a) this.f20522w, continuation, 24);
                fVar23.v = obj2;
                return fVar23;
            case 25:
                f fVar24 = new f((com.revolut.feature.retail.goals.impl.ui.a) this.f20522w, continuation, 25);
                fVar24.v = obj2;
                return fVar24;
            case 26:
                return new f((String) this.f20522w, (Function1) this.v, continuation);
            case 27:
                return new f((cam.t) this.v, (String) this.f20522w, continuation, 27);
            case 28:
                f fVar25 = new f((AliasActionsScreen) this.f20522w, continuation, 28);
                fVar25.v = obj2;
                return fVar25;
            default:
                f fVar26 = new f((j) this.f20522w, continuation, 29);
                fVar26.v = obj2;
                return fVar26;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((f) create((SavingWithDisclaimer) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((f) create((UUID) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((f) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((f) create((yx4.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((f) create((c6h.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((f) create((CobrandedCardsPlan) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((f) create((l71.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((f) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((f) create((AnalyticsContext) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((f) create((c9f.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((f) create((c9f.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((f) create((aa.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((f) create((s) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((f) create((lw0.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04b5  */
    /* JADX WARN: Type inference failed for: r1v147, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.u] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v59, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v93, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 1768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c1i.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f20522w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(String str, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = 26;
        this.v = (u) function1;
        this.f20522w = str;
    }
}
