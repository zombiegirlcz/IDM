package n3f;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001a\u0010\u001e\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010$\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b\f\u0010#R\u001c\u0010'\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b\u001f\u0010&¨\u0006("}, d2 = {"Ln3f/q;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "j", "symbol", "b", "i", "side", "c", "e", "executedQuantity", "Lko3/b;", "d", "Lko3/b;", "()Lko3/b;", "executedPrice", "Ln3f/b0;", "Ln3f/b0;", "()Ln3f/b0;", "commission", "f", "g", "leverage", "Ljo3/b;", "Ljo3/b;", "()Ljo3/b;", "exposure", "h", "compoundId", "", "Z", "()Z", "confirmed", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "liquidation", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("symbol")
    @NotNull
    private final String symbol;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("side")
    @NotNull
    private final String side;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("executedQuantity")
    private final String executedQuantity;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("executedPrice")
    private final ko3.b executedPrice;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("commission")
    private final b0 commission;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("leverage")
    @NotNull
    private final String leverage;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("exposure")
    @NotNull
    private final jo3.b exposure;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("compoundId")
    private final String compoundId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("confirmed")
    private final boolean confirmed;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("liquidation")
    private final Boolean liquidation;

    public q(String symbol, String side, String str, ko3.b bVar, b0 b0Var, String leverage, jo3.b exposure, String str2, boolean z, Boolean bool) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        Intrinsics.checkNotNullParameter(exposure, "exposure");
        this.symbol = symbol;
        this.side = side;
        this.executedQuantity = str;
        this.executedPrice = bVar;
        this.commission = b0Var;
        this.leverage = leverage;
        this.exposure = exposure;
        this.compoundId = str2;
        this.confirmed = z;
        this.liquidation = bool;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b0 getCommission() {
        return this.commission;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCompoundId() {
        return this.compoundId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getConfirmed() {
        return this.confirmed;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ko3.b getExecutedPrice() {
        return this.executedPrice;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getExecutedQuantity() {
        return this.executedQuantity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.symbol, qVar.symbol) && Intrinsics.f(this.side, qVar.side) && Intrinsics.f(this.executedQuantity, qVar.executedQuantity) && Intrinsics.f(this.executedPrice, qVar.executedPrice) && Intrinsics.f(this.commission, qVar.commission) && Intrinsics.f(this.leverage, qVar.leverage) && Intrinsics.f(this.exposure, qVar.exposure) && Intrinsics.f(this.compoundId, qVar.compoundId) && this.confirmed == qVar.confirmed && Intrinsics.f(this.liquidation, qVar.liquidation);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jo3.b getExposure() {
        return this.exposure;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getLeverage() {
        return this.leverage;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Boolean getLiquidation() {
        return this.liquidation;
    }

    public final int hashCode() {
        int iC = p.a.c(this.symbol.hashCode() * 31, 31, this.side);
        String str = this.executedQuantity;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        ko3.b bVar = this.executedPrice;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b0 b0Var = this.commission;
        int iE = wp5.y.e(this.exposure, p.a.c((iHashCode2 + (b0Var == null ? 0 : b0Var.hashCode())) * 31, 31, this.leverage), 31);
        String str2 = this.compoundId;
        int iC2 = j6.a.c((iE + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.confirmed);
        Boolean bool = this.liquidation;
        return iC2 + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }
}
