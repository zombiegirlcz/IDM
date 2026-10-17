package z19;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f318763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f318764b;

    public b(String primary, String str) {
        Intrinsics.checkNotNullParameter(primary, "primary");
        this.f318763a = primary;
        this.f318764b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f318763a, bVar.f318763a) && Intrinsics.f(this.f318764b, bVar.f318764b);
    }

    public final int hashCode() {
        int iHashCode = this.f318763a.hashCode() * 31;
        String str = this.f318764b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
