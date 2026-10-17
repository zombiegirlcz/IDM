package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation;

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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/pac/number_transfer_confirmation/EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f101308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimPhoneNumberPortingInstruction f101309c;
    public final EsimCheckoutPortingSteps d;
    public final EsimPhoneNumberPortingPacInfo e;
    public final EsimGiftRecipient f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f101310g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            EsimPhoneNumberPortingInstruction esimPhoneNumberPortingInstruction = (EsimPhoneNumberPortingInstruction) parcel.readParcelable(EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData.class.getClassLoader());
            return new EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData((EsimCheckoutPortingSteps) parcel.readParcelable(EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData.class.getClassLoader()), (EsimGiftRecipient) parcel.readParcelable(EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData.class.getClassLoader()), esimPhoneNumberPortingInstruction, (EsimPhoneNumberPortingPacInfo) parcel.readParcelable(EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData.class.getClassLoader()), c.valueOf(parcel.readString()), string, string2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData[i];
        }
    }

    public EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData(EsimCheckoutPortingSteps esimCheckoutPortingSteps, EsimGiftRecipient esimGiftRecipient, EsimPhoneNumberPortingInstruction esimPhoneNumberPortingInstruction, EsimPhoneNumberPortingPacInfo pacInfo, c navigationIcon, String subscriptionId, String phoneNumber) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(pacInfo, "pacInfo");
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        this.f101307a = subscriptionId;
        this.f101308b = phoneNumber;
        this.f101309c = esimPhoneNumberPortingInstruction;
        this.d = esimCheckoutPortingSteps;
        this.e = pacInfo;
        this.f = esimGiftRecipient;
        this.f101310g = navigationIcon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData)) {
            return false;
        }
        EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData esimMobilePlanPacNumberTransferConfirmationScreenContract$InputData = (EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData) obj2;
        return Intrinsics.f(this.f101307a, esimMobilePlanPacNumberTransferConfirmationScreenContract$InputData.f101307a) && Intrinsics.f(this.f101308b, esimMobilePlanPacNumberTransferConfirmationScreenContract$InputData.f101308b) && Intrinsics.f(this.f101309c, esimMobilePlanPacNumberTransferConfirmationScreenContract$InputData.f101309c) && Intrinsics.f(this.d, esimMobilePlanPacNumberTransferConfirmationScreenContract$InputData.d) && Intrinsics.f(this.e, esimMobilePlanPacNumberTransferConfirmationScreenContract$InputData.e) && Intrinsics.f(this.f, esimMobilePlanPacNumberTransferConfirmationScreenContract$InputData.f) && this.f101310g == esimMobilePlanPacNumberTransferConfirmationScreenContract$InputData.f101310g;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f101307a.hashCode() * 31, 31, this.f101308b);
        EsimPhoneNumberPortingInstruction esimPhoneNumberPortingInstruction = this.f101309c;
        int iHashCode = (iC + (esimPhoneNumberPortingInstruction == null ? 0 : esimPhoneNumberPortingInstruction.hashCode())) * 31;
        EsimCheckoutPortingSteps esimCheckoutPortingSteps = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iHashCode + (esimCheckoutPortingSteps == null ? 0 : esimCheckoutPortingSteps.hashCode())) * 31)) * 31;
        EsimGiftRecipient esimGiftRecipient = this.f;
        return this.f101310g.hashCode() + ((iHashCode2 + (esimGiftRecipient != null ? esimGiftRecipient.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f101307a);
        dest.writeString(this.f101308b);
        dest.writeParcelable(this.f101309c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeString(this.f101310g.name());
    }
}
