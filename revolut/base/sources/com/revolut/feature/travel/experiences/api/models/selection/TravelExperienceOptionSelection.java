package com.revolut.feature.travel.experiences.api.models.selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.experiences.api.models.options.TravelExperiencesAvailabilityTimes;
import com.revolut.feature.travel.experiences.api.models.options.TravelExperiencesOption;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/selection/TravelExperienceOptionSelection;", "Landroid/os/Parcelable;", "<init>", "()V", "Option", "OptionWithTimes", "NoSelection", "Lcom/revolut/feature/travel/experiences/api/models/selection/TravelExperienceOptionSelection$NoSelection;", "Lcom/revolut/feature/travel/experiences/api/models/selection/TravelExperienceOptionSelection$Option;", "Lcom/revolut/feature/travel/experiences/api/models/selection/TravelExperienceOptionSelection$OptionWithTimes;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelExperienceOptionSelection implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/selection/TravelExperienceOptionSelection$NoSelection;", "Lcom/revolut/feature/travel/experiences/api/models/selection/TravelExperienceOptionSelection;", "<init>", "()V", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NoSelection extends TravelExperienceOptionSelection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoSelection f92912a = new NoSelection();

        @NotNull
        public static final Parcelable.Creator<NoSelection> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NoSelection.f92912a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NoSelection[i];
            }
        }

        private NoSelection() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/selection/TravelExperienceOptionSelection$Option;", "Lcom/revolut/feature/travel/experiences/api/models/selection/TravelExperienceOptionSelection;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Option extends TravelExperienceOptionSelection implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Option> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelExperiencesOption f92913a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Option(TravelExperiencesOption.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Option[i];
            }
        }

        public Option(TravelExperiencesOption option) {
            Intrinsics.checkNotNullParameter(option, "option");
            this.f92913a = option;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Option) && Intrinsics.f(this.f92913a, ((Option) obj2).f92913a);
        }

        public final int hashCode() {
            return this.f92913a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f92913a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/selection/TravelExperienceOptionSelection$OptionWithTimes;", "Lcom/revolut/feature/travel/experiences/api/models/selection/TravelExperienceOptionSelection;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OptionWithTimes extends TravelExperienceOptionSelection implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<OptionWithTimes> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelExperiencesOption f92914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TravelExperiencesAvailabilityTimes f92915b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OptionWithTimes(TravelExperiencesOption.CREATOR.createFromParcel(parcel), TravelExperiencesAvailabilityTimes.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OptionWithTimes[i];
            }
        }

        public OptionWithTimes(TravelExperiencesOption option, TravelExperiencesAvailabilityTimes times) {
            Intrinsics.checkNotNullParameter(option, "option");
            Intrinsics.checkNotNullParameter(times, "times");
            this.f92914a = option;
            this.f92915b = times;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OptionWithTimes)) {
                return false;
            }
            OptionWithTimes optionWithTimes = (OptionWithTimes) obj2;
            return Intrinsics.f(this.f92914a, optionWithTimes.f92914a) && Intrinsics.f(this.f92915b, optionWithTimes.f92915b);
        }

        public final int hashCode() {
            return this.f92915b.hashCode() + (this.f92914a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f92914a.writeToParcel(dest, i);
            this.f92915b.writeToParcel(dest, i);
        }
    }

    private TravelExperienceOptionSelection() {
    }
}
