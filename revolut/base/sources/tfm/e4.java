package tfm;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class e4 extends AtomicReference implements efm.y, ifm.c {
    public static final d4[] e = new d4[0];
    public static final d4[] f = new d4[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f270429b;
    public Throwable d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f270428a = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f270430c = new AtomicReference();

    public e4(AtomicReference atomicReference) {
        this.f270429b = atomicReference;
        lazySet(e);
    }

    public final void a(d4 d4Var) {
        d4[] d4VarArr;
        d4[] d4VarArr2;
        do {
            d4VarArr = (d4[]) get();
            int length = d4VarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (d4VarArr[i] == d4Var) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                d4VarArr2 = new d4[length - 1];
                System.arraycopy(d4VarArr, 0, d4VarArr2, 0, i);
                System.arraycopy(d4VarArr, i + 1, d4VarArr2, i, (length - i) - 1);
            } else {
                d4VarArr2 = e;
            }
        } while (!compareAndSet(d4VarArr, d4VarArr2));
    }

    @Override // ifm.c
    public final void dispose() {
        getAndSet(f);
        t61.a.z(this.f270429b, this);
        lfm.d.a(this.f270430c);
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return get() == f;
    }

    @Override // efm.y
    public final void onComplete() {
        this.f270430c.lazySet(lfm.d.DISPOSED);
        for (d4 d4Var : (d4[]) getAndSet(f)) {
            d4Var.f270409a.onComplete();
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        this.d = th10;
        this.f270430c.lazySet(lfm.d.DISPOSED);
        for (d4 d4Var : (d4[]) getAndSet(f)) {
            d4Var.f270409a.onError(th10);
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        for (d4 d4Var : (d4[]) get()) {
            d4Var.f270409a.onNext(obj2);
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        lfm.d.e(this.f270430c, cVar);
    }
}
