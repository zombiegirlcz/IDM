package l12;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements yqi.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f191416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r02.d f191417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f191418c;
    public final dj0.d d;

    public b(dj0.d limit, r02.d period, Long l2, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(limit, "limit");
        Intrinsics.checkNotNullParameter(period, "period");
        this.f191416a = limit;
        this.f191417b = period;
        this.f191418c = l2;
        this.d = dVar;
    }

    @Override // yqi.b
    public final Clause a() {
        int i;
        int i2 = a.f191415a[this.f191417b.ordinal()];
        if (i2 == 1) {
            i = R$string.apm_transfer_amount_error_daily_limit;
        } else if (i2 == 2) {
            i = R$string.apm_transfer_amount_error_monthly_limit;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = com.revolut.feature.transfer.shared_core.R$string.transfer_error_amount_maximum_amount;
        }
        return new TextLocalisedClause(i, u.c(new MoneyClause(this.f191416a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, 12);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f191416a, bVar.f191416a) && this.f191417b == bVar.f191417b && Intrinsics.f(this.f191418c, bVar.f191418c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f191417b.hashCode() + (this.f191416a.hashCode() * 31)) * 31;
        Long l2 = this.f191418c;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        dj0.d dVar = this.d;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }
}
