package rr2;

import a0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004¨\u0006\u0019"}, d2 = {"Lrr2/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "b", "h", "ownerId", "c", "g", "name", "e", "logo", "", "J", "()J", "activeSince", "f", "category", "brandId", "merchantId", "feature_blocked_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("ownerId")
    private final String ownerId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    private final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("logo")
    private final String logo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("activeSince")
    private final long activeSince;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("category")
    private final String category;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("brandId")
    private final String brandId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("merchantId")
    private final String merchantId;

    public a(long j2, String id10, String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.id = id10;
        this.ownerId = str;
        this.name = str2;
        this.logo = str3;
        this.activeSince = j2;
        this.category = str4;
        this.brandId = str5;
        this.merchantId = str6;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getActiveSince() {
        return this.activeSince;
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
    public final String getLogo() {
        return this.logo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.ownerId, aVar.ownerId) && Intrinsics.f(this.name, aVar.name) && Intrinsics.f(this.logo, aVar.logo) && this.activeSince == aVar.activeSince && Intrinsics.f(this.category, aVar.category) && Intrinsics.f(this.brandId, aVar.brandId) && Intrinsics.f(this.merchantId, aVar.merchantId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getMerchantId() {
        return this.merchantId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getOwnerId() {
        return this.ownerId;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.ownerId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.logo;
        int iC = d.c((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.activeSince);
        String str4 = this.category;
        int iHashCode4 = (iC + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.brandId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.merchantId;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }
}
