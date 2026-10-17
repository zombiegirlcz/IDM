package com.revolut.feature.travel.flights.models.domain.booking;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l7g.q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/booking/BookingStatus;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BookingStatus implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BookingStatus> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f93458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f93459c;
    public final List d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            q qVarValueOf = q.valueOf(parcel.readString());
            int iA = 0;
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(BookingConfirmationStage.CREATOR, parcel, arrayList, iA, 1);
            }
            return new BookingStatus(string, qVarValueOf, z, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BookingStatus[i];
        }
    }

    public BookingStatus(String bookingId, q state, boolean z, List confirmationStages) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(confirmationStages, "confirmationStages");
        this.f93457a = bookingId;
        this.f93458b = state;
        this.f93459c = z;
        this.d = confirmationStages;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BookingStatus)) {
            return false;
        }
        BookingStatus bookingStatus = (BookingStatus) obj2;
        return Intrinsics.f(this.f93457a, bookingStatus.f93457a) && this.f93458b == bookingStatus.f93458b && this.f93459c == bookingStatus.f93459c && Intrinsics.f(this.d, bookingStatus.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c((this.f93458b.hashCode() + (this.f93457a.hashCode() * 31)) * 31, 31, this.f93459c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93457a);
        dest.writeString(this.f93458b.name());
        dest.writeInt(this.f93459c ? 1 : 0);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            ((BookingConfirmationStage) itV.next()).writeToParcel(dest, i);
        }
    }
}
