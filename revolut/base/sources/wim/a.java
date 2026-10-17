package wim;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements GenericArrayType, Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f297941a;

    public a(Type elementType) {
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        this.f297941a = elementType;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof GenericArrayType) {
            return Intrinsics.f(this.f297941a, ((GenericArrayType) obj2).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f297941a;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return z.a(this.f297941a) + "[]";
    }

    public final int hashCode() {
        return this.f297941a.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
