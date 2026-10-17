package r9g;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Lr9g/g0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "bookingId", "c", "status", "Lr9g/p;", "d", "Lr9g/p;", "()Lr9g/p;", "tokenizedOrder", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("bookingId")
    @NotNull
    private final String bookingId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("tokenizedOrder")
    private final p tokenizedOrder;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBookingId() {
        return this.bookingId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final p getTokenizedOrder() {
        return this.tokenizedOrder;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.id, g0Var.id) && Intrinsics.f(this.bookingId, g0Var.bookingId) && Intrinsics.f(this.status, g0Var.status) && Intrinsics.f(this.tokenizedOrder, g0Var.tokenizedOrder);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.bookingId), 31, this.status);
        p pVar = this.tokenizedOrder;
        return iC + (pVar == null ? 0 : pVar.hashCode());
    }
}
