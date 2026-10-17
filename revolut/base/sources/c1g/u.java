package c1g;

import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLocation;
import com.revolut.feature.travel.experiences.api.models.search.LocationId;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes9.dex */
public final class u implements hyf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0g.a f20509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f20510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hyf.a f20511c;

    public u(m0g.a repository, wsg.n walletInteractor, hyf.a travelExperiencesFeatureInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(travelExperiencesFeatureInteractor, "travelExperiencesFeatureInteractor");
        this.f20509a = repository;
        this.f20510b = walletInteractor;
        this.f20511c = travelExperiencesFeatureInteractor;
    }

    public static myf.d0 d(myf.a aVar) {
        TravelExperienceLocation travelExperienceLocation;
        Pair pair;
        TravelExperienceLocation travelExperienceLocation2;
        Pair pair2 = (Pair) zhm.d0.d0(c8g.a.z(aVar));
        if (pair2 == null || (travelExperienceLocation = (TravelExperienceLocation) pair2.f186386b) == null || (pair = (Pair) zhm.d0.d0(c8g.a.y(aVar))) == null || (travelExperienceLocation2 = (TravelExperienceLocation) pair.f186386b) == null) {
            return null;
        }
        return new myf.d0(travelExperienceLocation, travelExperienceLocation2);
    }

    public final Flow a(LocationId locationId) {
        if (locationId instanceof LocationId.AttractionId) {
            return b(null, ((LocationId.AttractionId) locationId).f92880a);
        }
        if (locationId instanceof LocationId.DestinationId) {
            return b(((LocationId.DestinationId) locationId).f92881a, null);
        }
        if (locationId == null) {
            return b(null, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Flow b(String str, String str2) {
        return boh.f.e(rd0.e.b(osg.b.d(this.f20510b)), new o(this, 0, str, str2));
    }

    public final Flow c(String experienceId) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        return boh.f.e(rd0.e.b(osg.b.d(this.f20510b)), new byc.a(this, experienceId, 11));
    }
}
