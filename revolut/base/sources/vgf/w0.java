package vgf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class w0 extends gim.i implements Function2 {
    public com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a f289142w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f289143x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.f289142w = aVar;
        this.f289143x = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new w0(this.f289142w, this.f289143x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((w0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            com.revolut.feature.transaction_list.impl.ui.list.screen.transactions.a aVar3 = this.f289142w;
            e1 e1Var = aVar3.f91941y;
            qua.p pVar = (qua.p) this.f289143x;
            this.u = aVar3;
            this.v = 1;
            Object objA = e1Var.a(pVar, this);
            if (objA == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
            obj2 = objA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = this.u;
            yhm.o.b(obj2);
        }
        return aVar.C1((aii.u) obj2);
    }
}
