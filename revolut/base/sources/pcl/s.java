package pcl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000b\u0010\u000e¨\u0006\u0011"}, d2 = {"Lpcl/s;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/b;", "a", "Ljo3/b;", "()Ljo3/b;", "marketCap", "", "b", "Ljava/lang/Long;", "c", "()Ljava/lang/Long;", "sharesOutstanding", "sharesFloat", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("marketCap")
    private final jo3.b marketCap;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("sharesOutstanding")
    private final Long sharesOutstanding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("sharesFloat")
    private final Long sharesFloat;

    public s(jo3.b bVar, Long l2, Long l3) {
        this.marketCap = bVar;
        this.sharesOutstanding = l2;
        this.sharesFloat = l3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.b getMarketCap() {
        return this.marketCap;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getSharesFloat() {
        return this.sharesFloat;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getSharesOutstanding() {
        return this.sharesOutstanding;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.marketCap, sVar.marketCap) && Intrinsics.f(this.sharesOutstanding, sVar.sharesOutstanding) && Intrinsics.f(this.sharesFloat, sVar.sharesFloat);
    }

    public final int hashCode() {
        jo3.b bVar = this.marketCap;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        Long l2 = this.sharesOutstanding;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.sharesFloat;
        return iHashCode2 + (l3 != null ? l3.hashCode() : 0);
    }
}
