package u9;

import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public final class u extends v9.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x9.n f278291l;

    public u(u uVar, av0.b bVar, Object obj2) {
        super(uVar, bVar, obj2);
        this.f278291l = uVar.f278291l;
    }

    @Override // v9.d
    public final v9.d A(av0.b bVar) {
        return new u(this, bVar);
    }

    @Override // v9.d
    public final v9.d B(t9.c[] cVarArr, t9.c[] cVarArr2) {
        return new u(this, cVarArr, cVarArr2);
    }

    @Override // k9.k
    public final void f(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        hVar.i(obj2);
        if (this.i != null) {
            r(obj2, hVar, vVar, false);
        } else if (this.f286912g == null) {
            v(obj2, hVar, vVar);
        } else {
            w(obj2, hVar, vVar);
            throw null;
        }
    }

    @Override // v9.d, k9.k
    public final void h(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar, r9.c cVar) {
        if (vVar.f182201a.n(k9.u.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS)) {
            Class cls = this.f286928a;
            if (cls != null) {
                vVar.s().b(null, cls, w9.f.d);
            }
            vVar.A("Unwrapped property requires use of type information: cannot serialize without disabling `SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS`");
            throw null;
        }
        hVar.i(obj2);
        if (this.i != null) {
            q(obj2, hVar, vVar, cVar);
        } else if (this.f286912g == null) {
            v(obj2, hVar, vVar);
        } else {
            w(obj2, hVar, vVar);
            throw null;
        }
    }

    @Override // k9.k
    public final k9.k i(x9.n nVar) {
        return new u(this, nVar);
    }

    @Override // v9.d
    public final v9.d t() {
        return this;
    }

    public final String toString() {
        return "UnwrappingBeanSerializer for ".concat(this.f286928a.getName());
    }

    @Override // v9.d
    public final v9.d x(Set set, Set set2) {
        return new u(this, set, set2);
    }

    @Override // v9.d
    public final v9.d y(Object obj2) {
        return new u(this, this.i, obj2);
    }

    public u(u uVar, Set set, Set set2) {
        super(uVar, set, set2);
        this.f278291l = uVar.f278291l;
    }

    public u(u uVar, t9.c[] cVarArr, t9.c[] cVarArr2) {
        super(uVar, cVarArr, cVarArr2);
        this.f278291l = uVar.f278291l;
    }

    public u(u uVar, av0.b bVar) {
        super(uVar, bVar, uVar.f286912g);
        this.f278291l = uVar.f278291l;
    }

    public u(v9.d dVar, x9.n nVar) {
        super(dVar, v9.d.u(dVar.d, nVar), v9.d.u(dVar.e, nVar));
        this.f278291l = nVar;
    }
}
