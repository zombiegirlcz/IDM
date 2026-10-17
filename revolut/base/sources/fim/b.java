package fim;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.u0;
import yhm.o;

/* JADX INFO: loaded from: classes14.dex */
public final class b extends gim.g {
    public int u;
    public final /* synthetic */ q v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Continuation continuation, Function1 function1) {
        super(continuation);
        this.v = (q) function1;
        Intrinsics.i(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.u = 2;
            o.b(obj2);
            return obj2;
        }
        this.u = 1;
        o.b(obj2);
        wim.b bVar = this.v;
        u0.f(1, bVar);
        return ((Function1) bVar).invoke(this);
    }
}
