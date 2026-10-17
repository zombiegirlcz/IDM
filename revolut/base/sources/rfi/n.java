package rfi;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011R\u001a\u0010\"\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010(\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010-\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\u000e\u0010,R\u001c\u00102\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b0\u00101R\u001c\u00108\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001c\u0010=\u001a\u0004\u0018\u0001098\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b\u001a\u0010<R\u001a\u0010C\u001a\u00020>8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\"\u0010G\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010\u000f\u001a\u0004\bF\u0010\u0011R\u001c\u0010L\u001a\u0004\u0018\u00010H8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010I\u001a\u0004\bJ\u0010KR\u001c\u0010P\u001a\u0004\u0018\u00010M8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010N\u001a\u0004\b\u001e\u0010OR\u001c\u0010T\u001a\u0004\u0018\u00010Q8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010R\u001a\u0004\b$\u0010SR\u001c\u0010Y\u001a\u0004\u0018\u00010U8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\b*\u0010XR\u001c\u0010]\u001a\u0004\u0018\u00010Z8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010[\u001a\u0004\b\t\u0010\\R\u001c\u0010a\u001a\u0004\u0018\u00010^8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010_\u001a\u0004\b\u0005\u0010`R\"\u0010c\u001a\n\u0012\u0004\u0012\u00020b\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001c\u0010e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u0006\u001a\u0004\bd\u0010\u0004R\u001c\u0010j\u001a\u0004\u0018\u00010f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\b?\u0010iR\"\u0010m\u001a\n\u0012\u0004\u0012\u00020k\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\bl\u0010\u0011R\u001c\u0010o\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bd\u0010\u0006\u001a\u0004\bn\u0010\u0004R\"\u0010p\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u000f\u001a\u0004\bE\u0010\u0011R\u001c\u0010t\u001a\u0004\u0018\u00010q8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010r\u001a\u0004\b:\u0010sR\u001c\u0010u\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010\u0006\u001a\u0004\bV\u0010\u0004R\u001c\u0010y\u001a\u0004\u0018\u00010v8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bn\u0010w\u001a\u0004\bg\u0010xR\u001c\u0010z\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bl\u0010\u0006\u001a\u0004\b4\u0010\u0004¨\u0006{"}, d2 = {"Lrfi/n;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "n", "id", "b", "r", "name", "", "Lofi/o;", "c", "Ljava/util/List;", "i", "()Ljava/util/List;", "descriptions", "Lrfi/a0;", "d", "Lrfi/a0;", "w", "()Lrfi/a0;", "propertyType", "Lofi/i;", "e", "o", "images", "", "f", "I", "y", "()I", "rank", "Lrfi/x;", "g", "Lrfi/x;", "z", "()Lrfi/x;", "ratings", "Lrfi/h;", "h", "Lrfi/h;", "()Lrfi/h;", "availability", "Lofi/n;", "Lofi/n;", "u", "()Lofi/n;", "pricing", "Lrfi/w;", "j", "Lrfi/w;", "s", "()Lrfi/w;", "paymentOptions", "Lrfi/i;", "k", "Lrfi/i;", "()Lrfi/i;", "cancellationOptions", "Lrfi/v;", "l", "Lrfi/v;", "p", "()Lrfi/v;", "location", "Lrfi/y;", "m", "A", "relativeLocation", "Lrfi/d;", "Lrfi/d;", "t", "()Lrfi/d;", "positionToSearchLocationCentre", "Lrfi/j;", "Lrfi/j;", "()Lrfi/j;", "checkInDetails", "Lrfi/l;", "Lrfi/l;", "()Lrfi/l;", "checkOutDetails", "Lrfi/m;", "q", "Lrfi/m;", "()Lrfi/m;", "contactDetails", "Lrfi/f;", "Lrfi/f;", "()Lrfi/f;", "attributes", "Lrfi/e;", "Lrfi/e;", "()Lrfi/e;", "additionalInformation", "Lnfi/a;", "campaigns", "x", "providerId", "Lrfi/u;", "v", "Lrfi/u;", "()Lrfi/u;", "hostDetails", "Lrfi/z;", "C", "spaces", "B", "rentalAgreementUrl", "houseRules", "Lrfi/b;", "Lrfi/b;", "()Lrfi/b;", "distanceToLocation", "matchType", "Lqfi/a;", "Lqfi/a;", "()Lqfi/a;", "promotion", "destinationId", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @lg.b("matchType")
    private final String matchType;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @lg.b("promotion")
    private final qfi.a promotion;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @lg.b("destinationId")
    private final String destinationId;

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
    private final List<ofi.o> descriptions;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("propertyType")
    @NotNull
    private final a0 propertyType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("images")
    @NotNull
    private final List<ofi.i> images;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("rank")
    private final int rank;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("ratings")
    @NotNull
    private final x ratings;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("availability")
    private final h availability;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("pricing")
    private final ofi.n pricing;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentOptions")
    private final w paymentOptions;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("cancellationOptions")
    private final i cancellationOptions;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("location")
    @NotNull
    private final v location;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("relativeLocation")
    private final List<y> relativeLocation;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("positionToSearchLocationCentre")
    private final d positionToSearchLocationCentre;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("checkInDetails")
    private final j checkInDetails;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("checkOutDetails")
    private final l checkOutDetails;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("contactDetails")
    private final m contactDetails;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("attributes")
    private final f attributes;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("additionalInformation")
    private final e additionalInformation;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("campaigns")
    private final List<nfi.a> campaigns;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("providerId")
    private final String providerId;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("hostDetails")
    private final u hostDetails;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("spaces")
    private final List<z> spaces;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("rentalAgreementUrl")
    private final String rentalAgreementUrl;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("houseRules")
    private final List<String> houseRules;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @lg.b("distanceToLocation")
    private final b distanceToLocation;

    /* JADX INFO: renamed from: A, reason: from getter */
    public final List getRelativeLocation() {
        return this.relativeLocation;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final String getRentalAgreementUrl() {
        return this.rentalAgreementUrl;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final List getSpaces() {
        return this.spaces;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final e getAdditionalInformation() {
        return this.additionalInformation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final f getAttributes() {
        return this.attributes;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final h getAvailability() {
        return this.availability;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getCampaigns() {
        return this.campaigns;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final i getCancellationOptions() {
        return this.cancellationOptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.id, nVar.id) && Intrinsics.f(this.name, nVar.name) && Intrinsics.f(this.descriptions, nVar.descriptions) && Intrinsics.f(this.propertyType, nVar.propertyType) && Intrinsics.f(this.images, nVar.images) && this.rank == nVar.rank && Intrinsics.f(this.ratings, nVar.ratings) && Intrinsics.f(this.availability, nVar.availability) && Intrinsics.f(this.pricing, nVar.pricing) && Intrinsics.f(this.paymentOptions, nVar.paymentOptions) && Intrinsics.f(this.cancellationOptions, nVar.cancellationOptions) && Intrinsics.f(this.location, nVar.location) && Intrinsics.f(this.relativeLocation, nVar.relativeLocation) && Intrinsics.f(this.positionToSearchLocationCentre, nVar.positionToSearchLocationCentre) && Intrinsics.f(this.checkInDetails, nVar.checkInDetails) && Intrinsics.f(this.checkOutDetails, nVar.checkOutDetails) && Intrinsics.f(this.contactDetails, nVar.contactDetails) && Intrinsics.f(this.attributes, nVar.attributes) && Intrinsics.f(this.additionalInformation, nVar.additionalInformation) && Intrinsics.f(this.campaigns, nVar.campaigns) && Intrinsics.f(this.providerId, nVar.providerId) && Intrinsics.f(this.hostDetails, nVar.hostDetails) && Intrinsics.f(this.spaces, nVar.spaces) && Intrinsics.f(this.rentalAgreementUrl, nVar.rentalAgreementUrl) && Intrinsics.f(this.houseRules, nVar.houseRules) && Intrinsics.f(this.distanceToLocation, nVar.distanceToLocation) && Intrinsics.f(this.matchType, nVar.matchType) && Intrinsics.f(this.promotion, nVar.promotion) && Intrinsics.f(this.destinationId, nVar.destinationId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final j getCheckInDetails() {
        return this.checkInDetails;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final l getCheckOutDetails() {
        return this.checkOutDetails;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final m getContactDetails() {
        return this.contactDetails;
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.name);
        List<ofi.o> list = this.descriptions;
        int iHashCode = (this.ratings.hashCode() + j6.a.b(this.rank, p.a.d((this.propertyType.hashCode() + ((iC + (list == null ? 0 : list.hashCode())) * 31)) * 31, 31, this.images), 31)) * 31;
        h hVar = this.availability;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        ofi.n nVar = this.pricing;
        int iHashCode3 = (iHashCode2 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        w wVar = this.paymentOptions;
        int iHashCode4 = (iHashCode3 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        i iVar = this.cancellationOptions;
        int iHashCode5 = (this.location.hashCode() + ((iHashCode4 + (iVar == null ? 0 : iVar.hashCode())) * 31)) * 31;
        List<y> list2 = this.relativeLocation;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        d dVar = this.positionToSearchLocationCentre;
        int iHashCode7 = (iHashCode6 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        j jVar = this.checkInDetails;
        int iHashCode8 = (iHashCode7 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        l lVar = this.checkOutDetails;
        int iHashCode9 = (iHashCode8 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        m mVar = this.contactDetails;
        int iHashCode10 = (iHashCode9 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        f fVar = this.attributes;
        int iHashCode11 = (iHashCode10 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        e eVar = this.additionalInformation;
        int iHashCode12 = (iHashCode11 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        List<nfi.a> list3 = this.campaigns;
        int iHashCode13 = (iHashCode12 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str = this.providerId;
        int iHashCode14 = (iHashCode13 + (str == null ? 0 : str.hashCode())) * 31;
        u uVar = this.hostDetails;
        int iHashCode15 = (iHashCode14 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        List<z> list4 = this.spaces;
        int iHashCode16 = (iHashCode15 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str2 = this.rentalAgreementUrl;
        int iHashCode17 = (iHashCode16 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list5 = this.houseRules;
        int iHashCode18 = (iHashCode17 + (list5 == null ? 0 : list5.hashCode())) * 31;
        b bVar = this.distanceToLocation;
        int iHashCode19 = (iHashCode18 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str3 = this.matchType;
        int iHashCode20 = (iHashCode19 + (str3 == null ? 0 : str3.hashCode())) * 31;
        qfi.a aVar = this.promotion;
        int iHashCode21 = (iHashCode20 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str4 = this.destinationId;
        return iHashCode21 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final List getDescriptions() {
        return this.descriptions;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getDestinationId() {
        return this.destinationId;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final b getDistanceToLocation() {
        return this.distanceToLocation;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final u getHostDetails() {
        return this.hostDetails;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final List getHouseRules() {
        return this.houseRules;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final List getImages() {
        return this.images;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final v getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getMatchType() {
        return this.matchType;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final w getPaymentOptions() {
        return this.paymentOptions;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final d getPositionToSearchLocationCentre() {
        return this.positionToSearchLocationCentre;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final ofi.n getPricing() {
        return this.pricing;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final qfi.a getPromotion() {
        return this.promotion;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final a0 getPropertyType() {
        return this.propertyType;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final String getProviderId() {
        return this.providerId;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final x getRatings() {
        return this.ratings;
    }
}
