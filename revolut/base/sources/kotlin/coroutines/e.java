package kotlin.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public abstract class e {
    public static Object a(CoroutineContext.Element element, Object obj2, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj2, element);
    }

    public static CoroutineContext.Element b(CoroutineContext.Element element, f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (Intrinsics.f(element.getKey(), key)) {
            return element;
        }
        return null;
    }

    public static CoroutineContext c(CoroutineContext.Element element, f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return Intrinsics.f(element.getKey(), key) ? g.f186406a : element;
    }

    public static CoroutineContext d(CoroutineContext.Element element, CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        return context == g.f186406a ? element : (CoroutineContext) context.fold(element, new akg.d(18));
    }
}
