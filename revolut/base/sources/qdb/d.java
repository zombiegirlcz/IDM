package qdb;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\t\u0010\u0016¨\u0006\u0019"}, d2 = {"Lqdb/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "d", "locationId", "e", "name", "Lno3/b;", "Lno3/b;", "()Lno3/b;", "address", "f", "timeZone", "Lqdb/c;", "Lqdb/c;", "()Lqdb/c;", "geoLocation", "Companion", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("locationId")
    @NotNull
    private final String locationId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("address")
    @NotNull
    private final no3.b address;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("timeZone")
    private final String timeZone;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("geoLocation")
    private final c geoLocation;

    public d(String id10, String locationId, String name, no3.b address, String str, c cVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(address, "address");
        this.id = id10;
        this.locationId = locationId;
        this.name = name;
        this.address = address;
        this.timeZone = str;
        this.geoLocation = cVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final no3.b getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getGeoLocation() {
        return this.geoLocation;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLocationId() {
        return this.locationId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.id, dVar.id) && Intrinsics.f(this.locationId, dVar.locationId) && Intrinsics.f(this.name, dVar.name) && Intrinsics.f(this.address, dVar.address) && Intrinsics.f(this.timeZone, dVar.timeZone) && Intrinsics.f(this.geoLocation, dVar.geoLocation);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTimeZone() {
        return this.timeZone;
    }

    public final int hashCode() {
        int iHashCode = (this.address.hashCode() + p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.locationId), 31, this.name)) * 31;
        String str = this.timeZone;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        c cVar = this.geoLocation;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }
}
