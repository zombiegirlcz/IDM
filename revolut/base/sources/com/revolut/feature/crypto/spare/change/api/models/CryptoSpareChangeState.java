package com.revolut.feature.crypto.spare.change.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/crypto/spare/change/api/models/CryptoSpareChangeState;", "Landroid/os/Parcelable;", "<init>", "()V", "CryptoSpareChangeActive", "CryptoSpareChangeNotActive", "Lcom/revolut/feature/crypto/spare/change/api/models/CryptoSpareChangeState$CryptoSpareChangeActive;", "Lcom/revolut/feature/crypto/spare/change/api/models/CryptoSpareChangeState$CryptoSpareChangeNotActive;", "feature_crypto_spare_change_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CryptoSpareChangeState implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/spare/change/api/models/CryptoSpareChangeState$CryptoSpareChangeActive;", "Lcom/revolut/feature/crypto/spare/change/api/models/CryptoSpareChangeState;", "", "toString", "()Ljava/lang/String;", "feature_crypto_spare_change_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CryptoSpareChangeActive extends CryptoSpareChangeState {

        @NotNull
        public static final Parcelable.Creator<CryptoSpareChangeActive> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f70993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f70994b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CryptoSpareChangeActive(parcel.readInt(), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoSpareChangeActive[i];
            }
        }

        public CryptoSpareChangeActive(int i, b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f70993a = currency;
            this.f70994b = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CryptoSpareChangeActive)) {
                return false;
            }
            CryptoSpareChangeActive cryptoSpareChangeActive = (CryptoSpareChangeActive) obj2;
            return Intrinsics.f(this.f70993a, cryptoSpareChangeActive.f70993a) && this.f70994b == cryptoSpareChangeActive.f70994b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f70994b) + (this.f70993a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f70993a);
            dest.writeInt(this.f70994b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/spare/change/api/models/CryptoSpareChangeState$CryptoSpareChangeNotActive;", "Lcom/revolut/feature/crypto/spare/change/api/models/CryptoSpareChangeState;", "<init>", "()V", "feature_crypto_spare_change_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CryptoSpareChangeNotActive extends CryptoSpareChangeState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CryptoSpareChangeNotActive f70995a = new CryptoSpareChangeNotActive();

        @NotNull
        public static final Parcelable.Creator<CryptoSpareChangeNotActive> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CryptoSpareChangeNotActive.f70995a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoSpareChangeNotActive[i];
            }
        }

        private CryptoSpareChangeNotActive() {
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

    private CryptoSpareChangeState() {
    }
}
