package z0h;

import com.revolut.feature.wealth.api.domain.model.statement.StatementType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.n f318536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f318537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StatementType f318538c;

    public n(ybl.n statementFormat, b footerVariant, StatementType statementType) {
        Intrinsics.checkNotNullParameter(statementFormat, "statementFormat");
        Intrinsics.checkNotNullParameter(footerVariant, "footerVariant");
        Intrinsics.checkNotNullParameter(statementType, "statementType");
        this.f318536a = statementFormat;
        this.f318537b = footerVariant;
        this.f318538c = statementType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f318536a == nVar.f318536a && this.f318537b == nVar.f318537b && Intrinsics.f(this.f318538c, nVar.f318538c);
    }

    public final int hashCode() {
        return this.f318538c.hashCode() + ((this.f318537b.hashCode() + (this.f318536a.hashCode() * 31)) * 31);
    }
}
