package v9;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import com.fasterxml.jackson.databind.type.ReferenceType;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes16.dex */
public final class b extends o0 implements t9.h {
    public static final d9.y k = d9.y.NON_EMPTY;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JavaType f286906c;
    public final k9.d d;
    public final r9.c e;
    public final k9.k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x9.n f286907g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient oi0.d f286908h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f286909j;

    public b(ReferenceType referenceType, r9.c cVar, k9.k kVar) {
        super(referenceType);
        this.f286906c = referenceType.f26192j;
        this.d = null;
        this.e = cVar;
        this.f = kVar;
        this.f286907g = null;
        this.i = null;
        this.f286909j = false;
        this.f286908h = u9.k.f278279a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f4  */
    @Override // t9.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k9.k a(k9.v r23, k9.d r24) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.b.a(k9.v, k9.d):k9.k");
    }

    @Override // k9.k
    public final boolean d(k9.v vVar, Object obj2) {
        AtomicReference atomicReference = (AtomicReference) obj2;
        if (atomicReference.get() == null) {
            return true;
        }
        Object obj3 = atomicReference.get();
        if (obj3 == null) {
            return this.f286909j;
        }
        Object obj4 = this.i;
        if (obj4 == null) {
            return false;
        }
        k9.k kVarQ = this.f;
        if (kVarQ == null) {
            try {
                kVarQ = q(vVar, obj3.getClass());
            } catch (JsonMappingException e) {
                throw new RuntimeJsonMappingException(e);
            }
        }
        return obj4 == k ? kVarQ.d(vVar, obj3) : obj4.equals(obj3);
    }

    @Override // k9.k
    public final boolean e() {
        return this.f286907g != null;
    }

    @Override // k9.k
    public final void f(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar) {
        Object obj3 = ((AtomicReference) obj2).get();
        if (obj3 == null) {
            if (this.f286907g == null) {
                vVar.h(hVar);
                return;
            }
            return;
        }
        k9.k kVarQ = this.f;
        if (kVarQ == null) {
            kVarQ = q(vVar, obj3.getClass());
        }
        r9.c cVar = this.e;
        if (cVar != null) {
            kVarQ.h(obj3, hVar, vVar, cVar);
        } else {
            kVarQ.f(obj3, hVar, vVar);
        }
    }

    @Override // k9.k
    public final void h(Object obj2, com.fasterxml.jackson.core.h hVar, k9.v vVar, r9.c cVar) {
        Object obj3 = ((AtomicReference) obj2).get();
        if (obj3 == null) {
            if (this.f286907g == null) {
                vVar.h(hVar);
            }
        } else {
            k9.k kVarQ = this.f;
            if (kVarQ == null) {
                kVarQ = q(vVar, obj3.getClass());
            }
            kVarQ.h(obj3, hVar, vVar, cVar);
        }
    }

    @Override // k9.k
    public final k9.k i(x9.n nVar) {
        k9.k kVar;
        k9.k kVar2 = this.f;
        if (kVar2 != null) {
            k9.k kVarI = kVar2.i(nVar);
            if (kVarI != kVar2) {
                kVar = kVarI;
            }
            return this;
        }
        kVar = kVar2;
        x9.n nVar2 = this.f286907g;
        x9.n lVar = nVar2 == null ? nVar : new x9.l(nVar, nVar2);
        if (kVar2 != kVar || nVar2 != lVar) {
            return new b(this, this.d, this.e, kVar, lVar, this.i, this.f286909j);
        }
        return this;
    }

    public final k9.k q(k9.v vVar, Class cls) {
        k9.k kVarH = this.f286908h.H(cls);
        if (kVarH != null) {
            return kVarH;
        }
        JavaType javaType = this.f286906c;
        boolean zD0 = javaType.D0();
        k9.d dVar = this.d;
        k9.k kVarN = zD0 ? vVar.n(vVar.e(javaType, cls), dVar) : vVar.o(cls, dVar);
        x9.n nVar = this.f286907g;
        if (nVar != null) {
            kVarN = kVarN.i(nVar);
        }
        this.f286908h = this.f286908h.E(cls, kVarN);
        return kVarN;
    }

    public b(b bVar, k9.d dVar, r9.c cVar, k9.k kVar, x9.n nVar, Object obj2, boolean z) {
        super(bVar);
        this.f286906c = bVar.f286906c;
        this.f286908h = u9.k.f278279a;
        this.d = dVar;
        this.e = cVar;
        this.f = kVar;
        this.f286907g = nVar;
        this.i = obj2;
        this.f286909j = z;
    }
}
