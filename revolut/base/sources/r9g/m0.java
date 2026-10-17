package r9g;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\t\u0010\u0019R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0005\u0010\u0015R \u0010#\u001a\b\u0012\u0004\u0012\u00020!0\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\"\u0010\u0015R\u001c\u0010(\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\u001c\u0010'R\"\u0010*\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b%\u0010\u0015¨\u0006+"}, d2 = {"Lr9g/m0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "b", "g", "name", "Lofi/h;", "c", "Lofi/h;", "()Lofi/h;", "description", "", "Lofi/i;", "Ljava/util/List;", "e", "()Ljava/util/List;", "images", "Lofi/b;", "Lofi/b;", "()Lofi/b;", "area", "Lr9g/l0;", "f", "h", "rates", "Lofi/e;", "amenities", "Lcag/k;", "j", "views", "Lcag/g;", "i", "Lcag/g;", "()Lcag/g;", "maxOccupancy", "Lcag/f;", "units", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final ofi.h description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("images")
    @NotNull
    private final List<ofi.i> images;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("area")
    private final ofi.b area;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("rates")
    @NotNull
    private final List<l0> rates;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("amenities")
    @NotNull
    private final List<ofi.e> amenities;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("views")
    @NotNull
    private final List<cag.k> views;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("maxOccupancy")
    private final cag.g maxOccupancy;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("units")
    private final List<cag.f> units;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAmenities() {
        return this.amenities;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ofi.b getArea() {
        return this.area;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ofi.h getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getImages() {
        return this.images;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.id, m0Var.id) && Intrinsics.f(this.name, m0Var.name) && Intrinsics.f(this.description, m0Var.description) && Intrinsics.f(this.images, m0Var.images) && Intrinsics.f(this.area, m0Var.area) && Intrinsics.f(this.rates, m0Var.rates) && Intrinsics.f(this.amenities, m0Var.amenities) && Intrinsics.f(this.views, m0Var.views) && Intrinsics.f(this.maxOccupancy, m0Var.maxOccupancy) && Intrinsics.f(this.units, m0Var.units);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final cag.g getMaxOccupancy() {
        return this.maxOccupancy;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final List getRates() {
        return this.rates;
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.name);
        ofi.h hVar = this.description;
        int iD = p.a.d((iC + (hVar == null ? 0 : hVar.hashCode())) * 31, 31, this.images);
        ofi.b bVar = this.area;
        int iD2 = p.a.d(p.a.d(p.a.d((iD + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.rates), 31, this.amenities), 31, this.views);
        cag.g gVar = this.maxOccupancy;
        int iHashCode = (iD2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        List<cag.f> list = this.units;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final List getUnits() {
        return this.units;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final List getViews() {
        return this.views;
    }
}
