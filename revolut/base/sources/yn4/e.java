package yn4;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\u0010"}, d2 = {"Lyn4/e;", "Lyn4/l;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getReason", "reason", "Ljo3/a;", "b", "Ljo3/a;", "()Ljo3/a;", "amountToRepay", "c", "utilizationThreshold", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("reason")
    @NotNull
    private final String reason;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("amountToRepay")
    @NotNull
    private final jo3.a amountToRepay;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("utilizationThreshold")
    @NotNull
    private final String utilizationThreshold;

    public e(jo3.a amountToRepay, String utilizationThreshold) {
        Intrinsics.checkNotNullParameter("CC_EXCEEDED_BALANCE_UTILIZATION", "reason");
        Intrinsics.checkNotNullParameter(amountToRepay, "amountToRepay");
        Intrinsics.checkNotNullParameter(utilizationThreshold, "utilizationThreshold");
        this.reason = "CC_EXCEEDED_BALANCE_UTILIZATION";
        this.amountToRepay = amountToRepay;
        this.utilizationThreshold = utilizationThreshold;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmountToRepay() {
        return this.amountToRepay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getUtilizationThreshold() {
        return this.utilizationThreshold;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.reason, eVar.reason) && Intrinsics.f(this.amountToRepay, eVar.amountToRepay) && Intrinsics.f(this.utilizationThreshold, eVar.utilizationThreshold);
    }

    public final int hashCode() {
        return this.utilizationThreshold.hashCode() + v7.j(this.amountToRepay, this.reason.hashCode() * 31, 31);
    }
}
