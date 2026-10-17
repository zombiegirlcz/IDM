package com.revolut.feature.crypto.withdraw.impl.ui.addcryptobeneficiary.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.remittance.models.CryptoAddressRecipientDetails;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressHostingInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"com/revolut/feature/crypto/withdraw/impl/ui/addcryptobeneficiary/flow/CryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction", "Lmm/a;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "kp5/d", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction implements mm.a, Parcelable {

    @NotNull
    public static final Parcelable.Creator<CryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f71156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wk5.a f71157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f71158c;
    public final String d;
    public final String e;
    public final CryptoAddressRecipientDetails f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f71159g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f71160h;
    public final CryptoAddressHostingInfo i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction((b) parcel.readSerializable(), wk5.a.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), (CryptoAddressRecipientDetails) parcel.readParcelable(CryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction.class.getClassLoader()), parcel.readInt() != 0, (b) parcel.readSerializable(), (CryptoAddressHostingInfo) parcel.readParcelable(CryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction[i];
        }
    }

    public CryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction(b currency, wk5.a blockchain, String address, String str, String str2, CryptoAddressRecipientDetails cryptoAddressRecipientDetails, boolean z, b bVar, CryptoAddressHostingInfo cryptoAddressHostingInfo) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        Intrinsics.checkNotNullParameter(address, "address");
        this.f71156a = currency;
        this.f71157b = blockchain;
        this.f71158c = address;
        this.d = str;
        this.e = str2;
        this.f = cryptoAddressRecipientDetails;
        this.f71159g = z;
        this.f71160h = bVar;
        this.i = cryptoAddressHostingInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction)) {
            return false;
        }
        CryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction cryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction = (CryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction) obj2;
        return Intrinsics.f(this.f71156a, cryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction.f71156a) && this.f71157b == cryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction.f71157b && Intrinsics.f(this.f71158c, cryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction.f71158c) && Intrinsics.f(this.d, cryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction.d) && Intrinsics.f(this.e, cryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction.e) && Intrinsics.f(this.f, cryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction.f) && this.f71159g == cryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction.f71159g && Intrinsics.f(this.f71160h, cryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction.f71160h) && Intrinsics.f(this.i, cryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction.i);
    }

    public final int hashCode() {
        int iC = p.a.c((this.f71157b.hashCode() + (this.f71156a.hashCode() * 31)) * 31, 31, this.f71158c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        CryptoAddressRecipientDetails cryptoAddressRecipientDetails = this.f;
        int iC2 = j6.a.c((iHashCode2 + (cryptoAddressRecipientDetails == null ? 0 : cryptoAddressRecipientDetails.hashCode())) * 31, 31, this.f71159g);
        b bVar = this.f71160h;
        int iHashCode3 = (iC2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        CryptoAddressHostingInfo cryptoAddressHostingInfo = this.i;
        return iHashCode3 + (cryptoAddressHostingInfo != null ? cryptoAddressHostingInfo.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f71156a);
        dest.writeString(this.f71157b.name());
        dest.writeString(this.f71158c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeParcelable(this.f, i);
        dest.writeInt(this.f71159g ? 1 : 0);
        dest.writeSerializable(this.f71160h);
        dest.writeParcelable(this.i, i);
    }
}
