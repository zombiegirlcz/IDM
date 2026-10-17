package wt6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0003\u0007\u000b\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0010"}, d2 = {"Lwt6/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "period", "Lwt6/e$b;", "Lwt6/e$b;", "c", "()Lwt6/e$b;", "summary", "nextVatReturnDueDate", "Companion", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("period")
    @NotNull
    private final String period;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("summary")
    @NotNull
    private final b summary;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("nextVatReturnDueDate")
    @NotNull
    private final String nextVatReturnDueDate;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\rR\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u000f\u0010\t¨\u0006\u0011"}, d2 = {"Lwt6/e$b;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "b", "()Ljo3/a;", "totalSales", "Lwt6/e$c;", "Lwt6/e$c;", "()Lwt6/e$c;", "taxRate", "c", "totalTax", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("totalSales")
        @NotNull
        private final jo3.a totalSales;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("taxRate")
        private final c taxRate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("totalTax")
        @NotNull
        private final jo3.a totalTax;

        public b(jo3.a totalSales, c cVar, jo3.a totalTax) {
            Intrinsics.checkNotNullParameter(totalSales, "totalSales");
            Intrinsics.checkNotNullParameter(totalTax, "totalTax");
            this.totalSales = totalSales;
            this.taxRate = cVar;
            this.totalTax = totalTax;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final c getTaxRate() {
            return this.taxRate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final jo3.a getTotalSales() {
            return this.totalSales;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final jo3.a getTotalTax() {
            return this.totalTax;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.totalSales, bVar.totalSales) && Intrinsics.f(this.taxRate, bVar.taxRate) && Intrinsics.f(this.totalTax, bVar.totalTax);
        }

        public final int hashCode() {
            int iHashCode = this.totalSales.hashCode() * 31;
            c cVar = this.taxRate;
            return this.totalTax.hashCode() + ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Lwt6/e$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "type", "", "b", "D", "()D", "value", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        private final double value;

        public c(String type, double d) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
            this.value = d;
        }

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
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.type, cVar.type) && Double.compare(this.value, cVar.value) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.value) + (this.type.hashCode() * 31);
        }
    }

    public e(String period, b summary, String nextVatReturnDueDate) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(nextVatReturnDueDate, "nextVatReturnDueDate");
        this.period = period;
        this.summary = summary;
        this.nextVatReturnDueDate = nextVatReturnDueDate;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getNextVatReturnDueDate() {
        return this.nextVatReturnDueDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getSummary() {
        return this.summary;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.period, eVar.period) && Intrinsics.f(this.summary, eVar.summary) && Intrinsics.f(this.nextVatReturnDueDate, eVar.nextVatReturnDueDate);
    }

    public final int hashCode() {
        return this.nextVatReturnDueDate.hashCode() + ((this.summary.hashCode() + (this.period.hashCode() * 31)) * 31);
    }
}
