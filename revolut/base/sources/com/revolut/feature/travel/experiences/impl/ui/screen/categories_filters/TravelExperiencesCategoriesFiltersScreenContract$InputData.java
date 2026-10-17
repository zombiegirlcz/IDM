package com.revolut.feature.travel.experiences.impl.ui.screen.categories_filters;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.experiences.api.models.search.LocationId;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/experiences/impl/ui/screen/categories_filters/TravelExperiencesCategoriesFiltersScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperiencesCategoriesFiltersScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelExperiencesCategoriesFiltersScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f93044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationId f93045b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iA = 0;
            while (iA != i) {
                iA = o.a(parcel, linkedHashSet, iA, 1);
            }
            return new TravelExperiencesCategoriesFiltersScreenContract$InputData(linkedHashSet, (LocationId) parcel.readParcelable(TravelExperiencesCategoriesFiltersScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperiencesCategoriesFiltersScreenContract$InputData[i];
        }
    }

    public TravelExperiencesCategoriesFiltersScreenContract$InputData(Set categories, LocationId locationId) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.f93044a = categories;
        this.f93045b = locationId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperiencesCategoriesFiltersScreenContract$InputData)) {
            return false;
        }
        TravelExperiencesCategoriesFiltersScreenContract$InputData travelExperiencesCategoriesFiltersScreenContract$InputData = (TravelExperiencesCategoriesFiltersScreenContract$InputData) obj2;
        return Intrinsics.f(this.f93044a, travelExperiencesCategoriesFiltersScreenContract$InputData.f93044a) && Intrinsics.f(this.f93045b, travelExperiencesCategoriesFiltersScreenContract$InputData.f93045b);
    }

    public final int hashCode() {
        int iHashCode = this.f93044a.hashCode() * 31;
        LocationId locationId = this.f93045b;
        return iHashCode + (locationId == null ? 0 : locationId.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.f93044a, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
        dest.writeParcelable(this.f93045b, i);
    }
}
