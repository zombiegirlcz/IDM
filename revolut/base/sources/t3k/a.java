package t3k;

import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f267814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f267815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f267816c;
    public final xi0.b d;
    public final e3k.d e;
    public final TransferScheduleData f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m1l.a f267817g;

    public a(long j2, long j3, xi0.b targetCurrency, xi0.b sourceCurrency, e3k.d routeData, TransferScheduleData scheduledData, m1l.a scheduledMode) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(routeData, "routeData");
        Intrinsics.checkNotNullParameter(scheduledData, "scheduledData");
        Intrinsics.checkNotNullParameter(scheduledMode, "scheduledMode");
        this.f267814a = j2;
        this.f267815b = j3;
        this.f267816c = targetCurrency;
        this.d = sourceCurrency;
        this.e = routeData;
        this.f = scheduledData;
        this.f267817g = scheduledMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f267814a == aVar.f267814a && this.f267815b == aVar.f267815b && Intrinsics.f(this.f267816c, aVar.f267816c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && this.f267817g == aVar.f267817g;
    }

    public final int hashCode() {
        return this.f267817g.hashCode() + l.f(this.f, (this.e.hashCode() + l.j(this.d, l.j(this.f267816c, a0.d.c(Long.hashCode(this.f267814a) * 31, 31, this.f267815b), 31), 31)) * 31, 31);
    }
}
