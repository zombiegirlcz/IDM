package com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressHostingInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/CryptoAddBeneficiaryFlowContract$CollectedDetails", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoAddBeneficiaryFlowContract$CollectedDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CryptoAddBeneficiaryFlowContract$CollectedDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CryptoAddressHostingInfo f71211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CryptoAddress f71212c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoAddBeneficiaryFlowContract$CollectedDetails(parcel.readString(), (CryptoAddressHostingInfo) parcel.readParcelable(CryptoAddBeneficiaryFlowContract$CollectedDetails.class.getClassLoader()), (CryptoAddress) parcel.readParcelable(CryptoAddBeneficiaryFlowContract$CollectedDetails.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoAddBeneficiaryFlowContract$CollectedDetails[i];
        }
    }

    public CryptoAddBeneficiaryFlowContract$CollectedDetails(String counterpartyId, CryptoAddressHostingInfo hostingInfo, CryptoAddress cryptoAddress, String str) {
        Intrinsics.checkNotNullParameter(counterpartyId, "counterpartyId");
        Intrinsics.checkNotNullParameter(hostingInfo, "hostingInfo");
        this.f71210a = counterpartyId;
        this.f71211b = hostingInfo;
        this.f71212c = cryptoAddress;
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoAddBeneficiaryFlowContract$CollectedDetails)) {
            return false;
        }
        CryptoAddBeneficiaryFlowContract$CollectedDetails cryptoAddBeneficiaryFlowContract$CollectedDetails = (CryptoAddBeneficiaryFlowContract$CollectedDetails) obj2;
        return Intrinsics.f(this.f71210a, cryptoAddBeneficiaryFlowContract$CollectedDetails.f71210a) && Intrinsics.f(this.f71211b, cryptoAddBeneficiaryFlowContract$CollectedDetails.f71211b) && Intrinsics.f(this.f71212c, cryptoAddBeneficiaryFlowContract$CollectedDetails.f71212c) && Intrinsics.f(this.d, cryptoAddBeneficiaryFlowContract$CollectedDetails.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f71211b.hashCode() + (this.f71210a.hashCode() * 31)) * 31;
        CryptoAddress cryptoAddress = this.f71212c;
        int iHashCode2 = (iHashCode + (cryptoAddress == null ? 0 : cryptoAddress.hashCode())) * 31;
        String str = this.d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71210a);
        dest.writeParcelable(this.f71211b, i);
        dest.writeParcelable(this.f71212c, i);
        dest.writeString(this.d);
    }
}
