package com.revolut.feature.revolutpay.impl.ui.payment_schedule;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.revolutpay.impl.domain.models.payment_schedule.PaymentScheduleSelection;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/revolutpay/impl/ui/payment_schedule/PaymentScheduleContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentScheduleContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PaymentScheduleContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f84509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f84510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PaymentScheduleSelection f84511c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(PaymentScheduleContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new PaymentScheduleContract$InputData(dVar, arrayList, (PaymentScheduleSelection) parcel.readParcelable(PaymentScheduleContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentScheduleContract$InputData[i];
        }
    }

    public PaymentScheduleContract$InputData(d amountWithDiscount, List paymentScheduleList, PaymentScheduleSelection selectedPaymentSchedule) {
        Intrinsics.checkNotNullParameter(amountWithDiscount, "amountWithDiscount");
        Intrinsics.checkNotNullParameter(paymentScheduleList, "paymentScheduleList");
        Intrinsics.checkNotNullParameter(selectedPaymentSchedule, "selectedPaymentSchedule");
        this.f84509a = amountWithDiscount;
        this.f84510b = paymentScheduleList;
        this.f84511c = selectedPaymentSchedule;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentScheduleContract$InputData)) {
            return false;
        }
        PaymentScheduleContract$InputData paymentScheduleContract$InputData = (PaymentScheduleContract$InputData) obj2;
        return Intrinsics.f(this.f84509a, paymentScheduleContract$InputData.f84509a) && Intrinsics.f(this.f84510b, paymentScheduleContract$InputData.f84510b) && Intrinsics.f(this.f84511c, paymentScheduleContract$InputData.f84511c);
    }

    public final int hashCode() {
        return this.f84511c.hashCode() + p.a.d(this.f84509a.hashCode() * 31, 31, this.f84510b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f84509a);
        Iterator itV = p.a.v(this.f84510b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeParcelable(this.f84511c, i);
    }
}
