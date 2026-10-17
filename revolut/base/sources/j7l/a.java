package j7l;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Lj7l/a;", "", "", "toString", "()Ljava/lang/String;", "Lj7l/a$a;", "a", "Lj7l/a$a;", "b", "()Lj7l/a$a;", "transaction", "paymentRequest", "feature_shared_configuration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("transaction")
    @NotNull
    private final C0977a transaction;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentRequest")
    @NotNull
    private final C0977a paymentRequest;

    /* JADX INFO: renamed from: j7l.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000e\u0010\t¨\u0006\u0010"}, d2 = {"Lj7l/a$a;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "c", "()Ljo3/a;", "min", "b", "max", "daily", "d", "monthly", "feature_shared_configuration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C0977a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("min")
        @NotNull
        private final jo3.a min;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("max")
        @NotNull
        private final jo3.a max;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("daily")
        @NotNull
        private final jo3.a daily;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("monthly")
        @NotNull
        private final jo3.a monthly;

        public C0977a(jo3.a min, jo3.a max, jo3.a daily, jo3.a monthly) {
            Intrinsics.checkNotNullParameter(min, "min");
            Intrinsics.checkNotNullParameter(max, "max");
            Intrinsics.checkNotNullParameter(daily, "daily");
            Intrinsics.checkNotNullParameter(monthly, "monthly");
            this.min = min;
            this.max = max;
            this.daily = daily;
            this.monthly = monthly;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getDaily() {
            return this.daily;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final jo3.a getMax() {
            return this.max;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final jo3.a getMin() {
            return this.min;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final jo3.a getMonthly() {
            return this.monthly;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C0977a)) {
                return false;
            }
            C0977a c0977a = (C0977a) obj2;
            return Intrinsics.f(this.min, c0977a.min) && Intrinsics.f(this.max, c0977a.max) && Intrinsics.f(this.daily, c0977a.daily) && Intrinsics.f(this.monthly, c0977a.monthly);
        }

        public final int hashCode() {
            return this.monthly.hashCode() + v7.j(this.daily, v7.j(this.max, this.min.hashCode() * 31, 31), 31);
        }
    }

    public a(C0977a transaction, C0977a paymentRequest) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(paymentRequest, "paymentRequest");
        this.transaction = transaction;
        this.paymentRequest = paymentRequest;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C0977a getPaymentRequest() {
        return this.paymentRequest;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C0977a getTransaction() {
        return this.transaction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.transaction, aVar.transaction) && Intrinsics.f(this.paymentRequest, aVar.paymentRequest);
    }

    public final int hashCode() {
        return this.paymentRequest.hashCode() + (this.transaction.hashCode() * 31);
    }
}
