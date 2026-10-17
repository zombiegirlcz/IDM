package bde;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0010\u0010\u0018R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u001e\u0010\u0004R\u001c\u0010%\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b!\u0010\u0004R\u001a\u0010'\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004¨\u0006("}, d2 = {"Lbde/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "cardId", "g", "deliveryState", "c", "k", "name", "d", "brand", "e", "j", "lastFour", "f", "h", "design", "Lno3/b;", "Lno3/b;", "()Lno3/b;", "deliveryAddress", "i", "estimatedDeliveryDate", "deliveryContact", "courierCompany", "n", "trackingChannel", "Lbde/p;", "l", "Lbde/p;", "m", "()Lbde/p;", "tracking", "stateAfterReplacement", "cardOwnerType", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String cardId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String deliveryState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("brand")
    @NotNull
    private final String brand;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("lastFour")
    @NotNull
    private final String lastFour;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("design")
    @NotNull
    private final String design;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("deliveryAddress")
    @NotNull
    private final no3.b deliveryAddress;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("estimatedDeliveryDate")
    private final String estimatedDeliveryDate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("deliveryContact")
    private final String deliveryContact;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("courierCompany")
    private final String courierCompany;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("trackingChannel")
    private final String trackingChannel;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("tracking")
    private final p tracking;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("stateAfterReplacement")
    private final String stateAfterReplacement;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardOwnerType")
    @NotNull
    private final String cardOwnerType;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCardId() {
        return this.cardId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCardOwnerType() {
        return this.cardOwnerType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCourierCompany() {
        return this.courierCompany;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final no3.b getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.cardId, bVar.cardId) && Intrinsics.f(this.deliveryState, bVar.deliveryState) && Intrinsics.f(this.name, bVar.name) && Intrinsics.f(this.brand, bVar.brand) && Intrinsics.f(this.lastFour, bVar.lastFour) && Intrinsics.f(this.design, bVar.design) && Intrinsics.f(this.deliveryAddress, bVar.deliveryAddress) && Intrinsics.f(this.estimatedDeliveryDate, bVar.estimatedDeliveryDate) && Intrinsics.f(this.deliveryContact, bVar.deliveryContact) && Intrinsics.f(this.courierCompany, bVar.courierCompany) && Intrinsics.f(this.trackingChannel, bVar.trackingChannel) && Intrinsics.f(this.tracking, bVar.tracking) && Intrinsics.f(this.stateAfterReplacement, bVar.stateAfterReplacement) && Intrinsics.f(this.cardOwnerType, bVar.cardOwnerType);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDeliveryContact() {
        return this.deliveryContact;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDeliveryState() {
        return this.deliveryState;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getDesign() {
        return this.design;
    }

    public final int hashCode() {
        int iHashCode = (this.deliveryAddress.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.cardId.hashCode() * 31, 31, this.deliveryState), 31, this.name), 31, this.brand), 31, this.lastFour), 31, this.design)) * 31;
        String str = this.estimatedDeliveryDate;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deliveryContact;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.courierCompany;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.trackingChannel;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        p pVar = this.tracking;
        int iHashCode6 = (iHashCode5 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        String str5 = this.stateAfterReplacement;
        return this.cardOwnerType.hashCode() + ((iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getEstimatedDeliveryDate() {
        return this.estimatedDeliveryDate;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getLastFour() {
        return this.lastFour;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getStateAfterReplacement() {
        return this.stateAfterReplacement;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final p getTracking() {
        return this.tracking;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getTrackingChannel() {
        return this.trackingChannel;
    }
}
