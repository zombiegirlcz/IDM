package hcl;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\r\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"Lhcl/g;", "", "", "toString", "()Ljava/lang/String;", "Lko3/b;", "a", "Lko3/b;", "b", "()Lko3/b;", "cleanPrice", "d", "dirtyPrice", "c", "accruedInterest", "Ljava/math/BigDecimal;", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "currentYield", "e", "yieldToMaturity", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("clean_price")
    private final ko3.b cleanPrice;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("dirty_price")
    private final ko3.b dirtyPrice;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("accrued_interest")
    private final ko3.b accruedInterest;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("current_yield")
    private final BigDecimal currentYield;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("yield_to_maturity")
    private final BigDecimal yieldToMaturity;

    public g(ko3.b bVar, ko3.b bVar2, ko3.b bVar3, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        this.cleanPrice = bVar;
        this.dirtyPrice = bVar2;
        this.accruedInterest = bVar3;
        this.currentYield = bigDecimal;
        this.yieldToMaturity = bigDecimal2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ko3.b getAccruedInterest() {
        return this.accruedInterest;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ko3.b getCleanPrice() {
        return this.cleanPrice;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BigDecimal getCurrentYield() {
        return this.currentYield;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ko3.b getDirtyPrice() {
        return this.dirtyPrice;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final BigDecimal getYieldToMaturity() {
        return this.yieldToMaturity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.cleanPrice, gVar.cleanPrice) && Intrinsics.f(this.dirtyPrice, gVar.dirtyPrice) && Intrinsics.f(this.accruedInterest, gVar.accruedInterest) && Intrinsics.f(this.currentYield, gVar.currentYield) && Intrinsics.f(this.yieldToMaturity, gVar.yieldToMaturity);
    }

    public final int hashCode() {
        ko3.b bVar = this.cleanPrice;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        ko3.b bVar2 = this.dirtyPrice;
        int iHashCode2 = (iHashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        ko3.b bVar3 = this.accruedInterest;
        int iHashCode3 = (iHashCode2 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31;
        BigDecimal bigDecimal = this.currentYield;
        int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.yieldToMaturity;
        return iHashCode4 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
    }
}
