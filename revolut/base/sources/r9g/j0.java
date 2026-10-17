package r9g;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public abstract class j0 {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00108\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\f\u0010\u0017¨\u0006\u0019"}, d2 = {"Lr9g/j0$a;", "Lr9g/j0;", "", "toString", "()Ljava/lang/String;", "Lr9g/w;", "a", "Lr9g/w;", "c", "()Lr9g/w;", "amountOwed", "Lr9g/z;", "b", "Lr9g/z;", "()Lr9g/z;", "fees", "Lr9g/a0;", "Lr9g/a0;", "d", "()Lr9g/a0;", "pricing", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "penalty", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("amountOwed")
        @NotNull
        private final w amountOwed;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("fees")
        private final z fees;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("pricing")
        @NotNull
        private final a0 pricing;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("penalty")
        private final jo3.a penalty;

        @Override // r9g.j0
        /* JADX INFO: renamed from: a, reason: from getter */
        public final z getFees() {
            return this.fees;
        }

        @Override // r9g.j0
        /* JADX INFO: renamed from: b, reason: from getter */
        public final jo3.a getPenalty() {
            return this.penalty;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final w getAmountOwed() {
            return this.amountOwed;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final a0 getPricing() {
            return this.pricing;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.amountOwed, aVar.amountOwed) && Intrinsics.f(this.fees, aVar.fees) && Intrinsics.f(this.pricing, aVar.pricing) && Intrinsics.f(this.penalty, aVar.penalty);
        }

        public final int hashCode() {
            int iHashCode = this.amountOwed.hashCode() * 31;
            z zVar = this.fees;
            int iHashCode2 = (this.pricing.hashCode() + ((iHashCode + (zVar == null ? 0 : zVar.hashCode())) * 31)) * 31;
            jo3.a aVar = this.penalty;
            return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\f\u0010\u0012¨\u0006\u0014"}, d2 = {"Lr9g/j0$b;", "Lr9g/j0;", "", "toString", "()Ljava/lang/String;", "Lr9g/a0;", "a", "Lr9g/a0;", "c", "()Lr9g/a0;", "pricing", "Lr9g/z;", "b", "Lr9g/z;", "()Lr9g/z;", "fees", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "penalty", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("pricing")
        @NotNull
        private final a0 pricing;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("fees")
        private final z fees;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("penalty")
        private final jo3.a penalty;

        @Override // r9g.j0
        /* JADX INFO: renamed from: a, reason: from getter */
        public final z getFees() {
            return this.fees;
        }

        @Override // r9g.j0
        /* JADX INFO: renamed from: b, reason: from getter */
        public final jo3.a getPenalty() {
            return this.penalty;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final a0 getPricing() {
            return this.pricing;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.pricing, bVar.pricing) && Intrinsics.f(this.fees, bVar.fees) && Intrinsics.f(this.penalty, bVar.penalty);
        }

        public final int hashCode() {
            int iHashCode = this.pricing.hashCode() * 31;
            z zVar = this.fees;
            int iHashCode2 = (iHashCode + (zVar == null ? 0 : zVar.hashCode())) * 31;
            jo3.a aVar = this.penalty;
            return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00108\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\f\u0010\u0017¨\u0006\u0019"}, d2 = {"Lr9g/j0$c;", "Lr9g/j0;", "", "toString", "()Ljava/lang/String;", "Lr9g/f0;", "a", "Lr9g/f0;", "d", "()Lr9g/f0;", "refund", "Lr9g/z;", "b", "Lr9g/z;", "()Lr9g/z;", "fees", "Lr9g/a0;", "c", "Lr9g/a0;", "()Lr9g/a0;", "pricing", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "penalty", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c extends j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("refund")
        @NotNull
        private final f0 refund;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("fees")
        private final z fees;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("pricing")
        @NotNull
        private final a0 pricing;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("penalty")
        private final jo3.a penalty;

        @Override // r9g.j0
        /* JADX INFO: renamed from: a, reason: from getter */
        public final z getFees() {
            return this.fees;
        }

        @Override // r9g.j0
        /* JADX INFO: renamed from: b, reason: from getter */
        public final jo3.a getPenalty() {
            return this.penalty;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final a0 getPricing() {
            return this.pricing;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final f0 getRefund() {
            return this.refund;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.refund, cVar.refund) && Intrinsics.f(this.fees, cVar.fees) && Intrinsics.f(this.pricing, cVar.pricing) && Intrinsics.f(this.penalty, cVar.penalty);
        }

        public final int hashCode() {
            int iHashCode = this.refund.hashCode() * 31;
            z zVar = this.fees;
            int iHashCode2 = (this.pricing.hashCode() + ((iHashCode + (zVar == null ? 0 : zVar.hashCode())) * 31)) * 31;
            jo3.a aVar = this.penalty;
            return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0014"}, d2 = {"Lr9g/j0$d;", "Lr9g/j0;", "", "toString", "()Ljava/lang/String;", "Lr9g/z;", "a", "Lr9g/z;", "()Lr9g/z;", "fees", "Lr9g/a0;", "b", "Lr9g/a0;", "c", "()Lr9g/a0;", "pricing", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "penalty", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d extends j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("fees")
        private final z fees;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("pricing")
        @NotNull
        private final a0 pricing;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("penalty")
        private final jo3.a penalty;

        @Override // r9g.j0
        /* JADX INFO: renamed from: a, reason: from getter */
        public final z getFees() {
            return this.fees;
        }

        @Override // r9g.j0
        /* JADX INFO: renamed from: b, reason: from getter */
        public final jo3.a getPenalty() {
            return this.penalty;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final a0 getPricing() {
            return this.pricing;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.fees, dVar.fees) && Intrinsics.f(this.pricing, dVar.pricing) && Intrinsics.f(this.penalty, dVar.penalty);
        }

        public final int hashCode() {
            z zVar = this.fees;
            int iHashCode = (this.pricing.hashCode() + ((zVar == null ? 0 : zVar.hashCode()) * 31)) * 31;
            jo3.a aVar = this.penalty;
            return iHashCode + (aVar != null ? aVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr9g/j0$e;", "Lr9g/j0;", "<init>", "()V", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e extends j0 {
        private e() {
        }

        @Override // r9g.j0
        /* JADX INFO: renamed from: a */
        public final z getFees() {
            return null;
        }

        @Override // r9g.j0
        /* JADX INFO: renamed from: b */
        public final jo3.a getPenalty() {
            return null;
        }
    }

    private j0() {
    }

    /* JADX INFO: renamed from: a */
    public abstract z getFees();

    /* JADX INFO: renamed from: b */
    public abstract jo3.a getPenalty();
}
