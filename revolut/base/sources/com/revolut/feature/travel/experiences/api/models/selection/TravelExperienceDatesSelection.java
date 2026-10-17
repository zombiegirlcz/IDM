package com.revolut.feature.travel.experiences.api.models.selection;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/selection/TravelExperienceDatesSelection;", "Landroid/os/Parcelable;", "<init>", "()V", "SingleDateSelection", "RangeDateSelection", "NoDatesSelection", "Lcom/revolut/feature/travel/experiences/api/models/selection/TravelExperienceDatesSelection$NoDatesSelection;", "Lcom/revolut/feature/travel/experiences/api/models/selection/TravelExperienceDatesSelection$RangeDateSelection;", "Lcom/revolut/feature/travel/experiences/api/models/selection/TravelExperienceDatesSelection$SingleDateSelection;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelExperienceDatesSelection implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/selection/TravelExperienceDatesSelection$NoDatesSelection;", "Lcom/revolut/feature/travel/experiences/api/models/selection/TravelExperienceDatesSelection;", "<init>", "()V", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NoDatesSelection extends TravelExperienceDatesSelection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoDatesSelection f92906a = new NoDatesSelection();

        @NotNull
        public static final Parcelable.Creator<NoDatesSelection> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NoDatesSelection.f92906a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NoDatesSelection[i];
            }
        }

        private NoDatesSelection() {
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/selection/TravelExperienceDatesSelection$RangeDateSelection;", "Lcom/revolut/feature/travel/experiences/api/models/selection/TravelExperienceDatesSelection;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RangeDateSelection extends TravelExperienceDatesSelection implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<RangeDateSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateTime f92907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DateTime f92908b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RangeDateSelection((DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RangeDateSelection[i];
            }
        }

        public RangeDateSelection(DateTime startDate, DateTime endDate) {
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            this.f92907a = startDate;
            this.f92908b = endDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RangeDateSelection)) {
                return false;
            }
            RangeDateSelection rangeDateSelection = (RangeDateSelection) obj2;
            return Intrinsics.f(this.f92907a, rangeDateSelection.f92907a) && Intrinsics.f(this.f92908b, rangeDateSelection.f92908b);
        }

        public final int hashCode() {
            return this.f92908b.hashCode() + (this.f92907a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f92907a);
            dest.writeSerializable(this.f92908b);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/selection/TravelExperienceDatesSelection$SingleDateSelection;", "Lcom/revolut/feature/travel/experiences/api/models/selection/TravelExperienceDatesSelection;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SingleDateSelection extends TravelExperienceDatesSelection implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SingleDateSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateTime f92909a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SingleDateSelection((DateTime) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SingleDateSelection[i];
            }
        }

        public SingleDateSelection(DateTime date) {
            Intrinsics.checkNotNullParameter(date, "date");
            this.f92909a = date;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SingleDateSelection) && Intrinsics.f(this.f92909a, ((SingleDateSelection) obj2).f92909a);
        }

        public final int hashCode() {
            return this.f92909a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f92909a);
        }
    }

    private TravelExperienceDatesSelection() {
    }
}
