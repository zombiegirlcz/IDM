package dj9;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000e\u0010\tR\u001a\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0006\u0010\u0012¨\u0006\u0014"}, d2 = {"Ldj9/g;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "b", "()I", "maxPurchaseAmount", "Ljava/lang/String;", "d", "schedulerType", "c", "periodMultiplier", "", "Z", "()Z", "hasUpfrontPayment", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxPurchaseAmount")
    private final int maxPurchaseAmount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("schedulerType")
    private final String schedulerType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("periodMultiplier")
    private final int periodMultiplier;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("hasUpfrontPayment")
    private final boolean hasUpfrontPayment;

    public g(String str, int i, int i2, boolean z) {
        this.maxPurchaseAmount = i;
        this.schedulerType = str;
        this.periodMultiplier = i2;
        this.hasUpfrontPayment = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getHasUpfrontPayment() {
        return this.hasUpfrontPayment;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getMaxPurchaseAmount() {
        return this.maxPurchaseAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getPeriodMultiplier() {
        return this.periodMultiplier;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSchedulerType() {
        return this.schedulerType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.maxPurchaseAmount == gVar.maxPurchaseAmount && Intrinsics.f(this.schedulerType, gVar.schedulerType) && this.periodMultiplier == gVar.periodMultiplier && this.hasUpfrontPayment == gVar.hasUpfrontPayment;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.maxPurchaseAmount) * 31;
        String str = this.schedulerType;
        return Boolean.hashCode(this.hasUpfrontPayment) + j6.a.b(this.periodMultiplier, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
