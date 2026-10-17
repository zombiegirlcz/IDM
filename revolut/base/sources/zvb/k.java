package zvb;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\f\u0010\u0004¨\u0006\u0017"}, d2 = {"Lzvb/k;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "b", "g", "source", "c", "f", "name", "e", "logoImageUrl", "", "Ljava/lang/Double;", "()Ljava/lang/Double;", "advertisedPointsAmount", "brandId", "category", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("source")
    @NotNull
    private final String source;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("logoImageUrl")
    @NotNull
    private final String logoImageUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("advertisedPointsAmount")
    private final Double advertisedPointsAmount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("brandId")
    private final String brandId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("category")
    @NotNull
    private final String category;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Double getAdvertisedPointsAmount() {
        return this.advertisedPointsAmount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBrandId() {
        return this.brandId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLogoImageUrl() {
        return this.logoImageUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.id, kVar.id) && Intrinsics.f(this.source, kVar.source) && Intrinsics.f(this.name, kVar.name) && Intrinsics.f(this.logoImageUrl, kVar.logoImageUrl) && Intrinsics.f(this.advertisedPointsAmount, kVar.advertisedPointsAmount) && Intrinsics.f(this.brandId, kVar.brandId) && Intrinsics.f(this.category, kVar.category);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.source), 31, this.name), 31, this.logoImageUrl);
        Double d = this.advertisedPointsAmount;
        int iHashCode = (iC + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.brandId;
        return this.category.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
