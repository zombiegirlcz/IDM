package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public final class i implements WildcardType, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f49640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f49641b;

    public i(Type[] typeArr, Type[] typeArr2) {
        j.c(typeArr2.length <= 1);
        j.c(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            j.d(typeArr[0]);
            this.f49641b = null;
            this.f49640a = j.b(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        j.d(typeArr2[0]);
        j.c(typeArr[0] == Object.class);
        this.f49641b = j.b(typeArr2[0]);
        this.f49640a = Object.class;
    }

    public final boolean equals(Object obj2) {
        return (obj2 instanceof WildcardType) && j.g(this, (WildcardType) obj2);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f49641b;
        return type != null ? new Type[]{type} : j.f49642a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f49640a};
    }

    public final int hashCode() {
        Type type = this.f49641b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f49640a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f49641b;
        if (type != null) {
            return "? super " + j.s(type);
        }
        Type type2 = this.f49640a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + j.s(type2);
    }
}
