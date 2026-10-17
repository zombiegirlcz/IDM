package u9;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import d9.y;
import d9.z;
import java.io.IOException;
import java.util.Map;
import v9.o0;

/* JADX INFO: loaded from: classes16.dex */
public final class h extends t9.g implements t9.h {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final y f278268m = y.NON_EMPTY;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k9.d f278269c;
    public final boolean d;
    public final JavaType e;
    public final JavaType f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k9.k f278270g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k9.k f278271h;
    public final r9.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public oi0.d f278272j;
    public final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f278273l;

    public h(JavaType javaType, JavaType javaType2, JavaType javaType3, boolean z, s9.l lVar, k9.d dVar) {
        super(javaType);
        this.e = javaType2;
        this.f = javaType3;
        this.d = z;
        this.i = lVar;
        this.f278269c = dVar;
        this.f278272j = k.f278279a;
        this.k = null;
        this.f278273l = false;
    }

    @Override // t9.h
    public final k9.k a(k9.v vVar, k9.d dVar) {
        k9.k kVarD;
        k9.k kVarD2;
        boolean zX;
        boolean z;
        Object obj2;
        z zVarC;
        y yVar;
        k9.t tVar = vVar.f182201a;
        k9.p pVarE = tVar.e();
        Object objB = null;
        p9.f fVarB = dVar == null ? null : dVar.b();
        if (fVarB != null) {
            Object objM = pVarE.m(fVarB);
            kVarD2 = objM != null ? vVar.D(fVarB, objM) : null;
            Object objC = pVarE.c(fVarB);
            kVarD = objC != null ? vVar.D(fVarB, objC) : null;
        } else {
            kVarD = null;
            kVarD2 = null;
        }
        if (kVarD == null) {
            kVarD = this.f278271h;
        }
        k9.k kVarL = o0.l(vVar, dVar, kVarD);
        JavaType javaType = this.f;
        if (kVarL == null && this.d && !javaType.I0()) {
            kVarL = vVar.i(javaType, dVar);
        }
        k9.k kVar = kVarL;
        if (kVarD2 == null) {
            kVarD2 = this.f278270g;
        }
        k9.k kVarL2 = kVarD2 == null ? vVar.l(this.e, dVar) : vVar.v(kVarD2, dVar);
        if (dVar == null || (zVarC = dVar.c(tVar, null)) == null || (yVar = zVarC.f112323b) == y.USE_DEFAULTS) {
            objB = this.k;
            zX = this.f278273l;
        } else {
            int i = g.f278267a[yVar.ordinal()];
            zX = true;
            if (i != 1) {
                y yVar2 = f278268m;
                if (i != 2) {
                    if (i == 3) {
                        z = true;
                        obj2 = yVar2;
                        return new h(this, kVarL2, kVar, obj2, z);
                    }
                    if (i == 4) {
                        objB = vVar.w(zVarC.d);
                        if (objB != null) {
                            zX = vVar.x(objB);
                        }
                    } else if (i != 5) {
                        zX = false;
                    }
                } else if (javaType.D()) {
                    objB = yVar2;
                }
            } else {
                objB = x9.g.b(javaType);
                if (objB != null && objB.getClass().isArray()) {
                    objB = x9.g.a(objB);
                }
            }
        }
        z = zX;
        obj2 = objB;
        return new h(this, kVarL2, kVar, obj2, z);
    }

    @Override // k9.k
    public final boolean d(k9.v vVar, Object obj2) {
        Object value = ((Map.Entry) obj2).getValue();
        if (value == null) {
            return this.f278273l;
        }
        Object obj3 = this.k;
        if (obj3 == null) {
            return false;
        }
        k9.k kVar = this.f278271h;
        if (kVar == null) {
            Class<?> cls = value.getClass();
            k9.k kVarH = this.f278272j.H(cls);
            if (kVarH == null) {
                try {
                    oi0.d dVar = this.f278272j;
                    k9.d dVar2 = this.f278269c;
                    dVar.getClass();
                    k9.k kVarK = vVar.k(cls, dVar2);
                    oi0.d dVarE = dVar.E(cls, kVarK);
                    if (dVar != dVarE) {
                        this.f278272j = dVarE;
                    }
                    kVar = kVarK;
                } catch (JsonMappingException unused) {
                    return false;
                }
            } else {
                kVar = kVarH;
            }
        }
        return obj3 == f278268m ? kVar.d(vVar, value) : obj3.equals(value);
    }

    @Override // k9.k
    public final void f(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) throws IOException {
        Map.Entry entry = (Map.Entry) obj2;
        hVar.A(entry);
        r(entry, hVar, vVar);
        hVar.m();
    }

    @Override // k9.k
    public final void h(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar, r9.c cVar) throws IOException {
        Map.Entry entry = (Map.Entry) obj2;
        hVar.i(entry);
        f9.d dVarE = cVar.e(hVar, cVar.d(entry, com.fasterxml.jackson.core.n.START_OBJECT));
        r(entry, hVar, vVar);
        cVar.f(hVar, dVarE);
    }

    @Override // t9.g
    public final t9.g q(r9.c cVar) {
        return new h(this, this.f278270g, this.f278271h, this.k, this.f278273l);
    }

    public final void r(Map.Entry entry, com.fasterxml.jackson.core.h hVar, k9.v vVar) throws IOException {
        k9.k kVar;
        Object key = entry.getKey();
        k9.k kVar2 = key == null ? vVar.f182204g : this.f278270g;
        Object value = entry.getValue();
        if (value != null) {
            kVar = this.f278271h;
            if (kVar == null) {
                Class<?> cls = value.getClass();
                k9.k kVarH = this.f278272j.H(cls);
                if (kVarH == null) {
                    JavaType javaType = this.f;
                    boolean zD0 = javaType.D0();
                    k9.d dVar = this.f278269c;
                    if (zD0) {
                        oi0.d dVar2 = this.f278272j;
                        tb4.t tVarG = dVar2.g(vVar.e(javaType, cls), vVar, dVar);
                        oi0.d dVar3 = (oi0.d) tVarG.f269457c;
                        if (dVar2 != dVar3) {
                            this.f278272j = dVar3;
                        }
                        kVar = (k9.k) tVarG.f269456b;
                    } else {
                        oi0.d dVar4 = this.f278272j;
                        dVar4.getClass();
                        k9.k kVarK = vVar.k(cls, dVar);
                        oi0.d dVarE = dVar4.E(cls, kVarK);
                        if (dVar4 != dVarE) {
                            this.f278272j = dVarE;
                        }
                        kVar = kVarK;
                    }
                } else {
                    kVar = kVarH;
                }
            }
            Object obj2 = this.k;
            if (obj2 != null && ((obj2 == f278268m && kVar.d(vVar, value)) || obj2.equals(value))) {
                return;
            }
        } else if (this.f278273l) {
            return;
        } else {
            kVar = vVar.f;
        }
        kVar2.f(key, hVar, vVar);
        r9.c cVar = this.i;
        try {
            if (cVar == null) {
                kVar.f(value, hVar, vVar);
            } else {
                kVar.h(value, hVar, vVar, cVar);
            }
        } catch (Exception e) {
            o0.p(vVar, e, entry, "" + key);
            throw null;
        }
    }

    public h(h hVar, k9.k kVar, k9.k kVar2, Object obj2, boolean z) {
        super(Map.class, 0);
        this.e = hVar.e;
        this.f = hVar.f;
        this.d = hVar.d;
        this.i = hVar.i;
        this.f278270g = kVar;
        this.f278271h = kVar2;
        this.f278272j = k.f278279a;
        this.f278269c = hVar.f278269c;
        this.k = obj2;
        this.f278273l = z;
    }
}
