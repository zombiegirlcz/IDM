package geg;

import com.revolut.data.model.Data;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsRoomDetailsParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsRoomDetailsParams f143287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f143288b;

    public d(TravelHotelsRoomDetailsParams roomDetails, Data bookingDraft) {
        Intrinsics.checkNotNullParameter(roomDetails, "roomDetails");
        Intrinsics.checkNotNullParameter(bookingDraft, "bookingDraft");
        this.f143287a = roomDetails;
        this.f143288b = bookingDraft;
    }

    public static d a(d dVar, Data bookingDraft) {
        TravelHotelsRoomDetailsParams roomDetails = dVar.f143287a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(roomDetails, "roomDetails");
        Intrinsics.checkNotNullParameter(bookingDraft, "bookingDraft");
        return new d(roomDetails, bookingDraft);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f143287a, dVar.f143287a) && Intrinsics.f(this.f143288b, dVar.f143288b);
    }

    public final int hashCode() {
        return this.f143288b.hashCode() + (this.f143287a.hashCode() * 31);
    }
}
