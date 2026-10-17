package hb3;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lhb3/f;", "", "", "toString", "()Ljava/lang/String;", "", "Lhb3/e;", "a", "Ljava/util/List;", "()Ljava/util/List;", "locations", "Lorg/joda/time/DateTime;", "b", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "userLastLocationTime", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("locations")
    @NotNull
    private final List<e> locations;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("userLastLocationTime")
    @NotNull
    private final DateTime userLastLocationTime;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getLocations() {
        return this.locations;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DateTime getUserLastLocationTime() {
        return this.userLastLocationTime;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.locations, fVar.locations) && Intrinsics.f(this.userLastLocationTime, fVar.userLastLocationTime);
    }

    public final int hashCode() {
        return this.userLastLocationTime.hashCode() + (this.locations.hashCode() * 31);
    }
}
