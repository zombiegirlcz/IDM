package e5k;

import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f122822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f122823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f122824c;
    public final xi0.b d;
    public final kq2.f e;
    public final TransferScheduleData f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m1l.a f122825g;

    public a(long j2, long j3, xi0.b targetCurrency, xi0.b sourceCurrency, kq2.f fVar, TransferScheduleData scheduledData, m1l.a scheduledMode) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(scheduledData, "scheduledData");
        Intrinsics.checkNotNullParameter(scheduledMode, "scheduledMode");
        this.f122822a = j2;
        this.f122823b = j3;
        this.f122824c = targetCurrency;
        this.d = sourceCurrency;
        this.e = fVar;
        this.f = scheduledData;
        this.f122825g = scheduledMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f122822a == aVar.f122822a && this.f122823b == aVar.f122823b && Intrinsics.f(this.f122824c, aVar.f122824c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && this.f122825g == aVar.f122825g;
    }

    public final int hashCode() {
        int iJ = l.j(this.d, l.j(this.f122824c, a0.d.c(Long.hashCode(this.f122822a) * 31, 31, this.f122823b), 31), 31);
        kq2.f fVar = this.e;
        return this.f122825g.hashCode() + l.f(this.f, (iJ + (fVar == null ? 0 : fVar.hashCode())) * 31, 31);
    }
}
