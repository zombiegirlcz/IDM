package t9;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import d9.a1;
import java.io.IOException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.concurrent.atomic.AtomicReference;
import k9.r;
import k9.t;
import k9.u;
import k9.v;
import p9.p;
import sgm.e3;
import u9.o;
import u9.q;
import x9.s;

/* JADX INFO: loaded from: classes16.dex */
public final class i extends v implements Serializable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public transient AbstractMap f268929m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public transient ArrayList f268930n;
    public transient com.fasterxml.jackson.core.h o;

    public static IOException E(com.fasterxml.jackson.core.h hVar, Exception exc2) {
        if (exc2 instanceof IOException) {
            return (IOException) exc2;
        }
        String strG = x9.f.g(exc2);
        if (strG == null) {
            strG = "[no message for " + exc2.getClass().getName() + "]";
        }
        return new JsonMappingException(hVar, strG, exc2);
    }

    @Override // k9.v
    public final k9.k D(p pVar, Object obj2) {
        k9.k kVar;
        if (obj2 instanceof k9.k) {
            kVar = (k9.k) obj2;
        } else {
            if (!(obj2 instanceof Class)) {
                pVar.h();
                A("AnnotationIntrospector returned serializer definition of type " + obj2.getClass().getName() + "; expected type JsonSerializer or Class<JsonSerializer> instead");
                throw null;
            }
            Class cls = (Class) obj2;
            if (cls == k9.j.class || x9.f.o(cls)) {
                return null;
            }
            if (!k9.k.class.isAssignableFrom(cls)) {
                pVar.h();
                A("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<JsonSerializer>");
                throw null;
            }
            t tVar = this.f182201a;
            tVar.i();
            kVar = (k9.k) x9.f.f(cls, tVar.b());
        }
        if (kVar instanceof l) {
            ((l) kVar).b(this);
        }
        return kVar;
    }

    public final void F(com.fasterxml.jackson.core.h hVar, Serializable serializable) {
        k9.k kVarQ;
        k9.k kVar;
        this.o = hVar;
        Class<?> cls = serializable.getClass();
        o oVar = this.f182205h;
        av0.b bVar = oVar.f278285a[oVar.f278286b & (cls.getName().hashCode() + 1)];
        if (bVar == null) {
            kVarQ = null;
        } else if (((Class) bVar.d) != cls || !bVar.f9866a) {
            while (true) {
                bVar = (av0.b) bVar.f9868c;
                if (bVar == null) {
                    break;
                }
                if (((Class) bVar.d) == cls && bVar.f9866a) {
                    kVarQ = (k9.k) bVar.f9867b;
                    break;
                }
            }
        } else {
            kVarQ = (k9.k) bVar.f9867b;
        }
        if (kVarQ == null) {
            e3 e3Var = this.f182203c;
            synchronized (e3Var) {
                kVar = (k9.k) ((HashMap) e3Var.f262806b).get(new s(cls, true));
            }
            if (kVar != null) {
                kVarQ = kVar;
            } else {
                kVarQ = q(cls, null);
                v13.d dVar = this.f182202b;
                t tVar = this.f182201a;
                s9.l lVarD = dVar.d(tVar, tVar.d(cls));
                if (lVarD != null) {
                    kVarQ = new q(lVarD.g(null), kVarQ);
                }
                e3 e3Var2 = this.f182203c;
                synchronized (e3Var2) {
                    try {
                        if (((HashMap) e3Var2.f262806b).put(new s(cls, true), kVarQ) == null) {
                            ((AtomicReference) e3Var2.f262807c).set(null);
                        }
                    } finally {
                    }
                }
            }
        }
        t tVar2 = this.f182201a;
        tVar2.getClass();
        if (!tVar2.n(u.WRAP_ROOT_VALUE)) {
            try {
                kVarQ.f(serializable, hVar, this);
                return;
            } catch (Exception e) {
                throw E(hVar, e);
            }
        }
        t tVar3 = this.f182201a;
        tVar3.getClass();
        x9.o oVar2 = tVar3.f;
        oVar2.getClass();
        w9.a aVar = new w9.a();
        aVar.f295662b = cls;
        String name = cls.getName();
        aVar.f295661a = name;
        aVar.f295663c = name.hashCode();
        r rVarA = (r) oVar2.f303517a.f303509b.get(aVar);
        if (rVarA == null) {
            JavaType javaTypeD = tVar3.d(cls);
            ((p9.s) tVar3.f203599b.f203591b).getClass();
            p9.r rVarN = p9.s.n(tVar3, javaTypeD);
            if (rVarN == null) {
                rVarN = p9.r.d(tVar3, javaTypeD, p9.s.o(tVar3, javaTypeD, tVar3));
            }
            r rVarG = tVar3.e().G(rVarN.e);
            rVarA = (rVarG == null || rVarG.f182194a.isEmpty()) ? r.a(cls.getSimpleName()) : rVarG;
            x9.i iVar = oVar2.f303517a;
            if (iVar.f303509b.size() >= iVar.f303508a) {
                synchronized (iVar) {
                    if (iVar.f303509b.size() >= iVar.f303508a) {
                        iVar.f303509b.clear();
                    }
                }
            }
            iVar.f303509b.put(aVar, rVarA);
        }
        try {
            hVar.z();
            t tVar4 = this.f182201a;
            String str = rVarA.f182194a;
            f9.i iVar2 = rVarA.f182196c;
            if (iVar2 == null) {
                iVar2 = tVar4 == null ? new f9.i(str) : new f9.i(str);
                rVarA.f182196c = iVar2;
            }
            hVar.n(iVar2);
            kVarQ.f(serializable, hVar, this);
            hVar.m();
        } catch (Exception e2) {
            throw E(hVar, e2);
        }
    }

    @Override // k9.v
    public final u9.v m(Object obj2, u9.i iVar) {
        a1 a1Var;
        a1 a1Var2;
        AbstractMap abstractMap = this.f268929m;
        if (abstractMap == null) {
            this.f268929m = this.f182201a.n(u.USE_EQUALITY_FOR_OBJECT_ID) ? new HashMap() : new IdentityHashMap();
        } else {
            u9.v vVar = (u9.v) abstractMap.get(obj2);
            if (vVar != null) {
                return vVar;
            }
        }
        ArrayList arrayList = this.f268930n;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                a1Var = (a1) this.f268930n.get(i);
                u9.i iVar2 = (u9.i) a1Var;
                iVar2.getClass();
                if (iVar.f278274a == iVar2.f278274a && iVar.f278275b == iVar2.f278275b) {
                    break;
                }
            }
        } else {
            this.f268930n = new ArrayList(8);
        }
        a1Var = null;
        if (a1Var == null) {
            this.f268930n.add(iVar);
            a1Var2 = iVar;
        } else {
            a1Var2 = a1Var;
        }
        u9.v vVar2 = new u9.v(a1Var2);
        this.f268929m.put(obj2, vVar2);
        return vVar2;
    }

    @Override // k9.v
    public final Object w(Class cls) {
        if (cls == null) {
            return null;
        }
        t tVar = this.f182201a;
        tVar.i();
        return x9.f.f(cls, tVar.b());
    }

    @Override // k9.v
    public final boolean x(Object obj2) throws InvalidDefinitionException {
        try {
            return obj2.equals(null);
        } catch (Throwable th10) {
            String name = obj2.getClass().getName();
            String name2 = th10.getClass().getName();
            String strG = x9.f.g(th10);
            StringBuilder sbM = v0.a.m("Problem determining whether filter of type '", name, "' should filter out `null` values: (", name2, ") ");
            sbM.append(strG);
            String string = sbM.toString();
            Class<?> cls = obj2.getClass();
            com.fasterxml.jackson.core.h hVar = this.o;
            s().b(null, cls, w9.f.d);
            InvalidDefinitionException invalidDefinitionException = new InvalidDefinitionException(hVar, string);
            invalidDefinitionException.initCause(th10);
            throw invalidDefinitionException;
        }
    }
}
