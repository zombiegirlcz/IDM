package azd;

import com.revolut.feature.statements.api.models.StatementPeriod;
import i0e.w;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f11441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StatementPeriod f11442b;

    public d(w periodItems, StatementPeriod statementPeriod) {
        Intrinsics.checkNotNullParameter(periodItems, "periodItems");
        this.f11441a = periodItems;
        this.f11442b = statementPeriod;
    }

    public static d a(d dVar, w periodItems, StatementPeriod statementPeriod, int i) {
        if ((i & 1) != 0) {
            periodItems = dVar.f11441a;
        }
        if ((i & 2) != 0) {
            statementPeriod = dVar.f11442b;
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
        return Intrinsics.f(this.f11441a, dVar.f11441a) && Intrinsics.f(this.f11442b, dVar.f11442b);
    }

    public final int hashCode() {
        int iHashCode = this.f11441a.hashCode() * 31;
        StatementPeriod statementPeriod = this.f11442b;
        return iHashCode + (statementPeriod == null ? 0 : statementPeriod.hashCode());
    }
}
