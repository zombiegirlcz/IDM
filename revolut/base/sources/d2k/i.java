package d2k;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f110880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f110881b;

    public i(List topCountries, List availableCountries) {
        Intrinsics.checkNotNullParameter(topCountries, "topCountries");
        Intrinsics.checkNotNullParameter(availableCountries, "availableCountries");
        this.f110880a = topCountries;
        this.f110881b = availableCountries;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f110880a, iVar.f110880a) && Intrinsics.f(this.f110881b, iVar.f110881b);
    }

    public final int hashCode() {
        return this.f110881b.hashCode() + (this.f110880a.hashCode() * 31);
    }
}
