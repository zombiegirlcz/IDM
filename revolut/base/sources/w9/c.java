package w9;

import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: loaded from: classes16.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f295664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JavaType[] f295665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f295666c;

    public c(Class cls, JavaType[] javaTypeArr, int i) {
        this.f295664a = cls;
        this.f295665b = javaTypeArr;
        this.f295666c = i;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 == null || obj2.getClass() != c.class) {
            return false;
        }
        c cVar = (c) obj2;
        if (this.f295666c == cVar.f295666c && this.f295664a == cVar.f295664a) {
            JavaType[] javaTypeArr = cVar.f295665b;
            JavaType[] javaTypeArr2 = this.f295665b;
            int length = javaTypeArr2.length;
            if (length == javaTypeArr.length) {
                for (int i = 0; i < length; i++) {
                    if (!javaTypeArr2[i].equals(javaTypeArr[i])) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f295666c;
    }

    public final String toString() {
        return this.f295664a.getName().concat("<>");
    }
}
