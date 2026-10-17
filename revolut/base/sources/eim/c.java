package eim;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.n;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0001\u0018\u0000 \u0007*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Leim/c;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "", "result", "Ljava/lang/Object;", "Companion", "a", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c<T> implements Continuation<T>, CoroutineStackFrame {

    @NotNull
    private static final a Companion = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f126700b = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "result");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Continuation f126701a;
    private volatile Object result;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Leim/c$a;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public c(Continuation delegate, fim.a aVar) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f126701a = delegate;
        this.result = aVar;
    }

    public final Object b() {
        Object obj2 = this.result;
        fim.a aVar = fim.a.UNDECIDED;
        if (obj2 == aVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f126700b;
            fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    obj2 = this.result;
                }
            }
            return fim.a.COROUTINE_SUSPENDED;
        }
        if (obj2 == fim.a.RESUMED) {
            return fim.a.COROUTINE_SUSPENDED;
        }
        if (obj2 instanceof n) {
            throw ((n) obj2).f314194a;
        }
        return obj2;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f126701a;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.f126701a.getContext();
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj2) {
        while (true) {
            Object obj3 = this.result;
            fim.a aVar = fim.a.UNDECIDED;
            if (obj3 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f126700b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj2)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                return;
            }
            fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
            if (obj3 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f126700b;
            fim.a aVar3 = fim.a.RESUMED;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                    break;
                }
            }
            this.f126701a.resumeWith(obj2);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f126701a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Continuation delegate) {
        this(delegate, fim.a.UNDECIDED);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
    }
}
