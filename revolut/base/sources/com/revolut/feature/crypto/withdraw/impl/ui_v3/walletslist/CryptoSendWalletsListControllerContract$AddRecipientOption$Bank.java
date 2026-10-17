package com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/revolut/feature/crypto/withdraw/impl/ui_v3/walletslist/CryptoSendWalletsListControllerContract$AddRecipientOption$Bank", "", "<init>", "()V", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoSendWalletsListControllerContract$AddRecipientOption$Bank implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CryptoSendWalletsListControllerContract$AddRecipientOption$Bank f71332a = new CryptoSendWalletsListControllerContract$AddRecipientOption$Bank();

    @NotNull
    public static final Parcelable.Creator<CryptoSendWalletsListControllerContract$AddRecipientOption$Bank> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return CryptoSendWalletsListControllerContract$AddRecipientOption$Bank.f71332a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoSendWalletsListControllerContract$AddRecipientOption$Bank[i];
        }
    }

    private CryptoSendWalletsListControllerContract$AddRecipientOption$Bank() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
