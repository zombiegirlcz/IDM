package a9g;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0005\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0013"}, d2 = {"La9g/d2;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "token", "b", "points", "Ljo3/b;", "c", "Ljo3/b;", "()Ljo3/b;", "discount", "d", "pointsReward", "quoteToken", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("token")
    private final String token;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("points")
    @NotNull
    private final String points;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("discount")
    @NotNull
    private final jo3.b discount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("pointsReward")
    private final String pointsReward;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("quoteToken")
    private final String quoteToken;

    public d2(String str, String points, String str2, String str3, jo3.b discount) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(discount, "discount");
        this.token = str;
        this.points = points;
        this.discount = discount;
        this.pointsReward = str2;
        this.quoteToken = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.b getDiscount() {
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
        if (!(obj2 instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj2;
        return Intrinsics.f(this.token, d2Var.token) && Intrinsics.f(this.points, d2Var.points) && Intrinsics.f(this.discount, d2Var.discount) && Intrinsics.f(this.pointsReward, d2Var.pointsReward) && Intrinsics.f(this.quoteToken, d2Var.quoteToken);
    }

    public final int hashCode() {
        String str = this.token;
        int iE = wp5.y.e(this.discount, p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.points), 31);
        String str2 = this.pointsReward;
        int iHashCode = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.quoteToken;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }
}
