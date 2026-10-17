package pe;

import androidx.media3.common.TrackGroup;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import com.google.android.gms.tasks.TaskCompletionSource;
import ie.c0;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import wb.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements j, DefaultTrackSelector.TrackInfo.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f235271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f235272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f235273c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b(Object obj2, boolean z, Object obj3, Object obj4) {
        this.f235272b = obj2;
        this.f235273c = obj3;
        this.f235271a = z;
        this.d = obj4;
    }

    @Override // wb.j
    public void c(Exception exc2) throws Throwable {
        c cVar = (c) this.f235272b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f235273c;
        ie.b bVar = (ie.b) this.d;
        if (exc2 != null) {
            taskCompletionSource.trySetException(exc2);
            return;
        }
        if (this.f235271a) {
            boolean z = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new ce.j(cVar, countDownLatch, 17)).start();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ExecutorService executorService = c0.f160515a;
            boolean z3 = false;
            try {
                long nanos = timeUnit.toNanos(2L);
                long jNanoTime = System.nanoTime() + nanos;
                while (true) {
                    try {
                        try {
                            countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                            break;
                        } catch (Throwable th10) {
                            th = th10;
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        nanos = jNanoTime - System.nanoTime();
                        z3 = true;
                    }
                }
                if (z3) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th11) {
                th = th11;
                z = z3;
            }
        }
        taskCompletionSource.trySetResult(bVar);
    }

    @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
    public List create(int i, TrackGroup trackGroup, int[] iArr) {
        return ((DefaultTrackSelector) this.f235272b).lambda$selectAudioTrack$3((DefaultTrackSelector.Parameters) this.f235273c, this.f235271a, (int[]) this.d, i, trackGroup, iArr);
    }
}
