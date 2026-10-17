package com.revolut.feature.crypto.qr.parser.impl.ui.scanner;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/crypto/qr/parser/impl/ui/scanner/CryptoQrScannerControllerContract$ProcessingState", "Landroid/os/Parcelable;", "<init>", "()V", "Detecting", "Processing", "Finished", "Error", "Lcom/revolut/feature/crypto/qr/parser/impl/ui/scanner/CryptoQrScannerControllerContract$ProcessingState$Detecting;", "Lcom/revolut/feature/crypto/qr/parser/impl/ui/scanner/CryptoQrScannerControllerContract$ProcessingState$Error;", "Lcom/revolut/feature/crypto/qr/parser/impl/ui/scanner/CryptoQrScannerControllerContract$ProcessingState$Finished;", "Lcom/revolut/feature/crypto/qr/parser/impl/ui/scanner/CryptoQrScannerControllerContract$ProcessingState$Processing;", "feature_crypto_qr_parser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CryptoQrScannerControllerContract$ProcessingState implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/qr/parser/impl/ui/scanner/CryptoQrScannerControllerContract$ProcessingState$Detecting;", "Lcom/revolut/feature/crypto/qr/parser/impl/ui/scanner/CryptoQrScannerControllerContract$ProcessingState;", "<init>", "()V", "feature_crypto_qr_parser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Detecting extends CryptoQrScannerControllerContract$ProcessingState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Detecting f70899a = new Detecting();

        @NotNull
        public static final Parcelable.Creator<Detecting> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Detecting.f70899a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Detecting[i];
            }
        }

        private Detecting() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/qr/parser/impl/ui/scanner/CryptoQrScannerControllerContract$ProcessingState$Error;", "Lcom/revolut/feature/crypto/qr/parser/impl/ui/scanner/CryptoQrScannerControllerContract$ProcessingState;", "", "toString", "()Ljava/lang/String;", "feature_crypto_qr_parser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error extends CryptoQrScannerControllerContract$ProcessingState {

        @NotNull
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f70900a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Error((Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Error[i];
            }
        }

        public Error(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.f70900a = throwable;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Error) && Intrinsics.f(this.f70900a, ((Error) obj2).f70900a);
        }

        public final int hashCode() {
            return this.f70900a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f70900a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/qr/parser/impl/ui/scanner/CryptoQrScannerControllerContract$ProcessingState$Finished;", "Lcom/revolut/feature/crypto/qr/parser/impl/ui/scanner/CryptoQrScannerControllerContract$ProcessingState;", "<init>", "()V", "feature_crypto_qr_parser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Finished extends CryptoQrScannerControllerContract$ProcessingState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Finished f70901a = new Finished();

        @NotNull
        public static final Parcelable.Creator<Finished> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Finished.f70901a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Finished[i];
            }
        }

        private Finished() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/qr/parser/impl/ui/scanner/CryptoQrScannerControllerContract$ProcessingState$Processing;", "Lcom/revolut/feature/crypto/qr/parser/impl/ui/scanner/CryptoQrScannerControllerContract$ProcessingState;", "<init>", "()V", "feature_crypto_qr_parser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Processing extends CryptoQrScannerControllerContract$ProcessingState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Processing f70902a = new Processing();

        @NotNull
        public static final Parcelable.Creator<Processing> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Processing.f70902a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Processing[i];
            }
        }

        private Processing() {
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

    private CryptoQrScannerControllerContract$ProcessingState() {
    }
}
