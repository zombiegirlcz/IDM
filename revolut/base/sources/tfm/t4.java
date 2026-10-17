package tfm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public abstract class t4 extends AtomicReference implements y4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w4 f270841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f270842b;

    public t4() {
        w4 w4Var = new w4(null);
        this.f270841a = w4Var;
        set(w4Var);
    }

    @Override // tfm.y4
    public final void a(Object obj2) {
        w4 w4Var = new w4(c(obj2));
        this.f270841a.set(w4Var);
        this.f270841a = w4Var;
        this.f270842b++;
        h();
    }

    @Override // tfm.y4
    public final void b() {
        w4 w4Var = new w4(c(zfm.m.COMPLETE));
        this.f270841a.set(w4Var);
        this.f270841a = w4Var;
        this.f270842b++;
        i();
    }

    public Object c(Object obj2) {
        return obj2;
    }

    public w4 d() {
        return (w4) get();
    }

    @Override // tfm.y4
    public final void e(v4 v4Var) {
        if (v4Var.getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        do {
            w4 w4VarD = (w4) v4Var.f270893c;
            if (w4VarD == null) {
                w4VarD = d();
                v4Var.f270893c = w4VarD;
            }
            while (!v4Var.d) {
                w4 w4Var = (w4) w4VarD.get();
                if (w4Var != null) {
                    if (zfm.m.a(v4Var.f270892b, f(w4Var.f270921a))) {
                        v4Var.f270893c = null;
                        return;
                    }
                    w4VarD = w4Var;
                } else {
                    v4Var.f270893c = w4VarD;
                    iAddAndGet = v4Var.addAndGet(-iAddAndGet);
                }
            }
            v4Var.f270893c = null;
            return;
        } while (iAddAndGet != 0);
    }

    @Override // tfm.y4
    public final void error(Throwable th10) {
        w4 w4Var = new w4(c(new zfm.k(th10)));
        this.f270841a.set(w4Var);
        this.f270841a = w4Var;
        this.f270842b++;
        i();
    }

    public Object f(Object obj2) {
        return obj2;
    }

    public abstract void h();

    public void i() {
        w4 w4Var = (w4) get();
        if (w4Var.f270921a != null) {
            w4 w4Var2 = new w4(null);
            w4Var2.lazySet(w4Var.get());
            set(w4Var2);
        }
    }
}
