package v9;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import java.io.IOException;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes16.dex */
public final class n extends o0 implements t9.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p9.f f286922c;
    public final r9.c d;
    public final k9.k e;
    public final k9.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final JavaType f286923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f286924h;
    public transient oi0.d i;

    /* JADX WARN: Illegal instructions before constructor call */
    public n(n nVar, k9.d dVar, r9.c cVar, k9.k kVar, boolean z) {
        Class cls = nVar.f286928a;
        super(cls == null ? Object.class : cls);
        this.f286922c = nVar.f286922c;
        this.f286923g = nVar.f286923g;
        this.d = cVar;
        this.e = kVar;
        this.f = dVar;
        this.f286924h = z;
        this.i = u9.k.f278279a;
    }

    @Override // t9.h
    public final k9.k a(k9.v vVar, k9.d dVar) {
        r9.c cVarG = this.d;
        if (cVarG != null) {
            cVarG = cVarG.g(dVar);
        }
        boolean z = this.f286924h;
        k9.k kVar = this.e;
        if (kVar != null) {
            return r(dVar, cVarG, vVar.u(kVar, dVar), z);
        }
        boolean zC = k9.l.USE_STATIC_TYPING.c(vVar.f182201a.f203598a);
        JavaType javaType = this.f286923g;
        if (!zC && !Modifier.isFinal(javaType.f26182a.getModifiers())) {
            return dVar != this.f ? r(dVar, cVarG, kVar, z) : this;
        }
        k9.k kVarN = vVar.n(javaType, dVar);
        Class cls = javaType.f26182a;
        boolean zQ = false;
        if (!cls.isPrimitive() ? cls == String.class || cls == Integer.class || cls == Boolean.class || cls == Double.class : cls == Integer.TYPE || cls == Boolean.TYPE || cls == Double.TYPE) {
            zQ = x9.f.q(kVarN);
        }
        return r(dVar, cVarG, kVarN, zQ);
    }

    @Override // k9.k
    public final boolean d(k9.v vVar, Object obj2) {
        Object objQ = this.f286922c.q(obj2);
        if (objQ == null) {
            return true;
        }
        k9.k kVarQ = this.e;
        if (kVarQ == null) {
            try {
                kVarQ = q(vVar, objQ.getClass());
            } catch (JsonMappingException e) {
                throw new RuntimeJsonMappingException(e);
            }
        }
        return kVarQ.d(vVar, objQ);
    }

    @Override // k9.k
    public final void f(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) throws IOException {
        p9.f fVar = this.f286922c;
        try {
            Object objQ = fVar.q(obj2);
            if (objQ == null) {
                vVar.h(hVar);
                return;
            }
            k9.k kVarQ = this.e;
            if (kVarQ == null) {
                kVarQ = q(vVar, objQ.getClass());
            }
            r9.c cVar = this.d;
            if (cVar != null) {
                kVarQ.h(objQ, hVar, vVar, cVar);
            } else {
                kVarQ.f(objQ, hVar, vVar);
            }
        } catch (Exception e) {
            o0.p(vVar, e, obj2, fVar.getName() + "()");
            throw null;
        }
    }

    @Override // k9.k
    public final void h(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar, r9.c cVar) throws IOException {
        p9.f fVar = this.f286922c;
        try {
            Object objQ = fVar.q(obj2);
            if (objQ == null) {
                vVar.h(hVar);
                return;
            }
            k9.k kVarQ = this.e;
            if (kVarQ == null) {
                kVarQ = q(vVar, objQ.getClass());
            } else if (this.f286924h) {
                f9.d dVarE = cVar.e(hVar, cVar.d(obj2, com.fasterxml.jackson.core.n.VALUE_STRING));
                kVarQ.f(objQ, hVar, vVar);
                cVar.f(hVar, dVarE);
                return;
            }
            kVarQ.h(objQ, hVar, vVar, new m(cVar, obj2));
        } catch (Exception e) {
            o0.p(vVar, e, obj2, fVar.getName() + "()");
            throw null;
        }
    }

    public final k9.k q(k9.v vVar, Class cls) {
        k9.k kVarH = this.i.H(cls);
        if (kVarH != null) {
            return kVarH;
        }
        JavaType javaType = this.f286923g;
        boolean zD0 = javaType.D0();
        k9.d dVar = this.f;
        if (!zD0) {
            k9.k kVarO = vVar.o(cls, dVar);
            this.i = this.i.E(cls, kVarO);
            return kVarO;
        }
        JavaType javaTypeE = vVar.e(javaType, cls);
        k9.k kVarN = vVar.n(javaTypeE, dVar);
        oi0.d dVar2 = this.i;
        dVar2.getClass();
        this.i = dVar2.E(javaTypeE.f26182a, kVarN);
        return kVarN;
    }

    public final n r(k9.d dVar, r9.c cVar, k9.k kVar, boolean z) {
        return (this.f == dVar && this.d == cVar && this.e == kVar && z == this.f286924h) ? this : new n(this, dVar, cVar, kVar, z);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("(@JsonValue serializer for method ");
        p9.f fVar = this.f286922c;
        sb6.append(fVar.n());
        sb6.append("#");
        sb6.append(fVar.getName());
        sb6.append(")");
        return sb6.toString();
    }

    public n(p9.f fVar, r9.c cVar, k9.k kVar) {
        super(fVar.h());
        this.f286922c = fVar;
        this.f286923g = fVar.h();
        this.d = cVar;
        this.e = kVar;
        this.f = null;
        this.f286924h = true;
        this.i = u9.k.f278279a;
    }
}
