package com.revolut.feature.subscriptions.impl.payment_balance_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/payment_balance_picker/PaymentBalancePickerDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentBalancePickerDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<PaymentBalancePickerDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaymentBalancePickerInputData f89219a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentBalancePickerDestination(PaymentBalancePickerInputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentBalancePickerDestination[i];
        }
    }

    public PaymentBalancePickerDestination(PaymentBalancePickerInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f89219a = inputData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final PaymentBalancePickerInputData getF89219a() {
        return this.f89219a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PaymentBalancePickerDestination) && Intrinsics.f(this.f89219a, ((PaymentBalancePickerDestination) obj2).f89219a);
    }

    public final int hashCode() {
        return this.f89219a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f89219a.writeToParcel(dest, i);
    }
}
