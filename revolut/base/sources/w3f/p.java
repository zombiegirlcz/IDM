package w3f;

import com.revolut.shared.feature.wealth.models.transaction.FeeType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001&R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u0003\u0010\fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\t\u0010\u0018R\u001a\u0010\u001b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u001e\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0018R\u001c\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b\u0011\u0010!R\u001c\u0010#\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u001c\u0010\fR\u001c\u0010$\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u001a\u0010\f¨\u0006'"}, d2 = {"Lw3f/p;", "Lw3f/h0;", "Lcom/revolut/shared/feature/wealth/models/transaction/FeeType;", "s", "Lcom/revolut/shared/feature/wealth/models/transaction/FeeType;", "w", "()Lcom/revolut/shared/feature/wealth/models/transaction/FeeType;", "feeType", "", "t", "Ljava/lang/String;", "B", "()Ljava/lang/String;", "transactionId", "u", "assetType", "", "v", "Ljava/lang/Long;", "A", "()Ljava/lang/Long;", "startedAt", "", "Z", "()Z", "autoTopup", "x", "description", "y", "z", "spareChange", "Lw3f/r;", "Lw3f/r;", "()Lw3f/r;", "exchangedValue", "rate", "forMonth", "Companion", "a", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends h0 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @lg.b("rate")
    private final String rate;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @lg.b("forMonth")
    private final String forMonth;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("feeType")
    private final FeeType feeType;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactionId")
    @NotNull
    private final String transactionId;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("assetType")
    @NotNull
    private final String assetType;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("startedAt")
    private final Long startedAt;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("autoTopup")
    private final boolean autoTopup;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("spareChange")
    private final boolean spareChange;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @lg.b("exchangedValue")
    private final r exchangedValue;

    /* JADX INFO: renamed from: A, reason: from getter */
    public final Long getStartedAt() {
        return this.startedAt;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getAssetType() {
        return this.assetType;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getAutoTopup() {
        return this.autoTopup;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final r getExchangedValue() {
        return this.exchangedValue;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final FeeType getFeeType() {
        return this.feeType;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final String getForMonth() {
        return this.forMonth;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getRate() {
        return this.rate;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final boolean getSpareChange() {
        return this.spareChange;
    }
}
