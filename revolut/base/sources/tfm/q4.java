package tfm;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class q4 extends AtomicInteger implements efm.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lfm.b f270750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final efm.w f270751c;

    public q4(efm.y yVar, lfm.b bVar, efm.w wVar) {
        this.f270749a = yVar;
        this.f270750b = bVar;
        this.f270751c = wVar;
    }

    @Override // efm.y
    public final void onComplete() {
        try {
            throw null;
        } catch (Throwable th10) {
            m70.a.u(th10);
            this.f270749a.onError(th10);
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        this.f270749a.onError(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        this.f270749a.onNext(obj2);
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        lfm.b bVar = this.f270750b;
        bVar.getClass();
        lfm.d.c(bVar, cVar);
    }
}
