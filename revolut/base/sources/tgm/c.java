package tgm;

import fgm.p;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class c extends Single {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Single f271203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f271204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f271205c;
    public final Scheduler d;

    public c(Single single, long j2, TimeUnit timeUnit, Scheduler scheduler) {
        this.f271203a = single;
        this.f271204b = j2;
        this.f271205c = timeUnit;
        this.d = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void j(p pVar) {
        ggm.b bVar = new ggm.b();
        pVar.onSubscribe(bVar);
        this.f271203a.c(new k18.c(24, bVar, this, pVar));
    }
}
