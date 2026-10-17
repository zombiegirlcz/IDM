package sem;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u0;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes23.dex */
public final class m extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f262240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Continuation f262241c;
    public Object d;
    public final Continuation[] e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f262242g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Object initial, Object context, List blocks) {
        super(context);
        Intrinsics.checkNotNullParameter(initial, "initial");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        this.f262240b = blocks;
        this.f262241c = new l(this);
        this.d = initial;
        this.e = new Continuation[blocks.size()];
        this.f = -1;
    }

    @Override // sem.f
    public final Object a(Object obj2, gim.c cVar) {
        this.f262242g = 0;
        if (this.f262240b.size() == 0) {
            return obj2;
        }
        Intrinsics.checkNotNullParameter(obj2, "<set-?>");
        this.d = obj2;
        if (this.f < 0) {
            return c(cVar);
        }
        throw new IllegalStateException("Already started");
    }

    @Override // sem.f
    public final Object b() {
        return this.d;
    }

    @Override // sem.f
    public final Object c(Continuation continuation) {
        Object obj2;
        if (this.f262242g == this.f262240b.size()) {
            obj2 = this.d;
        } else {
            Continuation continuation2 = fim.h.b(continuation);
            Intrinsics.checkNotNullParameter(continuation2, "continuation");
            int i = this.f + 1;
            this.f = i;
            Continuation[] continuationArr = this.e;
            continuationArr[i] = continuation2;
            if (e(true)) {
                int i2 = this.f;
                if (i2 < 0) {
                    throw new IllegalStateException("No more continuations to resume");
                }
                this.f = i2 - 1;
                continuationArr[i2] = null;
                obj2 = this.d;
            } else {
                obj2 = fim.a.COROUTINE_SUSPENDED;
            }
        }
        if (obj2 == fim.a.COROUTINE_SUSPENDED) {
            nim.a.C(continuation);
        }
        return obj2;
    }

    @Override // sem.f
    public final Object d(Object obj2, Continuation continuation) {
        Intrinsics.checkNotNullParameter(obj2, "<set-?>");
        this.d = obj2;
        return c(continuation);
    }

    public final boolean e(boolean z) {
        Function3 interceptor;
        Object subject;
        Continuation continuation;
        do {
            int i = this.f262242g;
            List list = this.f262240b;
            if (i == list.size()) {
                if (z) {
                    return true;
                }
                m.Companion companion = yhm.m.INSTANCE;
                f(this.d);
                return false;
            }
            this.f262242g = i + 1;
            interceptor = (Function3) list.get(i);
            try {
                subject = this.d;
                continuation = this.f262241c;
                Intrinsics.checkNotNullParameter(interceptor, "interceptor");
                Intrinsics.checkNotNullParameter(this, "context");
                Intrinsics.checkNotNullParameter(subject, "subject");
                Intrinsics.checkNotNullParameter(continuation, "continuation");
                u0.f(3, interceptor);
            } catch (Throwable th10) {
                m.Companion companion2 = yhm.m.INSTANCE;
                f(o.a(th10));
                return false;
            }
        } while (interceptor.invoke(this, subject, continuation) != fim.a.COROUTINE_SUSPENDED);
        return false;
    }

    public final void f(Object obj2) {
        int i = this.f;
        if (i < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        Continuation[] continuationArr = this.e;
        Continuation continuation = continuationArr[i];
        Intrinsics.h(continuation);
        int i2 = this.f;
        this.f = i2 - 1;
        continuationArr[i2] = null;
        m.Companion companion = yhm.m.INSTANCE;
        if (!(obj2 instanceof n)) {
            continuation.resumeWith(obj2);
            return;
        }
        Throwable exception = yhm.m.a(obj2);
        Intrinsics.h(exception);
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        try {
            exception.getCause();
            Intrinsics.checkNotNullParameter(exception, "<this>");
        } catch (Throwable unused) {
        }
        m.Companion companion2 = yhm.m.INSTANCE;
        continuation.resumeWith(o.a(exception));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return ((l) this.f262241c).getContext();
    }
}
