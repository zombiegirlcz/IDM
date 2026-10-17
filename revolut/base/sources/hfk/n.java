package hfk;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\n\u0010\u0012¨\u0006\u0014"}, d2 = {"Lhfk/n;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "feeCode", "Ljo3/a;", "b", "Ljo3/a;", "()Ljo3/a;", "amount", "d", "originalAmount", "Lhfk/m;", "Lhfk/m;", "()Lhfk/m;", "discountInfo", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("feeCode")
    @NotNull
    private final String feeCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("originalAmount")
    private final jo3.a originalAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("discountInfo")
    private final m discountInfo;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final m getDiscountInfo() {
        return this.discountInfo;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFeeCode() {
        return this.feeCode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getOriginalAmount() {
        return this.originalAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.feeCode, nVar.feeCode) && Intrinsics.f(this.amount, nVar.amount) && Intrinsics.f(this.originalAmount, nVar.originalAmount) && Intrinsics.f(this.discountInfo, nVar.discountInfo);
    }

    public final int hashCode() {
        int iJ = v7.j(this.amount, this.feeCode.hashCode() * 31, 31);
        jo3.a aVar = this.originalAmount;
        int iHashCode = (iJ + (aVar == null ? 0 : aVar.hashCode())) * 31;
        m mVar = this.discountInfo;
        return iHashCode + (mVar != null ? mVar.hashCode() : 0);
    }
}
