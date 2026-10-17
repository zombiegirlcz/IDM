package sid;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0005\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\t\u0010\u0012¨\u0006\u0014"}, d2 = {"Lsid/n;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "type", "b", "c", "termsLink", "", "Ljava/util/List;", "()Ljava/util/List;", "instalmentPeriods", "Ljo3/b;", "Ljo3/b;", "()Ljo3/b;", "minPurchaseAmount", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("termsLink")
    @NotNull
    private final String termsLink;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("instalmentPeriods")
    @NotNull
    private final List<String> instalmentPeriods;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("minPurchaseAmount")
    @NotNull
    private final jo3.b minPurchaseAmount;

    public n(String type, String termsLink, List instalmentPeriods, jo3.b minPurchaseAmount) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(termsLink, "termsLink");
        Intrinsics.checkNotNullParameter(instalmentPeriods, "instalmentPeriods");
        Intrinsics.checkNotNullParameter(minPurchaseAmount, "minPurchaseAmount");
        this.type = type;
        this.termsLink = termsLink;
        this.instalmentPeriods = instalmentPeriods;
        this.minPurchaseAmount = minPurchaseAmount;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getInstalmentPeriods() {
        return this.instalmentPeriods;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.b getMinPurchaseAmount() {
        return this.minPurchaseAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTermsLink() {
        return this.termsLink;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.type, nVar.type) && Intrinsics.f(this.termsLink, nVar.termsLink) && Intrinsics.f(this.instalmentPeriods, nVar.instalmentPeriods) && Intrinsics.f(this.minPurchaseAmount, nVar.minPurchaseAmount);
    }

    public final int hashCode() {
        return this.minPurchaseAmount.hashCode() + p.a.d(p.a.c(this.type.hashCode() * 31, 31, this.termsLink), 31, this.instalmentPeriods);
    }
}
