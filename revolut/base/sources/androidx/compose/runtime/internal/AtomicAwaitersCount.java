package androidx.compose.runtime.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0083@\u0018\u0000 \r2\u00020\u0001:\u0001\rB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u001f\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u0088\u0001\u0005\u0092\u0001\u00020\u0004¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/internal/AtomicAwaitersCount;", "", "constructor-impl", "()Landroidx/compose/runtime/internal/AtomicInt;", "Landroidx/compose/runtime/internal/AtomicInt;", "value", "(Landroidx/compose/runtime/internal/AtomicInt;)Landroidx/compose/runtime/internal/AtomicInt;", "", "version", "count", "pack-impl", "(Landroidx/compose/runtime/internal/AtomicInt;II)I", "pack", "Companion", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
abstract class AtomicAwaitersCount {
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    private static AtomicInt m1700constructorimpl(AtomicInt atomicInt) {
        return atomicInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: pack-impl, reason: not valid java name */
    public static final int m1701packimpl(AtomicInt atomicInt, int i, int i2) {
        return ((i & 15) << 27) | (134217727 & i2);
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static AtomicInt m1699constructorimpl() {
        return m1700constructorimpl(new AtomicInt(0));
    }
}
