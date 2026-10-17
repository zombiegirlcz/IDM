package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class d3 implements igm.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Observable f262765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f262766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f262767c;
    public final TimeUnit d;
    public final Scheduler e;
    public final boolean f;

    public d3(int i, long j2, Observable observable, Scheduler scheduler, TimeUnit timeUnit, boolean z) {
        this.f262765a = observable;
        this.f262766b = i;
        this.f262767c = j2;
        this.d = timeUnit;
        this.e = scheduler;
        this.f = z;
    }

    @Override // igm.q
    public final Object get() {
        return this.f262765a.replay(this.f262766b, this.f262767c, this.d, this.e, this.f);
    }
}
