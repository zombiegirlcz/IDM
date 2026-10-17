package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k9.i;
import w9.e;

/* JADX INFO: loaded from: classes16.dex */
public abstract class TypeBase extends JavaType implements i {
    public static final e i = e.f295672g;
    public final JavaType f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final JavaType[] f26194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f26195h;

    public TypeBase(Class cls, e eVar, JavaType javaType, JavaType[] javaTypeArr, int i2, Object obj2, Object obj3, boolean z) {
        super(cls, i2, obj2, obj3, z);
        this.f26195h = eVar == null ? i : eVar;
        this.f = javaType;
        this.f26194g = javaTypeArr;
    }

    public static void U0(Class cls, StringBuilder sb6, boolean z) {
        if (!cls.isPrimitive()) {
            sb6.append('L');
            String name = cls.getName();
            int length = name.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = name.charAt(i2);
                if (cCharAt == '.') {
                    cCharAt = '/';
                }
                sb6.append(cCharAt);
            }
            if (z) {
                sb6.append(';');
                return;
            }
            return;
        }
        if (cls == Boolean.TYPE) {
            sb6.append('Z');
            return;
        }
        if (cls == Byte.TYPE) {
            sb6.append('B');
            return;
        }
        if (cls == Short.TYPE) {
            sb6.append('S');
            return;
        }
        if (cls == Character.TYPE) {
            sb6.append('C');
            return;
        }
        if (cls == Integer.TYPE) {
            sb6.append('I');
            return;
        }
        if (cls == Long.TYPE) {
            sb6.append('J');
            return;
        }
        if (cls == Float.TYPE) {
            sb6.append('F');
        } else if (cls == Double.TYPE) {
            sb6.append('D');
        } else {
            if (cls != Void.TYPE) {
                throw new IllegalStateException("Unrecognized primitive type: ".concat(cls.getName()));
            }
            sb6.append('V');
        }
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType C0() {
        return this.f;
    }

    @Override // mra.d
    public final String N() {
        return V0();
    }

    public String V0() {
        return this.f26182a.getName();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType r0(int i2) {
        return this.f26195h.d(i2);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final int s0() {
        return this.f26195h.f295674b.length;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType t0(Class cls) {
        JavaType javaTypeT0;
        JavaType[] javaTypeArr;
        if (cls == this.f26182a) {
            return this;
        }
        if (cls.isInterface() && (javaTypeArr = this.f26194g) != null) {
            for (JavaType javaType : javaTypeArr) {
                JavaType javaTypeT02 = javaType.t0(cls);
                if (javaTypeT02 != null) {
                    return javaTypeT02;
                }
            }
        }
        JavaType javaType2 = this.f;
        if (javaType2 == null || (javaTypeT0 = javaType2.t0(cls)) == null) {
            return null;
        }
        return javaTypeT0;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public e u0() {
        return this.f26195h;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final List y0() {
        int length;
        JavaType[] javaTypeArr = this.f26194g;
        if (javaTypeArr != null && (length = javaTypeArr.length) != 0) {
            return length != 1 ? Arrays.asList(javaTypeArr) : Collections.singletonList(javaTypeArr[0]);
        }
        return Collections.EMPTY_LIST;
    }
}
