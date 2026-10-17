package kfj;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\r\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\u0017"}, d2 = {"Lkfj/b1;", "", "", "toString", "()Ljava/lang/String;", "Lkfj/z0;", "a", "Lkfj/z0;", "d", "()Lkfj/z0;", "subscriptionFee", "", "Lkfj/a1;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "phoneNumbers", "", "J", "()J", "dueDate", "dueAmount", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("subscriptionFee")
    @NotNull
    private final z0 subscriptionFee;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("phoneNumbers")
    @NotNull
    private final List<a1> phoneNumbers;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("dueDate")
    private final long dueDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("dueAmount")
    @NotNull
    private final z0 dueAmount;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final z0 getDueAmount() {
        return this.dueAmount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getDueDate() {
        return this.dueDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getPhoneNumbers() {
        return this.phoneNumbers;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final z0 getSubscriptionFee() {
        return this.subscriptionFee;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj2;
        return Intrinsics.f(this.subscriptionFee, b1Var.subscriptionFee) && Intrinsics.f(this.phoneNumbers, b1Var.phoneNumbers) && this.dueDate == b1Var.dueDate && Intrinsics.f(this.dueAmount, b1Var.dueAmount);
    }

    public final int hashCode() {
        return this.dueAmount.hashCode() + a0.d.c(p.a.d(this.subscriptionFee.hashCode() * 31, 31, this.phoneNumbers), 31, this.dueDate);
    }
}
