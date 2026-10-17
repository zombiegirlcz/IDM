package w9;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.PlaceholderForType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.type.SimpleType;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;
import k9.h;
import v60.g;
import x9.i;

/* JADX INFO: loaded from: classes16.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final JavaType[] f295676b = new JavaType[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f295677c = new f();
    public static final e d = e.f295672g;
    public static final Class e = String.class;
    public static final Class f = Object.class;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Class f295678g = Comparable.class;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Class f295679h = Class.class;
    public static final Class i = Enum.class;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Class f295680j = h.class;
    public static final Class k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Class f295681l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Class f295682m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SimpleType f295683n;
    public static final SimpleType o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final SimpleType f295684p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final SimpleType f295685q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final SimpleType f295686r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final SimpleType f295687s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final SimpleType f295688t;
    public static final SimpleType u;
    public static final SimpleType v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f295689a = new i(16, 200);

    static {
        Class cls = Boolean.TYPE;
        k = cls;
        Class cls2 = Integer.TYPE;
        f295681l = cls2;
        Class cls3 = Long.TYPE;
        f295682m = cls3;
        f295683n = new SimpleType(cls);
        o = new SimpleType(cls2);
        f295684p = new SimpleType(cls3);
        f295685q = new SimpleType(String.class);
        f295686r = new SimpleType(Object.class);
        f295687s = new SimpleType(Comparable.class);
        f295688t = new SimpleType(Enum.class);
        u = new SimpleType(Class.class);
        v = new SimpleType(h.class);
    }

    public static SimpleType a(Class cls) {
        if (cls.isPrimitive()) {
            if (cls == k) {
                return f295683n;
            }
            if (cls == f295681l) {
                return o;
            }
            if (cls == f295682m) {
                return f295684p;
            }
            return null;
        }
        if (cls == e) {
            return f295685q;
        }
        if (cls == f) {
            return f295686r;
        }
        if (cls == f295680j) {
            return v;
        }
        return null;
    }

    public static boolean e(JavaType javaType, JavaType javaType2) {
        if (javaType2 instanceof PlaceholderForType) {
            ((PlaceholderForType) javaType2).k = javaType;
            return true;
        }
        if (javaType.f26182a == javaType2.f26182a) {
            List listE = javaType.u0().e();
            List listE2 = javaType2.u0().e();
            int size = listE.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (e((JavaType) listE.get(i2), (JavaType) listE2.get(i2))) {
                }
            }
            return true;
        }
        return false;
    }

    public static JavaType f(JavaType javaType, Class cls) {
        Class cls2 = javaType.f26182a;
        if (cls2 == cls) {
            return javaType;
        }
        JavaType javaTypeT0 = javaType.t0(cls);
        if (javaTypeT0 != null) {
            return javaTypeT0;
        }
        if (cls.isAssignableFrom(cls2)) {
            throw new IllegalArgumentException(String.format("Internal error: class %s not included as super-type for %s", cls.getName(), javaType));
        }
        throw new IllegalArgumentException(String.format("Class %s not a super-type of %s", cls.getName(), javaType));
    }

    public static JavaType[] i(JavaType javaType, Class cls) {
        JavaType javaTypeT0 = javaType.t0(cls);
        return javaTypeT0 == null ? f295676b : javaTypeT0.u0().f295674b;
    }

    public static void k(Class cls) {
        e eVar = d;
        if (!eVar.isEmpty() || a(cls) == null) {
            new SimpleType(cls, eVar, null, null);
        }
    }

    public static SimpleType l() {
        f295677c.getClass();
        return f295686r;
    }

    public final JavaType b(g gVar, Type type, e eVar) {
        JavaType javaType;
        Type[] bounds;
        JavaType javaType2;
        e eVarC;
        if (type instanceof Class) {
            return c(gVar, (Class) type, d);
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class cls = (Class) parameterizedType.getRawType();
            if (cls == i) {
                return f295688t;
            }
            if (cls == f295678g) {
                return f295687s;
            }
            if (cls == f295679h) {
                return u;
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments == null ? 0 : actualTypeArguments.length;
            if (length == 0) {
                eVarC = d;
            } else {
                JavaType[] javaTypeArr = new JavaType[length];
                for (int i2 = 0; i2 < length; i2++) {
                    javaTypeArr[i2] = b(gVar, actualTypeArguments[i2], eVar);
                }
                eVarC = e.c(cls, javaTypeArr);
            }
            return c(gVar, cls, eVarC);
        }
        if (type instanceof JavaType) {
            return (JavaType) type;
        }
        if (type instanceof GenericArrayType) {
            JavaType javaTypeB = b(gVar, ((GenericArrayType) type).getGenericComponentType(), eVar);
            int i3 = ArrayType.f26187l;
            return new ArrayType(javaTypeB, eVar, Array.newInstance((Class<?>) javaTypeB.f26182a, 0), null, null, false);
        }
        if (!(type instanceof TypeVariable)) {
            if (type instanceof WildcardType) {
                return b(gVar, ((WildcardType) type).getUpperBounds()[0], eVar);
            }
            StringBuilder sb6 = new StringBuilder("Unrecognized Type: ");
            sb6.append(type == null ? "[null]" : type.toString());
            throw new IllegalArgumentException(sb6.toString());
        }
        TypeVariable typeVariable = (TypeVariable) type;
        String name = typeVariable.getName();
        if (eVar == null) {
            throw new IllegalArgumentException(p.a.p("Null `bindings` passed (type variable \"", name, "\")"));
        }
        String[] strArr = eVar.f295673a;
        int length2 = strArr.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length2) {
                javaType = null;
                break;
            }
            if (name.equals(strArr[i5])) {
                javaType = eVar.f295674b[i5];
                if ((javaType instanceof ResolvedRecursiveType) && (javaType2 = ((ResolvedRecursiveType) javaType).f26193j) != null) {
                    javaType = javaType2;
                }
            } else {
                i5++;
            }
        }
        if (javaType != null) {
            return javaType;
        }
        String[] strArr2 = eVar.f295675c;
        if (strArr2 != null) {
            int length3 = strArr2.length;
            do {
                length3--;
                if (length3 >= 0) {
                }
            } while (!name.equals(strArr2[length3]));
            return f295686r;
        }
        String[] strArr3 = eVar.f295675c;
        int length4 = strArr3 == null ? 0 : strArr3.length;
        String[] strArr4 = length4 == 0 ? new String[1] : (String[]) Arrays.copyOf(strArr3, length4 + 1);
        strArr4[length4] = name;
        e eVar2 = new e(eVar.f295673a, eVar.f295674b, strArr4);
        synchronized (typeVariable) {
            bounds = typeVariable.getBounds();
        }
        return b(gVar, bounds[0], eVar2);
    }

    public final JavaType c(g gVar, Class cls, e eVar) {
        g gVar2;
        g gVar3;
        JavaType javaTypeB;
        JavaType[] javaTypeArrD;
        JavaType javaType;
        JavaType javaTypeM0;
        Class cls2;
        e eVar2;
        Class cls3;
        e eVar3;
        Class cls4;
        JavaType javaType2;
        e eVar4;
        JavaType javaType3;
        SimpleType simpleTypeA = a(cls);
        if (simpleTypeA != null) {
            return simpleTypeA;
        }
        Object cVar = (eVar == null || eVar.isEmpty()) ? cls : new c(cls, eVar.f295674b, eVar.d);
        i iVar = this.f295689a;
        JavaType javaType4 = (JavaType) iVar.f303509b.get(cVar);
        if (javaType4 != null) {
            return javaType4;
        }
        if (gVar == null) {
            gVar3 = new g((g) null, cls);
        } else {
            if (((Class) gVar.f286252c) != cls) {
                Object obj2 = gVar.f286251b;
                while (true) {
                    g gVar4 = (g) obj2;
                    if (gVar4 == null) {
                        gVar2 = null;
                        break;
                    }
                    if (((Class) gVar4.f286252c) == cls) {
                        gVar2 = gVar4;
                        break;
                    }
                    obj2 = gVar4.f286251b;
                }
            } else {
                gVar2 = gVar;
            }
            if (gVar2 != null) {
                ResolvedRecursiveType resolvedRecursiveType = new ResolvedRecursiveType(cls, d, null, null, 0, null, null, false);
                if (((ArrayList) gVar2.d) == null) {
                    gVar2.d = new ArrayList();
                }
                ((ArrayList) gVar2.d).add(resolvedRecursiveType);
                return resolvedRecursiveType;
            }
            gVar3 = new g(gVar, cls);
        }
        int i2 = 0;
        if (cls.isArray()) {
            JavaType javaTypeB2 = b(gVar3, cls.getComponentType(), eVar);
            int i3 = ArrayType.f26187l;
            javaTypeM0 = new ArrayType(javaTypeB2, eVar, Array.newInstance((Class<?>) javaTypeB2.f26182a, 0), null, null, false);
        } else {
            if (cls.isInterface()) {
                javaTypeArrD = d(gVar3, cls, eVar);
                javaTypeB = null;
            } else {
                Annotation[] annotationArr = x9.f.f303505a;
                Type genericSuperclass = cls.getGenericSuperclass();
                javaTypeB = genericSuperclass == null ? null : b(gVar3, genericSuperclass, eVar);
                javaTypeArrD = d(gVar3, cls, eVar);
            }
            JavaType javaType5 = f295685q;
            if (cls == Properties.class) {
                javaType = javaTypeB;
                cls3 = Properties.class;
                javaTypeM0 = new MapType(cls, eVar, javaType, javaTypeArrD, javaType5, javaType5, null, null, false);
                cls2 = cls;
                eVar2 = eVar;
            } else {
                javaType = javaTypeB;
                javaTypeM0 = javaType4;
                cls2 = cls;
                eVar2 = eVar;
                cls3 = Properties.class;
                if (javaType != null) {
                    javaTypeM0 = javaType.M0(cls2, eVar2, javaType, javaTypeArrD);
                }
            }
            if (javaTypeM0 == null) {
                e eVar5 = eVar2 == null ? d : eVar2;
                JavaType javaType6 = f295686r;
                if (cls2 == Map.class) {
                    if (cls2 == cls3) {
                        eVar4 = eVar5;
                    } else {
                        List listE = eVar5.e();
                        int size = listE.size();
                        if (size == 0) {
                            eVar4 = eVar5;
                            javaType5 = javaType6;
                        } else {
                            if (size != 2) {
                                throw new IllegalArgumentException(String.format("Strange Map type %s with %d type parameter%s (%s), can not resolve", x9.f.s(cls2), Integer.valueOf(size), size == 1 ? "" : "s", eVar5));
                            }
                            JavaType javaType7 = (JavaType) listE.get(0);
                            javaType3 = (JavaType) listE.get(1);
                            javaType5 = javaType7;
                            eVar4 = eVar5;
                            eVar3 = eVar2;
                            cls4 = cls;
                            javaTypeM0 = new MapType(cls4, eVar4, javaType, javaTypeArrD, javaType5, javaType3, null, null, false);
                        }
                    }
                    javaType3 = javaType5;
                    eVar3 = eVar2;
                    cls4 = cls;
                    javaTypeM0 = new MapType(cls4, eVar4, javaType, javaTypeArrD, javaType5, javaType3, null, null, false);
                } else {
                    eVar3 = eVar2;
                    cls4 = cls2;
                    e eVar6 = eVar5;
                    if (cls4 == Collection.class) {
                        List listE2 = eVar6.e();
                        if (!listE2.isEmpty()) {
                            if (listE2.size() != 1) {
                                throw new IllegalArgumentException(j6.a.o(cls4, new StringBuilder("Strange Collection type "), ": cannot determine type parameters"));
                            }
                            javaType6 = (JavaType) listE2.get(0);
                        }
                        javaTypeM0 = new CollectionType(cls4, eVar6, javaType, javaTypeArrD, javaType6, null, null, false);
                    } else if (cls4 == AtomicReference.class) {
                        List listE3 = eVar6.e();
                        if (!listE3.isEmpty()) {
                            if (listE3.size() != 1) {
                                throw new IllegalArgumentException(j6.a.o(cls4, new StringBuilder("Strange Reference type "), ": cannot determine type parameters"));
                            }
                            javaType6 = (JavaType) listE3.get(0);
                        }
                        javaTypeM0 = new ReferenceType(cls4, eVar6, javaType, javaTypeArrD, javaType6, null, null, null, false);
                    } else {
                        javaTypeM0 = null;
                    }
                }
                if (javaTypeM0 == null) {
                    int length = javaTypeArrD.length;
                    while (true) {
                        if (i2 >= length) {
                            javaType2 = null;
                            break;
                        }
                        JavaType javaTypeM02 = javaTypeArrD[i2].M0(cls4, eVar3, javaType, javaTypeArrD);
                        if (javaTypeM02 != null) {
                            javaType2 = javaTypeM02;
                            break;
                        }
                        i2++;
                    }
                    javaTypeM0 = javaType2 == null ? new SimpleType(cls4, eVar3, javaType, javaTypeArrD) : javaType2;
                }
            }
        }
        ArrayList<ResolvedRecursiveType> arrayList = (ArrayList) gVar3.d;
        if (arrayList != null) {
            for (ResolvedRecursiveType resolvedRecursiveType2 : arrayList) {
                if (resolvedRecursiveType2.f26193j != null) {
                    throw new IllegalStateException("Trying to re-set self reference; old value = " + resolvedRecursiveType2.f26193j + ", new = " + javaTypeM0);
                }
                resolvedRecursiveType2.f26193j = javaTypeM0;
            }
        }
        if (!javaTypeM0.E0()) {
            iVar.a(cVar, javaTypeM0);
        }
        return javaTypeM0;
    }

    public final JavaType[] d(g gVar, Class cls, e eVar) {
        Annotation[] annotationArr = x9.f.f303505a;
        Type[] genericInterfaces = cls.getGenericInterfaces();
        if (genericInterfaces == null || genericInterfaces.length == 0) {
            return f295676b;
        }
        int length = genericInterfaces.length;
        JavaType[] javaTypeArr = new JavaType[length];
        for (int i2 = 0; i2 < length; i2++) {
            javaTypeArr[i2] = b(gVar, genericInterfaces[i2], eVar);
        }
        return javaTypeArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0065, code lost:
    
        if (r3 == java.util.EnumSet.class) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JavaType h(com.fasterxml.jackson.databind.JavaType r17, java.lang.Class r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.f.h(com.fasterxml.jackson.databind.JavaType, java.lang.Class, boolean):com.fasterxml.jackson.databind.JavaType");
    }
}
