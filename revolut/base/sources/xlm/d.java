package xlm;

import com.bumptech.glide.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.j;
import vlm.h;

/* JADX INFO: loaded from: classes13.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();
    public static final Logger k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d f307058l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f307059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f307060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f307061c;
    public boolean d;
    public long e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f307062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f307063h;
    public final ArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k f307064j;

    static {
        Logger logger = Logger.getLogger(d.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(...)");
        k = logger;
        f307058l = new d(new j(vlm.j.m(vlm.j.f290513b + " TaskRunner", true)));
    }

    public d(j backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        Logger logger = k;
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f307059a = backend;
        this.f307060b = logger;
        this.f307061c = 10000;
        this.f307063h = new ArrayList();
        this.i = new ArrayList();
        this.f307064j = new k(this, 21);
    }

    public static final void a(d dVar, a aVar, long j2, boolean z) {
        TimeZone timeZone = vlm.j.f290512a;
        b bVar = aVar.f307054c;
        Intrinsics.h(bVar);
        if (bVar.d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z3 = bVar.f;
        bVar.f = false;
        bVar.d = null;
        dVar.f307063h.remove(bVar);
        if (j2 != -1 && !z3 && !bVar.f307057c) {
            bVar.f(aVar, j2, true);
        }
        if (bVar.e.isEmpty()) {
            return;
        }
        dVar.i.add(bVar);
        if (z) {
            return;
        }
        dVar.e();
    }

    public final a b() {
        boolean z;
        TimeZone timeZone = vlm.j.f290512a;
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.isEmpty()) {
                break;
            }
            long jNanoTime = System.nanoTime();
            Iterator it8 = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            a aVar = null;
            while (true) {
                if (!it8.hasNext()) {
                    z = false;
                    break;
                }
                a aVar2 = (a) ((b) it8.next()).e.get(0);
                long jMax = Math.max(0L, aVar2.d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar != null) {
                        z = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            ArrayList arrayList2 = this.f307063h;
            if (aVar != null) {
                TimeZone timeZone2 = vlm.j.f290512a;
                aVar.d = -1L;
                b bVar = aVar.f307054c;
                Intrinsics.h(bVar);
                bVar.e.remove(aVar);
                arrayList.remove(bVar);
                bVar.d = aVar;
                arrayList2.add(bVar);
                if (z || (!this.d && !arrayList.isEmpty())) {
                    e();
                }
                return aVar;
            }
            if (!this.d) {
                this.d = true;
                this.e = jNanoTime + jMin;
                try {
                    try {
                        Intrinsics.checkNotNullParameter(this, "taskRunner");
                        TimeZone timeZone3 = vlm.j.f290512a;
                        if (jMin > 0) {
                            long j2 = jMin / 1000000;
                            long j3 = jMin - (1000000 * j2);
                            if (j2 > 0 || jMin > 0) {
                                wait(j2, (int) j3);
                            }
                        }
                    } catch (InterruptedException unused) {
                        TimeZone timeZone4 = vlm.j.f290512a;
                        for (int size = arrayList2.size() - 1; -1 < size; size--) {
                            ((b) arrayList2.get(size)).b();
                        }
                        for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                            b bVar2 = (b) arrayList.get(size2);
                            bVar2.b();
                            if (bVar2.e.isEmpty()) {
                                arrayList.remove(size2);
                            }
                        }
                    }
                } finally {
                    this.d = false;
                }
            } else if (jMin < this.e - jNanoTime) {
                Intrinsics.checkNotNullParameter(this, "taskRunner");
                notify();
            }
        }
        return null;
    }

    public final void c(b taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        TimeZone timeZone = vlm.j.f290512a;
        if (taskQueue.d == null) {
            boolean zIsEmpty = taskQueue.e.isEmpty();
            ArrayList arrayList = this.i;
            if (zIsEmpty) {
                arrayList.remove(taskQueue);
            } else {
                h.a(arrayList, taskQueue);
            }
        }
        if (!this.d) {
            e();
        } else {
            Intrinsics.checkNotNullParameter(this, "taskRunner");
            notify();
        }
    }

    public final b d() {
        int i;
        synchronized (this) {
            i = this.f307061c;
            this.f307061c = i + 1;
        }
        return new b(this, a0.d.n("Q", i));
    }

    public final void e() {
        TimeZone timeZone = vlm.j.f290512a;
        int i = this.f;
        if (i > this.f307062g) {
            return;
        }
        this.f = i + 1;
        Intrinsics.checkNotNullParameter(this, "taskRunner");
        k runnable = this.f307064j;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        ((ThreadPoolExecutor) this.f307059a.f287589a).execute(runnable);
    }
}
