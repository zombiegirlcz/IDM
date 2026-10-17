package oo2;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.bank_account_switching.api.R$string;
import com.revolut.feature.bank_account_switching.impl.ui.payments_review.BankAccountSwitchingPaymentsReviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.v;
import nii.y0;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ BankAccountSwitchingPaymentsReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(BankAccountSwitchingPaymentsReviewScreen bankAccountSwitchingPaymentsReviewScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = bankAccountSwitchingPaymentsReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BankAccountSwitchingPaymentsReviewScreen bankAccountSwitchingPaymentsReviewScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bankAccountSwitchingPaymentsReviewScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVar = (p) bankAccountSwitchingPaymentsReviewScreen.d();
                pVar.getClass();
                yji.l.b1(pVar, pVar.X1(new y0("ID_CONFIRMATION_DIALOG", new v(new TextLocalisedClause(R$string.account_switch_review_payments_confirm_title, null, null, 14), new TextLocalisedClause(R$string.account_switch_review_payments_confirm_description, null, null, 14), null, new TextLocalisedClause(R$string.account_switch_review_payments_confirm_action_confirm, null, null, 14), new TextLocalisedClause(R$string.account_switch_review_payments_confirm_action_cancel, null, null, 14), null, null, null, false, null, 4032), false, 4)), null, new oli.f(pVar, null, 11), 3);
                break;
        }
        return Unit.f186387a;
    }
}
