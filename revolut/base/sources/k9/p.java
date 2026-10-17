package k9;

import com.fasterxml.jackson.databind.JavaType;
import d9.b0;
import d9.g0;
import d9.m0;
import d9.z;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import p9.l0;

/* JADX INFO: loaded from: classes16.dex */
public abstract class p implements Serializable {
    public d9.v A(p9.p pVar) {
        return d9.v.f;
    }

    public z B(p9.p pVar) {
        return z.e;
    }

    public b0 C(p9.p pVar) {
        return b0.f112303b;
    }

    public Integer D(p9.f fVar) {
        return null;
    }

    public s9.i E(m9.h hVar, p9.f fVar, JavaType javaType) {
        return null;
    }

    public b F(p9.f fVar) {
        return null;
    }

    public r G(p9.a aVar) {
        return null;
    }

    public Object H(p9.f fVar) {
        return null;
    }

    public Object J(p9.p pVar) {
        return null;
    }

    public String[] K(p9.a aVar) {
        return null;
    }

    public Boolean M(p9.p pVar) {
        return null;
    }

    public l9.h N(p9.p pVar) {
        return null;
    }

    public Object P(p9.p pVar) {
        return null;
    }

    public m0 R(p9.f fVar) {
        return m0.f112307c;
    }

    public List S(p9.p pVar) {
        return null;
    }

    public String U(p9.a aVar) {
        return null;
    }

    public s9.i V(t tVar, p9.a aVar, JavaType javaType) {
        return null;
    }

    public x9.n X(p9.f fVar) {
        return null;
    }

    public Class[] Y(p9.p pVar) {
        return null;
    }

    public Boolean Z(p9.f fVar) {
        if ((fVar instanceof p9.g) && a0((p9.g) fVar)) {
            return Boolean.TRUE;
        }
        return null;
    }

    public void a(m9.h hVar, p9.a aVar, ArrayList arrayList) {
    }

    public boolean a0(p9.g gVar) {
        return false;
    }

    public l0 b(p9.a aVar, l0 l0Var) {
        return l0Var;
    }

    public Boolean b0(p9.f fVar) {
        return null;
    }

    public Object c(p9.p pVar) {
        return null;
    }

    public d9.j d(t tVar, p9.p pVar) {
        if (!h0(pVar)) {
            return null;
        }
        d9.j jVarE = e(pVar);
        return jVarE == null ? d9.j.DEFAULT : jVarE;
    }

    public Boolean d0(p9.f fVar) {
        return null;
    }

    public d9.j e(p9.p pVar) {
        return null;
    }

    public Boolean e0(p9.f fVar) {
        if ((fVar instanceof p9.g) && g0((p9.g) fVar)) {
            return Boolean.TRUE;
        }
        return null;
    }

    public String[] f(Class cls, Enum[] enumArr, String[] strArr) {
        return strArr;
    }

    public boolean g0(p9.g gVar) {
        return false;
    }

    public Object h(p9.p pVar) {
        return null;
    }

    public boolean h0(p9.p pVar) {
        return false;
    }

    public d9.p i(p9.p pVar) {
        return d9.p.f112313h;
    }

    public boolean i0(p9.f fVar) {
        return false;
    }

    public d9.b k(p9.f fVar) {
        Object objL = l(fVar);
        if (objL == null) {
            return null;
        }
        if ("".equals(objL)) {
            objL = null;
        }
        return objL == null ? d9.b.f112300c : new d9.b(objL, null);
    }

    public Object l(p9.f fVar) {
        return null;
    }

    public Boolean l0(p9.f fVar) {
        return null;
    }

    public Object m(p9.p pVar) {
        return null;
    }

    public boolean m0(Annotation annotation) {
        return false;
    }

    public Boolean n(p9.f fVar) {
        return null;
    }

    public Boolean n0(p9.a aVar) {
        return null;
    }

    public r o(p9.f fVar) {
        return null;
    }

    public Boolean o0(p9.f fVar) {
        return null;
    }

    public r p(p9.f fVar) {
        return null;
    }

    public JavaType p0(m9.h hVar, p9.p pVar, JavaType javaType) {
        return javaType;
    }

    public Object q(p9.a aVar) {
        return null;
    }

    public p9.g q0(p9.g gVar, p9.g gVar2) {
        return null;
    }

    public Object r(p9.f fVar) {
        return null;
    }

    public p9.b0 s(p9.p pVar) {
        return null;
    }

    public p9.b0 t(p9.p pVar, p9.b0 b0Var) {
        return b0Var;
    }

    public g0 u(p9.p pVar) {
        return null;
    }

    public s9.i v(m9.h hVar, p9.f fVar, JavaType javaType) {
        return null;
    }

    public String w(p9.f fVar) {
        return null;
    }

    public String x(p9.f fVar) {
        return null;
    }

    public d9.v y(p9.p pVar) {
        return A(pVar);
    }
}
