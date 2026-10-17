package lk6;

import com.revolut.data.model.Data;
import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilPayment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ b0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(b0 b0Var, Continuation continuation) {
        super(2, continuation);
        this.v = b0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        u uVar = new u(this.v, continuation);
        uVar.u = obj2;
        return uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ArrayList arrayList;
        OpenBankingBrazilPayment.PaymentInformation paymentInformation;
        List list;
        Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        OpenBankingBrazilPayment openBankingBrazilPayment = (OpenBankingBrazilPayment) data.getContent();
        if (openBankingBrazilPayment == null || (paymentInformation = openBankingBrazilPayment.f72397g) == null || (list = paymentInformation.f72409a) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                zhm.a0.x(((OpenBankingBrazilPayment.InfoGroup) it8.next()).f72405a, arrayList);
            }
        }
        b0 b0Var = this.v;
        b0Var.H2(b0Var.u, new b8d.u(5, data, arrayList));
        return Unit.f186387a;
    }
}
