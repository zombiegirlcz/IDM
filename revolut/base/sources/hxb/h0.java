package hxb;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\f\u0010\u0014¨\u0006\u0016"}, d2 = {"Lhxb/h0;", "", "", "toString", "()Ljava/lang/String;", "Lhxb/i0;", "a", "Lhxb/i0;", "d", "()Lhxb/i0;", "rate", "Lhxb/g0;", "b", "Lhxb/g0;", "()Lhxb/g0;", "amount", "c", "fee", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "earningCurrencyAmount", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("rate")
    @NotNull
    private final i0 rate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final g0 amount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("fee")
    private final g0 fee;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("earningCurrencyAmount")
    private final jo3.a earningCurrencyAmount;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final g0 getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getEarningCurrencyAmount() {
        return this.earningCurrencyAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g0 getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final i0 getRate() {
        return this.rate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.rate, h0Var.rate) && Intrinsics.f(this.amount, h0Var.amount) && Intrinsics.f(this.fee, h0Var.fee) && Intrinsics.f(this.earningCurrencyAmount, h0Var.earningCurrencyAmount);
    }

    public final int hashCode() {
        int iHashCode = this.rate.hashCode() * 31;
        g0 g0Var = this.amount;
        int iHashCode2 = (iHashCode + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
        g0 g0Var2 = this.fee;
        int iHashCode3 = (iHashCode2 + (g0Var2 == null ? 0 : g0Var2.hashCode())) * 31;
        jo3.a aVar = this.earningCurrencyAmount;
        return iHashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }
}
