package com.revolut.feature.travel.flights.impl.ui.screen.passengers_details.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/flights/impl/ui/screen/passengers_details/model/TravelFlightsPassengerField$Selection$Option", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelFlightsPassengerField$Selection$Option implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelFlightsPassengerField$Selection$Option> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f93374b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelFlightsPassengerField$Selection$Option((Clause) parcel.readParcelable(TravelFlightsPassengerField$Selection$Option.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelFlightsPassengerField$Selection$Option[i];
        }
    }

    public TravelFlightsPassengerField$Selection$Option(Clause label, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f93373a = id10;
        this.f93374b = label;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelFlightsPassengerField$Selection$Option)) {
            return false;
        }
        TravelFlightsPassengerField$Selection$Option travelFlightsPassengerField$Selection$Option = (TravelFlightsPassengerField$Selection$Option) obj2;
        return Intrinsics.f(this.f93373a, travelFlightsPassengerField$Selection$Option.f93373a) && Intrinsics.f(this.f93374b, travelFlightsPassengerField$Selection$Option.f93374b);
    }

    public final int hashCode() {
        return this.f93374b.hashCode() + (this.f93373a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93373a);
        dest.writeParcelable(this.f93374b, i);
    }
}
