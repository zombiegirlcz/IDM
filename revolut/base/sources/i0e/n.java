package i0e;

import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.StatementPeriodType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StatementPeriodType f157374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StatementPeriod f157375b;

    public n(StatementPeriodType statementPeriodType, StatementPeriod statementPeriod) {
        this.f157374a = statementPeriodType;
        this.f157375b = statementPeriod;
    }

    public static n a(n nVar, StatementPeriod statementPeriod) {
        StatementPeriodType statementPeriodType = nVar.f157374a;
        nVar.getClass();
        return new n(statementPeriodType, statementPeriod);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f157374a == nVar.f157374a && Intrinsics.f(this.f157375b, nVar.f157375b);
    }

    public final int hashCode() {
        StatementPeriodType statementPeriodType = this.f157374a;
        int iHashCode = (statementPeriodType == null ? 0 : statementPeriodType.hashCode()) * 31;
        StatementPeriod statementPeriod = this.f157375b;
        return iHashCode + (statementPeriod != null ? statementPeriod.hashCode() : 0);
    }
}
