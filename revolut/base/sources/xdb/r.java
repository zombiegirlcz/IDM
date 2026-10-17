package xdb;

import com.revolut.feature.retail.restaurants.impl.domain.model.Reservation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Reservation f304405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f304406b;

    public r(Reservation reservation, v reservationPage) {
        Intrinsics.checkNotNullParameter(reservation, "reservation");
        Intrinsics.checkNotNullParameter(reservationPage, "reservationPage");
        this.f304405a = reservation;
        this.f304406b = reservationPage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f304405a, rVar.f304405a) && Intrinsics.f(this.f304406b, rVar.f304406b);
    }

    public final int hashCode() {
        return this.f304406b.hashCode() + (this.f304405a.hashCode() * 31);
    }
}
