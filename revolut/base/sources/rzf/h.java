package rzf;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010$\u001a\b\u0012\u0004\u0012\u00020\"0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u000e\u001a\u0004\b\u0005\u0010\u0010R\"\u0010'\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u000e\u001a\u0004\b#\u0010\u0010R\"\u0010)\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010+\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b\r\u0010\u0004R \u0010/\u001a\b\u0012\u0004\u0012\u00020,0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u000e\u001a\u0004\b.\u0010\u0010R\u001a\u00103\u001a\u0002008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b\t\u00102R \u00105\u001a\b\u0012\u0004\u0012\u0002040\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b(\u0010\u0010R \u00107\u001a\b\u0012\u0004\u0012\u0002060\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u000e\u001a\u0004\b*\u0010\u0010R\u001c\u0010<\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b-\u0010;R\u001c\u0010@\u001a\u0004\u0018\u00010=8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010>\u001a\u0004\b&\u0010?R\u001c\u0010D\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010B\u001a\u0004\b9\u0010C¨\u0006E"}, d2 = {"Lrzf/h;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "l", "name", "", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", "images", "Lrzf/u;", "d", "Lrzf/u;", "m", "()Lrzf/u;", "ratings", "Lrzf/x;", "Lrzf/x;", "q", "()Lrzf/x;", "visitors", "Lyzf/a;", "Lyzf/a;", "n", "()Lyzf/a;", "startingPrice", "Lrzf/a;", "g", "additionalInformation", "Lrzf/j;", "h", "includedFeatures", "i", "excludedFeatures", "j", "description", "Lrzf/w;", "k", "p", "tourSnapshot", "Ljzf/c;", "Ljzf/c;", "()Ljzf/c;", "cancellationPolicy", "Lrzf/o;", "languages", "Lrzf/p;", "locations", "Lrzf/q;", "o", "Lrzf/q;", "()Lrzf/q;", "logistics", "Lrzf/l;", "Lrzf/l;", "()Lrzf/l;", "itinerary", "Lrzf/v;", "Lrzf/v;", "()Lrzf/v;", "supplier", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

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
    private final u ratings;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("visitors")
    @NotNull
    private final x visitors;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("startingPrice")
    @NotNull
    private final yzf.a startingPrice;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("additionalInfo")
    @NotNull
    private final List<a> additionalInformation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("includedFeatures")
    private final List<j> includedFeatures;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("excludedFeatures")
    private final List<j> excludedFeatures;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("tourSnapshot")
    @NotNull
    private final List<w> tourSnapshot;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancellationPolicy")
    @NotNull
    private final jzf.c cancellationPolicy;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("languages")
    @NotNull
    private final List<o> languages;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("locations")
    @NotNull
    private final List<p> locations;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("logistics")
    private final q logistics;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("itinerary")
    private final l itinerary;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("supplier")
    private final v supplier;

    public h(String id10, String name, List images, u uVar, x visitors, yzf.a startingPrice, ArrayList additionalInformation, ArrayList arrayList, ArrayList arrayList2, String description, ArrayList tourSnapshot, jzf.c cancellationPolicy, ArrayList languages, ArrayList locations, q qVar, l lVar, v vVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(visitors, "visitors");
        Intrinsics.checkNotNullParameter(startingPrice, "startingPrice");
        Intrinsics.checkNotNullParameter(additionalInformation, "additionalInformation");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(tourSnapshot, "tourSnapshot");
        Intrinsics.checkNotNullParameter(cancellationPolicy, "cancellationPolicy");
        Intrinsics.checkNotNullParameter(languages, "languages");
        Intrinsics.checkNotNullParameter(locations, "locations");
        this.id = id10;
        this.name = name;
        this.images = images;
        this.ratings = uVar;
        this.visitors = visitors;
        this.startingPrice = startingPrice;
        this.additionalInformation = additionalInformation;
        this.includedFeatures = arrayList;
        this.excludedFeatures = arrayList2;
        this.description = description;
        this.tourSnapshot = tourSnapshot;
        this.cancellationPolicy = cancellationPolicy;
        this.languages = languages;
        this.locations = locations;
        this.logistics = qVar;
        this.itinerary = lVar;
        this.supplier = vVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAdditionalInformation() {
        return this.additionalInformation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jzf.c getCancellationPolicy() {
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
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.id, hVar.id) && Intrinsics.f(this.name, hVar.name) && Intrinsics.f(this.images, hVar.images) && Intrinsics.f(this.ratings, hVar.ratings) && Intrinsics.f(this.visitors, hVar.visitors) && Intrinsics.f(this.startingPrice, hVar.startingPrice) && Intrinsics.f(this.additionalInformation, hVar.additionalInformation) && Intrinsics.f(this.includedFeatures, hVar.includedFeatures) && Intrinsics.f(this.excludedFeatures, hVar.excludedFeatures) && Intrinsics.f(this.description, hVar.description) && Intrinsics.f(this.tourSnapshot, hVar.tourSnapshot) && Intrinsics.f(this.cancellationPolicy, hVar.cancellationPolicy) && Intrinsics.f(this.languages, hVar.languages) && Intrinsics.f(this.locations, hVar.locations) && Intrinsics.f(this.logistics, hVar.logistics) && Intrinsics.f(this.itinerary, hVar.itinerary) && Intrinsics.f(this.supplier, hVar.supplier);
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
    public final l getItinerary() {
        return this.itinerary;
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(this.id.hashCode() * 31, 31, this.name), 31, this.images);
        u uVar = this.ratings;
        int iD2 = p.a.d((this.startingPrice.hashCode() + ((this.visitors.hashCode() + ((iD + (uVar == null ? 0 : uVar.hashCode())) * 31)) * 31)) * 31, 31, this.additionalInformation);
        List<j> list = this.includedFeatures;
        int iHashCode = (iD2 + (list == null ? 0 : list.hashCode())) * 31;
        List<j> list2 = this.excludedFeatures;
        int iD3 = p.a.d(p.a.d((this.cancellationPolicy.hashCode() + p.a.d(p.a.c((iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.description), 31, this.tourSnapshot)) * 31, 31, this.languages), 31, this.locations);
        q qVar = this.logistics;
        int iHashCode2 = (iD3 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        l lVar = this.itinerary;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        v vVar = this.supplier;
        return iHashCode3 + (vVar != null ? vVar.hashCode() : 0);
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
    public final q getLogistics() {
        return this.logistics;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final u getRatings() {
        return this.ratings;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final yzf.a getStartingPrice() {
        return this.startingPrice;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final v getSupplier() {
        return this.supplier;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final List getTourSnapshot() {
        return this.tourSnapshot;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final x getVisitors() {
        return this.visitors;
    }
}
