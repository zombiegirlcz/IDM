package com.revolut.feature.travel.experiences.impl.ui.screen.details;

import a2g.h;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperiencePreview;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/experiences/impl/ui/screen/details/TravelExperiencesDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperiencesDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelExperiencesDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelExperienceDatesSelection f93060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelExperiencePreview f93061c;
    public final h d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelExperiencesDetailsScreenContract$InputData(parcel.readString(), (TravelExperienceDatesSelection) parcel.readParcelable(TravelExperiencesDetailsScreenContract$InputData.class.getClassLoader()), (TravelExperiencePreview) parcel.readParcelable(TravelExperiencesDetailsScreenContract$InputData.class.getClassLoader()), h.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperiencesDetailsScreenContract$InputData[i];
        }
    }

    public TravelExperiencesDetailsScreenContract$InputData(String experienceId, TravelExperienceDatesSelection travelExperienceDatesSelection, TravelExperiencePreview travelExperiencePreview, h mode) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f93059a = experienceId;
        this.f93060b = travelExperienceDatesSelection;
        this.f93061c = travelExperiencePreview;
        this.d = mode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperiencesDetailsScreenContract$InputData)) {
            return false;
        }
        TravelExperiencesDetailsScreenContract$InputData travelExperiencesDetailsScreenContract$InputData = (TravelExperiencesDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f93059a, travelExperiencesDetailsScreenContract$InputData.f93059a) && Intrinsics.f(this.f93060b, travelExperiencesDetailsScreenContract$InputData.f93060b) && Intrinsics.f(this.f93061c, travelExperiencesDetailsScreenContract$InputData.f93061c) && this.d == travelExperiencesDetailsScreenContract$InputData.d;
    }

    public final int hashCode() {
        int iHashCode = this.f93059a.hashCode() * 31;
        TravelExperienceDatesSelection travelExperienceDatesSelection = this.f93060b;
        int iHashCode2 = (iHashCode + (travelExperienceDatesSelection == null ? 0 : travelExperienceDatesSelection.hashCode())) * 31;
        TravelExperiencePreview travelExperiencePreview = this.f93061c;
        return this.d.hashCode() + ((iHashCode2 + (travelExperiencePreview != null ? travelExperiencePreview.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93059a);
        dest.writeParcelable(this.f93060b, i);
        dest.writeParcelable(this.f93061c, i);
        dest.writeString(this.d.name());
    }
}
