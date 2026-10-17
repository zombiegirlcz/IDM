package ehc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u000f"}, d2 = {"Lehc/p;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "webhook", "b", "promoCode", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "hasCountrySpecificCashback", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("webhook")
    private final String webhook;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("promoCode")
    private final String promoCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("extraCashback")
    private final Boolean hasCountrySpecificCashback;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getHasCountrySpecificCashback() {
        return this.hasCountrySpecificCashback;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPromoCode() {
        return this.promoCode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getWebhook() {
        return this.webhook;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.webhook, pVar.webhook) && Intrinsics.f(this.promoCode, pVar.promoCode) && Intrinsics.f(this.hasCountrySpecificCashback, pVar.hasCountrySpecificCashback);
    }

    public final int hashCode() {
        String str = this.webhook;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.promoCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.hasCountrySpecificCashback;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }
}
