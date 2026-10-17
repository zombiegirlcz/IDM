package com.revolut.feature.crypto.qr.parser.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/crypto/qr/parser/api/model/CryptoQrCodeParseResult;", "Landroid/os/Parcelable;", "<init>", "()V", "Success", "NotDetected", "NotSupported", "Lcom/revolut/feature/crypto/qr/parser/api/model/CryptoQrCodeParseResult$NotDetected;", "Lcom/revolut/feature/crypto/qr/parser/api/model/CryptoQrCodeParseResult$NotSupported;", "Lcom/revolut/feature/crypto/qr/parser/api/model/CryptoQrCodeParseResult$Success;", "feature_crypto_qr_parser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CryptoQrCodeParseResult implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/qr/parser/api/model/CryptoQrCodeParseResult$NotDetected;", "Lcom/revolut/feature/crypto/qr/parser/api/model/CryptoQrCodeParseResult;", "<init>", "()V", "feature_crypto_qr_parser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NotDetected extends CryptoQrCodeParseResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotDetected f70895a = new NotDetected();

        @NotNull
        public static final Parcelable.Creator<NotDetected> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NotDetected.f70895a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotDetected[i];
            }
        }

        private NotDetected() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/qr/parser/api/model/CryptoQrCodeParseResult$NotSupported;", "Lcom/revolut/feature/crypto/qr/parser/api/model/CryptoQrCodeParseResult;", "<init>", "()V", "feature_crypto_qr_parser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NotSupported extends CryptoQrCodeParseResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotSupported f70896a = new NotSupported();

        @NotNull
        public static final Parcelable.Creator<NotSupported> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NotSupported.f70896a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotSupported[i];
            }
        }

        private NotSupported() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/qr/parser/api/model/CryptoQrCodeParseResult$Success;", "Lcom/revolut/feature/crypto/qr/parser/api/model/CryptoQrCodeParseResult;", "", "toString", "()Ljava/lang/String;", "feature_crypto_qr_parser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Success extends CryptoQrCodeParseResult {

        @NotNull
        public static final Parcelable.Creator<Success> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f70898b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Success(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Success[i];
            }
        }

        public Success(String address, String str) {
            Intrinsics.checkNotNullParameter(address, "address");
            this.f70897a = address;
            this.f70898b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Success)) {
                return false;
            }
            Success success = (Success) obj2;
            return Intrinsics.f(this.f70897a, success.f70897a) && Intrinsics.f(this.f70898b, success.f70898b);
        }

        public final int hashCode() {
            int iHashCode = this.f70897a.hashCode() * 31;
            String str = this.f70898b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70897a);
            dest.writeString(this.f70898b);
        }
    }

    private CryptoQrCodeParseResult() {
    }
}
