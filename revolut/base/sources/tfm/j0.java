package tfm;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes13.dex */
public final class j0 extends AtomicInteger implements ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.o f270554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0[] f270555c;
    public Object[] d;
    public final vfm.c e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f270556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f270557h;
    public final zfm.c i = new zfm.c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f270558j;
    public int k;

    public j0(int i, int i2, efm.y yVar, kfm.o oVar, boolean z) {
        this.f270553a = yVar;
        this.f270554b = oVar;
        this.f = z;
        this.d = new Object[i];
        i0[] i0VarArr = new i0[i];
        for (int i3 = 0; i3 < i; i3++) {
            i0VarArr[i3] = new i0(this, i3);
        }
        this.f270555c = i0VarArr;
        this.e = new vfm.c(i2);
    }

    public final void a() {
        for (i0 i0Var : this.f270555c) {
            i0Var.getClass();
            lfm.d.a(i0Var);
        }
    }

    public final void b(vfm.c cVar) {
        synchronized (this) {
            this.d = null;
        }
        cVar.clear();
    }

    public final void c() {
        if (getAndIncrement() != 0) {
            return;
        }
        vfm.c cVar = this.e;
        efm.y yVar = this.f270553a;
        boolean z = this.f;
        int iAddAndGet = 1;
        while (!this.f270556g) {
            if (!z && this.i.get() != null) {
                a();
                b(cVar);
                zfm.c cVar2 = this.i;
                cVar2.getClass();
                yVar.onError(zfm.h.b(cVar2));
                return;
            }
            boolean z3 = this.f270557h;
            Object[] objArr = (Object[]) cVar.poll();
            boolean z4 = objArr == null;
            if (z3 && z4) {
                b(cVar);
                zfm.c cVar3 = this.i;
                cVar3.getClass();
                Throwable thB = zfm.h.b(cVar3);
                if (thB == null) {
                    yVar.onComplete();
                    return;
                } else {
                    yVar.onError(thB);
                    return;
                }
            }
            if (z4) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                try {
                    Object objApply = this.f270554b.apply(objArr);
                    mfm.f.b(objApply, "The combiner returned a null value");
                    yVar.onNext(objApply);
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    zfm.c cVar4 = this.i;
                    cVar4.getClass();
                    zfm.h.a(cVar4, th10);
                    a();
                    b(cVar);
                    zfm.c cVar5 = this.i;
                    cVar5.getClass();
                    yVar.onError(zfm.h.b(cVar5));
                    return;
                }
            }
        }
        b(cVar);
    }

    @Override // ifm.c
    public final void dispose() {
        if (this.f270556g) {
            return;
        }
        this.f270556g = true;
        a();
        if (getAndIncrement() == 0) {
            b(this.e);
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f270556g;
    }
}
