package du6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\t\u0010\u0011¨\u0006\u0013"}, d2 = {"Ldu6/g;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "d", "moneyBoxId", "e", "state", "automaticAllocation", "", "Ljava/lang/Float;", "()Ljava/lang/Float;", "fixedAllocationRate", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("moneyBoxId")
    @NotNull
    private final String moneyBoxId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("automaticAllocation")
    @NotNull
    private final String automaticAllocation;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("fixedAllocationRate")
    private final Float fixedAllocationRate;

    public g(String id10, String moneyBoxId, String state, String automaticAllocation, Float f) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(moneyBoxId, "moneyBoxId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(automaticAllocation, "automaticAllocation");
        this.id = id10;
        this.moneyBoxId = moneyBoxId;
        this.state = state;
        this.automaticAllocation = automaticAllocation;
        this.fixedAllocationRate = f;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAutomaticAllocation() {
        return this.automaticAllocation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Float getFixedAllocationRate() {
        return this.fixedAllocationRate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMoneyBoxId() {
        return this.moneyBoxId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.id, gVar.id) && Intrinsics.f(this.moneyBoxId, gVar.moneyBoxId) && Intrinsics.f(this.state, gVar.state) && Intrinsics.f(this.automaticAllocation, gVar.automaticAllocation) && Intrinsics.f(this.fixedAllocationRate, gVar.fixedAllocationRate);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.moneyBoxId), 31, this.state), 31, this.automaticAllocation);
        Float f = this.fixedAllocationRate;
        return iC + (f == null ? 0 : f.hashCode());
    }
}
