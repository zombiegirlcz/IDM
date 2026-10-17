package ak2;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\u0010\u0010\"R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\u0004R\"\u0010-\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\"\u0010/\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b\n\u0010,R\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b$\u0010\u0004R\"\u00103\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b2\u0010,R\"\u00106\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010*\u001a\u0004\b\u0015\u0010,R\u001c\u00108\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\u0006\u001a\u0004\b7\u0010\u0004R\u001c\u00109\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b5\u0010\u0004R\u001c\u0010:\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b.\u0010\u0004R\u001c\u0010>\u001a\u0004\u0018\u00010;8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010<\u001a\u0004\b\u001b\u0010=R\u001c\u0010?\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b)\u0010\u0004¨\u0006@"}, d2 = {"Lak2/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "k", "name", "", "b", "I", "f", "()I", "id", "Lak2/a;", "c", "Lak2/a;", "()Lak2/a;", "address", "Lqo3/a;", "d", "Lqo3/a;", "j", "()Lqo3/a;", "location", "", "e", "Ljava/lang/Boolean;", "o", "()Ljava/lang/Boolean;", "surchargeFree", "Lak2/f;", "Lak2/f;", "()Lak2/f;", "distance", "g", "p", "wheelchairAccess", "", "Lak2/e;", "h", "Ljava/util/List;", "q", "()Ljava/util/List;", "withdrawalBanknotes", "i", "depositBanknotes", "image", "Lak2/h;", "m", "openingHours", "Lak2/g;", "l", ib.b.Features, "n", "status", "network", "localityType", "Lak2/c;", "Lak2/c;", "()Lak2/c;", "fees", "localisedDirections", "feature_atm_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    private final int id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("address")
    private final a address;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("geoLocation")
    @NotNull
    private final qo3.a location;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("surchargeFree")
    private final Boolean surchargeFree;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("distance")
    @NotNull
    private final f distance;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("wheelchairAccess")
    private final String wheelchairAccess;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("withdrawalBanknotes")
    private final List<e> withdrawalBanknotes;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("depositBanknotes")
    private final List<e> depositBanknotes;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("image")
    private final String image;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("openingHours")
    private final List<h> openingHours;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b(ib.b.Features)
    private final List<g> features;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("status")
    private final String status;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("network")
    private final String network;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("localityType")
    private final String localityType;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("internalFees")
    private final c fees;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("localisedDirections")
    private final String localisedDirections;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getDepositBanknotes() {
        return this.depositBanknotes;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final f getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getFeatures() {
        return this.features;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final c getFees() {
        return this.fees;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.name, bVar.name) && this.id == bVar.id && Intrinsics.f(this.address, bVar.address) && Intrinsics.f(this.location, bVar.location) && Intrinsics.f(this.surchargeFree, bVar.surchargeFree) && Intrinsics.f(this.distance, bVar.distance) && Intrinsics.f(this.wheelchairAccess, bVar.wheelchairAccess) && Intrinsics.f(this.withdrawalBanknotes, bVar.withdrawalBanknotes) && Intrinsics.f(this.depositBanknotes, bVar.depositBanknotes) && Intrinsics.f(this.image, bVar.image) && Intrinsics.f(this.openingHours, bVar.openingHours) && Intrinsics.f(this.features, bVar.features) && Intrinsics.f(this.status, bVar.status) && Intrinsics.f(this.network, bVar.network) && Intrinsics.f(this.localityType, bVar.localityType) && Intrinsics.f(this.fees, bVar.fees) && Intrinsics.f(this.localisedDirections, bVar.localisedDirections);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getLocalisedDirections() {
        return this.localisedDirections;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.id, this.name.hashCode() * 31, 31);
        a aVar = this.address;
        int iHashCode = (this.location.hashCode() + ((iB + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31;
        Boolean bool = this.surchargeFree;
        int iHashCode2 = (this.distance.hashCode() + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
        String str = this.wheelchairAccess;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<e> list = this.withdrawalBanknotes;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<e> list2 = this.depositBanknotes;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.image;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<h> list3 = this.openingHours;
        int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<g> list4 = this.features;
        int iHashCode8 = (iHashCode7 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str3 = this.status;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.network;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.localityType;
        int iHashCode11 = (iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        c cVar = this.fees;
        int iHashCode12 = (iHashCode11 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str6 = this.localisedDirections;
        return iHashCode12 + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getLocalityType() {
        return this.localityType;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final qo3.a getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final List getOpeningHours() {
        return this.openingHours;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Boolean getSurchargeFree() {
        return this.surchargeFree;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getWheelchairAccess() {
        return this.wheelchairAccess;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final List getWithdrawalBanknotes() {
        return this.withdrawalBanknotes;
    }
}
