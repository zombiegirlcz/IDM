package e4k;

import com.revolut.feature.apm.core.models.recipients.ApmIdentifier;
import com.revolut.feature.apm.core.models.recipients.PayIdBeneficiary;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRecipientDetailsDestination;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.retail.feature.beneficiary.api.navigation.BankBeneficiaryDetailsDestination;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ BankTransferAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(BankTransferAmountScreen bankTransferAmountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = bankTransferAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o(this.v, continuation, 0);
            case 1:
                return new o(this.v, continuation, 1);
            case 2:
                return new o(this.v, continuation, 2);
            case 3:
                return new o(this.v, continuation, 3);
            case 4:
                return new o(this.v, continuation, 4);
            default:
                return new o(this.v, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((o) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        aii.u uVarB;
        int i = this.u;
        Continuation continuation = null;
        BankTransferAmountScreen bankTransferAmountScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bankTransferAmountScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a) bankTransferAmountScreen.T2()).C2();
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar4 = (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a) bankTransferAmountScreen.T2();
                e eVar = aVar4.f102082r;
                f5j.a beneficiary = ((x) aVar4.t2()).f122645a;
                TransferFlowType flowType = ((x) aVar4.t2()).f122646b;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
                Intrinsics.checkNotNullParameter(flowType, "flowType");
                f5j.r rVar = beneficiary.f132335l;
                String str = beneficiary.f132329a;
                if (rVar == f5j.r.PAYID_ALIAS) {
                    PayIdBeneficiary recipient = new PayIdBeneficiary(new ApmIdentifier.Uuid(str), n61.j.c(beneficiary), beneficiary);
                    Intrinsics.checkNotNullParameter(recipient, "recipient");
                    uVarB = new ApmRecipientDetailsDestination(recipient);
                } else {
                    uVarB = zh9.u0.b(zh9.u0.f(new BankBeneficiaryDetailsDestination(beneficiary, str, flowType.getF92255a())));
                }
                aVar4.C1(uVarB);
                break;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a) bankTransferAmountScreen.T2()).C2();
                break;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar7 = (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a) bankTransferAmountScreen.T2();
                aVar7.F.Q();
                aVar7.l2(new b1(1, aVar7, continuation), new yi5.b(26));
                break;
            default:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a aVar9 = (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.a) bankTransferAmountScreen.T2();
                aVar9.F.Q();
                aVar9.l2(new dz6.o(aVar9, null), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
