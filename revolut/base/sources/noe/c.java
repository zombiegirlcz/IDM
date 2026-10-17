package noe;

import aii.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f218006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f218007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f218008c;
    public final List d;

    public c(List taxResidencyRules, List skippableTinCountries, List list, wi0.b userCountry) {
        Intrinsics.checkNotNullParameter(taxResidencyRules, "taxResidencyRules");
        Intrinsics.checkNotNullParameter(userCountry, "userCountry");
        Intrinsics.checkNotNullParameter(skippableTinCountries, "skippableTinCountries");
        this.f218006a = taxResidencyRules;
        this.f218007b = userCountry;
        this.f218008c = skippableTinCountries;
        this.d = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f218006a, cVar.f218006a) && Intrinsics.f(this.f218007b, cVar.f218007b) && Intrinsics.f(this.f218008c, cVar.f218008c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(this.f218006a.hashCode() * 31, 31, this.f218007b.f297794a), 31, this.f218008c);
        List list = this.d;
        return iD + (list == null ? 0 : list.hashCode());
    }
}
