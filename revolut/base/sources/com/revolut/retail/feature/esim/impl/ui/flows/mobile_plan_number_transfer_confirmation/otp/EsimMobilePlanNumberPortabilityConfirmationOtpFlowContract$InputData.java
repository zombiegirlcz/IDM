package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.otp;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.esim.api.model.EsimCheckoutPortingSteps;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingOtp;
import hgj.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_transfer_confirmation/otp/EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f100772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimPhoneNumberPortingOtp f100773c;
    public final EsimCheckoutPortingSteps d;
    public final String e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final EsimGiftRecipient f100774g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            EsimPhoneNumberPortingOtp esimPhoneNumberPortingOtp = (EsimPhoneNumberPortingOtp) parcel.readParcelable(EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData.class.getClassLoader());
            EsimCheckoutPortingSteps esimCheckoutPortingSteps = (EsimCheckoutPortingSteps) parcel.readParcelable(EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData.class.getClassLoader());
            String string3 = parcel.readString();
            return new EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData(esimCheckoutPortingSteps, (EsimGiftRecipient) parcel.readParcelable(EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData.class.getClassLoader()), esimPhoneNumberPortingOtp, c.valueOf(parcel.readString()), string, string2, string3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData[i];
        }
    }

    public EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData(EsimCheckoutPortingSteps esimCheckoutPortingSteps, EsimGiftRecipient esimGiftRecipient, EsimPhoneNumberPortingOtp otp, c navigationIcon, String subscriptionId, String phoneNumber, String portingId) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(otp, "otp");
        Intrinsics.checkNotNullParameter(portingId, "portingId");
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        this.f100771a = subscriptionId;
        this.f100772b = phoneNumber;
        this.f100773c = otp;
        this.d = esimCheckoutPortingSteps;
        this.e = portingId;
        this.f = navigationIcon;
        this.f100774g = esimGiftRecipient;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData)) {
            return false;
        }
        EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData esimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData = (EsimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData) obj2;
        return Intrinsics.f(this.f100771a, esimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData.f100771a) && Intrinsics.f(this.f100772b, esimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData.f100772b) && Intrinsics.f(this.f100773c, esimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData.f100773c) && Intrinsics.f(this.d, esimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData.d) && Intrinsics.f(this.e, esimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData.e) && this.f == esimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData.f && Intrinsics.f(this.f100774g, esimMobilePlanNumberPortabilityConfirmationOtpFlowContract$InputData.f100774g);
    }

    public final int hashCode() {
        int iHashCode = (this.f100773c.hashCode() + p.a.c(this.f100771a.hashCode() * 31, 31, this.f100772b)) * 31;
        EsimCheckoutPortingSteps esimCheckoutPortingSteps = this.d;
        int iHashCode2 = (this.f.hashCode() + p.a.c((iHashCode + (esimCheckoutPortingSteps == null ? 0 : esimCheckoutPortingSteps.hashCode())) * 31, 31, this.e)) * 31;
        EsimGiftRecipient esimGiftRecipient = this.f100774g;
        return iHashCode2 + (esimGiftRecipient != null ? esimGiftRecipient.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100771a);
        dest.writeString(this.f100772b);
        dest.writeParcelable(this.f100773c, i);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e);
        dest.writeString(this.f.name());
        dest.writeParcelable(this.f100774g, i);
    }
}
