package wyd;

import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.navigation.AccountStatementProduct;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountStatementProduct f301258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f301259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f301260c;
    public final StatementPeriod d;

    public p(StatementPeriod statementPeriod, AccountStatementProduct product, Set currencies, boolean z) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        this.f301258a = product;
        this.f301259b = currencies;
        this.f301260c = z;
        this.d = statementPeriod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f301258a, pVar.f301258a) && Intrinsics.f(this.f301259b, pVar.f301259b) && this.f301260c == pVar.f301260c && Intrinsics.f(this.d, pVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.f(this.f301258a.hashCode() * 31, 31, this.f301259b), 31, this.f301260c);
        StatementPeriod statementPeriod = this.d;
        return iC + (statementPeriod == null ? 0 : statementPeriod.hashCode());
    }
}
