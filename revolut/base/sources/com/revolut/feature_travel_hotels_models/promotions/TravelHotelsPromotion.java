package com.revolut.feature_travel_hotels_models.promotions;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_travel_hotels_models.location.HotelsLocation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.Duration;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/promotions/TravelHotelsPromotion;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "tfi/a", "Requirements", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsPromotion implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsPromotion> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tfi.a f97961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f97962c;
    public final DateTime d;
    public final double e;
    public final Requirements f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HotelsLocation f97963g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/promotions/TravelHotelsPromotion$Requirements;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Requirements implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Requirements> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateTime f97964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DateTime f97965b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Requirements((DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Requirements[i];
            }
        }

        public Requirements(DateTime checkInFrom, DateTime checkOutTo) {
            Intrinsics.checkNotNullParameter(checkInFrom, "checkInFrom");
            Intrinsics.checkNotNullParameter(checkOutTo, "checkOutTo");
            this.f97964a = checkInFrom;
            this.f97965b = checkOutTo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Requirements)) {
                return false;
            }
            Requirements requirements = (Requirements) obj2;
            return Intrinsics.f(this.f97964a, requirements.f97964a) && Intrinsics.f(this.f97965b, requirements.f97965b);
        }

        public final int hashCode() {
            return this.f97965b.hashCode() + (this.f97964a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f97964a);
            dest.writeSerializable(this.f97965b);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelHotelsPromotion(parcel.readString(), tfi.a.valueOf(parcel.readString()), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), parcel.readDouble(), parcel.readInt() == 0 ? null : Requirements.CREATOR.createFromParcel(parcel), HotelsLocation.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsPromotion[i];
        }
    }

    public TravelHotelsPromotion(String id10, tfi.a type, DateTime startDate, DateTime endDate, double d, Requirements requirements, HotelsLocation location) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f97960a = id10;
        this.f97961b = type;
        this.f97962c = startDate;
        this.d = endDate;
        this.e = d;
        this.f = requirements;
        this.f97963g = location;
    }

    public final Duration a(DateTime now) {
        Intrinsics.checkNotNullParameter(now, "now");
        DateTime dateTime = this.d;
        if (now.isAfter(dateTime)) {
            return null;
        }
        return new Duration(now, dateTime);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsPromotion)) {
            return false;
        }
        TravelHotelsPromotion travelHotelsPromotion = (TravelHotelsPromotion) obj2;
        return Intrinsics.f(this.f97960a, travelHotelsPromotion.f97960a) && this.f97961b == travelHotelsPromotion.f97961b && Intrinsics.f(this.f97962c, travelHotelsPromotion.f97962c) && Intrinsics.f(this.d, travelHotelsPromotion.d) && Double.compare(this.e, travelHotelsPromotion.e) == 0 && Intrinsics.f(this.f, travelHotelsPromotion.f) && Intrinsics.f(this.f97963g, travelHotelsPromotion.f97963g);
    }

    public final int hashCode() {
        int iC = b.c(b.f(this.d, b.f(this.f97962c, (this.f97961b.hashCode() + (this.f97960a.hashCode() * 31)) * 31, 31), 31), this.e, 31);
        Requirements requirements = this.f;
        return this.f97963g.hashCode() + ((iC + (requirements == null ? 0 : requirements.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f97960a);
        dest.writeString(this.f97961b.name());
        dest.writeSerializable(this.f97962c);
        dest.writeSerializable(this.d);
        dest.writeDouble(this.e);
        Requirements requirements = this.f;
        if (requirements == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            requirements.writeToParcel(dest, i);
        }
        this.f97963g.writeToParcel(dest, i);
    }
}
