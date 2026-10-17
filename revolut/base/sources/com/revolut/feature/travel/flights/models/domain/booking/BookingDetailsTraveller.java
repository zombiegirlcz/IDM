package com.revolut.feature.travel.flights.models.domain.booking;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m7g.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/booking/BookingDetailsTraveller;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BookingDetailsTraveller implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BookingDetailsTraveller> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f93440c;
    public final ArrayList d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            j jVarValueOf = j.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(BookingDetailsTravellerBaggage.CREATOR, parcel, arrayList, iA, 1);
            }
            return new BookingDetailsTraveller(string, string2, jVarValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BookingDetailsTraveller[i];
        }
    }

    public BookingDetailsTraveller(String fullName, String str, j type, ArrayList baggage) {
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(baggage, "baggage");
        this.f93438a = fullName;
        this.f93439b = str;
        this.f93440c = type;
        this.d = baggage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BookingDetailsTraveller)) {
            return false;
        }
        BookingDetailsTraveller bookingDetailsTraveller = (BookingDetailsTraveller) obj2;
        return Intrinsics.f(this.f93438a, bookingDetailsTraveller.f93438a) && Intrinsics.f(this.f93439b, bookingDetailsTraveller.f93439b) && this.f93440c == bookingDetailsTraveller.f93440c && this.d.equals(bookingDetailsTraveller.d);
    }

    public final int hashCode() {
        int iHashCode = this.f93438a.hashCode() * 31;
        String str = this.f93439b;
        return this.d.hashCode() + ((this.f93440c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93438a);
        dest.writeString(this.f93439b);
        dest.writeString(this.f93440c.name());
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            ((BookingDetailsTravellerBaggage) itY.next()).writeToParcel(dest, i);
        }
    }
}
