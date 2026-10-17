package mcm;

import com.google.common.base.MoreObjects;
import ecm.a1;
import ecm.g2;

/* JADX INFO: loaded from: classes22.dex */
public abstract class b extends a1 {
    @Override // ecm.a1
    public final boolean b() {
        return g().b();
    }

    @Override // ecm.a1
    public final void c(g2 g2Var) {
        g().c(g2Var);
    }

    @Override // ecm.a1
    public final void e() {
        g().e();
    }

    public abstract a1 g();

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("delegate", g()).toString();
    }
}
