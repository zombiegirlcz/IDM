package nw0;

import com.revolut.core.ui_kit.models.MoneyClause;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f219751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MoneyClause f219752b;

    public a(BigDecimal bigDecimal, MoneyClause priceClause) {
        Intrinsics.checkNotNullParameter(priceClause, "priceClause");
        this.f219751a = bigDecimal;
        this.f219752b = priceClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f219751a, aVar.f219751a) && Intrinsics.f(this.f219752b, aVar.f219752b);
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.f219751a;
        return this.f219752b.hashCode() + ((bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31);
    }
}
