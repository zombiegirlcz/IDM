package u9g;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010!\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lu9g/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getState", "state", "b", "getSessionId", "sessionId", "c", "getLocationId", "locationId", "d", "getLocationType", "locationType", "e", "getPropertyId", "propertyId", "", "Lu9g/c;", "f", "Ljava/util/List;", "getRoomsInformation", "()Ljava/util/List;", "roomsInformation", "Lu9g/d;", "g", "Lu9g/d;", "getSearchParameters", "()Lu9g/d;", "searchParameters", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("sessionId")
    @NotNull
    private final String sessionId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("locationId")
    private final String locationId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("locationType")
    private final String locationType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("propertyId")
    private final String propertyId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("roomsInformation")
    private final List<c> roomsInformation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("searchParameters")
    @NotNull
    private final d searchParameters;

    public b(String state, String sessionId, String str, String str2, String str3, ArrayList arrayList, d searchParameters) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(searchParameters, "searchParameters");
        this.state = state;
        this.sessionId = sessionId;
        this.locationId = str;
        this.locationType = str2;
        this.propertyId = str3;
        this.roomsInformation = arrayList;
        this.searchParameters = searchParameters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.state, bVar.state) && Intrinsics.f(this.sessionId, bVar.sessionId) && Intrinsics.f(this.locationId, bVar.locationId) && Intrinsics.f(this.locationType, bVar.locationType) && Intrinsics.f(this.propertyId, bVar.propertyId) && Intrinsics.f(this.roomsInformation, bVar.roomsInformation) && Intrinsics.f(this.searchParameters, bVar.searchParameters);
    }

    public final int hashCode() {
        int iC = p.a.c(this.state.hashCode() * 31, 31, this.sessionId);
        String str = this.locationId;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.locationType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.propertyId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<c> list = this.roomsInformation;
        return this.searchParameters.hashCode() + ((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31);
    }
}
