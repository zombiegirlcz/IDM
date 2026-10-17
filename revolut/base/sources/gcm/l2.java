package gcm;

import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public final class l2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p2 f142746b;

    public /* synthetic */ l2(p2 p2Var, int i) {
        this.f142745a = i;
        this.f142746b = p2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p2 p2Var;
        boolean z;
        boolean z3;
        long jNextLong;
        switch (this.f142745a) {
            case 0:
                synchronized (this.f142746b) {
                    try {
                        p2Var = this.f142746b;
                        o2 o2Var = p2Var.d;
                        o2 o2Var2 = o2.DISCONNECTED;
                        if (o2Var != o2Var2) {
                            p2Var.d = o2Var2;
                            z = true;
                        } else {
                            z = false;
                        }
                    } finally {
                    }
                    break;
                }
                if (z) {
                    p2Var.f142823c.f142780a.q(ecm.g2.f124807m.g("Keepalive failed. The connection is likely gone"));
                    return;
                }
                return;
            default:
                synchronized (this.f142746b) {
                    try {
                        p2 p2Var2 = this.f142746b;
                        p2Var2.f = null;
                        o2 o2Var3 = p2Var2.d;
                        o2 o2Var4 = o2.PING_SCHEDULED;
                        if (o2Var3 == o2Var4) {
                            p2Var2.d = o2.PING_SENT;
                            p2Var2.e = p2Var2.f142821a.schedule(p2Var2.f142824g, p2Var2.f142826j, TimeUnit.NANOSECONDS);
                            z3 = true;
                        } else {
                            if (o2Var3 == o2.PING_DELAYED) {
                                ScheduledExecutorService scheduledExecutorService = p2Var2.f142821a;
                                q2 q2Var = p2Var2.f142825h;
                                long j2 = p2Var2.i;
                                Stopwatch stopwatch = p2Var2.f142822b;
                                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                                p2Var2.f = scheduledExecutorService.schedule(q2Var, j2 - stopwatch.elapsed(timeUnit), timeUnit);
                                this.f142746b.d = o2Var4;
                            }
                            z3 = false;
                        }
                    } finally {
                    }
                    break;
                }
                if (z3) {
                    n2 n2Var = this.f142746b.f142823c;
                    hcm.t tVar = n2Var.f142780a;
                    m2 m2Var = new m2(n2Var);
                    Executor executorDirectExecutor = MoreExecutors.directExecutor();
                    synchronized (tVar.k) {
                        try {
                            boolean z4 = true;
                            Preconditions.checkState(tVar.i != null);
                            if (tVar.f151326y) {
                                v1.d(m2Var, executorDirectExecutor, tVar.k());
                                return;
                            }
                            v1 v1Var = tVar.f151325x;
                            if (v1Var != null) {
                                jNextLong = 0;
                                z4 = false;
                            } else {
                                jNextLong = tVar.d.nextLong();
                                Stopwatch stopwatch2 = (Stopwatch) tVar.e.get();
                                stopwatch2.start();
                                v1 v1Var2 = new v1(jNextLong, stopwatch2);
                                tVar.f151325x = v1Var2;
                                tVar.L.getClass();
                                v1Var = v1Var2;
                            }
                            if (z4) {
                                tVar.i.O8((int) (jNextLong >>> 32), (int) jNextLong, false);
                            }
                            v1Var.a(m2Var, executorDirectExecutor);
                            return;
                        } finally {
                        }
                    }
                }
                return;
        }
    }
}
