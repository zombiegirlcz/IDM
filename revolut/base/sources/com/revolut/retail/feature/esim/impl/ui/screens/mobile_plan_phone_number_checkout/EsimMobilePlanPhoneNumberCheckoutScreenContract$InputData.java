package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_phone_number_checkout/EsimMobilePlanPhoneNumberCheckoutScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanPhoneNumberCheckoutScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanPhoneNumberCheckoutScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f101372b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimMobilePlanPhoneNumberCheckoutScreenContract$InputData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanPhoneNumberCheckoutScreenContract$InputData[i];
        }
    }

    public EsimMobilePlanPhoneNumberCheckoutScreenContract$InputData(String subscriptionId, String str) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        this.f101371a = subscriptionId;
        this.f101372b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimMobilePlanPhoneNumberCheckoutScreenContract$InputData)) {
            return false;
        }
        EsimMobilePlanPhoneNumberCheckoutScreenContract$InputData esimMobilePlanPhoneNumberCheckoutScreenContract$InputData = (EsimMobilePlanPhoneNumberCheckoutScreenContract$InputData) obj2;
        return Intrinsics.f(this.f101371a, esimMobilePlanPhoneNumberCheckoutScreenContract$InputData.f101371a) && Intrinsics.f(this.f101372b, esimMobilePlanPhoneNumberCheckoutScreenContract$InputData.f101372b);
    }

    public final int hashCode() {
        int iHashCode = this.f101371a.hashCode() * 31;
        String str = this.f101372b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f101371a);
        dest.writeString(this.f101372b);
    }
}
