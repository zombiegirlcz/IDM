package ofk;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\n\u0010\u0010¨\u0006\u0012"}, d2 = {"Lofk/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "website", "", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "maxSubscriptionsIncluded", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "maxSubscriptionsMarketValue", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("website")
    @NotNull
    private final String website;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("maxSubscriptionsIncluded")
    private final Integer maxSubscriptionsIncluded;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("maxSubscriptionsMarketValue")
    private final jo3.a maxSubscriptionsMarketValue;

    public a(String website, Integer num, jo3.a aVar) {
        Intrinsics.checkNotNullParameter(website, "website");
        this.website = website;
        this.maxSubscriptionsIncluded = num;
        this.maxSubscriptionsMarketValue = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getMaxSubscriptionsIncluded() {
        return this.maxSubscriptionsIncluded;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getMaxSubscriptionsMarketValue() {
        return this.maxSubscriptionsMarketValue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getWebsite() {
        return this.website;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.website, aVar.website) && Intrinsics.f(this.maxSubscriptionsIncluded, aVar.maxSubscriptionsIncluded) && Intrinsics.f(this.maxSubscriptionsMarketValue, aVar.maxSubscriptionsMarketValue);
    }

    public final int hashCode() {
        int iHashCode = this.website.hashCode() * 31;
        Integer num = this.maxSubscriptionsIncluded;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        jo3.a aVar = this.maxSubscriptionsMarketValue;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }
}
