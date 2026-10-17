package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_label_edit;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_phone_number_label_edit/EsimMobilePlanPhoneNumberLabelEditScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanPhoneNumberLabelEditScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanPhoneNumberLabelEditScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimSubscriptionPhoneNumber f101391b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimMobilePlanPhoneNumberLabelEditScreenContract$InputData(parcel.readString(), (EsimSubscriptionPhoneNumber) parcel.readParcelable(EsimMobilePlanPhoneNumberLabelEditScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanPhoneNumberLabelEditScreenContract$InputData[i];
        }
    }

    public EsimMobilePlanPhoneNumberLabelEditScreenContract$InputData(String subscriptionId, EsimSubscriptionPhoneNumber phoneNumber) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.f101390a = subscriptionId;
        this.f101391b = phoneNumber;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimMobilePlanPhoneNumberLabelEditScreenContract$InputData)) {
            return false;
        }
        EsimMobilePlanPhoneNumberLabelEditScreenContract$InputData esimMobilePlanPhoneNumberLabelEditScreenContract$InputData = (EsimMobilePlanPhoneNumberLabelEditScreenContract$InputData) obj2;
        return Intrinsics.f(this.f101390a, esimMobilePlanPhoneNumberLabelEditScreenContract$InputData.f101390a) && Intrinsics.f(this.f101391b, esimMobilePlanPhoneNumberLabelEditScreenContract$InputData.f101391b);
    }

    public final int hashCode() {
        return this.f101391b.hashCode() + (this.f101390a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f101390a);
        dest.writeParcelable(this.f101391b, i);
    }
}
