package cu5;

import jo3.b;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import wp5.y;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f108813c;
    public final b d;
    public final DateTime e;
    public final ko3.b f;

    public a(String type, String currency, String baseCurrency, b investment, DateTime lastTransactionDate, ko3.b averagePrice) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(investment, "investment");
        Intrinsics.checkNotNullParameter(lastTransactionDate, "lastTransactionDate");
        Intrinsics.checkNotNullParameter(averagePrice, "averagePrice");
        this.f108811a = type;
        this.f108812b = currency;
        this.f108813c = baseCurrency;
        this.d = investment;
        this.e = lastTransactionDate;
        this.f = averagePrice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f108811a, aVar.f108811a) && Intrinsics.f(this.f108812b, aVar.f108812b) && Intrinsics.f(this.f108813c, aVar.f108813c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + m72.b.f(this.e, y.e(this.d, p.a.c(p.a.c(this.f108811a.hashCode() * 31, 31, this.f108812b), 31, this.f108813c), 31), 31);
    }
}
