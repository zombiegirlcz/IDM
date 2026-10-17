package ofi;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0005\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0013"}, d2 = {"Lofi/k;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "token", "b", "points", "Ljo3/a;", "c", "Ljo3/a;", "()Ljo3/a;", "discount", "d", "pointsReward", "quoteToken", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

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
    private final jo3.a discount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("pointsReward")
    private final String pointsReward;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("quoteToken")
    private final String quoteToken;

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
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.token, kVar.token) && Intrinsics.f(this.points, kVar.points) && Intrinsics.f(this.discount, kVar.discount) && Intrinsics.f(this.pointsReward, kVar.pointsReward) && Intrinsics.f(this.quoteToken, kVar.quoteToken);
    }

    public final int hashCode() {
        String str = this.token;
        int iJ = v7.j(this.discount, p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.points), 31);
        String str2 = this.pointsReward;
        int iHashCode = (iJ + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.quoteToken;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }
}
