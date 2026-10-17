package sgm;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class f4 extends AtomicInteger implements fgm.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f262828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ggm.b f262829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ObservableSource f262830c;
    public long d;

    public f4(fgm.l lVar, long j2, ggm.b bVar, ObservableSource observableSource) {
        this.f262828a = lVar;
        this.f262829b = bVar;
        this.f262830c = observableSource;
        this.d = j2;
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!this.f262829b.isDisposed()) {
                this.f262830c.subscribe(this);
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // fgm.l
    public final void onComplete() {
        long j2 = this.d;
        if (j2 != Long.MAX_VALUE) {
            this.d = j2 - 1;
        }
        if (j2 != 0) {
            a();
        } else {
            this.f262828a.onComplete();
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        this.f262828a.onError(th10);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        this.f262828a.onNext(obj2);
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        ggm.b bVar = this.f262829b;
        bVar.getClass();
        jgm.b.c(bVar, disposable);
    }
}
