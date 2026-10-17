package p9;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes16.dex */
public final class g extends k {
    public final transient Method e;
    public Class[] f;

    public g(i0 i0Var, Method method, q qVar, q[] qVarArr) {
        super(i0Var, qVar, qVarArr);
        if (method == null) {
            throw new IllegalArgumentException("Cannot construct AnnotatedMethod with null Method");
        }
        this.e = method;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!x9.f.n(obj2, g.class)) {
            return false;
        }
        Method method = ((g) obj2).e;
        Method method2 = this.e;
        return method == null ? method2 == null : method.equals(method2);
    }

    @Override // p9.p
    public final Class f() {
        return this.e.getReturnType();
    }

    @Override // p9.p
    public final String getName() {
        return this.e.getName();
    }

    @Override // p9.p
    public final JavaType h() {
        return this.f234212b.a(this.e.getGenericReturnType());
    }

    public final int hashCode() {
        return this.e.getName().hashCode();
    }

    @Override // p9.f
    public final Class n() {
        return this.e.getDeclaringClass();
    }

    @Override // p9.f
    public final String o() {
        String strO = super.o();
        int length = w().length;
        if (length == 0) {
            return a0.d.r(strO, "()");
        }
        if (length != 1) {
            return String.format("%s(%d params)", super.o(), Integer.valueOf(w().length));
        }
        StringBuilder sbL = v0.a.l(strO, "(");
        Class[] clsArrW = w();
        return j6.a.o(clsArrW.length <= 0 ? null : clsArrW[0], sbL, ")");
    }

    @Override // p9.f
    public final Member p() {
        return this.e;
    }

    @Override // p9.f
    public final Object q(Object obj2) {
        try {
            return this.e.invoke(obj2, null);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new IllegalArgumentException("Failed to getValue() with method " + o() + ": " + x9.f.g(e), e);
        }
    }

    @Override // p9.f
    public final p t(q qVar) {
        return new g(this.f234212b, this.e, qVar, this.d);
    }

    public final String toString() {
        return "[method " + o() + "]";
    }

    @Override // p9.k
    public final JavaType v(int i) {
        Type[] genericParameterTypes = this.e.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return this.f234212b.a(genericParameterTypes[i]);
    }

    public final Class[] w() {
        if (this.f == null) {
            this.f = this.e.getParameterTypes();
        }
        return this.f;
    }
}
