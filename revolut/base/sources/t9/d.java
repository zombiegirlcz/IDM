package t9;

import java.util.Set;
import k9.v;
import u9.u;
import x9.n;

/* JADX INFO: loaded from: classes16.dex */
public final class d extends v9.d {
    @Override // v9.d
    public final v9.d A(av0.b bVar) {
        return new d(this, bVar, this.f286912g);
    }

    @Override // v9.d
    public final v9.d B(c[] cVarArr, c[] cVarArr2) {
        return new d(this, cVarArr, cVarArr2);
    }

    @Override // k9.k
    public final void f(Object obj2, com.fasterxml.jackson.core.h hVar, v vVar) {
        if (this.i != null) {
            hVar.i(obj2);
            r(obj2, hVar, vVar, true);
            return;
        }
        hVar.A(obj2);
        if (this.f286912g != null) {
            w(obj2, hVar, vVar);
            throw null;
        }
        v(obj2, hVar, vVar);
        hVar.m();
    }

    @Override // k9.k
    public final k9.k i(n nVar) {
        return new u(this, nVar);
    }

    @Override // v9.d
    public final v9.d t() {
        return (this.i == null && this.f == null && this.f286912g == null) ? new u9.b(this) : this;
    }

    public final String toString() {
        return "BeanSerializer for ".concat(this.f286928a.getName());
    }

    @Override // v9.d
    public final v9.d x(Set set, Set set2) {
        return new d(this, set, set2);
    }

    @Override // v9.d
    public final v9.d y(Object obj2) {
        return new d(this, this.i, obj2);
    }
}
