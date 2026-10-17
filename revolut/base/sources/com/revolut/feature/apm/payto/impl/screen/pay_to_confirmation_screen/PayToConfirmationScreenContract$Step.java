package com.revolut.feature.apm.payto.impl.screen.pay_to_confirmation_screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetails;
import com.revolut.feature.apm.core.models.payments_authorisations.PaymentMethodDetailsAmendment;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/apm/payto/impl/screen/pay_to_confirmation_screen/PayToConfirmationScreenContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AdditionalInfo", "Lcom/revolut/feature/apm/payto/impl/screen/pay_to_confirmation_screen/PayToConfirmationScreenContract$Step$AdditionalInfo;", "feature_apm_payto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PayToConfirmationScreenContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/payto/impl/screen/pay_to_confirmation_screen/PayToConfirmationScreenContract$Step$AdditionalInfo;", "Lcom/revolut/feature/apm/payto/impl/screen/pay_to_confirmation_screen/PayToConfirmationScreenContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_payto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdditionalInfo implements PayToConfirmationScreenContract$Step {

        @NotNull
        public static final Parcelable.Creator<AdditionalInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PaymentMethodDetails.PayTo.AdditionalInfo f62749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PaymentMethodDetailsAmendment.PayToPaymentMethodDetailsAmendment.AmendmentAdditionalInfo f62750b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AdditionalInfo((PaymentMethodDetails.PayTo.AdditionalInfo) parcel.readParcelable(AdditionalInfo.class.getClassLoader()), (PaymentMethodDetailsAmendment.PayToPaymentMethodDetailsAmendment.AmendmentAdditionalInfo) parcel.readParcelable(AdditionalInfo.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdditionalInfo[i];
            }
        }

        public AdditionalInfo(PaymentMethodDetails.PayTo.AdditionalInfo additionalInfo, PaymentMethodDetailsAmendment.PayToPaymentMethodDetailsAmendment.AmendmentAdditionalInfo amendmentAdditionalInfo) {
            Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
            this.f62749a = additionalInfo;
            this.f62750b = amendmentAdditionalInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AdditionalInfo)) {
                return false;
            }
            AdditionalInfo additionalInfo = (AdditionalInfo) obj2;
            return Intrinsics.f(this.f62749a, additionalInfo.f62749a) && Intrinsics.f(this.f62750b, additionalInfo.f62750b);
        }

        public final int hashCode() {
            int iHashCode = this.f62749a.hashCode() * 31;
            PaymentMethodDetailsAmendment.PayToPaymentMethodDetailsAmendment.AmendmentAdditionalInfo amendmentAdditionalInfo = this.f62750b;
            return iHashCode + (amendmentAdditionalInfo == null ? 0 : amendmentAdditionalInfo.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f62749a, i);
            dest.writeParcelable(this.f62750b, i);
        }
    }
}
