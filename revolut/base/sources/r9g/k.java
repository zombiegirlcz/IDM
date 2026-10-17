package r9g;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lr9g/k;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getRequestId", "requestId", "Lr9g/r;", "b", "Lr9g/r;", "getTraveller", "()Lr9g/r;", "traveller", "", "Lr9g/o;", "c", "Ljava/util/List;", "getRooms", "()Ljava/util/List;", "rooms", "Lr9g/j;", "d", "Lr9g/j;", "getPayment", "()Lr9g/j;", "payment", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("requestId")
    @NotNull
    private final String requestId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("traveller")
    @NotNull
    private final r traveller;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("rooms")
    @NotNull
    private final List<o> rooms;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("payment")
    @NotNull
    private final j payment;

    public k(String requestId, r traveller, ArrayList rooms, j payment) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(traveller, "traveller");
        Intrinsics.checkNotNullParameter(rooms, "rooms");
        Intrinsics.checkNotNullParameter(payment, "payment");
        this.requestId = requestId;
        this.traveller = traveller;
        this.rooms = rooms;
        this.payment = payment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.requestId, kVar.requestId) && Intrinsics.f(this.traveller, kVar.traveller) && Intrinsics.f(this.rooms, kVar.rooms) && Intrinsics.f(this.payment, kVar.payment);
    }

    public final int hashCode() {
        return this.payment.hashCode() + p.a.d((this.traveller.hashCode() + (this.requestId.hashCode() * 31)) * 31, 31, this.rooms);
    }
}
