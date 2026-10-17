package g7c;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\f\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014¨\u0006\u0016"}, d2 = {"Lg7c/b;", "", "", "toString", "()Ljava/lang/String;", "Lg7c/b$b;", "a", "Lg7c/b$b;", "d", "()Lg7c/b$b;", "rate", "Ljo3/a;", "b", "Ljo3/a;", "()Ljo3/a;", "billAmount", "c", "billAmountWithCharges", "Lg7c/b$a;", "Lg7c/b$a;", "()Lg7c/b$a;", "charges", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("rate")
    @NotNull
    private final C0820b rate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("billAmount")
    @NotNull
    private final jo3.a billAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("billAmountWithCharges")
    @NotNull
    private final jo3.a billAmountWithCharges;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("charges")
    private final a charges;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lg7c/b$a;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "()Ljo3/a;", "total", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("total")
        @NotNull
        private final jo3.a total;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getTotal() {
            return this.total;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.total, ((a) obj2).total);
        }

        public final int hashCode() {
            return this.total.hashCode();
        }
    }

    /* JADX INFO: renamed from: g7c.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\r\u0010\u0004¨\u0006\u000f"}, d2 = {"Lg7c/b$b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "D", "b", "()D", "rate", "Ljava/lang/String;", "from", "c", "to", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C0820b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("rate")
        private final double rate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("from")
        @NotNull
        private final String from;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("to")
        @NotNull
        private final String to;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFrom() {
            return this.from;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final double getRate() {
            return this.rate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTo() {
            return this.to;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C0820b)) {
                return false;
            }
            C0820b c0820b = (C0820b) obj2;
            return Double.compare(this.rate, c0820b.rate) == 0 && Intrinsics.f(this.from, c0820b.from) && Intrinsics.f(this.to, c0820b.to);
        }

        public final int hashCode() {
            return this.to.hashCode() + p.a.c(Double.hashCode(this.rate) * 31, 31, this.from);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getBillAmount() {
        return this.billAmount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getBillAmountWithCharges() {
        return this.billAmountWithCharges;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getCharges() {
        return this.charges;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final C0820b getRate() {
        return this.rate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.rate, bVar.rate) && Intrinsics.f(this.billAmount, bVar.billAmount) && Intrinsics.f(this.billAmountWithCharges, bVar.billAmountWithCharges) && Intrinsics.f(this.charges, bVar.charges);
    }

    public final int hashCode() {
        int iJ = v7.j(this.billAmountWithCharges, v7.j(this.billAmount, this.rate.hashCode() * 31, 31), 31);
        a aVar = this.charges;
        return iJ + (aVar == null ? 0 : aVar.hashCode());
    }
}
