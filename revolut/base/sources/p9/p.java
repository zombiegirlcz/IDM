package p9;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dl.a f234235a = new dl.a();

    public static ParameterizedType k(Type type) {
        if (type instanceof ParameterizedType) {
            return (ParameterizedType) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return null;
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                return k(upperBounds[0]);
            }
        }
        return null;
    }

    public static TypeVariable l(Type type) {
        if (type instanceof TypeVariable) {
            return (TypeVariable) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return null;
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                return l(upperBounds[0]);
            }
        }
        return null;
    }

    public static boolean m(a aVar, JavaType javaType, Type type) {
        if (javaType.L0(aVar.a(type).f26182a)) {
            ParameterizedType parameterizedTypeK = k(type);
            if (parameterizedTypeK == null || !Objects.equals(javaType.f26182a, parameterizedTypeK.getRawType())) {
                return true;
            }
            Type[] actualTypeArguments = parameterizedTypeK.getActualTypeArguments();
            w9.e eVarU0 = javaType.u0();
            if (eVarU0.f295674b.length == actualTypeArguments.length) {
                for (int i = 0; i < eVarU0.f295674b.length; i++) {
                    if (m(aVar, eVarU0.d(i), actualTypeArguments[i])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public abstract p b(Annotation annotation);

    public abstract q c();

    public abstract x9.a d();

    public abstract Annotation e(Class cls);

    public abstract Class f();

    public abstract String getName();

    public abstract JavaType h();

    public abstract boolean i(Annotation annotation);
}
