package rfm;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class i0 extends AtomicInteger implements ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253950a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.o f253951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f253952c;
    public final Object d;
    public final AtomicReference[] e;

    public i0(efm.l lVar, int i, kfm.o oVar) {
        super(i);
        this.d = lVar;
        this.f253951b = oVar;
        j0[] j0VarArr = new j0[i];
        for (int i2 = 0; i2 < i; i2++) {
            j0VarArr[i2] = new j0(this, i2, 0);
        }
        this.e = j0VarArr;
        this.f253952c = new Object[i];
    }

    public void a(int i) {
        j0[] j0VarArr = (j0[]) this.e;
        int length = j0VarArr.length;
        for (int i2 = 0; i2 < i; i2++) {
            j0 j0Var = j0VarArr[i2];
            j0Var.getClass();
            lfm.d.a(j0Var);
        }
        while (true) {
            i++;
            if (i >= length) {
                return;
            }
            j0 j0Var2 = j0VarArr[i];
            j0Var2.getClass();
            lfm.d.a(j0Var2);
        }
    }

    public void b(int i, Throwable th10) {
        if (getAndSet(0) <= 0) {
            mo3.a.m(th10);
            return;
        }
        j0[] j0VarArr = (j0[]) this.e;
        int length = j0VarArr.length;
        for (int i2 = 0; i2 < i; i2++) {
            j0 j0Var = j0VarArr[i2];
            j0Var.getClass();
            lfm.d.a(j0Var);
        }
        while (true) {
            i++;
            if (i >= length) {
                ((efm.f0) this.d).onError(th10);
                return;
            } else {
                j0 j0Var2 = j0VarArr[i];
                j0Var2.getClass();
                lfm.d.a(j0Var2);
            }
        }
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f253950a) {
            case 0:
                if (getAndSet(0) > 0) {
                    for (j0 j0Var : (j0[]) this.e) {
                        j0Var.getClass();
                        lfm.d.a(j0Var);
                    }
                }
                break;
            default:
                if (getAndSet(0) > 0) {
                    for (j0 j0Var2 : (j0[]) this.e) {
                        j0Var2.getClass();
                        lfm.d.a(j0Var2);
                    }
                }
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f253950a) {
            case 0:
                if (get() <= 0) {
                }
                break;
            default:
                if (get() <= 0) {
                }
                break;
        }
        return false;
    }

    public i0(int i, efm.f0 f0Var, kfm.o oVar) {
        super(i);
        this.d = f0Var;
        this.f253951b = oVar;
        j0[] j0VarArr = new j0[i];
        for (int i2 = 0; i2 < i; i2++) {
            j0VarArr[i2] = new j0(this, i2, 1);
        }
        this.e = j0VarArr;
        this.f253952c = new Object[i];
    }
}
