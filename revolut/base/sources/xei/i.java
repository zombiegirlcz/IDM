package xei;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u000f"}, d2 = {"Lxei/i;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "pointsReward", "Ljo3/b;", "b", "Ljo3/b;", "()Ljo3/b;", "cashAmount", "booster", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("pointsReward")
    @NotNull
    private final String pointsReward;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("cashAmount")
    @NotNull
    private final jo3.b cashAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("booster")
    private final String booster;

    public i(String pointsReward, String str, jo3.b cashAmount) {
        Intrinsics.checkNotNullParameter(pointsReward, "pointsReward");
        Intrinsics.checkNotNullParameter(cashAmount, "cashAmount");
        this.pointsReward = pointsReward;
        this.cashAmount = cashAmount;
        this.booster = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBooster() {
        return this.booster;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.b getCashAmount() {
        return this.cashAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPointsReward() {
        return this.pointsReward;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.pointsReward, iVar.pointsReward) && Intrinsics.f(this.cashAmount, iVar.cashAmount) && Intrinsics.f(this.booster, iVar.booster);
    }

    public final int hashCode() {
        int iE = y.e(this.cashAmount, this.pointsReward.hashCode() * 31, 31);
        String str = this.booster;
        return iE + (str == null ? 0 : str.hashCode());
    }
}
