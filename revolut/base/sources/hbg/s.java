package hbg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class s extends com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150716a;

    public s(String bookingId) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        this.f150716a = bookingId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f150716a, ((s) obj2).f150716a);
    }

    public final int hashCode() {
        return this.f150716a.hashCode();
    }
}
