package tfm;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class a4 implements efm.y, ifm.c {
    public static final z3[] e = new z3[0];
    public static final z3[] f = new z3[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f270339a;
    public final AtomicReference d = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f270340b = new AtomicReference(e);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f270341c = new AtomicBoolean();

    public a4(AtomicReference atomicReference) {
        this.f270339a = atomicReference;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a(z3 z3Var) {
        while (true) {
            AtomicReference atomicReference = this.f270340b;
            z3[] z3VarArr = (z3[]) atomicReference.get();
            if (z3VarArr == f) {
                return false;
            }
            int length = z3VarArr.length;
            z3[] z3VarArr2 = new z3[length + 1];
            System.arraycopy(z3VarArr, 0, z3VarArr2, 0, length);
            z3VarArr2[length] = z3Var;
            while (!atomicReference.compareAndSet(z3VarArr, z3VarArr2)) {
                if (atomicReference.get() != z3VarArr) {
                    break;
                }
            }
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(z3 z3Var) {
        z3[] z3VarArr;
        while (true) {
            AtomicReference atomicReference = this.f270340b;
            z3[] z3VarArr2 = (z3[]) atomicReference.get();
            int length = z3VarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (z3VarArr2[i].equals(z3Var)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                z3VarArr = e;
            } else {
                z3[] z3VarArr3 = new z3[length - 1];
                System.arraycopy(z3VarArr2, 0, z3VarArr3, 0, i);
                System.arraycopy(z3VarArr2, i + 1, z3VarArr3, i, (length - i) - 1);
                z3VarArr = z3VarArr3;
            }
            while (!atomicReference.compareAndSet(z3VarArr2, z3VarArr)) {
                if (atomicReference.get() != z3VarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // ifm.c
    public final void dispose() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = this.f270340b;
        z3[] z3VarArr = f;
        if (((z3[]) atomicReference2.getAndSet(z3VarArr)) != z3VarArr) {
            do {
                atomicReference = this.f270339a;
                if (atomicReference.compareAndSet(this, null)) {
                    break;
                }
            } while (atomicReference.get() == this);
            lfm.d.a(this.d);
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f270340b.get() == f;
    }

    @Override // efm.y
    public final void onComplete() {
        AtomicReference atomicReference;
        do {
            atomicReference = this.f270339a;
            if (atomicReference.compareAndSet(this, null)) {
                break;
            }
        } while (atomicReference.get() == this);
        for (z3 z3Var : (z3[]) this.f270340b.getAndSet(f)) {
            z3Var.f270987a.onComplete();
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        AtomicReference atomicReference;
        do {
            atomicReference = this.f270339a;
            if (atomicReference.compareAndSet(this, null)) {
                break;
            }
        } while (atomicReference.get() == this);
        z3[] z3VarArr = (z3[]) this.f270340b.getAndSet(f);
        if (z3VarArr.length == 0) {
            mo3.a.m(th10);
            return;
        }
        for (z3 z3Var : z3VarArr) {
            z3Var.f270987a.onError(th10);
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        for (z3 z3Var : (z3[]) this.f270340b.get()) {
            z3Var.f270987a.onNext(obj2);
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        lfm.d.e(this.d, cVar);
    }
}
