package tfm;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class w2 extends AtomicInteger implements ifm.c, efm.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f270914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vfm.c f270915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u2 f270916c;
    public final boolean d;
    public volatile boolean e;
    public Throwable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f270917g = new AtomicBoolean();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f270918h = new AtomicBoolean();
    public final AtomicReference i = new AtomicReference();

    public w2(int i, u2 u2Var, Object obj2, boolean z) {
        this.f270915b = new vfm.c(i);
        this.f270916c = u2Var;
        this.f270914a = obj2;
        this.d = z;
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        vfm.c cVar = this.f270915b;
        boolean z = this.d;
        efm.y yVar = (efm.y) this.i.get();
        int iAddAndGet = 1;
        while (true) {
            if (yVar != null) {
                while (true) {
                    boolean z3 = this.e;
                    Object objPoll = cVar.poll();
                    boolean z4 = objPoll == null;
                    vfm.c cVar2 = this.f270915b;
                    AtomicReference atomicReference = this.i;
                    if (this.f270917g.get()) {
                        cVar2.clear();
                        u2 u2Var = this.f270916c;
                        Object obj2 = this.f270914a;
                        u2Var.getClass();
                        if (obj2 == null) {
                            obj2 = u2.i;
                        }
                        u2Var.f.remove(obj2);
                        if (u2Var.decrementAndGet() == 0) {
                            u2Var.f270861g.dispose();
                        }
                        atomicReference.lazySet(null);
                        return;
                    }
                    if (z3) {
                        if (!z) {
                            Throwable th10 = this.f;
                            if (th10 != null) {
                                cVar2.clear();
                                atomicReference.lazySet(null);
                                yVar.onError(th10);
                                return;
                            } else if (z4) {
                                atomicReference.lazySet(null);
                                yVar.onComplete();
                                return;
                            }
                        } else if (z4) {
                            Throwable th11 = this.f;
                            atomicReference.lazySet(null);
                            if (th11 != null) {
                                yVar.onError(th11);
                                return;
                            } else {
                                yVar.onComplete();
                                return;
                            }
                        }
                    }
                    if (z4) {
                        break;
                    } else {
                        yVar.onNext(objPoll);
                    }
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
            if (yVar == null) {
                yVar = (efm.y) this.i.get();
            }
        }
    }

    @Override // ifm.c
    public final void dispose() {
        if (this.f270917g.compareAndSet(false, true) && getAndIncrement() == 0) {
            this.i.lazySet(null);
            u2 u2Var = this.f270916c;
            u2Var.getClass();
            Object obj2 = this.f270914a;
            if (obj2 == null) {
                obj2 = u2.i;
            }
            u2Var.f.remove(obj2);
            if (u2Var.decrementAndGet() == 0) {
                u2Var.f270861g.dispose();
            }
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f270917g.get();
    }

    @Override // efm.w
    public final void subscribe(efm.y yVar) {
        if (!this.f270918h.compareAndSet(false, true)) {
            lfm.e.d(new IllegalStateException("Only one Observer allowed!"), yVar);
            return;
        }
        yVar.onSubscribe(this);
        AtomicReference atomicReference = this.i;
        atomicReference.lazySet(yVar);
        if (this.f270917g.get()) {
            atomicReference.lazySet(null);
        } else {
            a();
        }
    }
}
