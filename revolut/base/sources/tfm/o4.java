package tfm;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class o4 extends AtomicInteger implements efm.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lfm.b f270701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final efm.w f270702c;
    public long d;

    public o4(efm.y yVar, long j2, lfm.b bVar, efm.w wVar) {
        this.f270700a = yVar;
        this.f270701b = bVar;
        this.f270702c = wVar;
        this.d = j2;
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!this.f270701b.isDisposed()) {
                this.f270702c.subscribe(this);
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // efm.y
    public final void onComplete() {
        long j2 = this.d;
        if (j2 != Long.MAX_VALUE) {
            this.d = j2 - 1;
        }
        if (j2 != 0) {
            a();
        } else {
            this.f270700a.onComplete();
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        this.f270700a.onError(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        this.f270700a.onNext(obj2);
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        lfm.b bVar = this.f270701b;
        bVar.getClass();
        lfm.d.c(bVar, cVar);
    }
}
