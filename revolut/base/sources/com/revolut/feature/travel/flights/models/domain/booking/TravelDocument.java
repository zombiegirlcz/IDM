package com.revolut.feature.travel.flights.models.domain.booking;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/booking/TravelDocument;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelDocument implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelDocument> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f93469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f93470c;
    public final String d;
    public final LocalDate e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelDocument(parcel.readString(), (LocalDate) parcel.readSerializable(), parcel.readString(), parcel.readString(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelDocument[i];
        }
    }

    public TravelDocument(String passportNumber, LocalDate localDate, String str, String str2, LocalDate localDate2) {
        Intrinsics.checkNotNullParameter(passportNumber, "passportNumber");
        this.f93468a = passportNumber;
        this.f93469b = localDate;
        this.f93470c = str;
        this.d = str2;
        this.e = localDate2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelDocument)) {
            return false;
        }
        TravelDocument travelDocument = (TravelDocument) obj2;
        return Intrinsics.f(this.f93468a, travelDocument.f93468a) && Intrinsics.f(this.f93469b, travelDocument.f93469b) && Intrinsics.f(this.f93470c, travelDocument.f93470c) && Intrinsics.f(this.d, travelDocument.d) && Intrinsics.f(this.e, travelDocument.e);
    }

    public final int hashCode() {
        int iHashCode = this.f93468a.hashCode() * 31;
        LocalDate localDate = this.f93469b;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str = this.f93470c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LocalDate localDate2 = this.e;
        return iHashCode4 + (localDate2 != null ? localDate2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93468a);
        dest.writeSerializable(this.f93469b);
        dest.writeString(this.f93470c);
        dest.writeString(this.d);
        dest.writeSerializable(this.e);
    }
}
