package on4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0006\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR\u001a\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0007\u001a\u0004\b\u0011\u0010\tR\u001a\u0010\u0016\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0007\u001a\u0004\b\u000e\u0010\tR\u001a\u0010\u001c\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001a\u0010!\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0007\u001a\u0004\b \u0010\tR\u001c\u0010$\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b\u0018\u0010#R\u001c\u0010%\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b\u001d\u0010#R\u001c\u0010'\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b\u001f\u0010#R\u001c\u0010(\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b&\u0010#R\u001a\u0010)\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u0013\u0010\tR\u001c\u0010-\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010+\u001a\u0004\b\u0015\u0010,¨\u0006."}, d2 = {"Lon4/h;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "j", "()J", "remainingBalance", "b", "k", "repaymentDueDate", "c", "n", "statementDate", "d", "currentDate", "e", "minimumRepayment", "f", "interest", "", "g", "Z", "o", "()Z", "statementsAvailable", "h", "clearBalanceInterest", "i", "m", "statementBalance", "Ljava/lang/Long;", "()Ljava/lang/Long;", "paymentOverdueAmount", "paymentOverdueDate", "l", "previousStatementDate", "scheduledPaymentAmount", "nonRepayableBalance", "Lon4/h$a;", "Lon4/h$a;", "()Lon4/h$a;", "paymentOptionExtraAttributes", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("remainingBalance")
    private final long remainingBalance;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("repaymentDueDate")
    private final long repaymentDueDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("statementDate")
    private final long statementDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("currentDate")
    private final long currentDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("minimumRepayment")
    private final long minimumRepayment;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("interest")
    private final long interest;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("statementsAvailable")
    private final boolean statementsAvailable;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("clearBalanceInterest")
    private final long clearBalanceInterest;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("statementBalance")
    private final long statementBalance;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentOverdueAmount")
    private final Long paymentOverdueAmount;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("paymentOverdueDate")
    private final Long paymentOverdueDate;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("previousStatementDate")
    private final Long previousStatementDate;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("scheduledPaymentAmount")
    private final Long scheduledPaymentAmount;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("nonRepayableBalance")
    private final long nonRepayableBalance;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("paymentOptionExtraAttributes")
    private final a paymentOptionExtraAttributes;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lon4/h$a;", "", "", "toString", "()Ljava/lang/String;", "Lon4/h$b;", "a", "Lon4/h$b;", "()Lon4/h$b;", "spei", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("spei")
        private final b spei;

        public a(b bVar) {
            this.spei = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getSpei() {
            return this.spei;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.spei, ((a) obj2).spei);
        }

        public final int hashCode() {
            b bVar = this.spei;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\f"}, d2 = {"Lon4/h$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "beneficiaryName", "bank", "c", "clabe", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("beneficiaryName")
        @NotNull
        private final String beneficiaryName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("bank")
        @NotNull
        private final String bank;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("clabe")
        @NotNull
        private final String clabe;

        public b(String beneficiaryName, String bank, String clabe) {
            Intrinsics.checkNotNullParameter(beneficiaryName, "beneficiaryName");
            Intrinsics.checkNotNullParameter(bank, "bank");
            Intrinsics.checkNotNullParameter(clabe, "clabe");
            this.beneficiaryName = beneficiaryName;
            this.bank = bank;
            this.clabe = clabe;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBank() {
            return this.bank;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBeneficiaryName() {
            return this.beneficiaryName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getClabe() {
            return this.clabe;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.beneficiaryName, bVar.beneficiaryName) && Intrinsics.f(this.bank, bVar.bank) && Intrinsics.f(this.clabe, bVar.clabe);
        }

        public final int hashCode() {
            return this.clabe.hashCode() + p.a.c(this.beneficiaryName.hashCode() * 31, 31, this.bank);
        }
    }

    public h(long j2, long j3, long j5, long j16, long j22, long j42, boolean z, long j46, long j47, Long l2, Long l3, Long l4, Long l5, long j57, a aVar) {
        this.remainingBalance = j2;
        this.repaymentDueDate = j3;
        this.statementDate = j5;
        this.currentDate = j16;
        this.minimumRepayment = j22;
        this.interest = j42;
        this.statementsAvailable = z;
        this.clearBalanceInterest = j46;
        this.statementBalance = j47;
        this.paymentOverdueAmount = l2;
        this.paymentOverdueDate = l3;
        this.previousStatementDate = l4;
        this.scheduledPaymentAmount = l5;
        this.nonRepayableBalance = j57;
        this.paymentOptionExtraAttributes = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getClearBalanceInterest() {
        return this.clearBalanceInterest;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getCurrentDate() {
        return this.currentDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getInterest() {
        return this.interest;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getMinimumRepayment() {
        return this.minimumRepayment;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getNonRepayableBalance() {
        return this.nonRepayableBalance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.remainingBalance == hVar.remainingBalance && this.repaymentDueDate == hVar.repaymentDueDate && this.statementDate == hVar.statementDate && this.currentDate == hVar.currentDate && this.minimumRepayment == hVar.minimumRepayment && this.interest == hVar.interest && this.statementsAvailable == hVar.statementsAvailable && this.clearBalanceInterest == hVar.clearBalanceInterest && this.statementBalance == hVar.statementBalance && Intrinsics.f(this.paymentOverdueAmount, hVar.paymentOverdueAmount) && Intrinsics.f(this.paymentOverdueDate, hVar.paymentOverdueDate) && Intrinsics.f(this.previousStatementDate, hVar.previousStatementDate) && Intrinsics.f(this.scheduledPaymentAmount, hVar.scheduledPaymentAmount) && this.nonRepayableBalance == hVar.nonRepayableBalance && Intrinsics.f(this.paymentOptionExtraAttributes, hVar.paymentOptionExtraAttributes);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final a getPaymentOptionExtraAttributes() {
        return this.paymentOptionExtraAttributes;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getPaymentOverdueAmount() {
        return this.paymentOverdueAmount;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Long getPaymentOverdueDate() {
        return this.paymentOverdueDate;
    }

    public final int hashCode() {
        int iC = a0.d.c(a0.d.c(j6.a.c(a0.d.c(a0.d.c(a0.d.c(a0.d.c(a0.d.c(Long.hashCode(this.remainingBalance) * 31, 31, this.repaymentDueDate), 31, this.statementDate), 31, this.currentDate), 31, this.minimumRepayment), 31, this.interest), 31, this.statementsAvailable), 31, this.clearBalanceInterest), 31, this.statementBalance);
        Long l2 = this.paymentOverdueAmount;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.paymentOverdueDate;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.previousStatementDate;
        int iHashCode3 = (iHashCode2 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.scheduledPaymentAmount;
        int iC2 = a0.d.c((iHashCode3 + (l5 == null ? 0 : l5.hashCode())) * 31, 31, this.nonRepayableBalance);
        a aVar = this.paymentOptionExtraAttributes;
        return iC2 + (aVar != null ? aVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getPreviousStatementDate() {
        return this.previousStatementDate;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getRemainingBalance() {
        return this.remainingBalance;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getRepaymentDueDate() {
        return this.repaymentDueDate;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Long getScheduledPaymentAmount() {
        return this.scheduledPaymentAmount;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getStatementBalance() {
        return this.statementBalance;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final long getStatementDate() {
        return this.statementDate;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getStatementsAvailable() {
        return this.statementsAvailable;
    }
}
