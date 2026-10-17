package sgm;

import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class s4 implements l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f263149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f263150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f263151c;
    public final Scheduler d;
    public final boolean e;

    public s4(int i, long j2, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        this.f263149a = i;
        this.f263150b = j2;
        this.f263151c = timeUnit;
        this.d = scheduler;
        this.e = z;
    }

    @Override // sgm.l4
    public final o4 call() {
        return new t4(this.f263149a, this.f263150b, this.f263151c, this.d, this.e);
    }
}
