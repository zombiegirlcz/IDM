package com.revolut.feature.travel.experiences.api.models.options;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.experiences.api.models.pricing_breakdown.TravelExperiencesPricingBreakdown;
import java.time.LocalTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/options/TravelExperiencesAvailabilityTimes;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperiencesAvailabilityTimes implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperiencesAvailabilityTimes> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalTime f92856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f92857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelExperiencesPricingBreakdown f92858c;
    public final TravelExperiencesPricingBreakdown d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelExperiencesAvailabilityTimes((LocalTime) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : TravelExperiencesPricingBreakdown.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TravelExperiencesPricingBreakdown.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperiencesAvailabilityTimes[i];
        }
    }

    public TravelExperiencesAvailabilityTimes(LocalTime time, boolean z, TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdown, TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdown2) {
        Intrinsics.checkNotNullParameter(time, "time");
        this.f92856a = time;
        this.f92857b = z;
        this.f92858c = travelExperiencesPricingBreakdown;
        this.d = travelExperiencesPricingBreakdown2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperiencesAvailabilityTimes)) {
            return false;
        }
        TravelExperiencesAvailabilityTimes travelExperiencesAvailabilityTimes = (TravelExperiencesAvailabilityTimes) obj2;
        return Intrinsics.f(this.f92856a, travelExperiencesAvailabilityTimes.f92856a) && this.f92857b == travelExperiencesAvailabilityTimes.f92857b && Intrinsics.f(this.f92858c, travelExperiencesAvailabilityTimes.f92858c) && Intrinsics.f(this.d, travelExperiencesAvailabilityTimes.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f92856a.hashCode() * 31, 31, this.f92857b);
        TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdown = this.f92858c;
        int iHashCode = (iC + (travelExperiencesPricingBreakdown == null ? 0 : travelExperiencesPricingBreakdown.hashCode())) * 31;
        TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdown2 = this.d;
        return iHashCode + (travelExperiencesPricingBreakdown2 != null ? travelExperiencesPricingBreakdown2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f92856a);
        dest.writeInt(this.f92857b ? 1 : 0);
        TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdown = this.f92858c;
        if (travelExperiencesPricingBreakdown == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            travelExperiencesPricingBreakdown.writeToParcel(dest, i);
        }
        TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdown2 = this.d;
        if (travelExperiencesPricingBreakdown2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            travelExperiencesPricingBreakdown2.writeToParcel(dest, i);
        }
    }
}
