package qzf;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010$\u001a\b\u0012\u0004\u0012\u00020\"0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u000e\u001a\u0004\b\u0005\u0010\u0010R\"\u0010'\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u000e\u001a\u0004\b#\u0010\u0010R\"\u0010)\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010+\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b\r\u0010\u0004R \u0010/\u001a\b\u0012\u0004\u0012\u00020,0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u000e\u001a\u0004\b.\u0010\u0010R\u001a\u00103\u001a\u0002008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b\t\u00102R\"\u00105\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b(\u0010\u0010R\"\u00107\u001a\n\u0012\u0004\u0012\u000206\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u000e\u001a\u0004\b*\u0010\u0010R\u001c\u0010<\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b-\u0010;R\u001c\u0010@\u001a\u0004\u0018\u00010=8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010>\u001a\u0004\b&\u0010?R\u001c\u0010D\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010B\u001a\u0004\b9\u0010C¨\u0006E"}, d2 = {"Lqzf/p;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "l", "name", "", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", "images", "Lqzf/j0;", "d", "Lqzf/j0;", "m", "()Lqzf/j0;", "ratings", "Lqzf/m0;", "Lqzf/m0;", "q", "()Lqzf/m0;", "visitors", "Lxzf/a;", "Lxzf/a;", "n", "()Lxzf/a;", "startingPrice", "Lqzf/b;", "g", "additionalInformation", "Lqzf/t;", "h", "includedFeatures", "i", "excludedFeatures", "j", "description", "Lqzf/l0;", "k", "p", "tourSnapshot", "Lqzf/r;", "Lqzf/r;", "()Lqzf/r;", "cancellationPolicy", "Lqzf/z;", "languages", "Lqzf/a0;", "locations", "Lqzf/b0;", "o", "Lqzf/b0;", "()Lqzf/b0;", "logistics", "Lqzf/w;", "Lqzf/w;", "()Lqzf/w;", "itinerary", "Lqzf/k0;", "Lqzf/k0;", "()Lqzf/k0;", "supplier", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("images")
    @NotNull
    private final List<String> images;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("ratings")
    private final j0 ratings;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("visitors")
    @NotNull
    private final m0 visitors;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("startingPrice")
    @NotNull
    private final xzf.a startingPrice;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("additionalInfo")
    @NotNull
    private final List<b> additionalInformation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("includedFeatures")
    private final List<t> includedFeatures;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("excludedFeatures")
    private final List<t> excludedFeatures;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("tourSnapshot")
    @NotNull
    private final List<l0> tourSnapshot;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancellationPolicy")
    @NotNull
    private final r cancellationPolicy;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("languages")
    private final List<z> languages;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("locations")
    private final List<a0> locations;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("logistics")
    private final b0 logistics;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("itinerary")
    private final w itinerary;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("supplier")
    private final k0 supplier;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAdditionalInformation() {
        return this.additionalInformation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final r getCancellationPolicy() {
        return this.cancellationPolicy;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getExcludedFeatures() {
        return this.excludedFeatures;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.id, pVar.id) && Intrinsics.f(this.name, pVar.name) && Intrinsics.f(this.images, pVar.images) && Intrinsics.f(this.ratings, pVar.ratings) && Intrinsics.f(this.visitors, pVar.visitors) && Intrinsics.f(this.startingPrice, pVar.startingPrice) && Intrinsics.f(this.additionalInformation, pVar.additionalInformation) && Intrinsics.f(this.includedFeatures, pVar.includedFeatures) && Intrinsics.f(this.excludedFeatures, pVar.excludedFeatures) && Intrinsics.f(this.description, pVar.description) && Intrinsics.f(this.tourSnapshot, pVar.tourSnapshot) && Intrinsics.f(this.cancellationPolicy, pVar.cancellationPolicy) && Intrinsics.f(this.languages, pVar.languages) && Intrinsics.f(this.locations, pVar.locations) && Intrinsics.f(this.logistics, pVar.logistics) && Intrinsics.f(this.itinerary, pVar.itinerary) && Intrinsics.f(this.supplier, pVar.supplier);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getImages() {
        return this.images;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final List getIncludedFeatures() {
        return this.includedFeatures;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final w getItinerary() {
        return this.itinerary;
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(this.id.hashCode() * 31, 31, this.name), 31, this.images);
        j0 j0Var = this.ratings;
        int iD2 = p.a.d((this.startingPrice.hashCode() + ((this.visitors.hashCode() + ((iD + (j0Var == null ? 0 : j0Var.hashCode())) * 31)) * 31)) * 31, 31, this.additionalInformation);
        List<t> list = this.includedFeatures;
        int iHashCode = (iD2 + (list == null ? 0 : list.hashCode())) * 31;
        List<t> list2 = this.excludedFeatures;
        int iHashCode2 = (this.cancellationPolicy.hashCode() + p.a.d(p.a.c((iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.description), 31, this.tourSnapshot)) * 31;
        List<z> list3 = this.languages;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<a0> list4 = this.locations;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        b0 b0Var = this.logistics;
        int iHashCode5 = (iHashCode4 + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        w wVar = this.itinerary;
        int iHashCode6 = (iHashCode5 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        k0 k0Var = this.supplier;
        return iHashCode6 + (k0Var != null ? k0Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final List getLanguages() {
        return this.languages;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final List getLocations() {
        return this.locations;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final b0 getLogistics() {
        return this.logistics;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final j0 getRatings() {
        return this.ratings;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final xzf.a getStartingPrice() {
        return this.startingPrice;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final k0 getSupplier() {
        return this.supplier;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final List getTourSnapshot() {
        return this.tourSnapshot;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final m0 getVisitors() {
        return this.visitors;
    }
}
