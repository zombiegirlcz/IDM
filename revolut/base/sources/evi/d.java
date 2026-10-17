package evi;

import cli.j;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTimeSlot;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f129959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f129960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AsftTimeSlot f129961c;

    public d(Data asftTerminal, LocalDate localDate, AsftTimeSlot asftTimeSlot) {
        Intrinsics.checkNotNullParameter(asftTerminal, "asftTerminal");
        this.f129959a = asftTerminal;
        this.f129960b = localDate;
        this.f129961c = asftTimeSlot;
    }

    public static d a(d dVar, Data asftTerminal, AsftTimeSlot asftTimeSlot, int i) {
        if ((i & 1) != 0) {
            asftTerminal = dVar.f129959a;
        }
        LocalDate localDate = dVar.f129960b;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(asftTerminal, "asftTerminal");
        return new d(asftTerminal, localDate, asftTimeSlot);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f129959a, dVar.f129959a) && Intrinsics.f(this.f129960b, dVar.f129960b) && Intrinsics.f(this.f129961c, dVar.f129961c);
    }

    public final int hashCode() {
        int iHashCode = this.f129959a.hashCode() * 31;
        LocalDate localDate = this.f129960b;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        AsftTimeSlot asftTimeSlot = this.f129961c;
        return iHashCode2 + (asftTimeSlot != null ? asftTimeSlot.hashCode() : 0);
    }
}
