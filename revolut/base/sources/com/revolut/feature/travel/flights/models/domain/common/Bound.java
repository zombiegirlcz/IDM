package com.revolut.feature.travel.flights.models.domain.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/common/Bound;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Bound implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Bound> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlightPoint f93484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlightPoint f93485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f93486c;
    public final int d;
    public final ArrayList e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Parcelable.Creator<FlightPoint> creator = FlightPoint.CREATOR;
            FlightPoint flightPointCreateFromParcel = creator.createFromParcel(parcel);
            FlightPoint flightPointCreateFromParcel2 = creator.createFromParcel(parcel);
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            int iA = 0;
            while (iA != i3) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Segment.CREATOR, parcel, arrayList, iA, 1);
            }
            return new Bound(flightPointCreateFromParcel, flightPointCreateFromParcel2, i, i2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Bound[i];
        }
    }

    public Bound(FlightPoint departure, FlightPoint arrival, int i, int i2, ArrayList segments) {
        Intrinsics.checkNotNullParameter(departure, "departure");
        Intrinsics.checkNotNullParameter(arrival, "arrival");
        Intrinsics.checkNotNullParameter(segments, "segments");
        this.f93484a = departure;
        this.f93485b = arrival;
        this.f93486c = i;
        this.d = i2;
        this.e = segments;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Bound)) {
            return false;
        }
        Bound bound = (Bound) obj2;
        return Intrinsics.f(this.f93484a, bound.f93484a) && Intrinsics.f(this.f93485b, bound.f93485b) && this.f93486c == bound.f93486c && this.d == bound.d && this.e.equals(bound.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.b(this.d, j6.a.b(this.f93486c, (this.f93485b.hashCode() + (this.f93484a.hashCode() * 31)) * 31, 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f93484a.writeToParcel(dest, i);
        this.f93485b.writeToParcel(dest, i);
        dest.writeInt(this.f93486c);
        dest.writeInt(this.d);
        Iterator itY = j6.a.y(this.e, dest);
        while (itY.hasNext()) {
            ((Segment) itY.next()).writeToParcel(dest, i);
        }
    }
}
