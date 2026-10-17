package i7c;

import ip0.v7;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u0000 $2\u00020\u0001:\u0002\t\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\t\u0010\u001dR \u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\u0012\u0010\"¨\u0006%"}, d2 = {"Li7c/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "f", "repayment", "", "Z", "g", "()Z", "upfrontPayment", "Ljo3/a;", "d", "Ljo3/a;", "()Ljo3/a;", "advertisedInstalmentAmount", "", "e", "Ljava/lang/Double;", "()Ljava/lang/Double;", "interestRate", "Ljava/math/BigDecimal;", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "apr", "", "Li7c/b$b;", "Ljava/util/List;", "()Ljava/util/List;", "instalments", "Companion", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("repaymentSchedule")
    @NotNull
    private final String repayment;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("upfrontPayment")
    private final boolean upfrontPayment;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("advertisedInstalmentAmount")
    @NotNull
    private final jo3.a advertisedInstalmentAmount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("interestRate")
    private final Double interestRate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("annualPercentageRate")
    @NotNull
    private final BigDecimal apr;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("instalments")
    @NotNull
    private final List<C0914b> instalments;

    /* JADX INFO: renamed from: i7c.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u0010"}, d2 = {"Li7c/b$b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "b", "()J", "dueDate", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "amount", "Companion", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C0914b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("dueDate")
        private final long dueDate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("amount")
        @NotNull
        private final jo3.a amount;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getAmount() {
            return this.amount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getDueDate() {
            return this.dueDate;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C0914b)) {
                return false;
            }
            C0914b c0914b = (C0914b) obj2;
            return this.dueDate == c0914b.dueDate && Intrinsics.f(this.amount, c0914b.amount);
        }

        public final int hashCode() {
            return this.amount.hashCode() + (Long.hashCode(this.dueDate) * 31);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAdvertisedInstalmentAmount() {
        return this.advertisedInstalmentAmount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getApr() {
        return this.apr;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getInstalments() {
        return this.instalments;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Double getInterestRate() {
        return this.interestRate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.repayment, bVar.repayment) && this.upfrontPayment == bVar.upfrontPayment && Intrinsics.f(this.advertisedInstalmentAmount, bVar.advertisedInstalmentAmount) && Intrinsics.f(this.interestRate, bVar.interestRate) && Intrinsics.f(this.apr, bVar.apr) && Intrinsics.f(this.instalments, bVar.instalments);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getRepayment() {
        return this.repayment;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getUpfrontPayment() {
        return this.upfrontPayment;
    }

    public final int hashCode() {
        int iJ = v7.j(this.advertisedInstalmentAmount, j6.a.c(p.a.c(this.id.hashCode() * 31, 31, this.repayment), 31, this.upfrontPayment), 31);
        Double d = this.interestRate;
        return this.instalments.hashCode() + t61.a.d(this.apr, (iJ + (d == null ? 0 : d.hashCode())) * 31, 31);
    }
}
