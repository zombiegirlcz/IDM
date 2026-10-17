package p0e;

import com.revolut.feature.statements.api.models.StatementPeriod;
import i0e.w;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f231512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StatementPeriod f231513b;

    public d(w periodItems, StatementPeriod statementPeriod) {
        Intrinsics.checkNotNullParameter(periodItems, "periodItems");
        this.f231512a = periodItems;
        this.f231513b = statementPeriod;
    }

    public static d a(d dVar, w periodItems, StatementPeriod statementPeriod, int i) {
        if ((i & 1) != 0) {
            periodItems = dVar.f231512a;
        }
        if ((i & 2) != 0) {
            statementPeriod = dVar.f231513b;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(periodItems, "periodItems");
        return new d(periodItems, statementPeriod);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f231512a, dVar.f231512a) && Intrinsics.f(this.f231513b, dVar.f231513b);
    }

    public final int hashCode() {
        int iHashCode = this.f231512a.hashCode() * 31;
        StatementPeriod statementPeriod = this.f231513b;
        return iHashCode + (statementPeriod == null ? 0 : statementPeriod.hashCode());
    }
}
