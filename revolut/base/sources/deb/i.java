package deb;

import aii.r;
import com.revolut.feature.retail.restaurants.impl.domain.model.Customer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Customer f113355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113356b;

    public i(Customer customer, String str) {
        Intrinsics.checkNotNullParameter(customer, "customer");
        this.f113355a = customer;
        this.f113356b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f113355a, iVar.f113355a) && Intrinsics.f(this.f113356b, iVar.f113356b);
    }

    public final int hashCode() {
        int iHashCode = this.f113355a.hashCode() * 31;
        String str = this.f113356b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
