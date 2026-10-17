package gu5;

import a0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015¨\u0006\u0017"}, d2 = {"Lgu5/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "currency", "Ljo3/a;", "Ljo3/a;", "c", "()Ljo3/a;", "investment", "", "J", "d", "()J", "lastTransactionDate", "Lko3/a;", "Lko3/a;", "()Lko3/a;", "averagePrice", "feature_crypto_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("positionCurrency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("investment")
    @NotNull
    private final jo3.a investment;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastTransactionDate")
    private final long lastTransactionDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("averagePrice")
    @NotNull
    private final ko3.a averagePrice;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ko3.a getAveragePrice() {
        return this.averagePrice;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getInvestment() {
        return this.investment;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getLastTransactionDate() {
        return this.lastTransactionDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.currency, bVar.currency) && Intrinsics.f(this.investment, bVar.investment) && this.lastTransactionDate == bVar.lastTransactionDate && Intrinsics.f(this.averagePrice, bVar.averagePrice);
    }

    public final int hashCode() {
        return this.averagePrice.hashCode() + d.c(v7.j(this.investment, this.currency.hashCode() * 31, 31), 31, this.lastTransactionDate);
    }
}
