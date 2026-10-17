package e0e;

import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.TaxPeriod;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xxd.b f121569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f121570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StatementPeriod f121571c;
    public final d d;
    public final List e;
    public final TaxPeriod f;

    public e(xxd.b periodState, Set supportedTypes, StatementPeriod draftPeriod, d dVar, List availableTaxYearPeriods, TaxPeriod taxPeriod) {
        Intrinsics.checkNotNullParameter(periodState, "periodState");
        Intrinsics.checkNotNullParameter(supportedTypes, "supportedTypes");
        Intrinsics.checkNotNullParameter(draftPeriod, "draftPeriod");
        Intrinsics.checkNotNullParameter(availableTaxYearPeriods, "availableTaxYearPeriods");
        this.f121569a = periodState;
        this.f121570b = supportedTypes;
        this.f121571c = draftPeriod;
        this.d = dVar;
        this.e = availableTaxYearPeriods;
        this.f = taxPeriod;
    }

    public static e a(e eVar, xxd.b bVar, StatementPeriod statementPeriod, d dVar, int i) {
        if ((i & 1) != 0) {
            bVar = eVar.f121569a;
        }
        xxd.b periodState = bVar;
        Set supportedTypes = eVar.f121570b;
        if ((i & 4) != 0) {
            statementPeriod = eVar.f121571c;
        }
        StatementPeriod draftPeriod = statementPeriod;
        if ((i & 8) != 0) {
            dVar = eVar.d;
        }
        List availableTaxYearPeriods = eVar.e;
        TaxPeriod taxPeriod = eVar.f;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(periodState, "periodState");
        Intrinsics.checkNotNullParameter(supportedTypes, "supportedTypes");
        Intrinsics.checkNotNullParameter(draftPeriod, "draftPeriod");
        Intrinsics.checkNotNullParameter(availableTaxYearPeriods, "availableTaxYearPeriods");
        return new e(periodState, supportedTypes, draftPeriod, dVar, availableTaxYearPeriods, taxPeriod);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f121569a, eVar.f121569a) && Intrinsics.f(this.f121570b, eVar.f121570b) && Intrinsics.f(this.f121571c, eVar.f121571c) && this.d == eVar.d && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f121571c.hashCode() + p.a.f(this.f121569a.hashCode() * 31, 31, this.f121570b)) * 31;
        d dVar = this.d;
        int iD = p.a.d((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.e);
        TaxPeriod taxPeriod = this.f;
        return iD + (taxPeriod != null ? taxPeriod.hashCode() : 0);
    }
}
