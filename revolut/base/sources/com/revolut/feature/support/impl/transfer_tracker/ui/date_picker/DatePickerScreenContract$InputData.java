package com.revolut.feature.support.impl.transfer_tracker.ui.date_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/support/impl/transfer_tracker/ui/date_picker/DatePickerScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_support_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DatePickerScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DatePickerScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f89401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f89402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f89403c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DatePickerScreenContract$InputData((LocalDate) parcel.readSerializable(), (Clause) parcel.readParcelable(DatePickerScreenContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(DatePickerScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DatePickerScreenContract$InputData[i];
        }
    }

    public DatePickerScreenContract$InputData(LocalDate localDate, Clause title, Clause actionText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actionText, "actionText");
        this.f89401a = localDate;
        this.f89402b = title;
        this.f89403c = actionText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DatePickerScreenContract$InputData)) {
            return false;
        }
        DatePickerScreenContract$InputData datePickerScreenContract$InputData = (DatePickerScreenContract$InputData) obj2;
        return Intrinsics.f(this.f89401a, datePickerScreenContract$InputData.f89401a) && Intrinsics.f(this.f89402b, datePickerScreenContract$InputData.f89402b) && Intrinsics.f(this.f89403c, datePickerScreenContract$InputData.f89403c);
    }

    public final int hashCode() {
        LocalDate localDate = this.f89401a;
        return this.f89403c.hashCode() + p.a.a((localDate == null ? 0 : localDate.hashCode()) * 31, 31, this.f89402b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f89401a);
        dest.writeParcelable(this.f89402b, i);
        dest.writeParcelable(this.f89403c, i);
    }
}
