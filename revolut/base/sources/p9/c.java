package p9;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class c extends v {
    public final boolean d;
    public final Object e;
    public Object f;

    public c(k9.p pVar, w9.f fVar, u uVar, boolean z) {
        super(pVar);
        this.e = fVar;
        this.f = pVar == null ? null : uVar;
        this.d = z;
    }

    public Map e(i0 i0Var, JavaType javaType) {
        u uVar;
        Class clsA;
        e eVar;
        JavaType javaTypeC0 = javaType.C0();
        if (javaTypeC0 == null) {
            return null;
        }
        Class cls = javaType.f26182a;
        Map mapE = e(new jul.o((w9.f) this.e, javaTypeC0.u0(), 21), javaTypeC0);
        for (Field field : cls.getDeclaredFields()) {
            if (!field.isSynthetic() && !Modifier.isStatic(field.getModifiers())) {
                if (mapE == null) {
                    mapE = new LinkedHashMap();
                }
                e eVar2 = new e(i0Var, field);
                if (this.d) {
                    eVar2.f234208c = a(l.f234228b, field.getDeclaredAnnotations());
                }
                mapE.put(field.getName(), eVar2);
            }
        }
        if (mapE != null && (uVar = (u) this.f) != null && (clsA = uVar.a(cls)) != null) {
            Iterator it8 = x9.f.i(clsA, cls, true).iterator();
            while (it8.hasNext()) {
                for (Field field2 : ((Class) it8.next()).getDeclaredFields()) {
                    if (!field2.isSynthetic() && !Modifier.isStatic(field2.getModifiers()) && (eVar = (e) mapE.get(field2.getName())) != null) {
                        eVar.f234208c = a(eVar.f234208c, field2.getDeclaredAnnotations());
                    }
                }
            }
        }
        return mapE;
    }

    public q f(x9.d dVar, x9.d dVar2) {
        if (!this.d) {
            return new q(0);
        }
        Annotation[] declaredAnnotations = dVar.f303500b;
        if (declaredAnnotations == null) {
            declaredAnnotations = dVar.f303499a.getDeclaredAnnotations();
            dVar.f303500b = declaredAnnotations;
        }
        p pVarB = b(declaredAnnotations);
        if (dVar2 != null) {
            Annotation[] declaredAnnotations2 = dVar2.f303500b;
            if (declaredAnnotations2 == null) {
                declaredAnnotations2 = dVar2.f303499a.getDeclaredAnnotations();
                dVar2.f303500b = declaredAnnotations2;
            }
            pVarB = a(pVarB, declaredAnnotations2);
        }
        return pVarB.c();
    }

    public q[] g(Annotation[][] annotationArr, Annotation[][] annotationArr2) {
        if (!this.d) {
            return v.f234247b;
        }
        int length = annotationArr.length;
        q[] qVarArr = new q[length];
        for (int i = 0; i < length; i++) {
            p pVarA = a(l.f234228b, annotationArr[i]);
            if (annotationArr2 != null) {
                pVarA = a(pVarA, annotationArr2[i]);
            }
            qVarArr[i] = pVarA.c();
        }
        return qVarArr;
    }

    public g h(Method method, i0 i0Var, Method method2) {
        int length = method.getParameterTypes().length;
        k9.p pVar = this.f234249a;
        q[] qVarArr = v.f234247b;
        if (pVar == null) {
            q qVar = new q(0);
            if (length != 0) {
                qVarArr = new q[length];
                for (int i = 0; i < length; i++) {
                    qVarArr[i] = new q(0);
                }
            }
            return new g(i0Var, method, qVar, qVarArr);
        }
        if (length == 0) {
            p pVarB = b(method.getDeclaredAnnotations());
            if (method2 != null) {
                pVarB = a(pVarB, method2.getDeclaredAnnotations());
            }
            return new g(i0Var, method, pVarB.c(), qVarArr);
        }
        p pVarB2 = b(method.getDeclaredAnnotations());
        if (method2 != null) {
            pVarB2 = a(pVarB2, method2.getDeclaredAnnotations());
        }
        return new g(i0Var, method, pVarB2.c(), g(method.getParameterAnnotations(), method2 == null ? null : method2.getParameterAnnotations()));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p9.b i(x9.d r10, x9.d r11) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.c.i(x9.d, x9.d):p9.b");
    }

    public c(k9.p pVar, a aVar, boolean z) {
        super(pVar);
        this.e = aVar;
        this.d = z;
    }
}
