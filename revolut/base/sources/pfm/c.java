package pfm;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends efm.b implements efm.d {
    public static final b[] e = new b[0];
    public static final b[] f = new b[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.b f235718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f235719b = new AtomicReference(e);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f235720c = new AtomicBoolean();
    public Throwable d;

    public c(efm.b bVar) {
        this.f235718a = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F(b bVar) {
        b[] bVarArr;
        while (true) {
            AtomicReference atomicReference = this.f235719b;
            b[] bVarArr2 = (b[]) atomicReference.get();
            int length = bVarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (bVarArr2[i] == bVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                bVarArr = e;
            } else {
                b[] bVarArr3 = new b[length - 1];
                System.arraycopy(bVarArr2, 0, bVarArr3, 0, i);
                System.arraycopy(bVarArr2, i + 1, bVarArr3, i, (length - i) - 1);
                bVarArr = bVarArr3;
            }
            while (!atomicReference.compareAndSet(bVarArr2, bVarArr)) {
                if (atomicReference.get() != bVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // efm.d
    public final void onComplete() {
        for (b bVar : (b[]) this.f235719b.getAndSet(f)) {
            if (!bVar.get()) {
                bVar.f235716a.onComplete();
            }
        }
    }

    @Override // efm.d
    public final void onError(Throwable th10) {
        this.d = th10;
        for (b bVar : (b[]) this.f235719b.getAndSet(f)) {
            if (!bVar.get()) {
                bVar.f235716a.onError(th10);
            }
        }
    }

    @Override // efm.d
    public final void onSubscribe(ifm.c cVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // efm.b
    public final void x(efm.d dVar) {
        b bVar = new b(this, dVar);
        dVar.onSubscribe(bVar);
        while (true) {
            AtomicReference atomicReference = this.f235719b;
            b[] bVarArr = (b[]) atomicReference.get();
            if (bVarArr == f) {
                Throwable th10 = this.d;
                if (th10 != null) {
                    dVar.onError(th10);
                    return;
                } else {
                    dVar.onComplete();
                    return;
                }
            }
            int length = bVarArr.length;
            b[] bVarArr2 = new b[length + 1];
            System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
            bVarArr2[length] = bVar;
            while (!atomicReference.compareAndSet(bVarArr, bVarArr2)) {
                if (atomicReference.get() != bVarArr) {
                    break;
                }
            }
            if (bVar.get()) {
                F(bVar);
            }
            if (this.f235720c.compareAndSet(false, true)) {
                this.f235718a.d(this);
                return;
            }
            return;
        }
    }
}
