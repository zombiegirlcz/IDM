package bjk;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lbjk/g0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "planId", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "hidden", "Lbjk/h0;", "c", "Lbjk/h0;", "()Lbjk/h0;", "tile", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("planId")
    @NotNull
    private final String planId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("hidden")
    private final Boolean hidden;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("tile")
    private final h0 tile;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getHidden() {
        return this.hidden;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPlanId() {
        return this.planId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final h0 getTile() {
        return this.tile;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.planId, g0Var.planId) && Intrinsics.f(this.hidden, g0Var.hidden) && Intrinsics.f(this.tile, g0Var.tile);
    }

    public final int hashCode() {
        int iHashCode = this.planId.hashCode() * 31;
        Boolean bool = this.hidden;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        h0 h0Var = this.tile;
        return iHashCode2 + (h0Var != null ? h0Var.hashCode() : 0);
    }
}
