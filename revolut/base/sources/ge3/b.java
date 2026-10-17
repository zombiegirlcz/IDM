package ge3;

import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CategorisationFilter f143216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsAccountsSelection f143217b;

    public b(CategorisationFilter filter, AnalyticsAccountsSelection analyticsAccountsSelection) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(analyticsAccountsSelection, "analyticsAccountsSelection");
        this.f143216a = filter;
        this.f143217b = analyticsAccountsSelection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f143216a, bVar.f143216a) && Intrinsics.f(this.f143217b, bVar.f143217b);
    }

    public final int hashCode() {
        return this.f143217b.hashCode() + (this.f143216a.hashCode() * 31);
    }
}
