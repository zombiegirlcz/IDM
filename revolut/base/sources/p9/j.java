package p9;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Member;

/* JADX INFO: loaded from: classes16.dex */
public final class j extends f {
    public final k d;
    public final JavaType e;
    public final int f;

    public j(k kVar, JavaType javaType, i0 i0Var, q qVar, int i) {
        super(i0Var, qVar);
        this.d = kVar;
        this.e = javaType;
        this.f = i;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!x9.f.n(obj2, j.class)) {
            return false;
        }
        j jVar = (j) obj2;
        return jVar.d.equals(this.d) && jVar.f == this.f;
    }

    @Override // p9.p
    public final Class f() {
        return this.e.f26182a;
    }

    @Override // p9.p
    public final String getName() {
        return "";
    }

    @Override // p9.p
    public final JavaType h() {
        return this.e;
    }

    public final int hashCode() {
        return this.d.hashCode() + this.f;
    }

    @Override // p9.f
    public final Class n() {
        return this.d.n();
    }

    @Override // p9.f
    public final Member p() {
        return this.d.p();
    }

    @Override // p9.f
    public final Object q(Object obj2) {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor parameter of ".concat(this.d.n().getName()));
    }

    @Override // p9.f
    public final p t(q qVar) {
        if (qVar == this.f234213c) {
            return this;
        }
        k kVar = this.d;
        q[] qVarArr = kVar.d;
        int i = this.f;
        qVarArr[i] = qVar;
        return kVar.u(i);
    }

    public final String toString() {
        return "[parameter #" + this.f + ", annotations: " + this.f234213c + "]";
    }
}
