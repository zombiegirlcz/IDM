package com.revolut.feature.travel.flights.models.domain.booking;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l7g.y;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/booking/TravellerDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravellerDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravellerDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f93482c;
    public final y d;
    public final LocalDate e;
    public final TravelDocument f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final EmergencyContact f93483g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravellerDetails(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : y.valueOf(parcel.readString()), (LocalDate) parcel.readSerializable(), parcel.readInt() == 0 ? null : TravelDocument.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? EmergencyContact.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravellerDetails[i];
        }
    }

    public TravellerDetails(String reference, String str, String str2, y yVar, LocalDate localDate, TravelDocument travelDocument, EmergencyContact emergencyContact) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        this.f93480a = reference;
        this.f93481b = str;
        this.f93482c = str2;
        this.d = yVar;
        this.e = localDate;
        this.f = travelDocument;
        this.f93483g = emergencyContact;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravellerDetails)) {
            return false;
        }
        TravellerDetails travellerDetails = (TravellerDetails) obj2;
        return Intrinsics.f(this.f93480a, travellerDetails.f93480a) && Intrinsics.f(this.f93481b, travellerDetails.f93481b) && Intrinsics.f(this.f93482c, travellerDetails.f93482c) && this.d == travellerDetails.d && Intrinsics.f(this.e, travellerDetails.e) && Intrinsics.f(this.f, travellerDetails.f) && Intrinsics.f(this.f93483g, travellerDetails.f93483g);
    }

    public final int hashCode() {
        int iHashCode = this.f93480a.hashCode() * 31;
        String str = this.f93481b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f93482c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        y yVar = this.d;
        int iHashCode4 = (iHashCode3 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        LocalDate localDate = this.e;
        int iHashCode5 = (iHashCode4 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        TravelDocument travelDocument = this.f;
        int iHashCode6 = (iHashCode5 + (travelDocument == null ? 0 : travelDocument.hashCode())) * 31;
        EmergencyContact emergencyContact = this.f93483g;
        return iHashCode6 + (emergencyContact != null ? emergencyContact.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93480a);
        dest.writeString(this.f93481b);
        dest.writeString(this.f93482c);
        y yVar = this.d;
        if (yVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(yVar.name());
        }
        dest.writeSerializable(this.e);
        TravelDocument travelDocument = this.f;
        if (travelDocument == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            travelDocument.writeToParcel(dest, i);
        }
        EmergencyContact emergencyContact = this.f93483g;
        if (emergencyContact == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            emergencyContact.writeToParcel(dest, i);
        }
    }
}
