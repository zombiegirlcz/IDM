package c1b;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.retail.advanced_charts.models.AdvancedChartSymbol;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdvancedChartSymbol f20438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f20439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f20440c;

    public j(AdvancedChartSymbol symbol, BigDecimal price, Clause clause) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f20438a = symbol;
        this.f20439b = price;
        this.f20440c = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f20438a, jVar.f20438a) && Intrinsics.f(this.f20439b, jVar.f20439b) && this.f20440c.equals(jVar.f20440c);
    }

    public final int hashCode() {
        return this.f20440c.hashCode() + t61.a.d(this.f20439b, this.f20438a.hashCode() * 31, 31);
    }
}
