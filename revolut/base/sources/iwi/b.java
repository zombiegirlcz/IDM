package iwi;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\t\u0010\u0004R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0011\u0010\u0018R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\f\u0010\u0018R\u001c\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b\u001b\u0010!¨\u0006#"}, d2 = {"Liwi/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "b", "h", "name", "c", "j", "terminal", "k", "travelType", "e", "f", "inspection", "airportName", "", "g", "Ljava/util/List;", "()Ljava/util/List;", "imagesUrls", "locationGuide", "i", "additionalInfo", "Liwi/d;", "facilities", "Liwi/e;", "Liwi/e;", "()Liwi/e;", "openingHours", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("terminal")
    @NotNull
    private final String terminal;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("travelType")
    private final String travelType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("inspection")
    private final String inspection;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("airportName")
    @NotNull
    private final String airportName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("images")
    @NotNull
    private final List<String> imagesUrls;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("locationGuide")
    private final String locationGuide;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("additionalInfo")
    private final String additionalInfo;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("facilities")
    @NotNull
    private final List<d> facilities;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("openingHours")
    private final e openingHours;

    public b(String id10, String name, String terminal, String str, String str2, String airportName, List imagesUrls, String str3, String str4, ArrayList facilities, e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(terminal, "terminal");
        Intrinsics.checkNotNullParameter(airportName, "airportName");
        Intrinsics.checkNotNullParameter(imagesUrls, "imagesUrls");
        Intrinsics.checkNotNullParameter(facilities, "facilities");
        this.id = id10;
        this.name = name;
        this.terminal = terminal;
        this.travelType = str;
        this.inspection = str2;
        this.airportName = airportName;
        this.imagesUrls = imagesUrls;
        this.locationGuide = str3;
        this.additionalInfo = str4;
        this.facilities = facilities;
        this.openingHours = eVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAdditionalInfo() {
        return this.additionalInfo;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAirportName() {
        return this.airportName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getFacilities() {
        return this.facilities;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getImagesUrls() {
        return this.imagesUrls;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.name, bVar.name) && Intrinsics.f(this.terminal, bVar.terminal) && Intrinsics.f(this.travelType, bVar.travelType) && Intrinsics.f(this.inspection, bVar.inspection) && Intrinsics.f(this.airportName, bVar.airportName) && Intrinsics.f(this.imagesUrls, bVar.imagesUrls) && Intrinsics.f(this.locationGuide, bVar.locationGuide) && Intrinsics.f(this.additionalInfo, bVar.additionalInfo) && Intrinsics.f(this.facilities, bVar.facilities) && Intrinsics.f(this.openingHours, bVar.openingHours);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getInspection() {
        return this.inspection;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getLocationGuide() {
        return this.locationGuide;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.name), 31, this.terminal);
        String str = this.travelType;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.inspection;
        int iD = p.a.d(p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.airportName), 31, this.imagesUrls);
        String str3 = this.locationGuide;
        int iHashCode2 = (iD + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.additionalInfo;
        int iD2 = p.a.d((iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.facilities);
        e eVar = this.openingHours;
        return iD2 + (eVar != null ? eVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final e getOpeningHours() {
        return this.openingHours;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTerminal() {
        return this.terminal;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getTravelType() {
        return this.travelType;
    }
}
