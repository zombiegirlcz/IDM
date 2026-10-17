package ogm;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class p extends Completable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f225240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Scheduler f225241b;

    public p(long j2, Scheduler scheduler) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f225240a = j2;
        this.f225241b = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public final void i(fgm.b bVar) {
        o oVar = new o(bVar, 0);
        bVar.onSubscribe(oVar);
        jgm.b.c(oVar, this.f225241b.d(oVar, this.f225240a, TimeUnit.MILLISECONDS));
    }
}
