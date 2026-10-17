package sfm;

import efm.d0;
import efm.h0;
import efm.y;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class r extends AtomicInteger implements y, ifm.c {
    public static final q i = new q(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f262557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.o f262558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f262559c;
    public final zfm.c d = new zfm.c();
    public final AtomicReference e = new AtomicReference();
    public ifm.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f262560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f262561h;

    public r(y yVar, kfm.o oVar, boolean z) {
        this.f262557a = yVar;
        this.f262558b = oVar;
        this.f262559c = z;
    }

    public final void a() {
        AtomicReference atomicReference = this.e;
        q qVar = i;
        q qVar2 = (q) atomicReference.getAndSet(qVar);
        if (qVar2 == null || qVar2 == qVar) {
            return;
        }
        lfm.d.a(qVar2);
    }

    public final void b() {
        if (getAndIncrement() != 0) {
            return;
        }
        y yVar = this.f262557a;
        zfm.c cVar = this.d;
        AtomicReference atomicReference = this.e;
        int iAddAndGet = 1;
        while (!this.f262561h) {
            if (cVar.get() != null && !this.f262559c) {
                yVar.onError(zfm.h.b(cVar));
                return;
            }
            boolean z = this.f262560g;
            q qVar = (q) atomicReference.get();
            boolean z3 = qVar == null;
            if (z && z3) {
                Throwable thB = zfm.h.b(cVar);
                if (thB != null) {
                    yVar.onError(thB);
                    return;
                } else {
                    yVar.onComplete();
                    return;
                }
            }
            if (z3 || qVar.f262556b == null) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                while (!atomicReference.compareAndSet(qVar, null) && atomicReference.get() == qVar) {
                }
                yVar.onNext(qVar.f262556b);
            }
        }
    }

    @Override // ifm.c
    public final void dispose() {
        this.f262561h = true;
        this.f.dispose();
        a();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f262561h;
    }

    @Override // efm.y
    public final void onComplete() {
        this.f262560g = true;
        b();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        zfm.c cVar = this.d;
        cVar.getClass();
        if (!zfm.h.a(cVar, th10)) {
            mo3.a.m(th10);
            return;
        }
        if (!this.f262559c) {
            a();
        }
        this.f262560g = true;
        b();
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        q qVar = i;
        AtomicReference atomicReference = this.e;
        q qVar2 = (q) atomicReference.get();
        if (qVar2 != null) {
            lfm.d.a(qVar2);
        }
        try {
            Object objApply = this.f262558b.apply(obj2);
            mfm.f.b(objApply, "The mapper returned a null SingleSource");
            h0 h0Var = (h0) objApply;
            q qVar3 = new q(this);
            while (true) {
                q qVar4 = (q) atomicReference.get();
                if (qVar4 == qVar) {
                    return;
                }
                while (!atomicReference.compareAndSet(qVar4, qVar3)) {
                    if (atomicReference.get() != qVar4) {
                        break;
                    }
                }
                ((d0) h0Var).q(qVar3);
                return;
            }
        } catch (Throwable th10) {
            m70.a.u(th10);
            this.f.dispose();
            atomicReference.getAndSet(qVar);
            onError(th10);
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f, cVar)) {
            this.f = cVar;
            this.f262557a.onSubscribe(this);
        }
    }
}
