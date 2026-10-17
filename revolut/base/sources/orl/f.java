package orl;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000  2\u00020\u0001:\u0001!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u0003\u0010\u001e¨\u0006\""}, d2 = {"Lorl/f;", "Lorl/o;", "Ljo3/a;", "n", "Ljo3/a;", "u", "()Ljo3/a;", "thresholdPrice", "o", "v", "value", "p", "estimatedNet", "q", "gross", "", "r", "Ljava/lang/String;", "()Ljava/lang/String;", "executedQuantity", "", "s", "Ljava/lang/Long;", "t", "()Ljava/lang/Long;", "startDate", "period", "scheduledExecutionDate", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "errorCode", "Companion", "a", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f extends o {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("thresholdPrice")
    private final jo3.a thresholdPrice;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("value")
    @NotNull
    private final jo3.a value;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("estimatedNet")
    private final jo3.a estimatedNet;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("gross")
    private final jo3.a gross;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("executedQuantity")
    private final String executedQuantity;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("startDate")
    private final Long startDate;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("period")
    private final String period;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("scheduledExecutionDate")
    private final Long scheduledExecutionDate;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("errorCode")
    private final Integer errorCode;

    @Override // orl.o
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!f.class.equals(obj2 != null ? obj2.getClass() : null) || !super.equals(obj2)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.trading.orders.data.network.models.InvestCommodityOrderDto");
        f fVar = (f) obj2;
        return Intrinsics.f(this.startDate, fVar.startDate) && Intrinsics.f(this.scheduledExecutionDate, fVar.scheduledExecutionDate) && Intrinsics.f(this.errorCode, fVar.errorCode) && Intrinsics.f(this.thresholdPrice, fVar.thresholdPrice) && Intrinsics.f(this.value, fVar.value) && Intrinsics.f(this.estimatedNet, fVar.estimatedNet) && Intrinsics.f(this.gross, fVar.gross) && Intrinsics.f(this.executedQuantity, fVar.executedQuantity) && Intrinsics.f(this.period, fVar.period);
    }

    @Override // orl.o
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Long l2 = this.startDate;
        int iHashCode2 = (iHashCode + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 31;
        Long l3 = this.scheduledExecutionDate;
        int iHashCode3 = (iHashCode2 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 31;
        Integer num = this.errorCode;
        int iIntValue = (iHashCode3 + (num != null ? num.intValue() : 0)) * 31;
        jo3.a aVar = this.thresholdPrice;
        int iJ = v7.j(this.value, (iIntValue + (aVar != null ? aVar.hashCode() : 0)) * 31, 31);
        jo3.a aVar2 = this.estimatedNet;
        int iHashCode4 = (iJ + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        jo3.a aVar3 = this.gross;
        int iHashCode5 = (iHashCode4 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31;
        String str = this.executedQuantity;
        int iHashCode6 = (iHashCode5 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.period;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final jo3.a getEstimatedNet() {
        return this.estimatedNet;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getExecutedQuantity() {
        return this.executedQuantity;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final jo3.a getGross() {
        return this.gross;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Long getScheduledExecutionDate() {
        return this.scheduledExecutionDate;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Long getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final jo3.a getThresholdPrice() {
        return this.thresholdPrice;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final jo3.a getValue() {
        return this.value;
    }
}
