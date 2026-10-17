package ra;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f252761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f252762b;

    public a(boolean z, String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f252761a = z;
        this.f252762b = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f252761a == aVar.f252761a && Intrinsics.f(this.f252762b, aVar.f252762b);
    }

    public final int hashCode() {
        return this.f252762b.hashCode() + (Boolean.hashCode(this.f252761a) * 31);
    }

    public final String toString() {
        return "UserDetailsFieldParcel(isLegacy=" + this.f252761a + ", code=" + this.f252762b + ")";
    }
}
