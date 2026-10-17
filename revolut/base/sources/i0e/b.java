package i0e;

import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.StatementPeriodType;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends io3.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f157355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StatementPeriod f157356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StatementPeriodType f157357c;

    public b(Set types, StatementPeriod statementPeriod, StatementPeriodType statementPeriodType, int i) {
        statementPeriod = (i & 2) != 0 ? null : statementPeriod;
        statementPeriodType = (i & 4) != 0 ? null : statementPeriodType;
        Intrinsics.checkNotNullParameter(types, "types");
        this.f157355a = types;
        this.f157356b = statementPeriod;
        this.f157357c = statementPeriodType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f157355a, bVar.f157355a) && Intrinsics.f(this.f157356b, bVar.f157356b) && this.f157357c == bVar.f157357c;
    }

    @Override // io3.h
    public final StatementPeriod f() {
        return this.f157356b;
    }

    public final int hashCode() {
        int iHashCode = this.f157355a.hashCode() * 31;
        StatementPeriod statementPeriod = this.f157356b;
        int iHashCode2 = (iHashCode + (statementPeriod == null ? 0 : statementPeriod.hashCode())) * 31;
        StatementPeriodType statementPeriodType = this.f157357c;
        return iHashCode2 + (statementPeriodType != null ? statementPeriodType.hashCode() : 0);
    }
}
