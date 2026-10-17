package w3f;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001&R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0003\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006R\u001a\u0010\u001d\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0013\u0010\u001cR\u001a\u0010!\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\b\u0010 R\u001c\u0010$\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b\u001a\u0010#¨\u0006'"}, d2 = {"Lw3f/s;", "Lw3f/h0;", "", "s", "Ljava/lang/String;", "A", "()Ljava/lang/String;", "symbol", "t", "z", "side", "u", "v", "executedQuantity", "Lko3/a;", "Lko3/a;", "()Lko3/a;", "executedPrice", "Lw3f/g0;", "w", "Lw3f/g0;", "()Lw3f/g0;", "commission", "x", "leverage", "Ljo3/a;", "y", "Ljo3/a;", "()Ljo3/a;", "exposure", "", "Z", "()Z", "confirmed", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "liquidation", "Companion", "a", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s extends h0 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @lg.b("liquidation")
    private final Boolean liquidation;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("symbol")
    @NotNull
    private final String symbol;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("side")
    @NotNull
    private final String side;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("executedQuantity")
    private final String executedQuantity;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("executedPrice")
    private final ko3.a executedPrice;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("commission")
    private final g0 commission;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("leverage")
    @NotNull
    private final String leverage;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("exposure")
    @NotNull
    private final jo3.a exposure;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @lg.b("confirmed")
    private final boolean confirmed;

    /* JADX INFO: renamed from: A, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final g0 getCommission() {
        return this.commission;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getConfirmed() {
        return this.confirmed;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final ko3.a getExecutedPrice() {
        return this.executedPrice;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final String getExecutedQuantity() {
        return this.executedQuantity;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final jo3.a getExposure() {
        return this.exposure;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final String getLeverage() {
        return this.leverage;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final Boolean getLiquidation() {
        return this.liquidation;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final String getSide() {
        return this.side;
    }
}
