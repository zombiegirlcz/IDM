package pe;

import android.os.SystemClock;
import android.util.Log;
import ao.h;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import wb.e;
import zb.r;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f235274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f235275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f235276c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f235277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r f235278h;
    public final h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f235279j;
    public long k;

    public c(r rVar, qe.b bVar, h hVar) {
        double d = bVar.d;
        double d5 = bVar.e;
        long j2 = ((long) bVar.f) * 1000;
        this.f235274a = d;
        this.f235275b = d5;
        this.f235276c = j2;
        this.f235278h = rVar;
        this.i = hVar;
        this.d = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f = arrayBlockingQueue;
        this.f235277g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f235279j = 0;
        this.k = 0L;
    }

    public final int a() {
        if (this.k == 0) {
            this.k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.k) / this.f235276c);
        int iMin = this.f.size() == this.e ? Math.min(100, this.f235279j + iCurrentTimeMillis) : Math.max(0, this.f235279j - iCurrentTimeMillis);
        if (this.f235279j != iMin) {
            this.f235279j = iMin;
            this.k = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(ie.b bVar, TaskCompletionSource taskCompletionSource) {
        String str = "Sending report through Google DataTransport: " + bVar.f160508b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
        }
        this.f235278h.a(new wb.a(bVar.f160507a, e.HIGHEST, null), new b(this, SystemClock.elapsedRealtime() - this.d < 2000, taskCompletionSource, bVar));
    }
}
