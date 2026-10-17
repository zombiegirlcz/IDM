package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelections;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer/EsimMobilePlanNumberTransferScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanNumberTransferScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanNumberTransferScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimPhoneNumberSelections f101255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimGiftRecipient f101256b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimMobilePlanNumberTransferScreenContract$InputData((EsimPhoneNumberSelections) parcel.readParcelable(EsimMobilePlanNumberTransferScreenContract$InputData.class.getClassLoader()), (EsimGiftRecipient) parcel.readParcelable(EsimMobilePlanNumberTransferScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanNumberTransferScreenContract$InputData[i];
        }
    }

    public EsimMobilePlanNumberTransferScreenContract$InputData(EsimPhoneNumberSelections phoneNumberSelections, EsimGiftRecipient esimGiftRecipient) {
        Intrinsics.checkNotNullParameter(phoneNumberSelections, "phoneNumberSelections");
        this.f101255a = phoneNumberSelections;
        this.f101256b = esimGiftRecipient;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimMobilePlanNumberTransferScreenContract$InputData)) {
            return false;
        }
        EsimMobilePlanNumberTransferScreenContract$InputData esimMobilePlanNumberTransferScreenContract$InputData = (EsimMobilePlanNumberTransferScreenContract$InputData) obj2;
        return Intrinsics.f(this.f101255a, esimMobilePlanNumberTransferScreenContract$InputData.f101255a) && Intrinsics.f(this.f101256b, esimMobilePlanNumberTransferScreenContract$InputData.f101256b);
    }

    public final int hashCode() {
        int iHashCode = this.f101255a.hashCode() * 31;
        EsimGiftRecipient esimGiftRecipient = this.f101256b;
        return iHashCode + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f101255a, i);
        dest.writeParcelable(this.f101256b, i);
    }
}
