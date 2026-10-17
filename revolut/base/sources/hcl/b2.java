package hcl;

import java.math.BigDecimal;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u000b\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0011\u0010\u0004¨\u0006\u0018"}, d2 = {"Lhcl/b2;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "e", "()Ljava/math/BigDecimal;", "rate", "b", "Ljava/lang/String;", "c", "frequency", "f", "type", "d", "barrier", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "firstObservationDate", "performanceBasis", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("rate")
    private final BigDecimal rate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("frequency")
    private final String frequency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    private final String type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("barrier")
    private final BigDecimal barrier;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("first_observation_date")
    private final LocalDate firstObservationDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("performance_basis")
    private final String performanceBasis;

    public b2(BigDecimal bigDecimal, String str, String str2, BigDecimal bigDecimal2, LocalDate localDate, String str3) {
        this.rate = bigDecimal;
        this.frequency = str;
        this.type = str2;
        this.barrier = bigDecimal2;
        this.firstObservationDate = localDate;
        this.performanceBasis = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getBarrier() {
        return this.barrier;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getFirstObservationDate() {
        return this.firstObservationDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFrequency() {
        return this.frequency;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPerformanceBasis() {
        return this.performanceBasis;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final BigDecimal getRate() {
        return this.rate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj2;
        return Intrinsics.f(this.rate, b2Var.rate) && Intrinsics.f(this.frequency, b2Var.frequency) && Intrinsics.f(this.type, b2Var.type) && Intrinsics.f(this.barrier, b2Var.barrier) && Intrinsics.f(this.firstObservationDate, b2Var.firstObservationDate) && Intrinsics.f(this.performanceBasis, b2Var.performanceBasis);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.rate;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.frequency;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.barrier;
        int iHashCode4 = (iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        LocalDate localDate = this.firstObservationDate;
        int iHashCode5 = (iHashCode4 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str3 = this.performanceBasis;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }
}
