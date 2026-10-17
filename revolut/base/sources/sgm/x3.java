package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class x3 extends AtomicReference implements fgm.l, Disposable {
    public static final w3[] e = new w3[0];
    public static final w3[] f = new w3[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f263272b;
    public Throwable d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f263271a = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f263273c = new AtomicReference();

    public x3(AtomicReference atomicReference) {
        this.f263272b = atomicReference;
        lazySet(e);
    }

    public final void a(w3 w3Var) {
        w3[] w3VarArr;
        w3[] w3VarArr2;
        do {
            w3VarArr = (w3[]) get();
            int length = w3VarArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (w3VarArr[i] == w3Var) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                w3VarArr2 = new w3[length - 1];
                System.arraycopy(w3VarArr, 0, w3VarArr2, 0, i);
                System.arraycopy(w3VarArr, i + 1, w3VarArr2, i, (length - i) - 1);
            } else {
                w3VarArr2 = e;
            }
        } while (!compareAndSet(w3VarArr, w3VarArr2));
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        AtomicReference atomicReference;
        getAndSet(f);
        do {
            atomicReference = this.f263272b;
            if (atomicReference.compareAndSet(this, null)) {
                break;
            }
        } while (atomicReference.get() == this);
        jgm.b.a(this.f263273c);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return get() == f;
    }

    @Override // fgm.l
    public final void onComplete() {
        this.f263273c.lazySet(jgm.b.DISPOSED);
        for (w3 w3Var : (w3[]) getAndSet(f)) {
            w3Var.f263245a.onComplete();
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        AtomicReference atomicReference = this.f263273c;
        Object obj2 = atomicReference.get();
        jgm.b bVar = jgm.b.DISPOSED;
        if (obj2 == bVar) {
            jb3.l.v(th10);
            return;
        }
        this.d = th10;
        atomicReference.lazySet(bVar);
        for (w3 w3Var : (w3[]) getAndSet(f)) {
            w3Var.f263245a.onError(th10);
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        for (w3 w3Var : (w3[]) get()) {
            w3Var.f263245a.onNext(obj2);
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        jgm.b.e(this.f263273c, disposable);
    }
}
