package mt6;

import a0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u0000 \u00162\u00020\u0001:\u0002\u0005\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004¨\u0006\u0017"}, d2 = {"Lmt6/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "eventType", "", "J", "e", "()J", "timestamp", "Lmt6/a$a;", "c", "Lmt6/a$a;", "()Lmt6/a$a;", "attribute", "d", "refundTransactionId", "failureReason", "Companion", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("state")
    @NotNull
    private final String eventType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("timestamp")
    private final long timestamp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("attributes")
    private final C1176a attribute;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("refundTransactionId")
    private final String refundTransactionId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @b("reason")
    private final String failureReason;

    /* JADX INFO: renamed from: mt6.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0086\b\u0018\u0000 \r2\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\u0004¨\u0006\u000e"}, d2 = {"Lmt6/a$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Long;", "()Ljava/lang/Long;", "amount", "b", "Ljava/lang/String;", "currency", "Companion", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1176a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @b("amount")
        private final Long amount;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @b("currency")
        private final String currency;

        public C1176a(Long l2, String str) {
            this.amount = l2;
            this.currency = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Long getAmount() {
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
            if (!(obj2 instanceof C1176a)) {
                return false;
            }
            C1176a c1176a = (C1176a) obj2;
            return Intrinsics.f(this.amount, c1176a.amount) && Intrinsics.f(this.currency, c1176a.currency);
        }

        public final int hashCode() {
            Long l2 = this.amount;
            int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
            String str = this.currency;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }
    }

    public a(String eventType, long j2, C1176a c1176a, String str, String str2) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.eventType = eventType;
        this.timestamp = j2;
        this.attribute = c1176a;
        this.refundTransactionId = str;
        this.failureReason = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C1176a getAttribute() {
        return this.attribute;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFailureReason() {
        return this.failureReason;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRefundTransactionId() {
        return this.refundTransactionId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.eventType, aVar.eventType) && this.timestamp == aVar.timestamp && Intrinsics.f(this.attribute, aVar.attribute) && Intrinsics.f(this.refundTransactionId, aVar.refundTransactionId) && Intrinsics.f(this.failureReason, aVar.failureReason);
    }

    public final int hashCode() {
        int iC = d.c(this.eventType.hashCode() * 31, 31, this.timestamp);
        C1176a c1176a = this.attribute;
        int iHashCode = (iC + (c1176a == null ? 0 : c1176a.hashCode())) * 31;
        String str = this.refundTransactionId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.failureReason;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
