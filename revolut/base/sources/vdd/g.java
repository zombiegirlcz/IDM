package vdd;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lvdd/g;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "()Z", "acceptsTopups", "b", "acceptsWithdrawals", "feature_shared_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("acceptsTopups")
    private final boolean acceptsTopups;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("acceptsWithdrawals")
    private final boolean acceptsWithdrawals;

    public g(boolean z, boolean z3) {
        this.acceptsTopups = z;
        this.acceptsWithdrawals = z3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAcceptsTopups() {
        return this.acceptsTopups;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getAcceptsWithdrawals() {
        return this.acceptsWithdrawals;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.acceptsTopups == gVar.acceptsTopups && this.acceptsWithdrawals == gVar.acceptsWithdrawals;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.acceptsWithdrawals) + (Boolean.hashCode(this.acceptsTopups) * 31);
    }
}
