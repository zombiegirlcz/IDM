package xdb;

import com.revolut.feature.retail.restaurants.impl.domain.model.Customer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f304398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Customer f304399b;

    public m(r reservationDetails, Customer retailCustomer) {
        Intrinsics.checkNotNullParameter(reservationDetails, "reservationDetails");
        Intrinsics.checkNotNullParameter(retailCustomer, "retailCustomer");
        this.f304398a = reservationDetails;
        this.f304399b = retailCustomer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f304398a, mVar.f304398a) && Intrinsics.f(this.f304399b, mVar.f304399b);
    }

    public final int hashCode() {
        return this.f304399b.hashCode() + (this.f304398a.hashCode() * 31);
    }
}
