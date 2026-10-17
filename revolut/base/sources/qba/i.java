package qba;

import aii.r;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f244159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f244160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f244161c;
    public final TransferScheduleData d;

    public i(dj0.d amount, String reference, String beneficiaryName, TransferScheduleData scheduleData) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(beneficiaryName, "beneficiaryName");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        this.f244159a = amount;
        this.f244160b = reference;
        this.f244161c = beneficiaryName;
        this.d = scheduleData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f244159a, iVar.f244159a) && Intrinsics.f(this.f244160b, iVar.f244160b) && Intrinsics.f(this.f244161c, iVar.f244161c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f244159a.hashCode() * 31, 31, this.f244160b), 31, this.f244161c);
    }
}
