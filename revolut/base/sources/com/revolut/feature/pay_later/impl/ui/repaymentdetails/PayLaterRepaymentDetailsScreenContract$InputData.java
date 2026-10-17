package com.revolut.feature.pay_later.impl.ui.repaymentdetails;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pay_later/impl/ui/repaymentdetails/PayLaterRepaymentDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PayLaterRepaymentDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PayLaterRepaymentDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f78917b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PayLaterRepaymentDetailsScreenContract$InputData(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PayLaterRepaymentDetailsScreenContract$InputData[i];
        }
    }

    public PayLaterRepaymentDetailsScreenContract$InputData(String planId, int i) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f78916a = planId;
        this.f78917b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PayLaterRepaymentDetailsScreenContract$InputData)) {
            return false;
        }
        PayLaterRepaymentDetailsScreenContract$InputData payLaterRepaymentDetailsScreenContract$InputData = (PayLaterRepaymentDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f78916a, payLaterRepaymentDetailsScreenContract$InputData.f78916a) && this.f78917b == payLaterRepaymentDetailsScreenContract$InputData.f78917b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f78917b) + (this.f78916a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78916a);
        dest.writeInt(this.f78917b);
    }
}
