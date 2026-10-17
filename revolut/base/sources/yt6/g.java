package yt6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001:\u0004\u0005\u000b\t\u000fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u0010"}, d2 = {"Lyt6/g;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "assessmentPeriod", "Lyt6/g$a;", "b", "Lyt6/g$a;", "c", "()Lyt6/g$a;", "summary", "nextVatReturnDueDate", "d", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("assessmentPeriod")
    @NotNull
    private final String assessmentPeriod;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("summary")
    @NotNull
    private final a summary;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextVatReturnDueDate")
    @NotNull
    private final String nextVatReturnDueDate;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Lyt6/g$a;", "", "", "toString", "()Ljava/lang/String;", "Lyt6/g$c;", "a", "Lyt6/g$c;", "b", "()Lyt6/g$c;", "totalSales", "Lyt6/g$b;", "Lyt6/g$b;", "()Lyt6/g$b;", "taxRate", "Lyt6/g$d;", "c", "Lyt6/g$d;", "()Lyt6/g$d;", "totalTax", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("totalSales")
        @NotNull
        private final c totalSales;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("taxRate")
        private final b taxRate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("totalTax")
        @NotNull
        private final d totalTax;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getTaxRate() {
            return this.taxRate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final c getTotalSales() {
            return this.totalSales;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final d getTotalTax() {
            return this.totalTax;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.totalSales, aVar.totalSales) && Intrinsics.f(this.taxRate, aVar.taxRate) && Intrinsics.f(this.totalTax, aVar.totalTax);
        }

        public final int hashCode() {
            int iHashCode = this.totalSales.hashCode() * 31;
            b bVar = this.taxRate;
            return this.totalTax.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Lyt6/g$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "type", "", "b", "D", "()D", "value", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        private final double value;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final double getValue() {
            return this.value;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.type, bVar.type) && Double.compare(this.value, bVar.value) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.value) + (this.type.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Lyt6/g$c;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "()J", "amount", "b", "Ljava/lang/String;", "currency", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("amount")
        private final long amount;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("currency")
        @NotNull
        private final String currency;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getAmount() {
            return this.amount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
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
            return this.amount == cVar.amount && Intrinsics.f(this.currency, cVar.currency);
        }

        public final int hashCode() {
            return this.currency.hashCode() + (Long.hashCode(this.amount) * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Lyt6/g$d;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "()J", "amount", "b", "Ljava/lang/String;", "currency", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("amount")
        private final long amount;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("currency")
        @NotNull
        private final String currency;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getAmount() {
            return this.amount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return this.amount == dVar.amount && Intrinsics.f(this.currency, dVar.currency);
        }

        public final int hashCode() {
            return this.currency.hashCode() + (Long.hashCode(this.amount) * 31);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAssessmentPeriod() {
        return this.assessmentPeriod;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNextVatReturnDueDate() {
        return this.nextVatReturnDueDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getSummary() {
        return this.summary;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.assessmentPeriod, gVar.assessmentPeriod) && Intrinsics.f(this.summary, gVar.summary) && Intrinsics.f(this.nextVatReturnDueDate, gVar.nextVatReturnDueDate);
    }

    public final int hashCode() {
        return this.nextVatReturnDueDate.hashCode() + ((this.summary.hashCode() + (this.assessmentPeriod.hashCode() * 31)) * 31);
    }
}
