package com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.address_list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/crypto_deposits/impl/ui/return_deposit/address_list/ReturnCryptoDepositAddressListScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReturnCryptoDepositAddressListScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ReturnCryptoDepositAddressListScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f100124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wk5.a f100125b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReturnCryptoDepositAddressListScreenContract$InputData(parcel.readInt() == 0 ? null : wk5.a.valueOf(parcel.readString()), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReturnCryptoDepositAddressListScreenContract$InputData[i];
        }
    }

    public ReturnCryptoDepositAddressListScreenContract$InputData(wk5.a aVar, b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f100124a = currency;
        this.f100125b = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ReturnCryptoDepositAddressListScreenContract$InputData)) {
            return false;
        }
        ReturnCryptoDepositAddressListScreenContract$InputData returnCryptoDepositAddressListScreenContract$InputData = (ReturnCryptoDepositAddressListScreenContract$InputData) obj2;
        return Intrinsics.f(this.f100124a, returnCryptoDepositAddressListScreenContract$InputData.f100124a) && this.f100125b == returnCryptoDepositAddressListScreenContract$InputData.f100125b;
    }

    public final int hashCode() {
        int iHashCode = this.f100124a.hashCode() * 31;
        wk5.a aVar = this.f100125b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f100124a);
        wk5.a aVar = this.f100125b;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
    }
}
