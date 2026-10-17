package orl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 *2\u00020\u0001:\u0001\u0003R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u0015\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0011\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u001f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\"\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\t\u001a\u0004\b!\u0010\u000bR\u001a\u0010#\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\t\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010$\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\t\u001a\u0004\b \u0010\u000bR\u001c\u0010%\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\t\u001a\u0004\b\u0003\u0010\u000bR\u001c\u0010)\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010'\u001a\u0004\b\r\u0010(\u0082\u0001\u0007+,-./01¨\u00062"}, d2 = {"Lorl/o;", "", "Lorl/n;", "a", "Lorl/n;", "b", "()Lorl/n;", "accountType", "", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "id", "c", "e", "compoundId", "", "d", "J", "f", "()J", "createdAt", "m", "updatedAt", "Ljava/lang/Long;", "()Ljava/lang/Long;", "completedAt", "g", "k", "side", "l", "state", "i", "j", "orderType", "currencyPair", "instrumentType", "accountHolderType", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "blocking", "Companion", "Lorl/f;", "Lorl/h;", "Lorl/i;", "Lorl/k;", "Lorl/l;", "Lorl/p;", "Lorl/q;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountType")
    @NotNull
    private final n accountType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("compoundId")
    @NotNull
    private final String compoundId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("createdAt")
    private final long createdAt;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("updatedAt")
    private final long updatedAt;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("completedAt")
    private final Long completedAt;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("side")
    @NotNull
    private final String side;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("orderType")
    @NotNull
    private final String orderType;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("currencyPair")
    @NotNull
    private final String currencyPair;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("instrumentType")
    private final String instrumentType;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountHolderType")
    private final String accountHolderType;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("blocking")
    private final Boolean blocking;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccountHolderType() {
        return this.accountHolderType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final n getAccountType() {
        return this.accountType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getBlocking() {
        return this.blocking;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getCompletedAt() {
        return this.completedAt;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCompoundId() {
        return this.compoundId;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!getClass().equals(obj2 != null ? obj2.getClass() : null)) {
            return false;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.trading.orders.data.network.models.InvestOrderDto");
        o oVar = (o) obj2;
        return Intrinsics.f(this.id, oVar.id) && Intrinsics.f(this.compoundId, oVar.compoundId) && this.createdAt == oVar.createdAt && this.updatedAt == oVar.updatedAt && Intrinsics.f(this.completedAt, oVar.completedAt) && Intrinsics.f(this.side, oVar.side) && Intrinsics.f(this.state, oVar.state) && Intrinsics.f(this.orderType, oVar.orderType) && Intrinsics.f(this.currencyPair, oVar.currencyPair) && Intrinsics.f(this.instrumentType, oVar.instrumentType) && Intrinsics.f(this.accountHolderType, oVar.accountHolderType) && Intrinsics.f(this.blocking, oVar.blocking);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getCurrencyPair() {
        return this.currencyPair;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iC = a0.d.c(a0.d.c(p.a.c(this.id.hashCode() * 31, 31, this.compoundId), 31, this.createdAt), 31, this.updatedAt);
        Long l2 = this.completedAt;
        int iC2 = p.a.c(p.a.c(p.a.c(p.a.c((iC + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 31, 31, this.side), 31, this.state), 31, this.orderType), 31, this.currencyPair);
        String str = this.instrumentType;
        int iHashCode = (iC2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.accountHolderType;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.blocking;
        return iHashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getInstrumentType() {
        return this.instrumentType;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getOrderType() {
        return this.orderType;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getUpdatedAt() {
        return this.updatedAt;
    }
}
