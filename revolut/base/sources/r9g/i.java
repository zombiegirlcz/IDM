package r9g;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010$\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010(\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b\u000f\u0010'R \u0010/\u001a\b\u0012\u0004\u0012\u00020*0)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u00103\u001a\u0002008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u00101\u001a\u0004\b+\u00102R\u001c\u00107\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u00105\u001a\u0004\b\f\u00106R\u001c\u00108\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\"\u0010;\u001a\n\u0012\u0004\u0012\u000209\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b:\u0010.R\u001c\u0010<\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b \u0010\u0004R\u001c\u0010@\u001a\u0004\u0018\u00010=8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\b\u0005\u0010?¨\u0006A"}, d2 = {"Lr9g/i;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "h", "id", "b", "m", "status", "c", "bookingReference", "Lr9g/r;", "d", "Lr9g/r;", "o", "()Lr9g/r;", "traveller", "Lr9g/h;", "e", "Lr9g/h;", "f", "()Lr9g/h;", "dates", "Lx9g/b;", "Lx9g/b;", "k", "()Lx9g/b;", "property", "Lofi/n;", "g", "Lofi/n;", "j", "()Lofi/n;", "pricing", "Lr9g/e;", "Lr9g/e;", "()Lr9g/e;", "checkInInstruction", "", "Lr9g/n;", "i", "Ljava/util/List;", "l", "()Ljava/util/List;", "rooms", "Lr9g/j;", "Lr9g/j;", "()Lr9g/j;", "payment", "Lr9g/s;", "Lr9g/s;", "()Lr9g/s;", "cashback", "createdDate", "Lr9g/q;", "n", "transactions", "hardAmendmentEligibility", "Lr9g/f;", "Lr9g/f;", "()Lr9g/f;", "amendment", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("bookingReference")
    @NotNull
    private final String bookingReference;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("traveller")
    @NotNull
    private final r traveller;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("dates")
    @NotNull
    private final h dates;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("propertyDetails")
    @NotNull
    private final x9g.b property;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("pricing")
    @NotNull
    private final ofi.n pricing;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("checkInInstruction")
    private final e checkInInstruction;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("roomBookings")
    @NotNull
    private final List<n> rooms;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("payment")
    @NotNull
    private final j payment;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("cashback")
    private final s cashback;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    private final String createdDate;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactions")
    private final List<q> transactions;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("hardAmendmentEligibility")
    private final String hardAmendmentEligibility;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("amendment")
    private final f amendment;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final f getAmendment() {
        return this.amendment;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBookingReference() {
        return this.bookingReference;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final s getCashback() {
        return this.cashback;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final e getCheckInInstruction() {
        return this.checkInInstruction;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCreatedDate() {
        return this.createdDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.id, iVar.id) && Intrinsics.f(this.status, iVar.status) && Intrinsics.f(this.bookingReference, iVar.bookingReference) && Intrinsics.f(this.traveller, iVar.traveller) && Intrinsics.f(this.dates, iVar.dates) && Intrinsics.f(this.property, iVar.property) && Intrinsics.f(this.pricing, iVar.pricing) && Intrinsics.f(this.checkInInstruction, iVar.checkInInstruction) && Intrinsics.f(this.rooms, iVar.rooms) && Intrinsics.f(this.payment, iVar.payment) && Intrinsics.f(this.cashback, iVar.cashback) && Intrinsics.f(this.createdDate, iVar.createdDate) && Intrinsics.f(this.transactions, iVar.transactions) && Intrinsics.f(this.hardAmendmentEligibility, iVar.hardAmendmentEligibility) && Intrinsics.f(this.amendment, iVar.amendment);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final h getDates() {
        return this.dates;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getHardAmendmentEligibility() {
        return this.hardAmendmentEligibility;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int iHashCode = (this.pricing.hashCode() + ((this.property.hashCode() + ((this.dates.hashCode() + ((this.traveller.hashCode() + p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.status), 31, this.bookingReference)) * 31)) * 31)) * 31)) * 31;
        e eVar = this.checkInInstruction;
        int iHashCode2 = (this.payment.hashCode() + p.a.d((iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31, 31, this.rooms)) * 31;
        s sVar = this.cashback;
        int iHashCode3 = (iHashCode2 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        String str = this.createdDate;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<q> list = this.transactions;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.hardAmendmentEligibility;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        f fVar = this.amendment;
        return iHashCode6 + (fVar != null ? fVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final j getPayment() {
        return this.payment;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final ofi.n getPricing() {
        return this.pricing;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final x9g.b getProperty() {
        return this.property;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final List getRooms() {
        return this.rooms;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final List getTransactions() {
        return this.transactions;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final r getTraveller() {
        return this.traveller;
    }
}
