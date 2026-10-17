package tgm;

import fgm.p;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class h extends Single {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Single f271219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Scheduler f271220c;

    public /* synthetic */ h(Single single, Scheduler scheduler, int i) {
        this.f271218a = i;
        this.f271219b = single;
        this.f271220c = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void j(p pVar) {
        switch (this.f271218a) {
            case 0:
                this.f271219b.c(new qgm.i(pVar, this.f271220c, 1));
                break;
            case 1:
                ogm.j jVar = new ogm.j(pVar, this.f271219b);
                pVar.onSubscribe(jVar);
                Disposable disposableC = this.f271220c.c(jVar);
                ggm.b bVar = (ggm.b) jVar.f225225c;
                bVar.getClass();
                jgm.b.c(bVar, disposableC);
                break;
            default:
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                pgm.k kVar = new pgm.k(pVar);
                pVar.onSubscribe(kVar);
                jgm.b.c((AtomicReference) kVar.e, this.f271220c.d(kVar, 5000L, timeUnit));
                this.f271219b.c(kVar);
                break;
        }
    }

    public h(Single single, Scheduler scheduler) {
        this.f271218a = 2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f271219b = single;
        this.f271220c = scheduler;
    }
}
