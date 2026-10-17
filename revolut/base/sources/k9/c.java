package k9;

import com.fasterxml.jackson.databind.JavaType;
import d9.z;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements d, Serializable, x9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f182179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f182180b;

    public c(Class cls, com.fasterxml.jackson.core.q[] qVarArr) {
        this.f182179a = cls;
        this.f182180b = qVarArr;
    }

    public static c e(m9.h hVar, Class cls) {
        Annotation[] annotationArr = x9.f.f303505a;
        Class superclass = cls.getSuperclass() != Enum.class ? cls.getSuperclass() : cls;
        Enum[] enumArr = (Enum[]) superclass.getEnumConstants();
        if (enumArr == null) {
            throw new IllegalArgumentException("Cannot determine enum constants for Class ".concat(cls.getName()));
        }
        String[] strArrF = hVar.e().f(superclass, enumArr, new String[enumArr.length]);
        com.fasterxml.jackson.core.q[] qVarArr = new com.fasterxml.jackson.core.q[enumArr.length];
        int length = enumArr.length;
        for (int i = 0; i < length; i++) {
            Enum r4 = enumArr[i];
            String strName = strArrF[i];
            if (strName == null) {
                strName = r4.name();
            }
            qVarArr[r4.ordinal()] = new f9.i(strName);
        }
        return new c(cls, qVarArr);
    }

    @Override // x9.a
    public Annotation a(Class cls) {
        if (((Class) this.f182179a) == cls) {
            return (Annotation) this.f182180b;
        }
        return null;
    }

    @Override // k9.d
    public p9.f b() {
        return (p9.f) this.f182180b;
    }

    @Override // k9.d
    public z c(m9.h hVar, Class cls) {
        z zVarB;
        m9.i iVar = (m9.i) hVar;
        iVar.f(((JavaType) this.f182179a).f26182a);
        iVar.f(cls);
        z zVar = (z) iVar.f203602g.f25476b;
        if (zVar == null) {
            zVar = null;
        }
        z zVar2 = zVar != null ? zVar : null;
        p pVarE = hVar.e();
        p9.f fVar = (p9.f) this.f182180b;
        return (fVar == null || (zVarB = pVarE.B(fVar)) == null) ? zVar2 : zVar2.a(zVarB);
    }

    @Override // k9.d
    public d9.p d(m9.h hVar, Class cls) {
        d9.p pVarI;
        d9.p pVarH = hVar.h(cls);
        p pVarE = hVar.e();
        p9.f fVar = (p9.f) this.f182180b;
        return (fVar == null || (pVarI = pVarE.i(fVar)) == null) ? pVarH : pVarH.d(pVarI);
    }

    public boolean f(Object obj2) {
        Set set = (Set) this.f182180b;
        return !(set == null || set.contains(obj2)) || ((Set) this.f182179a).contains(obj2);
    }

    @Override // x9.a
    public int size() {
        return 1;
    }

    public c(Set set, Set set2) {
        this.f182179a = set == null ? Collections.EMPTY_SET : set;
        this.f182180b = set2;
    }

    public c(Class cls, Annotation annotation) {
        this.f182179a = cls;
        this.f182180b = annotation;
    }

    public c(JavaType javaType, p9.f fVar, q qVar) {
        this.f182179a = javaType;
        this.f182180b = fVar;
    }
}
