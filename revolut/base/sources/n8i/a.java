package n8i;

import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f213399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferScheduleData f213400b;

    public a(boolean z, TransferScheduleData scheduleData) {
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        this.f213399a = z;
        this.f213400b = scheduleData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f213399a == aVar.f213399a && Intrinsics.f(this.f213400b, aVar.f213400b);
    }

    public final int hashCode() {
        return this.f213400b.hashCode() + j6.a.c(Boolean.hashCode(this.f213399a) * 31, 31, false);
    }
}
