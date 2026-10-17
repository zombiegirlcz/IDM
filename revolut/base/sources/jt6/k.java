package jt6;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\f\u0010\nR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\u000f\u0010\nR\u001a\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0007\u0010\u0013¨\u0006\u0016"}, d2 = {"Ljt6/k;", "", "", "toString", "()Ljava/lang/String;", "", "Ljt6/j;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "payments", "c", "refunds", "Ljt6/f;", "d", "totalFees", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "netAmount", "Companion", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("payments")
    @NotNull
    private final List<j> payments;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("refunds")
    @NotNull
    private final List<j> refunds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalFees")
    @NotNull
    private final List<f> totalFees;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("netAmount")
    @NotNull
    private final jo3.a netAmount;

    public k(ArrayList payments, ArrayList refunds, ArrayList totalFees, jo3.a netAmount) {
        Intrinsics.checkNotNullParameter(payments, "payments");
        Intrinsics.checkNotNullParameter(refunds, "refunds");
        Intrinsics.checkNotNullParameter(totalFees, "totalFees");
        Intrinsics.checkNotNullParameter(netAmount, "netAmount");
        this.payments = payments;
        this.refunds = refunds;
        this.totalFees = totalFees;
        this.netAmount = netAmount;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getNetAmount() {
        return this.netAmount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getPayments() {
        return this.payments;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getRefunds() {
        return this.refunds;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getTotalFees() {
        return this.totalFees;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.payments, kVar.payments) && Intrinsics.f(this.refunds, kVar.refunds) && Intrinsics.f(this.totalFees, kVar.totalFees) && Intrinsics.f(this.netAmount, kVar.netAmount);
    }

    public final int hashCode() {
        return this.netAmount.hashCode() + p.a.d(p.a.d(this.payments.hashCode() * 31, 31, this.refunds), 31, this.totalFees);
    }
}
