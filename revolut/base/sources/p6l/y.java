package p6l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u001f\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001a\u0010$\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b%\u0010\u0004¨\u0006)"}, d2 = {"Lp6l/y;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "m", "walletId", "c", "design", "d", "brand", "g", "lastFour", "f", "expiryDate", "", "J", "l", "()J", "updatedDate", "h", "label", "Lp6l/n;", "i", "Lp6l/n;", "()Lp6l/n;", "reactivation", "", "j", "Z", "()Z", "recentlyTerminated", "k", "cardName", "productType", "subProductType", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("walletId")
    @NotNull
    private final String walletId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("design")
    @NotNull
    private final String design;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("brand")
    @NotNull
    private final String brand;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("lastFour")
    private final String lastFour;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("expiryDate")
    @NotNull
    private final String expiryDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("updatedDate")
    private final long updatedDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("label")
    private final String label;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("reactivation")
    @NotNull
    private final n reactivation;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("recentlyTerminated")
    private final boolean recentlyTerminated;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("cardName")
    private final String cardName;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("productType")
    private final String productType;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("subProductType")
    private final String subProductType;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCardName() {
        return this.cardName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDesign() {
        return this.design;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getExpiryDate() {
        return this.expiryDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.id, yVar.id) && Intrinsics.f(this.walletId, yVar.walletId) && Intrinsics.f(this.design, yVar.design) && Intrinsics.f(this.brand, yVar.brand) && Intrinsics.f(this.lastFour, yVar.lastFour) && Intrinsics.f(this.expiryDate, yVar.expiryDate) && this.updatedDate == yVar.updatedDate && Intrinsics.f(this.label, yVar.label) && Intrinsics.f(this.reactivation, yVar.reactivation) && this.recentlyTerminated == yVar.recentlyTerminated && Intrinsics.f(this.cardName, yVar.cardName) && Intrinsics.f(this.productType, yVar.productType) && Intrinsics.f(this.subProductType, yVar.subProductType);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getLastFour() {
        return this.lastFour;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.walletId), 31, this.design), 31, this.brand);
        String str = this.lastFour;
        int iC2 = a0.d.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.expiryDate), 31, this.updatedDate);
        String str2 = this.label;
        int iC3 = j6.a.c((this.reactivation.hashCode() + ((iC2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.recentlyTerminated);
        String str3 = this.cardName;
        int iHashCode = (iC3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.productType;
        int iHashCode2 = (iHashCode + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.subProductType;
        return iHashCode2 + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final n getReactivation() {
        return this.reactivation;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getRecentlyTerminated() {
        return this.recentlyTerminated;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getSubProductType() {
        return this.subProductType;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getUpdatedDate() {
        return this.updatedDate;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getWalletId() {
        return this.walletId;
    }
}
