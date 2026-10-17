package i52;

import i12.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e0 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.core.ui.impl.ui.transfer.review.a f158556w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.revolut.feature.apm.core.ui.impl.ui.transfer.review.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f158556w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e0 e0Var = new e0(this.f158556w, continuation);
        e0Var.v = obj2;
        return e0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e0) create((i12.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        i12.a aVar = (i12.a) this.v;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            boolean z = aVar instanceof i12.b;
            com.revolut.feature.apm.core.ui.impl.ui.transfer.review.a aVar3 = this.f158556w;
            if (z) {
                aVar3.H2(aVar3.A, new bbk.b0(aVar, 1));
            } else {
                if (!Intrinsics.f(aVar, a.C0902a.f157526a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.v = null;
                this.u = 1;
                if (com.revolut.feature.apm.core.ui.impl.ui.transfer.review.a.I2(aVar3, this) == aVar2) {
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
