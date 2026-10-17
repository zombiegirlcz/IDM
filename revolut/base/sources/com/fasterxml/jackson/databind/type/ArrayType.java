package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.lang.reflect.Array;
import s9.l;
import w9.e;

/* JADX INFO: loaded from: classes16.dex */
public final class ArrayType extends TypeBase {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f26187l = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final JavaType f26188j;
    public final Object k;

    public ArrayType(JavaType javaType, e eVar, Object obj2, Object obj3, Object obj4, boolean z) {
        super(obj2.getClass(), eVar, null, null, javaType.f26183b, obj3, obj4, z);
        this.f26188j = javaType;
        this.k = obj2;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean D0() {
        return this.f26188j.D0();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean E0() {
        return super.E0() || this.f26188j.E0();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean H0() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType M0(Class cls, e eVar, JavaType javaType, JavaType[] javaTypeArr) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType O0(JavaType javaType) {
        return new ArrayType(javaType, this.f26195h, Array.newInstance((Class<?>) javaType.f26182a, 0), this.f26184c, this.d, this.e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType P0(l lVar) {
        JavaType javaType = this.f26188j;
        if (lVar == javaType.d) {
            return this;
        }
        return new ArrayType(javaType.S0(lVar), this.f26195h, this.k, this.f26184c, this.d, this.e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType R0() {
        if (this.e) {
            return this;
        }
        return new ArrayType(this.f26188j.R0(), this.f26195h, this.k, this.f26184c, this.d, true);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType S0(Object obj2) {
        if (obj2 == this.d) {
            return this;
        }
        return new ArrayType(this.f26188j, this.f26195h, this.k, this.f26184c, obj2, this.e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType T0(Object obj2) {
        if (obj2 == this.f26184c) {
            return this;
        }
        return new ArrayType(this.f26188j, this.f26195h, this.k, obj2, this.d, this.e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 != null && obj2.getClass() == ArrayType.class) {
            return this.f26188j.equals(((ArrayType) obj2).f26188j);
        }
        return false;
    }

    public final String toString() {
        return "[array type, component type: " + this.f26188j + "]";
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType v0() {
        return this.f26188j;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final StringBuilder w0(StringBuilder sb6) {
        sb6.append('[');
        return this.f26188j.w0(sb6);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final StringBuilder x0(StringBuilder sb6) {
        sb6.append('[');
        return this.f26188j.x0(sb6);
    }
}
