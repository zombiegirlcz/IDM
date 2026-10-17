package bxf;

import com.revolut.feature.transport.models.transit.TransitTicketRevPointOption;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f19678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f19679c;
    public final ArrayList d;
    public final TransitTicketRevPointOption e;
    public final String f;

    public e(String ticketOfferId, long j2, ArrayList generalInputs, ArrayList passengerInputs, TransitTicketRevPointOption transitTicketRevPointOption, String str) {
        Intrinsics.checkNotNullParameter(ticketOfferId, "ticketOfferId");
        Intrinsics.checkNotNullParameter(generalInputs, "generalInputs");
        Intrinsics.checkNotNullParameter(passengerInputs, "passengerInputs");
        this.f19677a = ticketOfferId;
        this.f19678b = j2;
        this.f19679c = generalInputs;
        this.d = passengerInputs;
        this.e = transitTicketRevPointOption;
        this.f = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f19677a, eVar.f19677a) && this.f19678b == eVar.f19678b && this.f19679c.equals(eVar.f19679c) && this.d.equals(eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f19679c, a0.d.c(this.f19677a.hashCode() * 31, 31, this.f19678b), 31), 31);
        TransitTicketRevPointOption transitTicketRevPointOption = this.e;
        int iHashCode = (iB + (transitTicketRevPointOption == null ? 0 : transitTicketRevPointOption.hashCode())) * 31;
        String str = this.f;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
