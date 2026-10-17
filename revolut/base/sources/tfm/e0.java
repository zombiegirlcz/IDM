package tfm;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 extends AtomicInteger implements ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f270420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public sgm.f0 f270421c;
    public int d;
    public long e;
    public volatile boolean f;

    public e0(efm.y yVar, f0 f0Var) {
        this.f270419a = yVar;
        this.f270420b = f0Var;
        this.f270421c = f0Var.f270446l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ifm.c
    public final void dispose() {
        e0[] e0VarArr;
        if (this.f) {
            return;
        }
        this.f = true;
        AtomicReference atomicReference = this.f270420b.f270445j;
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
                e0VarArr = f0.f270442q;
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

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f;
    }
}
