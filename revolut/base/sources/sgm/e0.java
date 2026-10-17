package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class e0 extends AtomicInteger implements Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f262788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f262789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f0 f262790c;
    public int d;
    public long e;
    public volatile boolean f;

    public e0(fgm.l lVar, g0 g0Var) {
        this.f262788a = lVar;
        this.f262789b = g0Var;
        this.f262790c = g0Var.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        e0[] e0VarArr;
        if (this.f) {
            return;
        }
        this.f = true;
        AtomicReference atomicReference = this.f262789b.d;
        while (true) {
            e0[] e0VarArr2 = (e0[]) atomicReference.get();
            int length = e0VarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (e0VarArr2[i] == this) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                e0VarArr = g0.k;
            } else {
                e0[] e0VarArr3 = new e0[length - 1];
                System.arraycopy(e0VarArr2, 0, e0VarArr3, 0, i);
                System.arraycopy(e0VarArr2, i + 1, e0VarArr3, i, (length - i) - 1);
                e0VarArr = e0VarArr3;
            }
            while (!atomicReference.compareAndSet(e0VarArr2, e0VarArr)) {
                if (atomicReference.get() != e0VarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f;
    }
}
