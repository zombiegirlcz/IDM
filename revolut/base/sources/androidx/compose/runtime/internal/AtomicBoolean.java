package androidx.compose.runtime.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081@\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\r\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u0088\u0001\u0007\u0092\u0001\u00020\u0006¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/internal/AtomicBoolean;", "", "", "value", "constructor-impl", "(Z)Landroidx/compose/runtime/internal/AtomicInt;", "Landroidx/compose/runtime/internal/AtomicInt;", "wrapped", "(Landroidx/compose/runtime/internal/AtomicInt;)Landroidx/compose/runtime/internal/AtomicInt;", "get-impl", "(Landroidx/compose/runtime/internal/AtomicInt;)Z", "get", "", "set-impl", "(Landroidx/compose/runtime/internal/AtomicInt;Z)V", "set", "newValue", "getAndSet-impl", "(Landroidx/compose/runtime/internal/AtomicInt;Z)Z", "getAndSet", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AtomicBoolean {
    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static AtomicInt m1702constructorimpl(@NotNull AtomicInt atomicInt) {
        return atomicInt;
    }

    /* JADX INFO: renamed from: get-impl, reason: not valid java name */
    public static final boolean m1704getimpl(AtomicInt atomicInt) {
        return atomicInt.get() != 0;
    }

    /* JADX INFO: renamed from: getAndSet-impl, reason: not valid java name */
    public static final boolean m1705getAndSetimpl(AtomicInt atomicInt, boolean z) {
        return atomicInt.compareAndSet(1, z ? 1 : 0);
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final void m1706setimpl(AtomicInt atomicInt, boolean z) {
        atomicInt.set(z ? 1 : 0);
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static AtomicInt m1703constructorimpl(boolean z) {
        return m1702constructorimpl(new AtomicInt(z ? 1 : 0));
    }
}
