package vzf;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0013"}, d2 = {"Lvzf/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "points", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "discount", "c", "e", "token", "d", "pointsReward", "quoteToken", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("points")
    @NotNull
    private final String points;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("discount")
    @NotNull
    private final jo3.a discount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("token")
    private final String token;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("pointsReward")
    private final String pointsReward;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @b("quoteToken")
    private final String quoteToken;

    public a(String points, String str, String str2, String str3, jo3.a discount) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(discount, "discount");
        this.points = points;
        this.discount = discount;
        this.token = str;
        this.pointsReward = str2;
        this.quoteToken = str3;
    }

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
    public final String getQuoteToken() {
        return this.quoteToken;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.points, aVar.points) && Intrinsics.f(this.discount, aVar.discount) && Intrinsics.f(this.token, aVar.token) && Intrinsics.f(this.pointsReward, aVar.pointsReward) && Intrinsics.f(this.quoteToken, aVar.quoteToken);
    }

    public final int hashCode() {
        int iJ = v7.j(this.discount, this.points.hashCode() * 31, 31);
        String str = this.token;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pointsReward;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.quoteToken;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
