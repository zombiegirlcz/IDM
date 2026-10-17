package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.esim.api.model.EsimCheckoutPortingSteps;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingOtp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/otp/number_transfer_confirmation/EsimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f101288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimPhoneNumberPortingOtp f101289c;
    public final EsimCheckoutPortingSteps d;
    public final String e;
    public final EsimGiftRecipient f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final hgj.c f101290g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            EsimPhoneNumberPortingOtp esimPhoneNumberPortingOtp = (EsimPhoneNumberPortingOtp) parcel.readParcelable(EsimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData.class.getClassLoader());
            return new EsimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData((EsimCheckoutPortingSteps) parcel.readParcelable(EsimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData.class.getClassLoader()), (EsimGiftRecipient) parcel.readParcelable(EsimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData.class.getClassLoader()), esimPhoneNumberPortingOtp, hgj.c.valueOf(parcel.readString()), string, string2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData[i];
        }
    }

    public EsimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData(EsimCheckoutPortingSteps esimCheckoutPortingSteps, EsimGiftRecipient esimGiftRecipient, EsimPhoneNumberPortingOtp otp, hgj.c navigationIcon, String subscriptionId, String phoneNumber, String portingId) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(otp, "otp");
        Intrinsics.checkNotNullParameter(portingId, "portingId");
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        this.f101287a = subscriptionId;
        this.f101288b = phoneNumber;
        this.f101289c = otp;
        this.d = esimCheckoutPortingSteps;
        this.e = portingId;
        this.f = esimGiftRecipient;
        this.f101290g = navigationIcon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData)) {
            return false;
        }
        EsimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData esimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData = (EsimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData) obj2;
        return Intrinsics.f(this.f101287a, esimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData.f101287a) && Intrinsics.f(this.f101288b, esimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData.f101288b) && Intrinsics.f(this.f101289c, esimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData.f101289c) && Intrinsics.f(this.d, esimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData.d) && Intrinsics.f(this.e, esimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData.e) && Intrinsics.f(this.f, esimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData.f) && this.f101290g == esimMobilePlanOtpNumberTransferConfirmationScreenContract$InputData.f101290g;
    }

    public final int hashCode() {
        int iHashCode = (this.f101289c.hashCode() + p.a.c(this.f101287a.hashCode() * 31, 31, this.f101288b)) * 31;
        EsimCheckoutPortingSteps esimCheckoutPortingSteps = this.d;
        int iC = p.a.c((iHashCode + (esimCheckoutPortingSteps == null ? 0 : esimCheckoutPortingSteps.hashCode())) * 31, 31, this.e);
        EsimGiftRecipient esimGiftRecipient = this.f;
        return this.f101290g.hashCode() + ((iC + (esimGiftRecipient != null ? esimGiftRecipient.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f101287a);
        dest.writeString(this.f101288b);
        dest.writeParcelable(this.f101289c, i);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e);
        dest.writeParcelable(this.f, i);
        dest.writeString(this.f101290g.name());
    }
}
