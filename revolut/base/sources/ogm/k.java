package ogm;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes14.dex */
public final class k extends Completable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Completable f225227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Scheduler f225228c;

    public /* synthetic */ k(Completable completable, Scheduler scheduler, int i) {
        this.f225226a = i;
        this.f225227b = completable;
        this.f225228c = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public final void i(fgm.b bVar) {
        switch (this.f225226a) {
            case 0:
                this.f225227b.c(new j(bVar, this.f225228c));
                break;
            default:
                j jVar = new j(bVar, this.f225227b);
                bVar.onSubscribe(jVar);
                Disposable disposableC = this.f225228c.c(jVar);
                ggm.b bVar2 = (ggm.b) jVar.f225225c;
                bVar2.getClass();
                jgm.b.c(bVar2, disposableC);
                break;
        }
    }
}
