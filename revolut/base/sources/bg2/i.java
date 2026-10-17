package bg2;

import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f15061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransferScheduleData f15063c;
    public final io3.d d;
    public final String e;

    public i(TransferScheduleData scheduleData, dj0.d amount, io3.d pocket, String reference, String str) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f15061a = amount;
        this.f15062b = reference;
        this.f15063c = scheduleData;
        this.d = pocket;
        this.e = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f15061a, iVar.f15061a) && Intrinsics.f(this.f15062b, iVar.f15062b) && Intrinsics.f(this.f15063c, iVar.f15063c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        int iG = h30.l.g(this.d, h30.l.f(this.f15063c, p.a.c(this.f15061a.hashCode() * 31, 31, this.f15062b), 31), 31);
        String str = this.e;
        return iG + (str == null ? 0 : str.hashCode());
    }
}
