package dpf;

import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferScheduleData f116876a;

    public b(TransferScheduleData scheduleData) {
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        this.f116876a = scheduleData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f116876a, ((b) obj2).f116876a);
    }

    public final int hashCode() {
        return this.f116876a.hashCode();
    }
}
