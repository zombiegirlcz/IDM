package com.fasterxml.jackson.databind.type;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.databind.JavaType;
import s9.l;
import w9.e;
import w9.f;

/* JADX INFO: loaded from: classes16.dex */
public class PlaceholderForType extends TypeBase {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f26191j;
    public JavaType k;

    public PlaceholderForType(int i) {
        super(Object.class, e.f295672g, f.l(), null, 1, null, null, false);
        this.f26191j = i;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean H0() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType M0(Class cls, e eVar, JavaType javaType, JavaType[] javaTypeArr) {
        W0();
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType O0(JavaType javaType) {
        W0();
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType P0(l lVar) {
        W0();
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: R0 */
    public final JavaType X0() {
        W0();
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType S0(Object obj2) {
        W0();
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType T0(Object obj2) {
        W0();
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase
    public final String V0() {
        return toString();
    }

    public final void W0() {
        throw new UnsupportedOperationException("Operation should not be attempted on ".concat(getClass().getName()));
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean equals(Object obj2) {
        return obj2 == this;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder();
        w0(sb6);
        return sb6.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final StringBuilder w0(StringBuilder sb6) {
        sb6.append(CoreConstants.DOLLAR);
        sb6.append(this.f26191j + 1);
        return sb6;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final StringBuilder x0(StringBuilder sb6) {
        w0(sb6);
        return sb6;
    }
}
