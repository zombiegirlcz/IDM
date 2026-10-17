package apd;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xjg.l f8168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f8169c;

    public g(List trips, xjg.l appStyle, Set allCountryCodes) {
        Intrinsics.checkNotNullParameter(trips, "trips");
        Intrinsics.checkNotNullParameter(appStyle, "appStyle");
        Intrinsics.checkNotNullParameter(allCountryCodes, "allCountryCodes");
        this.f8167a = trips;
        this.f8168b = appStyle;
        this.f8169c = allCountryCodes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f8167a, gVar.f8167a) && Intrinsics.f(this.f8168b, gVar.f8168b) && Intrinsics.f(this.f8169c, gVar.f8169c);
    }

    public final int hashCode() {
        return this.f8169c.hashCode() + ((this.f8168b.hashCode() + (this.f8167a.hashCode() * 31)) * 31);
    }
}
