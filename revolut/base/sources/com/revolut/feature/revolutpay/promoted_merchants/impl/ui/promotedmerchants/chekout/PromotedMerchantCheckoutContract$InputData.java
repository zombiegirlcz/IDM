package com.revolut.feature.revolutpay.promoted_merchants.impl.ui.promotedmerchants.chekout;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.revolutpay.promoted_merchants.models.merchants.PromotedMerchant;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/revolutpay/promoted_merchants/impl/ui/promotedmerchants/chekout/PromotedMerchantCheckoutContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_promoted_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PromotedMerchantCheckoutContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PromotedMerchantCheckoutContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PromotedMerchant f84678b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PromotedMerchantCheckoutContract$InputData(parcel.readString(), (PromotedMerchant) parcel.readParcelable(PromotedMerchantCheckoutContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PromotedMerchantCheckoutContract$InputData[i];
        }
    }

    public PromotedMerchantCheckoutContract$InputData(String claimInstructionsId, PromotedMerchant promotedMerchant) {
        Intrinsics.checkNotNullParameter(claimInstructionsId, "claimInstructionsId");
        Intrinsics.checkNotNullParameter(promotedMerchant, "promotedMerchant");
        this.f84677a = claimInstructionsId;
        this.f84678b = promotedMerchant;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PromotedMerchantCheckoutContract$InputData)) {
            return false;
        }
        PromotedMerchantCheckoutContract$InputData promotedMerchantCheckoutContract$InputData = (PromotedMerchantCheckoutContract$InputData) obj2;
        return Intrinsics.f(this.f84677a, promotedMerchantCheckoutContract$InputData.f84677a) && Intrinsics.f(this.f84678b, promotedMerchantCheckoutContract$InputData.f84678b);
    }

    public final int hashCode() {
        return this.f84678b.hashCode() + (this.f84677a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84677a);
        dest.writeParcelable(this.f84678b, i);
    }
}
