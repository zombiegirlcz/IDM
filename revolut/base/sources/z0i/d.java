package z0i;

import ip0.v7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0005\u0010\rR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Lz0i/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "exchangeMode", "b", "currencyPair", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "amount", "", "Lz0i/c;", "d", "Ljava/util/List;", "()Ljava/util/List;", "orders", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("side")
    @NotNull
    private final String exchangeMode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("currencyPair")
    @NotNull
    private final String currencyPair;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("orders")
    @NotNull
    private final List<c> orders;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrencyPair() {
        return this.currencyPair;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getExchangeMode() {
        return this.exchangeMode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getOrders() {
        return this.orders;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.exchangeMode, dVar.exchangeMode) && Intrinsics.f(this.currencyPair, dVar.currencyPair) && Intrinsics.f(this.amount, dVar.amount) && Intrinsics.f(this.orders, dVar.orders);
    }

    public final int hashCode() {
        return this.orders.hashCode() + v7.j(this.amount, p.a.c(this.exchangeMode.hashCode() * 31, 31, this.currencyPair), 31);
    }
}
