package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.traveller_details;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/traveller_details/AsftTravellerDetailsScreenContract$DomainState$TravellerDetails", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AsftTravellerDetailsScreenContract$DomainState$TravellerDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AsftTravellerDetailsScreenContract$DomainState$TravellerDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98905b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AsftTravellerDetailsScreenContract$DomainState$TravellerDetails(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AsftTravellerDetailsScreenContract$DomainState$TravellerDetails[i];
        }
    }

    public AsftTravellerDetailsScreenContract$DomainState$TravellerDetails() {
        this(0);
    }

    public static AsftTravellerDetailsScreenContract$DomainState$TravellerDetails a(AsftTravellerDetailsScreenContract$DomainState$TravellerDetails asftTravellerDetailsScreenContract$DomainState$TravellerDetails, String firstName, String lastName, int i) {
        if ((i & 1) != 0) {
            firstName = asftTravellerDetailsScreenContract$DomainState$TravellerDetails.f98904a;
        }
        if ((i & 2) != 0) {
            lastName = asftTravellerDetailsScreenContract$DomainState$TravellerDetails.f98905b;
        }
        asftTravellerDetailsScreenContract$DomainState$TravellerDetails.getClass();
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        return new AsftTravellerDetailsScreenContract$DomainState$TravellerDetails(firstName, lastName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AsftTravellerDetailsScreenContract$DomainState$TravellerDetails)) {
            return false;
        }
        AsftTravellerDetailsScreenContract$DomainState$TravellerDetails asftTravellerDetailsScreenContract$DomainState$TravellerDetails = (AsftTravellerDetailsScreenContract$DomainState$TravellerDetails) obj2;
        return Intrinsics.f(this.f98904a, asftTravellerDetailsScreenContract$DomainState$TravellerDetails.f98904a) && Intrinsics.f(this.f98905b, asftTravellerDetailsScreenContract$DomainState$TravellerDetails.f98905b);
    }

    public final int hashCode() {
        return this.f98905b.hashCode() + (this.f98904a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98904a);
        dest.writeString(this.f98905b);
    }

    public AsftTravellerDetailsScreenContract$DomainState$TravellerDetails(String firstName, String lastName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        this.f98904a = firstName;
        this.f98905b = lastName;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AsftTravellerDetailsScreenContract$DomainState$TravellerDetails(int i) {
        this("", "");
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        m70.a.c(t0Var);
    }
}
