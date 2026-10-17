package sfm;

import efm.y;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends AtomicInteger implements y, ifm.c {
    public static final n i = new n(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f262548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.o f262549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f262550c;
    public final zfm.c d = new zfm.c();
    public final AtomicReference e = new AtomicReference();
    public ifm.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f262551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f262552h;

    public o(y yVar, kfm.o oVar, boolean z) {
        this.f262548a = yVar;
        this.f262549b = oVar;
        this.f262550c = z;
    }

    public final void a() {
        AtomicReference atomicReference = this.e;
        n nVar = i;
        n nVar2 = (n) atomicReference.getAndSet(nVar);
        if (nVar2 == null || nVar2 == nVar) {
            return;
        }
        lfm.d.a(nVar2);
    }

    public final void b() {
        if (getAndIncrement() != 0) {
            return;
        }
        y yVar = this.f262548a;
        zfm.c cVar = this.d;
        AtomicReference atomicReference = this.e;
        int iAddAndGet = 1;
        while (!this.f262552h) {
            if (cVar.get() != null && !this.f262550c) {
                yVar.onError(zfm.h.b(cVar));
                return;
            }
            boolean z = this.f262551g;
            n nVar = (n) atomicReference.get();
            boolean z3 = nVar == null;
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
            if (z3 || nVar.f262547b == null) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                while (!atomicReference.compareAndSet(nVar, null) && atomicReference.get() == nVar) {
                }
                yVar.onNext(nVar.f262547b);
            }
        }
    }

    @Override // ifm.c
    public final void dispose() {
        this.f262552h = true;
        this.f.dispose();
        a();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f262552h;
    }

    @Override // efm.y
    public final void onComplete() {
        this.f262551g = true;
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
        if (!this.f262550c) {
            a();
        }
        this.f262551g = true;
        b();
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        n nVar = i;
        AtomicReference atomicReference = this.e;
        n nVar2 = (n) atomicReference.get();
        if (nVar2 != null) {
            lfm.d.a(nVar2);
        }
        try {
            Object objApply = this.f262549b.apply(obj2);
            mfm.f.b(objApply, "The mapper returned a null MaybeSource");
            efm.n nVar3 = (efm.n) objApply;
            n nVar4 = new n(this);
            while (true) {
                n nVar5 = (n) atomicReference.get();
                if (nVar5 == nVar) {
                    return;
                }
                while (!atomicReference.compareAndSet(nVar5, nVar4)) {
                    if (atomicReference.get() != nVar5) {
                        break;
                    }
                }
                ((efm.k) nVar3).i(nVar4);
                return;
            }
        } catch (Throwable th10) {
            m70.a.u(th10);
            this.f.dispose();
            atomicReference.getAndSet(nVar);
            onError(th10);
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f, cVar)) {
            this.f = cVar;
            this.f262548a.onSubscribe(this);
        }
    }
}
