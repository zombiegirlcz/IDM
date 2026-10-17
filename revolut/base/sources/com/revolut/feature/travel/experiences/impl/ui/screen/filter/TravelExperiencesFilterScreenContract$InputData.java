package com.revolut.feature.travel.experiences.impl.ui.screen.filter;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceFiltersSelection;
import com.revolut.feature.travel.experiences.api.models.search.LocationId;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/experiences/impl/ui/screen/filter/TravelExperiencesFilterScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperiencesFilterScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelExperiencesFilterScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperienceFiltersSelection f93069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationId f93070b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelExperiencesFilterScreenContract$InputData((TravelExperienceFiltersSelection) parcel.readParcelable(TravelExperiencesFilterScreenContract$InputData.class.getClassLoader()), (LocationId) parcel.readParcelable(TravelExperiencesFilterScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperiencesFilterScreenContract$InputData[i];
        }
    }

    public TravelExperiencesFilterScreenContract$InputData(TravelExperienceFiltersSelection selectedFilters, LocationId locationId) {
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        this.f93069a = selectedFilters;
        this.f93070b = locationId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperiencesFilterScreenContract$InputData)) {
            return false;
        }
        TravelExperiencesFilterScreenContract$InputData travelExperiencesFilterScreenContract$InputData = (TravelExperiencesFilterScreenContract$InputData) obj2;
        return Intrinsics.f(this.f93069a, travelExperiencesFilterScreenContract$InputData.f93069a) && Intrinsics.f(this.f93070b, travelExperiencesFilterScreenContract$InputData.f93070b);
    }

    public final int hashCode() {
        int iHashCode = this.f93069a.hashCode() * 31;
        LocationId locationId = this.f93070b;
        return iHashCode + (locationId == null ? 0 : locationId.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f93069a, i);
        dest.writeParcelable(this.f93070b, i);
    }
}
