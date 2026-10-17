package ejb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f126836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f126837b;

    public b(dj0.d totalBalanceInBaseCurrency, List savingsAccountsDetails) {
        Intrinsics.checkNotNullParameter(totalBalanceInBaseCurrency, "totalBalanceInBaseCurrency");
        Intrinsics.checkNotNullParameter(savingsAccountsDetails, "savingsAccountsDetails");
        this.f126836a = totalBalanceInBaseCurrency;
        this.f126837b = savingsAccountsDetails;
    }

    public static b a(b bVar, List savingsAccountsDetails) {
        dj0.d totalBalanceInBaseCurrency = bVar.f126836a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(totalBalanceInBaseCurrency, "totalBalanceInBaseCurrency");
        Intrinsics.checkNotNullParameter(savingsAccountsDetails, "savingsAccountsDetails");
        return new b(totalBalanceInBaseCurrency, savingsAccountsDetails);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f126836a, bVar.f126836a) && Intrinsics.f(this.f126837b, bVar.f126837b);
    }

    public final int hashCode() {
        return this.f126837b.hashCode() + (this.f126836a.hashCode() * 31);
    }
}
