package ieb;

import aii.r;
import com.revolut.feature.retail.restaurants.impl.domain.model.Reservation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Reservation f160689a;

    public h(Reservation reservation) {
        Intrinsics.checkNotNullParameter(reservation, "reservation");
        this.f160689a = reservation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f160689a, ((h) obj2).f160689a);
    }

    public final int hashCode() {
        return this.f160689a.hashCode();
    }
}
