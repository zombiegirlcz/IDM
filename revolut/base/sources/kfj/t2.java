package kfj;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0006\u0010\u0017R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017R\"\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u0015\u0010\u001eR\u001c\u0010#\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\u000b\u0010\"¨\u0006$"}, d2 = {"Lkfj/t2;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "f", "()Ljo3/a;", "price", "b", "Ljava/lang/String;", "g", "recurringPeriod", "Lkfj/u0;", "c", "Lkfj/u0;", "()Lkfj/u0;", "oneOffPointsRedemption", "Lkfj/z0;", "d", "Lkfj/z0;", "()Lkfj/z0;", "featuredPhoneNumberFee", "e", "planFee", "", "Lkfj/a1;", "Ljava/util/List;", "()Ljava/util/List;", "phoneNumbers", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "nextInvoiceDueDate", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("price")
    @NotNull
    private final jo3.a price;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("recurringPeriod")
    private final String recurringPeriod;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("oneOffPointsRedemption")
    private final u0 oneOffPointsRedemption;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("featuredPhoneNumberFee")
    private final z0 featuredPhoneNumberFee;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("planFee")
    private final z0 planFee;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("phoneNumbers")
    private final List<a1> phoneNumbers;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextInvoiceDueDate")
    private final Long nextInvoiceDueDate;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final z0 getFeaturedPhoneNumberFee() {
        return this.featuredPhoneNumberFee;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getNextInvoiceDueDate() {
        return this.nextInvoiceDueDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final u0 getOneOffPointsRedemption() {
        return this.oneOffPointsRedemption;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getPhoneNumbers() {
        return this.phoneNumbers;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final z0 getPlanFee() {
        return this.planFee;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) obj2;
        return Intrinsics.f(this.price, t2Var.price) && Intrinsics.f(this.recurringPeriod, t2Var.recurringPeriod) && Intrinsics.f(this.oneOffPointsRedemption, t2Var.oneOffPointsRedemption) && Intrinsics.f(this.featuredPhoneNumberFee, t2Var.featuredPhoneNumberFee) && Intrinsics.f(this.planFee, t2Var.planFee) && Intrinsics.f(this.phoneNumbers, t2Var.phoneNumbers) && Intrinsics.f(this.nextInvoiceDueDate, t2Var.nextInvoiceDueDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jo3.a getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getRecurringPeriod() {
        return this.recurringPeriod;
    }

    public final int hashCode() {
        int iHashCode = this.price.hashCode() * 31;
        String str = this.recurringPeriod;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        u0 u0Var = this.oneOffPointsRedemption;
        int iHashCode3 = (iHashCode2 + (u0Var == null ? 0 : u0Var.hashCode())) * 31;
        z0 z0Var = this.featuredPhoneNumberFee;
        int iHashCode4 = (iHashCode3 + (z0Var == null ? 0 : z0Var.hashCode())) * 31;
        z0 z0Var2 = this.planFee;
        int iHashCode5 = (iHashCode4 + (z0Var2 == null ? 0 : z0Var2.hashCode())) * 31;
        List<a1> list = this.phoneNumbers;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Long l2 = this.nextInvoiceDueDate;
        return iHashCode6 + (l2 != null ? l2.hashCode() : 0);
    }
}
