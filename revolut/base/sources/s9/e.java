package s9;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapType;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.TypeVariable;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class e extends j {
    @Override // s9.j
    public String a(Object obj2) {
        return c(obj2, obj2.getClass(), this.f261081a);
    }

    @Override // s9.j
    public final String b(Object obj2, Class cls) {
        return c(obj2, cls, this.f261081a);
    }

    public final String c(Object obj2, Class cls, w9.f fVar) {
        Class declaringClass;
        w9.e eVar;
        Class declaringClass2;
        w9.e eVar2;
        Annotation[] annotationArr = x9.f.f303505a;
        if (Enum.class.isAssignableFrom(cls) && !cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        String name = cls.getName();
        if (name.startsWith("java.util.")) {
            if (obj2 instanceof EnumSet) {
                EnumSet enumSet = (EnumSet) obj2;
                if (enumSet.isEmpty()) {
                    x9.e eVar3 = x9.e.e;
                    Field field = eVar3.f303502a;
                    if (field == null) {
                        throw new IllegalStateException("Cannot figure out type parameter for `EnumSet` (odd JDK platform?), problem: " + eVar3.f303504c);
                    }
                    try {
                        declaringClass2 = (Class) field.get(enumSet);
                    } catch (Exception e) {
                        throw new IllegalArgumentException(e);
                    }
                } else {
                    declaringClass2 = ((Enum) enumSet.iterator().next()).getDeclaringClass();
                }
                JavaType javaTypeC = fVar.c(null, declaringClass2, w9.f.d);
                String[] strArr = w9.e.e;
                TypeVariable[] typeParameters = EnumSet.class.getTypeParameters();
                int length = typeParameters == null ? 0 : typeParameters.length;
                if (length == 0) {
                    eVar2 = w9.e.f295672g;
                } else {
                    if (length != 1) {
                        throw new IllegalArgumentException("Cannot create TypeBindings for class " + EnumSet.class.getName() + " with 1 type parameter: class expects " + length);
                    }
                    eVar2 = new w9.e(new String[]{typeParameters[0].getName()}, new JavaType[]{javaTypeC}, null);
                }
                CollectionType collectionType = (CollectionType) fVar.c(null, EnumSet.class, eVar2);
                if (eVar2.isEmpty()) {
                    JavaType javaTypeV0 = collectionType.t0(Collection.class).v0();
                    if (!javaTypeV0.equals(javaTypeC)) {
                        throw new IllegalArgumentException(String.format("Non-generic Collection class %s did not resolve to something with element type %s but %s ", x9.f.s(EnumSet.class), javaTypeC, javaTypeV0));
                    }
                }
                return collectionType.V0();
            }
            if (obj2 instanceof EnumMap) {
                EnumMap enumMap = (EnumMap) obj2;
                if (enumMap.isEmpty()) {
                    x9.e eVar4 = x9.e.e;
                    Field field2 = eVar4.f303503b;
                    if (field2 == null) {
                        throw new IllegalStateException("Cannot figure out type parameter for `EnumMap` (odd JDK platform?), problem: " + eVar4.d);
                    }
                    try {
                        declaringClass = (Class) field2.get(enumMap);
                    } catch (Exception e2) {
                        throw new IllegalArgumentException(e2);
                    }
                } else {
                    declaringClass = ((Enum) enumMap.keySet().iterator().next()).getDeclaringClass();
                }
                w9.e eVar5 = w9.f.d;
                JavaType javaTypeC2 = fVar.c(null, declaringClass, eVar5);
                JavaType javaTypeC3 = fVar.c(null, Object.class, eVar5);
                JavaType[] javaTypeArr = {javaTypeC2, javaTypeC3};
                String[] strArr2 = w9.e.e;
                TypeVariable[] typeParameters2 = EnumMap.class.getTypeParameters();
                if (typeParameters2 == null || typeParameters2.length == 0) {
                    eVar = w9.e.f295672g;
                } else {
                    int length2 = typeParameters2.length;
                    String[] strArr3 = new String[length2];
                    for (int i = 0; i < length2; i++) {
                        strArr3[i] = typeParameters2[i].getName();
                    }
                    if (length2 != 2) {
                        throw new IllegalArgumentException("Cannot create TypeBindings for class " + EnumMap.class.getName() + " with 2 type parameters: class expects " + length2);
                    }
                    eVar = new w9.e(strArr3, javaTypeArr, null);
                }
                MapType mapType = (MapType) fVar.c(null, EnumMap.class, eVar);
                if (eVar.isEmpty()) {
                    JavaType javaTypeT0 = mapType.t0(Map.class);
                    JavaType javaTypeZ0 = javaTypeT0.z0();
                    if (!javaTypeZ0.equals(javaTypeC2)) {
                        throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with key type %s but %s ", x9.f.s(EnumMap.class), javaTypeC2, javaTypeZ0));
                    }
                    JavaType javaTypeV02 = javaTypeT0.v0();
                    if (!javaTypeV02.equals(javaTypeC3)) {
                        throw new IllegalArgumentException(String.format("Non-generic Map class %s did not resolve to something with value type %s but %s ", x9.f.s(EnumMap.class), javaTypeC3, javaTypeV02));
                    }
                }
                return mapType.V0();
            }
        } else if (name.indexOf(36) >= 0 && x9.f.l(cls) != null) {
            JavaType javaType = this.f261082b;
            if (x9.f.l(javaType.f26182a) == null) {
                return javaType.f26182a.getName();
            }
        }
        return name;
    }
}
