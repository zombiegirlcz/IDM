package s9;

import com.fasterxml.jackson.databind.JavaType;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import k9.t;
import p9.r;
import p9.s;

/* JADX INFO: loaded from: classes16.dex */
public final class k extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m9.h f261083c;
    public final ConcurrentHashMap d;
    public final HashMap e;

    public k(t tVar, JavaType javaType, ConcurrentHashMap concurrentHashMap, HashMap map) {
        super(javaType, tVar.f203599b.f203590a);
        this.f261083c = tVar;
        this.d = concurrentHashMap;
        this.e = map;
        k9.l.ACCEPT_CASE_INSENSITIVE_VALUES.getClass();
    }

    @Override // s9.j
    public final String a(Object obj2) {
        return c(obj2.getClass());
    }

    @Override // s9.j
    public final String b(Object obj2, Class cls) {
        return obj2 == null ? c(cls) : c(obj2.getClass());
    }

    public final String c(Class cls) {
        if (cls == null) {
            return null;
        }
        String name = cls.getName();
        ConcurrentHashMap concurrentHashMap = this.d;
        String strU = (String) concurrentHashMap.get(name);
        if (strU == null) {
            Class cls2 = this.f261081a.b(null, cls, w9.f.d).f26182a;
            m9.h hVar = this.f261083c;
            hVar.getClass();
            if (k9.l.USE_ANNOTATIONS.c(hVar.f203598a)) {
                JavaType javaTypeD = hVar.d(cls2);
                ((s) hVar.f203599b.f203591b).getClass();
                r rVarN = s.n(hVar, javaTypeD);
                if (rVarN == null) {
                    rVarN = r.d(hVar, javaTypeD, s.o(hVar, javaTypeD, hVar));
                }
                strU = hVar.e().U(rVarN.e);
            }
            if (strU == null) {
                String name2 = cls2.getName();
                int iLastIndexOf = name2.lastIndexOf(46);
                if (iLastIndexOf >= 0) {
                    name2 = name2.substring(iLastIndexOf + 1);
                }
                strU = name2;
            }
            concurrentHashMap.put(name, strU);
        }
        return strU;
    }

    public final String toString() {
        return String.format("[%s; id-to-type=%s]", k.class.getName(), this.e);
    }
}
