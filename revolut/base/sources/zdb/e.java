package zdb;

import com.revolut.feature.retail.restaurants.impl.domain.model.Reservation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Reservation f321435a;

    public e(Reservation reservation) {
        Intrinsics.checkNotNullParameter(reservation, "reservation");
        this.f321435a = reservation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f321435a, ((e) obj2).f321435a);
    }

    public final int hashCode() {
        return this.f321435a.hashCode();
    }
}
