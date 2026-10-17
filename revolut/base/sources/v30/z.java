package v30;

import com.revolut.feature.tickets.api.models.TicketDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kse.a f285839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TicketDetails f285840b;

    public z(kse.a ticket, TicketDetails details) {
        Intrinsics.checkNotNullParameter(ticket, "ticket");
        Intrinsics.checkNotNullParameter(details, "details");
        this.f285839a = ticket;
        this.f285840b = details;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f285839a, zVar.f285839a) && Intrinsics.f(this.f285840b, zVar.f285840b);
    }

    public final int hashCode() {
        return this.f285840b.hashCode() + (this.f285839a.hashCode() * 31);
    }
}
