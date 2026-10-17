package dj9;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class u {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0006\u0010\u0013¨\u0006\u0015"}, d2 = {"Ldj9/u$a;", "Ldj9/u;", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "getLocked", "()Z", "locked", "", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "reasonCode", "Ljo3/a;", "c", "Ljo3/a;", "()Ljo3/a;", "minPurchaseAmount", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("locked")
        private final boolean locked;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("reasonCode")
        private final Integer reasonCode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("minPurchaseAmount")
        private final jo3.a minPurchaseAmount;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getMinPurchaseAmount() {
            return this.minPurchaseAmount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getReasonCode() {
            return this.reasonCode;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return this.locked == aVar.locked && Intrinsics.f(this.reasonCode, aVar.reasonCode) && Intrinsics.f(this.minPurchaseAmount, aVar.minPurchaseAmount);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.locked) * 31;
            Integer num = this.reasonCode;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            jo3.a aVar = this.minPurchaseAmount;
            return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\rR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000f\u0010\r¨\u0006\u0011"}, d2 = {"Ldj9/u$b;", "Ldj9/u;", "", "toString", "()Ljava/lang/String;", "", "a", "J", "b", "()J", "endTime", "", "I", "()I", "duration", "c", "term", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends u {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("endTime")
        private final long endTime;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("duration")
        private final int duration;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("term")
        private final int term;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getDuration() {
            return this.duration;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getEndTime() {
            return this.endTime;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getTerm() {
            return this.term;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return this.endTime == bVar.endTime && this.duration == bVar.duration && this.term == bVar.term;
        }

        public final int hashCode() {
            return Integer.hashCode(this.term) + j6.a.b(this.duration, Long.hashCode(this.endTime) * 31, 31);
        }
    }

    private u() {
    }
}
