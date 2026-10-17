package e5k;

import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.transfer.core.models.PocketSource;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import java.time.LocalDateTime;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import z1k.p;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements yqi.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f122827b;

    public b(l80.e dateProvider, int i) {
        this.f122826a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                this.f122827b = dateProvider;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                this.f122827b = dateProvider;
                break;
            default:
                Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                this.f122827b = dateProvider;
                break;
        }
    }

    public yqi.d a(a validationData) {
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        TransferScheduleData transferScheduleData = validationData.f;
        kq2.f fVar = validationData.e;
        if (n1l.b.d(transferScheduleData, ((l80.f) this.f122827b).f()) || validationData.f122825g == m1l.a.SCHEDULE_REQUIRED) {
            yqi.d.Companion.getClass();
            return yqi.c.a(validationData);
        }
        xi0.b bVar = validationData.f122824c;
        xi0.b bVar2 = validationData.d;
        long j2 = validationData.f122823b;
        double d = fVar != null ? fVar.f188305g : 1.0d;
        long j3 = Intrinsics.f(bVar2, bVar) ? j2 : (fVar == null || (dVar = fVar.f188302a) == null) ? 0L : dVar.f115082a;
        if (j3 == 0) {
            j3 = pyd.c.K(new dj0.d(j2, bVar), d, bVar2).f115082a;
        }
        if (j3 > validationData.f122822a) {
            return new yqi.d(validationData, d5k.b.f111422a);
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }

    public yqi.d b(t3k.a validationData) {
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        TransferScheduleData transferScheduleData = validationData.f;
        e3k.d dVar = validationData.e;
        if (n1l.b.d(transferScheduleData, ((l80.f) this.f122827b).f()) || validationData.f267817g == m1l.a.SCHEDULE_REQUIRED) {
            yqi.d.Companion.getClass();
            return yqi.c.a(validationData);
        }
        if (!(dVar instanceof e3k.b)) {
            if (!(dVar instanceof e3k.c)) {
                throw new NoWhenBranchMatchedException();
            }
            yqi.d.Companion.getClass();
            return yqi.c.a(validationData);
        }
        p pVar = ((e3k.b) dVar).f122336a;
        xi0.b bVar = validationData.f267816c;
        xi0.b bVar2 = validationData.d;
        long j2 = validationData.f267815b;
        double d = pVar.f318887c.f213663c;
        long j3 = Intrinsics.f(bVar2, bVar) ? j2 : pVar.f318885a.f318862a;
        dj0.d dVarO = gj7.b.o(dVar);
        long j5 = j3 + (dVarO != null ? dVarO.f115082a : 0L);
        if (j5 == 0) {
            j5 = pyd.c.K(new dj0.d(j2, bVar), d, bVar2).f115082a;
        }
        if (j5 > validationData.f267814a) {
            return new yqi.d(validationData, s3k.a.f259705a);
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }

    public yqi.d c(t9k.a validationData) {
        io3.d dVar;
        Long l2;
        Intrinsics.checkNotNullParameter(validationData, "validationData");
        LocalDateTime localDateTimeF = ((l80.f) this.f122827b).f();
        TransferScheduleData transferScheduleData = validationData.f;
        FundingSource fundingSource = validationData.d;
        if (n1l.b.d(transferScheduleData, localDateTimeF) || validationData.f269046g == m1l.a.SCHEDULE_REQUIRED) {
            yqi.d.Companion.getClass();
            return yqi.c.a(validationData);
        }
        xi0.b bVar = fundingSource.f92241b;
        xi0.b bVar2 = validationData.f269045c;
        long j2 = validationData.f269044b;
        boolean zF = Intrinsics.f(bVar2, bVar);
        hrf.c cVar = validationData.e;
        if (cVar instanceof hrf.a) {
            if (zF && uj3.b.p(bVar2)) {
                Amount amount = ((hrf.a) cVar).f154810a.d;
                if (amount != null) {
                    j2 = a.a.L(amount).f115082a;
                }
            } else if (!zF) {
                j2 = a.a.L(((hrf.a) cVar).f154810a.f104754c).f115082a;
            }
        } else if (cVar instanceof hrf.b) {
            j2 = ((hrf.b) cVar).f154811a.f218628l.f115082a;
        } else if (cVar != null) {
            throw new NoWhenBranchMatchedException();
        }
        long j3 = validationData.f269043a;
        PocketSource pocketSource = fundingSource instanceof PocketSource ? (PocketSource) fundingSource : null;
        long jAbs = (pocketSource == null || (dVar = pocketSource.d) == null || (l2 = dVar.f163152m) == null) ? 0L : Math.abs(l2.longValue());
        if (j2 > j3 && j2 <= j3 + jAbs) {
            return new yqi.d(validationData, s9k.a.f261195a);
        }
        if (j2 > j3 + jAbs) {
            return new yqi.d(validationData, s9k.b.f261196a);
        }
        yqi.d.Companion.getClass();
        return yqi.c.a(validationData);
    }

    @Override // yqi.f
    public final /* bridge */ /* synthetic */ yqi.d validate(Object obj2) {
        switch (this.f122826a) {
            case 0:
                return a((a) obj2);
            case 1:
                return b((t3k.a) obj2);
            default:
                return c((t9k.a) obj2);
        }
    }
}
