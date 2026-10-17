package z0h;

import com.revolut.feature.wealth.api.domain.model.statement.StatementType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class u implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StatementType f318565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hel.b f318566b;

    public u(StatementType statementType, hel.b tradingContext) {
        Intrinsics.checkNotNullParameter(statementType, "statementType");
        Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
        this.f318565a = statementType;
        this.f318566b = tradingContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f318565a, uVar.f318565a) && this.f318566b == uVar.f318566b;
    }

    public final int hashCode() {
        return this.f318566b.hashCode() + (this.f318565a.hashCode() * 31);
    }
}
