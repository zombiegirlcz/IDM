package yn4;

import ip0.v7;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0006\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014R\u001a\u0010\u001e\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b\u0016\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\u000b\u0010\"¨\u0006$"}, d2 = {"Lyn4/b0;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "f", "()I", "term", "b", "Ljava/lang/String;", "c", "interestRate", "apr", "Ljo3/a;", "d", "Ljo3/a;", "g", "()Ljo3/a;", "totalInterest", "e", "h", "totalRepayable", "i", "totalTax", "Lyn4/b0$a;", "Lyn4/b0$a;", "()Lyn4/b0$a;", "scheduleExcerpt", "quoteIdentifier", "Lyn4/r;", "Lyn4/r;", "()Lyn4/r;", "aprInfo", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("term")
    private final int term;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("interestRate")
    @NotNull
    private final String interestRate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("apr")
    private final String apr;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("totalInterest")
    @NotNull
    private final jo3.a totalInterest;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("totalRepayable")
    @NotNull
    private final jo3.a totalRepayable;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("totalTax")
    private final jo3.a totalTax;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("scheduleExcerpt")
    @NotNull
    private final a scheduleExcerpt;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("quoteIdentifier")
    @NotNull
    private final String quoteIdentifier;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("aprInfo")
    private final r aprInfo;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0010\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u0006\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0018"}, d2 = {"Lyn4/b0$a;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "b", "()Ljo3/a;", "instalment", "c", "lastInstalment", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "firstPaymentDate", "d", "lastPaymentDate", "", "e", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "paymentDay", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("instalment")
        @NotNull
        private final jo3.a instalment;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("lastInstalment")
        @NotNull
        private final jo3.a lastInstalment;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("firstPaymentDate")
        @NotNull
        private final LocalDate firstPaymentDate;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("lastPaymentDate")
        @NotNull
        private final LocalDate lastPaymentDate;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("paymentDay")
        private final Integer paymentDay;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getFirstPaymentDate() {
            return this.firstPaymentDate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final jo3.a getInstalment() {
            return this.instalment;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final jo3.a getLastInstalment() {
            return this.lastInstalment;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final LocalDate getLastPaymentDate() {
            return this.lastPaymentDate;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Integer getPaymentDay() {
            return this.paymentDay;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.instalment, aVar.instalment) && Intrinsics.f(this.lastInstalment, aVar.lastInstalment) && Intrinsics.f(this.firstPaymentDate, aVar.firstPaymentDate) && Intrinsics.f(this.lastPaymentDate, aVar.lastPaymentDate) && Intrinsics.f(this.paymentDay, aVar.paymentDay);
        }

        public final int hashCode() {
            int iA = wp5.y.a(wp5.y.a(v7.j(this.lastInstalment, this.instalment.hashCode() * 31, 31), 31, this.firstPaymentDate), 31, this.lastPaymentDate);
            Integer num = this.paymentDay;
            return iA + (num == null ? 0 : num.hashCode());
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getApr() {
        return this.apr;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final r getAprInfo() {
        return this.aprInfo;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getInterestRate() {
        return this.interestRate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getQuoteIdentifier() {
        return this.quoteIdentifier;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final a getScheduleExcerpt() {
        return this.scheduleExcerpt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return this.term == b0Var.term && Intrinsics.f(this.interestRate, b0Var.interestRate) && Intrinsics.f(this.apr, b0Var.apr) && Intrinsics.f(this.totalInterest, b0Var.totalInterest) && Intrinsics.f(this.totalRepayable, b0Var.totalRepayable) && Intrinsics.f(this.totalTax, b0Var.totalTax) && Intrinsics.f(this.scheduleExcerpt, b0Var.scheduleExcerpt) && Intrinsics.f(this.quoteIdentifier, b0Var.quoteIdentifier) && Intrinsics.f(this.aprInfo, b0Var.aprInfo);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getTerm() {
        return this.term;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final jo3.a getTotalInterest() {
        return this.totalInterest;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final jo3.a getTotalRepayable() {
        return this.totalRepayable;
    }

    public final int hashCode() {
        int iC = p.a.c(Integer.hashCode(this.term) * 31, 31, this.interestRate);
        String str = this.apr;
        int iJ = v7.j(this.totalRepayable, v7.j(this.totalInterest, (iC + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        jo3.a aVar = this.totalTax;
        int iC2 = p.a.c((this.scheduleExcerpt.hashCode() + ((iJ + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31, 31, this.quoteIdentifier);
        r rVar = this.aprInfo;
        return iC2 + (rVar != null ? rVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final jo3.a getTotalTax() {
        return this.totalTax;
    }
}
