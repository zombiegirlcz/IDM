package com.fasterxml.jackson.databind.type;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.databind.JavaType;
import s9.l;
import w9.e;

/* JADX INFO: loaded from: classes16.dex */
public class SimpleType extends TypeBase {
    public SimpleType(Class cls, e eVar, JavaType javaType, JavaType[] javaTypeArr) {
        super(cls, eVar, javaType, javaTypeArr, 0, null, null, false);
    }

    public static SimpleType W0(Class cls) {
        return new SimpleType(cls, null, null, null, 0, null, null, false);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final boolean H0() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType M0(Class cls, e eVar, JavaType javaType, JavaType[] javaTypeArr) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType O0(JavaType javaType) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContentType()");
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType P0(l lVar) {
        throw new IllegalArgumentException("Simple types have no content types; cannot call withContenTypeHandler()");
    }

    @Override // com.fasterxml.jackson.databind.type.TypeBase
    public String V0() {
        StringBuilder sb6 = new StringBuilder();
        Class cls = this.f26182a;
        sb6.append(cls.getName());
        e eVar = this.f26195h;
        int length = eVar.f295674b.length;
        if (length > 0 && cls.getTypeParameters().length == length) {
            sb6.append('<');
            for (int i = 0; i < length; i++) {
                JavaType javaTypeD = eVar.d(i);
                if (i > 0) {
                    sb6.append(CoreConstants.COMMA_CHAR);
                }
                sb6.append(javaTypeD.N());
            }
            sb6.append('>');
        }
        return sb6.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public SimpleType X0() {
        return this.e ? this : new SimpleType(this.f26182a, this.f26195h, this.f, this.f26194g, 0, this.f26184c, this.d, true);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public SimpleType S0(Object obj2) {
        if (this.d == obj2) {
            return this;
        }
        return new SimpleType(this.f26182a, this.f26195h, this.f, this.f26194g, 0, this.f26184c, obj2, this.e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public SimpleType T0(Object obj2) {
        if (obj2 == this.f26184c) {
            return this;
        }
        return new SimpleType(this.f26182a, this.f26195h, this.f, this.f26194g, 0, obj2, this.d, this.e);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 == null || obj2.getClass() != getClass()) {
            return false;
        }
        SimpleType simpleType = (SimpleType) obj2;
        if (simpleType.f26182a != this.f26182a) {
            return false;
        }
        return this.f26195h.equals(simpleType.f26195h);
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder(40);
        sb6.append("[simple type, class ");
        sb6.append(V0());
        sb6.append(']');
        return sb6.toString();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder w0(StringBuilder sb6) {
        TypeBase.U0(this.f26182a, sb6, true);
        return sb6;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public StringBuilder x0(StringBuilder sb6) {
        TypeBase.U0(this.f26182a, sb6, false);
        e eVar = this.f26195h;
        int length = eVar.f295674b.length;
        if (length > 0) {
            sb6.append('<');
            for (int i = 0; i < length; i++) {
                sb6 = eVar.d(i).x0(sb6);
            }
            sb6.append('>');
        }
        sb6.append(';');
        return sb6;
    }

    public SimpleType(Class cls) {
        this(cls, e.f295672g, null, null);
    }
}
