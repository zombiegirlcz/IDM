package eoi;

import android.os.Handler;
import android.os.SystemClock;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f127941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aoi.h f127942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f127943c;
    public final long d;
    public final foi.i e;
    public final g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f127944g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f127945h;
    public final g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArraySet f127946j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f127947l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f127948m;

    public j(WeakReference screenRef, aoi.h performanceTrace, a sessionMetricsAggregator) {
        Intrinsics.checkNotNullParameter(screenRef, "screenRef");
        Intrinsics.checkNotNullParameter(performanceTrace, "performanceTrace");
        Intrinsics.checkNotNullParameter(sessionMetricsAggregator, "sessionMetricsAggregator");
        this.f127941a = screenRef;
        this.f127942b = performanceTrace;
        this.f127943c = sessionMetricsAggregator;
        this.d = SystemClock.elapsedRealtime();
        this.e = new foi.i();
        this.f = new g();
        this.f127944g = new g();
        this.f127945h = new g();
        this.i = new g();
        this.f127946j = new ArraySet(0, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(long j2, long j3, long j5, long j16) {
        g gVar;
        g gVar2 = this.f;
        boolean z = gVar2.f == 0;
        long j22 = 1000000;
        long j42 = j2 / j22;
        if (z) {
            this.k = j42;
        }
        gVar2.a(j3, j5, j16);
        if (z || (this.f127947l < j42 && (j42 - this.k) - (j5 / j22) <= 300)) {
            this.f127948m = Math.max(this.f127948m, j5 / ((long) 1000));
        }
        this.f127947l = j42;
        foi.i iVar = this.e;
        long j46 = j2 + j5;
        ArraySet outStates = this.f127946j;
        synchronized (iVar) {
            try {
                Intrinsics.checkNotNullParameter(outStates, "outStates");
                outStates.clear();
                ArrayList arrayList = iVar.f136996b;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    foi.j jVar = (foi.j) arrayList.get(i);
                    if (foi.i.a(jVar, j2, j46)) {
                        outStates.add(jVar.f136997a);
                    }
                }
                ArrayMap arrayMap = iVar.f136995a;
                int size2 = arrayMap.getSize();
                for (int i2 = 0; i2 < size2; i2++) {
                    foi.j jVar2 = (foi.j) arrayMap.valueAt(i2);
                    if (foi.i.a(jVar2, j2, j46)) {
                        outStates.add(jVar2.f136997a);
                    }
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        ArraySet arraySet = this.f127946j;
        int size3 = arraySet.size();
        for (int i3 = 0; i3 < size3; i3++) {
            foi.h hVar = (foi.h) arraySet.valueAt(i3);
            if (Intrinsics.f(hVar, foi.d.f136991a)) {
                gVar = this.f127945h;
            } else if (Intrinsics.f(hVar, foi.e.f136992a)) {
                gVar = this.i;
            } else {
                if (!Intrinsics.f(hVar, foi.g.f136993a)) {
                    throw new NoWhenBranchMatchedException();
                }
                gVar = this.f127944g;
            }
            gVar.a(j3, j5, j16);
        }
    }

    public final void b() {
        SystemClock.elapsedRealtime();
        k.Companion.getClass();
        ((Handler) k.f127949h.getValue()).postAtFrontOfQueue(this);
        g gVar = this.f;
        int i = gVar.f;
        int i2 = gVar.e;
        long j2 = gVar.f127940c;
        long j3 = gVar.f127939b;
        ((c) this.f127943c).getClass();
        c.f127925l += i;
        c.f127926m += i2;
        c.f127927n += j3;
        c.o += j2;
    }

    public final WeakReference c() {
        return this.f127941a;
    }

    public final void d(foi.h state) {
        Intrinsics.checkNotNullParameter(state, "state");
        foi.i iVar = this.e;
        long jNanoTime = System.nanoTime();
        synchronized (iVar) {
            try {
                Intrinsics.checkNotNullParameter(state, "state");
                foi.j jVar = (foi.j) iVar.f136995a.get(state.getKey());
                if (Intrinsics.f(jVar != null ? jVar.f136997a : null, state)) {
                    return;
                }
                if (jVar != null) {
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.WARNING, "ScreenPerformanceStateHolder", "Replacing active state " + jVar.f136997a.getClass().getSimpleName() + " with " + state.getClass().getSimpleName() + " for key=" + state.getKey(), null, null, 16);
                    jVar.f136999c = Long.valueOf(jNanoTime);
                    ArrayList arrayList = iVar.f136996b;
                    arrayList.add(jVar);
                    if (arrayList.size() > 50) {
                        arrayList.remove(0);
                    }
                }
                iVar.f136995a.put(state.getKey(), new foi.j(state, jNanoTime));
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void e(foi.c key) {
        Intrinsics.checkNotNullParameter(key, "key");
        foi.i iVar = this.e;
        long jNanoTime = System.nanoTime();
        synchronized (iVar) {
            Intrinsics.checkNotNullParameter(key, "key");
            foi.j jVar = (foi.j) iVar.f136995a.remove(key);
            if (jVar != null) {
                jVar.f136999c = Long.valueOf(jNanoTime);
                ArrayList arrayList = iVar.f136996b;
                arrayList.add(jVar);
                if (arrayList.size() > 50) {
                    arrayList.remove(0);
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVarB = this.f.b();
        if (fVarB == null || SystemClock.elapsedRealtime() - this.d < 1000) {
            return;
        }
        f stats = this.f127944g.b();
        int i = fVarB.f127935a;
        int i2 = fVarB.f127936b;
        int i3 = fVarB.f127937c;
        long j2 = this.f127948m / ((long) 1000);
        StringBuilder sbW = com.google.android.gms.internal.mlkit_vision_face.a.w("{\"slow\":", i, i2, ",\"miss\":", ",\"miss_ui\":");
        sbW.append(i3);
        sbW.append(",\"start\":");
        sbW.append(j2);
        sbW.append("}");
        String string = sbW.toString();
        aoi.h hVar = this.f127942b;
        hVar.a("frames", string);
        if (stats != null) {
            Intrinsics.checkNotNullParameter(stats, "stats");
            int i5 = stats.f127935a;
            int i6 = stats.f127936b;
            int i21 = stats.f127937c;
            long j3 = stats.d;
            long j5 = stats.e;
            StringBuilder sbW2 = com.google.android.gms.internal.mlkit_vision_face.a.w("{\"slow\":", i5, i6, ",\"miss\":", ",\"miss_ui\":");
            sbW2.append(i21);
            sbW2.append(",\"miss_ms\":");
            sbW2.append(j3);
            sbW2.append(",\"miss_unit\":");
            sbW2.append(j5);
            sbW2.append("}");
            hVar.a("scroll_frames", sbW2.toString());
        }
        hVar.stop();
    }
}
