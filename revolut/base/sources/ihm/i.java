package ihm;

import efm.y;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class i extends k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g[] f161457j = new g[0];
    public static final g[] k = new g[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Object[] f161458l = new Object[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f161459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f161460h = new AtomicReference(f161457j);
    public boolean i;

    public i(h hVar) {
        this.f161459g = hVar;
    }

    public static i e() {
        return new i(new h());
    }

    public final boolean f() {
        h hVar = this.f161459g;
        int i = hVar.f161456c;
        if (i != 0) {
            int i2 = i - 1;
            Object obj2 = hVar.f161454a.get(i2);
            if (zfm.m.c(obj2) || (obj2 instanceof zfm.k)) {
                i = i2;
            }
        } else {
            i = 0;
        }
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(g gVar) {
        g[] gVarArr;
        while (true) {
            AtomicReference atomicReference = this.f161460h;
            g[] gVarArr2 = (g[]) atomicReference.get();
            if (gVarArr2 == k || gVarArr2 == (gVarArr = f161457j)) {
                return;
            }
            int length = gVarArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (gVarArr2[i] == gVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                gVarArr = new g[length - 1];
                System.arraycopy(gVarArr2, 0, gVarArr, 0, i);
                System.arraycopy(gVarArr2, i + 1, gVarArr, i, (length - i) - 1);
            }
            while (!atomicReference.compareAndSet(gVarArr2, gVarArr)) {
                if (atomicReference.get() != gVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // efm.y
    public final void onComplete() {
        if (this.i) {
            return;
        }
        this.i = true;
        zfm.m mVar = zfm.m.COMPLETE;
        h hVar = this.f161459g;
        hVar.f161454a.add(mVar);
        hVar.f161456c++;
        hVar.f161455b = true;
        g[] gVarArr = k;
        if (this.f161459g.compareAndSet(null, mVar)) {
            gVarArr = (g[]) this.f161460h.getAndSet(gVarArr);
        }
        for (g gVar : gVarArr) {
            hVar.a(gVar);
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        mfm.f.b(th10, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.i) {
            mo3.a.m(th10);
            return;
        }
        this.i = true;
        zfm.k kVar = new zfm.k(th10);
        h hVar = this.f161459g;
        hVar.f161454a.add(kVar);
        hVar.f161456c++;
        hVar.f161455b = true;
        g[] gVarArr = k;
        if (this.f161459g.compareAndSet(null, kVar)) {
            gVarArr = (g[]) this.f161460h.getAndSet(gVarArr);
        }
        for (g gVar : gVarArr) {
            hVar.a(gVar);
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        mfm.f.b(obj2, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.i) {
            return;
        }
        h hVar = this.f161459g;
        hVar.f161454a.add(obj2);
        hVar.f161456c++;
        for (g gVar : (g[]) this.f161460h.get()) {
            hVar.a(gVar);
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (this.i) {
            cVar.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // efm.r
    public final void subscribeActual(y yVar) {
        g gVar = new g(yVar, this);
        yVar.onSubscribe(gVar);
        if (gVar.d) {
            return;
        }
        AtomicReference atomicReference = this.f161460h;
        while (true) {
            g[] gVarArr = (g[]) atomicReference.get();
            if (gVarArr == k) {
                break;
            }
            int length = gVarArr.length;
            g[] gVarArr2 = new g[length + 1];
            System.arraycopy(gVarArr, 0, gVarArr2, 0, length);
            gVarArr2[length] = gVar;
            while (!atomicReference.compareAndSet(gVarArr, gVarArr2)) {
                if (atomicReference.get() != gVarArr) {
                    break;
                }
            }
            if (gVar.d) {
                g(gVar);
                return;
            }
        }
        this.f161459g.a(gVar);
    }
}
