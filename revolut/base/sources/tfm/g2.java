package tfm;

import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class g2 extends AtomicInteger implements ifm.c, efm.y {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final f2[] f270472q = new f2[0];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final f2[] f270473r = new f2[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.o f270475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f270476c;
    public final int d;
    public final int e;
    public volatile nfm.i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f270477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zfm.c f270478h = new zfm.c();
    public volatile boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference f270479j;
    public ifm.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f270480l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f270481m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f270482n;
    public final ArrayDeque o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f270483p;

    public g2(int i, int i2, efm.y yVar, kfm.o oVar, boolean z) {
        this.f270474a = yVar;
        this.f270475b = oVar;
        this.f270476c = z;
        this.d = i;
        this.e = i2;
        if (i != Integer.MAX_VALUE) {
            this.o = new ArrayDeque(i);
        }
        this.f270479j = new AtomicReference(f270472q);
    }

    public final boolean a() {
        if (!this.i) {
            Throwable th10 = (Throwable) this.f270478h.get();
            if (this.f270476c || th10 == null) {
                return false;
            }
            b();
            zfm.c cVar = this.f270478h;
            cVar.getClass();
            Throwable thB = zfm.h.b(cVar);
            if (thB != zfm.h.f322035a) {
                this.f270474a.onError(thB);
            }
        }
        return true;
    }

    public final boolean b() {
        f2[] f2VarArr;
        this.k.dispose();
        AtomicReference atomicReference = this.f270479j;
        f2[] f2VarArr2 = (f2[]) atomicReference.get();
        f2[] f2VarArr3 = f270473r;
        if (f2VarArr2 == f2VarArr3 || (f2VarArr = (f2[]) atomicReference.getAndSet(f2VarArr3)) == f2VarArr3) {
            return false;
        }
        for (f2 f2Var : f2VarArr) {
            f2Var.getClass();
            lfm.d.a(f2Var);
        }
        return true;
    }

    public final void c() {
        if (getAndIncrement() == 0) {
            d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0107 A[PHI: r4
      0x0107: PHI (r4v6 int) = (r4v4 int), (r4v7 int) binds: [B:76:0x00e6, B:88:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tfm.g2.d():void");
    }

    @Override // ifm.c
    public final void dispose() {
        if (this.i) {
            return;
        }
        this.i = true;
        if (b()) {
            zfm.c cVar = this.f270478h;
            cVar.getClass();
            Throwable thB = zfm.h.b(cVar);
            if (thB == null || thB == zfm.h.f322035a) {
                return;
            }
            mo3.a.m(thB);
        }
    }

    public final void e(f2 f2Var) {
        AtomicReference atomicReference;
        f2[] f2VarArr;
        f2[] f2VarArr2;
        do {
            atomicReference = this.f270479j;
            f2VarArr = (f2[]) atomicReference.get();
            int length = f2VarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (f2VarArr[i] == f2Var) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                f2VarArr2 = f270472q;
            } else {
                f2[] f2VarArr3 = new f2[length - 1];
                System.arraycopy(f2VarArr, 0, f2VarArr3, 0, i);
                System.arraycopy(f2VarArr, i + 1, f2VarArr3, i, (length - i) - 1);
                f2VarArr2 = f2VarArr3;
            }
        } while (!t61.a.B(atomicReference, f2VarArr, f2VarArr2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(efm.w wVar) {
        boolean z;
        do {
            z = false;
            if (!(wVar instanceof Callable)) {
                long j2 = this.f270480l;
                this.f270480l = 1 + j2;
                f2 f2Var = new f2(this, j2);
                AtomicReference atomicReference = this.f270479j;
                while (true) {
                    f2[] f2VarArr = (f2[]) atomicReference.get();
                    if (f2VarArr == f270473r) {
                        lfm.d.a(f2Var);
                        return;
                    }
                    int length = f2VarArr.length;
                    f2[] f2VarArr2 = new f2[length + 1];
                    System.arraycopy(f2VarArr, 0, f2VarArr2, 0, length);
                    f2VarArr2[length] = f2Var;
                    while (!atomicReference.compareAndSet(f2VarArr, f2VarArr2)) {
                        if (atomicReference.get() != f2VarArr) {
                            break;
                        }
                    }
                    wVar.subscribe(f2Var);
                    return;
                }
            }
            try {
                Object objCall = ((Callable) wVar).call();
                if (objCall != null) {
                    if (get() == 0 && compareAndSet(0, 1)) {
                        this.f270474a.onNext(objCall);
                        if (decrementAndGet() != 0) {
                            d();
                        }
                    } else {
                        nfm.i cVar = this.f;
                        if (cVar == null) {
                            cVar = this.d == Integer.MAX_VALUE ? new vfm.c(this.e) : new vfm.b(this.d);
                            this.f = cVar;
                        }
                        if (cVar.offer(objCall)) {
                            if (getAndIncrement() != 0) {
                                return;
                            }
                            d();
                        } else {
                            onError(new IllegalStateException("Scalar queue full?!"));
                        }
                    }
                }
            } catch (Throwable th10) {
                m70.a.u(th10);
                zfm.c cVar2 = this.f270478h;
                cVar2.getClass();
                zfm.h.a(cVar2, th10);
                c();
            }
            if (this.d == Integer.MAX_VALUE) {
                return;
            }
            synchronized (this) {
                try {
                    wVar = (efm.w) this.o.poll();
                    if (wVar == null) {
                        this.f270483p--;
                        z = true;
                    }
                } catch (Throwable th11) {
                    throw th11;
                }
            }
        } while (!z);
        c();
    }

    public final void h(int i) {
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            synchronized (this) {
                try {
                    efm.w wVar = (efm.w) this.o.poll();
                    if (wVar == null) {
                        this.f270483p--;
                    } else {
                        f(wVar);
                    }
                } finally {
                }
            }
            i = i2;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.i;
    }

    @Override // efm.y
    public final void onComplete() {
        if (this.f270477g) {
            return;
        }
        this.f270477g = true;
        c();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        if (this.f270477g) {
            mo3.a.m(th10);
            return;
        }
        zfm.c cVar = this.f270478h;
        cVar.getClass();
        if (!zfm.h.a(cVar, th10)) {
            mo3.a.m(th10);
        } else {
            this.f270477g = true;
            c();
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (this.f270477g) {
            return;
        }
        try {
            Object objApply = this.f270475b.apply(obj2);
            mfm.f.b(objApply, "The mapper returned a null ObservableSource");
            efm.w wVar = (efm.w) objApply;
            if (this.d != Integer.MAX_VALUE) {
                synchronized (this) {
                    try {
                        int i = this.f270483p;
                        if (i == this.d) {
                            this.o.offer(wVar);
                            return;
                        }
                        this.f270483p = i + 1;
                    } finally {
                    }
                }
            }
            f(wVar);
        } catch (Throwable th10) {
            m70.a.u(th10);
            this.k.dispose();
            onError(th10);
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.k, cVar)) {
            this.k = cVar;
            this.f270474a.onSubscribe(this);
        }
    }
}
