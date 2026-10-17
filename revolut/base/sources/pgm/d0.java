package pgm;

import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes14.dex */
public final class d0 extends AtomicInteger implements fgm.d, dom.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final c0[] f236031q = new c0[0];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final c0[] f236032r = new c0[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f236033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.o f236034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f236035c;
    public final int d;
    public volatile bhm.f e;
    public volatile boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ygm.c f236036g = new ygm.c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f236037h;
    public final AtomicReference i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicLong f236038j;
    public dom.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f236039l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f236040m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f236041n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f236042p;

    public d0(dom.a aVar, igm.o oVar, int i, int i2) {
        AtomicReference atomicReference = new AtomicReference();
        this.i = atomicReference;
        this.f236038j = new AtomicLong();
        this.f236033a = aVar;
        this.f236034b = oVar;
        this.f236035c = i;
        this.d = i2;
        this.f236042p = Math.max(1, i >> 1);
        atomicReference.lazySet(f236031q);
    }

    @Override // dom.b
    public final void a(long j2) {
        if (xgm.f.f(j2)) {
            xam.a.b(this.f236038j, j2);
            c();
        }
    }

    public final boolean b() {
        if (this.f236037h) {
            bhm.f fVar = this.e;
            if (fVar != null) {
                fVar.clear();
            }
            return true;
        }
        if (this.f236036g.get() == null) {
            return false;
        }
        bhm.f fVar2 = this.e;
        if (fVar2 != null) {
            fVar2.clear();
        }
        this.f236036g.c(this.f236033a);
        return true;
    }

    public final void c() {
        if (getAndIncrement() == 0) {
            f();
        }
    }

    @Override // dom.b
    public final void cancel() {
        bhm.f fVar;
        if (this.f236037h) {
            return;
        }
        this.f236037h = true;
        this.k.cancel();
        AtomicReference atomicReference = this.i;
        c0[] c0VarArr = f236032r;
        c0[] c0VarArr2 = (c0[]) atomicReference.getAndSet(c0VarArr);
        if (c0VarArr2 != c0VarArr) {
            for (c0 c0Var : c0VarArr2) {
                c0Var.getClass();
                xgm.f.b(c0Var);
            }
            this.f236036g.b();
        }
        if (getAndIncrement() != 0 || (fVar = this.e) == null) {
            return;
        }
        fVar.clear();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (xgm.f.h(this.k, bVar)) {
            this.k = bVar;
            this.f236033a.e(this);
            if (this.f236037h) {
                return;
            }
            int i = this.f236035c;
            if (i == Integer.MAX_VALUE) {
                bVar.a(Long.MAX_VALUE);
            } else {
                bVar.a(i);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pgm.d0.f():void");
    }

    public final bhm.f h() {
        bhm.f iVar = this.e;
        if (iVar == null) {
            iVar = this.f236035c == Integer.MAX_VALUE ? new bhm.i(this.d) : new bhm.h(this.f236035c);
            this.e = iVar;
        }
        return iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(c0 c0Var) {
        c0[] c0VarArr;
        while (true) {
            AtomicReference atomicReference = this.i;
            c0[] c0VarArr2 = (c0[]) atomicReference.get();
            int length = c0VarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c0VarArr2[i] == c0Var) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c0VarArr = f236031q;
            } else {
                c0[] c0VarArr3 = new c0[length - 1];
                System.arraycopy(c0VarArr2, 0, c0VarArr3, 0, i);
                System.arraycopy(c0VarArr2, i + 1, c0VarArr3, i, (length - i) - 1);
                c0VarArr = c0VarArr3;
            }
            while (!atomicReference.compareAndSet(c0VarArr2, c0VarArr)) {
                if (atomicReference.get() != c0VarArr2) {
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
            jb3.l.v(th10);
            return;
        }
        if (this.f236036g.a(th10)) {
            this.f = true;
            for (c0 c0Var : (c0[]) this.i.getAndSet(f236032r)) {
                c0Var.getClass();
                xgm.f.b(c0Var);
            }
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.f) {
            return;
        }
        try {
            Object objApply = this.f236034b.apply(obj2);
            Objects.requireNonNull(objApply, "The mapper returned a null Publisher");
            Publisher publisher = (Publisher) objApply;
            if (!(publisher instanceof igm.q)) {
                int i = this.d;
                long j2 = this.f236039l;
                this.f236039l = 1 + j2;
                c0 c0Var = new c0(this, i, j2);
                AtomicReference atomicReference = this.i;
                while (true) {
                    c0[] c0VarArr = (c0[]) atomicReference.get();
                    if (c0VarArr == f236032r) {
                        xgm.f.b(c0Var);
                        return;
                    }
                    int length = c0VarArr.length;
                    c0[] c0VarArr2 = new c0[length + 1];
                    System.arraycopy(c0VarArr, 0, c0VarArr2, 0, length);
                    c0VarArr2[length] = c0Var;
                    while (!atomicReference.compareAndSet(c0VarArr, c0VarArr2)) {
                        if (atomicReference.get() != c0VarArr) {
                            break;
                        }
                    }
                    publisher.a(c0Var);
                    return;
                }
            }
            try {
                Object obj3 = ((igm.q) publisher).get();
                if (obj3 == null) {
                    if (this.f236035c == Integer.MAX_VALUE || this.f236037h) {
                        return;
                    }
                    int i2 = this.o + 1;
                    this.o = i2;
                    int i3 = this.f236042p;
                    if (i2 == i3) {
                        this.o = 0;
                        this.k.a(i3);
                        return;
                    }
                    return;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    long j3 = this.f236038j.get();
                    bhm.f fVarH = this.e;
                    if (j3 == 0 || !(fVarH == null || fVarH.isEmpty())) {
                        if (fVarH == null) {
                            fVarH = h();
                        }
                        if (!fVarH.offer(obj3)) {
                            onError(new QueueOverflowException());
                        }
                    } else {
                        this.f236033a.onNext(obj3);
                        if (j3 != Long.MAX_VALUE) {
                            this.f236038j.decrementAndGet();
                        }
                        if (this.f236035c != Integer.MAX_VALUE && !this.f236037h) {
                            int i5 = this.o + 1;
                            this.o = i5;
                            int i6 = this.f236042p;
                            if (i5 == i6) {
                                this.o = 0;
                                this.k.a(i6);
                            }
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                } else if (!h().offer(obj3)) {
                    onError(new QueueOverflowException());
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
                f();
            } catch (Throwable th10) {
                ce9.m.F(th10);
                this.f236036g.a(th10);
                c();
            }
        } catch (Throwable th11) {
            ce9.m.F(th11);
            this.k.cancel();
            onError(th11);
        }
    }
}
