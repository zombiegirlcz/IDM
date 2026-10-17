package rn4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0017R\u001a\u0010 \u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0017R\u001c\u0010%\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010$R\u001c\u0010)\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010+\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0016\u001a\u0004\b\"\u0010\u0017R\u001a\u0010.\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u0016\u001a\u0004\b-\u0010\u0017R\u001a\u00103\u001a\u00020/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b1\u00102R\u001a\u00104\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u00107\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u0016\u001a\u0004\b6\u0010\u0017R\u001c\u00108\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b*\u0010(R\u001c\u00109\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b,\u0010(R\u001c\u0010<\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010:\u001a\u0004\b\t\u0010;R\u001c\u0010@\u001a\u0004\u0018\u00010=8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\b5\u0010?R\u001c\u0010D\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010B\u001a\u0004\b\u0005\u0010CR\u001a\u0010E\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001b\u0010\u0017R\u001c\u0010I\u001a\u0004\u0018\u00010F8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010G\u001a\u0004\b\u000f\u0010H¨\u0006J"}, d2 = {"Lrn4/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "facilityId", "b", "t", "state", "c", "n", "pocketId", "d", "w", "walletId", "e", "cardId", "", "f", "J", "()J", "currentDate", "v", "statementDate", "h", "r", "remainingBalance", "i", "k", "ongoingStatementBalance", "", "j", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "hideMinimumRepayment", "Ljava/lang/Long;", "o", "()Ljava/lang/Long;", "previousStatementDate", "l", "minimumRepayment", "m", "s", "repaymentDueDate", "", "D", "q", "()D", "purchasesInterestRate", "currency", "p", "u", "statementBalance", "paymentOverdueAmount", "paymentOverdueDate", "Ljava/lang/Double;", "()Ljava/lang/Double;", "apr", "Lrn4/d;", "Lrn4/d;", "()Lrn4/d;", "promotionalPeriod", "Lrn4/a;", "Lrn4/a;", "()Lrn4/a;", "administrationFeeInfo", "firstDate", "Lrn4/b;", "Lrn4/b;", "()Lrn4/b;", "cashbackBalance", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("facilityId")
    @NotNull
    private final String facilityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

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
    @lg.b("ongoingStatementBalance")
    private final long ongoingStatementBalance;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("hideMinimumRepayment")
    private final Boolean hideMinimumRepayment;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("previousStatementDate")
    private final Long previousStatementDate;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("minimumRepayment")
    private final long minimumRepayment;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("repaymentDueDate")
    private final long repaymentDueDate;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("purchasesInterestRate")
    private final double purchasesInterestRate;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("statementBalance")
    private final long statementBalance;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentOverdueAmount")
    private final Long paymentOverdueAmount;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentOverdueDate")
    private final Long paymentOverdueDate;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("apr")
    private final Double apr;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("promotionalPeriod")
    private final d promotionalPeriod;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("administrationFeeInfo")
    private final a administrationFeeInfo;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("firstDate")
    private final long firstDate;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("cashbackBalance")
    private final b cashbackBalance;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getAdministrationFeeInfo() {
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
    public final b getCashbackBalance() {
        return this.cashbackBalance;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.facilityId, cVar.facilityId) && Intrinsics.f(this.state, cVar.state) && Intrinsics.f(this.pocketId, cVar.pocketId) && Intrinsics.f(this.walletId, cVar.walletId) && Intrinsics.f(this.cardId, cVar.cardId) && this.currentDate == cVar.currentDate && this.statementDate == cVar.statementDate && this.remainingBalance == cVar.remainingBalance && this.ongoingStatementBalance == cVar.ongoingStatementBalance && Intrinsics.f(this.hideMinimumRepayment, cVar.hideMinimumRepayment) && Intrinsics.f(this.previousStatementDate, cVar.previousStatementDate) && this.minimumRepayment == cVar.minimumRepayment && this.repaymentDueDate == cVar.repaymentDueDate && Double.compare(this.purchasesInterestRate, cVar.purchasesInterestRate) == 0 && Intrinsics.f(this.currency, cVar.currency) && this.statementBalance == cVar.statementBalance && Intrinsics.f(this.paymentOverdueAmount, cVar.paymentOverdueAmount) && Intrinsics.f(this.paymentOverdueDate, cVar.paymentOverdueDate) && Intrinsics.f(this.apr, cVar.apr) && Intrinsics.f(this.promotionalPeriod, cVar.promotionalPeriod) && Intrinsics.f(this.administrationFeeInfo, cVar.administrationFeeInfo) && this.firstDate == cVar.firstDate && Intrinsics.f(this.cashbackBalance, cVar.cashbackBalance);
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
        int iC = p.a.c(p.a.c(p.a.c(this.facilityId.hashCode() * 31, 31, this.state), 31, this.pocketId), 31, this.walletId);
        String str = this.cardId;
        int iC2 = a0.d.c(a0.d.c(a0.d.c(a0.d.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.currentDate), 31, this.statementDate), 31, this.remainingBalance), 31, this.ongoingStatementBalance);
        Boolean bool = this.hideMinimumRepayment;
        int iHashCode = (iC2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l2 = this.previousStatementDate;
        int iC3 = a0.d.c(p.a.c(m72.b.c(a0.d.c(a0.d.c((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.minimumRepayment), 31, this.repaymentDueDate), this.purchasesInterestRate, 31), 31, this.currency), 31, this.statementBalance);
        Long l3 = this.paymentOverdueAmount;
        int iHashCode2 = (iC3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.paymentOverdueDate;
        int iHashCode3 = (iHashCode2 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Double d = this.apr;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        d dVar = this.promotionalPeriod;
        int iHashCode5 = (iHashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        a aVar = this.administrationFeeInfo;
        int iC4 = a0.d.c((iHashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.firstDate);
        b bVar = this.cashbackBalance;
        return iC4 + (bVar != null ? bVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Boolean getHideMinimumRepayment() {
        return this.hideMinimumRepayment;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getMinimumRepayment() {
        return this.minimumRepayment;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getOngoingStatementBalance() {
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
    public final d getPromotionalPeriod() {
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
    public final String getState() {
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
