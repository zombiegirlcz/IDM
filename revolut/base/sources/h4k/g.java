package h4k;

import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import tof.a3;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BankTransferAmountScreenContract$InputData.NewTransfer f149383w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, BankTransferAmountScreenContract$InputData.NewTransfer newTransfer, Continuation continuation) {
        super(1, continuation);
        this.v = kVar;
        this.f149383w = newTransfer;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.v, this.f149383w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        k kVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            this.u = 1;
            obj2 = nim.a.i(((qz9.n) kVar.k).e(new ChatTransferRecipient.BeneficiaryRecipient(this.f149383w.f102069a, null)), this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        a3 a3Var = (a3) obj2;
        if (a3Var != null) {
            return kVar.f149396l.a(a3Var);
        }
        return null;
    }
}
