package xnd;

import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsAccountsSelection f307416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f307417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f307418c;
    public final Set d;
    public final xi0.b e;
    public final Set f;

    public l(AnalyticsAccountsSelection analyticsAccountsSelection, String currentUserId, Set selectedAccountsOwnerIds, Set pocketIds, xi0.b analyticsCurrency, Set walletsIds) {
        Intrinsics.checkNotNullParameter(analyticsAccountsSelection, "analyticsAccountsSelection");
        Intrinsics.checkNotNullParameter(currentUserId, "currentUserId");
        Intrinsics.checkNotNullParameter(selectedAccountsOwnerIds, "selectedAccountsOwnerIds");
        Intrinsics.checkNotNullParameter(pocketIds, "pocketIds");
        Intrinsics.checkNotNullParameter(analyticsCurrency, "analyticsCurrency");
        Intrinsics.checkNotNullParameter(walletsIds, "walletsIds");
        this.f307416a = analyticsAccountsSelection;
        this.f307417b = currentUserId;
        this.f307418c = selectedAccountsOwnerIds;
        this.d = pocketIds;
        this.e = analyticsCurrency;
        this.f = walletsIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f307416a, lVar.f307416a) && Intrinsics.f(this.f307417b, lVar.f307417b) && Intrinsics.f(this.f307418c, lVar.f307418c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + h30.l.j(this.e, p.a.f(p.a.f(p.a.c(this.f307416a.hashCode() * 31, 31, this.f307417b), 31, this.f307418c), 31, this.d), 31);
    }
}
