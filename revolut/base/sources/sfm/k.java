package sfm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class k extends AtomicReference implements efm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f262537a;

    public k(l lVar) {
        this.f262537a = lVar;
    }

    @Override // efm.d
    public final void onComplete() {
        l lVar = this.f262537a;
        AtomicReference atomicReference = lVar.e;
        while (!atomicReference.compareAndSet(this, null)) {
            if (atomicReference.get() != this) {
                return;
            }
        }
        if (lVar.f) {
            zfm.c cVar = lVar.d;
            cVar.getClass();
            Throwable thB = zfm.h.b(cVar);
            if (thB == null) {
                lVar.f262539a.onComplete();
            } else {
                lVar.f262539a.onError(thB);
            }
        }
    }

    @Override // efm.d
    public final void onError(Throwable th10) {
        l lVar = this.f262537a;
        if (r6.b.u(lVar.e, this)) {
            zfm.c cVar = lVar.d;
            cVar.getClass();
            if (zfm.h.a(cVar, th10)) {
                if (lVar.f262541c) {
                    if (lVar.f) {
                        zfm.c cVar2 = lVar.d;
                        cVar2.getClass();
                        lVar.f262539a.onError(zfm.h.b(cVar2));
                        return;
                    }
                    return;
                }
                lVar.dispose();
                zfm.c cVar3 = lVar.d;
                cVar3.getClass();
                Throwable thB = zfm.h.b(cVar3);
                if (thB != zfm.h.f322035a) {
                    lVar.f262539a.onError(thB);
                    return;
                }
                return;
            }
        }
        mo3.a.m(th10);
    }

    @Override // efm.d
    public final void onSubscribe(ifm.c cVar) {
        lfm.d.e(this, cVar);
    }
}
