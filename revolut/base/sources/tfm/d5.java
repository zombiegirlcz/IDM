package tfm;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class d5 extends agm.a implements lfm.g {
    public static final ch.b k = new ch.b(15);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final efm.r f270410g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f270411h;
    public final u4 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a5 f270412j;

    public d5(a5 a5Var, efm.r rVar, AtomicReference atomicReference, u4 u4Var) {
        this.f270412j = a5Var;
        this.f270410g = rVar;
        this.f270411h = atomicReference;
        this.i = u4Var;
    }

    public static d5 f(efm.r rVar, u4 u4Var) {
        AtomicReference atomicReference = new AtomicReference();
        return new d5(new a5(atomicReference, u4Var), rVar, atomicReference, u4Var);
    }

    @Override // lfm.g
    public final void a(ifm.c cVar) {
        AtomicReference atomicReference;
        z4 z4Var = (z4) cVar;
        do {
            atomicReference = this.f270411h;
            if (atomicReference.compareAndSet(z4Var, null)) {
                return;
            }
        } while (atomicReference.get() == z4Var);
    }

    @Override // agm.a
    public final void d(kfm.g gVar) {
        z4 z4Var;
        loop0: while (true) {
            AtomicReference atomicReference = this.f270411h;
            z4Var = (z4) atomicReference.get();
            if (z4Var != null && !z4Var.isDisposed()) {
                break;
            }
            z4 z4Var2 = new z4(this.i.call());
            while (!atomicReference.compareAndSet(z4Var, z4Var2)) {
                if (atomicReference.get() != z4Var) {
                    break;
                }
            }
            z4Var = z4Var2;
            break loop0;
        }
        AtomicBoolean atomicBoolean = z4Var.d;
        boolean z = !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
        try {
            gVar.accept(z4Var);
            if (z) {
                this.f270410g.subscribe(z4Var);
            }
        } catch (Throwable th10) {
            if (z) {
                atomicBoolean.compareAndSet(true, false);
            }
            m70.a.u(th10);
            throw zfm.h.d(th10);
        }
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        this.f270412j.subscribe(yVar);
    }
}
