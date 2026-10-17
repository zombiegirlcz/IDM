package com.revolut.feature.travel.experiences.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.Period;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/experiences/models/TravelExperienceCancellationWindow;", "Landroid/os/Parcelable;", "Experience", "Booking", "x3g/b", "Lcom/revolut/feature/travel/experiences/models/TravelExperienceCancellationWindow$Booking;", "Lcom/revolut/feature/travel/experiences/models/TravelExperienceCancellationWindow$Experience;", "feature_travel_experiences_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelExperienceCancellationWindow implements Parcelable {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/models/TravelExperienceCancellationWindow$Booking;", "Lcom/revolut/feature/travel/experiences/models/TravelExperienceCancellationWindow;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Booking extends TravelExperienceCancellationWindow implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Booking> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateTime f93185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DateTime f93186b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f93187c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Booking(parcel.readString(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Booking[i];
            }
        }

        public Booking(String percentageRefundable, DateTime fromTimestamp, DateTime toTimestamp) {
            Intrinsics.checkNotNullParameter(fromTimestamp, "fromTimestamp");
            Intrinsics.checkNotNullParameter(toTimestamp, "toTimestamp");
            Intrinsics.checkNotNullParameter(percentageRefundable, "percentageRefundable");
            this.f93185a = fromTimestamp;
            this.f93186b = toTimestamp;
            this.f93187c = percentageRefundable;
        }

        @Override // com.revolut.feature.travel.experiences.models.TravelExperienceCancellationWindow
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF93190c() {
            return this.f93187c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Booking)) {
                return false;
            }
            Booking booking = (Booking) obj2;
            return Intrinsics.f(this.f93185a, booking.f93185a) && Intrinsics.f(this.f93186b, booking.f93186b) && Intrinsics.f(this.f93187c, booking.f93187c);
        }

        public final int hashCode() {
            return this.f93187c.hashCode() + b.f(this.f93186b, this.f93185a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f93185a);
            dest.writeSerializable(this.f93186b);
            dest.writeString(this.f93187c);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/models/TravelExperienceCancellationWindow$Experience;", "Lcom/revolut/feature/travel/experiences/models/TravelExperienceCancellationWindow;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Experience extends TravelExperienceCancellationWindow implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Experience> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Period f93188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Period f93189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f93190c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Experience((Period) parcel.readSerializable(), (Period) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Experience[i];
            }
        }

        public Experience(Period period, Period toTimeBefore, String percentageRefundable) {
            Intrinsics.checkNotNullParameter(toTimeBefore, "toTimeBefore");
            Intrinsics.checkNotNullParameter(percentageRefundable, "percentageRefundable");
            this.f93188a = period;
            this.f93189b = toTimeBefore;
            this.f93190c = percentageRefundable;
        }

        @Override // com.revolut.feature.travel.experiences.models.TravelExperienceCancellationWindow
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF93190c() {
            return this.f93190c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Experience)) {
                return false;
            }
            Experience experience = (Experience) obj2;
            return Intrinsics.f(this.f93188a, experience.f93188a) && Intrinsics.f(this.f93189b, experience.f93189b) && Intrinsics.f(this.f93190c, experience.f93190c);
        }

        public final int hashCode() {
            Period period = this.f93188a;
            return this.f93190c.hashCode() + ((this.f93189b.hashCode() + ((period == null ? 0 : period.hashCode()) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f93188a);
            dest.writeSerializable(this.f93189b);
            dest.writeString(this.f93190c);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract String getF93190c();
}
