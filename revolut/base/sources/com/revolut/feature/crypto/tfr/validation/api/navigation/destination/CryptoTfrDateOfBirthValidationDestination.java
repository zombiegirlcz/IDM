package com.revolut.feature.crypto.tfr.validation.api.navigation.destination;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/tfr/validation/api/navigation/destination/CryptoTfrDateOfBirthValidationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_crypto_tfr_validation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoTfrDateOfBirthValidationDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<CryptoTfrDateOfBirthValidationDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f71025c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoTfrDateOfBirthValidationDestination(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoTfrDateOfBirthValidationDestination[i];
        }
    }

    public CryptoTfrDateOfBirthValidationDestination(String counterpartyId, Integer num, String counterpartyName) {
        Intrinsics.checkNotNullParameter(counterpartyId, "counterpartyId");
        Intrinsics.checkNotNullParameter(counterpartyName, "counterpartyName");
        this.f71023a = counterpartyId;
        this.f71024b = counterpartyName;
        this.f71025c = num;
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final Integer getF71025c() {
        return this.f71025c;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF71023a() {
        return this.f71023a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF71024b() {
        return this.f71024b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoTfrDateOfBirthValidationDestination)) {
            return false;
        }
        CryptoTfrDateOfBirthValidationDestination cryptoTfrDateOfBirthValidationDestination = (CryptoTfrDateOfBirthValidationDestination) obj2;
        return Intrinsics.f(this.f71023a, cryptoTfrDateOfBirthValidationDestination.f71023a) && Intrinsics.f(this.f71024b, cryptoTfrDateOfBirthValidationDestination.f71024b) && Intrinsics.f(this.f71025c, cryptoTfrDateOfBirthValidationDestination.f71025c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f71023a.hashCode() * 31, 31, this.f71024b);
        Integer num = this.f71025c;
        return iC + (num == null ? 0 : num.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71023a);
        dest.writeString(this.f71024b);
        Integer num = this.f71025c;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
    }
}
