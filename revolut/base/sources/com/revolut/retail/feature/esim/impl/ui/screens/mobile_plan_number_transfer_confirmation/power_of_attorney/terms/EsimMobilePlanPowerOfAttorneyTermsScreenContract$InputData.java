package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.terms;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingPowerOfAttorneyTerms;
import com.revolut.retail.feature.esim.impl.repositories.model.EsimPhoneNumberPortingPowerOfAttorneyRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/power_of_attorney/terms/EsimMobilePlanPowerOfAttorneyTermsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanPowerOfAttorneyTermsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanPowerOfAttorneyTermsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f101358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimPhoneNumberPortingPowerOfAttorneyRequest f101359c;
    public final EsimPhoneNumberPortingPowerOfAttorneyTerms d;
    public final EsimGiftRecipient e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimMobilePlanPowerOfAttorneyTermsScreenContract$InputData(parcel.readString(), parcel.readString(), EsimPhoneNumberPortingPowerOfAttorneyRequest.CREATOR.createFromParcel(parcel), (EsimPhoneNumberPortingPowerOfAttorneyTerms) parcel.readParcelable(EsimMobilePlanPowerOfAttorneyTermsScreenContract$InputData.class.getClassLoader()), (EsimGiftRecipient) parcel.readParcelable(EsimMobilePlanPowerOfAttorneyTermsScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanPowerOfAttorneyTermsScreenContract$InputData[i];
        }
    }

    public EsimMobilePlanPowerOfAttorneyTermsScreenContract$InputData(String subscriptionId, String phoneNumber, EsimPhoneNumberPortingPowerOfAttorneyRequest phoneNumberPortingPowerOfAttorneyRequest, EsimPhoneNumberPortingPowerOfAttorneyTerms powerOfAttorneyTerms, EsimGiftRecipient esimGiftRecipient) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(phoneNumberPortingPowerOfAttorneyRequest, "phoneNumberPortingPowerOfAttorneyRequest");
        Intrinsics.checkNotNullParameter(powerOfAttorneyTerms, "powerOfAttorneyTerms");
        this.f101357a = subscriptionId;
        this.f101358b = phoneNumber;
        this.f101359c = phoneNumberPortingPowerOfAttorneyRequest;
        this.d = powerOfAttorneyTerms;
        this.e = esimGiftRecipient;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimMobilePlanPowerOfAttorneyTermsScreenContract$InputData)) {
            return false;
        }
        EsimMobilePlanPowerOfAttorneyTermsScreenContract$InputData esimMobilePlanPowerOfAttorneyTermsScreenContract$InputData = (EsimMobilePlanPowerOfAttorneyTermsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f101357a, esimMobilePlanPowerOfAttorneyTermsScreenContract$InputData.f101357a) && Intrinsics.f(this.f101358b, esimMobilePlanPowerOfAttorneyTermsScreenContract$InputData.f101358b) && Intrinsics.f(this.f101359c, esimMobilePlanPowerOfAttorneyTermsScreenContract$InputData.f101359c) && Intrinsics.f(this.d, esimMobilePlanPowerOfAttorneyTermsScreenContract$InputData.d) && Intrinsics.f(this.e, esimMobilePlanPowerOfAttorneyTermsScreenContract$InputData.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f101359c.hashCode() + p.a.c(this.f101357a.hashCode() * 31, 31, this.f101358b)) * 31)) * 31;
        EsimGiftRecipient esimGiftRecipient = this.e;
        return iHashCode + (esimGiftRecipient == null ? 0 : esimGiftRecipient.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f101357a);
        dest.writeString(this.f101358b);
        this.f101359c.writeToParcel(dest, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
    }
}
