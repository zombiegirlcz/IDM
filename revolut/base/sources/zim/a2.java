package zim;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;

/* JADX INFO: loaded from: classes14.dex */
public final class a2 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f322587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f322588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f322589c;

    public a2(c2 c2Var, int i, Lazy lazy) {
        this.f322587a = c2Var;
        this.f322588b = i;
        this.f322589c = lazy;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        c2 c2Var = this.f322587a;
        h2 h2Var = c2Var.f322617c;
        Type type = h2Var != null ? (Type) h2Var.invoke() : null;
        if (type instanceof Class) {
            Class cls = (Class) type;
            Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
            Intrinsics.h(componentType);
            return componentType;
        }
        boolean z = type instanceof GenericArrayType;
        int i = this.f322588b;
        if (z) {
            if (i == 0) {
                Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                Intrinsics.h(genericComponentType);
                return genericComponentType;
            }
            throw new KotlinReflectionInternalError("Array type has been queried for a non-0th argument: " + c2Var);
        }
        if (!(type instanceof ParameterizedType)) {
            throw new KotlinReflectionInternalError("Non-generic type has been queried for arguments: " + c2Var);
        }
        Type type2 = (Type) ((List) this.f322589c.getValue()).get(i);
        if (!(type2 instanceof WildcardType)) {
            return type2;
        }
        WildcardType wildcardType = (WildcardType) type2;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        Intrinsics.checkNotNullExpressionValue(lowerBounds, "getLowerBounds(...)");
        Type type3 = (Type) kotlin.collections.d.P(lowerBounds);
        if (type3 == null) {
            Type[] upperBounds = wildcardType.getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            type3 = (Type) kotlin.collections.d.O(upperBounds);
        }
        Intrinsics.h(type3);
        return type3;
    }
}
