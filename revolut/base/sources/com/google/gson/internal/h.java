package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public final class h implements ParameterizedType, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f49637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f49638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type[] f49639c;

    public h(Type type, Class cls, Type... typeArr) {
        Objects.requireNonNull(cls);
        if (type == null && j.p(cls)) {
            throw new IllegalArgumentException(a0.d.l(cls, "Must specify owner type for "));
        }
        this.f49637a = type == null ? null : j.b(type);
        this.f49638b = j.b(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f49639c = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(this.f49639c[i]);
            j.d(this.f49639c[i]);
            Type[] typeArr3 = this.f49639c;
            typeArr3[i] = j.b(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj2) {
        return (obj2 instanceof ParameterizedType) && j.g(this, (ParameterizedType) obj2);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f49639c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f49637a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f49638b;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f49639c) ^ this.f49638b.hashCode();
        Type type = this.f49637a;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f49639c;
        int length = typeArr.length;
        Type type = this.f49638b;
        if (length == 0) {
            return j.s(type);
        }
        StringBuilder sb6 = new StringBuilder((length + 1) * 30);
        sb6.append(j.s(type));
        sb6.append("<");
        sb6.append(j.s(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb6.append(", ");
            sb6.append(j.s(typeArr[i]));
        }
        sb6.append(">");
        return sb6.toString();
    }
}
