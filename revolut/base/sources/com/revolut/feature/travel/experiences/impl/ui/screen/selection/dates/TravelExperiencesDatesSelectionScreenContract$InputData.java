package com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o3g.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/experiences/impl/ui/screen/selection/dates/TravelExperiencesDatesSelectionScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperiencesDatesSelectionScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelExperiencesDatesSelectionScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperienceDatesSelection f93161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f93162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy f93163c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelExperiencesDatesSelectionScreenContract$InputData((TravelExperienceDatesSelection) parcel.readParcelable(TravelExperiencesDatesSelectionScreenContract$InputData.class.getClassLoader()), e.valueOf(parcel.readString()), (TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy) parcel.readParcelable(TravelExperiencesDatesSelectionScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperiencesDatesSelectionScreenContract$InputData[i];
        }
    }

    public TravelExperiencesDatesSelectionScreenContract$InputData(TravelExperienceDatesSelection datesSelection, e dateSelectionStrategy, TravelExperiencesDatesSelectionScreenContract$DateAvailabilityStrategy dateAvailabilityStrategy) {
        Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
        Intrinsics.checkNotNullParameter(dateSelectionStrategy, "dateSelectionStrategy");
        Intrinsics.checkNotNullParameter(dateAvailabilityStrategy, "dateAvailabilityStrategy");
        this.f93161a = datesSelection;
        this.f93162b = dateSelectionStrategy;
        this.f93163c = dateAvailabilityStrategy;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperiencesDatesSelectionScreenContract$InputData)) {
            return false;
        }
        TravelExperiencesDatesSelectionScreenContract$InputData travelExperiencesDatesSelectionScreenContract$InputData = (TravelExperiencesDatesSelectionScreenContract$InputData) obj2;
        return Intrinsics.f(this.f93161a, travelExperiencesDatesSelectionScreenContract$InputData.f93161a) && this.f93162b == travelExperiencesDatesSelectionScreenContract$InputData.f93162b && Intrinsics.f(this.f93163c, travelExperiencesDatesSelectionScreenContract$InputData.f93163c);
    }

    public final int hashCode() {
        return this.f93163c.hashCode() + ((this.f93162b.hashCode() + (this.f93161a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f93161a, i);
        dest.writeString(this.f93162b.name());
        dest.writeParcelable(this.f93163c, i);
    }
}
