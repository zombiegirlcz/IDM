package com.revolut.feature.travel.flights.models.domain.itinerary;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m7g.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/itinerary/PassengerRequirement;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PassengerRequirement implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PassengerRequirement> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f93513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f93514c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            j jVarValueOf = j.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(RequiredPassengerField.CREATOR, parcel, arrayList, iA, 1);
            }
            return new PassengerRequirement(string, jVarValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PassengerRequirement[i];
        }
    }

    public PassengerRequirement(String reference, j travellerType, ArrayList fields) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(travellerType, "travellerType");
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.f93512a = reference;
        this.f93513b = travellerType;
        this.f93514c = fields;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PassengerRequirement)) {
            return false;
        }
        PassengerRequirement passengerRequirement = (PassengerRequirement) obj2;
        return Intrinsics.f(this.f93512a, passengerRequirement.f93512a) && this.f93513b == passengerRequirement.f93513b && this.f93514c.equals(passengerRequirement.f93514c);
    }

    public final int hashCode() {
        return this.f93514c.hashCode() + ((this.f93513b.hashCode() + (this.f93512a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93512a);
        dest.writeString(this.f93513b.name());
        Iterator itY = j6.a.y(this.f93514c, dest);
        while (itY.hasNext()) {
            ((RequiredPassengerField) itY.next()).writeToParcel(dest, i);
        }
    }
}
