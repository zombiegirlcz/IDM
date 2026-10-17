package xo4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u001b\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010 \u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001aR\u001c\u0010%\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010'\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0019\u001a\u0004\b&\u0010\u001aR\u001a\u0010*\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010\u001aR\u001a\u00100\u001a\u00020+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00102\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001a\u00104\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b3\u0010\u001aR\u001c\u00105\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b,\u0010$R\u001c\u00107\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010\"\u001a\u0004\b1\u0010$R\u001c\u0010:\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u00108\u001a\u0004\b\n\u00109R\u001c\u0010>\u001a\u0004\u0018\u00010;8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010<\u001a\u0004\b6\u0010=R\u001c\u0010B\u001a\u0004\u0018\u00010?8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010@\u001a\u0004\b\u0005\u0010AR\u001a\u0010C\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\u001e\u0010\u001aR\u001c\u0010G\u001a\u0004\u0018\u00010D8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010E\u001a\u0004\b\u0012\u0010FR\u001a\u0010K\u001a\u00020H8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010I\u001a\u0004\b(\u0010JR\u001a\u0010O\u001a\u00020L8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010M\u001a\u0004\b!\u0010N¨\u0006P"}, d2 = {"Lxo4/p;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "facilityId", "Lxo4/q;", "b", "Lxo4/q;", "t", "()Lxo4/q;", "state", "c", "n", "pocketId", "d", "w", "walletId", "e", "cardId", "", "f", "J", "()J", "currentDate", "v", "statementDate", "h", "r", "remainingBalance", "i", "Ljava/lang/Long;", "o", "()Ljava/lang/Long;", "previousStatementDate", "j", "minimumRepayment", "k", "s", "repaymentDueDate", "", "l", "D", "q", "()D", "purchasesInterestRate", "m", "currencyCode", "u", "statementBalance", "paymentOverdueAmount", "p", "paymentOverdueDate", "Ljava/lang/Double;", "()Ljava/lang/Double;", "apr", "Lxo4/w;", "Lxo4/w;", "()Lxo4/w;", "promotionalPeriod", "Lxo4/f;", "Lxo4/f;", "()Lxo4/f;", "administrationFeeInfo", "firstDate", "Lxo4/g;", "Lxo4/g;", "()Lxo4/g;", "cashbackBalance", "Ljo3/b;", "Ljo3/b;", "()Ljo3/b;", "ongoingStatementBalance", "", "Z", "()Z", "hideMinimumRepayment", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("facilityId")
    @NotNull
    private final String facilityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final q state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("pocketId")
    @NotNull
    private final String pocketId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("walletId")
    @NotNull
    private final String walletId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("cardId")
    private final String cardId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("currentDate")
    private final long currentDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("statementDate")
    private final long statementDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("remainingBalance")
    private final long remainingBalance;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("previousStatementDate")
    private final Long previousStatementDate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("minimumRepayment")
    private final long minimumRepayment;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("repaymentDueDate")
    private final long repaymentDueDate;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("purchasesInterestRate")
    private final double purchasesInterestRate;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("currencyCode")
    @NotNull
    private final String currencyCode;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("statementBalance")
    private final long statementBalance;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("paymentOverdueAmount")
    private final Long paymentOverdueAmount;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentOverdueDate")
    private final Long paymentOverdueDate;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("apr")
    private final Double apr;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("promotionalPeriod")
    private final w promotionalPeriod;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("administrationFeeInfo")
    private final f administrationFeeInfo;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("firstDate")
    private final long firstDate;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("cashbackBalance")
    private final g cashbackBalance;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("ongoingStatementBalance")
    @NotNull
    private final jo3.b ongoingStatementBalance;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("hideMinimumRepayment")
    private final boolean hideMinimumRepayment;

    public p(String facilityId, q state, String pocketId, String walletId, String str, long j2, long j3, long j5, Long l2, long j16, long j22, double d, String currencyCode, long j42, Long l3, Long l4, Double d5, w wVar, f fVar, long j46, g gVar, jo3.b ongoingStatementBalance, boolean z) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(ongoingStatementBalance, "ongoingStatementBalance");
        this.facilityId = facilityId;
        this.state = state;
        this.pocketId = pocketId;
        this.walletId = walletId;
        this.cardId = str;
        this.currentDate = j2;
        this.statementDate = j3;
        this.remainingBalance = j5;
        this.previousStatementDate = l2;
        this.minimumRepayment = j16;
        this.repaymentDueDate = j22;
        this.purchasesInterestRate = d;
        this.currencyCode = currencyCode;
        this.statementBalance = j42;
        this.paymentOverdueAmount = l3;
        this.paymentOverdueDate = l4;
        this.apr = d5;
        this.promotionalPeriod = wVar;
        this.administrationFeeInfo = fVar;
        this.firstDate = j46;
        this.cashbackBalance = gVar;
        this.ongoingStatementBalance = ongoingStatementBalance;
        this.hideMinimumRepayment = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final f getAdministrationFeeInfo() {
        return this.administrationFeeInfo;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getApr() {
        return this.apr;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final g getCashbackBalance() {
        return this.cashbackBalance;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.facilityId, pVar.facilityId) && this.state == pVar.state && Intrinsics.f(this.pocketId, pVar.pocketId) && Intrinsics.f(this.walletId, pVar.walletId) && Intrinsics.f(this.cardId, pVar.cardId) && this.currentDate == pVar.currentDate && this.statementDate == pVar.statementDate && this.remainingBalance == pVar.remainingBalance && Intrinsics.f(this.previousStatementDate, pVar.previousStatementDate) && this.minimumRepayment == pVar.minimumRepayment && this.repaymentDueDate == pVar.repaymentDueDate && Double.compare(this.purchasesInterestRate, pVar.purchasesInterestRate) == 0 && Intrinsics.f(this.currencyCode, pVar.currencyCode) && this.statementBalance == pVar.statementBalance && Intrinsics.f(this.paymentOverdueAmount, pVar.paymentOverdueAmount) && Intrinsics.f(this.paymentOverdueDate, pVar.paymentOverdueDate) && Intrinsics.f(this.apr, pVar.apr) && Intrinsics.f(this.promotionalPeriod, pVar.promotionalPeriod) && Intrinsics.f(this.administrationFeeInfo, pVar.administrationFeeInfo) && this.firstDate == pVar.firstDate && Intrinsics.f(this.cashbackBalance, pVar.cashbackBalance) && Intrinsics.f(this.ongoingStatementBalance, pVar.ongoingStatementBalance) && this.hideMinimumRepayment == pVar.hideMinimumRepayment;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getCurrentDate() {
        return this.currentDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getFacilityId() {
        return this.facilityId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getFirstDate() {
        return this.firstDate;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c((this.state.hashCode() + (this.facilityId.hashCode() * 31)) * 31, 31, this.pocketId), 31, this.walletId);
        String str = this.cardId;
        int iC2 = a0.d.c(a0.d.c(a0.d.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.currentDate), 31, this.statementDate), 31, this.remainingBalance);
        Long l2 = this.previousStatementDate;
        int iC3 = a0.d.c(p.a.c(m72.b.c(a0.d.c(a0.d.c((iC2 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.minimumRepayment), 31, this.repaymentDueDate), this.purchasesInterestRate, 31), 31, this.currencyCode), 31, this.statementBalance);
        Long l3 = this.paymentOverdueAmount;
        int iHashCode = (iC3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.paymentOverdueDate;
        int iHashCode2 = (iHashCode + (l4 == null ? 0 : l4.hashCode())) * 31;
        Double d = this.apr;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        w wVar = this.promotionalPeriod;
        int iHashCode4 = (iHashCode3 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        f fVar = this.administrationFeeInfo;
        int iC4 = a0.d.c((iHashCode4 + (fVar == null ? 0 : fVar.hashCode())) * 31, 31, this.firstDate);
        g gVar = this.cashbackBalance;
        return Boolean.hashCode(this.hideMinimumRepayment) + wp5.y.e(this.ongoingStatementBalance, (iC4 + (gVar != null ? gVar.hashCode() : 0)) * 31, 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getHideMinimumRepayment() {
        return this.hideMinimumRepayment;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getMinimumRepayment() {
        return this.minimumRepayment;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final jo3.b getOngoingStatementBalance() {
        return this.ongoingStatementBalance;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Long getPaymentOverdueAmount() {
        return this.paymentOverdueAmount;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Long getPaymentOverdueDate() {
        return this.paymentOverdueDate;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getPocketId() {
        return this.pocketId;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Long getPreviousStatementDate() {
        return this.previousStatementDate;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final w getPromotionalPeriod() {
        return this.promotionalPeriod;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final double getPurchasesInterestRate() {
        return this.purchasesInterestRate;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final long getRemainingBalance() {
        return this.remainingBalance;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final long getRepaymentDueDate() {
        return this.repaymentDueDate;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final q getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final long getStatementBalance() {
        return this.statementBalance;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final long getStatementDate() {
        return this.statementDate;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getWalletId() {
        return this.walletId;
    }
}
