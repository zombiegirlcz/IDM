package qu4;

import com.revolut.data.model.Data;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayments;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f249237w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(u uVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f249237w = uVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                r rVar = new r(this.f249237w, continuation, 0);
                rVar.v = obj2;
                return rVar;
            case 1:
                r rVar2 = new r(this.f249237w, continuation, 1);
                rVar2.v = obj2;
                return rVar2;
            default:
                r rVar3 = new r(this.f249237w, continuation, 2);
                rVar3.v = obj2;
                return rVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((r) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((r) create((ym4.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((r) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        u uVar = this.f249237w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                uVar.H2(uVar.f249246t, new qna.p(data, 14));
                break;
            case 1:
                ym4.a aVar2 = (ym4.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                uVar.H2(uVar.f249246t, new qtb.c(aVar2, 3));
                break;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                od0.i iVar = (od0.i) data2.getContent();
                if (iVar != null) {
                    uVar.H2(uVar.f249246t, new qtb.c((CreditCardAutopayPayments) iVar.f224257a, uVar));
                }
                break;
        }
        return Unit.f186387a;
    }
}
