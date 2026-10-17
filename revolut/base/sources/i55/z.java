package i55;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004¨\u0006\u0015"}, d2 = {"Li55/z;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getRepaymentToken", "repaymentToken", "", "b", "J", "getAmount", "()J", "amount", "c", "getRepaymentType", "repaymentType", "d", "getPocketId", "pocketId", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("repaymentToken")
    @NotNull
    private final String repaymentToken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final long amount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("partialRepaymentStrategy")
    private final String repaymentType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("pocketId")
    private final String pocketId;

    public z(String repaymentToken, long j2, String str, String str2) {
        Intrinsics.checkNotNullParameter(repaymentToken, "repaymentToken");
        this.repaymentToken = repaymentToken;
        this.amount = j2;
        this.repaymentType = str;
        this.pocketId = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.repaymentToken, zVar.repaymentToken) && this.amount == zVar.amount && Intrinsics.f(this.repaymentType, zVar.repaymentType) && Intrinsics.f(this.pocketId, zVar.pocketId);
    }

    public final int hashCode() {
        int iC = a0.d.c(this.repaymentToken.hashCode() * 31, 31, this.amount);
        String str = this.repaymentType;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pocketId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
