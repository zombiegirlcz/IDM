package v4k;

import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferScheduleData f286123a;

    public c(TransferScheduleData scheduleData) {
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        this.f286123a = scheduleData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f286123a, ((c) obj2).f286123a);
    }

    public final int hashCode() {
        return this.f286123a.hashCode();
    }
}
