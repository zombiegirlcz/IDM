package mmm;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f207298a = new n0(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f207299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f207300c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f207299b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f207300c = atomicReferenceArr;
    }

    public static final void a(n0 segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.f != null || segment.f207294g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.d) {
            return;
        }
        AtomicReference atomicReference = f207300c[(int) (Thread.currentThread().getId() & (((long) f207299b) - 1))];
        n0 n0Var = f207298a;
        n0 n0Var2 = (n0) atomicReference.getAndSet(n0Var);
        if (n0Var2 == n0Var) {
            return;
        }
        int i = n0Var2 != null ? n0Var2.f207293c : 0;
        if (i >= 65536) {
            atomicReference.set(n0Var2);
            return;
        }
        segment.f = n0Var2;
        segment.f207292b = 0;
        segment.f207293c = i + 8192;
        atomicReference.set(segment);
    }

    public static final n0 b() {
        AtomicReference atomicReference = f207300c[(int) (Thread.currentThread().getId() & (((long) f207299b) - 1))];
        n0 n0Var = f207298a;
        n0 n0Var2 = (n0) atomicReference.getAndSet(n0Var);
        if (n0Var2 == n0Var) {
            return new n0();
        }
        if (n0Var2 == null) {
            atomicReference.set(null);
            return new n0();
        }
        atomicReference.set(n0Var2.f);
        n0Var2.f = null;
        n0Var2.f207293c = 0;
        return n0Var2;
    }
}
