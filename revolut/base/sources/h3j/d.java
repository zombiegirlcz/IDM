package h3j;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.BankBeneficiaryDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ BankBeneficiaryDetailsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BankBeneficiaryDetailsScreen bankBeneficiaryDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = bankBeneficiaryDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.b bVar = (com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.b) ((g) this.u.U.getValue());
        bVar.getClass();
        bVar.l2(new q(bVar, null, 1), new yi5.b(26));
        return Unit.f186387a;
    }
}
