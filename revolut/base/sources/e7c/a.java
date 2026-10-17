package e7c;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Le7c/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getPocketId", "pocketId", "Le7c/g0;", "b", "Le7c/g0;", "getRevPointsRedemption", "()Le7c/g0;", "revPointsRedemption", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("pocketId")
    private final String pocketId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("revPointsRedemption")
    private final g0 revPointsRedemption;

    public a(String str, g0 g0Var) {
        this.pocketId = str;
        this.revPointsRedemption = g0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.pocketId, aVar.pocketId) && Intrinsics.f(this.revPointsRedemption, aVar.revPointsRedemption);
    }

    public final int hashCode() {
        String str = this.pocketId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        g0 g0Var = this.revPointsRedemption;
        return iHashCode + (g0Var != null ? g0Var.hashCode() : 0);
    }
}
