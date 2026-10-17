package ar9;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0006\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001d"}, d2 = {"Lar9/f;", "", "", "toString", "()Ljava/lang/String;", "Lar9/g;", "a", "Lar9/g;", "b", "()Lar9/g;", "calculationType", "Lar9/h;", "Lar9/h;", "f", "()Lar9/h;", "state", "", "c", "J", "()J", "amount", "d", "Ljava/lang/String;", "currencyCode", "e", "Ljava/lang/Long;", "()Ljava/lang/Long;", "oweAmount", "owedAmount", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("calculationType")
    @NotNull
    private final g calculationType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final h state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final long amount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("currencyCode")
    @NotNull
    private final String currencyCode;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("oweAmount")
    private final Long oweAmount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("owedAmount")
    private final Long owedAmount;

    public f(g calculationType, h state, long j2, String currencyCode, Long l2, Long l3) {
        Intrinsics.checkNotNullParameter(calculationType, "calculationType");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.calculationType = calculationType;
        this.state = state;
        this.amount = j2;
        this.currencyCode = currencyCode;
        this.oweAmount = l2;
        this.owedAmount = l3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final g getCalculationType() {
        return this.calculationType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getOweAmount() {
        return this.oweAmount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getOwedAmount() {
        return this.owedAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.calculationType == fVar.calculationType && this.state == fVar.state && this.amount == fVar.amount && Intrinsics.f(this.currencyCode, fVar.currencyCode) && Intrinsics.f(this.oweAmount, fVar.oweAmount) && Intrinsics.f(this.owedAmount, fVar.owedAmount);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final h getState() {
        return this.state;
    }

    public final int hashCode() {
        int iC = p.a.c(a0.d.c((this.state.hashCode() + (this.calculationType.hashCode() * 31)) * 31, 31, this.amount), 31, this.currencyCode);
        Long l2 = this.oweAmount;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.owedAmount;
        return iHashCode + (l3 != null ? l3.hashCode() : 0);
    }
}
