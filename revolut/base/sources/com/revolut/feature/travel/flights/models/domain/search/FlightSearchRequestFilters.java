package com.revolut.feature.travel.flights.models.domain.search;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r7g.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/search/FlightSearchRequestFilters;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FlightSearchRequestFilters implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FlightSearchRequestFilters> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f93583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f93584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f93585c;
    public final List d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FlightSearchRequestFilters(parcel.readInt() == 0 ? null : i.valueOf(parcel.readString()), (d) parcel.readSerializable(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FlightSearchRequestFilters[i];
        }
    }

    public FlightSearchRequestFilters(i iVar, d dVar, Integer num, List list) {
        this.f93583a = iVar;
        this.f93584b = dVar;
        this.f93585c = num;
        this.d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FlightSearchRequestFilters)) {
            return false;
        }
        FlightSearchRequestFilters flightSearchRequestFilters = (FlightSearchRequestFilters) obj2;
        return this.f93583a == flightSearchRequestFilters.f93583a && Intrinsics.f(this.f93584b, flightSearchRequestFilters.f93584b) && Intrinsics.f(this.f93585c, flightSearchRequestFilters.f93585c) && Intrinsics.f(this.d, flightSearchRequestFilters.d);
    }

    public final int hashCode() {
        i iVar = this.f93583a;
        int iHashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
        d dVar = this.f93584b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Integer num = this.f93585c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        i iVar = this.f93583a;
        if (iVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(iVar.name());
        }
        dest.writeSerializable(this.f93584b);
        Integer num = this.f93585c;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeStringList(this.d);
    }

    public FlightSearchRequestFilters() {
        this(null, null, null, null);
    }
}
