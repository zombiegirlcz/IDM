package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.util.Objects;
import s9.l;
import w9.e;

/* JADX INFO: loaded from: classes16.dex */
public class ReferenceType extends SimpleType {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final JavaType f26192j;
    public final JavaType k;

    public ReferenceType(Class cls, e eVar, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, JavaType javaType3, Object obj2, Object obj3, boolean z) {
        super(cls, eVar, javaType, javaTypeArr, Objects.hashCode(javaType2), obj2, obj3, z);
        this.f26192j = javaType2;
        this.k = javaType3 == null ? this : javaType3;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: B0 */
    public final JavaType t() {
        return this.f26192j;
    }

    @Override // mra.d
    public final boolean D() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public final JavaType M0(Class cls, e eVar, JavaType javaType, JavaType[] javaTypeArr) {
        return new ReferenceType(cls, this.f26195h, javaType, javaTypeArr, this.f26192j, this.k, this.f26184c, this.d, this.e);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public final JavaType O0(JavaType javaType) {
        if (this.f26192j == javaType) {
            return this;
        }
        return new ReferenceType(this.f26182a, this.f26195h, this.f, this.f26194g, javaType, this.k, this.f26184c, this.d, this.e);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public final JavaType P0(l lVar) {
        JavaType javaType = this.f26192j;
        if (lVar == javaType.d) {
            return this;
        }
        return new ReferenceType(this.f26182a, this.f26195h, this.f, this.f26194g, javaType.S0(lVar), this.k, this.f26184c, this.d, this.e);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public final JavaType S0(Object obj2) {
        if (obj2 == this.d) {
            return this;
        }
        return new ReferenceType(this.f26182a, this.f26195h, this.f, this.f26194g, this.f26192j, this.k, this.f26184c, obj2, this.e);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public final JavaType T0(Object obj2) {
        if (obj2 == this.f26184c) {
            return this;
        }
        return new ReferenceType(this.f26182a, this.f26195h, this.f, this.f26194g, this.f26192j, this.k, obj2, this.d, this.e);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.type.TypeBase
    public final String V0() {
        StringBuilder sb6 = new StringBuilder();
        Class cls = this.f26182a;
        sb6.append(cls.getName());
        JavaType javaType = this.f26192j;
        if (javaType != null && cls.getTypeParameters().length == 1) {
            sb6.append('<');
            sb6.append(javaType.N());
            sb6.append('>');
        }
        return sb6.toString();
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType
    /* JADX INFO: renamed from: Y0 */
    public final SimpleType S0(Object obj2) {
        if (obj2 == this.d) {
            return this;
        }
        return new ReferenceType(this.f26182a, this.f26195h, this.f, this.f26194g, this.f26192j, this.k, this.f26184c, obj2, this.e);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType
    /* JADX INFO: renamed from: Z0 */
    public final SimpleType T0(Object obj2) {
        if (obj2 == this.f26184c) {
            return this;
        }
        return new ReferenceType(this.f26182a, this.f26195h, this.f, this.f26194g, this.f26192j, this.k, obj2, this.d, this.e);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final ReferenceType X0() {
        if (this.e) {
            return this;
        }
        return new ReferenceType(this.f26182a, this.f26195h, this.f, this.f26194g, this.f26192j.X0(), this.k, this.f26184c, this.d, true);
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 == null || obj2.getClass() != getClass()) {
            return false;
        }
        ReferenceType referenceType = (ReferenceType) obj2;
        if (referenceType.f26182a != this.f26182a) {
            return false;
        }
        return this.f26192j.equals(referenceType.f26192j);
    }

    @Override // com.fasterxml.jackson.databind.JavaType, mra.d
    public final JavaType t() {
        return this.f26192j;
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType
    public final String toString() {
        StringBuilder sb6 = new StringBuilder(40);
        sb6.append("[reference type, class ");
        sb6.append(V0());
        sb6.append('<');
        sb6.append(this.f26192j);
        sb6.append(">]");
        return sb6.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType v0() {
        return this.f26192j;
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public final StringBuilder w0(StringBuilder sb6) {
        TypeBase.U0(this.f26182a, sb6, true);
        return sb6;
    }

    @Override // com.fasterxml.jackson.databind.type.SimpleType, com.fasterxml.jackson.databind.JavaType
    public final StringBuilder x0(StringBuilder sb6) {
        TypeBase.U0(this.f26182a, sb6, false);
        sb6.append('<');
        StringBuilder sbX0 = this.f26192j.x0(sb6);
        sbX0.append(">;");
        return sbX0;
    }
}
