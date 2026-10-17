package hcl;

import java.math.BigDecimal;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0006\u0010\u0015¨\u0006\u0017"}, d2 = {"Lhcl/j;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "b", "()Ljava/math/BigDecimal;", "couponRate", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "d", "()Ljava/time/LocalDate;", "maturityDate", "c", "Ljava/lang/String;", "issuerName", "Lnel/b;", "Lnel/b;", "()Lnel/b;", "bondType", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("couponRate")
    private final BigDecimal couponRate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("maturityDate")
    private final LocalDate maturityDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("issuerName")
    private final String issuerName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("bondType")
    private final nel.b bondType;

    public j(BigDecimal bigDecimal, LocalDate localDate, String str, nel.b bVar) {
        this.couponRate = bigDecimal;
        this.maturityDate = localDate;
        this.issuerName = str;
        this.bondType = bVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final nel.b getBondType() {
        return this.bondType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getCouponRate() {
        return this.couponRate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getIssuerName() {
        return this.issuerName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LocalDate getMaturityDate() {
        return this.maturityDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.couponRate, jVar.couponRate) && Intrinsics.f(this.maturityDate, jVar.maturityDate) && Intrinsics.f(this.issuerName, jVar.issuerName) && this.bondType == jVar.bondType;
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.couponRate;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        LocalDate localDate = this.maturityDate;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str = this.issuerName;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        nel.b bVar = this.bondType;
        return iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }
}
