package d3c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111017b;

    public g(String type, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f111016a = type;
        this.f111017b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f111016a, gVar.f111016a) && Intrinsics.f(this.f111017b, gVar.f111017b);
    }

    public final int hashCode() {
        int iHashCode = this.f111016a.hashCode() * 31;
        String str = this.f111017b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
