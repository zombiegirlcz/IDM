package com.revolut.feature.revolutpay.shared.ui.insufficient_funds_options;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PayWithAnyFundingOptions;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/revolutpay/shared/ui/insufficient_funds_options/InsufficientFundsOptionsContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InsufficientFundsOptionsContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InsufficientFundsOptionsContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayWithAnyFundingOptions f84715a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InsufficientFundsOptionsContract$InputData((PayWithAnyFundingOptions) parcel.readParcelable(InsufficientFundsOptionsContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InsufficientFundsOptionsContract$InputData[i];
        }
    }

    public InsufficientFundsOptionsContract$InputData(PayWithAnyFundingOptions fundingOptions) {
        Intrinsics.checkNotNullParameter(fundingOptions, "fundingOptions");
        this.f84715a = fundingOptions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof InsufficientFundsOptionsContract$InputData) && Intrinsics.f(this.f84715a, ((InsufficientFundsOptionsContract$InputData) obj2).f84715a);
    }

    public final int hashCode() {
        return this.f84715a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f84715a, i);
    }
}
