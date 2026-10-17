package com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.date_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import ip0.v7;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/analytics_dashboard/trips/date_picker/TripsDatePickerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TripsDatePickerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TripsDatePickerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f87606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f87607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f87608c;
    public final Set d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            LocalDate localDate2 = (LocalDate) parcel.readSerializable();
            int iD = 0;
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            while (iD != i) {
                iD = v7.d(parcel, linkedHashSet, iD, 1);
            }
            return new TripsDatePickerContract$InputData(localDate, localDate2, z, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TripsDatePickerContract$InputData[i];
        }
    }

    public TripsDatePickerContract$InputData(LocalDate localDate, LocalDate localDate2, boolean z, Set excludedDates) {
        Intrinsics.checkNotNullParameter(excludedDates, "excludedDates");
        this.f87606a = localDate;
        this.f87607b = localDate2;
        this.f87608c = z;
        this.d = excludedDates;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TripsDatePickerContract$InputData)) {
            return false;
        }
        TripsDatePickerContract$InputData tripsDatePickerContract$InputData = (TripsDatePickerContract$InputData) obj2;
        return Intrinsics.f(this.f87606a, tripsDatePickerContract$InputData.f87606a) && Intrinsics.f(this.f87607b, tripsDatePickerContract$InputData.f87607b) && this.f87608c == tripsDatePickerContract$InputData.f87608c && Intrinsics.f(this.d, tripsDatePickerContract$InputData.d);
    }

    public final int hashCode() {
        LocalDate localDate = this.f87606a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        LocalDate localDate2 = this.f87607b;
        return this.d.hashCode() + j6.a.c((iHashCode + (localDate2 != null ? localDate2.hashCode() : 0)) * 31, 31, this.f87608c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f87606a);
        dest.writeSerializable(this.f87607b);
        dest.writeInt(this.f87608c ? 1 : 0);
        Iterator itV = n.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
    }
}
