package z0h;

import com.revolut.feature.wealth.api.domain.model.statement.StatementType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class r0 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.n f318554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StatementType f318555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hel.b f318556c;

    public r0(ybl.n statementFormat, StatementType statementType, hel.b tradingContext) {
        Intrinsics.checkNotNullParameter(statementFormat, "statementFormat");
        Intrinsics.checkNotNullParameter(statementType, "statementType");
        Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
        this.f318554a = statementFormat;
        this.f318555b = statementType;
        this.f318556c = tradingContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return this.f318554a == r0Var.f318554a && Intrinsics.f(this.f318555b, r0Var.f318555b) && this.f318556c == r0Var.f318556c;
    }

    public final int hashCode() {
        return this.f318556c.hashCode() + ((this.f318555b.hashCode() + (this.f318554a.hashCode() * 31)) * 31);
    }
}
