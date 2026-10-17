package hb3;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004R\u001a\u0010 \u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010%\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b\u000b\u0010$R\u001c\u0010)\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010'\u001a\u0004\b\u0016\u0010(R\"\u0010.\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010,\u001a\u0004\b\u0019\u0010-¨\u0006/"}, d2 = {"Lhb3/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "k", "retailerName", "b", "address", "c", "j", "phone", "d", "e", "latitude", "g", "longitude", "f", "id", "city", "h", "n", "zipCode", "i", "l", "state", "", "Z", "m", "()Z", "unlocked", "logo", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "fee", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "minutesUntilClose", "", "Lhb3/l;", "Ljava/util/List;", "()Ljava/util/List;", "openingHours", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("retailerName")
    @NotNull
    private final String retailerName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("address")
    @NotNull
    private final String address;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("phone")
    @NotNull
    private final String phone;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("latitude")
    @NotNull
    private final String latitude;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("longitude")
    @NotNull
    private final String longitude;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("city")
    @NotNull
    private final String city;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("zipCode")
    @NotNull
    private final String zipCode;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("state")
    private final String state;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("unlocked")
    private final boolean unlocked;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("logo")
    private final String logo;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("fee")
    private final jo3.a fee;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("minutesUntilClose")
    private final Integer minutesUntilClose;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("openingHours")
    private final List<l> openingHours;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLatitude() {
        return this.latitude;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.retailerName, eVar.retailerName) && Intrinsics.f(this.address, eVar.address) && Intrinsics.f(this.phone, eVar.phone) && Intrinsics.f(this.latitude, eVar.latitude) && Intrinsics.f(this.longitude, eVar.longitude) && Intrinsics.f(this.id, eVar.id) && Intrinsics.f(this.city, eVar.city) && Intrinsics.f(this.zipCode, eVar.zipCode) && Intrinsics.f(this.state, eVar.state) && this.unlocked == eVar.unlocked && Intrinsics.f(this.logo, eVar.logo) && Intrinsics.f(this.fee, eVar.fee) && Intrinsics.f(this.minutesUntilClose, eVar.minutesUntilClose) && Intrinsics.f(this.openingHours, eVar.openingHours);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getMinutesUntilClose() {
        return this.minutesUntilClose;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.retailerName.hashCode() * 31, 31, this.address), 31, this.phone), 31, this.latitude), 31, this.longitude), 31, this.id), 31, this.city), 31, this.zipCode);
        String str = this.state;
        int iC2 = j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.unlocked);
        String str2 = this.logo;
        int iHashCode = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        jo3.a aVar = this.fee;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Integer num = this.minutesUntilClose;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<l> list = this.openingHours;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final List getOpeningHours() {
        return this.openingHours;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getRetailerName() {
        return this.retailerName;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getUnlocked() {
        return this.unlocked;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getZipCode() {
        return this.zipCode;
    }
}
