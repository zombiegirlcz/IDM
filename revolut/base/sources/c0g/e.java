package c0g;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\tR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\f\u0010\tR\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u0011\u0010\t¨\u0006\u0013"}, d2 = {"Lc0g/e;", "", "", "toString", "()Ljava/lang/String;", "", "Lc0g/a;", "a", "Ljava/util/List;", "()Ljava/util/List;", "attractions", "Lc0g/d;", "b", "c", "experiences", "Lc0g/c;", "destinations", "d", "orderedIds", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("attractions")
    private final List<a> attractions;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("experiences")
    @NotNull
    private final List<d> experiences;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("destinations")
    private final List<c> destinations;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("orderedIds")
    private final List<String> orderedIds;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAttractions() {
        return this.attractions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getDestinations() {
        return this.destinations;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getExperiences() {
        return this.experiences;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getOrderedIds() {
        return this.orderedIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.attractions, eVar.attractions) && Intrinsics.f(this.experiences, eVar.experiences) && Intrinsics.f(this.destinations, eVar.destinations) && Intrinsics.f(this.orderedIds, eVar.orderedIds);
    }

    public final int hashCode() {
        List<a> list = this.attractions;
        int iD = p.a.d((list == null ? 0 : list.hashCode()) * 31, 31, this.experiences);
        List<c> list2 = this.destinations;
        int iHashCode = (iD + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.orderedIds;
        return iHashCode + (list3 != null ? list3.hashCode() : 0);
    }
}
