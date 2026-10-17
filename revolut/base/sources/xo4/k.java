package xo4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u0016"}, d2 = {"Lxo4/k;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "h", "title", "b", "description", "c", "g", "state", "d", "button", "e", "imageUrl", "f", "productType", "productSubtype", "facilityId", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("button")
    private final String button;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("imageUrl")
    private final String imageUrl;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("productType")
    @NotNull
    private final String productType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("productSubtype")
    private final String productSubtype;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("facilityId")
    private final String facilityId;

    public k(String title, String description, String state, String str, String str2, String productType, String str3, String str4) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(productType, "productType");
        this.title = title;
        this.description = description;
        this.state = state;
        this.button = str;
        this.imageUrl = str2;
        this.productType = productType;
        this.productSubtype = str3;
        this.facilityId = str4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFacilityId() {
        return this.facilityId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getProductSubtype() {
        return this.productSubtype;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.title, kVar.title) && Intrinsics.f(this.description, kVar.description) && Intrinsics.f(this.state, kVar.state) && Intrinsics.f(this.button, kVar.button) && Intrinsics.f(this.imageUrl, kVar.imageUrl) && Intrinsics.f(this.productType, kVar.productType) && Intrinsics.f(this.productSubtype, kVar.productSubtype) && Intrinsics.f(this.facilityId, kVar.facilityId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.title.hashCode() * 31, 31, this.description), 31, this.state);
        String str = this.button;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageUrl;
        int iC2 = p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.productType);
        String str3 = this.productSubtype;
        int iHashCode2 = (iC2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.facilityId;
        return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
    }
}
