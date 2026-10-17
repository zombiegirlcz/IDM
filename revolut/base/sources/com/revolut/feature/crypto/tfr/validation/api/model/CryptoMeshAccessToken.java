package com.revolut.feature.crypto.tfr.validation.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/tfr/validation/api/model/CryptoMeshAccessToken;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_tfr_validation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoMeshAccessToken implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CryptoMeshAccessToken> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71001b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoMeshAccessToken(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoMeshAccessToken[i];
        }
    }

    public CryptoMeshAccessToken(String brokerType, String tokenRef) {
        Intrinsics.checkNotNullParameter(brokerType, "brokerType");
        Intrinsics.checkNotNullParameter(tokenRef, "tokenRef");
        this.f71000a = brokerType;
        this.f71001b = tokenRef;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoMeshAccessToken)) {
            return false;
        }
        CryptoMeshAccessToken cryptoMeshAccessToken = (CryptoMeshAccessToken) obj2;
        return Intrinsics.f(this.f71000a, cryptoMeshAccessToken.f71000a) && Intrinsics.f(this.f71001b, cryptoMeshAccessToken.f71001b);
    }

    public final int hashCode() {
        return this.f71001b.hashCode() + (this.f71000a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71000a);
        dest.writeString(this.f71001b);
    }
}
