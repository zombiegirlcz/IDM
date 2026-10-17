package e7c;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\r\u0010\u0012R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004¨\u0006\u001c"}, d2 = {"Le7c/e0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "orderToken", "f", "paymentToken", "c", "paymentId", "d", "e", "paymentState", "Le7c/e0$b;", "Le7c/e0$b;", "()Le7c/e0$b;", "paymentMethod", "Le7c/e0$a;", "Le7c/e0$a;", "()Le7c/e0$a;", "authenticationChallenge", "g", "reason", "h", "reasonDetails", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("orderToken")
    @NotNull
    private final String orderToken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentToken")
    @NotNull
    private final String paymentToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentId")
    @NotNull
    private final String paymentId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("paymentState")
    @NotNull
    private final String paymentState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("paymentMethod")
    @NotNull
    private final b paymentMethod;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("authenticationChallenge")
    private final a authenticationChallenge;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("reason")
    private final String reason;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("reasonDetails")
    private final String reasonDetails;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\r\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0015"}, d2 = {"Le7c/e0$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "type", "b", "acsUrl", "c", "fingerprintUrl", "d", "fingerprintData", "", "e", "Ljava/util/List;", "()Ljava/util/List;", "ssoAuthenticationContextClassReferences", "ssoState", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("acsUrl")
        private final String acsUrl;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("fingerprintUrl")
        private final String fingerprintUrl;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("fingerprintData")
        private final String fingerprintData;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("ssoAuthenticationContextClassReferences")
        private final List<String> ssoAuthenticationContextClassReferences;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("ssoState")
        private final String ssoState;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAcsUrl() {
            return this.acsUrl;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFingerprintData() {
            return this.fingerprintData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getFingerprintUrl() {
            return this.fingerprintUrl;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final List getSsoAuthenticationContextClassReferences() {
            return this.ssoAuthenticationContextClassReferences;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getSsoState() {
            return this.ssoState;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.type, aVar.type) && Intrinsics.f(this.acsUrl, aVar.acsUrl) && Intrinsics.f(this.fingerprintUrl, aVar.fingerprintUrl) && Intrinsics.f(this.fingerprintData, aVar.fingerprintData) && Intrinsics.f(this.ssoAuthenticationContextClassReferences, aVar.ssoAuthenticationContextClassReferences) && Intrinsics.f(this.ssoState, aVar.ssoState);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            String str = this.acsUrl;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.fingerprintUrl;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.fingerprintData;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            List<String> list = this.ssoAuthenticationContextClassReferences;
            int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
            String str4 = this.ssoState;
            return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Le7c/e0$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "type", "transactionId", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("transactionId")
        private final String transactionId;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getTransactionId() {
            return this.transactionId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.type, bVar.type) && Intrinsics.f(this.transactionId, bVar.transactionId);
        }

        public final int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            String str = this.transactionId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getAuthenticationChallenge() {
        return this.authenticationChallenge;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getOrderToken() {
        return this.orderToken;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPaymentId() {
        return this.paymentId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPaymentState() {
        return this.paymentState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.orderToken, e0Var.orderToken) && Intrinsics.f(this.paymentToken, e0Var.paymentToken) && Intrinsics.f(this.paymentId, e0Var.paymentId) && Intrinsics.f(this.paymentState, e0Var.paymentState) && Intrinsics.f(this.paymentMethod, e0Var.paymentMethod) && Intrinsics.f(this.authenticationChallenge, e0Var.authenticationChallenge) && Intrinsics.f(this.reason, e0Var.reason) && Intrinsics.f(this.reasonDetails, e0Var.reasonDetails);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPaymentToken() {
        return this.paymentToken;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getReasonDetails() {
        return this.reasonDetails;
    }

    public final int hashCode() {
        int iHashCode = (this.paymentMethod.hashCode() + p.a.c(p.a.c(p.a.c(this.orderToken.hashCode() * 31, 31, this.paymentToken), 31, this.paymentId), 31, this.paymentState)) * 31;
        a aVar = this.authenticationChallenge;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.reason;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.reasonDetails;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
