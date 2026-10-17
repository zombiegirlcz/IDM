package sf;

import java.util.Iterator;
import java.util.Map;
import xf.t0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qf.a f262249b = qf.a.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f262250a;

    public d(t0 t0Var) {
        this.f262250a = t0Var;
    }

    public static boolean d(t0 t0Var, int i) {
        if (t0Var != null) {
            qf.a aVar = f262249b;
            if (i > 1) {
                aVar.f("Exceed MAX_SUBTRACE_DEEP:1");
                return false;
            }
            for (Map.Entry<String, Long> entry : t0Var.getCountersMap().entrySet()) {
                String key = entry.getKey();
                if (key != null) {
                    String strTrim = key.trim();
                    if (strTrim.isEmpty()) {
                        aVar.f("counterId is empty");
                    } else if (strTrim.length() > 100) {
                        aVar.f("counterId exceeded max length 100");
                    } else if (entry.getValue() == null) {
                        aVar.f("invalid CounterValue:" + entry.getValue());
                        return false;
                    }
                }
                aVar.f("invalid CounterId:" + entry.getKey());
                return false;
            }
            Iterator<t0> it8 = t0Var.getSubtracesList().iterator();
            while (it8.hasNext()) {
                if (!d(it8.next(), i + 1)) {
                }
            }
            return true;
        }
        return false;
    }

    public static boolean e(t0 t0Var, int i) {
        Long l2;
        qf.a aVar = f262249b;
        if (t0Var == null) {
            aVar.f("TraceMetric is null");
            return false;
        }
        if (i > 1) {
            aVar.f("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        String name = t0Var.getName();
        if (name != null) {
            String strTrim = name.trim();
            if (!strTrim.isEmpty() && strTrim.length() <= 100) {
                if (t0Var.getDurationUs() <= 0) {
                    aVar.f("invalid TraceDuration:" + t0Var.getDurationUs());
                    return false;
                }
                if (!t0Var.hasClientStartTimeUs()) {
                    aVar.f("clientStartTimeUs is null.");
                    return false;
                }
                if (t0Var.getName().startsWith("_st_") && ((l2 = t0Var.getCountersMap().get(com.google.firebase.perf.util.a.FRAMES_TOTAL.toString())) == null || l2.compareTo((Long) 0L) <= 0)) {
                    aVar.f("non-positive totalFrames in screen trace " + t0Var.getName());
                    return false;
                }
                Iterator<t0> it8 = t0Var.getSubtracesList().iterator();
                while (it8.hasNext()) {
                    if (!e(it8.next(), i + 1)) {
                        return false;
                    }
                }
                for (Map.Entry<String, String> entry : t0Var.getCustomAttributesMap().entrySet()) {
                    try {
                        e.b(entry.getKey(), entry.getValue());
                    } catch (IllegalArgumentException e) {
                        aVar.f(e.getLocalizedMessage());
                        return false;
                    }
                }
                return true;
            }
        }
        aVar.f("invalid TraceId:" + t0Var.getName());
        return false;
    }

    @Override // sf.e
    public final boolean a() {
        t0 t0Var = this.f262250a;
        boolean zE = e(t0Var, 0);
        qf.a aVar = f262249b;
        if (!zE) {
            aVar.f("Invalid Trace:" + t0Var.getName());
            return false;
        }
        if (t0Var.getCountersCount() <= 0) {
            Iterator<t0> it8 = t0Var.getSubtracesList().iterator();
            while (it8.hasNext()) {
                if (it8.next().getCountersCount() > 0) {
                }
            }
            return true;
        }
        if (d(t0Var, 0)) {
            return true;
        }
        aVar.f("Invalid Counters for Trace:" + t0Var.getName());
        return false;
    }
}
