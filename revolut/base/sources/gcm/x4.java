package gcm;

import com.google.common.base.Stopwatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes13.dex */
public final class x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f142960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ecm.k2 f142961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u2 f142962c;
    public final Stopwatch d;
    public long e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ScheduledFuture f142963g;

    public x4(u2 u2Var, ecm.k2 k2Var, ScheduledExecutorService scheduledExecutorService, Stopwatch stopwatch) {
        this.f142962c = u2Var;
        this.f142961b = k2Var;
        this.f142960a = scheduledExecutorService;
        this.d = stopwatch;
        stopwatch.start();
    }
}
