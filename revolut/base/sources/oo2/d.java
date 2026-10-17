package oo2;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.bank_account_switching.impl.ui.payments_review.BankAccountSwitchingPaymentsReviewScreen;
import com.revolut.feature.bank_account_switching.impl.ui.payments_review.payment_schedule.BankAccountSwitchingPaymentScheduleScreen;
import com.revolut.feature.bank_account_switching.impl.ui.payments_review.payment_schedule.BankAccountSwitchingPaymentScheduleScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import om4.l0;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BankAccountSwitchingPaymentsReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BankAccountSwitchingPaymentsReviewScreen bankAccountSwitchingPaymentsReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = bankAccountSwitchingPaymentsReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        String listId = model.f53228a;
        p pVar = (p) mVarE3;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        qo2.k kVar = (qo2.k) ((i) ((j2) pVar.f227004p.f22677a).getValue()).d.getContent();
        if (kVar != null && a0.H(listId, "ID_UNSUPPORTED_PAYMENT_", false)) {
            qo2.i iVar = (qo2.i) kVar.f247998b.get(d0.e0(listId, "ID_UNSUPPORTED_PAYMENT_"));
            if (iVar != null) {
                qo2.b bVar = iVar.f247992a;
                pVar.f2(new BankAccountSwitchingPaymentScheduleScreen(new BankAccountSwitchingPaymentScheduleScreenContract$InputData(kVar.f247999c, bVar.e, bVar.d)), ModalDestination.Style.POPUP.f98311a, new l0(pVar, 5, bVar, kVar));
            }
        }
        return Unit.f186387a;
    }
}
