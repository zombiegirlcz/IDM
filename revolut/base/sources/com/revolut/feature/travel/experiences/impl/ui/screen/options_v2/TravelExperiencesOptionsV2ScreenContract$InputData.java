package com.revolut.feature.travel.experiences.impl.ui.screen.options_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceVisitorsSelection;
import com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/experiences/impl/ui/screen/options_v2/TravelExperiencesOptionsV2ScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperiencesOptionsV2ScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelExperiencesOptionsV2ScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperienceDatesSelection f93092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelExperienceVisitorsSelection f93093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy f93094c;
    public final b d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelExperiencesOptionsV2ScreenContract$InputData((TravelExperienceDatesSelection) parcel.readParcelable(TravelExperiencesOptionsV2ScreenContract$InputData.class.getClassLoader()), (TravelExperienceVisitorsSelection) parcel.readParcelable(TravelExperiencesOptionsV2ScreenContract$InputData.class.getClassLoader()), (TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy) parcel.readParcelable(TravelExperiencesOptionsV2ScreenContract$InputData.class.getClassLoader()), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperiencesOptionsV2ScreenContract$InputData[i];
        }
    }

    public TravelExperiencesOptionsV2ScreenContract$InputData(TravelExperienceDatesSelection datesSelection, TravelExperienceVisitorsSelection visitorsSelection, TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy datesAvailabilityStrategy, b baseCurrency) {
        Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
        Intrinsics.checkNotNullParameter(visitorsSelection, "visitorsSelection");
        Intrinsics.checkNotNullParameter(datesAvailabilityStrategy, "datesAvailabilityStrategy");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        this.f93092a = datesSelection;
        this.f93093b = visitorsSelection;
        this.f93094c = datesAvailabilityStrategy;
        this.d = baseCurrency;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperiencesOptionsV2ScreenContract$InputData)) {
            return false;
        }
        TravelExperiencesOptionsV2ScreenContract$InputData travelExperiencesOptionsV2ScreenContract$InputData = (TravelExperiencesOptionsV2ScreenContract$InputData) obj2;
        return Intrinsics.f(this.f93092a, travelExperiencesOptionsV2ScreenContract$InputData.f93092a) && Intrinsics.f(this.f93093b, travelExperiencesOptionsV2ScreenContract$InputData.f93093b) && Intrinsics.f(this.f93094c, travelExperiencesOptionsV2ScreenContract$InputData.f93094c) && Intrinsics.f(this.d, travelExperiencesOptionsV2ScreenContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f93094c.hashCode() + p.a.e(this.f93092a.hashCode() * 31, 31, this.f93093b.f92916a)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f93092a, i);
        dest.writeParcelable(this.f93093b, i);
        dest.writeParcelable(this.f93094c, i);
        dest.writeSerializable(this.d);
    }
}
