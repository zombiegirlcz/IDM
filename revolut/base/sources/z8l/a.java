package z8l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lz8l/a;", "", "", "toString", "()Ljava/lang/String;", "Libl/d;", "a", "Libl/d;", "getReason", "()Libl/d;", "reason", "Libl/a;", "b", "Libl/a;", "getFundingSource", "()Libl/a;", "fundingSource", "feature_shared_payments_money_request_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("reason")
    private final ibl.d reason;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("fundingSource")
    private final ibl.a fundingSource;

    public a(ibl.d dVar, ibl.a aVar) {
        this.reason = dVar;
        this.fundingSource = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.reason, aVar.reason) && Intrinsics.f(this.fundingSource, aVar.fundingSource);
    }

    public final int hashCode() {
        ibl.d dVar = this.reason;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        ibl.a aVar = this.fundingSource;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }
}
