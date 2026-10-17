package lfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Llfj/m;", "", "", "toString", "()Ljava/lang/String;", "Llfj/k;", "a", "Llfj/k;", "getDonorDetails", "()Llfj/k;", "donorDetails", "Llfj/l;", "b", "Llfj/l;", "getPreferredSchedule", "()Llfj/l;", "preferredSchedule", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("donorDetails")
    @NotNull
    private final k donorDetails;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("preferredSchedule")
    @NotNull
    private final l preferredSchedule;

    public m(k donorDetails, l preferredSchedule) {
        Intrinsics.checkNotNullParameter(donorDetails, "donorDetails");
        Intrinsics.checkNotNullParameter(preferredSchedule, "preferredSchedule");
        this.donorDetails = donorDetails;
        this.preferredSchedule = preferredSchedule;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.donorDetails, mVar.donorDetails) && Intrinsics.f(this.preferredSchedule, mVar.preferredSchedule);
    }

    public final int hashCode() {
        return this.preferredSchedule.hashCode() + (this.donorDetails.hashCode() * 31);
    }
}
