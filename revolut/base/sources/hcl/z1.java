package hcl;

import java.math.BigDecimal;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\n\u0010\bR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\r\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u0013\u0010\u0004¨\u0006\u0018"}, d2 = {"Lhcl/z1;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "accumulatingReturn", "b", "f", "redemptionAmount", "c", "Ljava/lang/String;", "d", "frequency", "barrier", "Ljava/time/LocalDate;", "e", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "firstObservationDate", "performanceBasis", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("accumulating_return")
    private final BigDecimal accumulatingReturn;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("redemption_amount")
    private final BigDecimal redemptionAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("frequency")
    private final String frequency;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("barrier")
    private final BigDecimal barrier;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("first_observation_date")
    private final LocalDate firstObservationDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("performance_basis")
    private final String performanceBasis;

    public z1(BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, BigDecimal bigDecimal3, LocalDate localDate, String str2) {
        this.accumulatingReturn = bigDecimal;
        this.redemptionAmount = bigDecimal2;
        this.frequency = str;
        this.barrier = bigDecimal3;
        this.firstObservationDate = localDate;
        this.performanceBasis = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getAccumulatingReturn() {
        return this.accumulatingReturn;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getBarrier() {
        return this.barrier;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDate getFirstObservationDate() {
        return this.firstObservationDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getFrequency() {
        return this.frequency;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPerformanceBasis() {
        return this.performanceBasis;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj2;
        return Intrinsics.f(this.accumulatingReturn, z1Var.accumulatingReturn) && Intrinsics.f(this.redemptionAmount, z1Var.redemptionAmount) && Intrinsics.f(this.frequency, z1Var.frequency) && Intrinsics.f(this.barrier, z1Var.barrier) && Intrinsics.f(this.firstObservationDate, z1Var.firstObservationDate) && Intrinsics.f(this.performanceBasis, z1Var.performanceBasis);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final BigDecimal getRedemptionAmount() {
        return this.redemptionAmount;
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.accumulatingReturn;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.redemptionAmount;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str = this.frequency;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.barrier;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        LocalDate localDate = this.firstObservationDate;
        int iHashCode5 = (iHashCode4 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str2 = this.performanceBasis;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }
}
