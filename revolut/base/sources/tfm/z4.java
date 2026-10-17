package tfm;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class z4 extends AtomicReference implements efm.y, ifm.c {
    public static final v4[] e = new v4[0];
    public static final v4[] f = new v4[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y4 f270988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f270989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f270990c = new AtomicReference(e);
    public final AtomicBoolean d = new AtomicBoolean();

    public z4(y4 y4Var) {
        this.f270988a = y4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(v4 v4Var) {
        v4[] v4VarArr;
        while (true) {
            AtomicReference atomicReference = this.f270990c;
            v4[] v4VarArr2 = (v4[]) atomicReference.get();
            int length = v4VarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (v4VarArr2[i].equals(v4Var)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                v4VarArr = e;
            } else {
                v4[] v4VarArr3 = new v4[length - 1];
                System.arraycopy(v4VarArr2, 0, v4VarArr3, 0, i);
                System.arraycopy(v4VarArr2, i + 1, v4VarArr3, i, (length - i) - 1);
                v4VarArr = v4VarArr3;
            }
            while (!atomicReference.compareAndSet(v4VarArr2, v4VarArr)) {
                if (atomicReference.get() != v4VarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // ifm.c
    public final void dispose() {
        this.f270990c.set(f);
        lfm.d.a(this);
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f270990c.get() == f;
    }

    @Override // efm.y
    public final void onComplete() {
        if (this.f270989b) {
            return;
        }
        this.f270989b = true;
        y4 y4Var = this.f270988a;
        y4Var.b();
        for (v4 v4Var : (v4[]) this.f270990c.getAndSet(f)) {
            y4Var.e(v4Var);
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        if (this.f270989b) {
            mo3.a.m(th10);
            return;
        }
        this.f270989b = true;
        y4 y4Var = this.f270988a;
        y4Var.error(th10);
        for (v4 v4Var : (v4[]) this.f270990c.getAndSet(f)) {
            y4Var.e(v4Var);
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (this.f270989b) {
            return;
        }
        y4 y4Var = this.f270988a;
        y4Var.a(obj2);
        for (v4 v4Var : (v4[]) this.f270990c.get()) {
            y4Var.e(v4Var);
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.e(this, cVar)) {
            for (v4 v4Var : (v4[]) this.f270990c.get()) {
                this.f270988a.e(v4Var);
            }
        }
    }
}
