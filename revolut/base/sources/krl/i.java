package krl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u0010"}, d2 = {"Lkrl/i;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "expirationDate", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "contractSize", "c", "underlyingCurrency", "Companion", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("expirationDate")
    private final String expirationDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("contractSize")
    private final Integer contractSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("underlyingCurrency")
    private final String underlyingCurrency;

    public i(String str, Integer num, String str2) {
        this.expirationDate = str;
        this.contractSize = num;
        this.underlyingCurrency = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getContractSize() {
        return this.contractSize;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getUnderlyingCurrency() {
        return this.underlyingCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.expirationDate, iVar.expirationDate) && Intrinsics.f(this.contractSize, iVar.contractSize) && Intrinsics.f(this.underlyingCurrency, iVar.underlyingCurrency);
    }

    public final int hashCode() {
        String str = this.expirationDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.contractSize;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.underlyingCurrency;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
