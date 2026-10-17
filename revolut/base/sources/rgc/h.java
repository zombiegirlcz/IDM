package rgc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0005\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"Lrgc/h;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "webhook", "b", "promoCode", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "hasCountrySpecificCashback", "d", "getActivationButtonText", "activationButtonText", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("webhook")
    private final String webhook;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("promoCode")
    private final String promoCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("hasCountrySpecificCashback")
    private final Boolean hasCountrySpecificCashback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("activationButtonText")
    private final String activationButtonText = null;

    public h(String str, String str2, Boolean bool) {
        this.webhook = str;
        this.promoCode = str2;
        this.hasCountrySpecificCashback = bool;
    }

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
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.webhook, hVar.webhook) && Intrinsics.f(this.promoCode, hVar.promoCode) && Intrinsics.f(this.hasCountrySpecificCashback, hVar.hasCountrySpecificCashback) && Intrinsics.f(this.activationButtonText, hVar.activationButtonText);
    }

    public final int hashCode() {
        String str = this.webhook;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.promoCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.hasCountrySpecificCashback;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.activationButtonText;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
