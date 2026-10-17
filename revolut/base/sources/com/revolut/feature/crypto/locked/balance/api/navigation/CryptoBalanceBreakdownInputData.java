package com.revolut.feature.crypto.locked.balance.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.locked.balance.api.navigation.CryptoBalanceBreakdownDisplayMode;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/locked/balance/api/navigation/CryptoBalanceBreakdownInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_crypto_locked_balance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoBalanceBreakdownInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CryptoBalanceBreakdownInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f70873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CryptoBalanceBreakdownDisplayMode f70874c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoBalanceBreakdownInputData(parcel.readString(), parcel.readInt() != 0, (CryptoBalanceBreakdownDisplayMode) parcel.readParcelable(CryptoBalanceBreakdownInputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoBalanceBreakdownInputData[i];
        }
    }

    public CryptoBalanceBreakdownInputData(String assetId, boolean z, CryptoBalanceBreakdownDisplayMode displayMode) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(displayMode, "displayMode");
        this.f70872a = assetId;
        this.f70873b = z;
        this.f70874c = displayMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoBalanceBreakdownInputData)) {
            return false;
        }
        CryptoBalanceBreakdownInputData cryptoBalanceBreakdownInputData = (CryptoBalanceBreakdownInputData) obj2;
        return Intrinsics.f(this.f70872a, cryptoBalanceBreakdownInputData.f70872a) && this.f70873b == cryptoBalanceBreakdownInputData.f70873b && Intrinsics.f(this.f70874c, cryptoBalanceBreakdownInputData.f70874c);
    }

    public final int hashCode() {
        return this.f70874c.hashCode() + j6.a.c(this.f70872a.hashCode() * 31, 31, this.f70873b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70872a);
        dest.writeInt(this.f70873b ? 1 : 0);
        dest.writeParcelable(this.f70874c, i);
    }

    public /* synthetic */ CryptoBalanceBreakdownInputData(String str, boolean z) {
        this(str, z, CryptoBalanceBreakdownDisplayMode.Full.f70870a);
    }
}
