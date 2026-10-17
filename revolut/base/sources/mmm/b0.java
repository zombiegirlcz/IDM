package mmm;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class b0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f207249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f207250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f207251c;
    public final ReentrantLock d;
    public final RandomAccessFile e;

    public b0(boolean z, RandomAccessFile randomAccessFile) {
        Intrinsics.checkNotNullParameter(randomAccessFile, "randomAccessFile");
        this.f207249a = z;
        this.d = new ReentrantLock();
        this.e = randomAccessFile;
    }

    public static p d(b0 b0Var) {
        if (!b0Var.f207249a) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = b0Var.d;
        reentrantLock.lock();
        try {
            if (b0Var.f207250b) {
                throw new IllegalStateException("closed");
            }
            b0Var.f207251c++;
            reentrantLock.unlock();
            return new p(b0Var);
        } catch (Throwable th10) {
            reentrantLock.unlock();
            throw th10;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (this.f207250b) {
                return;
            }
            this.f207250b = true;
            if (this.f207251c != 0) {
                return;
            }
            Unit unit = Unit.f186387a;
            synchronized (this) {
                this.e.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final q f(long j2) {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (this.f207250b) {
                throw new IllegalStateException("closed");
            }
            this.f207251c++;
            reentrantLock.unlock();
            return new q(this, j2);
        } catch (Throwable th10) {
            reentrantLock.unlock();
            throw th10;
        }
    }

    public final void flush() {
        if (!this.f207249a) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (this.f207250b) {
                throw new IllegalStateException("closed");
            }
            Unit unit = Unit.f186387a;
            synchronized (this) {
                this.e.getFD().sync();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (this.f207250b) {
                throw new IllegalStateException("closed");
            }
            Unit unit = Unit.f186387a;
            synchronized (this) {
                length = this.e.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }
}
