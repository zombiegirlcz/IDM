package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/hotels/impl/ui_kompot/screen/amendment_confirmation/TravelHotelsAmendmentConfirmationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsAmendmentConfirmationScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsAmendmentConfirmationScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f93815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f93816c;
    public final List d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            LocalDate localDate2 = (LocalDate) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(TravelHotelsAmendmentConfirmationScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new TravelHotelsAmendmentConfirmationScreenContract$InputData(string, localDate, localDate2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsAmendmentConfirmationScreenContract$InputData[i];
        }
    }

    public TravelHotelsAmendmentConfirmationScreenContract$InputData(String bookingId, LocalDate newCheckIn, LocalDate newCheckOut, List selectedBeds) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        Intrinsics.checkNotNullParameter(newCheckIn, "newCheckIn");
        Intrinsics.checkNotNullParameter(newCheckOut, "newCheckOut");
        Intrinsics.checkNotNullParameter(selectedBeds, "selectedBeds");
        this.f93814a = bookingId;
        this.f93815b = newCheckIn;
        this.f93816c = newCheckOut;
        this.d = selectedBeds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsAmendmentConfirmationScreenContract$InputData)) {
            return false;
        }
        TravelHotelsAmendmentConfirmationScreenContract$InputData travelHotelsAmendmentConfirmationScreenContract$InputData = (TravelHotelsAmendmentConfirmationScreenContract$InputData) obj2;
        return Intrinsics.f(this.f93814a, travelHotelsAmendmentConfirmationScreenContract$InputData.f93814a) && Intrinsics.f(this.f93815b, travelHotelsAmendmentConfirmationScreenContract$InputData.f93815b) && Intrinsics.f(this.f93816c, travelHotelsAmendmentConfirmationScreenContract$InputData.f93816c) && Intrinsics.f(this.d, travelHotelsAmendmentConfirmationScreenContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + y.a(y.a(this.f93814a.hashCode() * 31, 31, this.f93815b), 31, this.f93816c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93814a);
        dest.writeSerializable(this.f93815b);
        dest.writeSerializable(this.f93816c);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
