package com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.timepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/restaurants/impl/ui/reservationcreation/timepicker/ReservationTimePickerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReservationTimePickerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ReservationTimePickerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalTime f82870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f82871b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            LocalTime localTimeOfNanoOfDay = LocalTime.ofNanoOfDay(parcel.readLong());
            Intrinsics.checkNotNullExpressionValue(localTimeOfNanoOfDay, "ofNanoOfDay(...)");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                LocalTime localTimeOfNanoOfDay2 = LocalTime.ofNanoOfDay(parcel.readLong());
                Intrinsics.checkNotNullExpressionValue(localTimeOfNanoOfDay2, "ofNanoOfDay(...)");
                arrayList.add(localTimeOfNanoOfDay2);
            }
            return new ReservationTimePickerContract$InputData(localTimeOfNanoOfDay, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReservationTimePickerContract$InputData[i];
        }
    }

    public ReservationTimePickerContract$InputData(LocalTime selectedTime, List availableTimes) {
        Intrinsics.checkNotNullParameter(selectedTime, "selectedTime");
        Intrinsics.checkNotNullParameter(availableTimes, "availableTimes");
        this.f82870a = selectedTime;
        this.f82871b = availableTimes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ReservationTimePickerContract$InputData)) {
            return false;
        }
        ReservationTimePickerContract$InputData reservationTimePickerContract$InputData = (ReservationTimePickerContract$InputData) obj2;
        return Intrinsics.f(this.f82870a, reservationTimePickerContract$InputData.f82870a) && Intrinsics.f(this.f82871b, reservationTimePickerContract$InputData.f82871b);
    }

    public final int hashCode() {
        return this.f82871b.hashCode() + (this.f82870a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        LocalTime localTime = this.f82870a;
        Intrinsics.checkNotNullParameter(localTime, "<this>");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeLong(localTime.toNanoOfDay());
        Iterator itV = p.a.v(this.f82871b, parcel);
        while (itV.hasNext()) {
            LocalTime localTime2 = (LocalTime) itV.next();
            Intrinsics.checkNotNullParameter(localTime2, "<this>");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeLong(localTime2.toNanoOfDay());
        }
    }
}
