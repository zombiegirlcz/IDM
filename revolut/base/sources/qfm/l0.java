package qfm;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 extends AtomicInteger implements efm.j, dom.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final k0[] f245454q = new k0[0];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final k0[] f245455r = new k0[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f245456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.o f245457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f245458c;
    public final int d;
    public volatile nfm.i e;
    public volatile boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zfm.c f245459g = new zfm.c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f245460h;
    public final AtomicReference i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicLong f245461j;
    public dom.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f245462l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f245463m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f245464n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f245465p;

    public l0(dom.a aVar, kfm.o oVar, int i, int i2) {
        AtomicReference atomicReference = new AtomicReference();
        this.i = atomicReference;
        this.f245461j = new AtomicLong();
        this.f245456a = aVar;
        this.f245457b = oVar;
        this.f245458c = i;
        this.d = i2;
        this.f245465p = Math.max(1, i >> 1);
        atomicReference.lazySet(f245454q);
    }

    @Override // dom.b
    public final void a(long j2) {
        if (yfm.g.f(j2)) {
            com.bumptech.glide.d.a(this.f245461j, j2);
            c();
        }
    }

    public final boolean b() {
        if (this.f245460h) {
            nfm.i iVar = this.e;
            if (iVar != null) {
                iVar.clear();
                return true;
            }
        } else {
            if (this.f245459g.get() == null) {
                return false;
            }
            nfm.i iVar2 = this.e;
            if (iVar2 != null) {
                iVar2.clear();
            }
            zfm.c cVar = this.f245459g;
            cVar.getClass();
            Throwable thB = zfm.h.b(cVar);
            if (thB != zfm.h.f322035a) {
                this.f245456a.onError(thB);
            }
        }
        return true;
    }

    public final void c() {
        if (getAndIncrement() == 0) {
            f();
        }
    }

    @Override // dom.b
    public final void cancel() {
        nfm.i iVar;
        k0[] k0VarArr;
        if (this.f245460h) {
            return;
        }
        this.f245460h = true;
        this.k.cancel();
        AtomicReference atomicReference = this.i;
        k0[] k0VarArr2 = (k0[]) atomicReference.get();
        k0[] k0VarArr3 = f245455r;
        if (k0VarArr2 != k0VarArr3 && (k0VarArr = (k0[]) atomicReference.getAndSet(k0VarArr3)) != k0VarArr3) {
            for (k0 k0Var : k0VarArr) {
                k0Var.getClass();
                yfm.g.b(k0Var);
            }
            zfm.c cVar = this.f245459g;
            cVar.getClass();
            Throwable thB = zfm.h.b(cVar);
            if (thB != null && thB != zfm.h.f322035a) {
                mo3.a.m(thB);
            }
        }
        if (getAndIncrement() != 0 || (iVar = this.e) == null) {
            return;
        }
        iVar.clear();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (yfm.g.h(this.k, bVar)) {
            this.k = bVar;
            this.f245456a.e(this);
            if (this.f245460h) {
                return;
            }
            int i = this.f245458c;
            if (i == Integer.MAX_VALUE) {
                bVar.a(Long.MAX_VALUE);
            } else {
                bVar.a(i);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x018f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qfm.l0.f():void");
    }

    public final nfm.i h() {
        nfm.i cVar = this.e;
        if (cVar == null) {
            cVar = this.f245458c == Integer.MAX_VALUE ? new vfm.c(this.d) : new vfm.b(this.f245458c);
            this.e = cVar;
        }
        return cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(k0 k0Var) {
        k0[] k0VarArr;
        while (true) {
            AtomicReference atomicReference = this.i;
            k0[] k0VarArr2 = (k0[]) atomicReference.get();
            int length = k0VarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (k0VarArr2[i] == k0Var) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                k0VarArr = f245454q;
            } else {
                k0[] k0VarArr3 = new k0[length - 1];
                System.arraycopy(k0VarArr2, 0, k0VarArr3, 0, i);
                System.arraycopy(k0VarArr2, i + 1, k0VarArr3, i, (length - i) - 1);
                k0VarArr = k0VarArr3;
            }
            while (!atomicReference.compareAndSet(k0VarArr2, k0VarArr)) {
                if (atomicReference.get() != k0VarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // dom.a
    public final void onComplete() {
        if (this.f) {
            return;
        }
        this.f = true;
        c();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        if (this.f) {
            mo3.a.m(th10);
            return;
        }
        zfm.c cVar = this.f245459g;
        cVar.getClass();
        if (!zfm.h.a(cVar, th10)) {
            mo3.a.m(th10);
            return;
        }
        this.f = true;
        for (k0 k0Var : (k0[]) this.i.getAndSet(f245455r)) {
            k0Var.getClass();
            yfm.g.b(k0Var);
        }
        c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.f) {
            return;
        }
        try {
            Object objApply = this.f245457b.apply(obj2);
            mfm.f.b(objApply, "The mapper returned a null Publisher");
            Publisher publisher = (Publisher) objApply;
            if (!(publisher instanceof Callable)) {
                long j2 = this.f245462l;
                this.f245462l = 1 + j2;
                k0 k0Var = new k0(this, j2);
                AtomicReference atomicReference = this.i;
                while (true) {
                    k0[] k0VarArr = (k0[]) atomicReference.get();
                    if (k0VarArr == f245455r) {
                        yfm.g.b(k0Var);
                        return;
                    }
                    int length = k0VarArr.length;
                    k0[] k0VarArr2 = new k0[length + 1];
                    System.arraycopy(k0VarArr, 0, k0VarArr2, 0, length);
                    k0VarArr2[length] = k0Var;
                    while (!atomicReference.compareAndSet(k0VarArr, k0VarArr2)) {
                        if (atomicReference.get() != k0VarArr) {
                            break;
                        }
                    }
                    publisher.a(k0Var);
                    return;
                }
            }
            try {
                Object objCall = ((Callable) publisher).call();
                if (objCall == null) {
                    if (this.f245458c == Integer.MAX_VALUE || this.f245460h) {
                        return;
                    }
                    int i = this.o + 1;
                    this.o = i;
                    int i2 = this.f245465p;
                    if (i == i2) {
                        this.o = 0;
                        this.k.a(i2);
                        return;
                    }
                    return;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    long j3 = this.f245461j.get();
                    nfm.i iVarH = this.e;
                    if (j3 == 0 || !(iVarH == null || iVarH.isEmpty())) {
                        if (iVarH == null) {
                            iVarH = h();
                        }
                        if (!iVarH.offer(objCall)) {
                            onError(new IllegalStateException("Scalar queue full?!"));
                            return;
                        }
                    } else {
                        this.f245456a.onNext(objCall);
                        if (j3 != Long.MAX_VALUE) {
                            this.f245461j.decrementAndGet();
                        }
                        if (this.f245458c != Integer.MAX_VALUE && !this.f245460h) {
                            int i3 = this.o + 1;
                            this.o = i3;
                            int i5 = this.f245465p;
                            if (i3 == i5) {
                                this.o = 0;
                                this.k.a(i5);
                            }
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                } else if (!h().offer(objCall)) {
                    onError(new IllegalStateException("Scalar queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
                f();
            } catch (Throwable th10) {
                m70.a.u(th10);
                zfm.c cVar = this.f245459g;
                cVar.getClass();
                zfm.h.a(cVar, th10);
                c();
            }
        } catch (Throwable th11) {
            m70.a.u(th11);
            this.k.cancel();
            onError(th11);
        }
    }
}
