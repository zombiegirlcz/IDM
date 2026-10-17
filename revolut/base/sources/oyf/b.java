package oyf;

import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceFiltersSelection;
import com.revolut.feature.travel.experiences.api.models.search.LocationId;
import com.revolut.feature_travel_hotels_models.location.Coordinates;
import kotlin.jvm.internal.Intrinsics;
import lk0.f;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends f {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationId f231034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f231035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f231036c;
    public final String d;
    public final String e;
    public final TravelExperienceFiltersSelection f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Coordinates f231037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f231038h;

    public b(LocationId locationId, DateTime dateTime, DateTime dateTime2, String currency, String str, TravelExperienceFiltersSelection selectedFilters, Coordinates coordinates, int i) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        this.f231034a = locationId;
        this.f231035b = dateTime;
        this.f231036c = dateTime2;
        this.d = currency;
        this.e = str;
        this.f = selectedFilters;
        this.f231037g = coordinates;
        this.f231038h = i;
    }

    @Override // lk0.f
    /* JADX INFO: renamed from: a */
    public final int getF84104a() {
        return this.f231038h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f231034a, bVar.f231034a) && Intrinsics.f(this.f231035b, bVar.f231035b) && Intrinsics.f(this.f231036c, bVar.f231036c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f231037g, bVar.f231037g) && this.f231038h == bVar.f231038h;
    }

    public final int hashCode() {
        LocationId locationId = this.f231034a;
        int iHashCode = (locationId == null ? 0 : locationId.hashCode()) * 31;
        DateTime dateTime = this.f231035b;
        int iHashCode2 = (iHashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.f231036c;
        int iC = p.a.c((iHashCode2 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31, 31, this.d);
        String str = this.e;
        int iHashCode3 = (this.f.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Coordinates coordinates = this.f231037g;
        return Integer.hashCode(this.f231038h) + ((iHashCode3 + (coordinates != null ? coordinates.hashCode() : 0)) * 31);
    }
}
