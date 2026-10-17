package j2g;

import com.revolut.feature.travel.experiences.api.models.config.TravelExperiencesSelectedLocation;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class k implements aii.r {

    public static final class a extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelExperienceDatesSelection f170875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TravelExperiencesSelectedLocation f170876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f170877c;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this((TravelExperienceDatesSelection) null, (TravelExperiencesSelectedLocation) (0 == true ? 1 : 0), 7);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f170875a, aVar.f170875a) && Intrinsics.f(this.f170876b, aVar.f170876b) && this.f170877c == aVar.f170877c;
        }

        public final int hashCode() {
            int iHashCode = this.f170875a.hashCode() * 31;
            TravelExperiencesSelectedLocation travelExperiencesSelectedLocation = this.f170876b;
            return Boolean.hashCode(this.f170877c) + ((iHashCode + (travelExperiencesSelectedLocation == null ? 0 : travelExperiencesSelectedLocation.hashCode())) * 31);
        }

        public a(TravelExperienceDatesSelection datesSelection, TravelExperiencesSelectedLocation travelExperiencesSelectedLocation, boolean z) {
            Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
            this.f170875a = datesSelection;
            this.f170876b = travelExperiencesSelectedLocation;
            this.f170877c = z;
        }

        public /* synthetic */ a(TravelExperienceDatesSelection travelExperienceDatesSelection, TravelExperiencesSelectedLocation travelExperiencesSelectedLocation, int i) {
            this((i & 1) != 0 ? TravelExperienceDatesSelection.NoDatesSelection.f92906a : travelExperienceDatesSelection, (i & 2) != 0 ? null : travelExperiencesSelectedLocation, false);
        }
    }

    public static final class b extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f170878a = new b();

        private b() {
        }
    }

    private k() {
    }
}
