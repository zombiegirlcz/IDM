package is2;

import is2.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.a2;
import tof.a3;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends gim.i implements Function2 {
    public com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b f168092w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b bVar, Continuation continuation) {
        super(2, continuation);
        this.f168092w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new m(this.f168092w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b bVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b bVar2 = this.f168092w;
            a3 a3Var = ((f) bVar2.t2()).d;
            Continuation continuation = null;
            if (a3Var == null) {
                return null;
            }
            a2 a2Var = bVar2.z;
            if (a2Var != null) {
                a2Var.f(null);
            }
            bVar2.x2(new ip4.m(19));
            al6.d dVar = new al6.d(k71.k.N(a3Var), 1);
            l lVar = new l(bVar2, a3Var, continuation, 0);
            this.u = bVar2;
            this.v = 1;
            obj2 = n14.k.V(bVar2, null, null, dVar, lVar, this, 3);
            if (obj2 == aVar) {
                return aVar;
            }
            bVar = bVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = this.u;
            yhm.o.b(obj2);
        }
        if (((nii.h) obj2) instanceof nii.g) {
            bVar.v2(g.a.f168084a);
        }
        bVar.x2(new ip4.m(20));
        return Unit.f186387a;
    }
}
