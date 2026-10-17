package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelections;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_selection/EsimMobilePlanNumberSelectionFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanNumberSelectionFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanNumberSelectionFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimGiftRecipient f100722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimPhoneNumberSelections f100723c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimMobilePlanNumberSelectionFlowContract$InputData(parcel.readString(), (EsimGiftRecipient) parcel.readParcelable(EsimMobilePlanNumberSelectionFlowContract$InputData.class.getClassLoader()), (EsimPhoneNumberSelections) parcel.readParcelable(EsimMobilePlanNumberSelectionFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanNumberSelectionFlowContract$InputData[i];
        }
    }

    public EsimMobilePlanNumberSelectionFlowContract$InputData(String mobilePlanId, EsimGiftRecipient esimGiftRecipient, EsimPhoneNumberSelections phoneNumberSelections) {
        Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
        Intrinsics.checkNotNullParameter(phoneNumberSelections, "phoneNumberSelections");
        this.f100721a = mobilePlanId;
        this.f100722b = esimGiftRecipient;
        this.f100723c = phoneNumberSelections;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimMobilePlanNumberSelectionFlowContract$InputData)) {
            return false;
        }
        EsimMobilePlanNumberSelectionFlowContract$InputData esimMobilePlanNumberSelectionFlowContract$InputData = (EsimMobilePlanNumberSelectionFlowContract$InputData) obj2;
        return Intrinsics.f(this.f100721a, esimMobilePlanNumberSelectionFlowContract$InputData.f100721a) && Intrinsics.f(this.f100722b, esimMobilePlanNumberSelectionFlowContract$InputData.f100722b) && Intrinsics.f(this.f100723c, esimMobilePlanNumberSelectionFlowContract$InputData.f100723c);
    }

    public final int hashCode() {
        int iHashCode = this.f100721a.hashCode() * 31;
        EsimGiftRecipient esimGiftRecipient = this.f100722b;
        return this.f100723c.hashCode() + ((iHashCode + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100721a);
        dest.writeParcelable(this.f100722b, i);
        dest.writeParcelable(this.f100723c, i);
    }
}
