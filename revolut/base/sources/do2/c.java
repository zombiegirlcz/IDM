package do2;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.bank_account_switching.api.R$string;
import com.revolut.feature.bank_account_switching.impl.ui.form.BankAccountSwitchingFormScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.v;
import nii.y0;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ BankAccountSwitchingFormScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(BankAccountSwitchingFormScreen bankAccountSwitchingFormScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = bankAccountSwitchingFormScreen;
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
        BankAccountSwitchingFormScreen bankAccountSwitchingFormScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bankAccountSwitchingFormScreen.m2().onBackPressed();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVar = (q) bankAccountSwitchingFormScreen.R2();
                int i2 = m.f116385a[qVar.o.f63905a.ordinal()];
                int i3 = 1;
                Continuation continuation = null;
                if (i2 == 1) {
                    yji.l.b1(qVar, qVar.X1(new y0("ID_FORM_CONFIRMATION_DIALOG", new v(new TextLocalisedClause(R$string.account_switch_account_details_review_title, null, null, 14), new TextLocalisedClause(R$string.account_switch_account_details_review_description, null, null, 14), null, new TextLocalisedClause(R$string.account_switch_account_details_confirmation, null, null, 14), new TextLocalisedClause(R$string.account_switch_account_details_edit, null, null, 14), null, null, null, false, null, 4032), false, 4)), null, new p(qVar, null), 3);
                } else {
                    if (i2 != 2 && i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    qVar.l2(new n(qVar, continuation, i3), new yi5.b(26));
                }
                return Unit.f186387a;
        }
    }
}
