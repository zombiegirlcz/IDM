package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.power_of_attorney;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.esim.api.model.EsimCheckoutPortingSteps;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingInstruction;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingPowerOfAttorneyInfo;
import hgj.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/power_of_attorney/EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f100799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimPhoneNumberPortingInstruction f100800c;
    public final EsimCheckoutPortingSteps d;
    public final EsimPhoneNumberPortingPowerOfAttorneyInfo e;
    public final EsimGiftRecipient f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f100801g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData(parcel.readString(), parcel.readString(), (EsimPhoneNumberPortingInstruction) parcel.readParcelable(EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData.class.getClassLoader()), (EsimCheckoutPortingSteps) parcel.readParcelable(EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData.class.getClassLoader()), (EsimPhoneNumberPortingPowerOfAttorneyInfo) parcel.readParcelable(EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData.class.getClassLoader()), (EsimGiftRecipient) parcel.readParcelable(EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData.class.getClassLoader()), c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData[i];
        }
    }

    public EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData(String subscriptionId, String phoneNumber, EsimPhoneNumberPortingInstruction esimPhoneNumberPortingInstruction, EsimCheckoutPortingSteps esimCheckoutPortingSteps, EsimPhoneNumberPortingPowerOfAttorneyInfo powerOfAttorneyInfo, EsimGiftRecipient esimGiftRecipient, c navigationIcon) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(powerOfAttorneyInfo, "powerOfAttorneyInfo");
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        this.f100798a = subscriptionId;
        this.f100799b = phoneNumber;
        this.f100800c = esimPhoneNumberPortingInstruction;
        this.d = esimCheckoutPortingSteps;
        this.e = powerOfAttorneyInfo;
        this.f = esimGiftRecipient;
        this.f100801g = navigationIcon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData)) {
            return false;
        }
        EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData esimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData = (EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData) obj2;
        return Intrinsics.f(this.f100798a, esimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData.f100798a) && Intrinsics.f(this.f100799b, esimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData.f100799b) && Intrinsics.f(this.f100800c, esimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData.f100800c) && Intrinsics.f(this.d, esimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData.d) && Intrinsics.f(this.e, esimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData.e) && Intrinsics.f(this.f, esimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData.f) && this.f100801g == esimMobilePlanPowerOfAttorneyNumberTransferConfirmationFlowContract$InputData.f100801g;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f100798a.hashCode() * 31, 31, this.f100799b);
        EsimPhoneNumberPortingInstruction esimPhoneNumberPortingInstruction = this.f100800c;
        int iHashCode = (iC + (esimPhoneNumberPortingInstruction == null ? 0 : esimPhoneNumberPortingInstruction.hashCode())) * 31;
        EsimCheckoutPortingSteps esimCheckoutPortingSteps = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iHashCode + (esimCheckoutPortingSteps == null ? 0 : esimCheckoutPortingSteps.hashCode())) * 31)) * 31;
        EsimGiftRecipient esimGiftRecipient = this.f;
        return this.f100801g.hashCode() + ((iHashCode2 + (esimGiftRecipient != null ? esimGiftRecipient.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100798a);
        dest.writeString(this.f100799b);
        dest.writeParcelable(this.f100800c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeString(this.f100801g.name());
    }
}
