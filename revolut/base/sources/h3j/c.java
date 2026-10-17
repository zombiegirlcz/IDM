package h3j;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.BankBeneficiaryDetailsScreen;
import com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.BankBeneficiaryDetailsScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ BankBeneficiaryDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(BankBeneficiaryDetailsScreen bankBeneficiaryDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = bankBeneficiaryDetailsScreen;
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

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BankBeneficiaryDetailsScreen bankBeneficiaryDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.b bVar = (com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details.b) ((g) bankBeneficiaryDetailsScreen.U.getValue());
                oki.h.v2(bVar.u, new BankBeneficiaryDetailsScreenContract$ModalStep.EditLabel(bVar.I2()), ModalDestination.Style.POPUP.f98311a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bankBeneficiaryDetailsScreen.m2().onBackPressed();
                break;
        }
        return Unit.f186387a;
    }
}
