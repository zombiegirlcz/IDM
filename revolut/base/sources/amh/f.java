package amh;

import com.revolut.feature.wealth.api.domain.model.statement.StatementProduct;
import com.revolut.feature.wealth.api.domain.model.statement.StatementType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StatementProduct f6398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StatementType f6399b;

    public f(StatementProduct product, StatementType statementType) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(statementType, "statementType");
        this.f6398a = product;
        this.f6399b = statementType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f6398a, fVar.f6398a) && Intrinsics.f(this.f6399b, fVar.f6399b);
    }

    public final int hashCode() {
        return this.f6399b.hashCode() + (this.f6398a.hashCode() * 31);
    }
}
