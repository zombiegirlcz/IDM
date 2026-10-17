package rhc;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\f\u0010\u0013R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\t\u0010\u0018¨\u0006\u001a"}, d2 = {"Lrhc/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "b", "address", "Lco3/b;", "c", "Lco3/b;", "e", "()Lco3/b;", "location", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "distanceMeters", "", "Lrhc/b;", "Ljava/util/List;", "()Ljava/util/List;", "availability", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("address")
    @NotNull
    private final String address;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("location")
    @NotNull
    private final co3.b location;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("distanceMeters")
    private final Integer distanceMeters;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("availability")
    @NotNull
    private final List<b> availability;

    public c(String id10, String address, co3.b location, Integer num, ArrayList availability) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(availability, "availability");
        this.id = id10;
        this.address = address;
        this.location = location;
        this.distanceMeters = num;
        this.availability = availability;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getAvailability() {
        return this.availability;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getDistanceMeters() {
        return this.distanceMeters;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final co3.b getLocation() {
        return this.location;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.id, cVar.id) && Intrinsics.f(this.address, cVar.address) && Intrinsics.f(this.location, cVar.location) && Intrinsics.f(this.distanceMeters, cVar.distanceMeters) && Intrinsics.f(this.availability, cVar.availability);
    }

    public final int hashCode() {
        int iHashCode = (this.location.hashCode() + p.a.c(this.id.hashCode() * 31, 31, this.address)) * 31;
        Integer num = this.distanceMeters;
        return this.availability.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }
}
