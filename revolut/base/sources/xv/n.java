package xv;

import android.content.res.TypedArray;
import android.media.MediaMetadataRetriever;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class n implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f309130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f309131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f309132c;
    public final int d;
    public final int e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AutoCloseable f309133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f309134h;

    public n(ByteBuffer byteBuffer, int i, int i2, int i3, int i5, long j2, AutoCloseable autoCloseable, u uVar) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        this.f309130a = byteBuffer;
        this.f309131b = i;
        this.f309132c = i2;
        this.d = i3;
        this.e = i5;
        this.f = j2;
        this.f309133g = autoCloseable;
        this.f309134h = uVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        boolean zIsTerminated;
        AutoCloseable autoCloseable = this.f309133g;
        if (autoCloseable != null) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
                return;
            }
            if (!(autoCloseable instanceof ExecutorService)) {
                if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                    return;
                } else {
                    if (!(autoCloseable instanceof MediaMetadataRetriever)) {
                        throw new IllegalArgumentException();
                    }
                    ((MediaMetadataRetriever) autoCloseable).release();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) autoCloseable;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f309130a, nVar.f309130a) && this.f309131b == nVar.f309131b && this.f309132c == nVar.f309132c && this.d == nVar.d && this.e == nVar.e && this.f == nVar.f && Intrinsics.f(this.f309133g, nVar.f309133g) && Intrinsics.f(this.f309134h, nVar.f309134h);
    }

    public final int hashCode() {
        int iC = a0.d.c(j6.a.b(this.e, j6.a.b(this.d, j6.a.b(this.f309132c, j6.a.b(this.f309131b, this.f309130a.hashCode() * 31, 31), 31), 31), 31), 31, this.f);
        AutoCloseable autoCloseable = this.f309133g;
        int iHashCode = (iC + (autoCloseable == null ? 0 : autoCloseable.hashCode())) * 31;
        u uVar = this.f309134h;
        return iHashCode + (uVar != null ? uVar.hashCode() : 0);
    }
}
