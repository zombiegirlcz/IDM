package com.revolut.feature.bank_account_switching.impl.ui.payments_review.payment_schedule;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.bank_account_switching.impl.ui.start_date_selection.domain.DatePickerConfig;
import com.revolut.kompot.common.IOData$Input;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qo2.c;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/bank_account_switching/impl/ui/payments_review/payment_schedule/BankAccountSwitchingPaymentScheduleScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BankAccountSwitchingPaymentScheduleScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BankAccountSwitchingPaymentScheduleScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DatePickerConfig f63954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f63955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f63956c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BankAccountSwitchingPaymentScheduleScreenContract$InputData(DatePickerConfig.CREATOR.createFromParcel(parcel), (LocalDate) parcel.readSerializable(), parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BankAccountSwitchingPaymentScheduleScreenContract$InputData[i];
        }
    }

    public BankAccountSwitchingPaymentScheduleScreenContract$InputData(DatePickerConfig datePickerConfig, LocalDate localDate, c cVar) {
        Intrinsics.checkNotNullParameter(datePickerConfig, "datePickerConfig");
        this.f63954a = datePickerConfig;
        this.f63955b = localDate;
        this.f63956c = cVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BankAccountSwitchingPaymentScheduleScreenContract$InputData)) {
            return false;
        }
        BankAccountSwitchingPaymentScheduleScreenContract$InputData bankAccountSwitchingPaymentScheduleScreenContract$InputData = (BankAccountSwitchingPaymentScheduleScreenContract$InputData) obj2;
        return Intrinsics.f(this.f63954a, bankAccountSwitchingPaymentScheduleScreenContract$InputData.f63954a) && Intrinsics.f(this.f63955b, bankAccountSwitchingPaymentScheduleScreenContract$InputData.f63955b) && this.f63956c == bankAccountSwitchingPaymentScheduleScreenContract$InputData.f63956c;
    }

    public final int hashCode() {
        int iHashCode = this.f63954a.hashCode() * 31;
        LocalDate localDate = this.f63955b;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        c cVar = this.f63956c;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f63954a.writeToParcel(dest, i);
        dest.writeSerializable(this.f63955b);
        c cVar = this.f63956c;
        if (cVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cVar.name());
        }
    }
}
