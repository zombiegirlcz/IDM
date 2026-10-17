package gcm;

import com.google.common.base.Preconditions;
import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public final class c6 {
    public static final c6 d = new c6(new m(10));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IdentityHashMap f142606a = new IdentityHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f142607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ScheduledExecutorService f142608c;

    public c6(m mVar) {
        this.f142607b = mVar;
    }

    public static Object a(b6 b6Var) {
        Object obj2;
        c6 c6Var = d;
        synchronized (c6Var) {
            try {
                a6 a6Var = (a6) c6Var.f142606a.get(b6Var);
                if (a6Var == null) {
                    a6Var = new a6(b6Var.create());
                    c6Var.f142606a.put(b6Var, a6Var);
                }
                ScheduledFuture scheduledFuture = a6Var.f142571c;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    a6Var.f142571c = null;
                }
                a6Var.f142570b++;
                obj2 = a6Var.f142569a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return obj2;
    }

    public static void b(b6 b6Var, Object obj2) {
        c6 c6Var = d;
        synchronized (c6Var) {
            try {
                a6 a6Var = (a6) c6Var.f142606a.get(b6Var);
                if (a6Var == null) {
                    throw new IllegalArgumentException("No cached instance found for " + b6Var);
                }
                Preconditions.checkArgument(obj2 == a6Var.f142569a, "Releasing the wrong instance");
                Preconditions.checkState(a6Var.f142570b > 0, "Refcount has already reached zero");
                int i = a6Var.f142570b - 1;
                a6Var.f142570b = i;
                if (i == 0) {
                    Preconditions.checkState(a6Var.f142571c == null, "Destroy task already scheduled");
                    if (c6Var.f142608c == null) {
                        c6Var.f142607b.getClass();
                        c6Var.f142608c = Executors.newSingleThreadScheduledExecutor(p1.e("grpc-shared-destroyer-%d"));
                    }
                    a6Var.f142571c = c6Var.f142608c.schedule(new q2(new byl.g(c6Var, a6Var, b6Var, obj2, false, 1)), 1L, TimeUnit.SECONDS);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
