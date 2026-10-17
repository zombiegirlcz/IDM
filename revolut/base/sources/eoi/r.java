package eoi;

import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes10.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f127969a = new AtomicReference(q.NOT_STARTED);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ConcurrentHashMap f127970b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f127971c = new ConcurrentHashMap();
    public static volatile long d;
    public static volatile long e;
    public static volatile String f;

    private r() {
    }

    public static void a(String name, boolean z, Object value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        q qVar = (q) f127969a.get();
        if (qVar == q.ACTIVE || (qVar == q.PENDING && z)) {
            f127970b.put(name, value);
        }
    }

    public static void c(String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        AtomicReference atomicReference = f127969a;
        q qVar = q.PENDING;
        q qVar2 = q.CANCELLED;
        while (!atomicReference.compareAndSet(qVar, qVar2)) {
            if (atomicReference.get() != qVar) {
                return;
            }
        }
        f = reason;
    }

    public static Map d() {
        return foh.i.q(new Pair("newMetricState", ((q) f127969a.get()).name()), new Pair("newMetricStarted", Long.valueOf(SystemClock.uptimeMillis() - d)), new Pair("newMetricCancellationReason", f));
    }

    public static void e(String name, boolean z) {
        Object next;
        Intrinsics.checkNotNullParameter(name, "name");
        q qVar = (q) f127969a.get();
        if (qVar == q.ACTIVE || (qVar == q.PENDING && z)) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            Long lValueOf = Long.valueOf(jUptimeMillis);
            ConcurrentHashMap concurrentHashMap = f127971c;
            if (((Long) concurrentHashMap.putIfAbsent(name, lValueOf)) != null) {
                vim.f it8 = new IntRange(2, 10, 1).iterator();
                while (true) {
                    if (!it8.f289625c) {
                        next = null;
                        break;
                    } else {
                        next = it8.next();
                        if (concurrentHashMap.putIfAbsent(p.a.o(name, ((Number) next).intValue()), Long.valueOf(jUptimeMillis)) == null) {
                            break;
                        }
                    }
                }
            }
        }
    }

    public static void g() {
        AtomicReference atomicReference = f127969a;
        q qVar = q.NOT_STARTED;
        q qVar2 = q.PENDING;
        while (!atomicReference.compareAndSet(qVar, qVar2)) {
            if (atomicReference.get() != qVar) {
                return;
            }
        }
        d = SystemClock.uptimeMillis();
    }
}
