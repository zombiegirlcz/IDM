package p9;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class i extends v {
    public final u d;
    public final boolean e;

    public i(k9.p pVar, u uVar, boolean z) {
        super(pVar);
        this.d = pVar == null ? null : uVar;
        this.e = z;
    }

    public static boolean g(Method method) {
        return (Modifier.isStatic(method.getModifiers()) || method.isSynthetic() || method.isBridge() || method.getParameterTypes().length > 2) ? false : true;
    }

    public final void e(i0 i0Var, Class cls, LinkedHashMap linkedHashMap, Class cls2) {
        if (cls2 != null) {
            f(i0Var, cls, linkedHashMap, cls2);
        }
        if (cls == null) {
            return;
        }
        for (Method method : x9.f.j(cls)) {
            if (g(method)) {
                z zVar = new z(method);
                h hVar = (h) linkedHashMap.get(zVar);
                if (hVar == null) {
                    linkedHashMap.put(zVar, new h(i0Var, method, this.f234249a == null ? l.f234228b : b(method.getDeclaredAnnotations())));
                } else {
                    if (this.e) {
                        hVar.f234223c = c(hVar.f234223c, method.getDeclaredAnnotations());
                    }
                    Method method2 = hVar.f234222b;
                    if (method2 == null) {
                        hVar.f234222b = method;
                    } else if (Modifier.isAbstract(method2.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                        hVar.f234222b = method;
                        hVar.f234221a = i0Var;
                    }
                }
            }
        }
    }

    public final void f(i0 i0Var, Class cls, LinkedHashMap linkedHashMap, Class cls2) {
        List list;
        if (this.f234249a == null) {
            return;
        }
        Annotation[] annotationArr = x9.f.f303505a;
        if (cls2 == null || cls2 == cls || cls2 == Object.class) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList(8);
            x9.f.a(cls2, cls, arrayList);
            list = arrayList;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            for (Method method : ((Class) it8.next()).getDeclaredMethods()) {
                if (g(method)) {
                    z zVar = new z(method);
                    h hVar = (h) linkedHashMap.get(zVar);
                    Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                    if (hVar == null) {
                        linkedHashMap.put(zVar, new h(i0Var, null, b(declaredAnnotations)));
                    } else {
                        hVar.f234223c = c(hVar.f234223c, declaredAnnotations);
                    }
                }
            }
        }
    }
}
