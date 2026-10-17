package knd;

import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsAccountsSelection f186110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f186111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CategorisationFilter.Scope f186112c;
    public final xi0.b d;

    public m(AnalyticsAccountsSelection analyticsAccountsSelection, Set selectedAccountsOwnerIds, CategorisationFilter.Scope scope, xi0.b analyticsCurrency) {
        Intrinsics.checkNotNullParameter(analyticsAccountsSelection, "analyticsAccountsSelection");
        Intrinsics.checkNotNullParameter(selectedAccountsOwnerIds, "selectedAccountsOwnerIds");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(analyticsCurrency, "analyticsCurrency");
        this.f186110a = analyticsAccountsSelection;
        this.f186111b = selectedAccountsOwnerIds;
        this.f186112c = scope;
        this.d = analyticsCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f186110a, mVar.f186110a) && Intrinsics.f(this.f186111b, mVar.f186111b) && Intrinsics.f(this.f186112c, mVar.f186112c) && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f186112c.hashCode() + p.a.f(this.f186110a.hashCode() * 31, 31, this.f186111b)) * 31);
    }
}
