package yei;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011R\u001c\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010(\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010-\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\u000e\u0010,R\u001c\u00102\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b0\u00101R\u001c\u00108\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001c\u0010=\u001a\u0004\u0018\u0001098\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b\u001a\u0010<R\u001a\u0010C\u001a\u00020>8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\"\u0010F\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\bE\u0010\u0011R\u001c\u0010K\u001a\u0004\u0018\u00010G8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010H\u001a\u0004\bI\u0010JR\u001c\u0010O\u001a\u0004\u0018\u00010L8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010M\u001a\u0004\b\u001e\u0010NR\u001c\u0010T\u001a\u0004\u0018\u00010P8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\b$\u0010SR\u001c\u0010X\u001a\u0004\u0018\u00010U8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010V\u001a\u0004\b*\u0010WR\u001c\u0010\\\u001a\u0004\u0018\u00010Y8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010Z\u001a\u0004\b\t\u0010[R\u001c\u0010`\u001a\u0004\u0018\u00010]8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010^\u001a\u0004\b\u0005\u0010_R\"\u0010b\u001a\n\u0012\u0004\u0012\u00020a\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001c\u0010d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\bc\u0010\u0004R\u001c\u0010h\u001a\u0004\u0018\u00010e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010f\u001a\u0004\b:\u0010gR\"\u0010k\u001a\n\u0012\u0004\u0012\u00020i\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u000f\u001a\u0004\bj\u0010\u0011R\u001c\u0010m\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\bl\u0010\u0004R\"\u0010n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010\u000f\u001a\u0004\b?\u0010\u0011R\u001c\u0010r\u001a\u0004\u0018\u00010o8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bl\u0010p\u001a\u0004\b4\u0010qR\u001c\u0010s\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bj\u0010\u0006\u001a\u0004\bQ\u0010\u0004¨\u0006t"}, d2 = {"Lyei/m;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "m", "id", "b", "q", "name", "", "Lxei/l;", "c", "Ljava/util/List;", "i", "()Ljava/util/List;", "descriptions", "Lyei/z;", "d", "Lyei/z;", "u", "()Lyei/z;", "propertyType", "Lxei/e;", "e", "n", "images", "", "f", "Ljava/lang/Integer;", "w", "()Ljava/lang/Integer;", "rank", "Lyei/w;", "g", "Lyei/w;", "x", "()Lyei/w;", "ratings", "Lyei/g;", "h", "Lyei/g;", "()Lyei/g;", "availability", "Lxei/k;", "Lxei/k;", "t", "()Lxei/k;", "pricing", "Lyei/v;", "j", "Lyei/v;", "r", "()Lyei/v;", "paymentOptions", "Lyei/h;", "k", "Lyei/h;", "()Lyei/h;", "cancellationOptions", "Lyei/u;", "l", "Lyei/u;", "o", "()Lyei/u;", "location", "Lyei/x;", "y", "relativeLocation", "Lyei/c;", "Lyei/c;", "s", "()Lyei/c;", "positionToSearchLocationCentre", "Lyei/i;", "Lyei/i;", "()Lyei/i;", "checkInDetails", "Lyei/k;", "p", "Lyei/k;", "()Lyei/k;", "checkOutDetails", "Lyei/l;", "Lyei/l;", "()Lyei/l;", "contactDetails", "Lyei/e;", "Lyei/e;", "()Lyei/e;", "attributes", "Lyei/d;", "Lyei/d;", "()Lyei/d;", "additionalInformation", "Lwei/a;", "campaigns", "v", "providerId", "Lyei/t;", "Lyei/t;", "()Lyei/t;", "hostDetails", "Lyei/y;", "A", "spaces", "z", "rentalAgreementUrl", "houseRules", "Lxei/d;", "Lxei/d;", "()Lxei/d;", "distanceToLocation", "matchType", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @lg.b("matchType")
    private final String matchType;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("descriptions")
    private final List<xei.l> descriptions;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("propertyType")
    private final z propertyType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("images")
    @NotNull
    private final List<xei.e> images;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("rank")
    private final Integer rank;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("ratings")
    private final w ratings;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("availability")
    private final g availability;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("pricing")
    private final xei.k pricing;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentOptions")
    private final v paymentOptions;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("cancellationOptions")
    private final h cancellationOptions;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("location")
    @NotNull
    private final u location;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("relativeLocation")
    private final List<x> relativeLocation;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("positionToSearchLocationCentre")
    private final c positionToSearchLocationCentre;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("checkInDetails")
    private final i checkInDetails;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("checkOutDetails")
    private final k checkOutDetails;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("contactDetails")
    private final l contactDetails;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("attributes")
    private final e attributes;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("additionalInformation")
    private final d additionalInformation;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("campaigns")
    private final List<wei.a> campaigns;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("providerId")
    private final String providerId;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("hostDetails")
    private final t hostDetails;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("spaces")
    private final List<y> spaces;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("rentalAgreementUrl")
    private final String rentalAgreementUrl;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("houseRules")
    private final List<String> houseRules;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @lg.b("distanceToLocation")
    private final xei.d distanceToLocation;

    public m(String id10, String name, ArrayList arrayList, z zVar, ArrayList images, Integer num, w wVar, g gVar, xei.k kVar, v vVar, h hVar, u location, ArrayList arrayList2, c cVar, i iVar, k kVar2, l lVar, e eVar, d dVar, ArrayList arrayList3, String str, t tVar, ArrayList arrayList4, String str2, List list, xei.d dVar2, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(location, "location");
        this.id = id10;
        this.name = name;
        this.descriptions = arrayList;
        this.propertyType = zVar;
        this.images = images;
        this.rank = num;
        this.ratings = wVar;
        this.availability = gVar;
        this.pricing = kVar;
        this.paymentOptions = vVar;
        this.cancellationOptions = hVar;
        this.location = location;
        this.relativeLocation = arrayList2;
        this.positionToSearchLocationCentre = cVar;
        this.checkInDetails = iVar;
        this.checkOutDetails = kVar2;
        this.contactDetails = lVar;
        this.attributes = eVar;
        this.additionalInformation = dVar;
        this.campaigns = arrayList3;
        this.providerId = str;
        this.hostDetails = tVar;
        this.spaces = arrayList4;
        this.rentalAgreementUrl = str2;
        this.houseRules = list;
        this.distanceToLocation = dVar2;
        this.matchType = str3;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final List getSpaces() {
        return this.spaces;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final d getAdditionalInformation() {
        return this.additionalInformation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e getAttributes() {
        return this.attributes;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g getAvailability() {
        return this.availability;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getCampaigns() {
        return this.campaigns;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final h getCancellationOptions() {
        return this.cancellationOptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.id, mVar.id) && Intrinsics.f(this.name, mVar.name) && Intrinsics.f(this.descriptions, mVar.descriptions) && Intrinsics.f(this.propertyType, mVar.propertyType) && Intrinsics.f(this.images, mVar.images) && Intrinsics.f(this.rank, mVar.rank) && Intrinsics.f(this.ratings, mVar.ratings) && Intrinsics.f(this.availability, mVar.availability) && Intrinsics.f(this.pricing, mVar.pricing) && Intrinsics.f(this.paymentOptions, mVar.paymentOptions) && Intrinsics.f(this.cancellationOptions, mVar.cancellationOptions) && Intrinsics.f(this.location, mVar.location) && Intrinsics.f(this.relativeLocation, mVar.relativeLocation) && Intrinsics.f(this.positionToSearchLocationCentre, mVar.positionToSearchLocationCentre) && Intrinsics.f(this.checkInDetails, mVar.checkInDetails) && Intrinsics.f(this.checkOutDetails, mVar.checkOutDetails) && Intrinsics.f(this.contactDetails, mVar.contactDetails) && Intrinsics.f(this.attributes, mVar.attributes) && Intrinsics.f(this.additionalInformation, mVar.additionalInformation) && Intrinsics.f(this.campaigns, mVar.campaigns) && Intrinsics.f(this.providerId, mVar.providerId) && Intrinsics.f(this.hostDetails, mVar.hostDetails) && Intrinsics.f(this.spaces, mVar.spaces) && Intrinsics.f(this.rentalAgreementUrl, mVar.rentalAgreementUrl) && Intrinsics.f(this.houseRules, mVar.houseRules) && Intrinsics.f(this.distanceToLocation, mVar.distanceToLocation) && Intrinsics.f(this.matchType, mVar.matchType);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final i getCheckInDetails() {
        return this.checkInDetails;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final k getCheckOutDetails() {
        return this.checkOutDetails;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final l getContactDetails() {
        return this.contactDetails;
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.name);
        List<xei.l> list = this.descriptions;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        z zVar = this.propertyType;
        int iD = p.a.d((iHashCode + (zVar == null ? 0 : zVar.hashCode())) * 31, 31, this.images);
        Integer num = this.rank;
        int iHashCode2 = (iD + (num == null ? 0 : num.hashCode())) * 31;
        w wVar = this.ratings;
        int iHashCode3 = (iHashCode2 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        g gVar = this.availability;
        int iHashCode4 = (iHashCode3 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        xei.k kVar = this.pricing;
        int iHashCode5 = (iHashCode4 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        v vVar = this.paymentOptions;
        int iHashCode6 = (iHashCode5 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        h hVar = this.cancellationOptions;
        int iHashCode7 = (this.location.hashCode() + ((iHashCode6 + (hVar == null ? 0 : hVar.hashCode())) * 31)) * 31;
        List<x> list2 = this.relativeLocation;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        c cVar = this.positionToSearchLocationCentre;
        int iHashCode9 = (iHashCode8 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        i iVar = this.checkInDetails;
        int iHashCode10 = (iHashCode9 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        k kVar2 = this.checkOutDetails;
        int iHashCode11 = (iHashCode10 + (kVar2 == null ? 0 : kVar2.hashCode())) * 31;
        l lVar = this.contactDetails;
        int iHashCode12 = (iHashCode11 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        e eVar = this.attributes;
        int iHashCode13 = (iHashCode12 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        d dVar = this.additionalInformation;
        int iHashCode14 = (iHashCode13 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        List<wei.a> list3 = this.campaigns;
        int iHashCode15 = (iHashCode14 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.providerId;
        int iHashCode16 = (iHashCode15 + (str == null ? 0 : str.hashCode())) * 31;
        t tVar = this.hostDetails;
        int iHashCode17 = (iHashCode16 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        List<y> list4 = this.spaces;
        int iHashCode18 = (iHashCode17 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str2 = this.rentalAgreementUrl;
        int iHashCode19 = (iHashCode18 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list5 = this.houseRules;
        int iHashCode20 = (iHashCode19 + (list5 == null ? 0 : list5.hashCode())) * 31;
        xei.d dVar2 = this.distanceToLocation;
        int iHashCode21 = (iHashCode20 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        String str3 = this.matchType;
        return iHashCode21 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final List getDescriptions() {
        return this.descriptions;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final xei.d getDistanceToLocation() {
        return this.distanceToLocation;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final t getHostDetails() {
        return this.hostDetails;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final List getHouseRules() {
        return this.houseRules;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final List getImages() {
        return this.images;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final u getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getMatchType() {
        return this.matchType;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final v getPaymentOptions() {
        return this.paymentOptions;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final c getPositionToSearchLocationCentre() {
        return this.positionToSearchLocationCentre;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final xei.k getPricing() {
        return this.pricing;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final z getPropertyType() {
        return this.propertyType;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final String getProviderId() {
        return this.providerId;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final Integer getRank() {
        return this.rank;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final w getRatings() {
        return this.ratings;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final List getRelativeLocation() {
        return this.relativeLocation;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final String getRentalAgreementUrl() {
        return this.rentalAgreementUrl;
    }
}
