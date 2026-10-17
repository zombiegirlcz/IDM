package gcm;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class g3 extends ecm.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f142660b;
    public final /* synthetic */ k3 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f142659a = new AtomicReference(k3.f142708h0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d3 f142661c = new d3(this);

    public g3(k3 k3Var, String str) {
        this.d = k3Var;
        this.f142660b = (String) Preconditions.checkNotNull(str, "authority");
    }

    @Override // ecm.e
    public final String e() {
        return this.f142660b;
    }

    @Override // ecm.e
    public final ecm.i f(ecm.p1 p1Var, ecm.d dVar) {
        k3 k3Var = this.d;
        ecm.k2 k2Var = k3Var.f142719n;
        AtomicReference atomicReference = this.f142659a;
        Object obj2 = atomicReference.get();
        s2 s2Var = k3.f142708h0;
        if (obj2 != s2Var) {
            return g(p1Var, dVar);
        }
        k2Var.execute(new com.bumptech.glide.k(this, 4));
        if (atomicReference.get() != s2Var) {
            return g(p1Var, dVar);
        }
        if (k3Var.G.get()) {
            return new e3();
        }
        f3 f3Var = new f3(this, ecm.v.b(), p1Var, dVar);
        k2Var.execute(new ch.p(15, this, false, f3Var));
        return f3Var;
    }

    public final ecm.i g(ecm.p1 p1Var, ecm.d dVar) {
        ecm.l0 l0Var = (ecm.l0) this.f142659a.get();
        d3 d3Var = this.f142661c;
        if (l0Var == null) {
            return d3Var.f(p1Var, dVar);
        }
        if (!(l0Var instanceof p3)) {
            return new y2(l0Var, d3Var, this.d.i, p1Var, dVar);
        }
        q3 q3Var = ((p3) l0Var).f142827b;
        o3 o3Var = (o3) q3Var.f142837b.get(p1Var.f124857b);
        if (o3Var == null) {
            o3Var = (o3) q3Var.f142838c.get(p1Var.f124858c);
        }
        if (o3Var == null) {
            o3Var = q3Var.f142836a;
        }
        if (o3Var != null) {
            dVar = dVar.c(o3.f142792g, o3Var);
        }
        return d3Var.f(p1Var, dVar);
    }

    public final void h(ecm.l0 l0Var) {
        LinkedHashSet linkedHashSet;
        AtomicReference atomicReference = this.f142659a;
        ecm.l0 l0Var2 = (ecm.l0) atomicReference.get();
        atomicReference.set(l0Var);
        if (l0Var2 != k3.f142708h0 || (linkedHashSet = this.d.B) == null) {
            return;
        }
        Iterator it8 = linkedHashSet.iterator();
        while (it8.hasNext()) {
            ((f3) it8.next()).i();
        }
    }
}
