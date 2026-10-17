package r9;

import a0.d;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f252470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f252471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f252472c;

    public a(Class cls, String str) {
        this.f252470a = cls;
        this.f252471b = cls.getName().hashCode() + (str == null ? 0 : str.hashCode());
        this.f252472c = (str == null || str.isEmpty()) ? null : str;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 == null || obj2.getClass() != a.class) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f252470a == aVar.f252470a && Objects.equals(this.f252472c, aVar.f252472c);
    }

    public final int hashCode() {
        return this.f252471b;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("[NamedType, class ");
        d.A(this.f252470a, sb6, ", name: ");
        return v0.a.i(sb6, this.f252472c == null ? "null" : v0.a.i(new StringBuilder("'"), this.f252472c, "'"), "]");
    }
}
