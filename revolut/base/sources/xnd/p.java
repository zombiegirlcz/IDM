package xnd;

import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsAccountsSelection f307432a;

    public p(AnalyticsAccountsSelection accountSelection) {
        Intrinsics.checkNotNullParameter(accountSelection, "accountSelection");
        this.f307432a = accountSelection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f307432a, ((p) obj2).f307432a);
    }

    public final int hashCode() {
        return this.f307432a.hashCode();
    }
}
