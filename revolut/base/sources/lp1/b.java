package lp1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\n\u0010\u001cR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u0005\u0010\u001c¨\u0006 "}, d2 = {"Llp1/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getPaymentMethod", "paymentMethod", "Ljo3/a;", "b", "Ljo3/a;", "c", "()Ljo3/a;", "amount", "f", "totalAmount", "Lmp1/b;", "d", "Lmp1/b;", "e", "()Lmp1/b;", "serviceProvider", "", "Z", "()Z", "amountEditable", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "allowScheduling", "g", "allowRecurring", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentMethod")
    @NotNull
    private final String paymentMethod;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final jo3.a amount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalAmount")
    private final jo3.a totalAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("serviceProvider")
    @NotNull
    private final mp1.b serviceProvider;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("amountEditable")
    private final boolean amountEditable;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("allowScheduling")
    private final Boolean allowScheduling;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("allowRecurring")
    private final Boolean allowRecurring;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getAllowRecurring() {
        return this.allowRecurring;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getAllowScheduling() {
        return this.allowScheduling;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getAmountEditable() {
        return this.amountEditable;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final mp1.b getServiceProvider() {
        return this.serviceProvider;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.paymentMethod, bVar.paymentMethod) && Intrinsics.f(this.amount, bVar.amount) && Intrinsics.f(this.totalAmount, bVar.totalAmount) && Intrinsics.f(this.serviceProvider, bVar.serviceProvider) && this.amountEditable == bVar.amountEditable && Intrinsics.f(this.allowScheduling, bVar.allowScheduling) && Intrinsics.f(this.allowRecurring, bVar.allowRecurring);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jo3.a getTotalAmount() {
        return this.totalAmount;
    }

    public final int hashCode() {
        int iHashCode = this.paymentMethod.hashCode() * 31;
        jo3.a aVar = this.amount;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jo3.a aVar2 = this.totalAmount;
        int iC = j6.a.c((this.serviceProvider.hashCode() + ((iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31)) * 31, 31, this.amountEditable);
        Boolean bool = this.allowScheduling;
        int iHashCode3 = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.allowRecurring;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }
}
