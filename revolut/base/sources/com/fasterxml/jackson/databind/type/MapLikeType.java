package com.fasterxml.jackson.databind.type;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.databind.JavaType;
import s9.l;
import w9.e;

/* JADX INFO: loaded from: classes16.dex */
public class MapLikeType extends TypeBase {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final JavaType f26190j;
    public final JavaType k;

    public MapLikeType(Class cls, e eVar, JavaType javaType, JavaType[] javaTypeArr, JavaType javaType2, JavaType javaType3, Object obj2, Object obj3, boolean z) {
        super(cls, eVar, javaType, javaTypeArr, javaType2.f26183b ^ javaType3.f26183b, obj2, obj3, z);
        this.f26190j = javaType2;
        this.k = javaType3;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean E0() {
        return super.E0() || this.k.E0() || this.f26190j.E0();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean H0() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean K0() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType M0(Class cls, e eVar, JavaType javaType, JavaType[] javaTypeArr) {
        return new MapLikeType(cls, eVar, javaType, javaTypeArr, this.f26190j, this.k, this.f26184c, this.d, this.e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType O0(JavaType javaType) {
        if (this.k == javaType) {
            return this;
        }
        return new MapLikeType(this.f26182a, this.f26195h, this.f, this.f26194g, this.f26190j, javaType, this.f26184c, this.d, this.e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType Q0(JavaType javaType) {
        JavaType javaType2;
        JavaType javaTypeQ0;
        JavaType javaType3;
        JavaType javaTypeQ02;
        JavaType javaTypeQ03 = super.Q0(javaType);
        JavaType javaTypeZ0 = javaType.z0();
        if ((javaTypeQ03 instanceof MapLikeType) && javaTypeZ0 != null && (javaTypeQ02 = (javaType3 = this.f26190j).Q0(javaTypeZ0)) != javaType3) {
            javaTypeQ03 = ((MapLikeType) javaTypeQ03).X0(javaTypeQ02);
        }
        JavaType javaTypeV0 = javaType.v0();
        return (javaTypeV0 == null || (javaTypeQ0 = (javaType2 = this.k).Q0(javaTypeV0)) == javaType2) ? javaTypeQ03 : javaTypeQ03.O0(javaTypeQ0);
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase
    public final String V0() {
        StringBuilder sb6 = new StringBuilder();
        Class cls = this.f26182a;
        sb6.append(cls.getName());
        JavaType javaType = this.f26190j;
        if (javaType != null && cls.getTypeParameters().length == 2) {
            sb6.append('<');
            sb6.append(javaType.N());
            sb6.append(CoreConstants.COMMA_CHAR);
            sb6.append(this.k.N());
            sb6.append('>');
        }
        return sb6.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public MapLikeType P0(l lVar) {
        return new MapLikeType(this.f26182a, this.f26195h, this.f, this.f26194g, this.f26190j, this.k.S0(lVar), this.f26184c, this.d, this.e);
    }

    public MapLikeType X0(JavaType javaType) {
        if (javaType == this.f26190j) {
            return this;
        }
        return new MapLikeType(this.f26182a, this.f26195h, this.f, this.f26194g, javaType, this.k, this.f26184c, this.d, this.e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public MapLikeType X0() {
        if (this.e) {
            return this;
        }
        return new MapLikeType(this.f26182a, this.f26195h, this.f, this.f26194g, this.f26190j, this.k.X0(), this.f26184c, this.d, true);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public MapLikeType S0(Object obj2) {
        return new MapLikeType(this.f26182a, this.f26195h, this.f, this.f26194g, this.f26190j, this.k, this.f26184c, obj2, this.e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public MapLikeType T0(Object obj2) {
        return new MapLikeType(this.f26182a, this.f26195h, this.f, this.f26194g, this.f26190j, this.k, obj2, this.d, this.e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 == null || obj2.getClass() != getClass()) {
            return false;
        }
        MapLikeType mapLikeType = (MapLikeType) obj2;
        return this.f26182a == mapLikeType.f26182a && this.f26190j.equals(mapLikeType.f26190j) && this.k.equals(mapLikeType.k);
    }

    public String toString() {
        return String.format("[map-like type; class %s, %s -> %s]", this.f26182a.getName(), this.f26190j, this.k);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType v0() {
        return this.k;
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
        this.f26190j.x0(sb6);
        this.k.x0(sb6);
        sb6.append(">;");
        return sb6;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType z0() {
        return this.f26190j;
    }
}
