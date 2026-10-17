package com.revolut.retail.feature.crypto_deposits.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.StackDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/api/navigation/CryptoDepositDestination;", "Lcom/revolut/kompot/common/StackDestination;", "", "toString", "()Ljava/lang/String;", "hbj/b", "feature_crypto_deposits_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoDepositDestination implements StackDestination {

    @NotNull
    public static final Parcelable.Creator<CryptoDepositDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoDepositInput f100040a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoDepositDestination((CryptoDepositInput) parcel.readParcelable(CryptoDepositDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoDepositDestination[i];
        }
    }

    public CryptoDepositDestination(CryptoDepositInput input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f100040a = input;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CryptoDepositDestination) && Intrinsics.f(this.f100040a, ((CryptoDepositDestination) obj2).f100040a);
    }

    public final int hashCode() {
        return this.f100040a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f100040a, i);
    }
}
