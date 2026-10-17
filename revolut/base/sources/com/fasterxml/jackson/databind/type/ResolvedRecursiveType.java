package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import s9.l;
import w9.e;

/* JADX INFO: loaded from: classes16.dex */
public class ResolvedRecursiveType extends TypeBase {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public JavaType f26193j;

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public final JavaType C0() {
        JavaType javaType = this.f26193j;
        return javaType != null ? javaType.C0() : this.f;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean H0() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType M0(Class cls, e eVar, JavaType javaType, JavaType[] javaTypeArr) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType O0(JavaType javaType) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType P0(l lVar) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType R0() {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType S0(Object obj2) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType T0(Object obj2) {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean equals(Object obj2) {
        return obj2 == this;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder(40);
        sb6.append("[recursive type; ");
        JavaType javaType = this.f26193j;
        if (javaType == null) {
            sb6.append("UNRESOLVED");
        } else {
            sb6.append(javaType.f26182a.getName());
        }
        return sb6.toString();
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase, com.fasterxml.jackson.databind.JavaType
    public final e u0() {
        JavaType javaType = this.f26193j;
        return javaType != null ? javaType.u0() : this.f26195h;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final StringBuilder w0(StringBuilder sb6) {
        JavaType javaType = this.f26193j;
        return javaType != null ? javaType.w0(sb6) : sb6;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final StringBuilder x0(StringBuilder sb6) {
        JavaType javaType = this.f26193j;
        if (javaType != null) {
            return javaType.w0(sb6);
        }
        sb6.append("?");
        return sb6;
    }
}
