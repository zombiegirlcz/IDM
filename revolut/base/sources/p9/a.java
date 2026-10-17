package p9;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class a extends p implements i0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final k18.c f234181p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JavaType f234182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f234183c;
    public final w9.e d;
    public final List e;
    public final k9.p f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w9.f f234184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u f234185h;
    public final Class i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f234186j;
    public final x9.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public k18.c f234187l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public sgm.e f234188m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f234189n;
    public transient Boolean o;

    static {
        List list = Collections.EMPTY_LIST;
        f234181p = new k18.c((Object) null, 15, list, list);
    }

    public a(JavaType javaType, Class cls, List list, Class cls2, x9.a aVar, w9.e eVar, k9.p pVar, u uVar, w9.f fVar, boolean z) {
        this.f234182b = javaType;
        this.f234183c = cls;
        this.e = list;
        this.i = cls2;
        this.k = aVar;
        this.d = eVar;
        this.f = pVar;
        this.f234185h = uVar;
        this.f234184g = fVar;
        this.f234186j = z;
    }

    @Override // p9.i0
    public final JavaType a(Type type) {
        return this.f234184g.b(null, type, this.d);
    }

    @Override // p9.p
    public final Annotation e(Class cls) {
        return this.k.a(cls);
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        return x9.f.n(obj2, a.class) && ((a) obj2).f234183c == this.f234183c;
    }

    @Override // p9.p
    public final Class f() {
        return this.f234183c;
    }

    @Override // p9.p
    public final String getName() {
        return this.f234183c.getName();
    }

    @Override // p9.p
    public final JavaType h() {
        return this.f234182b;
    }

    public final int hashCode() {
        return this.f234183c.getName().hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k18.c n() {
        /*
            Method dump skipped, instruction units count: 927
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.a.n():k18.c");
    }

    public final List o() {
        Map mapE;
        List list;
        List list2 = this.f234189n;
        if (list2 != null) {
            return list2;
        }
        JavaType javaType = this.f234182b;
        if (javaType == null || (mapE = new c(this.f, this.f234184g, this.f234185h, this.f234186j).e(this, javaType)) == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList(mapE.size());
            for (e eVar : mapE.values()) {
                arrayList.add(new d(eVar.f234206a, eVar.f234207b, eVar.f234208c.c()));
            }
            list = arrayList;
        }
        this.f234189n = list;
        return list;
    }

    public final sgm.e p() {
        u uVar;
        Class clsA;
        sgm.e eVar = this.f234188m;
        if (eVar == null) {
            JavaType javaType = this.f234182b;
            if (javaType == null) {
                eVar = new sgm.e();
            } else {
                Class cls = javaType.f26182a;
                i iVar = new i(this.f, this.f234185h, this.f234186j);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                iVar.e(this, cls, linkedHashMap, this.i);
                Iterator it8 = this.e.iterator();
                while (true) {
                    boolean zHasNext = it8.hasNext();
                    uVar = iVar.d;
                    Class clsA2 = null;
                    if (!zHasNext) {
                        break;
                    }
                    JavaType javaType2 = (JavaType) it8.next();
                    if (uVar != null) {
                        clsA2 = uVar.a(javaType2.f26182a);
                    }
                    iVar.e(new jul.o(this.f234184g, javaType2.u0(), 21), javaType2.f26182a, linkedHashMap, clsA2);
                }
                if (uVar != null && (clsA = uVar.a(Object.class)) != null) {
                    iVar.f(this, cls, linkedHashMap, clsA);
                    if (iVar.f234249a != null && !linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            z zVar = (z) entry.getKey();
                            if ("hashCode".equals(zVar.f234255a) && zVar.f234256b.length == 0) {
                                try {
                                    Method declaredMethod = Object.class.getDeclaredMethod(zVar.f234255a, null);
                                    if (declaredMethod != null) {
                                        h hVar = (h) entry.getValue();
                                        hVar.f234223c = iVar.c(hVar.f234223c, declaredMethod.getDeclaredAnnotations());
                                        hVar.f234222b = declaredMethod;
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    eVar = new sgm.e();
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        h hVar2 = (h) entry2.getValue();
                        Method method = hVar2.f234222b;
                        g gVar = method == null ? null : new g(hVar2.f234221a, method, hVar2.f234223c.c(), null);
                        if (gVar != null) {
                            linkedHashMap2.put(entry2.getKey(), gVar);
                        }
                    }
                    sgm.e eVar2 = new sgm.e();
                    eVar2.f262787b = linkedHashMap2;
                    eVar = eVar2;
                }
            }
            this.f234188m = eVar;
        }
        return eVar;
    }

    public final String toString() {
        return j6.a.o(this.f234183c, new StringBuilder("[AnnotedClass "), "]");
    }

    public a(Class cls) {
        this.f234182b = null;
        this.f234183c = cls;
        this.e = Collections.EMPTY_LIST;
        this.i = null;
        this.k = p.f234235a;
        this.d = w9.e.f295672g;
        this.f = null;
        this.f234185h = null;
        this.f234184g = null;
        this.f234186j = false;
    }
}
