package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.picker.date_picker;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/add_edit_asset/picker/date_picker/DatePickerBottomSheetContract$OutputData", "Laii/r;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DatePickerBottomSheetContract$OutputData implements r, Parcelable {

    @NotNull
    public static final Parcelable.Creator<DatePickerBottomSheetContract$OutputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f87930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jrd.a f87931b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DatePickerBottomSheetContract$OutputData((LocalDate) parcel.readSerializable(), jrd.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DatePickerBottomSheetContract$OutputData[i];
        }
    }

    public DatePickerBottomSheetContract$OutputData(LocalDate date, jrd.a mode) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f87930a = date;
        this.f87931b = mode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DatePickerBottomSheetContract$OutputData)) {
            return false;
        }
        DatePickerBottomSheetContract$OutputData datePickerBottomSheetContract$OutputData = (DatePickerBottomSheetContract$OutputData) obj2;
        return Intrinsics.f(this.f87930a, datePickerBottomSheetContract$OutputData.f87930a) && this.f87931b == datePickerBottomSheetContract$OutputData.f87931b;
    }

    public final int hashCode() {
        return this.f87931b.hashCode() + (this.f87930a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f87930a);
        dest.writeString(this.f87931b.name());
    }
}
