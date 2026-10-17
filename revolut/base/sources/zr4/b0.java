package zr4;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class b0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.a f324553w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f324553w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b0 b0Var = new b0(this.f324553w, continuation, 0);
                b0Var.v = obj2;
                return b0Var;
            default:
                b0 b0Var2 = new b0(this.f324553w, continuation, 1);
                b0Var2.v = obj2;
                return b0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b0) create((vf0.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                vf0.h hVar = (vf0.h) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ql4.q qVar = (ql4.q) hVar.f288433a;
                od0.i iVar = (od0.i) hVar.f288434b;
                ll4.u uVar = (ll4.u) hVar.f288435c;
                wi0.b bVar = (wi0.b) hVar.d;
                com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.a aVar2 = this.f324553w;
                return nim.a.v(aVar2.f69377r.p(zhm.d0.i1(qVar.f247161c)), new wg9.p(qVar, uVar, aVar2, iVar, bVar));
            default:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.a aVar4 = this.f324553w;
                aVar4.H2(aVar4.f69382y, new znc.m(data, 6));
                return Unit.f186387a;
        }
    }
}
