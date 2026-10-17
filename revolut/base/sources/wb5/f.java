package wb5;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public abstract class f {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\b\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000b\u0010\u0015¨\u0006\u0017"}, d2 = {"Lwb5/f$a;", "Lwb5/f;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "b", "d", "state", "c", "getPaymentType", "paymentType", "", "I", "()I", "paymentDay", "Lwb5/e;", "e", "Lwb5/e;", "()Lwb5/e;", "paymentSource", "feature_credit_card_autopay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("state")
        @NotNull
        private final String state;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("paymentType")
        @NotNull
        private final String paymentType;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("paymentDay")
        private final int paymentDay;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("paymentSource")
        @NotNull
        private final e paymentSource;

        public a(String id10, String state, String paymentType, int i, e paymentSource) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(paymentType, "paymentType");
            Intrinsics.checkNotNullParameter(paymentSource, "paymentSource");
            this.id = id10;
            this.state = state;
            this.paymentType = paymentType;
            this.paymentDay = i;
            this.paymentSource = paymentSource;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getPaymentDay() {
            return this.paymentDay;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final e getPaymentSource() {
            return this.paymentSource;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
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
            return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.state, aVar.state) && Intrinsics.f(this.paymentType, aVar.paymentType) && this.paymentDay == aVar.paymentDay && Intrinsics.f(this.paymentSource, aVar.paymentSource);
        }

        public final int hashCode() {
            return this.paymentSource.hashCode() + j6.a.b(this.paymentDay, p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.state), 31, this.paymentType), 31);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0006\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u001a\u0010 \u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u000b\u0010\u001f¨\u0006!"}, d2 = {"Lwb5/f$b;", "Lwb5/f;", "", "toString", "()Ljava/lang/String;", "Lwb5/c;", "a", "Lwb5/c;", "c", "()Lwb5/c;", "paymentAmount", "b", "Ljava/lang/String;", "id", "f", "state", "d", "getPaymentType", "paymentType", "", "e", "I", "()I", "paymentDay", "Lwb5/e;", "Lwb5/e;", "()Lwb5/e;", "paymentSource", "", "g", "J", "()J", "nextPaymentDate", "feature_credit_card_autopay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("paymentAmount")
        @NotNull
        private final c paymentAmount;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("state")
        @NotNull
        private final String state;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("paymentType")
        @NotNull
        private final String paymentType;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("paymentDay")
        private final int paymentDay;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("paymentSource")
        @NotNull
        private final e paymentSource;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("nextPaymentDate")
        private final long nextPaymentDate;

        public b(c paymentAmount, String id10, String state, String paymentType, int i, e paymentSource, long j2) {
            Intrinsics.checkNotNullParameter(paymentAmount, "paymentAmount");
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(paymentType, "paymentType");
            Intrinsics.checkNotNullParameter(paymentSource, "paymentSource");
            this.paymentAmount = paymentAmount;
            this.id = id10;
            this.state = state;
            this.paymentType = paymentType;
            this.paymentDay = i;
            this.paymentSource = paymentSource;
            this.nextPaymentDate = j2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getNextPaymentDate() {
            return this.nextPaymentDate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final c getPaymentAmount() {
            return this.paymentAmount;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getPaymentDay() {
            return this.paymentDay;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final e getPaymentSource() {
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
            return Intrinsics.f(this.paymentAmount, bVar.paymentAmount) && Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.state, bVar.state) && Intrinsics.f(this.paymentType, bVar.paymentType) && this.paymentDay == bVar.paymentDay && Intrinsics.f(this.paymentSource, bVar.paymentSource) && this.nextPaymentDate == bVar.nextPaymentDate;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getState() {
            return this.state;
        }

        public final int hashCode() {
            return Long.hashCode(this.nextPaymentDate) + ((this.paymentSource.hashCode() + j6.a.b(this.paymentDay, p.a.c(p.a.c(p.a.c(this.paymentAmount.hashCode() * 31, 31, this.id), 31, this.state), 31, this.paymentType), 31)) * 31);
        }
    }

    private f() {
    }
}
