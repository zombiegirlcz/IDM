package mn1;

import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferScheduleData f207344a;

    public l(TransferScheduleData scheduleData) {
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        this.f207344a = scheduleData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f207344a, ((l) obj2).f207344a);
    }

    public final int hashCode() {
        return this.f207344a.hashCode();
    }
}
