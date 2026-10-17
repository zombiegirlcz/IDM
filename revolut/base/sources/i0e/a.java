package i0e;

import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.StatementPeriodType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends io3.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StatementPeriodType f157351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StatementPeriod f157352b;

    public a(StatementPeriodType selectedByDefault, StatementPeriod statementPeriod) {
        Intrinsics.checkNotNullParameter(selectedByDefault, "selectedByDefault");
        this.f157351a = selectedByDefault;
        this.f157352b = statementPeriod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f157351a == aVar.f157351a && Intrinsics.f(this.f157352b, aVar.f157352b);
    }

    @Override // io3.h
    public final StatementPeriod f() {
        return this.f157352b;
    }

    public final int hashCode() {
        int iHashCode = this.f157351a.hashCode() * 31;
        StatementPeriod statementPeriod = this.f157352b;
        return iHashCode + (statementPeriod == null ? 0 : statementPeriod.hashCode());
    }
}
