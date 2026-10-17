package xei;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004¨\u0006\u0018"}, d2 = {"Lxei/h;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "token", "", "b", "D", "()D", "points", "Lxei/f;", "c", "Lxei/f;", "()Lxei/f;", "discount", "d", "Ljava/lang/Double;", "()Ljava/lang/Double;", "pointsReward", "quoteToken", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("token")
    private final String token;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("points")
    private final double points;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("discount")
    @NotNull
    private final f discount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("pointsReward")
    private final Double pointsReward;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("quoteToken")
    private final String quoteToken;

    public h(String str, double d, f discount, Double d5, String str2) {
        Intrinsics.checkNotNullParameter(discount, "discount");
        this.token = str;
        this.points = d;
        this.discount = discount;
        this.pointsReward = d5;
        this.quoteToken = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final f getDiscount() {
        return this.discount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getPoints() {
        return this.points;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Double getPointsReward() {
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
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.token, hVar.token) && Double.compare(this.points, hVar.points) == 0 && Intrinsics.f(this.discount, hVar.discount) && Intrinsics.f(this.pointsReward, hVar.pointsReward) && Intrinsics.f(this.quoteToken, hVar.quoteToken);
    }

    public final int hashCode() {
        String str = this.token;
        int iHashCode = (this.discount.hashCode() + m72.b.c((str == null ? 0 : str.hashCode()) * 31, this.points, 31)) * 31;
        Double d = this.pointsReward;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.quoteToken;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
