package com.revolut.feature.crypto.withdraw.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/api/models/CryptoAddressHostingPreCheckInput;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoAddressHostingPreCheckInput implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CryptoAddressHostingPreCheckInput> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f71082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wk5.a f71083c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoAddressHostingPreCheckInput(parcel.readString(), (d) parcel.readSerializable(), wk5.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoAddressHostingPreCheckInput[i];
        }
    }

    public CryptoAddressHostingPreCheckInput(String cryptoBeneficiaryId, d inputAmount, wk5.a blockchain) {
        Intrinsics.checkNotNullParameter(cryptoBeneficiaryId, "cryptoBeneficiaryId");
        Intrinsics.checkNotNullParameter(inputAmount, "inputAmount");
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        this.f71081a = cryptoBeneficiaryId;
        this.f71082b = inputAmount;
        this.f71083c = blockchain;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoAddressHostingPreCheckInput)) {
            return false;
        }
        CryptoAddressHostingPreCheckInput cryptoAddressHostingPreCheckInput = (CryptoAddressHostingPreCheckInput) obj2;
        return Intrinsics.f(this.f71081a, cryptoAddressHostingPreCheckInput.f71081a) && Intrinsics.f(this.f71082b, cryptoAddressHostingPreCheckInput.f71082b) && this.f71083c == cryptoAddressHostingPreCheckInput.f71083c;
    }

    public final int hashCode() {
        return this.f71083c.hashCode() + v7.c(this.f71081a.hashCode() * 31, 31, this.f71082b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71081a);
        dest.writeSerializable(this.f71082b);
        dest.writeString(this.f71083c.name());
    }
}
