package xo4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\bR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0011\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001f"}, d2 = {"Lxo4/a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "()J", "amountAvailable", "b", "amountSpent", "c", "d", "monthlySpendingLimit", "Ljava/lang/String;", "currency", "e", "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "singlePurchaseLimitAmount", "", "Z", "()Z", "purchaseRestrictionsEnabled", "", "g", "I", "()I", "spendingProgression", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("amountAvailable")
    private final long amountAvailable;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("amountSpent")
    private final long amountSpent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("monthlySpendingLimit")
    private final long monthlySpendingLimit;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("singlePurchaseLimitAmount")
    private final Long singlePurchaseLimitAmount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("purchaseRestrictionsEnabled")
    private final boolean purchaseRestrictionsEnabled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("spendingProgression")
    private final int spendingProgression;

    public a(long j2, long j3, long j5, String currency, Long l2, boolean z, int i) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.amountAvailable = j2;
        this.amountSpent = j3;
        this.monthlySpendingLimit = j5;
        this.currency = currency;
        this.singlePurchaseLimitAmount = l2;
        this.purchaseRestrictionsEnabled = z;
        this.spendingProgression = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getAmountAvailable() {
        return this.amountAvailable;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getAmountSpent() {
        return this.amountSpent;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getMonthlySpendingLimit() {
        return this.monthlySpendingLimit;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getPurchaseRestrictionsEnabled() {
        return this.purchaseRestrictionsEnabled;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.amountAvailable == aVar.amountAvailable && this.amountSpent == aVar.amountSpent && this.monthlySpendingLimit == aVar.monthlySpendingLimit && Intrinsics.f(this.currency, aVar.currency) && Intrinsics.f(this.singlePurchaseLimitAmount, aVar.singlePurchaseLimitAmount) && this.purchaseRestrictionsEnabled == aVar.purchaseRestrictionsEnabled && this.spendingProgression == aVar.spendingProgression;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getSinglePurchaseLimitAmount() {
        return this.singlePurchaseLimitAmount;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getSpendingProgression() {
        return this.spendingProgression;
    }

    public final int hashCode() {
        int iC = p.a.c(a0.d.c(a0.d.c(Long.hashCode(this.amountAvailable) * 31, 31, this.amountSpent), 31, this.monthlySpendingLimit), 31, this.currency);
        Long l2 = this.singlePurchaseLimitAmount;
        return Integer.hashCode(this.spendingProgression) + j6.a.c((iC + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.purchaseRestrictionsEnabled);
    }
}
