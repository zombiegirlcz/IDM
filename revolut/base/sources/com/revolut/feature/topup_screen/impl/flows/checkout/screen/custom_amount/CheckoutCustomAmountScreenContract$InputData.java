package com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.topup_screen.api.model.CheckoutCustomAmountLimit;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/topup_screen/impl/flows/checkout/screen/custom_amount/CheckoutCustomAmountScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CheckoutCustomAmountScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CheckoutCustomAmountScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f90763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CheckoutCustomAmountLimit f90764b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CheckoutCustomAmountScreenContract$InputData((d) parcel.readSerializable(), (CheckoutCustomAmountLimit) parcel.readParcelable(CheckoutCustomAmountScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CheckoutCustomAmountScreenContract$InputData[i];
        }
    }

    public CheckoutCustomAmountScreenContract$InputData(d customAmount, CheckoutCustomAmountLimit limit) {
        Intrinsics.checkNotNullParameter(customAmount, "customAmount");
        Intrinsics.checkNotNullParameter(limit, "limit");
        this.f90763a = customAmount;
        this.f90764b = limit;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CheckoutCustomAmountScreenContract$InputData)) {
            return false;
        }
        CheckoutCustomAmountScreenContract$InputData checkoutCustomAmountScreenContract$InputData = (CheckoutCustomAmountScreenContract$InputData) obj2;
        return Intrinsics.f(this.f90763a, checkoutCustomAmountScreenContract$InputData.f90763a) && Intrinsics.f(this.f90764b, checkoutCustomAmountScreenContract$InputData.f90764b);
    }

    public final int hashCode() {
        return this.f90764b.hashCode() + (this.f90763a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f90763a);
        dest.writeParcelable(this.f90764b, i);
    }
}
