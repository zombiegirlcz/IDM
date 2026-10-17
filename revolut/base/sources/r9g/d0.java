package r9g;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0013"}, d2 = {"Lr9g/d0;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "b", "()Ljo3/a;", "points", "discount", "c", "Ljava/lang/String;", "e", "token", "d", "pointsReward", "quoteToken", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("points")
    @NotNull
    private final jo3.a points;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("discount")
    @NotNull
    private final jo3.a discount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("token")
    @NotNull
    private final String token;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("pointsReward")
    @NotNull
    private final jo3.a pointsReward;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("quoteToken")
    private final String quoteToken;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getDiscount() {
        return this.discount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getPoints() {
        return this.points;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getPointsReward() {
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
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.points, d0Var.points) && Intrinsics.f(this.discount, d0Var.discount) && Intrinsics.f(this.token, d0Var.token) && Intrinsics.f(this.pointsReward, d0Var.pointsReward) && Intrinsics.f(this.quoteToken, d0Var.quoteToken);
    }

    public final int hashCode() {
        int iJ = v7.j(this.pointsReward, p.a.c(v7.j(this.discount, this.points.hashCode() * 31, 31), 31, this.token), 31);
        String str = this.quoteToken;
        return iJ + (str == null ? 0 : str.hashCode());
    }
}
