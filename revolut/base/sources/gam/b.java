package gam;

import e8.q;
import efm.c0;
import efm.y;
import ifm.c;
import ihm.k;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import lfm.d;
import mfm.f;
import zfm.h;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends k implements c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a[] f142200m = new a[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a[] f142201n = new a[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f142202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f142203h;
    public final AtomicReference i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f142204j = true;
    public final AtomicReference k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c0 f142205l;

    public b(int i, c0 c0Var) {
        this.f142202g = new q(i);
        new AtomicInteger();
        this.f142203h = new AtomicReference();
        this.i = new AtomicReference();
        this.k = new AtomicReference(f142200m);
        this.f142205l = c0Var;
    }

    @Override // ifm.c
    public final void dispose() {
        d.a(this.f142203h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(a aVar) {
        a[] aVarArr;
        while (true) {
            AtomicReference atomicReference = this.k;
            a[] aVarArr2 = (a[]) atomicReference.get();
            int length = aVarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (aVarArr2[i] == aVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                aVarArr = f142200m;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr2, 0, aVarArr3, 0, i);
                System.arraycopy(aVarArr2, i + 1, aVarArr3, i, (length - i) - 1);
                aVarArr = aVarArr3;
            }
            while (!atomicReference.compareAndSet(aVarArr2, aVarArr)) {
                if (atomicReference.get() != aVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return d.b((c) this.f142203h.get());
    }

    @Override // efm.y
    public final void onComplete() {
        if (v1.c.D(this.i, h.f322035a)) {
            for (a aVar : (a[]) this.k.getAndSet(f142201n)) {
                if (aVar.getAndIncrement() == 0) {
                    aVar.f142199c.a(aVar);
                }
            }
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        f.b(th10, "e is null");
        if (!v1.c.C(this.i, th10)) {
            mo3.a.m(th10);
            return;
        }
        for (a aVar : (a[]) this.k.getAndSet(f142201n)) {
            if (aVar.getAndIncrement() == 0) {
                aVar.f142199c.a(aVar);
            }
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (this.i.get() == null) {
            this.f142202g.offer(obj2);
            for (a aVar : (a[]) this.k.get()) {
                if (aVar.getAndIncrement() == 0) {
                    aVar.f142199c.a(aVar);
                }
            }
        }
    }

    @Override // efm.y
    public final void onSubscribe(c cVar) {
        d.e(this.f142203h, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // efm.r
    public final void subscribeActual(y yVar) {
        a aVar = new a(yVar, this, this.f142205l.b(), this.f142204j);
        yVar.onSubscribe(aVar);
        AtomicReference atomicReference = this.k;
        while (true) {
            a[] aVarArr = (a[]) atomicReference.get();
            if (aVarArr == f142201n) {
                break;
            }
            int length = aVarArr.length;
            a[] aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
            while (!atomicReference.compareAndSet(aVarArr, aVarArr2)) {
                if (atomicReference.get() != aVarArr) {
                    break;
                }
            }
            if (aVar.e) {
                e(aVar);
                return;
            }
        }
        if (aVar.getAndIncrement() == 0) {
            aVar.f142199c.a(aVar);
        }
    }
}
