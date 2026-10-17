package n8i;

import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s6i.e f213439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferScheduleData f213440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f213441c;
    public final x5i.e d;

    public k(s6i.e transferData, TransferScheduleData scheduleData, boolean z, x5i.e eVar) {
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        this.f213439a = transferData;
        this.f213440b = scheduleData;
        this.f213441c = z;
        this.d = eVar;
    }

    public static k a(k kVar, s6i.e transferData, TransferScheduleData scheduleData, boolean z, x5i.e eVar, int i) {
        if ((i & 1) != 0) {
            transferData = kVar.f213439a;
        }
        if ((i & 2) != 0) {
            scheduleData = kVar.f213440b;
        }
        if ((i & 4) != 0) {
            z = kVar.f213441c;
        }
        if ((i & 8) != 0) {
            eVar = kVar.d;
        }
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        return new k(transferData, scheduleData, z, eVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f213439a, kVar.f213439a) && Intrinsics.f(this.f213440b, kVar.f213440b) && this.f213441c == kVar.f213441c && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(h30.l.f(this.f213440b, this.f213439a.hashCode() * 31, 31), 31, this.f213441c);
        x5i.e eVar = this.d;
        return iC + (eVar == null ? 0 : eVar.hashCode());
    }
}
