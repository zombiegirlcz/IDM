package krl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\b\u0018\u0000 !2\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0010\u0010\tR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u001c\u0010 \u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u0006\u0010\u001f¨\u0006\""}, d2 = {"Lkrl/b;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/b;", "a", "Ljo3/b;", "h", "()Ljo3/b;", "thresholdPrice", "b", "i", "value", "c", "estimatedNet", "d", "gross", "e", "Ljava/lang/String;", "executedQuantity", "", "f", "Ljava/lang/Long;", "g", "()Ljava/lang/Long;", "startDate", "period", "scheduledExecutionDate", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "errorCode", "Companion", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("thresholdPrice")
    private final jo3.b thresholdPrice;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    @NotNull
    private final jo3.b value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("estimatedNet")
    private final jo3.b estimatedNet;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("gross")
    private final jo3.b gross;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("executedQuantity")
    private final String executedQuantity;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("startDate")
    private final Long startDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("period")
    private final String period;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("scheduledExecutionDate")
    private final Long scheduledExecutionDate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("errorCode")
    private final Integer errorCode;

    public b(jo3.b bVar, jo3.b value, jo3.b bVar2, jo3.b bVar3, String str, Long l2, String str2, Long l3, Integer num) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.thresholdPrice = bVar;
        this.value = value;
        this.estimatedNet = bVar2;
        this.gross = bVar3;
        this.executedQuantity = str;
        this.startDate = l2;
        this.period = str2;
        this.scheduledExecutionDate = l3;
        this.errorCode = num;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.b getEstimatedNet() {
        return this.estimatedNet;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getExecutedQuantity() {
        return this.executedQuantity;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.b getGross() {
        return this.gross;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.thresholdPrice, bVar.thresholdPrice) && Intrinsics.f(this.value, bVar.value) && Intrinsics.f(this.estimatedNet, bVar.estimatedNet) && Intrinsics.f(this.gross, bVar.gross) && Intrinsics.f(this.executedQuantity, bVar.executedQuantity) && Intrinsics.f(this.startDate, bVar.startDate) && Intrinsics.f(this.period, bVar.period) && Intrinsics.f(this.scheduledExecutionDate, bVar.scheduledExecutionDate) && Intrinsics.f(this.errorCode, bVar.errorCode);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getScheduledExecutionDate() {
        return this.scheduledExecutionDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final jo3.b getThresholdPrice() {
        return this.thresholdPrice;
    }

    public final int hashCode() {
        jo3.b bVar = this.thresholdPrice;
        int iE = y.e(this.value, (bVar == null ? 0 : bVar.hashCode()) * 31, 31);
        jo3.b bVar2 = this.estimatedNet;
        int iHashCode = (iE + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        jo3.b bVar3 = this.gross;
        int iHashCode2 = (iHashCode + (bVar3 == null ? 0 : bVar3.hashCode())) * 31;
        String str = this.executedQuantity;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.startDate;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.period;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l3 = this.scheduledExecutionDate;
        int iHashCode6 = (iHashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Integer num = this.errorCode;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final jo3.b getValue() {
        return this.value;
    }
}
