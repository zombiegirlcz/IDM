package dwf;

import com.revolut.data.model.Data;
import com.revolut.feature.transport.models.TransportTicketQrCode;
import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f120375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransportTicketQrCode f120376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a3 f120377c;
    public final LocalDateTime d;

    public f(Data ticketDetails, TransportTicketQrCode transportTicketQrCode, a3 a3Var, LocalDateTime now) {
        Intrinsics.checkNotNullParameter(ticketDetails, "ticketDetails");
        Intrinsics.checkNotNullParameter(now, "now");
        this.f120375a = ticketDetails;
        this.f120376b = transportTicketQrCode;
        this.f120377c = a3Var;
        this.d = now;
    }

    public static f a(f fVar, Data ticketDetails, TransportTicketQrCode transportTicketQrCode, a3 a3Var, LocalDateTime now, int i) {
        if ((i & 1) != 0) {
            ticketDetails = fVar.f120375a;
        }
        if ((i & 2) != 0) {
            transportTicketQrCode = fVar.f120376b;
        }
        if ((i & 4) != 0) {
            a3Var = fVar.f120377c;
        }
        if ((i & 8) != 0) {
            now = fVar.d;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(ticketDetails, "ticketDetails");
        Intrinsics.checkNotNullParameter(now, "now");
        return new f(ticketDetails, transportTicketQrCode, a3Var, now);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f120375a, fVar.f120375a) && Intrinsics.f(this.f120376b, fVar.f120376b) && Intrinsics.f(this.f120377c, fVar.f120377c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f120375a.hashCode() * 31;
        TransportTicketQrCode transportTicketQrCode = this.f120376b;
        int iHashCode2 = (iHashCode + (transportTicketQrCode == null ? 0 : transportTicketQrCode.hashCode())) * 31;
        a3 a3Var = this.f120377c;
        return this.d.hashCode() + ((iHashCode2 + (a3Var != null ? a3Var.hashCode() : 0)) * 31);
    }
}
