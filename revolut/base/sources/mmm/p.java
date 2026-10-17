package mmm;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class p implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f207301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f207302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f207303c;

    public p(b0 fileHandle) {
        Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
        this.f207301a = fileHandle;
        this.f207302b = 0L;
    }

    @Override // mmm.q0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b0 b0Var = this.f207301a;
        if (this.f207303c) {
            return;
        }
        this.f207303c = true;
        ReentrantLock reentrantLock = b0Var.d;
        reentrantLock.lock();
        try {
            int i = b0Var.f207251c - 1;
            b0Var.f207251c = i;
            if (i == 0 && b0Var.f207250b) {
                Unit unit = Unit.f186387a;
                synchronized (b0Var) {
                    b0Var.e.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // mmm.q0, java.io.Flushable
    public final void flush() {
        if (this.f207303c) {
            throw new IllegalStateException("closed");
        }
        b0 b0Var = this.f207301a;
        synchronized (b0Var) {
            b0Var.e.getFD().sync();
        }
    }

    @Override // mmm.q0
    public final v0 timeout() {
        return v0.d;
    }

    @Override // mmm.q0
    public final void write(h source, long j2) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f207303c) {
            throw new IllegalStateException("closed");
        }
        b0 b0Var = this.f207301a;
        long j3 = this.f207302b;
        b0Var.getClass();
        b.b(source.f207266b, 0L, j2);
        long j5 = j3 + j2;
        while (j3 < j5) {
            n0 n0Var = source.f207265a;
            Intrinsics.h(n0Var);
            int iMin = (int) Math.min(j5 - j3, n0Var.f207293c - n0Var.f207292b);
            byte[] array = n0Var.f207291a;
            int i = n0Var.f207292b;
            synchronized (b0Var) {
                Intrinsics.checkNotNullParameter(array, "array");
                b0Var.e.seek(j3);
                b0Var.e.write(array, i, iMin);
            }
            int i2 = n0Var.f207292b + iMin;
            n0Var.f207292b = i2;
            long j16 = iMin;
            j3 += j16;
            source.f207266b -= j16;
            if (i2 == n0Var.f207293c) {
                source.f207265a = n0Var.a();
                o0.a(n0Var);
            }
        }
        this.f207302b += j2;
    }
}
