package com.revolut.feature.crypto.tfr.validation.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/crypto/tfr/validation/api/model/MeshEvent;", "Landroid/os/Parcelable;", "Companion", "WalletMessageSigned", "VerifyWalletRejected", "ConnectionDeclined", "TransferCompleted", "IntegrationConnected", "jm5/a", "a", "Lcom/revolut/feature/crypto/tfr/validation/api/model/MeshEvent$ConnectionDeclined;", "Lcom/revolut/feature/crypto/tfr/validation/api/model/MeshEvent$IntegrationConnected;", "Lcom/revolut/feature/crypto/tfr/validation/api/model/MeshEvent$TransferCompleted;", "Lcom/revolut/feature/crypto/tfr/validation/api/model/MeshEvent$VerifyWalletRejected;", "Lcom/revolut/feature/crypto/tfr/validation/api/model/MeshEvent$WalletMessageSigned;", "feature_crypto_tfr_validation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MeshEvent extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f71014a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/tfr/validation/api/model/MeshEvent$ConnectionDeclined;", "Lcom/revolut/feature/crypto/tfr/validation/api/model/MeshEvent;", "<init>", "()V", "feature_crypto_tfr_validation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ConnectionDeclined implements MeshEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ConnectionDeclined f71002a = new ConnectionDeclined();

        @NotNull
        public static final Parcelable.Creator<ConnectionDeclined> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ConnectionDeclined.f71002a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConnectionDeclined[i];
            }
        }

        private ConnectionDeclined() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/tfr/validation/api/model/MeshEvent$IntegrationConnected;", "Lcom/revolut/feature/crypto/tfr/validation/api/model/MeshEvent;", "", "toString", "()Ljava/lang/String;", "feature_crypto_tfr_validation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IntegrationConnected implements MeshEvent {

        @NotNull
        public static final Parcelable.Creator<IntegrationConnected> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f71004b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CryptoMeshAccessToken f71005c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IntegrationConnected(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CryptoMeshAccessToken.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IntegrationConnected[i];
            }
        }

        public IntegrationConnected(String brokerType, String brokerName, CryptoMeshAccessToken cryptoMeshAccessToken) {
            Intrinsics.checkNotNullParameter(brokerType, "brokerType");
            Intrinsics.checkNotNullParameter(brokerName, "brokerName");
            this.f71003a = brokerType;
            this.f71004b = brokerName;
            this.f71005c = cryptoMeshAccessToken;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof IntegrationConnected)) {
                return false;
            }
            IntegrationConnected integrationConnected = (IntegrationConnected) obj2;
            return Intrinsics.f(this.f71003a, integrationConnected.f71003a) && Intrinsics.f(this.f71004b, integrationConnected.f71004b) && Intrinsics.f(this.f71005c, integrationConnected.f71005c);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f71003a.hashCode() * 31, 31, this.f71004b);
            CryptoMeshAccessToken cryptoMeshAccessToken = this.f71005c;
            return iC + (cryptoMeshAccessToken == null ? 0 : cryptoMeshAccessToken.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71003a);
            dest.writeString(this.f71004b);
            CryptoMeshAccessToken cryptoMeshAccessToken = this.f71005c;
            if (cryptoMeshAccessToken == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                cryptoMeshAccessToken.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/crypto/tfr/validation/api/model/MeshEvent$TransferCompleted;", "Lcom/revolut/feature/crypto/tfr/validation/api/model/MeshEvent;", "Success", "Failed", "Lcom/revolut/feature/crypto/tfr/validation/api/model/MeshEvent$TransferCompleted$Failed;", "Lcom/revolut/feature/crypto/tfr/validation/api/model/MeshEvent$TransferCompleted$Success;", "feature_crypto_tfr_validation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface TransferCompleted extends MeshEvent {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/tfr/validation/api/model/MeshEvent$TransferCompleted$Failed;", "Lcom/revolut/feature/crypto/tfr/validation/api/model/MeshEvent$TransferCompleted;", "", "toString", "()Ljava/lang/String;", "feature_crypto_tfr_validation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Failed implements TransferCompleted {

            @NotNull
            public static final Parcelable.Creator<Failed> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f71006a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Failed(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Failed[i];
                }
            }

            public Failed(String errorMessage) {
                Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
                this.f71006a = errorMessage;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Failed) && Intrinsics.f(this.f71006a, ((Failed) obj2).f71006a);
            }

            public final int hashCode() {
                return this.f71006a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f71006a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/tfr/validation/api/model/MeshEvent$TransferCompleted$Success;", "Lcom/revolut/feature/crypto/tfr/validation/api/model/MeshEvent$TransferCompleted;", "", "toString", "()Ljava/lang/String;", "feature_crypto_tfr_validation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Success implements TransferCompleted {

            @NotNull
            public static final Parcelable.Creator<Success> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f71007a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final double f71008b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f71009c;
            public final String d;
            public final String e;
            public final String f;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Success(parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Success[i];
                }
            }

            public Success(String currencyCode, double d, String fromAddress, String toAddress, String transferId, String transactionHash) {
                Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
                Intrinsics.checkNotNullParameter(fromAddress, "fromAddress");
                Intrinsics.checkNotNullParameter(toAddress, "toAddress");
                Intrinsics.checkNotNullParameter(transferId, "transferId");
                Intrinsics.checkNotNullParameter(transactionHash, "transactionHash");
                this.f71007a = currencyCode;
                this.f71008b = d;
                this.f71009c = fromAddress;
                this.d = toAddress;
                this.e = transferId;
                this.f = transactionHash;
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
                return Intrinsics.f(this.f71007a, success.f71007a) && Double.compare(this.f71008b, success.f71008b) == 0 && Intrinsics.f(this.f71009c, success.f71009c) && Intrinsics.f(this.d, success.d) && Intrinsics.f(this.e, success.e) && Intrinsics.f(this.f, success.f);
            }

            public final int hashCode() {
                return this.f.hashCode() + p.a.c(p.a.c(p.a.c(b.c(this.f71007a.hashCode() * 31, this.f71008b, 31), 31, this.f71009c), 31, this.d), 31, this.e);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f71007a);
                dest.writeDouble(this.f71008b);
                dest.writeString(this.f71009c);
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeString(this.f);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/tfr/validation/api/model/MeshEvent$VerifyWalletRejected;", "Lcom/revolut/feature/crypto/tfr/validation/api/model/MeshEvent;", "<init>", "()V", "feature_crypto_tfr_validation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class VerifyWalletRejected implements MeshEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final VerifyWalletRejected f71010a = new VerifyWalletRejected();

        @NotNull
        public static final Parcelable.Creator<VerifyWalletRejected> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return VerifyWalletRejected.f71010a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VerifyWalletRejected[i];
            }
        }

        private VerifyWalletRejected() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/tfr/validation/api/model/MeshEvent$WalletMessageSigned;", "Lcom/revolut/feature/crypto/tfr/validation/api/model/MeshEvent;", "", "toString", "()Ljava/lang/String;", "feature_crypto_tfr_validation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WalletMessageSigned implements MeshEvent {

        @NotNull
        public static final Parcelable.Creator<WalletMessageSigned> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f71012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f71013c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WalletMessageSigned(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WalletMessageSigned[i];
            }
        }

        public WalletMessageSigned(String address, String message, String signedMessageHash, boolean z) {
            Intrinsics.checkNotNullParameter(address, "address");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(signedMessageHash, "signedMessageHash");
            this.f71011a = address;
            this.f71012b = z;
            this.f71013c = message;
            this.d = signedMessageHash;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WalletMessageSigned)) {
                return false;
            }
            WalletMessageSigned walletMessageSigned = (WalletMessageSigned) obj2;
            return Intrinsics.f(this.f71011a, walletMessageSigned.f71011a) && this.f71012b == walletMessageSigned.f71012b && Intrinsics.f(this.f71013c, walletMessageSigned.f71013c) && Intrinsics.f(this.d, walletMessageSigned.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + p.a.c(j6.a.c(this.f71011a.hashCode() * 31, 31, this.f71012b), 31, this.f71013c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71011a);
            dest.writeInt(this.f71012b ? 1 : 0);
            dest.writeString(this.f71013c);
            dest.writeString(this.d);
        }
    }

    /* JADX INFO: renamed from: com.revolut.feature.crypto.tfr.validation.api.model.MeshEvent$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f71014a = new Companion();

        private Companion() {
        }
    }
}
