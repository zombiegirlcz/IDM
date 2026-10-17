package s8k;

import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f261062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferScheduleData f261063b;

    public f(dj0.d money, TransferScheduleData scheduleData) {
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        this.f261062a = money;
        this.f261063b = scheduleData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f261062a, fVar.f261062a) && Intrinsics.f(this.f261063b, fVar.f261063b);
    }

    public final int hashCode() {
        return this.f261063b.hashCode() + (this.f261062a.hashCode() * 31);
    }
}
