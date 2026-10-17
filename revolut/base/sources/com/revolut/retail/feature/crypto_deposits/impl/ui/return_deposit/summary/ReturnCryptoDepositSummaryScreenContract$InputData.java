package com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.summary;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.a3;
import wp5.y;
import xi0.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/crypto_deposits/impl/ui/return_deposit/summary/ReturnCryptoDepositSummaryScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReturnCryptoDepositSummaryScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ReturnCryptoDepositSummaryScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f100126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f100127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CryptoAddress f100128c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReturnCryptoDepositSummaryScreenContract$InputData((b) parcel.readSerializable(), (a3) parcel.readSerializable(), (CryptoAddress) parcel.readParcelable(ReturnCryptoDepositSummaryScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReturnCryptoDepositSummaryScreenContract$InputData[i];
        }
    }

    public ReturnCryptoDepositSummaryScreenContract$InputData(b currency, a3 transaction, CryptoAddress selectedAddress) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(selectedAddress, "selectedAddress");
        this.f100126a = currency;
        this.f100127b = transaction;
        this.f100128c = selectedAddress;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ReturnCryptoDepositSummaryScreenContract$InputData)) {
            return false;
        }
        ReturnCryptoDepositSummaryScreenContract$InputData returnCryptoDepositSummaryScreenContract$InputData = (ReturnCryptoDepositSummaryScreenContract$InputData) obj2;
        return Intrinsics.f(this.f100126a, returnCryptoDepositSummaryScreenContract$InputData.f100126a) && Intrinsics.f(this.f100127b, returnCryptoDepositSummaryScreenContract$InputData.f100127b) && Intrinsics.f(this.f100128c, returnCryptoDepositSummaryScreenContract$InputData.f100128c);
    }

    public final int hashCode() {
        return this.f100128c.hashCode() + y.f(this.f100127b, this.f100126a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f100126a);
        dest.writeSerializable(this.f100127b);
        dest.writeParcelable(this.f100128c, i);
    }
}
