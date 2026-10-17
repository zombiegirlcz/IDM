package rzf;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0007\u0010\u0004¨\u0006\u0013"}, d2 = {"Lrzf/s;", "", "", "toString", "()Ljava/lang/String;", "", "Lrzf/t;", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "locations", "", "b", "Z", "()Z", "allowCustomPickup", "Ljava/lang/String;", "additionalPickupInfo", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("locations")
    @NotNull
    private final List<t> locations;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("allowCustomPickup")
    private final boolean allowCustomPickup;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("additionalPickupInfo")
    @NotNull
    private final String additionalPickupInfo;

    public s(String additionalPickupInfo, ArrayList locations, boolean z) {
        Intrinsics.checkNotNullParameter(locations, "locations");
        Intrinsics.checkNotNullParameter(additionalPickupInfo, "additionalPickupInfo");
        this.locations = locations;
        this.allowCustomPickup = z;
        this.additionalPickupInfo = additionalPickupInfo;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAdditionalPickupInfo() {
        return this.additionalPickupInfo;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getAllowCustomPickup() {
        return this.allowCustomPickup;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getLocations() {
        return this.locations;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.locations, sVar.locations) && this.allowCustomPickup == sVar.allowCustomPickup && Intrinsics.f(this.additionalPickupInfo, sVar.additionalPickupInfo);
    }

    public final int hashCode() {
        return this.additionalPickupInfo.hashCode() + j6.a.c(this.locations.hashCode() * 31, 31, this.allowCustomPickup);
    }
}
