package t9;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.databind.JavaType;
import d9.y;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import k9.r;
import k9.u;
import k9.v;
import p9.t;
import x9.n;

/* JADX INFO: loaded from: classes16.dex */
public class c extends k {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final y f268912r = y.NON_EMPTY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f9.i f268913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f268914c;
    public final JavaType d;
    public final JavaType e;
    public JavaType f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p9.f f268915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient Method f268916h;
    public final transient Field i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k9.k f268917j;
    public k9.k k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public r9.c f268918l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public transient oi0.d f268919m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f268920n;
    public final Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Class[] f268921p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final transient HashMap f268922q;

    public c(t tVar, p9.f fVar, x9.a aVar, JavaType javaType, k9.k kVar, s9.l lVar, JavaType javaType2, boolean z, Object obj2, Class[] clsArr) {
        super(tVar.i());
        this.f268915g = fVar;
        this.f268913b = new f9.i(tVar.j());
        tVar.m();
        this.f268914c = null;
        this.d = javaType;
        this.f268917j = kVar;
        this.f268919m = kVar == null ? u9.k.f278279a : null;
        this.f268918l = lVar;
        this.e = javaType2;
        if (fVar instanceof p9.d) {
            this.f268916h = null;
            this.i = ((p9.d) fVar).d;
        } else if (fVar instanceof p9.g) {
            this.f268916h = ((p9.g) fVar).e;
            this.i = null;
        } else {
            this.f268916h = null;
            this.i = null;
        }
        this.f268920n = z;
        this.o = obj2;
        this.k = null;
        this.f268921p = clsArr;
    }

    public k9.k a(oi0.d dVar, Class cls, v vVar) {
        tb4.t tVar;
        JavaType javaType = this.f;
        if (javaType != null) {
            JavaType javaTypeE = vVar.e(javaType, cls);
            dVar.getClass();
            k9.k kVarN = vVar.n(javaTypeE, this);
            tVar = new tb4.t(kVarN, dVar.E(javaTypeE.f26182a, kVarN), 4);
        } else {
            dVar.getClass();
            k9.k kVarO = vVar.o(cls, this);
            tVar = new tb4.t(kVarO, dVar.E(cls, kVarO), 4);
        }
        oi0.d dVar2 = (oi0.d) tVar.f269457c;
        if (dVar != dVar2) {
            this.f268919m = dVar2;
        }
        return (k9.k) tVar.f269456b;
    }

    @Override // k9.d
    public final p9.f b() {
        return this.f268915g;
    }

    public final boolean e(com.fasterxml.jackson.core.h hVar, v vVar, k9.k kVar) {
        if (kVar.k()) {
            return false;
        }
        if (vVar.f182201a.n(u.FAIL_ON_SELF_REFERENCES)) {
            if (!(kVar instanceof v9.d)) {
                return false;
            }
            vVar.A("Direct self-reference leading to cycle");
            throw null;
        }
        if (!vVar.f182201a.n(u.WRITE_SELF_REFERENCES_AS_NULL)) {
            return false;
        }
        if (this.k == null) {
            return true;
        }
        if (!((e9.a) hVar).d.c()) {
            hVar.n(this.f268913b);
        }
        this.k.f(null, hVar, vVar);
        return true;
    }

    public void f(k9.k kVar) {
        k9.k kVar2 = this.k;
        if (kVar2 != null && kVar2 != kVar) {
            throw new IllegalStateException(a0.d.s("Cannot override _nullSerializer: had a ", x9.f.e(this.k), ", trying to set to ", x9.f.e(kVar)));
        }
        this.k = kVar;
    }

    public void h(k9.k kVar) {
        k9.k kVar2 = this.f268917j;
        if (kVar2 != null && kVar2 != kVar) {
            throw new IllegalStateException(a0.d.s("Cannot override _serializer: had a ", x9.f.e(this.f268917j), ", trying to set to ", x9.f.e(kVar)));
        }
        this.f268917j = kVar;
    }

    public c i(n nVar) {
        f9.i iVar = this.f268913b;
        String strA = nVar.a(iVar.f132807a);
        return strA.equals(iVar.f132807a) ? this : new c(this, r.a(strA));
    }

    public void k(Object obj2, com.fasterxml.jackson.core.h hVar, v vVar) {
        Method method = this.f268916h;
        Object objInvoke = method == null ? this.i.get(obj2) : method.invoke(obj2, null);
        if (objInvoke == null) {
            k9.k kVar = this.k;
            if (kVar != null) {
                kVar.f(null, hVar, vVar);
                return;
            } else {
                hVar.p();
                return;
            }
        }
        k9.k kVarA = this.f268917j;
        if (kVarA == null) {
            Class<?> cls = objInvoke.getClass();
            oi0.d dVar = this.f268919m;
            k9.k kVarH = dVar.H(cls);
            kVarA = kVarH == null ? a(dVar, cls, vVar) : kVarH;
        }
        Object obj3 = this.o;
        if (obj3 != null) {
            if (f268912r == obj3) {
                if (kVarA.d(vVar, objInvoke)) {
                    m(hVar, vVar);
                    return;
                }
            } else if (obj3.equals(objInvoke)) {
                m(hVar, vVar);
                return;
            }
        }
        if (objInvoke == obj2 && e(hVar, vVar, kVarA)) {
            return;
        }
        r9.c cVar = this.f268918l;
        if (cVar == null) {
            kVarA.f(objInvoke, hVar, vVar);
        } else {
            kVarA.h(objInvoke, hVar, vVar, cVar);
        }
    }

    public void l(Object obj2, com.fasterxml.jackson.core.h hVar, v vVar) {
        Method method = this.f268916h;
        Object objInvoke = method == null ? this.i.get(obj2) : method.invoke(obj2, null);
        f9.i iVar = this.f268913b;
        if (objInvoke == null) {
            if (this.k != null) {
                hVar.n(iVar);
                this.k.f(null, hVar, vVar);
                return;
            }
            return;
        }
        k9.k kVarA = this.f268917j;
        if (kVarA == null) {
            Class<?> cls = objInvoke.getClass();
            oi0.d dVar = this.f268919m;
            k9.k kVarH = dVar.H(cls);
            kVarA = kVarH == null ? a(dVar, cls, vVar) : kVarH;
        }
        Object obj3 = this.o;
        if (obj3 != null) {
            if (f268912r == obj3) {
                if (kVarA.d(vVar, objInvoke)) {
                    return;
                }
            } else if (obj3.equals(objInvoke)) {
                return;
            }
        }
        if (objInvoke == obj2 && e(hVar, vVar, kVarA)) {
            return;
        }
        hVar.n(iVar);
        r9.c cVar = this.f268918l;
        if (cVar == null) {
            kVarA.f(objInvoke, hVar, vVar);
        } else {
            kVarA.h(objInvoke, hVar, vVar, cVar);
        }
    }

    public final void m(com.fasterxml.jackson.core.h hVar, v vVar) {
        k9.k kVar = this.k;
        if (kVar != null) {
            kVar.f(null, hVar, vVar);
        } else {
            hVar.p();
        }
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder(40);
        sb6.append("property '");
        sb6.append(this.f268913b.f132807a);
        sb6.append("' (");
        Method method = this.f268916h;
        if (method != null) {
            sb6.append("via method ");
            sb6.append(method.getDeclaringClass().getName());
            sb6.append("#");
            sb6.append(method.getName());
        } else {
            Field field = this.i;
            if (field != null) {
                sb6.append("field \"");
                sb6.append(field.getDeclaringClass().getName());
                sb6.append("#");
                sb6.append(field.getName());
            } else {
                sb6.append("virtual");
            }
        }
        k9.k kVar = this.f268917j;
        if (kVar == null) {
            sb6.append(", no static serializer");
        } else {
            sb6.append(", static serializer of type ".concat(kVar.getClass().getName()));
        }
        sb6.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb6.toString();
    }

    public c(c cVar, r rVar) {
        super(cVar);
        this.f268913b = new f9.i(rVar.f182194a);
        this.f268914c = cVar.f268914c;
        this.d = cVar.d;
        this.f268915g = cVar.f268915g;
        this.f268916h = cVar.f268916h;
        this.i = cVar.i;
        this.f268917j = cVar.f268917j;
        this.k = cVar.k;
        if (cVar.f268922q != null) {
            this.f268922q = new HashMap(cVar.f268922q);
        }
        this.e = cVar.e;
        this.f268919m = cVar.f268919m;
        this.f268920n = cVar.f268920n;
        this.o = cVar.o;
        this.f268921p = cVar.f268921p;
        this.f268918l = cVar.f268918l;
        this.f = cVar.f;
    }

    public c(c cVar, f9.i iVar) {
        super(cVar);
        this.f268913b = iVar;
        this.f268914c = cVar.f268914c;
        this.f268915g = cVar.f268915g;
        this.d = cVar.d;
        this.f268916h = cVar.f268916h;
        this.i = cVar.i;
        this.f268917j = cVar.f268917j;
        this.k = cVar.k;
        if (cVar.f268922q != null) {
            this.f268922q = new HashMap(cVar.f268922q);
        }
        this.e = cVar.e;
        this.f268919m = cVar.f268919m;
        this.f268920n = cVar.f268920n;
        this.o = cVar.o;
        this.f268921p = cVar.f268921p;
        this.f268918l = cVar.f268918l;
        this.f = cVar.f;
    }
}
