package com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.datepicker;

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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/restaurants/impl/ui/reservationcreation/datepicker/ReservationDatePickerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReservationDatePickerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ReservationDatePickerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f82866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f82867b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            LocalDate localDateOfEpochDay = LocalDate.ofEpochDay(parcel.readLong());
            Intrinsics.checkNotNullExpressionValue(localDateOfEpochDay, "ofEpochDay(...)");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                LocalDate localDateOfEpochDay2 = LocalDate.ofEpochDay(parcel.readLong());
                Intrinsics.checkNotNullExpressionValue(localDateOfEpochDay2, "ofEpochDay(...)");
                arrayList.add(localDateOfEpochDay2);
            }
            return new ReservationDatePickerContract$InputData(localDateOfEpochDay, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReservationDatePickerContract$InputData[i];
        }
    }

    public ReservationDatePickerContract$InputData(LocalDate selectedDate, List availableDates) {
        Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
        Intrinsics.checkNotNullParameter(availableDates, "availableDates");
        this.f82866a = selectedDate;
        this.f82867b = availableDates;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ReservationDatePickerContract$InputData)) {
            return false;
        }
        ReservationDatePickerContract$InputData reservationDatePickerContract$InputData = (ReservationDatePickerContract$InputData) obj2;
        return Intrinsics.f(this.f82866a, reservationDatePickerContract$InputData.f82866a) && Intrinsics.f(this.f82867b, reservationDatePickerContract$InputData.f82867b);
    }

    public final int hashCode() {
        return this.f82867b.hashCode() + (this.f82866a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        LocalDate localDate = this.f82866a;
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeLong(localDate.toEpochDay());
        Iterator itV = p.a.v(this.f82867b, parcel);
        while (itV.hasNext()) {
            LocalDate localDate2 = (LocalDate) itV.next();
            Intrinsics.checkNotNullParameter(localDate2, "<this>");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeLong(localDate2.toEpochDay());
        }
    }
}
