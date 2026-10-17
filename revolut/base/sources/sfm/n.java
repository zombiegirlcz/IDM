package sfm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends AtomicReference implements efm.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f262546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f262547b;

    public n(o oVar) {
        this.f262546a = oVar;
    }

    @Override // efm.l
    public final void onComplete() {
        o oVar = this.f262546a;
        AtomicReference atomicReference = oVar.e;
        while (!atomicReference.compareAndSet(this, null)) {
            if (atomicReference.get() != this) {
                return;
            }
        }
        oVar.b();
    }

    @Override // efm.l
    public final void onError(Throwable th10) {
        o oVar = this.f262546a;
        AtomicReference atomicReference = oVar.e;
        while (true) {
            if (atomicReference.compareAndSet(this, null)) {
                zfm.c cVar = oVar.d;
                cVar.getClass();
                if (zfm.h.a(cVar, th10)) {
                    if (!oVar.f262550c) {
                        oVar.f.dispose();
                        oVar.a();
                    }
                    oVar.b();
                    return;
                }
            } else if (atomicReference.get() != this) {
                break;
            }
        }
        mo3.a.m(th10);
    }

    @Override // efm.l
    public final void onSubscribe(ifm.c cVar) {
        lfm.d.e(this, cVar);
    }

    @Override // efm.l, efm.f0
    public final void onSuccess(Object obj2) {
        this.f262547b = obj2;
        this.f262546a.b();
    }
}
