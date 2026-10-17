package sgm;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class y4 extends AtomicInteger implements fgm.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f263299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ggm.b f263300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ObservableSource f263301c;
    public final igm.p d;
    public long e;

    public y4(fgm.l lVar, long j2, igm.p pVar, ggm.b bVar, ObservableSource observableSource) {
        this.f263299a = lVar;
        this.f263300b = bVar;
        this.f263301c = observableSource;
        this.d = pVar;
        this.e = j2;
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!this.f263300b.isDisposed()) {
                this.f263301c.subscribe(this);
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // fgm.l
    public final void onComplete() {
        this.f263299a.onComplete();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        long j2 = this.e;
        if (j2 != Long.MAX_VALUE) {
            this.e = j2 - 1;
        }
        fgm.l lVar = this.f263299a;
        if (j2 == 0) {
            lVar.onError(th10);
            return;
        }
        try {
            if (this.d.test(th10)) {
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
        this.f263299a.onNext(obj2);
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        ggm.b bVar = this.f263300b;
        bVar.getClass();
        jgm.b.c(bVar, disposable);
    }
}
