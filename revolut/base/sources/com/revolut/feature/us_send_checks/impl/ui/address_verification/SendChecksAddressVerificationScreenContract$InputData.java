package com.revolut.feature.us_send_checks.impl.ui.address_verification;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.us_send_checks.api.model.beneficiary.SendChecksBeneficiaryParams;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/us_send_checks/impl/ui/address_verification/SendChecksAddressVerificationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_us_send_checks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SendChecksAddressVerificationScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SendChecksAddressVerificationScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SendChecksBeneficiaryParams f94592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final co3.a f94593b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SendChecksAddressVerificationScreenContract$InputData((SendChecksBeneficiaryParams) parcel.readParcelable(SendChecksAddressVerificationScreenContract$InputData.class.getClassLoader()), (co3.a) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SendChecksAddressVerificationScreenContract$InputData[i];
        }
    }

    public SendChecksAddressVerificationScreenContract$InputData(SendChecksBeneficiaryParams beneficiaryParams, co3.a aVar) {
        Intrinsics.checkNotNullParameter(beneficiaryParams, "beneficiaryParams");
        this.f94592a = beneficiaryParams;
        this.f94593b = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SendChecksAddressVerificationScreenContract$InputData)) {
            return false;
        }
        SendChecksAddressVerificationScreenContract$InputData sendChecksAddressVerificationScreenContract$InputData = (SendChecksAddressVerificationScreenContract$InputData) obj2;
        return Intrinsics.f(this.f94592a, sendChecksAddressVerificationScreenContract$InputData.f94592a) && Intrinsics.f(this.f94593b, sendChecksAddressVerificationScreenContract$InputData.f94593b);
    }

    public final int hashCode() {
        int iHashCode = this.f94592a.hashCode() * 31;
        co3.a aVar = this.f94593b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f94592a, i);
        dest.writeSerializable(this.f94593b);
    }
}
