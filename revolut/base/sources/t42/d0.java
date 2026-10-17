package t42;

import i12.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d0 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c f267848w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c cVar, Continuation continuation) {
        super(2, continuation);
        this.f267848w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d0 d0Var = new d0(this.f267848w, continuation);
        d0Var.v = obj2;
        return d0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d0) create((i12.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        i12.a aVar = (i12.a) this.v;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            boolean z = aVar instanceof i12.b;
            com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c cVar = this.f267848w;
            if (z) {
                cVar.H2(cVar.G, new bbk.b0(aVar, 2));
            } else {
                if (!Intrinsics.f(aVar, a.C0902a.f157526a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.v = null;
                this.u = 1;
                if (com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c.L2(cVar, this) == aVar2) {
                    return aVar2;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
