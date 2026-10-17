package w9;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class e implements Serializable {
    public static final String[] e;
    public static final JavaType[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f295672g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f295673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JavaType[] f295674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f295675c;
    public final int d;

    static {
        String[] strArr = new String[0];
        e = strArr;
        JavaType[] javaTypeArr = new JavaType[0];
        f = javaTypeArr;
        f295672g = new e(strArr, javaTypeArr, null);
    }

    public e(String[] strArr, JavaType[] javaTypeArr, String[] strArr2) {
        strArr = strArr == null ? e : strArr;
        this.f295673a = strArr;
        javaTypeArr = javaTypeArr == null ? f : javaTypeArr;
        this.f295674b = javaTypeArr;
        if (strArr.length != javaTypeArr.length) {
            StringBuilder sb6 = new StringBuilder("Mismatching names (");
            sb6.append(strArr.length);
            sb6.append("), types (");
            throw new IllegalArgumentException(j6.a.v(sb6, ")", javaTypeArr.length));
        }
        int length = javaTypeArr.length;
        int i = 1;
        for (int i2 = 0; i2 < length; i2++) {
            i += this.f295674b[i2].f26183b;
        }
        this.f295675c = strArr2;
        this.d = i;
    }

    public static e a(JavaType javaType, Class cls) {
        TypeVariable[] typeParameters;
        if (cls == Collection.class) {
            typeParameters = d.f295668b;
        } else if (cls == List.class) {
            typeParameters = d.d;
        } else if (cls == ArrayList.class) {
            typeParameters = d.e;
        } else if (cls == AbstractList.class) {
            typeParameters = d.f295667a;
        } else if (cls == Iterable.class) {
            typeParameters = d.f295669c;
        } else {
            TypeVariable[] typeVariableArr = d.f295667a;
            typeParameters = cls.getTypeParameters();
        }
        int length = typeParameters == null ? 0 : typeParameters.length;
        if (length == 1) {
            return new e(new String[]{typeParameters[0].getName()}, new JavaType[]{javaType}, null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
    }

    public static e b(Class cls, JavaType javaType, JavaType javaType2) {
        TypeVariable[] typeParameters;
        if (cls == Map.class) {
            typeParameters = d.f;
        } else if (cls == HashMap.class) {
            typeParameters = d.f295670g;
        } else if (cls == LinkedHashMap.class) {
            typeParameters = d.f295671h;
        } else {
            TypeVariable[] typeVariableArr = d.f295667a;
            typeParameters = cls.getTypeParameters();
        }
        int length = typeParameters == null ? 0 : typeParameters.length;
        if (length == 2) {
            return new e(new String[]{typeParameters[0].getName(), typeParameters[1].getName()}, new JavaType[]{javaType, javaType2}, null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 2 type parameters: class expects " + length);
    }

    public static e c(Class cls, JavaType[] javaTypeArr) {
        String[] strArr;
        int length = javaTypeArr.length;
        if (length == 1) {
            return a(javaTypeArr[0], cls);
        }
        if (length == 2) {
            return b(cls, javaTypeArr[0], javaTypeArr[1]);
        }
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            strArr = e;
        } else {
            int length2 = typeParameters.length;
            strArr = new String[length2];
            for (int i = 0; i < length2; i++) {
                strArr[i] = typeParameters[i].getName();
            }
        }
        if (strArr.length == javaTypeArr.length) {
            return new e(strArr, javaTypeArr, null);
        }
        StringBuilder sb6 = new StringBuilder("Cannot create TypeBindings for class ");
        a0.d.A(cls, sb6, " with ");
        sb6.append(javaTypeArr.length);
        sb6.append(" type parameter");
        sb6.append(javaTypeArr.length == 1 ? "" : "s");
        sb6.append(": class expects ");
        sb6.append(strArr.length);
        throw new IllegalArgumentException(sb6.toString());
    }

    public final JavaType d(int i) {
        if (i < 0) {
            return null;
        }
        JavaType[] javaTypeArr = this.f295674b;
        if (i >= javaTypeArr.length) {
            return null;
        }
        return javaTypeArr[i];
    }

    public final List e() {
        JavaType[] javaTypeArr = this.f295674b;
        return javaTypeArr.length == 0 ? Collections.EMPTY_LIST : Arrays.asList(javaTypeArr);
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!x9.f.n(obj2, e.class)) {
            return false;
        }
        JavaType[] javaTypeArr = this.f295674b;
        int length = javaTypeArr.length;
        JavaType[] javaTypeArr2 = ((e) obj2).f295674b;
        if (length != javaTypeArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (!javaTypeArr2[i].equals(javaTypeArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.d;
    }

    public final boolean isEmpty() {
        return this.f295674b.length == 0;
    }

    public final String toString() {
        JavaType[] javaTypeArr = this.f295674b;
        if (javaTypeArr.length == 0) {
            return "<>";
        }
        StringBuilder sb6 = new StringBuilder("<");
        int length = javaTypeArr.length;
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                sb6.append(CoreConstants.COMMA_CHAR);
            }
            JavaType javaType = javaTypeArr[i];
            StringBuilder sb9 = new StringBuilder(40);
            javaType.x0(sb9);
            sb6.append(sb9.toString());
        }
        sb6.append('>');
        return sb6.toString();
    }
}
