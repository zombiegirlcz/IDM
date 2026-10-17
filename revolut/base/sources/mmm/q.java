package mmm;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class q implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f207304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f207305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f207306c;

    public q(b0 fileHandle, long j2) {
        Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
        this.f207304a = fileHandle;
        this.f207305b = j2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b0 b0Var = this.f207304a;
        if (this.f207306c) {
            return;
        }
        this.f207306c = true;
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

    @Override // mmm.s0
    public final long read(h sink, long j2) {
        long j3;
        long j5;
        int i;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.f207306c) {
            throw new IllegalStateException("closed");
        }
        b0 b0Var = this.f207304a;
        long j16 = this.f207305b;
        if (j2 < 0) {
            throw new IllegalArgumentException(p.a.m(j2, "byteCount < 0: ").toString());
        }
        long j22 = j2 + j16;
        long j42 = j16;
        while (true) {
            if (j42 >= j22) {
                j3 = -1;
                break;
            }
            n0 n0VarU = sink.u(1);
            byte[] array = n0VarU.f207291a;
            int i2 = n0VarU.f207293c;
            j3 = -1;
            int iMin = (int) Math.min(j22 - j42, 8192 - i2);
            synchronized (b0Var) {
                Intrinsics.checkNotNullParameter(array, "array");
                b0Var.e.seek(j42);
                i = 0;
                while (true) {
                    if (i >= iMin) {
                        break;
                    }
                    int i3 = b0Var.e.read(array, i2, iMin - i);
                    if (i3 != -1) {
                        i += i3;
                    } else if (i == 0) {
                        i = -1;
                    }
                }
            }
            if (i == -1) {
                if (n0VarU.f207292b == n0VarU.f207293c) {
                    sink.f207265a = n0VarU.a();
                    o0.a(n0VarU);
                }
                if (j16 == j42) {
                    j5 = -1;
                }
            } else {
                n0VarU.f207293c += i;
                long j46 = i;
                j42 += j46;
                sink.f207266b += j46;
            }
        }
        j5 = j42 - j16;
        if (j5 != j3) {
            this.f207305b += j5;
        }
        return j5;
    }

    @Override // mmm.s0
    public final v0 timeout() {
        return v0.d;
    }
}
