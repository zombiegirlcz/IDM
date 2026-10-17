package qbf;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lqbf/l;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "b", "()Z", "isEligible", "Lqbf/n;", "Lqbf/n;", "()Lqbf/n;", "reason", "feature_trading_add_ons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("isEligible")
    private final boolean isEligible;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("reason")
    private final n reason;

    public l(boolean z, n nVar) {
        this.isEligible = z;
        this.reason = nVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final n getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsEligible() {
        return this.isEligible;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.isEligible == lVar.isEligible && this.reason == lVar.reason;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.isEligible) * 31;
        n nVar = this.reason;
        return iHashCode + (nVar == null ? 0 : nVar.hashCode());
    }
}
