package sfm;

import efm.y;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class l implements y, ifm.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k f262538h = new k(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.d f262539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.o f262540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f262541c;
    public final zfm.c d = new zfm.c();
    public final AtomicReference e = new AtomicReference();
    public volatile boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ifm.c f262542g;

    public l(efm.d dVar, kfm.o oVar, boolean z) {
        this.f262539a = dVar;
        this.f262540b = oVar;
        this.f262541c = z;
    }

    @Override // ifm.c
    public final void dispose() {
        this.f262542g.dispose();
        AtomicReference atomicReference = this.e;
        k kVar = f262538h;
        k kVar2 = (k) atomicReference.getAndSet(kVar);
        if (kVar2 == null || kVar2 == kVar) {
            return;
        }
        lfm.d.a(kVar2);
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.e.get() == f262538h;
    }

    @Override // efm.y
    public final void onComplete() {
        this.f = true;
        if (this.e.get() == null) {
            zfm.c cVar = this.d;
            cVar.getClass();
            Throwable thB = zfm.h.b(cVar);
            if (thB == null) {
                this.f262539a.onComplete();
            } else {
                this.f262539a.onError(thB);
            }
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        zfm.c cVar = this.d;
        cVar.getClass();
        if (!zfm.h.a(cVar, th10)) {
            mo3.a.m(th10);
            return;
        }
        if (this.f262541c) {
            onComplete();
            return;
        }
        AtomicReference atomicReference = this.e;
        k kVar = f262538h;
        k kVar2 = (k) atomicReference.getAndSet(kVar);
        if (kVar2 != null && kVar2 != kVar) {
            lfm.d.a(kVar2);
        }
        Throwable thB = zfm.h.b(cVar);
        if (thB != zfm.h.f322035a) {
            this.f262539a.onError(thB);
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        try {
            Object objApply = this.f262540b.apply(obj2);
            mfm.f.b(objApply, "The mapper returned a null CompletableSource");
            efm.f fVar = (efm.f) objApply;
            k kVar = new k(this);
            while (true) {
                AtomicReference atomicReference = this.e;
                k kVar2 = (k) atomicReference.get();
                if (kVar2 == f262538h) {
                    return;
                }
                while (!atomicReference.compareAndSet(kVar2, kVar)) {
                    if (atomicReference.get() != kVar2) {
                        break;
                    }
                }
                if (kVar2 != null) {
                    lfm.d.a(kVar2);
                }
                fVar.d(kVar);
                return;
            }
        } catch (Throwable th10) {
            m70.a.u(th10);
            this.f262542g.dispose();
            onError(th10);
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f262542g, cVar)) {
            this.f262542g = cVar;
            this.f262539a.onSubscribe(this);
        }
    }
}
