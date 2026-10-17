package com.fasterxml.jackson.databind.type;

import a0.d;
import com.fasterxml.jackson.databind.JavaType;
import s9.l;
import w9.e;

/* JADX INFO: loaded from: classes16.dex */
public final class MapType extends MapLikeType {
    @Override // com.fasterxml.jackson.databind.type.MapLikeType, com.fasterxml.jackson.databind.JavaType
    public final JavaType M0(Class cls, e eVar, JavaType javaType, JavaType[] javaTypeArr) {
        return new MapType(cls, eVar, javaType, javaTypeArr, this.f26190j, this.k, this.f26184c, this.d, this.e);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType, com.fasterxml.jackson.databind.JavaType
    public final JavaType O0(JavaType javaType) {
        if (this.k == javaType) {
            return this;
        }
        return new MapType(this.f26182a, this.f26195h, this.f, this.f26194g, this.f26190j, javaType, this.f26184c, this.d, this.e);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType, com.fasterxml.jackson.databind.JavaType
    public final JavaType P0(l lVar) {
        return new MapType(this.f26182a, this.f26195h, this.f, this.f26194g, this.f26190j, this.k.S0(lVar), this.f26184c, this.d, this.e);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType, com.fasterxml.jackson.databind.JavaType
    public final JavaType S0(Object obj2) {
        return new MapType(this.f26182a, this.f26195h, this.f, this.f26194g, this.f26190j, this.k, this.f26184c, obj2, this.e);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType, com.fasterxml.jackson.databind.JavaType
    public final JavaType T0(Object obj2) {
        return new MapType(this.f26182a, this.f26195h, this.f, this.f26194g, this.f26190j, this.k, obj2, this.d, this.e);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType
    /* JADX INFO: renamed from: W0 */
    public final MapLikeType P0(l lVar) {
        return new MapType(this.f26182a, this.f26195h, this.f, this.f26194g, this.f26190j, this.k.S0(lVar), this.f26184c, this.d, this.e);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType
    public final MapLikeType X0(JavaType javaType) {
        if (javaType == this.f26190j) {
            return this;
        }
        return new MapType(this.f26182a, this.f26195h, this.f, this.f26194g, javaType, this.k, this.f26184c, this.d, this.e);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType
    /* JADX INFO: renamed from: Z0 */
    public final MapLikeType S0(Object obj2) {
        return new MapType(this.f26182a, this.f26195h, this.f, this.f26194g, this.f26190j, this.k, this.f26184c, obj2, this.e);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType
    /* JADX INFO: renamed from: a1 */
    public final MapLikeType T0(Object obj2) {
        return new MapType(this.f26182a, this.f26195h, this.f, this.f26194g, this.f26190j, this.k, obj2, this.d, this.e);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public final MapType R0() {
        if (this.e) {
            return this;
        }
        return new MapType(this.f26182a, this.f26195h, this.f, this.f26194g, this.f26190j.X0(), this.k.X0(), this.f26184c, this.d, true);
    }

    @Override // com.fasterxml.jackson.databind.type.MapLikeType
    public final String toString() {
        StringBuilder sb6 = new StringBuilder("[map type; class ");
        d.A(this.f26182a, sb6, ", ");
        sb6.append(this.f26190j);
        sb6.append(" -> ");
        sb6.append(this.k);
        sb6.append("]");
        return sb6.toString();
    }
}
