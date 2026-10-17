package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.pac;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.esim.api.model.EsimCheckoutPortingSteps;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingInstruction;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingPacInfo;
import hgj.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/pac/EsimMobilePlanPacNumberTransferConfirmationFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanPacNumberTransferConfirmationFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanPacNumberTransferConfirmationFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f100786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimPhoneNumberPortingInstruction f100787c;
    public final EsimCheckoutPortingSteps d;
    public final EsimPhoneNumberPortingPacInfo e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final EsimGiftRecipient f100788g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            EsimPhoneNumberPortingInstruction esimPhoneNumberPortingInstruction = (EsimPhoneNumberPortingInstruction) parcel.readParcelable(EsimMobilePlanPacNumberTransferConfirmationFlowContract$InputData.class.getClassLoader());
            return new EsimMobilePlanPacNumberTransferConfirmationFlowContract$InputData((EsimCheckoutPortingSteps) parcel.readParcelable(EsimMobilePlanPacNumberTransferConfirmationFlowContract$InputData.class.getClassLoader()), (EsimGiftRecipient) parcel.readParcelable(EsimMobilePlanPacNumberTransferConfirmationFlowContract$InputData.class.getClassLoader()), esimPhoneNumberPortingInstruction, (EsimPhoneNumberPortingPacInfo) parcel.readParcelable(EsimMobilePlanPacNumberTransferConfirmationFlowContract$InputData.class.getClassLoader()), c.valueOf(parcel.readString()), string, string2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanPacNumberTransferConfirmationFlowContract$InputData[i];
        }
    }

    public EsimMobilePlanPacNumberTransferConfirmationFlowContract$InputData(EsimCheckoutPortingSteps esimCheckoutPortingSteps, EsimGiftRecipient esimGiftRecipient, EsimPhoneNumberPortingInstruction esimPhoneNumberPortingInstruction, EsimPhoneNumberPortingPacInfo pacInfo, c navigationIcon, String subscriptionId, String phoneNumber) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(pacInfo, "pacInfo");
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        this.f100785a = subscriptionId;
        this.f100786b = phoneNumber;
        this.f100787c = esimPhoneNumberPortingInstruction;
        this.d = esimCheckoutPortingSteps;
        this.e = pacInfo;
        this.f = navigationIcon;
        this.f100788g = esimGiftRecipient;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimMobilePlanPacNumberTransferConfirmationFlowContract$InputData)) {
            return false;
        }
        EsimMobilePlanPacNumberTransferConfirmationFlowContract$InputData esimMobilePlanPacNumberTransferConfirmationFlowContract$InputData = (EsimMobilePlanPacNumberTransferConfirmationFlowContract$InputData) obj2;
        return Intrinsics.f(this.f100785a, esimMobilePlanPacNumberTransferConfirmationFlowContract$InputData.f100785a) && Intrinsics.f(this.f100786b, esimMobilePlanPacNumberTransferConfirmationFlowContract$InputData.f100786b) && Intrinsics.f(this.f100787c, esimMobilePlanPacNumberTransferConfirmationFlowContract$InputData.f100787c) && Intrinsics.f(this.d, esimMobilePlanPacNumberTransferConfirmationFlowContract$InputData.d) && Intrinsics.f(this.e, esimMobilePlanPacNumberTransferConfirmationFlowContract$InputData.e) && this.f == esimMobilePlanPacNumberTransferConfirmationFlowContract$InputData.f && Intrinsics.f(this.f100788g, esimMobilePlanPacNumberTransferConfirmationFlowContract$InputData.f100788g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f100785a.hashCode() * 31, 31, this.f100786b);
        EsimPhoneNumberPortingInstruction esimPhoneNumberPortingInstruction = this.f100787c;
        int iHashCode = (iC + (esimPhoneNumberPortingInstruction == null ? 0 : esimPhoneNumberPortingInstruction.hashCode())) * 31;
        EsimCheckoutPortingSteps esimCheckoutPortingSteps = this.d;
        int iHashCode2 = (this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (esimCheckoutPortingSteps == null ? 0 : esimCheckoutPortingSteps.hashCode())) * 31)) * 31)) * 31;
        EsimGiftRecipient esimGiftRecipient = this.f100788g;
        return iHashCode2 + (esimGiftRecipient != null ? esimGiftRecipient.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100785a);
        dest.writeString(this.f100786b);
        dest.writeParcelable(this.f100787c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeString(this.f.name());
        dest.writeParcelable(this.f100788g, i);
    }
}
