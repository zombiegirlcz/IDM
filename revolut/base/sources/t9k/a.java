package t9k;

import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f269043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f269044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f269045c;
    public final FundingSource d;
    public final hrf.c e;
    public final TransferScheduleData f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m1l.a f269046g;

    public a(long j2, long j3, xi0.b targetCurrency, FundingSource fundingSource, hrf.c cVar, TransferScheduleData scheduleData, m1l.a scheduleMode) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        Intrinsics.checkNotNullParameter(scheduleMode, "scheduleMode");
        this.f269043a = j2;
        this.f269044b = j3;
        this.f269045c = targetCurrency;
        this.d = fundingSource;
        this.e = cVar;
        this.f = scheduleData;
        this.f269046g = scheduleMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f269043a == aVar.f269043a && this.f269044b == aVar.f269044b && Intrinsics.f(this.f269045c, aVar.f269045c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && this.f269046g == aVar.f269046g;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + l.j(this.f269045c, a0.d.c(Long.hashCode(this.f269043a) * 31, 31, this.f269044b), 31)) * 31;
        hrf.c cVar = this.e;
        return this.f269046g.hashCode() + l.f(this.f, (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31, 31);
    }
}
