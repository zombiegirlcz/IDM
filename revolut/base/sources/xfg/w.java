package xfg;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, d2 = {"Lxfg/w;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "pointsToMilesRate", "Ljo3/a;", "b", "Ljo3/a;", "()Ljo3/a;", "fee", "Lxfg/v;", "Lxfg/v;", "()Lxfg/v;", "display", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("pointsToMilesRate")
    @NotNull
    private final String pointsToMilesRate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("fee")
    @NotNull
    private final jo3.a fee;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("display")
    @NotNull
    private final v display;

    public w(String pointsToMilesRate, jo3.a fee2, v display) {
        Intrinsics.checkNotNullParameter(pointsToMilesRate, "pointsToMilesRate");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        Intrinsics.checkNotNullParameter(display, "display");
        this.pointsToMilesRate = pointsToMilesRate;
        this.fee = fee2;
        this.display = display;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final v getDisplay() {
        return this.display;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPointsToMilesRate() {
        return this.pointsToMilesRate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.pointsToMilesRate, wVar.pointsToMilesRate) && Intrinsics.f(this.fee, wVar.fee) && Intrinsics.f(this.display, wVar.display);
    }

    public final int hashCode() {
        return this.display.hashCode() + v7.j(this.fee, this.pointsToMilesRate.hashCode() * 31, 31);
    }
}
