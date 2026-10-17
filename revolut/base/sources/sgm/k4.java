package sgm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public abstract class k4 extends AtomicReference implements o4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n4 f262962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f262963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f262964c;

    public k4(boolean z) {
        this.f262964c = z;
        n4 n4Var = new n4(null);
        this.f262962a = n4Var;
        set(n4Var);
    }

    @Override // sgm.o4
    public final void a(Object obj2) {
        n4 n4Var = new n4(d(obj2));
        this.f262962a.set(n4Var);
        this.f262962a = n4Var;
        this.f262963b++;
        i();
    }

    @Override // sgm.o4
    public final void b() {
        n4 n4Var = new n4(d(ygm.l.COMPLETE));
        this.f262962a.set(n4Var);
        this.f262962a = n4Var;
        this.f262963b++;
        k();
    }

    @Override // sgm.o4
    public final void c(m4 m4Var) {
        if (m4Var.getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        do {
            n4 n4VarE = (n4) m4Var.f263000c;
            if (n4VarE == null) {
                n4VarE = e();
                m4Var.f263000c = n4VarE;
            }
            while (!m4Var.d) {
                n4 n4Var = (n4) n4VarE.get();
                if (n4Var != null) {
                    if (ygm.l.a(m4Var.f262999b, f(n4Var.f263025a))) {
                        m4Var.f263000c = null;
                        return;
                    }
                    n4VarE = n4Var;
                } else {
                    m4Var.f263000c = n4VarE;
                    iAddAndGet = m4Var.addAndGet(-iAddAndGet);
                }
            }
            m4Var.f263000c = null;
            return;
        } while (iAddAndGet != 0);
    }

    public Object d(Object obj2) {
        return obj2;
    }

    public n4 e() {
        return (n4) get();
    }

    @Override // sgm.o4
    public final void error(Throwable th10) {
        n4 n4Var = new n4(d(new ygm.j(th10)));
        this.f262962a.set(n4Var);
        this.f262962a = n4Var;
        this.f262963b++;
        k();
    }

    public Object f(Object obj2) {
        return obj2;
    }

    public final void h(n4 n4Var) {
        if (this.f262964c) {
            n4 n4Var2 = new n4(null);
            n4Var2.lazySet(n4Var.get());
            n4Var = n4Var2;
        }
        set(n4Var);
    }

    public abstract void i();

    public void k() {
        n4 n4Var = (n4) get();
        if (n4Var.f263025a != null) {
            n4 n4Var2 = new n4(null);
            n4Var2.lazySet(n4Var.get());
            set(n4Var2);
        }
    }
}
