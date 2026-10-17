package cvf;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004¨\u0006\t"}, d2 = {"Lcvf/q;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getTicketOfferId", "ticketOfferId", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("ticketOfferId")
    @NotNull
    private final String ticketOfferId;

    public q(String ticketOfferId) {
        Intrinsics.checkNotNullParameter(ticketOfferId, "ticketOfferId");
        this.ticketOfferId = ticketOfferId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.ticketOfferId, ((q) obj2).ticketOfferId);
    }

    public final int hashCode() {
        return this.ticketOfferId.hashCode();
    }
}
