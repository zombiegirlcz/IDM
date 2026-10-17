package lx;

import a0.d;
import android.content.res.TypedArray;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import xv.u;

/* JADX INFO: loaded from: classes16.dex */
public final class a implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ch0.a f200499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f200500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f200501c;
    public final AutoCloseable d;

    public a(ch0.a msImage, long j2, u uVar, AutoCloseable closeable) {
        Intrinsics.checkNotNullParameter(msImage, "msImage");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        this.f200499a = msImage;
        this.f200500b = j2;
        this.f200501c = uVar;
        this.d = closeable;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        boolean zIsTerminated;
        AutoCloseable autoCloseable = this.d;
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

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f200499a, aVar.f200499a) && this.f200500b == aVar.f200500b && Intrinsics.f(this.f200501c, aVar.f200501c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iC = d.c(this.f200499a.hashCode() * 31, 31, this.f200500b);
        u uVar = this.f200501c;
        return this.d.hashCode() + ((iC + (uVar == null ? 0 : uVar.hashCode())) * 31);
    }
}
