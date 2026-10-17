package zne;

import aii.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f323806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f323807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f323808c;

    public b(wi0.b userCountry, List taxResidencies, List taxResidencyRules) {
        Intrinsics.checkNotNullParameter(userCountry, "userCountry");
        Intrinsics.checkNotNullParameter(taxResidencies, "taxResidencies");
        Intrinsics.checkNotNullParameter(taxResidencyRules, "taxResidencyRules");
        this.f323806a = userCountry;
        this.f323807b = taxResidencies;
        this.f323808c = taxResidencyRules;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f323806a, bVar.f323806a) && Intrinsics.f(this.f323807b, bVar.f323807b) && Intrinsics.f(this.f323808c, bVar.f323808c);
    }

    public final int hashCode() {
        return this.f323808c.hashCode() + p.a.d(this.f323806a.f297794a.hashCode() * 31, 31, this.f323807b);
    }
}
