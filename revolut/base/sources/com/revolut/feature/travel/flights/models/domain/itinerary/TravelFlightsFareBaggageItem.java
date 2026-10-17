package com.revolut.feature.travel.flights.models.domain.itinerary;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p7g.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/itinerary/TravelFlightsFareBaggageItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "p7g/d", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelFlightsFareBaggageItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelFlightsFareBaggageItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f93520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f93521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f93522c;
    public final String d;
    public final String e;
    public final Integer f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelFlightsFareBaggageItem(parcel.readInt() != 0, d.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelFlightsFareBaggageItem[i];
        }
    }

    public TravelFlightsFareBaggageItem(boolean z, d type, String description, String title, String subtitle, Integer num) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f93520a = z;
        this.f93521b = type;
        this.f93522c = description;
        this.d = title;
        this.e = subtitle;
        this.f = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelFlightsFareBaggageItem)) {
            return false;
        }
        TravelFlightsFareBaggageItem travelFlightsFareBaggageItem = (TravelFlightsFareBaggageItem) obj2;
        return this.f93520a == travelFlightsFareBaggageItem.f93520a && this.f93521b == travelFlightsFareBaggageItem.f93521b && Intrinsics.f(this.f93522c, travelFlightsFareBaggageItem.f93522c) && Intrinsics.f(this.d, travelFlightsFareBaggageItem.d) && Intrinsics.f(this.e, travelFlightsFareBaggageItem.e) && Intrinsics.f(this.f, travelFlightsFareBaggageItem.f);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c((this.f93521b.hashCode() + (Boolean.hashCode(this.f93520a) * 31)) * 31, 31, this.f93522c), 31, this.d), 31, this.e);
        Integer num = this.f;
        return iC + (num == null ? 0 : num.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f93520a ? 1 : 0);
        dest.writeString(this.f93521b.name());
        dest.writeString(this.f93522c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        Integer num = this.f;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
    }
}
