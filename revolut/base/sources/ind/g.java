package ind;

import com.revolut.data.model.Data;
import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f162804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lzi.j f162805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lzi.h f162806c;
    public final CategorisationFilter.Scope.PocketsIdSet d;
    public final List e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jnd.d f162807g;

    public g(List analyticsByPeriod, lzi.j currentPeriod, lzi.h currentCycle, CategorisationFilter.Scope.PocketsIdSet scope, List allCategories, Data revPointsOptInPlacementBanner, jnd.d budget) {
        Intrinsics.checkNotNullParameter(analyticsByPeriod, "analyticsByPeriod");
        Intrinsics.checkNotNullParameter(currentPeriod, "currentPeriod");
        Intrinsics.checkNotNullParameter(currentCycle, "currentCycle");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(allCategories, "allCategories");
        Intrinsics.checkNotNullParameter(revPointsOptInPlacementBanner, "revPointsOptInPlacementBanner");
        Intrinsics.checkNotNullParameter(budget, "budget");
        this.f162804a = analyticsByPeriod;
        this.f162805b = currentPeriod;
        this.f162806c = currentCycle;
        this.d = scope;
        this.e = allCategories;
        this.f = revPointsOptInPlacementBanner;
        this.f162807g = budget;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f162804a, gVar.f162804a) && Intrinsics.f(this.f162805b, gVar.f162805b) && Intrinsics.f(this.f162806c, gVar.f162806c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f162807g, gVar.f162807g);
    }

    public final int hashCode() {
        return this.f162807g.hashCode() + kii.e.c(this.f, p.a.d(p.a.f((this.f162806c.hashCode() + ((this.f162805b.hashCode() + (this.f162804a.hashCode() * 31)) * 31)) * 31, 31, this.d.f65754a), 31, this.e), 31);
    }
}
