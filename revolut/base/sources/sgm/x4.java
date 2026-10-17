package sgm;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class x4 extends AtomicInteger implements fgm.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f263274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ggm.b f263275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ObservableSource f263276c;
    public final igm.d d;
    public int e;

    public x4(fgm.l lVar, igm.d dVar, ggm.b bVar, ObservableSource observableSource) {
        this.f263274a = lVar;
        this.f263275b = bVar;
        this.f263276c = observableSource;
        this.d = dVar;
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!this.f263275b.isDisposed()) {
                this.f263276c.subscribe(this);
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // fgm.l
    public final void onComplete() {
        this.f263274a.onComplete();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        fgm.l lVar = this.f263274a;
        try {
            igm.d dVar = this.d;
            int i = this.e + 1;
            this.e = i;
            Integer numValueOf = Integer.valueOf(i);
            ((dcl.q) dVar).getClass();
            if (numValueOf.equals(th10)) {
                a();
            } else {
                lVar.onError(th10);
            }
        } catch (Throwable th11) {
            ce9.m.F(th11);
            lVar.onError(new CompositeException(th10, th11));
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        this.f263274a.onNext(obj2);
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        ggm.b bVar = this.f263275b;
        bVar.getClass();
        jgm.b.c(bVar, disposable);
    }
}
