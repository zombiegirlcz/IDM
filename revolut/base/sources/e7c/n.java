package e7c;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010 \u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\"\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010/\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u00102\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010.R\u001c\u00105\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\u0004R\u001c\u0010;\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"Le7c/n;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getUserPaymentMethodId", "userPaymentMethodId", "b", "getPocketId", "pocketId", "c", "getCvv", "cvv", "d", "getUserEmail", "userEmail", "e", "getSaveFor", "saveFor", "Le7c/m;", "f", "Le7c/m;", "getEnvironment", "()Le7c/m;", "environment", "Le7c/g0;", "g", "Le7c/g0;", "getRevPointsRedemption", "()Le7c/g0;", "revPointsRedemption", "h", "getPaymentSource", "paymentSource", "", "i", "Ljava/util/List;", "getAcceptedConditions", "()Ljava/util/List;", "acceptedConditions", "", "j", "Ljava/lang/Long;", "getAmount", "()Ljava/lang/Long;", "amount", "k", "getTipAmount", "tipAmount", "l", "getPaymentIntentId", "paymentIntentId", "Le7c/e;", "m", "Le7c/e;", "getBuyNowPayLater", "()Le7c/e;", "buyNowPayLater", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("userPaymentMethodId")
    @NotNull
    private final String userPaymentMethodId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("pocketId")
    private final String pocketId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("cvv")
    private final String cvv;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("userEmail")
    private final String userEmail;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("saveFor")
    private final String saveFor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("environment")
    private final m environment;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("revPointsRedemption")
    private final g0 revPointsRedemption;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentSource")
    private final String paymentSource;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("acceptedConditions")
    private final List<String> acceptedConditions;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final Long amount;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("tipAmount")
    private final Long tipAmount;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentIntentId")
    private final String paymentIntentId;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("bnpl")
    private final e buyNowPayLater;

    public n(String userPaymentMethodId, String str, String str2, String str3, String str4, m mVar, g0 g0Var, String str5, List list, Long l2, Long l3, String str6, e eVar) {
        Intrinsics.checkNotNullParameter(userPaymentMethodId, "userPaymentMethodId");
        this.userPaymentMethodId = userPaymentMethodId;
        this.pocketId = str;
        this.cvv = str2;
        this.userEmail = str3;
        this.saveFor = str4;
        this.environment = mVar;
        this.revPointsRedemption = g0Var;
        this.paymentSource = str5;
        this.acceptedConditions = list;
        this.amount = l2;
        this.tipAmount = l3;
        this.paymentIntentId = str6;
        this.buyNowPayLater = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.userPaymentMethodId, nVar.userPaymentMethodId) && Intrinsics.f(this.pocketId, nVar.pocketId) && Intrinsics.f(this.cvv, nVar.cvv) && Intrinsics.f(this.userEmail, nVar.userEmail) && Intrinsics.f(this.saveFor, nVar.saveFor) && Intrinsics.f(this.environment, nVar.environment) && Intrinsics.f(this.revPointsRedemption, nVar.revPointsRedemption) && Intrinsics.f(this.paymentSource, nVar.paymentSource) && Intrinsics.f(this.acceptedConditions, nVar.acceptedConditions) && Intrinsics.f(this.amount, nVar.amount) && Intrinsics.f(this.tipAmount, nVar.tipAmount) && Intrinsics.f(this.paymentIntentId, nVar.paymentIntentId) && Intrinsics.f(this.buyNowPayLater, nVar.buyNowPayLater);
    }

    public final int hashCode() {
        int iHashCode = this.userPaymentMethodId.hashCode() * 31;
        String str = this.pocketId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cvv;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userEmail;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.saveFor;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        m mVar = this.environment;
        int iHashCode6 = (iHashCode5 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        g0 g0Var = this.revPointsRedemption;
        int iHashCode7 = (iHashCode6 + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
        String str5 = this.paymentSource;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list = this.acceptedConditions;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        Long l2 = this.amount;
        int iHashCode10 = (iHashCode9 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.tipAmount;
        int iHashCode11 = (iHashCode10 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str6 = this.paymentIntentId;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        e eVar = this.buyNowPayLater;
        return iHashCode12 + (eVar != null ? eVar.hashCode() : 0);
    }
}
