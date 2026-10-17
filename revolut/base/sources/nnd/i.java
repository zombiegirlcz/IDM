package nnd;

import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsAccountsSelection f217550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f217551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f217552c;

    public i(AnalyticsAccountsSelection accountsSelection, boolean z, l tab2) {
        Intrinsics.checkNotNullParameter(accountsSelection, "accountsSelection");
        Intrinsics.checkNotNullParameter(tab2, "tab");
        this.f217550a = accountsSelection;
        this.f217551b = z;
        this.f217552c = tab2;
    }

    @Override // nnd.k
    public final l b() {
        return this.f217552c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f217550a, iVar.f217550a) && this.f217551b == iVar.f217551b && this.f217552c == iVar.f217552c;
    }

    public final int hashCode() {
        return this.f217552c.hashCode() + j6.a.c(this.f217550a.hashCode() * 31, 31, this.f217551b);
    }
}
