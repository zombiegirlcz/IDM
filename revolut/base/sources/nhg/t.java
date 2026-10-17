package nhg;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class t extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f215486c;
    public final Set d;

    public t(String flightId, String str, Set selectedCabinClasses, String str2) {
        Intrinsics.checkNotNullParameter(flightId, "flightId");
        Intrinsics.checkNotNullParameter(selectedCabinClasses, "selectedCabinClasses");
        this.f215484a = flightId;
        this.f215485b = str;
        this.f215486c = str2;
        this.d = selectedCabinClasses;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f215484a, tVar.f215484a) && Intrinsics.f(this.f215485b, tVar.f215485b) && Intrinsics.f(this.f215486c, tVar.f215486c) && Intrinsics.f(this.d, tVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f215484a.hashCode() * 31;
        String str = this.f215485b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f215486c;
        return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
