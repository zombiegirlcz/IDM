package h40;

import com.revolut.feature.tickets.api.models.TicketDetails;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TicketDetails f149274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f149275b;

    public t(TicketDetails details, Instant updatedAt) {
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        this.f149274a = details;
        this.f149275b = updatedAt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f149274a, tVar.f149274a) && Intrinsics.f(this.f149275b, tVar.f149275b);
    }

    public final int hashCode() {
        return this.f149275b.hashCode() + (this.f149274a.hashCode() * 31);
    }
}
