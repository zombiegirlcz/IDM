package com.revolut.feature.travel.experiences.impl.ui.screen.additional_information;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l1g.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/experiences/impl/ui/screen/additional_information/TravelExperiencesAdditionalInformationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperiencesAdditionalInformationScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelExperiencesAdditionalInformationScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f93013b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelExperiencesAdditionalInformationScreenContract$InputData(parcel.readString(), c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperiencesAdditionalInformationScreenContract$InputData[i];
        }
    }

    public TravelExperiencesAdditionalInformationScreenContract$InputData(String experienceId, c type) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f93012a = experienceId;
        this.f93013b = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperiencesAdditionalInformationScreenContract$InputData)) {
            return false;
        }
        TravelExperiencesAdditionalInformationScreenContract$InputData travelExperiencesAdditionalInformationScreenContract$InputData = (TravelExperiencesAdditionalInformationScreenContract$InputData) obj2;
        return Intrinsics.f(this.f93012a, travelExperiencesAdditionalInformationScreenContract$InputData.f93012a) && this.f93013b == travelExperiencesAdditionalInformationScreenContract$InputData.f93013b;
    }

    public final int hashCode() {
        return this.f93013b.hashCode() + (this.f93012a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93012a);
        dest.writeString(this.f93013b.name());
    }
}
