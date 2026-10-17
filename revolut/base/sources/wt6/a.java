package wt6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u0000 \n2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u000b"}, d2 = {"Lwt6/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "websiteUrl", "paymentDisclaimerUrl", "Companion", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("websiteUrl")
    @NotNull
    private final String websiteUrl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentDisclaimerUrl")
    private final String paymentDisclaimerUrl;

    public a(String websiteUrl, String str) {
        Intrinsics.checkNotNullParameter(websiteUrl, "websiteUrl");
        this.websiteUrl = websiteUrl;
        this.paymentDisclaimerUrl = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPaymentDisclaimerUrl() {
        return this.paymentDisclaimerUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getWebsiteUrl() {
        return this.websiteUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.websiteUrl, aVar.websiteUrl) && Intrinsics.f(this.paymentDisclaimerUrl, aVar.paymentDisclaimerUrl);
    }

    public final int hashCode() {
        int iHashCode = this.websiteUrl.hashCode() * 31;
        String str = this.paymentDisclaimerUrl;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
