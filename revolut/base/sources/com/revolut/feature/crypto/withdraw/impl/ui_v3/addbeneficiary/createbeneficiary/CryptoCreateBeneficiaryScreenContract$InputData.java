package com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary;

import android.os.Parcel;
import android.os.Parcelable;
import bq5.b0;
import bq5.l0;
import com.revolut.feature.crypto.remittance.models.CounterpartyRequiredFields;
import com.revolut.feature.crypto.remittance.models.CryptoAddressCounterparty;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/crypto/withdraw/impl/ui_v3/addbeneficiary/createbeneficiary/CryptoCreateBeneficiaryScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoCreateBeneficiaryScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CryptoCreateBeneficiaryScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f71222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f71223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f71224c;
    public final l0 d;
    public final wk5.a e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CryptoAddressCounterparty f71225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CounterpartyRequiredFields f71226h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoCreateBeneficiaryScreenContract$InputData(b0.valueOf(parcel.readString()), (b) parcel.readSerializable(), parcel.readString(), l0.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : wk5.a.valueOf(parcel.readString()), parcel.readString(), (CryptoAddressCounterparty) parcel.readParcelable(CryptoCreateBeneficiaryScreenContract$InputData.class.getClassLoader()), (CounterpartyRequiredFields) parcel.readParcelable(CryptoCreateBeneficiaryScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoCreateBeneficiaryScreenContract$InputData[i];
        }
    }

    public CryptoCreateBeneficiaryScreenContract$InputData() {
        this(null, null, null, null, null, null, null, null, 255);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoCreateBeneficiaryScreenContract$InputData)) {
            return false;
        }
        CryptoCreateBeneficiaryScreenContract$InputData cryptoCreateBeneficiaryScreenContract$InputData = (CryptoCreateBeneficiaryScreenContract$InputData) obj2;
        return this.f71222a == cryptoCreateBeneficiaryScreenContract$InputData.f71222a && Intrinsics.f(this.f71223b, cryptoCreateBeneficiaryScreenContract$InputData.f71223b) && Intrinsics.f(this.f71224c, cryptoCreateBeneficiaryScreenContract$InputData.f71224c) && this.d == cryptoCreateBeneficiaryScreenContract$InputData.d && this.e == cryptoCreateBeneficiaryScreenContract$InputData.e && Intrinsics.f(this.f, cryptoCreateBeneficiaryScreenContract$InputData.f) && Intrinsics.f(this.f71225g, cryptoCreateBeneficiaryScreenContract$InputData.f71225g) && Intrinsics.f(this.f71226h, cryptoCreateBeneficiaryScreenContract$InputData.f71226h);
    }

    public final int hashCode() {
        int iHashCode = this.f71222a.hashCode() * 31;
        b bVar = this.f71223b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.f71224c;
        int iHashCode3 = (this.d.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        wk5.a aVar = this.e;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CryptoAddressCounterparty cryptoAddressCounterparty = this.f71225g;
        int iHashCode6 = (iHashCode5 + (cryptoAddressCounterparty == null ? 0 : cryptoAddressCounterparty.hashCode())) * 31;
        CounterpartyRequiredFields counterpartyRequiredFields = this.f71226h;
        return iHashCode6 + (counterpartyRequiredFields != null ? counterpartyRequiredFields.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71222a.name());
        dest.writeSerializable(this.f71223b);
        dest.writeString(this.f71224c);
        dest.writeString(this.d.name());
        wk5.a aVar = this.e;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeString(this.f);
        dest.writeParcelable(this.f71225g, i);
        dest.writeParcelable(this.f71226h, i);
    }

    public CryptoCreateBeneficiaryScreenContract$InputData(b0 editMode, b bVar, String str, l0 tab2, wk5.a aVar, String str2, CryptoAddressCounterparty cryptoAddressCounterparty, CounterpartyRequiredFields counterpartyRequiredFields) {
        Intrinsics.checkNotNullParameter(editMode, "editMode");
        Intrinsics.checkNotNullParameter(tab2, "tab");
        this.f71222a = editMode;
        this.f71223b = bVar;
        this.f71224c = str;
        this.d = tab2;
        this.e = aVar;
        this.f = str2;
        this.f71225g = cryptoAddressCounterparty;
        this.f71226h = counterpartyRequiredFields;
    }

    public /* synthetic */ CryptoCreateBeneficiaryScreenContract$InputData(b0 b0Var, b bVar, String str, l0 l0Var, wk5.a aVar, String str2, CryptoAddressCounterparty cryptoAddressCounterparty, CounterpartyRequiredFields counterpartyRequiredFields, int i) {
        this((i & 1) != 0 ? b0.CREATION : b0Var, (i & 2) != 0 ? null : bVar, (i & 4) != 0 ? null : str, (i & 8) != 0 ? l0.MY_WALLET : l0Var, (i & 16) != 0 ? null : aVar, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : cryptoAddressCounterparty, (i & 128) != 0 ? null : counterpartyRequiredFields);
    }
}
