package com.revolut.feature.travel.experiences.api.models.experience;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.Duration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/experience/TravelExperienceDurationFilter;", "Landroid/os/Parcelable;", "<init>", "()V", "UpTo", "Beyond", "Interval", "None", "Lcom/revolut/feature/travel/experiences/api/models/experience/TravelExperienceDurationFilter$Beyond;", "Lcom/revolut/feature/travel/experiences/api/models/experience/TravelExperienceDurationFilter$Interval;", "Lcom/revolut/feature/travel/experiences/api/models/experience/TravelExperienceDurationFilter$None;", "Lcom/revolut/feature/travel/experiences/api/models/experience/TravelExperienceDurationFilter$UpTo;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelExperienceDurationFilter implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/experience/TravelExperienceDurationFilter$Beyond;", "Lcom/revolut/feature/travel/experiences/api/models/experience/TravelExperienceDurationFilter;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Beyond extends TravelExperienceDurationFilter {

        @NotNull
        public static final Parcelable.Creator<Beyond> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Duration f92812a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Beyond((Duration) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Beyond[i];
            }
        }

        public Beyond(Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.f92812a = duration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Beyond) && Intrinsics.f(this.f92812a, ((Beyond) obj2).f92812a);
        }

        public final int hashCode() {
            return this.f92812a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f92812a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/experience/TravelExperienceDurationFilter$Interval;", "Lcom/revolut/feature/travel/experiences/api/models/experience/TravelExperienceDurationFilter;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Interval extends TravelExperienceDurationFilter {

        @NotNull
        public static final Parcelable.Creator<Interval> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Duration f92813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Duration f92814b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Interval((Duration) parcel.readSerializable(), (Duration) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Interval[i];
            }
        }

        public Interval(Duration fromDuration, Duration toDuration) {
            Intrinsics.checkNotNullParameter(fromDuration, "fromDuration");
            Intrinsics.checkNotNullParameter(toDuration, "toDuration");
            this.f92813a = fromDuration;
            this.f92814b = toDuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Interval)) {
                return false;
            }
            Interval interval = (Interval) obj2;
            return Intrinsics.f(this.f92813a, interval.f92813a) && Intrinsics.f(this.f92814b, interval.f92814b);
        }

        public final int hashCode() {
            return this.f92814b.hashCode() + (this.f92813a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f92813a);
            dest.writeSerializable(this.f92814b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/experience/TravelExperienceDurationFilter$None;", "Lcom/revolut/feature/travel/experiences/api/models/experience/TravelExperienceDurationFilter;", "<init>", "()V", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class None extends TravelExperienceDurationFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final None f92815a = new None();

        @NotNull
        public static final Parcelable.Creator<None> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return None.f92815a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new None[i];
            }
        }

        private None() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/experience/TravelExperienceDurationFilter$UpTo;", "Lcom/revolut/feature/travel/experiences/api/models/experience/TravelExperienceDurationFilter;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpTo extends TravelExperienceDurationFilter {

        @NotNull
        public static final Parcelable.Creator<UpTo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Duration f92816a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpTo((Duration) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpTo[i];
            }
        }

        public UpTo(Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.f92816a = duration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UpTo) && Intrinsics.f(this.f92816a, ((UpTo) obj2).f92816a);
        }

        public final int hashCode() {
            return this.f92816a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f92816a);
        }
    }

    private TravelExperienceDurationFilter() {
    }
}
