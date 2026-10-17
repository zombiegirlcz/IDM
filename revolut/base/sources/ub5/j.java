package ub5;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public abstract class j {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\b\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014¨\u0006\u0016"}, d2 = {"Lub5/j$a;", "Lub5/j;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "b", "d", "paymentType", "c", "e", "state", "", "I", "()I", "paymentDay", "Lub5/i;", "Lub5/i;", "()Lub5/i;", "paymentSource", "feature_credit_card_autopay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("paymentType")
        @NotNull
        private final String paymentType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("state")
        @NotNull
        private final String state;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("paymentDay")
        private final int paymentDay;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("paymentSource")
        @NotNull
        private final i paymentSource;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getPaymentDay() {
            return this.paymentDay;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final i getPaymentSource() {
            return this.paymentSource;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getPaymentType() {
            return this.paymentType;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getState() {
            return this.state;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.paymentType, aVar.paymentType) && Intrinsics.f(this.state, aVar.state) && this.paymentDay == aVar.paymentDay && Intrinsics.f(this.paymentSource, aVar.paymentSource);
        }

        public final int hashCode() {
            return this.paymentSource.hashCode() + j6.a.b(this.paymentDay, p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.paymentType), 31, this.state), 31);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u000b\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\b\u0010\u001e¨\u0006 "}, d2 = {"Lub5/j$b;", "Lub5/j;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "b", "f", "paymentType", "c", "g", "state", "", "d", "I", "()I", "paymentDay", "Lub5/i;", "e", "Lub5/i;", "()Lub5/i;", "paymentSource", "Lub5/g;", "Lub5/g;", "()Lub5/g;", "paymentAmount", "", "J", "()J", "nextPaymentDate", "feature_credit_card_autopay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends j {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("paymentType")
        @NotNull
        private final String paymentType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("state")
        @NotNull
        private final String state;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("paymentDay")
        private final int paymentDay;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("paymentSource")
        @NotNull
        private final i paymentSource;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("paymentAmount")
        @NotNull
        private final g paymentAmount;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("nextPaymentDate")
        private final long nextPaymentDate;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getNextPaymentDate() {
            return this.nextPaymentDate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final g getPaymentAmount() {
            return this.paymentAmount;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getPaymentDay() {
            return this.paymentDay;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final i getPaymentSource() {
            return this.paymentSource;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.paymentType, bVar.paymentType) && Intrinsics.f(this.state, bVar.state) && this.paymentDay == bVar.paymentDay && Intrinsics.f(this.paymentSource, bVar.paymentSource) && Intrinsics.f(this.paymentAmount, bVar.paymentAmount) && this.nextPaymentDate == bVar.nextPaymentDate;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getPaymentType() {
            return this.paymentType;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getState() {
            return this.state;
        }

        public final int hashCode() {
            return Long.hashCode(this.nextPaymentDate) + ((this.paymentAmount.hashCode() + ((this.paymentSource.hashCode() + j6.a.b(this.paymentDay, p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.paymentType), 31, this.state), 31)) * 31)) * 31);
        }
    }

    private j() {
    }
}
