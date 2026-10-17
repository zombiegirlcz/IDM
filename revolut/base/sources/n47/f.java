package n47;

import com.revolut.feature.statements.api.models.ProductStatementPeriods;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f212313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f212314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProductStatementPeriods f212315c;

    public f(LinkedHashSet currencies, LocalDate minDate, ProductStatementPeriods statementPeriods) {
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(minDate, "minDate");
        Intrinsics.checkNotNullParameter(statementPeriods, "statementPeriods");
        this.f212313a = currencies;
        this.f212314b = minDate;
        this.f212315c = statementPeriods;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f212313a.equals(fVar.f212313a) && Intrinsics.f(this.f212314b, fVar.f212314b) && Intrinsics.f(this.f212315c, fVar.f212315c);
    }

    public final int hashCode() {
        return this.f212315c.hashCode() + y.a(this.f212313a.hashCode() * 31, 31, this.f212314b);
    }
}
