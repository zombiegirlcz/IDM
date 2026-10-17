package sgm;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class u2 extends AtomicInteger implements Disposable, ObservableSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f263197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bhm.i f263198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s2 f263199c;
    public final boolean d;
    public volatile boolean e;
    public Throwable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f263200g = new AtomicBoolean();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f263201h = new AtomicReference();
    public final AtomicInteger i = new AtomicInteger();

    public u2(int i, s2 s2Var, Object obj2, boolean z) {
        this.f263198b = new bhm.i(i);
        this.f263199c = s2Var;
        this.f263197a = obj2;
        this.d = z;
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        bhm.i iVar = this.f263198b;
        boolean z = this.d;
        fgm.l lVar = (fgm.l) this.f263201h.get();
        int iAddAndGet = 1;
        while (true) {
            if (lVar != null) {
                while (true) {
                    boolean z3 = this.e;
                    Object objPoll = iVar.poll();
                    boolean z4 = objPoll == null;
                    bhm.i iVar2 = this.f263198b;
                    AtomicReference atomicReference = this.f263201h;
                    if (this.f263200g.get()) {
                        iVar2.clear();
                        atomicReference.lazySet(null);
                        if ((this.i.get() & 2) == 0) {
                            s2 s2Var = this.f263199c;
                            Object obj2 = this.f263197a;
                            s2Var.getClass();
                            if (obj2 == null) {
                                obj2 = s2.i;
                            }
                            s2Var.f.remove(obj2);
                            if (s2Var.decrementAndGet() == 0) {
                                s2Var.f263146g.dispose();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (z3) {
                        if (!z) {
                            Throwable th10 = this.f;
                            if (th10 != null) {
                                iVar2.clear();
                                atomicReference.lazySet(null);
                                lVar.onError(th10);
                                return;
                            } else if (z4) {
                                atomicReference.lazySet(null);
                                lVar.onComplete();
                                return;
                            }
                        } else if (z4) {
                            Throwable th11 = this.f;
                            atomicReference.lazySet(null);
                            if (th11 != null) {
                                lVar.onError(th11);
                                return;
                            } else {
                                lVar.onComplete();
                                return;
                            }
                        }
                    }
                    if (z4) {
                        break;
                    } else {
                        lVar.onNext(objPoll);
                    }
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
            if (lVar == null) {
                lVar = (fgm.l) this.f263201h.get();
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.f263200g.compareAndSet(false, true) && getAndIncrement() == 0) {
            this.f263201h.lazySet(null);
            if ((this.i.get() & 2) == 0) {
                s2 s2Var = this.f263199c;
                s2Var.getClass();
                Object obj2 = this.f263197a;
                if (obj2 == null) {
                    obj2 = s2.i;
                }
                s2Var.f.remove(obj2);
                if (s2Var.decrementAndGet() == 0) {
                    s2Var.f263146g.dispose();
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f263200g.get();
    }

    @Override // io.reactivex.rxjava3.core.ObservableSource
    public final void subscribe(fgm.l lVar) {
        AtomicInteger atomicInteger;
        int i;
        do {
            atomicInteger = this.i;
            i = atomicInteger.get();
            if ((i & 1) != 0) {
                jgm.c.c(new IllegalStateException("Only one Observer allowed!"), lVar);
                return;
            }
        } while (!atomicInteger.compareAndSet(i, i | 1));
        lVar.onSubscribe(this);
        AtomicReference atomicReference = this.f263201h;
        atomicReference.lazySet(lVar);
        if (this.f263200g.get()) {
            atomicReference.lazySet(null);
        } else {
            a();
        }
    }
}
