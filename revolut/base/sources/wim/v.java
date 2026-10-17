package wim;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class v implements ParameterizedType, Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f297946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f297947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type[] f297948c;

    public v(Class rawType, Type type, ArrayList typeArguments) {
        Intrinsics.checkNotNullParameter(rawType, "rawType");
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        this.f297946a = rawType;
        this.f297947b = type;
        this.f297948c = (Type[]) typeArguments.toArray(new Type[0]);
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj2;
        return Intrinsics.f(this.f297946a, parameterizedType.getRawType()) && Intrinsics.f(this.f297947b, parameterizedType.getOwnerType()) && Arrays.equals(this.f297948c, parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f297948c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f297947b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f297946a;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb6 = new StringBuilder();
        Class cls = this.f297946a;
        Type type = this.f297947b;
        if (type != null) {
            sb6.append(z.a(type));
            sb6.append("$");
            sb6.append(cls.getSimpleName());
        } else {
            sb6.append(z.a(cls));
        }
        Type[] typeArr = this.f297948c;
        if (typeArr.length != 0) {
            kotlin.collections.d.Z(typeArr, sb6, ", ", "<", ">", u.f);
        }
        return sb6.toString();
    }

    public final int hashCode() {
        int iHashCode = this.f297946a.hashCode();
        Type type = this.f297947b;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.f297948c);
    }

    public final String toString() {
        return getTypeName();
    }
}
