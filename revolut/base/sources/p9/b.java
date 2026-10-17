package p9;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes16.dex */
public final class b extends k {
    public final Constructor e;

    public b(i0 i0Var, Constructor constructor, q qVar, q[] qVarArr) {
        super(i0Var, qVar, qVarArr);
        if (constructor == null) {
            throw new IllegalArgumentException("Null constructor not allowed");
        }
        this.e = constructor;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!x9.f.n(obj2, b.class)) {
            return false;
        }
        Constructor constructor = ((b) obj2).e;
        Constructor constructor2 = this.e;
        return constructor == null ? constructor2 == null : constructor.equals(constructor2);
    }

    @Override // p9.p
    public final Class f() {
        return this.e.getDeclaringClass();
    }

    @Override // p9.p
    public final String getName() {
        return this.e.getName();
    }

    @Override // p9.p
    public final JavaType h() {
        return this.f234212b.a(this.e.getDeclaringClass());
    }

    public final int hashCode() {
        return this.e.getName().hashCode();
    }

    @Override // p9.f
    public final Class n() {
        return this.e.getDeclaringClass();
    }

    @Override // p9.f
    public final Member p() {
        return this.e;
    }

    @Override // p9.f
    public final Object q(Object obj2) {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor of ".concat(this.e.getDeclaringClass().getName()));
    }

    @Override // p9.f
    public final p t(q qVar) {
        return new b(this.f234212b, this.e, qVar, this.d);
    }

    public final String toString() {
        Constructor constructor = this.e;
        int length = constructor.getParameterTypes().length;
        return String.format("[constructor for %s (%d arg%s), annotations: %s", x9.f.s(constructor.getDeclaringClass()), Integer.valueOf(length), length == 1 ? "" : "s", this.f234213c);
    }

    @Override // p9.k
    public final JavaType v(int i) {
        Type[] genericParameterTypes = this.e.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return this.f234212b.a(genericParameterTypes[i]);
    }
}
