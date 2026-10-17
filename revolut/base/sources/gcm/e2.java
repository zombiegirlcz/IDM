package gcm;

import com.google.common.base.Preconditions;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public final class e2 implements r3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2 f142624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f142625b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g2 f142626c;

    public e2(g2 g2Var, b2 b2Var) {
        this.f142626c = g2Var;
        this.f142624a = b2Var;
    }

    @Override // gcm.r3
    public final void a(ecm.g2 g2Var) {
        g2 g2Var2 = this.f142626c;
        g2Var2.i.b(ecm.f.INFO, "{0} SHUTDOWN with {1}", this.f142624a.a(), g2.h(g2Var));
        this.f142625b = true;
        g2Var2.k.execute(new ch.p(13, this, false, g2Var));
    }

    @Override // gcm.r3
    public final void b() {
        g2 g2Var = this.f142626c;
        g2Var.i.a(ecm.f.INFO, "READY");
        g2Var.k.execute(new d2(this, 0));
    }

    @Override // gcm.r3
    public final ecm.b c(ecm.b bVar) {
        Iterator it8 = this.f142626c.f142648j.iterator();
        if (it8.hasNext()) {
            throw v0.a.e(it8);
        }
        return bVar;
    }

    @Override // gcm.r3
    public final void d() {
        Preconditions.checkState(this.f142625b, "transportShutdown() must be called before transportTerminated().");
        g2 g2Var = this.f142626c;
        ecm.g gVar = g2Var.i;
        ecm.f fVar = ecm.f.INFO;
        b2 b2Var = this.f142624a;
        gVar.b(fVar, "{0} Terminated", b2Var.a());
        ecm.k2 k2Var = g2Var.k;
        k2Var.execute(new y1(g2Var, b2Var, false));
        Iterator it8 = g2Var.f142648j.iterator();
        if (!it8.hasNext()) {
            k2Var.execute(new d2(this, 1));
        } else {
            if (it8.next() != null) {
                throw new ClassCastException();
            }
            b2Var.getAttributes();
            throw null;
        }
    }

    @Override // gcm.r3
    public final void e(boolean z) {
        g2 g2Var = this.f142626c;
        g2Var.k.execute(new y1(g2Var, this.f142624a, z));
    }
}
