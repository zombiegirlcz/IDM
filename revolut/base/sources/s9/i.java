package s9;

import com.fasterxml.jackson.databind.JavaType;
import d9.r0;
import d9.s0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import k9.t;

/* JADX INFO: loaded from: classes16.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s0 f261078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r0 f261079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f261080c;
    public j d;

    public final l a(t tVar, JavaType javaType, ArrayList arrayList) {
        int iLastIndexOf;
        k9.d dVar = null;
        if (this.f261078a == s0.NONE || javaType.f26182a.isPrimitive()) {
            return null;
        }
        m9.a aVar = tVar.f203599b;
        long j2 = tVar.f203598a;
        aVar.getClass();
        k9.l.BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES.getClass();
        j eVar = this.d;
        if (eVar == null) {
            s0 s0Var = this.f261078a;
            if (s0Var == null) {
                throw new IllegalStateException("Cannot build, 'init()' not yet called");
            }
            int i = h.f261077b[s0Var.ordinal()];
            if (i == 1 || i == 2) {
                eVar = new e(javaType, aVar.f203590a);
            } else if (i == 3) {
                eVar = new f(javaType, aVar.f203590a);
            } else if (i == 4) {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                k9.l.ACCEPT_CASE_INSENSITIVE_VALUES.getClass();
                if (arrayList != null) {
                    Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        r9.a aVar2 = (r9.a) it8.next();
                        Class cls = aVar2.f252470a;
                        String name = aVar2.f252472c;
                        if (name == null && (iLastIndexOf = (name = cls.getName()).lastIndexOf(46)) >= 0) {
                            name = name.substring(iLastIndexOf + 1);
                        }
                        concurrentHashMap.put(cls.getName(), name);
                    }
                }
                eVar = new k(tVar, javaType, concurrentHashMap, null);
            } else {
                if (i != 5) {
                    throw new IllegalStateException("Do not know how to construct standard type id resolver for idType: " + this.f261078a);
                }
                eVar = null;
            }
        }
        if (this.f261078a == s0.DEDUCTION) {
            return new b(eVar, null, this.f261080c);
        }
        int i2 = h.f261076a[this.f261079b.ordinal()];
        if (i2 == 1) {
            return new a(eVar, dVar, 0);
        }
        if (i2 == 2) {
            return new d(eVar, null, this.f261080c);
        }
        if (i2 == 3) {
            return new a(eVar, dVar, 1);
        }
        if (i2 == 4) {
            return new c(eVar, null, this.f261080c);
        }
        if (i2 == 5) {
            return new b(eVar, null, this.f261080c);
        }
        throw new IllegalStateException("Do not know how to construct standard type serializer for inclusion type: " + this.f261079b);
    }
}
