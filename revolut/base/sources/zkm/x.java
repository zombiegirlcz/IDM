package zkm;

import ch.qos.logback.core.CoreConstants;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import skm.d2;

/* JADX INFO: loaded from: classes14.dex */
public final class x implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f323129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadLocal f323130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f323131c;

    public x(ThreadLocal threadLocal, Object obj2) {
        this.f323129a = obj2;
        this.f323130b = threadLocal;
        this.f323131c = new y(threadLocal);
    }

    public final void a(Object obj2) {
        this.f323130b.set(obj2);
    }

    public final Object b(CoroutineContext coroutineContext) {
        ThreadLocal threadLocal = this.f323130b;
        Object obj2 = threadLocal.get();
        threadLocal.set(this.f323129a);
        return obj2;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj2, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj2, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.f fVar) {
        if (this.f323131c.equals(fVar)) {
            return this;
        }
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return this.f323131c;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.f fVar) {
        return this.f323131c.equals(fVar) ? kotlin.coroutines.g.f186406a : this;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.d(this, coroutineContext);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.f323129a + ", threadLocal = " + this.f323130b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
