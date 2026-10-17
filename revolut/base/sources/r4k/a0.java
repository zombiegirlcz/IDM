package r4k;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.a f251471w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f251471w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a0 a0Var = new a0(this.f251471w, continuation, 0);
                a0Var.v = obj2;
                return a0Var;
            case 1:
                a0 a0Var2 = new a0(this.f251471w, continuation, 1);
                a0Var2.v = obj2;
                return a0Var2;
            case 2:
                a0 a0Var3 = new a0(this.f251471w, continuation, 2);
                a0Var3.v = obj2;
                return a0Var3;
            case 3:
                a0 a0Var4 = new a0(this.f251471w, continuation, 3);
                a0Var4.v = obj2;
                return a0Var4;
            default:
                a0 a0Var5 = new a0(this.f251471w, continuation, 4);
                a0Var5.v = obj2;
                return a0Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((a0) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((a0) create((v4k.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((a0) create((m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((a0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((a0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review.a aVar = this.f251471w;
        switch (i) {
            case 0:
                od0.i iVar = (od0.i) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.H, new djc.z(21, iVar));
                break;
            case 1:
                v4k.b bVar = (v4k.b) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.H, new r38.m(bVar, 9));
                break;
            case 2:
                m mVar = (m) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.H, new r38.m(mVar, 10));
                break;
            case 3:
                List list = (List) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.H, new q2j.j(list, 22));
                break;
            default:
                Data data = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.H, new r3b.t(data, 7));
                break;
        }
        return Unit.f186387a;
    }
}
