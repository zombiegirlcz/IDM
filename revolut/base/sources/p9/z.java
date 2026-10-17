package p9;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes16.dex */
public final class z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class[] f234254c = new Class[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f234255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class[] f234256b;

    public z(Method method) {
        this(method.getName(), method.getParameterTypes());
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 == null || obj2.getClass() != z.class) {
            return false;
        }
        z zVar = (z) obj2;
        if (!this.f234255a.equals(zVar.f234255a)) {
            return false;
        }
        Class[] clsArr = zVar.f234256b;
        Class[] clsArr2 = this.f234256b;
        int length = clsArr2.length;
        if (clsArr.length != length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (clsArr[i] != clsArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f234255a.hashCode() + this.f234256b.length;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(this.f234255a);
        sb6.append("(");
        return j6.a.v(sb6, "-args)", this.f234256b.length);
    }

    public z(Constructor constructor) {
        this("", constructor.getParameterTypes());
    }

    public z(String str, Class[] clsArr) {
        this.f234255a = str;
        this.f234256b = clsArr == null ? f234254c : clsArr;
    }
}
