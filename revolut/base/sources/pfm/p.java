package pfm;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends AtomicBoolean implements efm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ifm.b f235750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efm.d f235751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f235752c;

    public p(efm.d dVar, ifm.b bVar, AtomicInteger atomicInteger) {
        this.f235751b = dVar;
        this.f235750a = bVar;
        this.f235752c = atomicInteger;
    }

    @Override // efm.d
    public final void onComplete() {
        if (this.f235752c.decrementAndGet() == 0 && compareAndSet(false, true)) {
            this.f235751b.onComplete();
        }
    }

    @Override // efm.d
    public final void onError(Throwable th10) {
        this.f235750a.dispose();
        if (compareAndSet(false, true)) {
            this.f235751b.onError(th10);
        } else {
            mo3.a.m(th10);
        }
    }

    @Override // efm.d
    public final void onSubscribe(ifm.c cVar) {
        this.f235750a.a(cVar);
    }
}
