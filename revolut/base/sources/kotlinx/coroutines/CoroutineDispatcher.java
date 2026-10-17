package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.f;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qza.q;
import skm.e0;
import skm.l;
import skm.y;
import zkm.g;
import zkm.h;

/* JADX INFO: loaded from: classes13.dex */
public abstract class CoroutineDispatcher extends kotlin.coroutines.a implements kotlin.coroutines.d {

    @NotNull
    public static final y Key = new y(kotlin.coroutines.d.q1, new q(9));

    public CoroutineDispatcher() {
        super(kotlin.coroutines.d.q1);
    }

    public static /* synthetic */ CoroutineDispatcher limitedParallelism$default(CoroutineDispatcher coroutineDispatcher, int i, String str, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return coroutineDispatcher.limitedParallelism(i, str);
    }

    public abstract void dispatch(CoroutineContext coroutineContext, Runnable runnable);

    public void dispatchYield(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        g.d(this, coroutineContext, runnable);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(@NotNull f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key instanceof kotlin.coroutines.b) {
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            f key2 = getKey();
            Intrinsics.checkNotNullParameter(key2, "key");
            if (key2 != bVar && bVar.f186403b != key2) {
                return null;
            }
            Intrinsics.checkNotNullParameter(this, "element");
            E e = (E) bVar.f186402a.invoke(this);
            if (e != null) {
                return e;
            }
        } else if (kotlin.coroutines.d.q1 == key) {
            return this;
        }
        return null;
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public final <T> Continuation<T> interceptContinuation(@NotNull Continuation<? super T> continuation) {
        return new zkm.f(this, continuation);
    }

    public boolean isDispatchNeeded(@NotNull CoroutineContext coroutineContext) {
        return true;
    }

    @NotNull
    public CoroutineDispatcher limitedParallelism(int i, String str) {
        g.a(i);
        return new h(this, i, str);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (key instanceof kotlin.coroutines.b) {
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            f key2 = getKey();
            Intrinsics.checkNotNullParameter(key2, "key");
            if (key2 != bVar && bVar.f186403b != key2) {
                return this;
            }
            Intrinsics.checkNotNullParameter(this, "element");
            if (((CoroutineContext.Element) bVar.f186402a.invoke(this)) != null) {
                return kotlin.coroutines.g.f186406a;
            }
        } else if (kotlin.coroutines.d.q1 == key) {
            return kotlin.coroutines.g.f186406a;
        }
        return this;
    }

    @Override // kotlin.coroutines.d
    public final void releaseInterceptedContinuation(@NotNull Continuation<?> continuation) {
        Intrinsics.i(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        zkm.f fVar = (zkm.f) continuation;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = zkm.f.f323102h;
        while (atomicReferenceFieldUpdater.get(fVar) == g.f323105b) {
        }
        Object obj2 = atomicReferenceFieldUpdater.get(fVar);
        l lVar = obj2 instanceof l ? (l) obj2 : null;
        if (lVar != null) {
            lVar.o();
        }
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '@' + e0.s(this);
    }

    @yhm.d
    public /* synthetic */ CoroutineDispatcher limitedParallelism(int i) {
        return limitedParallelism(i, null);
    }
}
