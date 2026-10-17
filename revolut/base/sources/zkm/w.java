package zkm;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import skm.d2;

/* JADX INFO: loaded from: classes13.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cfm.c f323126a = new cfm.c("NO_THREAD_ELEMENTS", 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final pq0.d f323127b = new pq0.d(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final pq0.d f323128c = new pq0.d(17);
    public static final pq0.d d = new pq0.d(18);

    public static final void a(CoroutineContext coroutineContext, Object obj2) {
        if (obj2 == f323126a) {
            return;
        }
        if (!(obj2 instanceof a0)) {
            Object objFold = coroutineContext.fold(null, f323128c);
            Intrinsics.i(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((x) ((d2) objFold)).a(obj2);
            return;
        }
        a0 a0Var = (a0) obj2;
        d2[] d2VarArr = a0Var.f323096c;
        int length = d2VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            d2 d2Var = d2VarArr[length];
            Intrinsics.h(d2Var);
            ((x) d2Var).a(a0Var.f323095b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    public static final Object b(CoroutineContext coroutineContext) {
        Object objFold = coroutineContext.fold(0, f323127b);
        Intrinsics.h(objFold);
        return objFold;
    }

    public static final Object c(CoroutineContext coroutineContext, Object obj2) {
        if (obj2 == null) {
            obj2 = b(coroutineContext);
        }
        return obj2 == 0 ? f323126a : obj2 instanceof Integer ? coroutineContext.fold(new a0(((Number) obj2).intValue(), coroutineContext), d) : ((x) ((d2) obj2)).b(coroutineContext);
    }
}
