package w3f;

import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000 :2\u00020\u0001:\u0001\u0003R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u001a\u0010\u0018\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0011\u0010\u001cR\u001a\u0010#\u001a\u00020\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010%\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b$\u0010\u001cR\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0004\u001a\u0004\b'\u0010\u0006R\u001c\u0010-\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\b\u0010,R\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b*\u0010\u0006R\u001c\u00102\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u00100\u001a\u0004\b\u000e\u00101R\u001c\u00103\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u00100\u001a\u0004\b\u0019\u00101R\u001c\u00104\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006R\u001c\u00108\u001a\u0004\u0018\u0001058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u00106\u001a\u0004\b&\u00107R\u001c\u00109\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006¨\u0006;"}, d2 = {"Lw3f/h0;", "", "", "a", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "id", "b", "f", "compoundId", "c", "m", "ref", "d", "i", "holdingId", "e", "p", "state", "", "J", "h", "()J", "createdAt", "g", "Ljava/lang/Long;", "q", "()Ljava/lang/Long;", "updatedAt", "completedAt", "Lw3f/r;", "Lw3f/r;", "r", "()Lw3f/r;", "value", "n", "settlementDate", "k", "o", "standingOrderId", "Lcom/revolut/shared/feature/wealth/models/account/WealthAccountType;", "l", "Lcom/revolut/shared/feature/wealth/models/account/WealthAccountType;", "()Lcom/revolut/shared/feature/wealth/models/account/WealthAccountType;", "accountType", "portfolioId", "Lw3f/j0;", "Lw3f/j0;", "()Lw3f/j0;", "baseInstrument", "counterInstrument", "badge", "Lw3f/q;", "Lw3f/q;", "()Lw3f/q;", "initiatedBy", "accountHolderType", "Companion", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("compoundId")
    private final String compoundId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("ref")
    @NotNull
    private final String ref;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("holdingId")
    @NotNull
    private final String holdingId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("createdAt")
    private final long createdAt;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("updatedAt")
    private final Long updatedAt;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("completedAt")
    private final Long completedAt;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("value")
    @NotNull
    private final r value;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("settlementDate")
    private final Long settlementDate;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("standingOrderId")
    private final String standingOrderId;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountType")
    private final WealthAccountType accountType;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("portfolioId")
    private final String portfolioId;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("baseInstrument")
    private final j0 baseInstrument;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("counterInstrument")
    private final j0 counterInstrument;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("badge")
    private final String badge;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("initiatedBy")
    private final q initiatedBy;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountHolderType")
    private final String accountHolderType;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccountHolderType() {
        return this.accountHolderType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final WealthAccountType getAccountType() {
        return this.accountType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBadge() {
        return this.badge;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final j0 getBaseInstrument() {
        return this.baseInstrument;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getCompletedAt() {
        return this.completedAt;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCompoundId() {
        return this.compoundId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final j0 getCounterInstrument() {
        return this.counterInstrument;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getHoldingId() {
        return this.holdingId;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final q getInitiatedBy() {
        return this.initiatedBy;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getPortfolioId() {
        return this.portfolioId;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getRef() {
        return this.ref;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Long getSettlementDate() {
        return this.settlementDate;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getStandingOrderId() {
        return this.standingOrderId;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Long getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final r getValue() {
        return this.value;
    }
}
