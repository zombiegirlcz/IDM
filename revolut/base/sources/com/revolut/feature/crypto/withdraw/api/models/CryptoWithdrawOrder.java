package com.revolut.feature.crypto.withdraw.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/api/models/CryptoWithdrawOrder;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoWithdrawOrder implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CryptoWithdrawOrder> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoWithdrawOrderTransaction f71096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CryptoWithdrawLimits f71097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f71098c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoWithdrawOrder(CryptoWithdrawOrderTransaction.CREATOR.createFromParcel(parcel), CryptoWithdrawLimits.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoWithdrawOrder[i];
        }
    }

    public CryptoWithdrawOrder(CryptoWithdrawOrderTransaction transaction, CryptoWithdrawLimits limits) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(limits, "limits");
        this.f71096a = transaction;
        this.f71097b = limits;
        this.f71098c = j.b(new k98.a(this, 28));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoWithdrawOrder)) {
            return false;
        }
        CryptoWithdrawOrder cryptoWithdrawOrder = (CryptoWithdrawOrder) obj2;
        return Intrinsics.f(this.f71096a, cryptoWithdrawOrder.f71096a) && Intrinsics.f(this.f71097b, cryptoWithdrawOrder.f71097b);
    }

    public final int hashCode() {
        return this.f71097b.hashCode() + (this.f71096a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f71096a.writeToParcel(dest, i);
        this.f71097b.writeToParcel(dest, i);
    }
}
