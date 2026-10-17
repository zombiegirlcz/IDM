package z0i;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\t\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001a\u0010\u001f\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001eR\u001a\u0010!\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b \u0010\u001eR\u001a\u0010$\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\u0004R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001c\u0010&\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\f\u0010\u0017R\u001c\u0010'\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017R\u001c\u0010+\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010)\u001a\u0004\b\u001c\u0010*¨\u0006,"}, d2 = {"Lz0i/h;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "k", "id", "b", "d", "compoundId", "c", "l", "orderType", "i", "exchangeMode", "e", "g", "currencyPair", "Ljo3/a;", "f", "Ljo3/a;", "()Ljo3/a;", "amount", "n", "targetRate", "", "h", "J", "()J", "createdDate", "o", "updatedDate", "j", "m", "state", "executedRate", "baseExecutedAmount", "counterExecutedAmount", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "errorCode", "feature_exchange_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("compoundId")
    private final String compoundId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("orderType")
    @NotNull
    private final String orderType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("side")
    @NotNull
    private final String exchangeMode;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("currencyPair")
    @NotNull
    private final String currencyPair;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("targetRate")
    @NotNull
    private final String targetRate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    private final long createdDate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("updatedDate")
    private final long updatedDate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("executedRate")
    private final String executedRate;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("baseExecutedAmount")
    private final jo3.a baseExecutedAmount;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("counterExecutedAmount")
    private final jo3.a counterExecutedAmount;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("errorCode")
    private final Integer errorCode;

    public h(String id10, String str, String orderType, String exchangeMode, String currencyPair, jo3.a amount, String targetRate, long j2, long j3, String state, String str2, jo3.a aVar, jo3.a aVar2, Integer num) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(targetRate, "targetRate");
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = id10;
        this.compoundId = str;
        this.orderType = orderType;
        this.exchangeMode = exchangeMode;
        this.currencyPair = currencyPair;
        this.amount = amount;
        this.targetRate = targetRate;
        this.createdDate = j2;
        this.updatedDate = j3;
        this.state = state;
        this.executedRate = str2;
        this.baseExecutedAmount = aVar;
        this.counterExecutedAmount = aVar2;
        this.errorCode = num;
    }

    public static h a(h hVar, String state, String str, jo3.a aVar, jo3.a aVar2, Integer num, int i) {
        String id10 = hVar.id;
        String str2 = hVar.compoundId;
        String orderType = hVar.orderType;
        String exchangeMode = hVar.exchangeMode;
        String currencyPair = hVar.currencyPair;
        jo3.a amount = hVar.amount;
        String targetRate = hVar.targetRate;
        long j2 = hVar.createdDate;
        long j3 = hVar.updatedDate;
        String str3 = (i & 1024) != 0 ? hVar.executedRate : str;
        jo3.a aVar3 = (i & 2048) != 0 ? hVar.baseExecutedAmount : aVar;
        jo3.a aVar4 = (i & 4096) != 0 ? hVar.counterExecutedAmount : aVar2;
        Integer num2 = (i & 8192) != 0 ? hVar.errorCode : num;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(targetRate, "targetRate");
        Intrinsics.checkNotNullParameter(state, "state");
        return new h(id10, str2, orderType, exchangeMode, currencyPair, amount, targetRate, j2, j3, state, str3, aVar3, aVar4, num2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getBaseExecutedAmount() {
        return this.baseExecutedAmount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCompoundId() {
        return this.compoundId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getCounterExecutedAmount() {
        return this.counterExecutedAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.id, hVar.id) && Intrinsics.f(this.compoundId, hVar.compoundId) && Intrinsics.f(this.orderType, hVar.orderType) && Intrinsics.f(this.exchangeMode, hVar.exchangeMode) && Intrinsics.f(this.currencyPair, hVar.currencyPair) && Intrinsics.f(this.amount, hVar.amount) && Intrinsics.f(this.targetRate, hVar.targetRate) && this.createdDate == hVar.createdDate && this.updatedDate == hVar.updatedDate && Intrinsics.f(this.state, hVar.state) && Intrinsics.f(this.executedRate, hVar.executedRate) && Intrinsics.f(this.baseExecutedAmount, hVar.baseExecutedAmount) && Intrinsics.f(this.counterExecutedAmount, hVar.counterExecutedAmount) && Intrinsics.f(this.errorCode, hVar.errorCode);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getCurrencyPair() {
        return this.currencyPair;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.compoundId;
        int iC = p.a.c(a0.d.c(a0.d.c(p.a.c(v7.j(this.amount, p.a.c(p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.orderType), 31, this.exchangeMode), 31, this.currencyPair), 31), 31, this.targetRate), 31, this.createdDate), 31, this.updatedDate), 31, this.state);
        String str2 = this.executedRate;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        jo3.a aVar = this.baseExecutedAmount;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jo3.a aVar2 = this.counterExecutedAmount;
        int iHashCode4 = (iHashCode3 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Integer num = this.errorCode;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getExchangeMode() {
        return this.exchangeMode;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getExecutedRate() {
        return this.executedRate;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getOrderType() {
        return this.orderType;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getTargetRate() {
        return this.targetRate;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final long getUpdatedDate() {
        return this.updatedDate;
    }
}
