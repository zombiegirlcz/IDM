package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u0010R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u000e\u0010\u0015¨\u0006\u0018"}, d2 = {"Lkfj/o4;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Long;", "()Ljava/lang/Long;", "allowanceBytes", "b", "e", "usageBytes", "Ljo3/a;", "c", "Ljo3/a;", "()Ljo3/a;", "pricePerGb", "", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "totalDays", "remainingDays", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("allowanceBytes")
    private final Long allowanceBytes = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("usageBytes")
    private final Long usageBytes = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("pricePerGb")
    private final jo3.a pricePerGb = null;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("totalDays")
    private final Integer totalDays = null;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("remainingDays")
    private final Integer remainingDays = null;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getAllowanceBytes() {
        return this.allowanceBytes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getPricePerGb() {
        return this.pricePerGb;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getRemainingDays() {
        return this.remainingDays;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getTotalDays() {
        return this.totalDays;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getUsageBytes() {
        return this.usageBytes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o4)) {
            return false;
        }
        o4 o4Var = (o4) obj2;
        return Intrinsics.f(this.allowanceBytes, o4Var.allowanceBytes) && Intrinsics.f(this.usageBytes, o4Var.usageBytes) && Intrinsics.f(this.pricePerGb, o4Var.pricePerGb) && Intrinsics.f(this.totalDays, o4Var.totalDays) && Intrinsics.f(this.remainingDays, o4Var.remainingDays);
    }

    public final int hashCode() {
        Long l2 = this.allowanceBytes;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Long l3 = this.usageBytes;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        jo3.a aVar = this.pricePerGb;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Integer num = this.totalDays;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.remainingDays;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }
}
