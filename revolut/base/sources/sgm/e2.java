package sgm;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class e2 extends AtomicInteger implements Disposable, fgm.l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d2[] f262794p = new d2[0];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d2[] f262795q = new d2[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f262796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.o f262797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f262798c;
    public final int d;
    public final int e;
    public volatile bhm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f262799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ygm.c f262800h = new ygm.c();
    public volatile boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference f262801j;
    public Disposable k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f262802l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f262803m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayDeque f262804n;
    public int o;

    public e2(int i, int i2, fgm.l lVar, igm.o oVar, boolean z) {
        this.f262796a = lVar;
        this.f262797b = oVar;
        this.f262798c = z;
        this.d = i;
        this.e = i2;
        if (i != Integer.MAX_VALUE) {
            this.f262804n = new ArrayDeque(i);
        }
        this.f262801j = new AtomicReference(f262794p);
    }

    public final boolean a() {
        if (this.i) {
            return true;
        }
        Throwable th10 = (Throwable) this.f262800h.get();
        if (this.f262798c || th10 == null) {
            return false;
        }
        b();
        this.f262800h.e(this.f262796a);
        return true;
    }

    public final boolean b() {
        this.k.dispose();
        AtomicReference atomicReference = this.f262801j;
        d2[] d2VarArr = f262795q;
        d2[] d2VarArr2 = (d2[]) atomicReference.getAndSet(d2VarArr);
        if (d2VarArr2 == d2VarArr) {
            return false;
        }
        for (d2 d2Var : d2VarArr2) {
            d2Var.getClass();
            jgm.b.a(d2Var);
        }
        return true;
    }

    public final void c() {
        if (getAndIncrement() == 0) {
            d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6 A[PHI: r4
      0x00c6: PHI (r4v6 int) = (r4v4 int), (r4v7 int) binds: [B:57:0x00ac, B:66:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sgm.e2.d():void");
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.i = true;
        if (b()) {
            this.f262800h.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(d2 d2Var) {
        d2[] d2VarArr;
        while (true) {
            AtomicReference atomicReference = this.f262801j;
            d2[] d2VarArr2 = (d2[]) atomicReference.get();
            int length = d2VarArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (d2VarArr2[i] == d2Var) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                d2VarArr = f262794p;
            } else {
                d2[] d2VarArr3 = new d2[length - 1];
                System.arraycopy(d2VarArr2, 0, d2VarArr3, 0, i);
                System.arraycopy(d2VarArr2, i + 1, d2VarArr3, i, (length - i) - 1);
                d2VarArr = d2VarArr3;
            }
            while (!atomicReference.compareAndSet(d2VarArr2, d2VarArr)) {
                if (atomicReference.get() != d2VarArr2) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(ObservableSource observableSource) {
        boolean z;
        do {
            z = false;
            if (!(observableSource instanceof igm.q)) {
                this.f262802l++;
                d2 d2Var = new d2(this);
                AtomicReference atomicReference = this.f262801j;
                while (true) {
                    d2[] d2VarArr = (d2[]) atomicReference.get();
                    if (d2VarArr == f262795q) {
                        jgm.b.a(d2Var);
                        return;
                    }
                    int length = d2VarArr.length;
                    d2[] d2VarArr2 = new d2[length + 1];
                    System.arraycopy(d2VarArr, 0, d2VarArr2, 0, length);
                    d2VarArr2[length] = d2Var;
                    while (!atomicReference.compareAndSet(d2VarArr, d2VarArr2)) {
                        if (atomicReference.get() != d2VarArr) {
                            break;
                        }
                    }
                    observableSource.subscribe(d2Var);
                    return;
                }
            }
            try {
                Object obj2 = ((igm.q) observableSource).get();
                if (obj2 != null) {
                    if (get() == 0 && compareAndSet(0, 1)) {
                        this.f262796a.onNext(obj2);
                        if (decrementAndGet() != 0) {
                        }
                    } else {
                        bhm.f iVar = this.f;
                        if (iVar == null) {
                            iVar = this.d == Integer.MAX_VALUE ? new bhm.i(this.e) : new bhm.h(this.d);
                            this.f = iVar;
                        }
                        iVar.offer(obj2);
                        if (getAndIncrement() != 0) {
                            return;
                        }
                    }
                    d();
                }
            } catch (Throwable th10) {
                ce9.m.F(th10);
                this.f262800h.a(th10);
                c();
            }
            if (this.d == Integer.MAX_VALUE) {
                return;
            }
            synchronized (this) {
                try {
                    observableSource = (ObservableSource) this.f262804n.poll();
                    if (observableSource == null) {
                        this.o--;
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
                    ObservableSource observableSource = (ObservableSource) this.f262804n.poll();
                    if (observableSource == null) {
                        this.o--;
                    } else {
                        f(observableSource);
                    }
                } finally {
                }
            }
            i = i2;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.i;
    }

    @Override // fgm.l
    public final void onComplete() {
        if (this.f262799g) {
            return;
        }
        this.f262799g = true;
        c();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.f262799g) {
            jb3.l.v(th10);
        } else if (this.f262800h.a(th10)) {
            this.f262799g = true;
            c();
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.f262799g) {
            return;
        }
        try {
            Object objApply = this.f262797b.apply(obj2);
            Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
            ObservableSource observableSource = (ObservableSource) objApply;
            if (this.d != Integer.MAX_VALUE) {
                synchronized (this) {
                    try {
                        int i = this.o;
                        if (i == this.d) {
                            this.f262804n.offer(observableSource);
                            return;
                        }
                        this.o = i + 1;
                    } finally {
                    }
                }
            }
            f(observableSource);
        } catch (Throwable th10) {
            ce9.m.F(th10);
            this.k.dispose();
            onError(th10);
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.k, disposable)) {
            this.k = disposable;
            this.f262796a.onSubscribe(this);
        }
    }
}
