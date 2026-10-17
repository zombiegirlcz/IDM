package k9;

/* JADX INFO: loaded from: classes16.dex */
public abstract class k {
    public abstract Class c();

    public boolean d(v vVar, Object obj2) {
        return false;
    }

    public boolean e() {
        return this instanceof u9.u;
    }

    public abstract void f(Object obj2, com.fasterxml.jackson.core.h hVar, v vVar);

    public void h(Object obj2, com.fasterxml.jackson.core.h hVar, v vVar, r9.c cVar) {
        Class<?> clsC = c();
        if (clsC == null) {
            clsC = obj2.getClass();
        }
        String strS = j6.a.s("Type id handling not implemented for type ", clsC.getName(), " (by serializer of type ", getClass().getName(), ")");
        vVar.s().b(null, clsC, w9.f.d);
        vVar.A(strS);
        throw null;
    }

    public k i(x9.n nVar) {
        return this;
    }

    public boolean k() {
        return false;
    }
}
