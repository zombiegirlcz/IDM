package fim;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u0;
import yhm.o;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends gim.g {
    public int u;
    public final /* synthetic */ Function2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Continuation f135472w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Continuation continuation, Continuation continuation2, Function2 function2) {
        super(continuation);
        this.v = function2;
        this.f135472w = continuation2;
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
        Function2 function2 = this.v;
        Intrinsics.i(function2, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        u0.f(2, function2);
        return function2.invoke(this.f135472w, this);
    }
}
