package cr9;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class i {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u0012R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcr9/i$a;", "Lcr9/i;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "", "b", "J", "()J", "amount", "c", "currencyCode", "d", "Ljava/lang/Long;", "()Ljava/lang/Long;", "oweAmount", "e", "owedAmount", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("amount")
        private final long amount;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("currency")
        @NotNull
        private final String currencyCode;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("oweAmount")
        private final Long oweAmount;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("owedAmount")
        private final Long owedAmount;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getAmount() {
            return this.amount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Long getOweAmount() {
            return this.oweAmount;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Long getOwedAmount() {
            return this.owedAmount;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.type, aVar.type) && this.amount == aVar.amount && Intrinsics.f(this.currencyCode, aVar.currencyCode) && Intrinsics.f(this.oweAmount, aVar.oweAmount) && Intrinsics.f(this.owedAmount, aVar.owedAmount);
        }

        public final int hashCode() {
            int iC = p.a.c(a0.d.c(this.type.hashCode() * 31, 31, this.amount), 31, this.currencyCode);
            Long l2 = this.oweAmount;
            int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
            Long l3 = this.owedAmount;
            return iHashCode + (l3 != null ? l3.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u0012R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcr9/i$b;", "Lcr9/i;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "", "b", "J", "()J", "amount", "c", "currencyCode", "d", "Ljava/lang/Long;", "()Ljava/lang/Long;", "oweAmount", "e", "owedAmount", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("amount")
        private final long amount;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("currency")
        @NotNull
        private final String currencyCode;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("oweAmount")
        private final Long oweAmount;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("owedAmount")
        private final Long owedAmount;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getAmount() {
            return this.amount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Long getOweAmount() {
            return this.oweAmount;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Long getOwedAmount() {
            return this.owedAmount;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.type, bVar.type) && this.amount == bVar.amount && Intrinsics.f(this.currencyCode, bVar.currencyCode) && Intrinsics.f(this.oweAmount, bVar.oweAmount) && Intrinsics.f(this.owedAmount, bVar.owedAmount);
        }

        public final int hashCode() {
            int iC = p.a.c(a0.d.c(this.type.hashCode() * 31, 31, this.amount), 31, this.currencyCode);
            Long l2 = this.oweAmount;
            int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
            Long l3 = this.owedAmount;
            return iHashCode + (l3 != null ? l3.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u0012R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcr9/i$c;", "Lcr9/i;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getType", "type", "", "b", "J", "()J", "amount", "c", "currencyCode", "d", "Ljava/lang/Long;", "()Ljava/lang/Long;", "oweAmount", "e", "owedAmount", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("amount")
        private final long amount;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("currency")
        @NotNull
        private final String currencyCode;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("oweAmount")
        private final Long oweAmount;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("owedAmount")
        private final Long owedAmount;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getAmount() {
            return this.amount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Long getOweAmount() {
            return this.oweAmount;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Long getOwedAmount() {
            return this.owedAmount;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.type, cVar.type) && this.amount == cVar.amount && Intrinsics.f(this.currencyCode, cVar.currencyCode) && Intrinsics.f(this.oweAmount, cVar.oweAmount) && Intrinsics.f(this.owedAmount, cVar.owedAmount);
        }

        public final int hashCode() {
            int iC = p.a.c(a0.d.c(this.type.hashCode() * 31, 31, this.amount), 31, this.currencyCode);
            Long l2 = this.oweAmount;
            int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
            Long l3 = this.owedAmount;
            return iHashCode + (l3 != null ? l3.hashCode() : 0);
        }
    }

    private i() {
    }
}
