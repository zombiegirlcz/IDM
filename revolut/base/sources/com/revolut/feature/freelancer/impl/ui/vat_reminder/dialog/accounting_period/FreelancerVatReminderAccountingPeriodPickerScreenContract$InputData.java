package com.revolut.feature.freelancer.impl.ui.vat_reminder.dialog.accounting_period;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.time.Month;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/vat_reminder/dialog/accounting_period/FreelancerVatReminderAccountingPeriodPickerScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerVatReminderAccountingPeriodPickerScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<FreelancerVatReminderAccountingPeriodPickerScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Month f74436a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerVatReminderAccountingPeriodPickerScreenContract$InputData(parcel.readInt() == 0 ? null : Month.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerVatReminderAccountingPeriodPickerScreenContract$InputData[i];
        }
    }

    public FreelancerVatReminderAccountingPeriodPickerScreenContract$InputData(Month month) {
        this.f74436a = month;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof FreelancerVatReminderAccountingPeriodPickerScreenContract$InputData) && this.f74436a == ((FreelancerVatReminderAccountingPeriodPickerScreenContract$InputData) obj2).f74436a;
    }

    public final int hashCode() {
        Month month = this.f74436a;
        if (month == null) {
            return 0;
        }
        return month.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Month month = this.f74436a;
        if (month == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(month.name());
        }
    }
}
