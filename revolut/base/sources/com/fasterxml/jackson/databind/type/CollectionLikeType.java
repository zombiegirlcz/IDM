package com.fasterxml.jackson.databind.type;

import a0.d;
import com.fasterxml.jackson.databind.JavaType;
import s9.l;
import w9.e;

/* JADX INFO: loaded from: classes16.dex */
public class CollectionLikeType extends TypeBase {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final JavaType f26189j;

    public CollectionLikeType(Class cls, e eVar, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, Object obj2, Object obj3, boolean z) {
        super(cls, eVar, javaType, javaTypeArr, javaType2.f26183b, obj2, obj3, z);
        this.f26189j = javaType2;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean E0() {
        return super.E0() || this.f26189j.E0();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean G0() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean H0() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType M0(Class cls, e eVar, JavaType javaType, JavaType[] javaTypeArr) {
        return new CollectionLikeType(cls, eVar, javaType, javaTypeArr, this.f26189j, this.f26184c, this.d, this.e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType O0(JavaType javaType) {
        if (this.f26189j == javaType) {
            return this;
        }
        return new CollectionLikeType(this.f26182a, this.f26195h, this.f, this.f26194g, javaType, this.f26184c, this.d, this.e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType Q0(JavaType javaType) {
        JavaType javaType2;
        JavaType javaTypeQ0;
        JavaType javaTypeQ02 = super.Q0(javaType);
        JavaType javaTypeV0 = javaType.v0();
        return (javaTypeV0 == null || (javaTypeQ0 = (javaType2 = this.f26189j).Q0(javaTypeV0)) == javaType2) ? javaTypeQ02 : javaTypeQ02.O0(javaTypeQ0);
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase
    public final String V0() {
        StringBuilder sb6 = new StringBuilder();
        Class cls = this.f26182a;
        sb6.append(cls.getName());
        JavaType javaType = this.f26189j;
        if (javaType != null && cls.getTypeParameters().length == 1) {
            sb6.append('<');
            sb6.append(javaType.N());
            sb6.append('>');
        }
        return sb6.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public CollectionLikeType P0(l lVar) {
        return new CollectionLikeType(this.f26182a, this.f26195h, this.f, this.f26194g, this.f26189j.S0(lVar), this.f26184c, this.d, this.e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public CollectionLikeType X0() {
        if (this.e) {
            return this;
        }
        return new CollectionLikeType(this.f26182a, this.f26195h, this.f, this.f26194g, this.f26189j.X0(), this.f26184c, this.d, true);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public CollectionLikeType S0(Object obj2) {
        return new CollectionLikeType(this.f26182a, this.f26195h, this.f, this.f26194g, this.f26189j, this.f26184c, obj2, this.e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public CollectionLikeType T0(Object obj2) {
        return new CollectionLikeType(this.f26182a, this.f26195h, this.f, this.f26194g, this.f26189j, obj2, this.d, this.e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 == null || obj2.getClass() != getClass()) {
            return false;
        }
        CollectionLikeType collectionLikeType = (CollectionLikeType) obj2;
        return this.f26182a == collectionLikeType.f26182a && this.f26189j.equals(collectionLikeType.f26189j);
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("[collection-like type; class ");
        d.A(this.f26182a, sb6, ", contains ");
        sb6.append(this.f26189j);
        sb6.append("]");
        return sb6.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType v0() {
        return this.f26189j;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final StringBuilder w0(StringBuilder sb6) {
        TypeBase.U0(this.f26182a, sb6, true);
        return sb6;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final StringBuilder x0(StringBuilder sb6) {
        TypeBase.U0(this.f26182a, sb6, false);
        sb6.append('<');
        this.f26189j.x0(sb6);
        sb6.append(">;");
        return sb6;
    }
}
