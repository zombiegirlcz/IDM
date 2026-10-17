package com.revolut.feature.atm.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.DayOfWeek;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/atm/api/model/OpeningHours;", "Landroid/os/Parcelable;", "Closed", "SpecificTime", "TwentyFourHours", "Lcom/revolut/feature/atm/api/model/OpeningHours$Closed;", "Lcom/revolut/feature/atm/api/model/OpeningHours$SpecificTime;", "Lcom/revolut/feature/atm/api/model/OpeningHours$TwentyFourHours;", "feature_atm_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OpeningHours extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/atm/api/model/OpeningHours$Closed;", "Lcom/revolut/feature/atm/api/model/OpeningHours;", "", "toString", "()Ljava/lang/String;", "feature_atm_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Closed implements OpeningHours {

        @NotNull
        public static final Parcelable.Creator<Closed> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DayOfWeek f63144a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Closed(DayOfWeek.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Closed[i];
            }
        }

        public Closed(DayOfWeek dayOfWeek) {
            Intrinsics.checkNotNullParameter(dayOfWeek, "dayOfWeek");
            this.f63144a = dayOfWeek;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Closed) && this.f63144a == ((Closed) obj2).f63144a;
        }

        @Override // com.revolut.feature.atm.api.model.OpeningHours
        /* JADX INFO: renamed from: getDayOfWeek, reason: from getter */
        public final DayOfWeek getF63148a() {
            return this.f63144a;
        }

        public final int hashCode() {
            return this.f63144a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63144a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/atm/api/model/OpeningHours$SpecificTime;", "Lcom/revolut/feature/atm/api/model/OpeningHours;", "", "toString", "()Ljava/lang/String;", "feature_atm_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SpecificTime implements OpeningHours {

        @NotNull
        public static final Parcelable.Creator<SpecificTime> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DayOfWeek f63145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f63146b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f63147c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SpecificTime(DayOfWeek.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SpecificTime[i];
            }
        }

        public SpecificTime(DayOfWeek dayOfWeek, String openTime, String closeTime) {
            Intrinsics.checkNotNullParameter(dayOfWeek, "dayOfWeek");
            Intrinsics.checkNotNullParameter(openTime, "openTime");
            Intrinsics.checkNotNullParameter(closeTime, "closeTime");
            this.f63145a = dayOfWeek;
            this.f63146b = openTime;
            this.f63147c = closeTime;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SpecificTime)) {
                return false;
            }
            SpecificTime specificTime = (SpecificTime) obj2;
            return this.f63145a == specificTime.f63145a && Intrinsics.f(this.f63146b, specificTime.f63146b) && Intrinsics.f(this.f63147c, specificTime.f63147c);
        }

        @Override // com.revolut.feature.atm.api.model.OpeningHours
        /* JADX INFO: renamed from: getDayOfWeek, reason: from getter */
        public final DayOfWeek getF63148a() {
            return this.f63145a;
        }

        public final int hashCode() {
            return this.f63147c.hashCode() + p.a.c(this.f63145a.hashCode() * 31, 31, this.f63146b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63145a.name());
            dest.writeString(this.f63146b);
            dest.writeString(this.f63147c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/atm/api/model/OpeningHours$TwentyFourHours;", "Lcom/revolut/feature/atm/api/model/OpeningHours;", "", "toString", "()Ljava/lang/String;", "feature_atm_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TwentyFourHours implements OpeningHours {

        @NotNull
        public static final Parcelable.Creator<TwentyFourHours> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DayOfWeek f63148a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TwentyFourHours(DayOfWeek.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TwentyFourHours[i];
            }
        }

        public TwentyFourHours(DayOfWeek dayOfWeek) {
            Intrinsics.checkNotNullParameter(dayOfWeek, "dayOfWeek");
            this.f63148a = dayOfWeek;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TwentyFourHours) && this.f63148a == ((TwentyFourHours) obj2).f63148a;
        }

        @Override // com.revolut.feature.atm.api.model.OpeningHours
        /* JADX INFO: renamed from: getDayOfWeek, reason: from getter */
        public final DayOfWeek getF63148a() {
            return this.f63148a;
        }

        public final int hashCode() {
            return this.f63148a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63148a.name());
        }
    }

    /* JADX INFO: renamed from: getDayOfWeek */
    DayOfWeek getF63148a();
}
