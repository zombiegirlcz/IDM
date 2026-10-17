package xdb;

import com.revolut.feature.retail.restaurants.impl.domain.model.Customer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Customer f304396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f304397b;

    public k(Customer customer, String str) {
        Intrinsics.checkNotNullParameter(customer, "customer");
        this.f304396a = customer;
        this.f304397b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f304396a, kVar.f304396a) && Intrinsics.f(this.f304397b, kVar.f304397b);
    }

    public final int hashCode() {
        int iHashCode = this.f304396a.hashCode() * 31;
        String str = this.f304397b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
