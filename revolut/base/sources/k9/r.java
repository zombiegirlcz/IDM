package k9;

import java.io.Serializable;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes16.dex */
public final class r implements Serializable {
    public static final r d = new r("", null);
    public static final r e = new r(new String(""), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f182194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f182195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f9.i f182196c;

    public r(String str, String str2) {
        Annotation[] annotationArr = x9.f.f303505a;
        this.f182194a = str == null ? "" : str;
        this.f182195b = str2;
    }

    public static r a(String str) {
        return (str == null || str.isEmpty()) ? d : new r(j9.h.f172262b.a(str), null);
    }

    public static r b(String str, String str2) {
        if (str == null) {
            str = "";
        }
        return (str2 == null && str.isEmpty()) ? d : new r(j9.h.f172262b.a(str), str2);
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 == null || obj2.getClass() != r.class) {
            return false;
        }
        r rVar = (r) obj2;
        String str = rVar.f182195b;
        String str2 = rVar.f182194a;
        String str3 = this.f182194a;
        if (str3 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str3.equals(str2)) {
            return false;
        }
        String str4 = this.f182195b;
        return str4 == null ? str == null : str4.equals(str);
    }

    public final int hashCode() {
        String str = this.f182194a;
        String str2 = this.f182195b;
        if (str2 == null) {
            return str.hashCode();
        }
        return str.hashCode() ^ str2.hashCode();
    }

    public final boolean isEmpty() {
        return this.f182195b == null && this.f182194a.isEmpty();
    }

    public final String toString() {
        String str = this.f182194a;
        String str2 = this.f182195b;
        if (str2 == null) {
            return str;
        }
        return "{" + str2 + "}" + str;
    }
}
