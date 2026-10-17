package ecm;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import gcm.a3;
import gcm.s5;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes13.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f124867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a2 f124868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k2 f124869c;
    public final s5 d;
    public final ScheduledExecutorService e;
    public final g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a3 f124870g;

    public r1(Integer num, a2 a2Var, k2 k2Var, s5 s5Var, ScheduledExecutorService scheduledExecutorService, g gVar, a3 a3Var) {
        this.f124867a = ((Integer) Preconditions.checkNotNull(num, "defaultPort not set")).intValue();
        this.f124868b = (a2) Preconditions.checkNotNull(a2Var, "proxyDetector not set");
        this.f124869c = (k2) Preconditions.checkNotNull(k2Var, "syncContext not set");
        this.d = (s5) Preconditions.checkNotNull(s5Var, "serviceConfigParser not set");
        this.e = scheduledExecutorService;
        this.f = gVar;
        this.f124870g = a3Var;
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("defaultPort", this.f124867a).add("proxyDetector", this.f124868b).add("syncContext", this.f124869c).add("serviceConfigParser", this.d).add("scheduledExecutorService", this.e).add("channelLogger", this.f).add("executor", this.f124870g).add("overrideAuthority", (Object) null).toString();
    }
}
