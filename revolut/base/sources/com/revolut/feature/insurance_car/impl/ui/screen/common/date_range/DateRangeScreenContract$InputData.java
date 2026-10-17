package com.revolut.feature.insurance_car.impl.ui.screen.common.date_range;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/screen/common/date_range/DateRangeScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DateRangeScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DateRangeScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f75514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f75515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f75516c;
    public final LocalDate d;
    public final LocalDate e;
    public final LocalDate f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DateRangeScreenContract$InputData((Clause) parcel.readParcelable(DateRangeScreenContract$InputData.class.getClassLoader()), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DateRangeScreenContract$InputData[i];
        }
    }

    public DateRangeScreenContract$InputData(Clause title, LocalDate minDate, LocalDate maxDate, LocalDate selectedStartDate, LocalDate selectedEndDate, LocalDate currentDate) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(minDate, "minDate");
        Intrinsics.checkNotNullParameter(maxDate, "maxDate");
        Intrinsics.checkNotNullParameter(selectedStartDate, "selectedStartDate");
        Intrinsics.checkNotNullParameter(selectedEndDate, "selectedEndDate");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        this.f75514a = title;
        this.f75515b = minDate;
        this.f75516c = maxDate;
        this.d = selectedStartDate;
        this.e = selectedEndDate;
        this.f = currentDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DateRangeScreenContract$InputData)) {
            return false;
        }
        DateRangeScreenContract$InputData dateRangeScreenContract$InputData = (DateRangeScreenContract$InputData) obj2;
        return Intrinsics.f(this.f75514a, dateRangeScreenContract$InputData.f75514a) && Intrinsics.f(this.f75515b, dateRangeScreenContract$InputData.f75515b) && Intrinsics.f(this.f75516c, dateRangeScreenContract$InputData.f75516c) && Intrinsics.f(this.d, dateRangeScreenContract$InputData.d) && Intrinsics.f(this.e, dateRangeScreenContract$InputData.e) && Intrinsics.f(this.f, dateRangeScreenContract$InputData.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + y.a(y.a(y.a(y.a(this.f75514a.hashCode() * 31, 31, this.f75515b), 31, this.f75516c), 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f75514a, i);
        dest.writeSerializable(this.f75515b);
        dest.writeSerializable(this.f75516c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
    }
}
