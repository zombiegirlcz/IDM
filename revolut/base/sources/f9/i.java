package f9;

import com.fasterxml.jackson.core.q;
import java.io.Serializable;

/* JADX INFO: loaded from: classes16.dex */
public final class i implements q, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f132806c = e.f132800b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f132807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public char[] f132808b;

    public i(String str) {
        if (str == null) {
            throw new IllegalStateException("Null String illegal for SerializedString");
        }
        this.f132807a = str;
    }

    public final char[] a() {
        char[] cArr = this.f132808b;
        if (cArr != null) {
            return cArr;
        }
        f132806c.getClass();
        char[] cArrA = e.a(this.f132807a);
        this.f132808b = cArrA;
        return cArrA;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 == null || obj2.getClass() != i.class) {
            return false;
        }
        return this.f132807a.equals(((i) obj2).f132807a);
    }

    public final int hashCode() {
        return this.f132807a.hashCode();
    }

    public final String toString() {
        return this.f132807a;
    }
}
