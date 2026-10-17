package z8k;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class x0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b f320232w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f320232w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                x0 x0Var = new x0(this.f320232w, continuation, 0);
                x0Var.v = ((Boolean) obj2).booleanValue();
                return x0Var;
            default:
                x0 x0Var2 = new x0(this.f320232w, continuation, 1);
                x0Var2.v = ((Boolean) obj2).booleanValue();
                return x0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.u;
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        Continuation continuation = (Continuation) obj3;
        switch (i) {
        }
        return ((x0) create(bool, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar = this.f320232w;
        switch (i) {
            case 0:
                boolean z = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.x2(new xyh.n(z, 19));
                break;
            default:
                boolean z3 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.x2(new xyh.n(z3, 20));
                break;
        }
        return Unit.f186387a;
    }
}
