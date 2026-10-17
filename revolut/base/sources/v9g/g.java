package v9g;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u0011"}, d2 = {"Lv9g/g;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "points", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "discount", "c", "d", "token", "pointsReward", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("points")
    @NotNull
    private final String points;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("discount")
    @NotNull
    private final jo3.a discount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("token")
    private final String token;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("pointsReward")
    private final String pointsReward;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getDiscount() {
        return this.discount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPoints() {
        return this.points;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPointsReward() {
        return this.pointsReward;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.points, gVar.points) && Intrinsics.f(this.discount, gVar.discount) && Intrinsics.f(this.token, gVar.token) && Intrinsics.f(this.pointsReward, gVar.pointsReward);
    }

    public final int hashCode() {
        int iJ = v7.j(this.discount, this.points.hashCode() * 31, 31);
        String str = this.token;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pointsReward;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
