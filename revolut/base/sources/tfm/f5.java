package tfm;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class f5 extends AtomicInteger implements efm.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lfm.b f270459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final efm.w f270460c;
    public final kfm.p d;
    public long e;

    public f5(efm.y yVar, long j2, kfm.p pVar, lfm.b bVar, efm.w wVar) {
        this.f270458a = yVar;
        this.f270459b = bVar;
        this.f270460c = wVar;
        this.d = pVar;
        this.e = j2;
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!this.f270459b.isDisposed()) {
                this.f270460c.subscribe(this);
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // efm.y
    public final void onComplete() {
        this.f270458a.onComplete();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        long j2 = this.e;
        if (j2 != Long.MAX_VALUE) {
            this.e = j2 - 1;
        }
        efm.y yVar = this.f270458a;
        if (j2 == 0) {
            yVar.onError(th10);
            return;
        }
        try {
            if (this.d.test(th10)) {
                a();
            } else {
                yVar.onError(th10);
            }
        } catch (Throwable th11) {
            m70.a.u(th11);
            yVar.onError(new CompositeException(th10, th11));
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        this.f270458a.onNext(obj2);
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        lfm.b bVar = this.f270459b;
        bVar.getClass();
        lfm.d.c(bVar, cVar);
    }
}
