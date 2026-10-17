package pgm;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class c1 extends AtomicInteger implements fgm.d, Disposable {
    public static final b1[] k = new b1[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b1[] f236017l = new b1[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f236018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f236019b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f236020c = new AtomicBoolean();
    public final AtomicReference d = new AtomicReference(k);
    public final int e;
    public volatile bhm.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f236021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f236022h;
    public Throwable i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f236023j;

    public c1(AtomicReference atomicReference, int i) {
        this.f236018a = atomicReference;
        this.e = i;
    }

    public final boolean a(boolean z, boolean z3) {
        if (!z || !z3) {
            return false;
        }
        Throwable th10 = this.i;
        if (th10 != null) {
            f(th10);
            return true;
        }
        for (b1 b1Var : (b1[]) this.d.getAndSet(f236017l)) {
            if (!b1Var.b()) {
                b1Var.f236008a.onComplete();
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        if (getAndIncrement() != 0) {
            return;
        }
        bhm.g gVar = this.f;
        int i = this.f236023j;
        int i2 = this.e;
        int i3 = i2 - (i2 >> 2);
        boolean z = this.f236021g != 1;
        bhm.g gVar2 = gVar;
        int i5 = i;
        int iAddAndGet = 1;
        while (true) {
            if (gVar2 != null) {
                b1[] b1VarArr = (b1[]) this.d.get();
                long jMin = Long.MAX_VALUE;
                boolean z3 = false;
                for (b1 b1Var : b1VarArr) {
                    long j2 = b1Var.get();
                    if (j2 != Long.MIN_VALUE) {
                        jMin = Math.min(j2 - b1Var.f236010c, jMin);
                        z3 = true;
                    }
                }
                if (!z3) {
                    jMin = 0;
                }
                for (long j3 = 0; jMin != j3; j3 = 0) {
                    boolean z4 = this.f236022h;
                    try {
                        Object objPoll = gVar2.poll();
                        boolean z6 = objPoll == null;
                        if (a(z4, z6)) {
                            return;
                        }
                        if (z6) {
                            break;
                        }
                        for (b1 b1Var2 : b1VarArr) {
                            if (!b1Var2.b()) {
                                b1Var2.f236008a.onNext(objPoll);
                                b1Var2.f236010c++;
                            }
                        }
                        if (z && (i5 = i5 + 1) == i3) {
                            ((dom.b) this.f236019b.get()).a(i3);
                            i5 = 0;
                        }
                        jMin--;
                        if (b1VarArr != this.d.get()) {
                            break;
                        }
                    } catch (Throwable th10) {
                        ce9.m.F(th10);
                        ((dom.b) this.f236019b.get()).cancel();
                        gVar2.clear();
                        this.f236022h = true;
                        f(th10);
                        return;
                    }
                }
                if (a(this.f236022h, gVar2.isEmpty())) {
                    return;
                }
            }
            this.f236023j = i5;
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
            if (gVar2 == null) {
                gVar2 = this.f;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(b1 b1Var) {
        b1[] b1VarArr;
        while (true) {
            AtomicReference atomicReference = this.d;
            b1[] b1VarArr2 = (b1[]) atomicReference.get();
            int length = b1VarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (b1VarArr2[i] == b1Var) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                b1VarArr = k;
            } else {
                b1[] b1VarArr3 = new b1[length - 1];
                System.arraycopy(b1VarArr2, 0, b1VarArr3, 0, i);
                System.arraycopy(b1VarArr2, i + 1, b1VarArr3, i, (length - i) - 1);
                b1VarArr = b1VarArr3;
            }
            while (!atomicReference.compareAndSet(b1VarArr2, b1VarArr)) {
                if (atomicReference.get() != b1VarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        AtomicReference atomicReference;
        this.d.getAndSet(f236017l);
        do {
            atomicReference = this.f236018a;
            if (atomicReference.compareAndSet(this, null)) {
                break;
            }
        } while (atomicReference.get() == this);
        xgm.f.b(this.f236019b);
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (xgm.f.e(this.f236019b, bVar)) {
            if (bVar instanceof bhm.d) {
                bhm.d dVar = (bhm.d) bVar;
                int iB = dVar.b(7);
                if (iB == 1) {
                    this.f236021g = iB;
                    this.f = dVar;
                    this.f236022h = true;
                    b();
                    return;
                }
                if (iB == 2) {
                    this.f236021g = iB;
                    this.f = dVar;
                    bVar.a(this.e);
                    return;
                }
            }
            this.f = new bhm.h(this.e);
            bVar.a(this.e);
        }
    }

    public final void f(Throwable th10) {
        for (b1 b1Var : (b1[]) this.d.getAndSet(f236017l)) {
            if (!b1Var.b()) {
                b1Var.f236008a.onError(th10);
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.d.get() == f236017l;
    }

    @Override // dom.a
    public final void onComplete() {
        this.f236022h = true;
        b();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        if (this.f236022h) {
            jb3.l.v(th10);
            return;
        }
        this.i = th10;
        this.f236022h = true;
        b();
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.f236021g != 0 || this.f.offer(obj2)) {
            b();
        } else {
            onError(new QueueOverflowException());
        }
    }
}
