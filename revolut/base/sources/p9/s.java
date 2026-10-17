package p9;

import au0.u2;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.SimpleType;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public final class s extends p implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f234244b = r.d(null, SimpleType.W0(String.class), new a(String.class));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f234245c;
    public static final r d;
    public static final r e;
    public static final r f;

    static {
        Class cls = Boolean.TYPE;
        f234245c = r.d(null, SimpleType.W0(cls), new a(cls));
        Class cls2 = Integer.TYPE;
        d = r.d(null, SimpleType.W0(cls2), new a(cls2));
        Class cls3 = Long.TYPE;
        e = r.d(null, SimpleType.W0(cls3), new a(cls3));
        f = r.d(null, SimpleType.W0(Object.class), new a(Object.class));
    }

    public static r n(m9.h hVar, JavaType javaType) {
        Class cls = javaType.f26182a;
        if (cls.isPrimitive()) {
            if (cls != Integer.TYPE) {
                if (cls != Long.TYPE) {
                    if (cls != Boolean.TYPE) {
                        return null;
                    }
                    return f234245c;
                }
                return e;
            }
            return d;
        }
        if (!x9.f.p(cls)) {
            if (k9.h.class.isAssignableFrom(cls)) {
                return r.d(hVar, javaType, new a(cls));
            }
            return null;
        }
        if (cls == Object.class) {
            return f;
        }
        if (cls == String.class) {
            return f234244b;
        }
        if (cls != Integer.class) {
            if (cls != Long.class) {
                if (cls != Boolean.class) {
                    return null;
                }
                return f234245c;
            }
            return e;
        }
        return d;
    }

    public static a o(m9.h hVar, JavaType javaType, m9.h hVar2) {
        javaType.getClass();
        Class cls = javaType.f26182a;
        if (javaType instanceof ArrayType) {
            ((m9.i) hVar).f203601c.getClass();
            return new a(cls);
        }
        u2 u2Var = new u2(hVar, javaType, hVar2);
        ArrayList arrayList = new ArrayList(8);
        if (!javaType.F0(Object.class)) {
            if (cls.isInterface()) {
                u2.d(javaType, arrayList, false);
            } else {
                u2.e(javaType, arrayList, false);
            }
        }
        return new a(javaType, (Class) u2Var.e, arrayList, null, u2Var.i(arrayList), (w9.e) u2Var.d, (k9.p) u2Var.f9385b, hVar2, hVar.f203599b.f203590a, u2Var.f9384a);
    }
}
