package com.revolut.feature.travel.flights.models.domain.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m7g.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/common/Segment;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Segment implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Segment> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Carrier f93499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Carrier f93500c;
    public final d d;
    public final int e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FlightPoint f93501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FlightPoint f93502h;
    public final Integer i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Parcelable.Creator<Carrier> creator = Carrier.CREATOR;
            Carrier carrierCreateFromParcel = creator.createFromParcel(parcel);
            Carrier carrierCreateFromParcel2 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
            d dVarValueOf = d.valueOf(parcel.readString());
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int iA = 0;
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(FlightTechnicalStop.CREATOR, parcel, arrayList, iA, 1);
            }
            Parcelable.Creator<FlightPoint> creator2 = FlightPoint.CREATOR;
            return new Segment(string, carrierCreateFromParcel, carrierCreateFromParcel2, dVarValueOf, i, arrayList, creator2.createFromParcel(parcel), creator2.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Segment[i];
        }
    }

    public Segment(String flightNumber, Carrier operationalCarrier, Carrier carrier, d cabinClass, int i, ArrayList technicalStops, FlightPoint departure, FlightPoint arrival, Integer num) {
        Intrinsics.checkNotNullParameter(flightNumber, "flightNumber");
        Intrinsics.checkNotNullParameter(operationalCarrier, "operationalCarrier");
        Intrinsics.checkNotNullParameter(cabinClass, "cabinClass");
        Intrinsics.checkNotNullParameter(technicalStops, "technicalStops");
        Intrinsics.checkNotNullParameter(departure, "departure");
        Intrinsics.checkNotNullParameter(arrival, "arrival");
        this.f93498a = flightNumber;
        this.f93499b = operationalCarrier;
        this.f93500c = carrier;
        this.d = cabinClass;
        this.e = i;
        this.f = technicalStops;
        this.f93501g = departure;
        this.f93502h = arrival;
        this.i = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Segment)) {
            return false;
        }
        Segment segment = (Segment) obj2;
        return Intrinsics.f(this.f93498a, segment.f93498a) && Intrinsics.f(this.f93499b, segment.f93499b) && Intrinsics.f(this.f93500c, segment.f93500c) && this.d == segment.d && this.e == segment.e && this.f.equals(segment.f) && Intrinsics.f(this.f93501g, segment.f93501g) && Intrinsics.f(this.f93502h, segment.f93502h) && Intrinsics.f(this.i, segment.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f93499b.hashCode() + (this.f93498a.hashCode() * 31)) * 31;
        Carrier carrier = this.f93500c;
        int iHashCode2 = (this.f93502h.hashCode() + ((this.f93501g.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, j6.a.b(this.e, (this.d.hashCode() + ((iHashCode + (carrier == null ? 0 : carrier.hashCode())) * 31)) * 31, 31), 31)) * 31)) * 31;
        Integer num = this.i;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93498a);
        this.f93499b.writeToParcel(dest, i);
        Carrier carrier = this.f93500c;
        if (carrier == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            carrier.writeToParcel(dest, i);
        }
        dest.writeString(this.d.name());
        dest.writeInt(this.e);
        Iterator itY = j6.a.y(this.f, dest);
        while (itY.hasNext()) {
            ((FlightTechnicalStop) itY.next()).writeToParcel(dest, i);
        }
        this.f93501g.writeToParcel(dest, i);
        this.f93502h.writeToParcel(dest, i);
        Integer num = this.i;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
    }
}
