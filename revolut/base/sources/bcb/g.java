package bcb;

import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dcb.b f14429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferScheduleData f14430b;

    public g(dcb.b input, TransferScheduleData transferScheduleData) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f14429a = input;
        this.f14430b = transferScheduleData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f14429a, gVar.f14429a) && Intrinsics.f(this.f14430b, gVar.f14430b);
    }

    public final int hashCode() {
        int iHashCode = this.f14429a.hashCode() * 31;
        TransferScheduleData transferScheduleData = this.f14430b;
        return iHashCode + (transferScheduleData == null ? 0 : transferScheduleData.hashCode());
    }
}
