package f9;

import java.io.File;
import java.io.Serializable;
import java.net.URI;
import java.net.URL;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient Object f132792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f132793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f132794c;
    public final boolean d;

    public c(int i, int i2, Object obj2, boolean z) {
        this.d = z;
        this.f132792a = obj2;
        this.f132793b = i;
        this.f132794c = i2;
    }

    public static void a(int i, int[] iArr) {
        int i2 = iArr[0];
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= i) {
            i2 = i;
        }
        iArr[0] = i2;
        int i3 = iArr[1];
        int i5 = i - i2;
        if (i3 < 0 || i3 > i5) {
            iArr[1] = i5;
        }
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 == null || !(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        if (this.f132793b != cVar.f132793b || this.f132794c != cVar.f132794c) {
            return false;
        }
        Object obj3 = cVar.f132792a;
        Object obj4 = this.f132792a;
        if (obj4 == null) {
            return obj3 == null;
        }
        if (obj3 == null) {
            return false;
        }
        return ((obj4 instanceof File) || (obj4 instanceof URL) || (obj4 instanceof URI)) ? obj4.equals(obj3) : obj4 == obj3;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f132792a);
    }
}
