package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public final class g implements GenericArrayType, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Type f49636a;

    public g(Type type) {
        Objects.requireNonNull(type);
        this.f49636a = j.b(type);
    }

    public final boolean equals(Object obj2) {
        return (obj2 instanceof GenericArrayType) && j.g(this, (GenericArrayType) obj2);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f49636a;
    }

    public final int hashCode() {
        return this.f49636a.hashCode();
    }

    public final String toString() {
        return j.s(this.f49636a) + "[]";
    }
}
