package w3f;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 =2\u00020\u0001:\u0001>R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u000e\u0010\u0017R\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u001f\u0010\u0006R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006R\u001c\u0010%\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b$\u0010\fR\u001a\u0010'\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b&\u0010\fR\u001a\u0010)\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\n\u001a\u0004\b(\u0010\fR\u001c\u0010+\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b*\u0010\fR\u001c\u0010-\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b,\u0010\fR\u001a\u00101\u001a\u00020.8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010/\u001a\u0004\b\u0011\u00100R\u001c\u00102\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\n\u001a\u0004\b\t\u0010\fR\u001a\u00104\u001a\u00020.8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010/\u001a\u0004\b3\u00100R\u001c\u00108\u001a\u0004\u0018\u0001058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u00106\u001a\u0004\b!\u00107R\u001a\u00109\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\n\u001a\u0004\b\u0015\u0010\fR\u001c\u0010<\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010:\u001a\u0004\b\u0003\u0010;¨\u0006?"}, d2 = {"Lw3f/d0;", "Lw3f/h0;", "Ljo3/a;", "s", "Ljo3/a;", "A", "()Ljo3/a;", "executedPrice", "", "t", "Ljava/lang/String;", "x", "()Ljava/lang/String;", "estimatedQuantity", "u", "B", "executedQuantity", "v", "y", "estimatedTotal", "Lw3f/g0;", "w", "Lw3f/g0;", "()Lw3f/g0;", "commission", "", "Lw3f/i0;", "Ljava/util/List;", "D", "()Ljava/util/List;", "fees", "E", "gross", "z", "H", "net", "C", "externalId", "I", "side", "K", "symbol", "F", "instrumentName", "G", "instrumentType", "", "Z", "()Z", "confirmed", "clientOrderId", "J", "standing", "Lw3f/r;", "Lw3f/r;", "()Lw3f/r;", "exchangedValue", "currencyPair", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "awaitingSettlement", "Companion", "a", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d0 extends h0 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @lg.b("externalId")
    private final String externalId;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @lg.b("side")
    @NotNull
    private final String side;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @lg.b("symbol")
    @NotNull
    private final String symbol;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @lg.b("instrumentName")
    private final String instrumentName;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @lg.b("instrumentType")
    private final String instrumentType;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @lg.b("confirmed")
    private final boolean confirmed;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @lg.b("clientOrderId")
    private final String clientOrderId;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @lg.b("standing")
    private final boolean standing;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @lg.b("exchangedValue")
    private final r exchangedValue;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @lg.b("currencyPair")
    @NotNull
    private final String currencyPair;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @lg.b("awaitingSettlement")
    private final Boolean awaitingSettlement;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("executedPrice")
    private final jo3.a executedPrice;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("estimatedQuantity")
    private final String estimatedQuantity;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("executedQuantity")
    private final String executedQuantity;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("estimatedTotal")
    private final jo3.a estimatedTotal;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("commission")
    private final g0 commission;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("fees")
    private final List<i0> fees;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("gross")
    private final jo3.a gross;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @lg.b("net")
    private final jo3.a net;

    /* JADX INFO: renamed from: A, reason: from getter */
    public final jo3.a getExecutedPrice() {
        return this.executedPrice;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final String getExecutedQuantity() {
        return this.executedQuantity;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final String getExternalId() {
        return this.externalId;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final List getFees() {
        return this.fees;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final jo3.a getGross() {
        return this.gross;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final String getInstrumentName() {
        return this.instrumentName;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final String getInstrumentType() {
        return this.instrumentType;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final jo3.a getNet() {
        return this.net;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final boolean getStanding() {
        return this.standing;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Boolean getAwaitingSettlement() {
        return this.awaitingSettlement;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getClientOrderId() {
        return this.clientOrderId;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final g0 getCommission() {
        return this.commission;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final boolean getConfirmed() {
        return this.confirmed;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getCurrencyPair() {
        return this.currencyPair;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final String getEstimatedQuantity() {
        return this.estimatedQuantity;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final jo3.a getEstimatedTotal() {
        return this.estimatedTotal;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final r getExchangedValue() {
        return this.exchangedValue;
    }
}
