package mcm;

import com.google.common.base.MoreObjects;
import ecm.x0;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public abstract class d extends x0 {
    @Override // ecm.x0
    public final List b() {
        return j().b();
    }

    @Override // ecm.x0
    public final ecm.g d() {
        return j().d();
    }

    @Override // ecm.x0
    public final Object e() {
        return j().e();
    }

    @Override // ecm.x0
    public final void f() {
        j().f();
    }

    @Override // ecm.x0
    public void g() {
        j().g();
    }

    @Override // ecm.x0
    public void i(List list) {
        j().i(list);
    }

    public abstract x0 j();

    public String toString() {
        return MoreObjects.toStringHelper(this).add("delegate", j()).toString();
    }
}
