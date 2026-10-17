package j2g;

import com.revolut.data.model.Data;
import com.revolut.feature.travel.experiences.api.models.config.TravelExperiencesSelectedLocation;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperienceDatesSelection f170866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelExperiencesSelectedLocation f170867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f170868c;
    public final Data d;
    public final Data e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f170869g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f170870h;
    public final Data i;

    public h(TravelExperienceDatesSelection datesSelection, TravelExperiencesSelectedLocation travelExperiencesSelectedLocation, Data discoverMore, Data revPointsBanner, Data locationExperiences, Data upcomingBookings, Data recommendedCategories, Data recentlyViewed, Data legalEntityContext) {
        Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
        Intrinsics.checkNotNullParameter(discoverMore, "discoverMore");
        Intrinsics.checkNotNullParameter(revPointsBanner, "revPointsBanner");
        Intrinsics.checkNotNullParameter(locationExperiences, "locationExperiences");
        Intrinsics.checkNotNullParameter(upcomingBookings, "upcomingBookings");
        Intrinsics.checkNotNullParameter(recommendedCategories, "recommendedCategories");
        Intrinsics.checkNotNullParameter(recentlyViewed, "recentlyViewed");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        this.f170866a = datesSelection;
        this.f170867b = travelExperiencesSelectedLocation;
        this.f170868c = discoverMore;
        this.d = revPointsBanner;
        this.e = locationExperiences;
        this.f = upcomingBookings;
        this.f170869g = recommendedCategories;
        this.f170870h = recentlyViewed;
        this.i = legalEntityContext;
    }

    public static h a(h hVar, TravelExperienceDatesSelection travelExperienceDatesSelection, TravelExperiencesSelectedLocation travelExperiencesSelectedLocation, Data data, Data data2, Data data3, Data data4, Data data5, int i) {
        if ((i & 1) != 0) {
            travelExperienceDatesSelection = hVar.f170866a;
        }
        TravelExperienceDatesSelection datesSelection = travelExperienceDatesSelection;
        if ((i & 2) != 0) {
            travelExperiencesSelectedLocation = hVar.f170867b;
        }
        TravelExperiencesSelectedLocation travelExperiencesSelectedLocation2 = travelExperiencesSelectedLocation;
        Data discoverMore = (i & 4) != 0 ? hVar.f170868c : data;
        Data revPointsBanner = hVar.d;
        Data locationExperiences = hVar.e;
        Data upcomingBookings = (i & 32) != 0 ? hVar.f : data2;
        Data recommendedCategories = (i & 64) != 0 ? hVar.f170869g : data3;
        Data recentlyViewed = (i & 128) != 0 ? hVar.f170870h : data4;
        Data legalEntityContext = (i & 256) != 0 ? hVar.i : data5;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
        Intrinsics.checkNotNullParameter(discoverMore, "discoverMore");
        Intrinsics.checkNotNullParameter(revPointsBanner, "revPointsBanner");
        Intrinsics.checkNotNullParameter(locationExperiences, "locationExperiences");
        Intrinsics.checkNotNullParameter(upcomingBookings, "upcomingBookings");
        Intrinsics.checkNotNullParameter(recommendedCategories, "recommendedCategories");
        Intrinsics.checkNotNullParameter(recentlyViewed, "recentlyViewed");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        return new h(datesSelection, travelExperiencesSelectedLocation2, discoverMore, revPointsBanner, locationExperiences, upcomingBookings, recommendedCategories, recentlyViewed, legalEntityContext);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f170866a, hVar.f170866a) && Intrinsics.f(this.f170867b, hVar.f170867b) && Intrinsics.f(this.f170868c, hVar.f170868c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f170869g, hVar.f170869g) && Intrinsics.f(this.f170870h, hVar.f170870h) && Intrinsics.f(this.i, hVar.i);
    }

    public final int hashCode() {
        int iHashCode = this.f170866a.hashCode() * 31;
        TravelExperiencesSelectedLocation travelExperiencesSelectedLocation = this.f170867b;
        return this.i.hashCode() + kii.e.c(this.f170870h, kii.e.c(this.f170869g, kii.e.c(this.f, kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f170868c, (iHashCode + (travelExperiencesSelectedLocation == null ? 0 : travelExperiencesSelectedLocation.hashCode())) * 31, 31), 31), 31), 31), 31), 31);
    }
}
