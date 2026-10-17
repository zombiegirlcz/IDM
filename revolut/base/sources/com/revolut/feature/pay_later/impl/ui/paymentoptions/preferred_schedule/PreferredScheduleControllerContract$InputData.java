package com.revolut.feature.pay_later.impl.ui.paymentoptions.preferred_schedule;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.pay_later.api.models.PayLaterPaymentOption;
import com.revolut.kompot.common.IOData$Input;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pay_later/impl/ui/paymentoptions/preferred_schedule/PreferredScheduleControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PreferredScheduleControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PreferredScheduleControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayLaterPaymentOption f78891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f78892b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PreferredScheduleControllerContract$InputData((PayLaterPaymentOption) parcel.readParcelable(PreferredScheduleControllerContract$InputData.class.getClassLoader()), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PreferredScheduleControllerContract$InputData[i];
        }
    }

    public PreferredScheduleControllerContract$InputData(PayLaterPaymentOption paymentMethod, BigDecimal serviceFee) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(serviceFee, "serviceFee");
        this.f78891a = paymentMethod;
        this.f78892b = serviceFee;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PreferredScheduleControllerContract$InputData)) {
            return false;
        }
        PreferredScheduleControllerContract$InputData preferredScheduleControllerContract$InputData = (PreferredScheduleControllerContract$InputData) obj2;
        return Intrinsics.f(this.f78891a, preferredScheduleControllerContract$InputData.f78891a) && Intrinsics.f(this.f78892b, preferredScheduleControllerContract$InputData.f78892b);
    }

    public final int hashCode() {
        return this.f78892b.hashCode() + (this.f78891a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f78891a, i);
        dest.writeSerializable(this.f78892b);
    }
}
