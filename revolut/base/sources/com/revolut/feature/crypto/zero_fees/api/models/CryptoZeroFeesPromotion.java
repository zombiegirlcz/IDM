package com.revolut.feature.crypto.zero_fees.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/crypto/zero_fees/api/models/CryptoZeroFeesPromotion;", "Landroid/os/Parcelable;", "NotAvailable", "Expired", "Available", "Active", "Lcom/revolut/feature/crypto/zero_fees/api/models/CryptoZeroFeesPromotion$Active;", "Lcom/revolut/feature/crypto/zero_fees/api/models/CryptoZeroFeesPromotion$Available;", "Lcom/revolut/feature/crypto/zero_fees/api/models/CryptoZeroFeesPromotion$Expired;", "Lcom/revolut/feature/crypto/zero_fees/api/models/CryptoZeroFeesPromotion$NotAvailable;", "feature_crypto_zero_fees_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoZeroFeesPromotion extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/zero_fees/api/models/CryptoZeroFeesPromotion$Active;", "Lcom/revolut/feature/crypto/zero_fees/api/models/CryptoZeroFeesPromotion;", "", "toString", "()Ljava/lang/String;", "feature_crypto_zero_fees_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Active implements CryptoZeroFeesPromotion {

        @NotNull
        public static final Parcelable.Creator<Active> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDateTime f71351a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Active((LocalDateTime) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Active[i];
            }
        }

        public Active(LocalDateTime endDate) {
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            this.f71351a = endDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Active) && Intrinsics.f(this.f71351a, ((Active) obj2).f71351a);
        }

        public final int hashCode() {
            return this.f71351a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f71351a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/zero_fees/api/models/CryptoZeroFeesPromotion$Available;", "Lcom/revolut/feature/crypto/zero_fees/api/models/CryptoZeroFeesPromotion;", "<init>", "()V", "feature_crypto_zero_fees_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Available implements CryptoZeroFeesPromotion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Available f71352a = new Available();

        @NotNull
        public static final Parcelable.Creator<Available> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Available.f71352a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Available[i];
            }
        }

        private Available() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/zero_fees/api/models/CryptoZeroFeesPromotion$Expired;", "Lcom/revolut/feature/crypto/zero_fees/api/models/CryptoZeroFeesPromotion;", "<init>", "()V", "feature_crypto_zero_fees_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Expired implements CryptoZeroFeesPromotion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Expired f71353a = new Expired();

        @NotNull
        public static final Parcelable.Creator<Expired> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Expired.f71353a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Expired[i];
            }
        }

        private Expired() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/zero_fees/api/models/CryptoZeroFeesPromotion$NotAvailable;", "Lcom/revolut/feature/crypto/zero_fees/api/models/CryptoZeroFeesPromotion;", "<init>", "()V", "feature_crypto_zero_fees_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NotAvailable implements CryptoZeroFeesPromotion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotAvailable f71354a = new NotAvailable();

        @NotNull
        public static final Parcelable.Creator<NotAvailable> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NotAvailable.f71354a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotAvailable[i];
            }
        }

        private NotAvailable() {
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
}
