package p9;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Member;

/* JADX INFO: loaded from: classes16.dex */
public final class j0 extends f {
    public final Class d;
    public final JavaType e;
    public final String f;

    public j0(a aVar, Class cls, String str, JavaType javaType) {
        super(aVar, null);
        this.d = cls;
        this.e = javaType;
        this.f = str;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!x9.f.n(obj2, j0.class)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return j0Var.d == this.d && j0Var.f.equals(this.f);
    }

    @Override // p9.p
    public final Class f() {
        return this.e.f26182a;
    }

    @Override // p9.p
    public final String getName() {
        return this.f;
    }

    @Override // p9.p
    public final JavaType h() {
        return this.e;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // p9.f
    public final Class n() {
        return this.d;
    }

    @Override // p9.f
    public final Member p() {
        return null;
    }

    @Override // p9.f
    public final Object q(Object obj2) {
        throw new IllegalArgumentException(v0.a.i(new StringBuilder("Cannot get virtual property '"), this.f, "'"));
    }

    @Override // p9.f
    public final p t(q qVar) {
        return this;
    }

    public final String toString() {
        return "[virtual " + o() + "]";
    }
}
