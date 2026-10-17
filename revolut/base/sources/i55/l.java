package i55;

import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\t\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001a\u0010\u001e\u001a\u00020\u001a8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\r\u0010\u001dR\u001a\u0010!\u001a\u00020\u001a8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001dR\u001c\u0010&\u001a\u0004\u0018\u00010\u001a8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010(\u001a\u0004\u0018\u00010\u001a8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b\u0012\u0010%R\u001a\u0010+\u001a\u00020\u001a8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010\u001dR\u001a\u0010-\u001a\u00020\u001a8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b,\u0010\u001c\u001a\u0004\b\u0005\u0010\u001dR\u001a\u00103\u001a\u00020.8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00109\u001a\u0002048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010?\u001a\u00020:8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010A\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b@\u0010\u0006\u001a\u0004\b,\u0010\u0004R\u001a\u0010G\u001a\u00020B8\u0016X\u0097\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010I\u001a\u00020B8\u0016X\u0097\u0004¢\u0006\f\n\u0004\bH\u0010D\u001a\u0004\b\u001c\u0010FR\u001a\u0010O\u001a\u00020J8\u0016X\u0097\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001c\u0010T\u001a\u0004\u0018\u00010P8\u0016X\u0097\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\b'\u0010SR\u001c\u0010Z\u001a\u0004\u0018\u00010U8\u0016X\u0097\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u001c\u0010`\u001a\u0004\u0018\u00010[8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u001c\u0010f\u001a\u0004\u0018\u00010a8\u0016X\u0097\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\"\u0010m\u001a\n\u0012\u0004\u0012\u00020h\u0018\u00010g8\u0016X\u0097\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u001c\u0010r\u001a\u0004\u0018\u00010n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\b\u0014\u0010q¨\u0006s"}, d2 = {"Li55/l;", "Li55/v;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getId", "id", "b", "getName", "name", "Ljava/time/LocalDate;", "c", "Ljava/time/LocalDate;", "p0", "()Ljava/time/LocalDate;", "disbursalDate", "d", "finalRepaymentDate", "e", "getCurrency", "currency", "f", "getCountryCode", "countryCode", "", "g", "J", "()J", "principal", "h", "R0", "outstandingPrincipal", "i", "Ljava/lang/Long;", "W", "()Ljava/lang/Long;", "outstandingRescheduledPrincipal", "j", "fixedOutstandingBalance", "k", "N0", "totalRepaid", "l", "totalToRepay", "", "m", "D", "f0", "()D", "fractionRepaid", "Li55/g0;", "n", "Li55/g0;", "getState", "()Li55/g0;", "state", "Li55/m;", "o", "Li55/m;", "getConfig", "()Li55/m;", "config", "p", "product", "", "q", "I", "c0", "()I", "repaidCount", "r", "remainingTerm", "Li55/s;", "s", "Li55/s;", "k0", "()Li55/s;", "interestRate", "Li55/o;", "t", "Li55/o;", "()Li55/o;", "nextInstalment", "Li55/d0;", "u", "Li55/d0;", "J0", "()Li55/d0;", "lastPaidRepayment", "Li55/y;", "v", "Li55/y;", "T", "()Li55/y;", "refurbishment", "Li55/r;", "w", "Li55/r;", "z", "()Li55/r;", "interestOnly", "", "", "x", "Ljava/util/List;", "getInsurancePolicies", "()Ljava/util/List;", "insurancePolicies", "Li55/q;", "y", "Li55/q;", "()Li55/q;", "insuranceState", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("disbursalDate")
    @NotNull
    private final LocalDate disbursalDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("finalRepaymentDate")
    @NotNull
    private final LocalDate finalRepaymentDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("countryCode")
    @NotNull
    private final String countryCode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("principal")
    private final long principal;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("outstandingPrincipal")
    private final long outstandingPrincipal;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("outstandingRescheduledPrincipal")
    private final Long outstandingRescheduledPrincipal;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("fixedOutstandingBalance")
    private final Long fixedOutstandingBalance;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("totalRepaid")
    private final long totalRepaid;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalToRepay")
    private final long totalToRepay;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("fractionRepaid")
    private final double fractionRepaid;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final g0 state;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("config")
    @NotNull
    private final m config;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("product")
    @NotNull
    private final String product;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("repaidCount")
    private final int repaidCount;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("remainingTerm")
    private final int remainingTerm;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("interestRate")
    @NotNull
    private final s interestRate;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextInstalment")
    private final o nextInstalment;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("lastPaidRepayment")
    private final d0 lastPaidRepayment;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("refurbishment")
    private final y refurbishment;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("interestOnly")
    private final r interestOnly;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("insurancePolicies")
    private final List<Object> insurancePolicies;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("insuranceState")
    private final q insuranceState;

    @Override // i55.v
    /* JADX INFO: renamed from: J, reason: from getter */
    public final int getRemainingTerm() {
        return this.remainingTerm;
    }

    @Override // i55.v
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final d0 getLastPaidRepayment() {
        return this.lastPaidRepayment;
    }

    @Override // i55.v
    /* JADX INFO: renamed from: N0, reason: from getter */
    public final long getTotalRepaid() {
        return this.totalRepaid;
    }

    @Override // i55.v
    /* JADX INFO: renamed from: R0, reason: from getter */
    public final long getOutstandingPrincipal() {
        return this.outstandingPrincipal;
    }

    @Override // i55.v
    /* JADX INFO: renamed from: T, reason: from getter */
    public final y getRefurbishment() {
        return this.refurbishment;
    }

    @Override // i55.v
    /* JADX INFO: renamed from: W, reason: from getter */
    public final Long getOutstandingRescheduledPrincipal() {
        return this.outstandingRescheduledPrincipal;
    }

    @Override // i55.v
    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getTotalToRepay() {
        return this.totalToRepay;
    }

    @Override // i55.v
    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getFinalRepaymentDate() {
        return this.finalRepaymentDate;
    }

    @Override // i55.v
    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getPrincipal() {
        return this.principal;
    }

    @Override // i55.v
    /* JADX INFO: renamed from: c0, reason: from getter */
    public final int getRepaidCount() {
        return this.repaidCount;
    }

    @Override // i55.v
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getFixedOutstandingBalance() {
        return this.fixedOutstandingBalance;
    }

    @Override // i55.v
    /* JADX INFO: renamed from: e, reason: from getter */
    public final q getInsuranceState() {
        return this.insuranceState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.id, lVar.id) && Intrinsics.f(this.name, lVar.name) && Intrinsics.f(this.disbursalDate, lVar.disbursalDate) && Intrinsics.f(this.finalRepaymentDate, lVar.finalRepaymentDate) && Intrinsics.f(this.currency, lVar.currency) && Intrinsics.f(this.countryCode, lVar.countryCode) && this.principal == lVar.principal && this.outstandingPrincipal == lVar.outstandingPrincipal && Intrinsics.f(this.outstandingRescheduledPrincipal, lVar.outstandingRescheduledPrincipal) && Intrinsics.f(this.fixedOutstandingBalance, lVar.fixedOutstandingBalance) && this.totalRepaid == lVar.totalRepaid && this.totalToRepay == lVar.totalToRepay && Double.compare(this.fractionRepaid, lVar.fractionRepaid) == 0 && Intrinsics.f(this.state, lVar.state) && Intrinsics.f(this.config, lVar.config) && Intrinsics.f(this.product, lVar.product) && this.repaidCount == lVar.repaidCount && this.remainingTerm == lVar.remainingTerm && Intrinsics.f(this.interestRate, lVar.interestRate) && Intrinsics.f(this.nextInstalment, lVar.nextInstalment) && Intrinsics.f(this.lastPaidRepayment, lVar.lastPaidRepayment) && Intrinsics.f(this.refurbishment, lVar.refurbishment) && Intrinsics.f(this.interestOnly, lVar.interestOnly) && Intrinsics.f(this.insurancePolicies, lVar.insurancePolicies) && Intrinsics.f(this.insuranceState, lVar.insuranceState);
    }

    @Override // i55.v
    /* JADX INFO: renamed from: f0, reason: from getter */
    public final double getFractionRepaid() {
        return this.fractionRepaid;
    }

    @Override // i55.v
    public final m getConfig() {
        return this.config;
    }

    @Override // i55.v
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Override // i55.v
    public final String getCurrency() {
        return this.currency;
    }

    @Override // i55.v
    public final String getId() {
        return this.id;
    }

    @Override // i55.v
    public final String getName() {
        return this.name;
    }

    @Override // i55.v
    public final g0 getState() {
        return this.state;
    }

    public final int hashCode() {
        int iC = a0.d.c(a0.d.c(p.a.c(p.a.c(wp5.y.a(wp5.y.a(p.a.c(this.id.hashCode() * 31, 31, this.name), 31, this.disbursalDate), 31, this.finalRepaymentDate), 31, this.currency), 31, this.countryCode), 31, this.principal), 31, this.outstandingPrincipal);
        Long l2 = this.outstandingRescheduledPrincipal;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.fixedOutstandingBalance;
        int iHashCode2 = (this.interestRate.hashCode() + j6.a.b(this.remainingTerm, j6.a.b(this.repaidCount, p.a.c((this.config.hashCode() + ((this.state.hashCode() + m72.b.c(a0.d.c(a0.d.c((iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31, 31, this.totalRepaid), 31, this.totalToRepay), this.fractionRepaid, 31)) * 31)) * 31, 31, this.product), 31), 31)) * 31;
        o oVar = this.nextInstalment;
        int iHashCode3 = (iHashCode2 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        d0 d0Var = this.lastPaidRepayment;
        int iHashCode4 = (iHashCode3 + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        y yVar = this.refurbishment;
        int iHashCode5 = (iHashCode4 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        r rVar = this.interestOnly;
        int iHashCode6 = (iHashCode5 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        List<Object> list = this.insurancePolicies;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        q qVar = this.insuranceState;
        return iHashCode7 + (qVar != null ? qVar.hashCode() : 0);
    }

    @Override // i55.v
    /* JADX INFO: renamed from: j, reason: from getter */
    public final o getNextInstalment() {
        return this.nextInstalment;
    }

    @Override // i55.v
    /* JADX INFO: renamed from: k0, reason: from getter */
    public final s getInterestRate() {
        return this.interestRate;
    }

    @Override // i55.v
    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getProduct() {
        return this.product;
    }

    @Override // i55.v
    /* JADX INFO: renamed from: p0, reason: from getter */
    public final LocalDate getDisbursalDate() {
        return this.disbursalDate;
    }

    @Override // i55.v
    /* JADX INFO: renamed from: z, reason: from getter */
    public final r getInterestOnly() {
        return this.interestOnly;
    }
}
