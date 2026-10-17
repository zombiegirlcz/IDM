package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class g3 implements igm.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observable f262854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f262855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f262856c;
    public final Scheduler d;
    public final boolean e;

    public g3(Observable observable, long j2, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        this.f262854a = observable;
        this.f262855b = j2;
        this.f262856c = timeUnit;
        this.d = scheduler;
        this.e = z;
    }

    @Override // igm.q
    public final Object get() {
        return this.f262854a.replay(this.f262855b, this.f262856c, this.d, this.e);
    }
}
