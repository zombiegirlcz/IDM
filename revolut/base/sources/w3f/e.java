package w3f;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001'R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u000b\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0003\u0010\u0019R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u001c\u0010$\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b\u0010\u0010#R\u001c\u0010%\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b\u001d\u0010#¨\u0006("}, d2 = {"Lw3f/e;", "Lw3f/h0;", "", "s", "Ljava/lang/String;", "x", "()Ljava/lang/String;", "side", "t", "clientOrderId", "", "u", "Z", "A", "()Z", "isAutoTopUp", "v", "y", "symbol", "Ldfl/f;", "w", "Ldfl/f;", "()Ldfl/f;", "correctionType", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "amountGuaranteed", "C", "isSpareChange", "z", "B", "isFromIncomeSorter", "localisedDescription", "Lw3f/d;", "Lw3f/d;", "()Lw3f/d;", "fromAccount", "toAccount", "Companion", "a", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e extends h0 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @lg.b("localisedDescription")
    private final String localisedDescription;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @lg.b("fromAccount")
    private final d fromAccount;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @lg.b("toAccount")
    private final d toAccount;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("side")
    @NotNull
    private final String side;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("clientOrderId")
    private final String clientOrderId;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("autoTopup")
    private final boolean isAutoTopUp;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("symbol")
    private final String symbol;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("correctionType")
    private final dfl.f correctionType;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("amountGuaranteed")
    private final Boolean amountGuaranteed;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("spareChange")
    private final Boolean isSpareChange;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @lg.b("fromIncomeSorter")
    private final Boolean isFromIncomeSorter;

    /* JADX INFO: renamed from: A, reason: from getter */
    public final boolean getIsAutoTopUp() {
        return this.isAutoTopUp;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final Boolean getIsFromIncomeSorter() {
        return this.isFromIncomeSorter;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final Boolean getIsSpareChange() {
        return this.isSpareChange;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Boolean getAmountGuaranteed() {
        return this.amountGuaranteed;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getClientOrderId() {
        return this.clientOrderId;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final dfl.f getCorrectionType() {
        return this.correctionType;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final d getFromAccount() {
        return this.fromAccount;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getLocalisedDescription() {
        return this.localisedDescription;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final d getToAccount() {
        return this.toAccount;
    }
}
