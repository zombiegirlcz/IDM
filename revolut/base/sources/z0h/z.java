package z0h;

import com.revolut.feature.wealth.api.domain.model.statement.StatementType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class z implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.n f318578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StatementType f318579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hel.b f318580c;

    public z(ybl.n statementFormat, StatementType statementType, hel.b tradingContext) {
        Intrinsics.checkNotNullParameter(statementFormat, "statementFormat");
        Intrinsics.checkNotNullParameter(statementType, "statementType");
        Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
        this.f318578a = statementFormat;
        this.f318579b = statementType;
        this.f318580c = tradingContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return this.f318578a == zVar.f318578a && Intrinsics.f(this.f318579b, zVar.f318579b) && this.f318580c == zVar.f318580c;
    }

    public final int hashCode() {
        return this.f318580c.hashCode() + ((this.f318579b.hashCode() + (this.f318578a.hashCode() * 31)) * 31);
    }
}
