package ir4;

import com.revolut.domain.models.beneficiary.BankInformationCopFlow;
import com.revolut.feature.credit.card.impl.ui.direct_debit.CreditCardDirectDebitV3FlowContract$State;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayType;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;
import vkm.q;
import yhm.o;
import zhm.q0;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.direct_debit.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f168003w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.credit.card.impl.ui.direct_debit.b bVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f168003w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.v, this.f168003w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.credit.card.impl.ui.direct_debit.b bVar = this.v;
            CreditCardAutopayType.DirectDebit directDebit = ((CreditCardDirectDebitV3FlowContract$State) ((j2) bVar.f69273r.f22677a).getValue()).f69265b;
            this.u = 1;
            obj2 = q.x(rd0.e.b(m70.a.g(bVar.f69271p.i(BankInformationCopFlow.SKIP, directDebit.i.f297794a, null, q0.c(new Pair(directDebit.f70733h.name(), this.f168003w))), null, null, 3)), this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        n61.d dVar = (n61.d) obj2;
        String str = dVar != null ? dVar.f212679a : null;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
