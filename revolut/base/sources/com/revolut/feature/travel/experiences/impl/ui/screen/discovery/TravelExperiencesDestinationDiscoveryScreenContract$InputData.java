package com.revolut.feature.travel.experiences.impl.ui.screen.discovery;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.experiences.api.models.search.LocationId;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/experiences/impl/ui/screen/discovery/TravelExperiencesDestinationDiscoveryScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperiencesDestinationDiscoveryScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelExperiencesDestinationDiscoveryScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelExperienceDatesSelection f93063b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelExperiencesDestinationDiscoveryScreenContract$InputData(((LocationId.DestinationId) parcel.readParcelable(TravelExperiencesDestinationDiscoveryScreenContract$InputData.class.getClassLoader())).f92881a, (TravelExperienceDatesSelection) parcel.readParcelable(TravelExperiencesDestinationDiscoveryScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperiencesDestinationDiscoveryScreenContract$InputData[i];
        }
    }

    public TravelExperiencesDestinationDiscoveryScreenContract$InputData(String destinationId, TravelExperienceDatesSelection datesSelection) {
        Intrinsics.checkNotNullParameter(destinationId, "destinationId");
        Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
        this.f93062a = destinationId;
        this.f93063b = datesSelection;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperiencesDestinationDiscoveryScreenContract$InputData)) {
            return false;
        }
        TravelExperiencesDestinationDiscoveryScreenContract$InputData travelExperiencesDestinationDiscoveryScreenContract$InputData = (TravelExperiencesDestinationDiscoveryScreenContract$InputData) obj2;
        return Intrinsics.f(this.f93062a, travelExperiencesDestinationDiscoveryScreenContract$InputData.f93062a) && Intrinsics.f(this.f93063b, travelExperiencesDestinationDiscoveryScreenContract$InputData.f93063b);
    }

    public final int hashCode() {
        return this.f93063b.hashCode() + (this.f93062a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(new LocationId.DestinationId(this.f93062a), i);
        dest.writeParcelable(this.f93063b, i);
    }
}
