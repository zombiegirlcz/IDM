package w3f;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lw3f/f0;", "Lw3f/h0;", "", "s", "Ljava/lang/String;", "t", "()Ljava/lang/String;", "side", "u", "symbol", "executedQuantity", "Lw3f/l0;", "v", "Lw3f/l0;", "()Lw3f/l0;", "transferRequestDetails", "Companion", "a", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f0 extends h0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("side")
    @NotNull
    private final String side;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("symbol")
    @NotNull
    private final String symbol;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("executedQuantity")
    @NotNull
    private final String executedQuantity;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("transferRequestDetails")
    private final l0 transferRequestDetails;

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getExecutedQuantity() {
        return this.executedQuantity;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final l0 getTransferRequestDetails() {
        return this.transferRequestDetails;
    }
}
