package tfm;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class i6 extends AtomicInteger implements efm.y, ifm.c {
    public static final h6 k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.o f270543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f270544c;
    public final boolean d;
    public volatile boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f270545g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ifm.c f270546h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile long f270547j;
    public final AtomicReference i = new AtomicReference();
    public final zfm.c e = new zfm.c();

    static {
        h6 h6Var = new h6(null, -1L, 1);
        k = h6Var;
        lfm.d.a(h6Var);
    }

    public i6(int i, efm.y yVar, kfm.o oVar, boolean z) {
        this.f270542a = yVar;
        this.f270543b = oVar;
        this.f270544c = i;
        this.d = z;
    }

    public final void a() {
        h6 h6Var;
        AtomicReference atomicReference = this.i;
        h6 h6Var2 = (h6) atomicReference.get();
        h6 h6Var3 = k;
        if (h6Var2 == h6Var3 || (h6Var = (h6) atomicReference.getAndSet(h6Var3)) == h6Var3 || h6Var == null) {
            return;
        }
        lfm.d.a(h6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0010 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tfm.i6.b():void");
    }

    @Override // ifm.c
    public final void dispose() {
        if (this.f270545g) {
            return;
        }
        this.f270545g = true;
        this.f270546h.dispose();
        a();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f270545g;
    }

    @Override // efm.y
    public final void onComplete() {
        if (this.f) {
            return;
        }
        this.f = true;
        b();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        if (!this.f) {
            zfm.c cVar = this.e;
            cVar.getClass();
            if (zfm.h.a(cVar, th10)) {
                if (!this.d) {
                    a();
                }
                this.f = true;
                b();
                return;
            }
        }
        mo3.a.m(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        long j2 = this.f270547j + 1;
        this.f270547j = j2;
        h6 h6Var = (h6) this.i.get();
        if (h6Var != null) {
            lfm.d.a(h6Var);
        }
        try {
            Object objApply = this.f270543b.apply(obj2);
            mfm.f.b(objApply, "The ObservableSource returned is null");
            efm.w wVar = (efm.w) objApply;
            h6 h6Var2 = new h6(this, j2, this.f270544c);
            while (true) {
                h6 h6Var3 = (h6) this.i.get();
                if (h6Var3 == k) {
                    return;
                }
                AtomicReference atomicReference = this.i;
                while (!atomicReference.compareAndSet(h6Var3, h6Var2)) {
                    if (atomicReference.get() != h6Var3) {
                        break;
                    }
                }
                wVar.subscribe(h6Var2);
                return;
            }
        } catch (Throwable th10) {
            m70.a.u(th10);
            this.f270546h.dispose();
            onError(th10);
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f270546h, cVar)) {
            this.f270546h = cVar;
            this.f270542a.onSubscribe(this);
        }
    }
}
