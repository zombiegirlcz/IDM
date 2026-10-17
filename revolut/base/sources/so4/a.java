package so4;

import h30.l;
import ip0.v7;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\b\u0013\u000e\u000b\u001c\u000f\u0015\u0012\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR\u001a\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u000e\u0010\tR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0007\u001a\u0004\b\u0013\u0010\tR\u001a\u0010\u0016\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0007\u001a\u0004\b\u0015\u0010\tR\u001a\u0010\u001b\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0004R \u0010%\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010(\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010\u001aR\u001c\u0010*\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0018\u001a\u0004\b\u0012\u0010\u001aR\u001c\u0010,\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0018\u001a\u0004\b)\u0010\u001aR\u001c\u0010-\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b&\u0010\u001aR\u001c\u0010/\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b.\u0010\u001aR\u001c\u00101\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u001d\u001a\u0004\b+\u0010\u0004R\u001c\u00105\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b\u001c\u00104R\u001c\u00107\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b6\u0010\u0004R\u001c\u00108\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b0\u0010\u0004R\u001c\u0010=\u001a\u0004\u0018\u0001098\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010?\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010\u001d\u001a\u0004\b>\u0010\u0004R\"\u0010A\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010\"\u001a\u0004\b\u0006\u0010$R \u0010C\u001a\b\u0012\u0004\u0012\u00020B0 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010\"\u001a\u0004\b\u000b\u0010$¨\u0006D"}, d2 = {"Lso4/a;", "", "", "toString", "()Ljava/lang/String;", "Ljava/time/LocalDate;", "a", "Ljava/time/LocalDate;", "i", "()Ljava/time/LocalDate;", "referenceDate", "b", "p", "startDate", "c", "d", "endDate", "dueDate", "e", "f", "nextDueDate", "g", "nextInterestChargeDate", "Ljo3/a;", "Ljo3/a;", "r", "()Ljo3/a;", "statementBalance", "h", "Ljava/lang/String;", "q", "state", "", "Lso4/a$g;", "Ljava/util/List;", "m", "()Ljava/util/List;", "revolverTransactions", "j", "n", "spendBalance", "k", "minRepaymentAmount", "l", "repaymentAmount", "remainingAmount", "s", "statementDeferredAmount", "o", "repaymentStatus", "Lso4/a$f;", "Lso4/a$f;", "()Lso4/a$f;", "outstandingBalance", "t", "statementFileName", "spreadsheetStatementFileName", "Lso4/a$h;", "Lso4/a$h;", "v", "()Lso4/a$h;", "transactionsFilter", "u", "status", "Lso4/a$a;", "accruedInterests", "Lio4/f;", "detailsSection", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("referenceDate")
    @NotNull
    private final LocalDate referenceDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("startDate")
    @NotNull
    private final LocalDate startDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("endDate")
    @NotNull
    private final LocalDate endDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("dueDate")
    @NotNull
    private final LocalDate dueDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("nextDueDate")
    private final LocalDate nextDueDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("nextInterestChargeDate")
    @NotNull
    private final LocalDate nextInterestChargeDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("statementBalance")
    @NotNull
    private final jo3.a statementBalance;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("revolverTransactions")
    @NotNull
    private final List<g> revolverTransactions;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("spendBalance")
    private final jo3.a spendBalance;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("minRepaymentAmount")
    private final jo3.a minRepaymentAmount;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("repaymentAmount")
    private final jo3.a repaymentAmount;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("remainingAmount")
    private final jo3.a remainingAmount;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("statementDeferredAmount")
    private final jo3.a statementDeferredAmount;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("repaymentStatus")
    private final String repaymentStatus;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("outstandingBalance")
    private final f outstandingBalance;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("statementFileName")
    private final String statementFileName;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("spreadsheetStatementFileName")
    private final String spreadsheetStatementFileName;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactionsFilter")
    private final h transactionsFilter;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("accruedInterests")
    private final List<C1478a> accruedInterests;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("detailsSection")
    @NotNull
    private final List<io4.f> detailsSection;

    /* JADX INFO: renamed from: so4.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0005\u0010\rR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Lso4/a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "label", "b", "explainer", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "amount", "", "Lso4/a$g;", "d", "Ljava/util/List;", "()Ljava/util/List;", "transactions", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1478a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        @NotNull
        private final String label;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("explainer")
        @NotNull
        private final String explainer;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("amount")
        @NotNull
        private final jo3.a amount;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("transactions")
        @NotNull
        private final List<g> transactions;

        public C1478a(String label, String explainer, ArrayList transactions, jo3.a amount) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(explainer, "explainer");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(transactions, "transactions");
            this.label = label;
            this.explainer = explainer;
            this.amount = amount;
            this.transactions = transactions;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getAmount() {
            return this.amount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getExplainer() {
            return this.explainer;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final List getTransactions() {
            return this.transactions;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1478a)) {
                return false;
            }
            C1478a c1478a = (C1478a) obj2;
            return Intrinsics.f(this.label, c1478a.label) && Intrinsics.f(this.explainer, c1478a.explainer) && Intrinsics.f(this.amount, c1478a.amount) && Intrinsics.f(this.transactions, c1478a.transactions);
        }

        public final int hashCode() {
            return this.transactions.hashCode() + v7.j(this.amount, p.a.c(this.label.hashCode() * 31, 31, this.explainer), 31);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lso4/a$b;", "", "", "toString", "()Ljava/lang/String;", "Ljava/time/LocalDate;", "a", "Ljava/time/LocalDate;", "b", "()Ljava/time/LocalDate;", "chargeDate", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "amount", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("chargeDate")
        @NotNull
        private final LocalDate chargeDate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("amount")
        private final jo3.a amount;

        public b(LocalDate chargeDate, jo3.a aVar) {
            Intrinsics.checkNotNullParameter(chargeDate, "chargeDate");
            this.chargeDate = chargeDate;
            this.amount = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getAmount() {
            return this.amount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final LocalDate getChargeDate() {
            return this.chargeDate;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.chargeDate, bVar.chargeDate) && Intrinsics.f(this.amount, bVar.amount);
        }

        public final int hashCode() {
            int iHashCode = this.chargeDate.hashCode() * 31;
            jo3.a aVar = this.amount;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000f\u0010\t¨\u0006\u0012"}, d2 = {"Lso4/a$c;", "", "", "toString", "()Ljava/lang/String;", "Lso4/a$b;", "a", "Lso4/a$b;", "b", "()Lso4/a$b;", "interest", "fee", "c", "e", "tax", "d", "lateFee", "lateInterest", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("interest")
        private final b interest;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("fee")
        private final b fee;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("tax")
        private final b tax;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("lateFee")
        private final b lateFee;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("lateInterest")
        private final b lateInterest;

        public c(b bVar, b bVar2, b bVar3, b bVar4, b bVar5) {
            this.interest = bVar;
            this.fee = bVar2;
            this.tax = bVar3;
            this.lateFee = bVar4;
            this.lateInterest = bVar5;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getFee() {
            return this.fee;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b getInterest() {
            return this.interest;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b getLateFee() {
            return this.lateFee;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final b getLateInterest() {
            return this.lateInterest;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final b getTax() {
            return this.tax;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.interest, cVar.interest) && Intrinsics.f(this.fee, cVar.fee) && Intrinsics.f(this.tax, cVar.tax) && Intrinsics.f(this.lateFee, cVar.lateFee) && Intrinsics.f(this.lateInterest, cVar.lateInterest);
        }

        public final int hashCode() {
            b bVar = this.interest;
            int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
            b bVar2 = this.fee;
            int iHashCode2 = (iHashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
            b bVar3 = this.tax;
            int iHashCode3 = (iHashCode2 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31;
            b bVar4 = this.lateFee;
            int iHashCode4 = (iHashCode3 + (bVar4 == null ? 0 : bVar4.hashCode())) * 31;
            b bVar5 = this.lateInterest;
            return iHashCode4 + (bVar5 != null ? bVar5.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\u000b\u0010\tR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Lso4/a$d;", "", "", "toString", "()Ljava/lang/String;", "Ljava/time/ZonedDateTime;", "a", "Ljava/time/ZonedDateTime;", "c", "()Ljava/time/ZonedDateTime;", "createdDateFrom", "b", "d", "createdDateTo", "completedDateFrom", "completedDateTo", "", "e", "Ljava/util/List;", "()Ljava/util/List;", "excludeIds", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("createdDateFrom")
        @NotNull
        private final ZonedDateTime createdDateFrom;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("createdDateTo")
        @NotNull
        private final ZonedDateTime createdDateTo;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("completedDateFrom")
        @NotNull
        private final ZonedDateTime completedDateFrom;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("completedDateTo")
        @NotNull
        private final ZonedDateTime completedDateTo;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("excludeIds")
        @NotNull
        private final List<String> excludeIds;

        public d(ZonedDateTime createdDateFrom, ZonedDateTime createdDateTo, ZonedDateTime completedDateFrom, ZonedDateTime completedDateTo, List excludeIds) {
            Intrinsics.checkNotNullParameter(createdDateFrom, "createdDateFrom");
            Intrinsics.checkNotNullParameter(createdDateTo, "createdDateTo");
            Intrinsics.checkNotNullParameter(completedDateFrom, "completedDateFrom");
            Intrinsics.checkNotNullParameter(completedDateTo, "completedDateTo");
            Intrinsics.checkNotNullParameter(excludeIds, "excludeIds");
            this.createdDateFrom = createdDateFrom;
            this.createdDateTo = createdDateTo;
            this.completedDateFrom = completedDateFrom;
            this.completedDateTo = completedDateTo;
            this.excludeIds = excludeIds;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ZonedDateTime getCompletedDateFrom() {
            return this.completedDateFrom;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ZonedDateTime getCompletedDateTo() {
            return this.completedDateTo;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ZonedDateTime getCreatedDateFrom() {
            return this.createdDateFrom;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ZonedDateTime getCreatedDateTo() {
            return this.createdDateTo;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final List getExcludeIds() {
            return this.excludeIds;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.createdDateFrom, dVar.createdDateFrom) && Intrinsics.f(this.createdDateTo, dVar.createdDateTo) && Intrinsics.f(this.completedDateFrom, dVar.completedDateFrom) && Intrinsics.f(this.completedDateTo, dVar.completedDateTo) && Intrinsics.f(this.excludeIds, dVar.excludeIds);
        }

        public final int hashCode() {
            return this.excludeIds.hashCode() + l.h(this.completedDateTo, l.h(this.completedDateFrom, l.h(this.createdDateTo, this.createdDateFrom.hashCode() * 31, 31), 31), 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\n\u0010\u0004¨\u0006\u000f"}, d2 = {"Lso4/a$e;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "()I", "number", "b", "c", "totalNumber", "Ljava/lang/String;", "planId", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("number")
        private final int number;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("totalNumber")
        private final int totalNumber;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("planId")
        @NotNull
        private final String planId;

        public e(int i, int i2, String planId) {
            Intrinsics.checkNotNullParameter(planId, "planId");
            this.number = i;
            this.totalNumber = i2;
            this.planId = planId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getNumber() {
            return this.number;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPlanId() {
            return this.planId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getTotalNumber() {
            return this.totalNumber;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return this.number == eVar.number && this.totalNumber == eVar.totalNumber && Intrinsics.f(this.planId, eVar.planId);
        }

        public final int hashCode() {
            return this.planId.hashCode() + j6.a.b(this.totalNumber, Integer.hashCode(this.number) * 31, 31);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\u001b\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u000f\u0010\u001aR\u001c\u0010 \u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0006\u0010\u001f¨\u0006!"}, d2 = {"Lso4/a$f;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "e", "()Ljo3/a;", "totalAmount", "b", "d", "remainingBalance", "Ljava/time/LocalDate;", "c", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "fromDate", "getLightOverdueEndDate", "lightOverdueEndDate", "getModerateOverdueEndDate", "moderateOverdueEndDate", "", "f", "Z", "()Z", "overdue", "Lso4/a$c;", "g", "Lso4/a$c;", "()Lso4/a$c;", "chargesBreakdown", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("totalAmount")
        @NotNull
        private final jo3.a totalAmount;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("remainingBalance")
        @NotNull
        private final jo3.a remainingBalance;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("fromDate")
        @NotNull
        private final LocalDate fromDate;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("lightOverdueEndDate")
        private final LocalDate lightOverdueEndDate;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("moderateOverdueEndDate")
        private final LocalDate moderateOverdueEndDate;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("overdue")
        private final boolean overdue;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("chargesBreakdown")
        private final c chargesBreakdown;

        public f(jo3.a totalAmount, jo3.a remainingBalance, LocalDate fromDate, LocalDate localDate, LocalDate localDate2, boolean z, c cVar) {
            Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
            Intrinsics.checkNotNullParameter(remainingBalance, "remainingBalance");
            Intrinsics.checkNotNullParameter(fromDate, "fromDate");
            this.totalAmount = totalAmount;
            this.remainingBalance = remainingBalance;
            this.fromDate = fromDate;
            this.lightOverdueEndDate = localDate;
            this.moderateOverdueEndDate = localDate2;
            this.overdue = z;
            this.chargesBreakdown = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final c getChargesBreakdown() {
            return this.chargesBreakdown;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final LocalDate getFromDate() {
            return this.fromDate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getOverdue() {
            return this.overdue;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final jo3.a getRemainingBalance() {
            return this.remainingBalance;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final jo3.a getTotalAmount() {
            return this.totalAmount;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof f)) {
                return false;
            }
            f fVar = (f) obj2;
            return Intrinsics.f(this.totalAmount, fVar.totalAmount) && Intrinsics.f(this.remainingBalance, fVar.remainingBalance) && Intrinsics.f(this.fromDate, fVar.fromDate) && Intrinsics.f(this.lightOverdueEndDate, fVar.lightOverdueEndDate) && Intrinsics.f(this.moderateOverdueEndDate, fVar.moderateOverdueEndDate) && this.overdue == fVar.overdue && Intrinsics.f(this.chargesBreakdown, fVar.chargesBreakdown);
        }

        public final int hashCode() {
            int iA = y.a(v7.j(this.remainingBalance, this.totalAmount.hashCode() * 31, 31), 31, this.fromDate);
            LocalDate localDate = this.lightOverdueEndDate;
            int iHashCode = (iA + (localDate == null ? 0 : localDate.hashCode())) * 31;
            LocalDate localDate2 = this.moderateOverdueEndDate;
            int iC = j6.a.c((iHashCode + (localDate2 == null ? 0 : localDate2.hashCode())) * 31, 31, this.overdue);
            c cVar = this.chargesBreakdown;
            return iC + (cVar != null ? cVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0012\u0010\u001b¨\u0006\u001d"}, d2 = {"Lso4/a$g;", "", "", "toString", "()Ljava/lang/String;", "Ljava/time/ZonedDateTime;", "a", "Ljava/time/ZonedDateTime;", "b", "()Ljava/time/ZonedDateTime;", "completedDate", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "amount", "c", "e", "interestAmount", "d", "Ljava/lang/String;", "f", "referenceTransactionId", "description", "g", "type", "Lso4/a$e;", "Lso4/a$e;", "()Lso4/a$e;", "instalment", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("completedDate")
        @NotNull
        private final ZonedDateTime completedDate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("amount")
        @NotNull
        private final jo3.a amount;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("interestAmount")
        private final jo3.a interestAmount;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("referenceTransactionId")
        private final String referenceTransactionId;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("description")
        @NotNull
        private final String description;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("instalment")
        private final e instalment;

        public g(ZonedDateTime completedDate, jo3.a amount, jo3.a aVar, String str, String description, String type, e eVar) {
            Intrinsics.checkNotNullParameter(completedDate, "completedDate");
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(type, "type");
            this.completedDate = completedDate;
            this.amount = amount;
            this.interestAmount = aVar;
            this.referenceTransactionId = str;
            this.description = description;
            this.type = type;
            this.instalment = eVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getAmount() {
            return this.amount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ZonedDateTime getCompletedDate() {
            return this.completedDate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final e getInstalment() {
            return this.instalment;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final jo3.a getInterestAmount() {
            return this.interestAmount;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof g)) {
                return false;
            }
            g gVar = (g) obj2;
            return Intrinsics.f(this.completedDate, gVar.completedDate) && Intrinsics.f(this.amount, gVar.amount) && Intrinsics.f(this.interestAmount, gVar.interestAmount) && Intrinsics.f(this.referenceTransactionId, gVar.referenceTransactionId) && Intrinsics.f(this.description, gVar.description) && Intrinsics.f(this.type, gVar.type) && Intrinsics.f(this.instalment, gVar.instalment);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getReferenceTransactionId() {
            return this.referenceTransactionId;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final int hashCode() {
            int iJ = v7.j(this.amount, this.completedDate.hashCode() * 31, 31);
            jo3.a aVar = this.interestAmount;
            int iHashCode = (iJ + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str = this.referenceTransactionId;
            int iC = p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.description), 31, this.type);
            e eVar = this.instalment;
            return iC + (eVar != null ? eVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0014"}, d2 = {"Lso4/a$h;", "", "", "toString", "()Ljava/lang/String;", "Lso4/a$d;", "a", "Lso4/a$d;", "()Lso4/a$d;", "completedTransactions", "", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "includeTransactionIds", "", "Z", "()Z", "includePendingTransactions", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("completedTransactions")
        @NotNull
        private final d completedTransactions;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("includeTransactionIds")
        @NotNull
        private final List<String> includeTransactionIds;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("includePendingTransactions")
        private final boolean includePendingTransactions;

        public h(d completedTransactions, List includeTransactionIds, boolean z) {
            Intrinsics.checkNotNullParameter(completedTransactions, "completedTransactions");
            Intrinsics.checkNotNullParameter(includeTransactionIds, "includeTransactionIds");
            this.completedTransactions = completedTransactions;
            this.includeTransactionIds = includeTransactionIds;
            this.includePendingTransactions = z;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final d getCompletedTransactions() {
            return this.completedTransactions;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIncludePendingTransactions() {
            return this.includePendingTransactions;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final List getIncludeTransactionIds() {
            return this.includeTransactionIds;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof h)) {
                return false;
            }
            h hVar = (h) obj2;
            return Intrinsics.f(this.completedTransactions, hVar.completedTransactions) && Intrinsics.f(this.includeTransactionIds, hVar.includeTransactionIds) && this.includePendingTransactions == hVar.includePendingTransactions;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.includePendingTransactions) + p.a.d(this.completedTransactions.hashCode() * 31, 31, this.includeTransactionIds);
        }
    }

    public a(LocalDate referenceDate, LocalDate startDate, LocalDate endDate, LocalDate dueDate, LocalDate localDate, LocalDate nextInterestChargeDate, jo3.a statementBalance, String state, ArrayList revolverTransactions, jo3.a aVar, jo3.a aVar2, jo3.a aVar3, jo3.a aVar4, jo3.a aVar5, String str, f fVar, String str2, String str3, h hVar, String status, ArrayList arrayList, ArrayList detailsSection) {
        Intrinsics.checkNotNullParameter(referenceDate, "referenceDate");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(dueDate, "dueDate");
        Intrinsics.checkNotNullParameter(nextInterestChargeDate, "nextInterestChargeDate");
        Intrinsics.checkNotNullParameter(statementBalance, "statementBalance");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(revolverTransactions, "revolverTransactions");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(detailsSection, "detailsSection");
        this.referenceDate = referenceDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.dueDate = dueDate;
        this.nextDueDate = localDate;
        this.nextInterestChargeDate = nextInterestChargeDate;
        this.statementBalance = statementBalance;
        this.state = state;
        this.revolverTransactions = revolverTransactions;
        this.spendBalance = aVar;
        this.minRepaymentAmount = aVar2;
        this.repaymentAmount = aVar3;
        this.remainingAmount = aVar4;
        this.statementDeferredAmount = aVar5;
        this.repaymentStatus = str;
        this.outstandingBalance = fVar;
        this.statementFileName = str2;
        this.spreadsheetStatementFileName = str3;
        this.transactionsFilter = hVar;
        this.status = status;
        this.accruedInterests = arrayList;
        this.detailsSection = detailsSection;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAccruedInterests() {
        return this.accruedInterests;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getDetailsSection() {
        return this.detailsSection;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDate getDueDate() {
        return this.dueDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LocalDate getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getMinRepaymentAmount() {
        return this.minRepaymentAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.referenceDate, aVar.referenceDate) && Intrinsics.f(this.startDate, aVar.startDate) && Intrinsics.f(this.endDate, aVar.endDate) && Intrinsics.f(this.dueDate, aVar.dueDate) && Intrinsics.f(this.nextDueDate, aVar.nextDueDate) && Intrinsics.f(this.nextInterestChargeDate, aVar.nextInterestChargeDate) && Intrinsics.f(this.statementBalance, aVar.statementBalance) && Intrinsics.f(this.state, aVar.state) && Intrinsics.f(this.revolverTransactions, aVar.revolverTransactions) && Intrinsics.f(this.spendBalance, aVar.spendBalance) && Intrinsics.f(this.minRepaymentAmount, aVar.minRepaymentAmount) && Intrinsics.f(this.repaymentAmount, aVar.repaymentAmount) && Intrinsics.f(this.remainingAmount, aVar.remainingAmount) && Intrinsics.f(this.statementDeferredAmount, aVar.statementDeferredAmount) && Intrinsics.f(this.repaymentStatus, aVar.repaymentStatus) && Intrinsics.f(this.outstandingBalance, aVar.outstandingBalance) && Intrinsics.f(this.statementFileName, aVar.statementFileName) && Intrinsics.f(this.spreadsheetStatementFileName, aVar.spreadsheetStatementFileName) && Intrinsics.f(this.transactionsFilter, aVar.transactionsFilter) && Intrinsics.f(this.status, aVar.status) && Intrinsics.f(this.accruedInterests, aVar.accruedInterests) && Intrinsics.f(this.detailsSection, aVar.detailsSection);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final LocalDate getNextDueDate() {
        return this.nextDueDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final LocalDate getNextInterestChargeDate() {
        return this.nextInterestChargeDate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final f getOutstandingBalance() {
        return this.outstandingBalance;
    }

    public final int hashCode() {
        int iA = y.a(y.a(y.a(this.referenceDate.hashCode() * 31, 31, this.startDate), 31, this.endDate), 31, this.dueDate);
        LocalDate localDate = this.nextDueDate;
        int iD = p.a.d(p.a.c(v7.j(this.statementBalance, y.a((iA + (localDate == null ? 0 : localDate.hashCode())) * 31, 31, this.nextInterestChargeDate), 31), 31, this.state), 31, this.revolverTransactions);
        jo3.a aVar = this.spendBalance;
        int iHashCode = (iD + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jo3.a aVar2 = this.minRepaymentAmount;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        jo3.a aVar3 = this.repaymentAmount;
        int iHashCode3 = (iHashCode2 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        jo3.a aVar4 = this.remainingAmount;
        int iHashCode4 = (iHashCode3 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        jo3.a aVar5 = this.statementDeferredAmount;
        int iHashCode5 = (iHashCode4 + (aVar5 == null ? 0 : aVar5.hashCode())) * 31;
        String str = this.repaymentStatus;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        f fVar = this.outstandingBalance;
        int iHashCode7 = (iHashCode6 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str2 = this.statementFileName;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.spreadsheetStatementFileName;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        h hVar = this.transactionsFilter;
        int iC = p.a.c((iHashCode9 + (hVar == null ? 0 : hVar.hashCode())) * 31, 31, this.status);
        List<C1478a> list = this.accruedInterests;
        return this.detailsSection.hashCode() + ((iC + (list != null ? list.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final LocalDate getReferenceDate() {
        return this.referenceDate;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final jo3.a getRemainingAmount() {
        return this.remainingAmount;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final jo3.a getRepaymentAmount() {
        return this.repaymentAmount;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getRepaymentStatus() {
        return this.repaymentStatus;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final List getRevolverTransactions() {
        return this.revolverTransactions;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final jo3.a getSpendBalance() {
        return this.spendBalance;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getSpreadsheetStatementFileName() {
        return this.spreadsheetStatementFileName;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final LocalDate getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final jo3.a getStatementBalance() {
        return this.statementBalance;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final jo3.a getStatementDeferredAmount() {
        return this.statementDeferredAmount;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getStatementFileName() {
        return this.statementFileName;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final h getTransactionsFilter() {
        return this.transactionsFilter;
    }
}
