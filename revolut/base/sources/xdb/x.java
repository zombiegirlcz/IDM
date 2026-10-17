package xdb;

import com.revolut.feature.retail.restaurants.impl.domain.model.ReservationArea;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f304413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReservationArea f304414b;

    public x(List timeSlots, ReservationArea reservationArea) {
        Intrinsics.checkNotNullParameter(timeSlots, "timeSlots");
        this.f304413a = timeSlots;
        this.f304414b = reservationArea;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f304413a, xVar.f304413a) && Intrinsics.f(this.f304414b, xVar.f304414b);
    }

    public final int hashCode() {
        int iHashCode = this.f304413a.hashCode() * 31;
        ReservationArea reservationArea = this.f304414b;
        return iHashCode + (reservationArea == null ? 0 : reservationArea.hashCode());
    }
}
