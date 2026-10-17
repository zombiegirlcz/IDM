package fim;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes14.dex */
public final class f extends gim.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Continuation continuation) {
        super(continuation);
        Intrinsics.i(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        o.b(obj2);
        return obj2;
    }
}
