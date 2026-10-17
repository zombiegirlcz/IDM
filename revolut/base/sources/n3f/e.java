package n3f;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u001c\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010 \u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001e\u001a\u0004\b\u001a\u0010\u001f¨\u0006!"}, d2 = {"Ln3f/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "compoundId", "b", "f", "side", "c", "currencyPair", "Ljo3/b;", "d", "Ljo3/b;", "()Ljo3/b;", "net", "e", "h", "total", "Ln3f/p;", "Ln3f/p;", "i", "()Ln3f/p;", "tradedValue", "g", "price", "pocketId", "", "Z", "()Z", "standing", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("compoundId")
    @NotNull
    private final String compoundId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("side")
    @NotNull
    private final String side;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("currencyPair")
    @NotNull
    private final String currencyPair;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("net")
    @NotNull
    private final jo3.b net;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("total")
    @NotNull
    private final jo3.b total;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("tradedValue")
    private final p tradedValue;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("price")
    @NotNull
    private final jo3.b price;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("pocketId")
    @NotNull
    private final String pocketId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("standing")
    private final boolean standing;

    public e(String compoundId, String side, String currencyPair, jo3.b net2, jo3.b total, p pVar, jo3.b price, String pocketId, boolean z) {
        Intrinsics.checkNotNullParameter(compoundId, "compoundId");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        Intrinsics.checkNotNullParameter(net2, "net");
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.compoundId = compoundId;
        this.side = side;
        this.currencyPair = currencyPair;
        this.net = net2;
        this.total = total;
        this.tradedValue = pVar;
        this.price = price;
        this.pocketId = pocketId;
        this.standing = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCompoundId() {
        return this.compoundId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrencyPair() {
        return this.currencyPair;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.b getNet() {
        return this.net;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPocketId() {
        return this.pocketId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.b getPrice() {
        return this.price;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.compoundId, eVar.compoundId) && Intrinsics.f(this.side, eVar.side) && Intrinsics.f(this.currencyPair, eVar.currencyPair) && Intrinsics.f(this.net, eVar.net) && Intrinsics.f(this.total, eVar.total) && Intrinsics.f(this.tradedValue, eVar.tradedValue) && Intrinsics.f(this.price, eVar.price) && Intrinsics.f(this.pocketId, eVar.pocketId) && this.standing == eVar.standing;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getStanding() {
        return this.standing;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final jo3.b getTotal() {
        return this.total;
    }

    public final int hashCode() {
        int iE = wp5.y.e(this.total, wp5.y.e(this.net, p.a.c(p.a.c(this.compoundId.hashCode() * 31, 31, this.side), 31, this.currencyPair), 31), 31);
        p pVar = this.tradedValue;
        return Boolean.hashCode(this.standing) + p.a.c(wp5.y.e(this.price, (iE + (pVar == null ? 0 : pVar.hashCode())) * 31, 31), 31, this.pocketId);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final p getTradedValue() {
        return this.tradedValue;
    }
}
