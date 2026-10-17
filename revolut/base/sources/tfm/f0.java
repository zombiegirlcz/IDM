package tfm;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 extends a implements efm.y {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final e0[] f270442q = new e0[0];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e0[] f270443r = new e0[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f270444h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference f270445j;
    public volatile long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final sgm.f0 f270446l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public sgm.f0 f270447m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f270448n;
    public Throwable o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile boolean f270449p;

    public f0(efm.r rVar, int i) {
        super(rVar);
        this.i = i;
        this.f270444h = new AtomicBoolean();
        sgm.f0 f0Var = new sgm.f0(i, 1);
        this.f270446l = f0Var;
        this.f270447m = f0Var;
        this.f270445j = new AtomicReference(f270442q);
    }

    public final void d(e0 e0Var) {
        if (e0Var.getAndIncrement() != 0) {
            return;
        }
        long j2 = e0Var.e;
        int i = e0Var.d;
        sgm.f0 f0Var = e0Var.f270421c;
        efm.y yVar = e0Var.f270419a;
        int i2 = this.i;
        int iAddAndGet = 1;
        while (!e0Var.f) {
            boolean z = this.f270449p;
            boolean z3 = this.k == j2;
            if (z && z3) {
                e0Var.f270421c = null;
                Throwable th10 = this.o;
                if (th10 != null) {
                    yVar.onError(th10);
                    return;
                } else {
                    yVar.onComplete();
                    return;
                }
            }
            if (z3) {
                e0Var.e = j2;
                e0Var.d = i;
                e0Var.f270421c = f0Var;
                iAddAndGet = e0Var.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                if (i == i2) {
                    f0Var = (sgm.f0) f0Var.f262822b;
                    i = 0;
                }
                yVar.onNext(((Object[]) f0Var.f262821a)[i]);
                i++;
                j2++;
            }
        }
        e0Var.f270421c = null;
    }

    @Override // efm.y
    public final void onComplete() {
        this.f270449p = true;
        for (e0 e0Var : (e0[]) this.f270445j.getAndSet(f270443r)) {
            d(e0Var);
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        this.o = th10;
        this.f270449p = true;
        for (e0 e0Var : (e0[]) this.f270445j.getAndSet(f270443r)) {
            d(e0Var);
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        int i = this.f270448n;
        if (i == this.i) {
            sgm.f0 f0Var = new sgm.f0(i, 1);
            ((Object[]) f0Var.f262821a)[0] = obj2;
            this.f270448n = 1;
            this.f270447m.f262822b = f0Var;
            this.f270447m = f0Var;
        } else {
            ((Object[]) this.f270447m.f262821a)[i] = obj2;
            this.f270448n = i + 1;
        }
        this.k++;
        for (e0 e0Var : (e0[]) this.f270445j.get()) {
            d(e0Var);
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        e0 e0Var = new e0(yVar, this);
        yVar.onSubscribe(e0Var);
        loop0: while (true) {
            AtomicReference atomicReference = this.f270445j;
            e0[] e0VarArr = (e0[]) atomicReference.get();
            if (e0VarArr != f270443r) {
                int length = e0VarArr.length;
                e0[] e0VarArr2 = new e0[length + 1];
                System.arraycopy(e0VarArr, 0, e0VarArr2, 0, length);
                e0VarArr2[length] = e0Var;
                while (!atomicReference.compareAndSet(e0VarArr, e0VarArr2)) {
                    if (atomicReference.get() != e0VarArr) {
                        break;
                    }
                }
                break loop0;
            }
            break;
        }
        AtomicBoolean atomicBoolean = this.f270444h;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            d(e0Var);
        } else {
            this.f270328g.subscribe(this);
        }
    }
}
