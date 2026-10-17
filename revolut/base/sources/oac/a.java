package oac;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u000e\u0010\u0016¨\u0006\u0019"}, d2 = {"Loac/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "orderId", "b", "c", "bookingReference", "bookingManagementUrl", "", "d", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "notificationsEnabled", "", "Loac/d;", "Ljava/util/List;", "()Ljava/util/List;", "flightTickets", "Companion", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("orderId")
    private final String orderId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("bookingReference")
    @NotNull
    private final String bookingReference;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("bookingManagementUrl")
    private final String bookingManagementUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("notificationsEnabled")
    private final Boolean notificationsEnabled;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("flightTickets")
    @NotNull
    private final List<d> flightTickets;

    public a(String str, String bookingReference, String str2, Boolean bool, List flightTickets) {
        Intrinsics.checkNotNullParameter(bookingReference, "bookingReference");
        Intrinsics.checkNotNullParameter(flightTickets, "flightTickets");
        this.orderId = str;
        this.bookingReference = bookingReference;
        this.bookingManagementUrl = str2;
        this.notificationsEnabled = bool;
        this.flightTickets = flightTickets;
    }

    public static a a(a aVar, Boolean bool) {
        String str = aVar.orderId;
        String bookingReference = aVar.bookingReference;
        String str2 = aVar.bookingManagementUrl;
        List<d> flightTickets = aVar.flightTickets;
        Intrinsics.checkNotNullParameter(bookingReference, "bookingReference");
        Intrinsics.checkNotNullParameter(flightTickets, "flightTickets");
        return new a(str, bookingReference, str2, bool, flightTickets);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBookingManagementUrl() {
        return this.bookingManagementUrl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBookingReference() {
        return this.bookingReference;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getFlightTickets() {
        return this.flightTickets;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getNotificationsEnabled() {
        return this.notificationsEnabled;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.orderId, aVar.orderId) && Intrinsics.f(this.bookingReference, aVar.bookingReference) && Intrinsics.f(this.bookingManagementUrl, aVar.bookingManagementUrl) && Intrinsics.f(this.notificationsEnabled, aVar.notificationsEnabled) && Intrinsics.f(this.flightTickets, aVar.flightTickets);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    public final int hashCode() {
        String str = this.orderId;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.bookingReference);
        String str2 = this.bookingManagementUrl;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.notificationsEnabled;
        return this.flightTickets.hashCode() + ((iHashCode + (bool != null ? bool.hashCode() : 0)) * 31);
    }
}
