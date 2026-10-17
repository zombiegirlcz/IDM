package z8k;

import aw0.f4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class n0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            b.Companion companion = kotlin.time.b.INSTANCE;
            long jH = kotlin.time.c.h(450L, pkm.e.MILLISECONDS);
            this.u = 1;
            if (skm.k0.c(jH, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar = this.v;
        bVar.J.b(new f4("ITEM_AMOUNT_INPUT_ID", true));
        bVar.x2(new i0(bVar, 3));
        return Unit.f186387a;
    }
}
