package com.fasterxml.jackson.databind;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.List;
import mra.d;
import s9.l;
import w9.e;

/* JADX INFO: loaded from: classes16.dex */
public abstract class JavaType extends d implements Serializable, Type {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f26182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f26184c;
    public final Object d;
    public final boolean e;

    public JavaType(Class cls, int i, Object obj2, Object obj3, boolean z) {
        this.f26182a = cls;
        this.f26183b = cls.getName().hashCode() + i;
        this.f26184c = obj2;
        this.d = obj3;
        this.e = z;
    }

    @Override // mra.d
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public JavaType t() {
        return null;
    }

    public abstract JavaType C0();

    public boolean D0() {
        return s0() > 0;
    }

    public boolean E0() {
        return (this.d == null && this.f26184c == null) ? false : true;
    }

    public final boolean F0(Class cls) {
        return this.f26182a == cls;
    }

    public boolean G0() {
        return false;
    }

    public abstract boolean H0();

    public final boolean I0() {
        return this.f26182a == Object.class;
    }

    public boolean K0() {
        return false;
    }

    public final boolean L0(Class cls) {
        Class cls2 = this.f26182a;
        return cls2 == cls || cls.isAssignableFrom(cls2);
    }

    public abstract JavaType M0(Class cls, e eVar, JavaType javaType, JavaType[] javaTypeArr);

    public abstract JavaType O0(JavaType javaType);

    public abstract JavaType P0(l lVar);

    public JavaType Q0(JavaType javaType) {
        Object obj2 = javaType.d;
        JavaType javaTypeS0 = obj2 != this.d ? S0(obj2) : this;
        Object obj3 = javaType.f26184c;
        return obj3 != this.f26184c ? javaTypeS0.T0(obj3) : javaTypeS0;
    }

    public abstract JavaType R0();

    public abstract JavaType S0(Object obj2);

    public abstract JavaType T0(Object obj2);

    public abstract boolean equals(Object obj2);

    public final int hashCode() {
        return this.f26183b;
    }

    public abstract JavaType r0(int i);

    public abstract int s0();

    public abstract JavaType t0(Class cls);

    public abstract e u0();

    public JavaType v0() {
        return null;
    }

    public abstract StringBuilder w0(StringBuilder sb6);

    public abstract StringBuilder x0(StringBuilder sb6);

    public abstract List y0();

    public JavaType z0() {
        return null;
    }
}
