package a5g;

import com.revolut.data.model.Data;
import com.revolut.feature.travel.flights.models.domain.booking.BookingStatus;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f1381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f1382c;
    public final BookingStatus d;

    public e(String bookingId, Data bookingDetails, Set expandedTravellers, BookingStatus bookingStatus) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        Intrinsics.checkNotNullParameter(bookingDetails, "bookingDetails");
        Intrinsics.checkNotNullParameter(expandedTravellers, "expandedTravellers");
        this.f1380a = bookingId;
        this.f1381b = bookingDetails;
        this.f1382c = expandedTravellers;
        this.d = bookingStatus;
    }

    public static e a(e eVar, Data bookingDetails, Set expandedTravellers, BookingStatus bookingStatus, int i) {
        String bookingId = eVar.f1380a;
        if ((i & 2) != 0) {
            bookingDetails = eVar.f1381b;
        }
        if ((i & 4) != 0) {
            expandedTravellers = eVar.f1382c;
        }
        if ((i & 8) != 0) {
            bookingStatus = eVar.d;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        Intrinsics.checkNotNullParameter(bookingDetails, "bookingDetails");
        Intrinsics.checkNotNullParameter(expandedTravellers, "expandedTravellers");
        return new e(bookingId, bookingDetails, expandedTravellers, bookingStatus);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f1380a, eVar.f1380a) && Intrinsics.f(this.f1381b, eVar.f1381b) && Intrinsics.f(this.f1382c, eVar.f1382c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        int iF = p.a.f(kii.e.c(this.f1381b, this.f1380a.hashCode() * 31, 31), 31, this.f1382c);
        BookingStatus bookingStatus = this.d;
        return iF + (bookingStatus == null ? 0 : bookingStatus.hashCode());
    }
}
