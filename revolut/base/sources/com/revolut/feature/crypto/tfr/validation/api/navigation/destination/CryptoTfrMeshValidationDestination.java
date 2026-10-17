package com.revolut.feature.crypto.tfr.validation.api.navigation.destination;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/tfr/validation/api/navigation/destination/CryptoTfrMeshValidationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_crypto_tfr_validation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoTfrMeshValidationDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<CryptoTfrMeshValidationDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f71030b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoTfrMeshValidationDestination(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoTfrMeshValidationDestination[i];
        }
    }

    public CryptoTfrMeshValidationDestination(String counterpartyId, Integer num) {
        Intrinsics.checkNotNullParameter(counterpartyId, "counterpartyId");
        this.f71029a = counterpartyId;
        this.f71030b = num;
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final Integer getF71030b() {
        return this.f71030b;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF71029a() {
        return this.f71029a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoTfrMeshValidationDestination)) {
            return false;
        }
        CryptoTfrMeshValidationDestination cryptoTfrMeshValidationDestination = (CryptoTfrMeshValidationDestination) obj2;
        return Intrinsics.f(this.f71029a, cryptoTfrMeshValidationDestination.f71029a) && Intrinsics.f(this.f71030b, cryptoTfrMeshValidationDestination.f71030b);
    }

    public final int hashCode() {
        int iHashCode = this.f71029a.hashCode() * 31;
        Integer num = this.f71030b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71029a);
        Integer num = this.f71030b;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
    }
}
