package xo4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0005\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\f\u0010\u001bR\u001c\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010&\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010$\u001a\u0004\b\u001e\u0010%¨\u0006'"}, d2 = {"Lxo4/n;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "pocketId", "b", "currency", "", "c", "J", "()J", "balance", "d", "e", "minimum", "maximum", "", "f", "I", "()I", "missedRepaymentDaysThreshold", "", "Z", "()Z", "hasSpendingLimit", "Lxo4/a0;", "h", "Lxo4/a0;", "i", "()Lxo4/a0;", "withdrawalAvailability", "Lxo4/x;", "Lxo4/x;", "()Lxo4/x;", "securityCoverage", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("pocketId")
    @NotNull
    private final String pocketId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("balance")
    private final long balance;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("minimum")
    private final long minimum;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("maximum")
    private final long maximum;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("missedRepaymentDaysThreshold")
    private final int missedRepaymentDaysThreshold;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("hasSpendingLimit")
    private final boolean hasSpendingLimit;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("withdrawalAvailability")
    private final a0 withdrawalAvailability;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("securityCoverage")
    private final x securityCoverage;

    public n(String pocketId, String currency, long j2, long j3, long j5, int i, boolean z, a0 a0Var, x xVar) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.pocketId = pocketId;
        this.currency = currency;
        this.balance = j2;
        this.minimum = j3;
        this.maximum = j5;
        this.missedRepaymentDaysThreshold = i;
        this.hasSpendingLimit = z;
        this.withdrawalAvailability = a0Var;
        this.securityCoverage = xVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getBalance() {
        return this.balance;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getHasSpendingLimit() {
        return this.hasSpendingLimit;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getMaximum() {
        return this.maximum;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getMinimum() {
        return this.minimum;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.pocketId, nVar.pocketId) && Intrinsics.f(this.currency, nVar.currency) && this.balance == nVar.balance && this.minimum == nVar.minimum && this.maximum == nVar.maximum && this.missedRepaymentDaysThreshold == nVar.missedRepaymentDaysThreshold && this.hasSpendingLimit == nVar.hasSpendingLimit && Intrinsics.f(this.withdrawalAvailability, nVar.withdrawalAvailability) && this.securityCoverage == nVar.securityCoverage;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getMissedRepaymentDaysThreshold() {
        return this.missedRepaymentDaysThreshold;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPocketId() {
        return this.pocketId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final x getSecurityCoverage() {
        return this.securityCoverage;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.b(this.missedRepaymentDaysThreshold, a0.d.c(a0.d.c(a0.d.c(p.a.c(this.pocketId.hashCode() * 31, 31, this.currency), 31, this.balance), 31, this.minimum), 31, this.maximum), 31), 31, this.hasSpendingLimit);
        a0 a0Var = this.withdrawalAvailability;
        int iHashCode = (iC + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        x xVar = this.securityCoverage;
        return iHashCode + (xVar != null ? xVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final a0 getWithdrawalAvailability() {
        return this.withdrawalAvailability;
    }
}
