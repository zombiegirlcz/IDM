package com.revolut.feature.crypto.withdraw.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lo5.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/crypto/withdraw/api/navigation/CryptoBeneficiaryDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoBeneficiaryDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CryptoBeneficiaryDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f71133b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoBeneficiaryDetailsScreenContract$InputData(parcel.readString(), g.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoBeneficiaryDetailsScreenContract$InputData[i];
        }
    }

    public CryptoBeneficiaryDetailsScreenContract$InputData(String cryptoAddressId, g entrypoint) {
        Intrinsics.checkNotNullParameter(cryptoAddressId, "cryptoAddressId");
        Intrinsics.checkNotNullParameter(entrypoint, "entrypoint");
        this.f71132a = cryptoAddressId;
        this.f71133b = entrypoint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoBeneficiaryDetailsScreenContract$InputData)) {
            return false;
        }
        CryptoBeneficiaryDetailsScreenContract$InputData cryptoBeneficiaryDetailsScreenContract$InputData = (CryptoBeneficiaryDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f71132a, cryptoBeneficiaryDetailsScreenContract$InputData.f71132a) && this.f71133b == cryptoBeneficiaryDetailsScreenContract$InputData.f71133b;
    }

    public final int hashCode() {
        return this.f71133b.hashCode() + (this.f71132a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71132a);
        dest.writeString(this.f71133b.name());
    }
}
