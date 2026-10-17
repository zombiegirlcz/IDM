package com.revolut.feature.travel.experiences.impl.ui.screen.options_v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.experiences.api.models.options.TravelExperiencesAvailabilityTimes;
import com.revolut.feature.travel.experiences.api.models.options.TravelExperiencesOptionV2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/options_v2/model/TravelExperienceOptionSelectionV2;", "Landroid/os/Parcelable;", "<init>", "()V", "Option", "OptionWithTimes", "NoSelection", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/options_v2/model/TravelExperienceOptionSelectionV2$NoSelection;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/options_v2/model/TravelExperienceOptionSelectionV2$Option;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/options_v2/model/TravelExperienceOptionSelectionV2$OptionWithTimes;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelExperienceOptionSelectionV2 implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/options_v2/model/TravelExperienceOptionSelectionV2$NoSelection;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/options_v2/model/TravelExperienceOptionSelectionV2;", "<init>", "()V", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NoSelection extends TravelExperienceOptionSelectionV2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoSelection f93095a = new NoSelection();

        @NotNull
        public static final Parcelable.Creator<NoSelection> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NoSelection.f93095a;
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/options_v2/model/TravelExperienceOptionSelectionV2$Option;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/options_v2/model/TravelExperienceOptionSelectionV2;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Option extends TravelExperienceOptionSelectionV2 implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Option> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelExperiencesOptionV2 f93096a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Option((TravelExperiencesOptionV2) parcel.readParcelable(Option.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Option[i];
            }
        }

        public Option(TravelExperiencesOptionV2 option) {
            Intrinsics.checkNotNullParameter(option, "option");
            this.f93096a = option;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Option) && Intrinsics.f(this.f93096a, ((Option) obj2).f93096a);
        }

        public final int hashCode() {
            return this.f93096a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93096a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/screen/options_v2/model/TravelExperienceOptionSelectionV2$OptionWithTimes;", "Lcom/revolut/feature/travel/experiences/impl/ui/screen/options_v2/model/TravelExperienceOptionSelectionV2;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OptionWithTimes extends TravelExperienceOptionSelectionV2 implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<OptionWithTimes> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelExperiencesOptionV2 f93097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TravelExperiencesAvailabilityTimes f93098b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OptionWithTimes((TravelExperiencesOptionV2) parcel.readParcelable(OptionWithTimes.class.getClassLoader()), (TravelExperiencesAvailabilityTimes) parcel.readParcelable(OptionWithTimes.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OptionWithTimes[i];
            }
        }

        public OptionWithTimes(TravelExperiencesOptionV2 option, TravelExperiencesAvailabilityTimes times) {
            Intrinsics.checkNotNullParameter(option, "option");
            Intrinsics.checkNotNullParameter(times, "times");
            this.f93097a = option;
            this.f93098b = times;
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
            return Intrinsics.f(this.f93097a, optionWithTimes.f93097a) && Intrinsics.f(this.f93098b, optionWithTimes.f93098b);
        }

        public final int hashCode() {
            return this.f93098b.hashCode() + (this.f93097a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f93097a, i);
            dest.writeParcelable(this.f93098b, i);
        }
    }

    private TravelExperienceOptionSelectionV2() {
    }
}
