package fim;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u0;

/* JADX INFO: loaded from: classes13.dex */
public class h {
    /* JADX WARN: Multi-variable type inference failed */
    public static Continuation a(Continuation continuation, Continuation completion, Function2 function2) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Intrinsics.checkNotNullParameter(completion, "completion");
        if (function2 instanceof gim.a) {
            return ((gim.a) function2).create(continuation, completion);
        }
        CoroutineContext context = completion.getContext();
        return context == kotlin.coroutines.g.f186406a ? new d(completion, continuation, function2) : new e(completion, context, function2, continuation);
    }

    public static Continuation b(Continuation continuation) {
        Continuation<Object> continuationIntercepted;
        Intrinsics.checkNotNullParameter(continuation, "<this>");
        gim.c cVar = continuation instanceof gim.c ? (gim.c) continuation : null;
        return (cVar == null || (continuationIntercepted = cVar.intercepted()) == null) ? continuation : continuationIntercepted;
    }

    public static Object c(Function2 function2, Object obj2, Continuation completion) {
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Intrinsics.checkNotNullParameter(completion, "completion");
        CoroutineContext context = completion.getContext();
        Object fVar = context == kotlin.coroutines.g.f186406a ? new f(completion) : new g(completion, context);
        u0.f(2, function2);
        return function2.invoke(obj2, fVar);
    }
}
