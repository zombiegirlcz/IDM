package com.fasterxml.jackson.databind.type;

import a0.d;
import com.fasterxml.jackson.databind.JavaType;
import s9.l;
import w9.e;

/* JADX INFO: loaded from: classes16.dex */
public final class CollectionType extends CollectionLikeType {
    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType, com.fasterxml.jackson.databind.JavaType
    public final JavaType M0(Class cls, e eVar, JavaType javaType, JavaType[] javaTypeArr) {
        return new CollectionType(cls, eVar, javaType, javaTypeArr, this.f26189j, this.f26184c, this.d, this.e);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType, com.fasterxml.jackson.databind.JavaType
    public final JavaType O0(JavaType javaType) {
        if (this.f26189j == javaType) {
            return this;
        }
        return new CollectionType(this.f26182a, this.f26195h, this.f, this.f26194g, javaType, this.f26184c, this.d, this.e);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType, com.fasterxml.jackson.databind.JavaType
    public final JavaType P0(l lVar) {
        return new CollectionType(this.f26182a, this.f26195h, this.f, this.f26194g, this.f26189j.S0(lVar), this.f26184c, this.d, this.e);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType, com.fasterxml.jackson.databind.JavaType
    public final JavaType S0(Object obj2) {
        return new CollectionType(this.f26182a, this.f26195h, this.f, this.f26194g, this.f26189j, this.f26184c, obj2, this.e);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType, com.fasterxml.jackson.databind.JavaType
    public final JavaType T0(Object obj2) {
        return new CollectionType(this.f26182a, this.f26195h, this.f, this.f26194g, this.f26189j, obj2, this.d, this.e);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType
    /* JADX INFO: renamed from: W0 */
    public final CollectionLikeType P0(l lVar) {
        return new CollectionType(this.f26182a, this.f26195h, this.f, this.f26194g, this.f26189j.S0(lVar), this.f26184c, this.d, this.e);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType
    /* JADX INFO: renamed from: Y0 */
    public final CollectionLikeType S0(Object obj2) {
        return new CollectionType(this.f26182a, this.f26195h, this.f, this.f26194g, this.f26189j, this.f26184c, obj2, this.e);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType
    /* JADX INFO: renamed from: Z0 */
    public final CollectionLikeType T0(Object obj2) {
        return new CollectionType(this.f26182a, this.f26195h, this.f, this.f26194g, this.f26189j, obj2, this.d, this.e);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public final CollectionType R0() {
        if (this.e) {
            return this;
        }
        return new CollectionType(this.f26182a, this.f26195h, this.f, this.f26194g, this.f26189j.X0(), this.f26184c, this.d, true);
    }

    @Override // com.fasterxml.jackson.databind.type.CollectionLikeType
    public final String toString() {
        StringBuilder sb6 = new StringBuilder("[collection type; class ");
        d.A(this.f26182a, sb6, ", contains ");
        sb6.append(this.f26189j);
        sb6.append("]");
        return sb6.toString();
    }
}
