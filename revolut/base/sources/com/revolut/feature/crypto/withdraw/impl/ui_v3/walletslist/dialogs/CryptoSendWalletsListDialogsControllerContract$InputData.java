package com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.dialogs;

import android.os.Parcel;
import android.os.Parcelable;
import ar5.d;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/crypto/withdraw/impl/ui_v3/walletslist/dialogs/CryptoSendWalletsListDialogsControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoSendWalletsListDialogsControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CryptoSendWalletsListDialogsControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f71349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f71350b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoSendWalletsListDialogsControllerContract$InputData(d.valueOf(parcel.readString()), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoSendWalletsListDialogsControllerContract$InputData[i];
        }
    }

    public CryptoSendWalletsListDialogsControllerContract$InputData(d dialogType, b currency) {
        Intrinsics.checkNotNullParameter(dialogType, "dialogType");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f71349a = dialogType;
        this.f71350b = currency;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoSendWalletsListDialogsControllerContract$InputData)) {
            return false;
        }
        CryptoSendWalletsListDialogsControllerContract$InputData cryptoSendWalletsListDialogsControllerContract$InputData = (CryptoSendWalletsListDialogsControllerContract$InputData) obj2;
        return this.f71349a == cryptoSendWalletsListDialogsControllerContract$InputData.f71349a && Intrinsics.f(this.f71350b, cryptoSendWalletsListDialogsControllerContract$InputData.f71350b);
    }

    public final int hashCode() {
        return this.f71350b.hashCode() + (this.f71349a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71349a.name());
        dest.writeSerializable(this.f71350b);
    }
}
