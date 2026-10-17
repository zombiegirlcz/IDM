package yn4;

import ip0.v7;
import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0017\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0019\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0018\u0010\u000eR\u001a\u0010\u001c\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001b\u0010\u000eR\u001a\u0010\u001f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\"\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001a\u0010\u0004R\u001a\u0010#\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\u0006\u0010\u0004R\u001a\u0010'\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010%\u001a\u0004\b \u0010&R\"\u0010,\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010*\u001a\u0004\b\u0010\u0010+R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010.\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\u001d\u0010\u0004¨\u0006/"}, d2 = {"Lyn4/h0;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "j", "()I", "term", "Ljo3/a;", "b", "Ljo3/a;", "()Ljo3/a;", "currentDownPayment", "c", "f", "minDownPayment", "d", "e", "maxDownPayment", "l", "totalPrincipal", "k", "totalInterest", "g", "n", "totalTax", "h", "m", "totalRepayable", "i", "Ljava/lang/String;", "monthlyInterestRate", "apr", "Lyn4/h0$a;", "Lyn4/h0$a;", "()Lyn4/h0$a;", "scheduleExcerpt", "", "Lio4/f;", "Ljava/util/List;", "()Ljava/util/List;", "detailSections", "disclaimer", "quoteIdentifier", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("term")
    private final int term;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("currentDownPayment")
    @NotNull
    private final jo3.a currentDownPayment;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("minDownPayment")
    @NotNull
    private final jo3.a minDownPayment;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("maxDownPayment")
    @NotNull
    private final jo3.a maxDownPayment;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("totalPrincipal")
    @NotNull
    private final jo3.a totalPrincipal;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("totalInterest")
    @NotNull
    private final jo3.a totalInterest;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalTax")
    @NotNull
    private final jo3.a totalTax;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalRepayable")
    @NotNull
    private final jo3.a totalRepayable;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("monthlyInterestRate")
    @NotNull
    private final String monthlyInterestRate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("apr")
    @NotNull
    private final String apr;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("scheduleExcerpt")
    @NotNull
    private final a scheduleExcerpt;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("detailSections")
    private final List<io4.f> detailSections;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("disclaimer")
    private final String disclaimer;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("quoteIdentifier")
    @NotNull
    private final String quoteIdentifier;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0010\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u0006\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0013"}, d2 = {"Lyn4/h0$a;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "b", "()Ljo3/a;", "instalment", "c", "lastInstalment", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "firstPaymentDate", "d", "lastPaymentDate", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.instalment, aVar.instalment) && Intrinsics.f(this.lastInstalment, aVar.lastInstalment) && Intrinsics.f(this.firstPaymentDate, aVar.firstPaymentDate) && Intrinsics.f(this.lastPaymentDate, aVar.lastPaymentDate);
        }

        public final int hashCode() {
            return this.lastPaymentDate.hashCode() + wp5.y.a(v7.j(this.lastInstalment, this.instalment.hashCode() * 31, 31), 31, this.firstPaymentDate);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getApr() {
        return this.apr;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getCurrentDownPayment() {
        return this.currentDownPayment;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getDetailSections() {
        return this.detailSections;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getMaxDownPayment() {
        return this.maxDownPayment;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return this.term == h0Var.term && Intrinsics.f(this.currentDownPayment, h0Var.currentDownPayment) && Intrinsics.f(this.minDownPayment, h0Var.minDownPayment) && Intrinsics.f(this.maxDownPayment, h0Var.maxDownPayment) && Intrinsics.f(this.totalPrincipal, h0Var.totalPrincipal) && Intrinsics.f(this.totalInterest, h0Var.totalInterest) && Intrinsics.f(this.totalTax, h0Var.totalTax) && Intrinsics.f(this.totalRepayable, h0Var.totalRepayable) && Intrinsics.f(this.monthlyInterestRate, h0Var.monthlyInterestRate) && Intrinsics.f(this.apr, h0Var.apr) && Intrinsics.f(this.scheduleExcerpt, h0Var.scheduleExcerpt) && Intrinsics.f(this.detailSections, h0Var.detailSections) && Intrinsics.f(this.disclaimer, h0Var.disclaimer) && Intrinsics.f(this.quoteIdentifier, h0Var.quoteIdentifier);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jo3.a getMinDownPayment() {
        return this.minDownPayment;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getMonthlyInterestRate() {
        return this.monthlyInterestRate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getQuoteIdentifier() {
        return this.quoteIdentifier;
    }

    public final int hashCode() {
        int iHashCode = (this.scheduleExcerpt.hashCode() + p.a.c(p.a.c(v7.j(this.totalRepayable, v7.j(this.totalTax, v7.j(this.totalInterest, v7.j(this.totalPrincipal, v7.j(this.maxDownPayment, v7.j(this.minDownPayment, v7.j(this.currentDownPayment, Integer.hashCode(this.term) * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.monthlyInterestRate), 31, this.apr)) * 31;
        List<io4.f> list = this.detailSections;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.disclaimer;
        return this.quoteIdentifier.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final a getScheduleExcerpt() {
        return this.scheduleExcerpt;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getTerm() {
        return this.term;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final jo3.a getTotalInterest() {
        return this.totalInterest;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final jo3.a getTotalPrincipal() {
        return this.totalPrincipal;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final jo3.a getTotalRepayable() {
        return this.totalRepayable;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final jo3.a getTotalTax() {
        return this.totalTax;
    }
}
